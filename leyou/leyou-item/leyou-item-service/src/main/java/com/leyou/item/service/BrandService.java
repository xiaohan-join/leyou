package com.leyou.item.service;

import com.leyou.common.pojo.PageResult;
import com.leyou.item.pojo.Brand;
import com.leyou.item.pojo.Category;

import java.util.List;

public interface BrandService {
    //全展示
    public PageResult<Brand> queryBrandsByPage(
            String key, Integer page, Integer rows, String sortBy, Boolean desc) ;


    void savaBrand(Brand brand, List<Long> cids);
    /**
     * 删除brand，并且维护中间表
     * @param id
     */
    void deleteBrand(Long id);
    /*
    * 修改
    * */
    void updateBrand(Brand brand, List<Long> cids);

    public List<Brand> queryBrandsByCid(Long cid);
}
