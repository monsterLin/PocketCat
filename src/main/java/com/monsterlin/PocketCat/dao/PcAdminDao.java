package com.monsterlin.PocketCat.dao;

import com.monsterlin.PocketCat.domain.PcAdmin;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author : monsterLin
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @blog : https://monsterlin.com/
 * @desc : 管理员数据库操作
 * @date : 2017/12/14
 */
@Mapper
public interface PcAdminDao {

    @Insert("INSERT INTO pc_admin(username,password,salt,email,activated,created)" +
            "VALUES(#{username},#{password},#{salt},#{email},#{activated},#{created}) ")
     int insertAdmin(PcAdmin pcAdmin);

    @Select("SELECT * FROM pc_admin")
    List<PcAdmin> getAllAdmin();

    @Select("SELECT * FROM pc_admin where username = #{username}")
    PcAdmin findAdminByUserName(@Param("username") String username);

    @Select("SELECT * FROM pc_admin where username = #{username} and password = #{password}")
    PcAdmin selectAdmin(@Param("username") String username, @Param("password") String password);
}
