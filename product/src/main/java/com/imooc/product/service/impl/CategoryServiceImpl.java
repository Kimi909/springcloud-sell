package com.imooc.product.service.impl;

import com.imooc.product.repository.ProductCategoryRepository;
import com.imooc.product.service.CategoryService;

import java.util.List;

/**
 * Created by Administrator on 2018/10/11.
 */
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }
}
