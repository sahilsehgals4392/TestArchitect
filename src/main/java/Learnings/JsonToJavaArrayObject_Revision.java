package Learnings;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import org.apache.commons.text.StringEscapeUtils;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JsonToJavaArrayObject_Revision {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = null;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Business", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from CustomerInfo where purchasedDate=CURDATE() and Location ='Asia';");
        List<CustomerDetails> customerDetailsList = new ArrayList<CustomerDetails>();
        Gson gson = new Gson();
        JSONObject jsonObject = new JSONObject();
        JsonArray jsonArray = new JsonArray();
        ObjectMapper objectMapper = new ObjectMapper();
        CustomerDetails customerDetails;
        while (resultSet.next()) {
            customerDetails = new CustomerDetails();
            customerDetails.setCourseName(resultSet.getString("CourseName"));
            customerDetails.setPurchasedDate(resultSet.getString("PurchasedDate"));
            customerDetails.setLocation(resultSet.getString("Location"));
            customerDetails.setAmount(resultSet.getInt("Amount"));
            customerDetailsList.add(customerDetails);
        }

        for (int i = 0; i < customerDetailsList.size(); i++) {
            objectMapper.writeValue(new File(System.getProperty("user.dir") + "//CustomerDetails" + i + ".json"), customerDetailsList.get(i));
            String jsonString = gson.toJson(customerDetailsList.get(i));
            jsonArray.add(jsonString);
        }
        jsonObject.put("data", jsonArray);
        System.out.println(jsonObject);

        String newString = StringEscapeUtils.unescapeJava(jsonObject.toJSONString());
        System.out.println(newString);
        newString = newString.replace("\"{", "{").replace("}\"", "}");
        System.out.println(newString);
        FileWriter fileWriter = new FileWriter(new File(System.getProperty("user.dir") + "//CustomerDetailsFinalVersion.json"));
        fileWriter.write(newString);
        fileWriter.close();
        connection.close();
    }
}
