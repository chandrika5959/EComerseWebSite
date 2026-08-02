package com.ecommerce;

import java.io.*;
import java.util.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ProductServlet extends HttpServlet {

	    protected void doGet(
	            HttpServletRequest request,
	            HttpServletResponse response)

	            throws IOException {

	        ProductDAO dao =
	                new ProductDAO();

	        List<Product> products =
	                dao.getProducts();

	        response.setContentType(
	                "text/html");

	        PrintWriter out =
	                response.getWriter();

	        out.println("<h1>Products</h1>");

	        for(Product p : products) {

	            out.println(

	            "<h3>"
	            + p.getName()
	            + "</h3>");

	            out.println(

	            "<p>"
	            + p.getPrice()
	            + "</p>");
	        }
	    }

}
