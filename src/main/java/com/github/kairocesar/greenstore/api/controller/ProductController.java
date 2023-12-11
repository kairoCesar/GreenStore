package com.github.kairocesar.greenstore.api.controller;

import com.github.kairocesar.greenstore.dto.ProductDTO;
import com.github.kairocesar.greenstore.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductDTO> getList() {
        return productService.getList();
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ProductDTO> searchById(@PathVariable Long productId) {
        if (productService.existsById(productId)) {
            ProductDTO product = productService.search(productId);
            return ResponseEntity.ok(product);
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductDTO add(@RequestBody ProductDTO productDTO) {
        productService.add(productDTO);
        return productDTO;
    }

}
