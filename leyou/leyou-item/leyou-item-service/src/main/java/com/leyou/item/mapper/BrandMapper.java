package com.leyou.item.mapper;

import com.leyou.item.pojo.Brand;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface BrandMapper extends Mapper<Brand> {
    /*
    * 新增
    * 商品品牌
    * 新增商品分类和品牌中间表数据
    * cid商品分类id
    * bid品牌id*/
    @Insert("insert into tb_category_brand(category_id,brand_id) values(#{cid},#{bid})")
    public  int insertCategoryAndBrand(@Param("cid")Long cid,@Param("bid")Long bid);
    /**
     * 根据brand id删除中间表相关数据
     * @param bid
     */
    @Delete("DELETE FROM tb_category_brand WHERE brand_id = #{bid}")
    void deleteByBrandIdInCategoryBrand(@Param("bid") Long bid);
    /*
    * 根据分类查询品牌
    * */
    @Select("SELECT b.* from tb_brand b INNER JOIN tb_category_brand cb on b.id=cb.brand_id where cb.category_id=#{cid}")
    List<Brand> selectBrandByCid(Long cid);

}
