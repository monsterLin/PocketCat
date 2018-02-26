package com.monsterlin.PocketCat.service;

import com.monsterlin.PocketCat.domain.PcAdmin;

import java.util.List;

/**
 * @author : monsterLin
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @blog : https://monsterlin.com/
 * @desc : 管理员业务类
 * @date : 2017/12/14
 */
public interface PcAdminService {
    /**
     * 查询所有的数据
     *
     * @return
     */
    List<PcAdmin> getAllAdmin();


    /**
     * 插入数据
     *
     * @param pcAdmin
     * @return
     */
    int insertAdmin(PcAdmin pcAdmin);

    /**
     * 查询是否存在这个用户
     * @param username
     * @return
     */
    PcAdmin findAdminByUserName(String username);

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    PcAdmin selectAdmin(String username ,String password);

}
