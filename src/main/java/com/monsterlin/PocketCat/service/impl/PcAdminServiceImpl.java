package com.monsterlin.PocketCat.service.impl;

import com.monsterlin.PocketCat.dao.PcAdminDao;
import com.monsterlin.PocketCat.domain.PcAdmin;
import com.monsterlin.PocketCat.service.PcAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : monsterLin
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @blog : https://monsterlin.com/
 * @desc : 管理员业务实现类
 * @date : 2017/12/14
 */
@Service
public class PcAdminServiceImpl implements PcAdminService {

    @Autowired
    private PcAdminDao pcAdminDao;

    @Override
    public List<PcAdmin> getAllAdmin() {
        return pcAdminDao.getAllAdmin();
    }

    @Override
    public int insertAdmin(PcAdmin pcAdmin) {
        return pcAdminDao.insertAdmin(pcAdmin);
    }

    @Override
    public PcAdmin findAdminByUserName(String username) {
        return pcAdminDao.findAdminByUserName(username);
    }


}
