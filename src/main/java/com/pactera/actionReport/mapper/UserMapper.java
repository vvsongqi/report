package com.pactera.actionReport.mapper;

import com.pactera.actionReport.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 根据地市查询
     *
     * @param city
     * @return
     */
    @Select("SELECT * FROM user_action_result_daily WHERE city=#{city} order by DATA_DATE ")
    public List<User> getUser(String city);

}
