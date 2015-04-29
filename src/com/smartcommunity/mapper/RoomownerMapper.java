package com.smartcommunity.mapper;

import com.smartcommunity.pojo.Roomowner;
import com.smartcommunity.pojo.RoomownerExample;

import edu.hust.smartcommunity.paginator.domain.PageList;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RoomownerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomowner
     *
     * @mbggenerated Thu Jan 22 10:59:42 CST 2015
     */
    int countByExample(RoomownerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomowner
     *
     * @mbggenerated Thu Jan 22 10:59:42 CST 2015
     */
    int deleteByExample(RoomownerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomowner
     *
     * @mbggenerated Thu Jan 22 10:59:42 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomowner
     *
     * @mbggenerated Thu Jan 22 10:59:42 CST 2015
     */
    int insert(Roomowner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomowner
     *
     * @mbggenerated Thu Jan 22 10:59:42 CST 2015
     */
    int insertSelective(Roomowner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomowner
     *
     * @mbggenerated Thu Jan 22 10:59:42 CST 2015
     */
    List<Roomowner> selectByExample(RoomownerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomowner
     *
     * @mbggenerated Thu Jan 22 10:59:42 CST 2015
     */
    Roomowner selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomowner
     *
     * @mbggenerated Thu Jan 22 10:59:42 CST 2015
     */
    int updateByExampleSelective(@Param("record") Roomowner record, @Param("example") RoomownerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomowner
     *
     * @mbggenerated Thu Jan 22 10:59:42 CST 2015
     */
    int updateByExample(@Param("record") Roomowner record, @Param("example") RoomownerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomowner
     *
     * @mbggenerated Thu Jan 22 10:59:42 CST 2015
     */
    int updateByPrimaryKeySelective(Roomowner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomowner
     *
     * @mbggenerated Thu Jan 22 10:59:42 CST 2015
     */
    int updateByPrimaryKey(Roomowner record);
    /** add_y */

    List<Roomowner> selectRoomnumberByExample(RoomownerExample example);
    PageList<Roomowner> selectByExample(RoomownerExample example,edu.hust.smartcommunity.paginator.domain.PageBounds pageBounds);
}