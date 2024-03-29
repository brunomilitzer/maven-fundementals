package br.com.brunomilitzer.product.dao;

import br.com.brunomilitzer.product.dto.Product;

public interface ProductDAO {

    void create( Product product );

    Product read( int id );

    void update( Product product );

    void delete( int id );
}
