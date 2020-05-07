package br.com.brunomilitzer.product.dao;

import br.com.brunomilitzer.product.dto.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductDAOImpl implements ProductDAO {

    private final Map<Integer, Product> products = new HashMap<>();

    @Override
    public void create( Product product ) {
        this.products.put( product.getId(), product );
    }

    @Override
    public Product read( int id ) {
        return this.products.get( id );
    }

    @Override
    public void update( Product product ) {

    }

    @Override
    public void delete( int id ) {

    }
}
