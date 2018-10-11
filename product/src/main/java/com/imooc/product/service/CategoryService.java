package com.imooc.product.service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/11.
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
