package service.impl;

import Mapper.IProductMapper;
import domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.IProductService;

import java.util.List;

@Service
public class IProductServiceImpl implements IProductService {

    @Autowired
    private IProductMapper iProductMapper;

    @Override
    public List<Product> findAllProduct() throws Exception {
        return iProductMapper.findAllProduct();
    }
}
