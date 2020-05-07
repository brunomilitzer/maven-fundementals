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

public class CreateProductServlet extends HttpServlet {

    private static final long serialVersionUID = 6127396236928155350L;

    @Override
    protected void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        final Integer id = Integer.valueOf(request.getParameter("id"));
        final String name = request.getParameter("name");
        final String description = request.getParameter("description");
        final Integer price = Integer.valueOf(request.getParameter("price"));

        final Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);

        final WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
        final ProductBO productBO = (ProductBO) context.getBean("productBO");

        productBO.create(product);

        final PrintWriter out = response.getWriter();
        out.print("Product Created!!!");
    }
}
