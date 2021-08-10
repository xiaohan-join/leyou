package com.leyou.item.service;

import com.leyou.item.pojo.Category;

import java.util.List;


public interface CategoryService {
    List<Category> queryCategoriesByPid(Long pid);
    /*添加
    *
    * */
    void saveCategory(Category category);

    public List<Category> queryByBrandId(Long bid);


    void deleteCategory(Long id);

    List<String> queryNamesByIds(List<Long> ids);
}
