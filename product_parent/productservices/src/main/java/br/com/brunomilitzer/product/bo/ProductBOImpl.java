package br.com.brunomilitzer.product.bo;

import br.com.brunomilitzer.product.dao.ProductDAO;
import br.com.brunomilitzer.product.dto.Product;

public class ProductBOImpl implements ProductBO {

    private ProductDAO dao;

    @Override
    public void create( Product product ) {
        this.dao.create( product );
    }

    @Override
    public Product find( int id ) {
        return this.dao.read( id );
    }

    public ProductDAO getDao( ) {
        return dao;
    }

    public void setDao( ProductDAO dao ) {
        this.dao = dao;
    }
}
