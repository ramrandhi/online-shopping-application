package com.rammicroservices.productservice.service;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rammicroservices.productservice.models.Product;
import com.rammicroservices.productservice.repository.ProductRepository;


@Service
@Transactional
public class ProductServiceImplementations implements ProductService, Serializable {
	
	/**
	 * created by Ram Randhi
	 */
	private static final long serialVersionUID = -1234713212163785003L;

	private static Logger logger = LoggerFactory.getLogger(ProductServiceImplementations.class);
	
	@Autowired
	private ProductRepository productRepository;
	public ProductServiceImplementations(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	@Override
	public List<Product> getAllproducts() {
		logger.info("inside ProductServiceImplementations, getAllproducts method");
		List<Product> products =  productRepository.findAll();
		return products.stream().toList();
	}
	@Override
	public void saveProduct(Product product) {
		logger.info("inside ProductServiceImplementations, saveProduct method");
		productRepository.save(product);
		logger.info("product {} is saved", product.getId());
	}

}
