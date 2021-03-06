package com.liaoyuan.dianping.dal;

import com.liaoyuan.dianping.model.CategoryModel;

import java.util.List;

public interface CategoryModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Tue Mar 17 21:37:36 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Tue Mar 17 21:37:36 CST 2020
     */
    int insert(CategoryModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Tue Mar 17 21:37:36 CST 2020
     */
    int insertSelective(CategoryModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Tue Mar 17 21:37:36 CST 2020
     */
    CategoryModel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Tue Mar 17 21:37:36 CST 2020
     */
    int updateByPrimaryKeySelective(CategoryModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Tue Mar 17 21:37:36 CST 2020
     */
    int updateByPrimaryKey(CategoryModel record);

    List<CategoryModel> selectAll();

    Integer countAllCategory();
}