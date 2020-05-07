package br.com.brunomilitzer.trainings.servlets;

import br.com.brunomilitzer.product.bo.ProductBO;
import br.com.brunomilitzer.product.dto.Product;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DisplayProductDetailsServlet extends HttpServlet {

    private static final long serialVersionUID = 6127396236928155350L;

    @Override
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        final WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
        final ProductBO productBO = (ProductBO) context.getBean("productBO");

        final Product product = productBO.find(Integer.parseInt(request.getParameter("id")));

        final PrintWriter out = response.getWriter();

        out.print("Product Details: ");
        out.print("Product ID: " + product.getId());
        out.print("Product Name: " + product.getName());
        out.print("Product Description: " + product.getDescription());
        out.print("Product Price: " + product.getPrice());
    }
}
