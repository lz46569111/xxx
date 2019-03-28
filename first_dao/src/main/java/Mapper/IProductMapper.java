package Mapper;

import domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductMapper {

    List<Product> findAllProduct() throws Exception;

}
