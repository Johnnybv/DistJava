package edu.wctc.simple.Controller;

import edu.wctc.simple.Model.Inventory;
import edu.wctc.simple.Model.Products;
import edu.wctc.simple.Model.ProductsDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ProductController extends HttpServlet {
    private String RESULT_PAGE = "productList.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        ProductsDao inventory = new Inventory();
        List<Products> productList = inventory.getAllProducts();

        request.setAttribute("productList", productList);

        RequestDispatcher view =
                request.getRequestDispatcher(RESULT_PAGE);
        view.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Product Controller";
    }


    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


}