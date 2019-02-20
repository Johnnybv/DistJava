package edu.wctc.simple;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

@WebServlet(name = "SimpleServlet")
public class SimpleServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = "Item Catalog";
        String docType =
                "<!DOCTYPE html>\n";

        out.println(docType +
                        "<html>\n" +
                        "<head><title>" + title + "</title></head>\n" +
                        "<body>\n"
        );

        List<Products> paramNames = Inventory.getProducts();

        for (int i = 0; i < paramNames.size(); i++){
            String name = paramNames.get(i).getpName();
            String disc = paramNames.get(i).getDisc();
            double price = paramNames.get(i).getPrice();

            out.println("<ul>");
            out.println("<li><h2>Name " + name+"</h2></li>");
            out.println("<li><h4>Description : " + disc +"</h4></li>");
            out.println("<li><h4>Price : " + price + "</h4></li></ul>");
        }
        out.println("</body></html>");
    }

    // Method to handle POST method request.
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doGet(request, response);
    }


}