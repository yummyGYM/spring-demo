package nju.dao;

import nju.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: Gu Yaming
 * @Description:
 * @Date:Create：in 2019/9/2 16:00
 * @Modified By：
 */
public interface IUserDao {
    @Select("select * from user")
    List<User> findALL();
}
