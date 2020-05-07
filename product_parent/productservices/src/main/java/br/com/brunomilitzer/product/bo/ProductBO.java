package br.com.brunomilitzer.product.bo;

import br.com.brunomilitzer.product.dto.Product;

public interface ProductBO {

    void create( Product product );

    Product find( int id );
}
