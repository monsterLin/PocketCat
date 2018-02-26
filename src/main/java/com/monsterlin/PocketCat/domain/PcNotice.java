package com.monsterlin.PocketCat.domain;


/**
 * @author : monsterLin
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @blog : https://monsterlin.com/
 * @desc : 公告栏
 * @date : 2018/1/1
 */
public class PcNotice {
    /**
     * 主键
     */
    private int nid;
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;

    /**
     * 作者
     */
    private String author ;

    /**
     * 创建时间
     */
    private long createTime;
    /**
     * 更新时间
     */
    private long updateTime;

    public PcNotice() {
    }

    public PcNotice(String title, String content, String author, long createTime, long updateTime) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }
}
