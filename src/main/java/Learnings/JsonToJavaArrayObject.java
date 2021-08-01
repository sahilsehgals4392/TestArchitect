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

public class JsonToJavaArrayObject {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Business", "root", "root");
        CustomerDetails customerDetails = new CustomerDetails();
        List<CustomerDetails> customerObjectList = new ArrayList();
        ObjectMapper objectMapper = new ObjectMapper();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from CustomerInfo where purchasedDate=CURDATE() and Location ='Asia';");
        Gson gson = new Gson();
        JsonArray jsonArray = new JsonArray();
        JSONObject jsonObject = new JSONObject();
        while (rs.next()) {
            customerDetails = new CustomerDetails();
            customerDetails.setCourseName(rs.getString("CourseName"));
            customerDetails.setPurchasedDate(rs.getString("PurchasedDate"));
            customerDetails.setLocation(rs.getString("Location"));
            customerDetails.setAmount(rs.getInt("Amount"));
            customerObjectList.add(customerDetails);
        }
        for (int i = 0; i < customerObjectList.size(); i++) {
            objectMapper.writeValue(new File(System.getProperty("user.dir") + "//CustomerDetails" + i + ".json"), customerObjectList.get(i));
            String jsonString = gson.toJson(customerObjectList.get(i));
            jsonArray.add(jsonString);
        }


        jsonObject.put("data", jsonArray);
        System.out.println(jsonObject);
        String unescapeString = StringEscapeUtils.unescapeJava(jsonObject.toJSONString());
        System.out.println(unescapeString);
        String newString = unescapeString.replace("\"{", "{");
        String newString2 = newString.replace("}\"", "}");
        System.out.println("New String2 :"+newString2);

        FileWriter fileWriter = new FileWriter(new File(System.getProperty("user.dir") + "//CustomerDetailsFinalVersion.json"));
        fileWriter.write(newString2);
        fileWriter.close();
        conn.close();

    }
}
