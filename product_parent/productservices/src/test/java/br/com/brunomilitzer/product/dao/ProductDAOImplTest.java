package br.com.brunomilitzer.product.dao;

import br.com.brunomilitzer.product.dto.Product;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductDAOImplTest {

    @Test
    public void createShouldCreateAProduct() {

        Product product = new Product();
        product.setId( 1 );
        product.setName( "Galaxy S20" );
        product.setDescription( "Samsung Galaxy S20 5G" );
        product.setPrice( 1000 );

        ProductDAO dao = new ProductDAOImpl();
        dao.create( product );

        Product result = dao.read( 1 );

        assertNotNull( result );
        assertEquals( "Galaxy S20", result.getName() );
    }

}