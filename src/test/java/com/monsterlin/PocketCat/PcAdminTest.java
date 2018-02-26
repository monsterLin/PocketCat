package com.monsterlin.PocketCat;

import com.monsterlin.PocketCat.dao.PcAdminDao;
import com.monsterlin.PocketCat.domain.PcAdmin;
import com.monsterlin.PocketCat.service.PcAdminService;
import com.monsterlin.PocketCat.utils.MD5Util;
import com.monsterlin.PocketCat.utils.RandomUtil;
import com.monsterlin.PocketCat.utils.TimeUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author : monsterLin
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @blog : https://monsterlin.com/
 * @desc : 管理员单元测试
 * @date : 2017/12/14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PcAdminTest {

    @Autowired
    private PcAdminService pcAdminService;

    @Test
    public void testInsert() {
        String initPassword = "baby123";
        String salt = RandomUtil.createSalt();
        String password = MD5Util.encode(initPassword, salt);

        long timeStamp = TimeUtil.getNowTimeStamp();

        PcAdmin pcAdmin = new PcAdmin("test", password, salt, "monsterlin@monsterlin.com", timeStamp, timeStamp);

        int result = pcAdminService.insertAdmin(pcAdmin);

        System.out.println("-->>>::" + result);

    }


    @Test
    public void testSelect() {

        PcAdmin pcAdmin = pcAdminService.findAdminByUserName("monsterlin");

        System.out.println(pcAdmin.getEmail());
    }

    @Test
    public void testSelectAdmin() {
        PcAdmin pcAdmin = pcAdminService.selectAdmin("monsterlin", "dfd709dbeac7508e4e6f728e1c71a42a");
        System.out.println(pcAdmin.toString());
    }


    @Test
    public void testGetAllAdmin() {
        List<PcAdmin> pcAdminList = pcAdminService.getAllAdmin();
        System.out.println(pcAdminList.size() + "");

    }
}
