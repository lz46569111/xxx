package service;

import domain.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAllProduct() throws Exception;
}
