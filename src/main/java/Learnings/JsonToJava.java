package Learnings;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.sql.*;

public class JsonToJava {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Business", "root", "root");
        CustomerDetails customerDetails = new CustomerDetails();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from CustomerInfo where purchasedDate=CURDATE() and Location ='Asia';");
        while (rs.next()) {
            customerDetails.setCourseName(rs.getString("CourseName"));
            customerDetails.setPurchasedDate(rs.getString("PurchasedDate"));
            customerDetails.setLocation(rs.getString("Location"));
            customerDetails.setAmount(rs.getInt("Amount"));

            System.out.println("--------");

            System.out.println(customerDetails.getCourseName());
            System.out.println(customerDetails.getLocation());
            System.out.println(customerDetails.getPurchasedDate());
            System.out.println(customerDetails.getAmount());
            System.out.println();

        }
        System.out.println(System.getProperty("user.dir"));
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(System.getProperty("user.dir") + "//CustomerDetails.json"), customerDetails);
        conn.close();

    }
}
