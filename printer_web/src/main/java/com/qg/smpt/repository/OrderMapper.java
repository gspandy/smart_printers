package com.qg.smpt.repository;

import com.qg.smpt.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated Sat Apr 08 11:09:21 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated Sat Apr 08 11:09:21 CST 2017
     */
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated Sat Apr 08 11:09:21 CST 2017
     */
    int insertSelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated Sat Apr 08 11:09:21 CST 2017
     */
    Order selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated Sat Apr 08 11:09:21 CST 2017
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated Sat Apr 08 11:09:21 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated Sat Apr 08 11:09:21 CST 2017
     */
    int updateByPrimaryKey(Order record);
}