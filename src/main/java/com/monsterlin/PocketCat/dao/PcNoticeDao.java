package com.monsterlin.PocketCat.dao;

import com.monsterlin.PocketCat.domain.PcNotice;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author : monsterLin
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @blog : https://monsterlin.com/
 * @desc : 公告栏
 * @date : 2018/1/1
 */
@Mapper
public interface PcNoticeDao {
    @Insert("INSERT INTO pc_notice(title,content,author,createTime,updateTime)" +
            "VALUES(#{title},#{content},#{author},#{createTime},#{updateTime})")
    int insertPcNotice(PcNotice pcNotice);

    @Delete("DELETE FROM pc_notice where nid = #{nid}")
    int deletePcNotice(@Param("nid") int nid);

    @Update("UPDATE pc_notice set title=#{title},content=#{content},createTime=#{createTime},updateTime=#{updateTime} WHERE nid = #{nid}")
    int updatePcNotice(PcNotice pcNotice);

    @Select("SELECT * FROM pc_notice LIMIT #{start},#{pageSize}")
    List<PcNotice> getPcNoticeByPage(@Param("start") int start, @Param("pageSize") int pageSize);


    @Select("SELECT * FROM pc_notice where nid = #{nid}")
    PcNotice getPcNoticeByNid(int nid);
}
