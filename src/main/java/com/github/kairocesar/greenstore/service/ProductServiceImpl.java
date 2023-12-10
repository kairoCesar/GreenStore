package com.github.kairocesar.greenstore.service;

import com.github.kairocesar.greenstore.dto.ProductDTO;
import com.github.kairocesar.greenstore.entities.Product;
import com.github.kairocesar.greenstore.repository.ProductRepository;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDTO> getList() {
        List<ProductDTO> productsDTOs = new ArrayList<>();
        List<Product> products = productRepository.findAll();
        for (Product product : products) {
            productsDTOs.add(new ProductDTO(product.getName(), product.getPrice()));
        }
        return productsDTOs;
    }

    /**
     * Os métodos getOne() e getById() do JPARepository estão anotados com @Deprecated, ou seja, foram descontinuados,
     * então a única forma que encontrei de buscar um produto pelo Id no banco de dados, sem ter que utilizar o EntityManager,
     * foi utilizando esse método findById() do JPARepository, mas o problema é que ele retorna um Optional<> parametrizado,
     * ainda não sei exatamente qual a finalidade dessa classe e quais os riscos em utilizá-la, vou pesquisar mais sobre
     * isso.
     * */
    public ProductDTO search(Long id) {
       Optional<Product> product = productRepository.findById(id);
       return new ProductDTO(product.get().getName(), product.get().getPrice());
    }

    public Product add(Product product) {
        return productRepository.save(product);
    }

    public boolean existsById(Long id) {
        return productRepository.existsById(id);
    }
}
