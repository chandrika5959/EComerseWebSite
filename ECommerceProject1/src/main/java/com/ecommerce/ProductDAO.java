package com.ecommerce;

import java.sql.*;
import java.util.*;
public class ProductDAO {
	
	public List<Product> getProducts() {

        List<Product> list =
                new ArrayList<>();

        try {

            Connection con =
                    DBConnection.getConnection();

            String sql =
                    "select * from products";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ResultSet rs =
                    ps.executeQuery();

            while(rs.next()) {

                Product p =
                        new Product(

                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price"));

                list.add(p);
            }

        } catch(Exception e) {

            e.printStackTrace();
        }

        return list;
    }

}
