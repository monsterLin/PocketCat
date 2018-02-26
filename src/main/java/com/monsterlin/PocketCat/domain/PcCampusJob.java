package com.monsterlin.PocketCat.domain;


/**
 * @author : monsterLin
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @blog : https://monsterlin.com/
 * @desc : 校内兼职
 * @date : 2018/1/1
 */
public class PcCampusJob {
    /**
     * 主键id
     */
    private int jid;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 价格
     */
    private String price;

    /**
     * 地点
     */
    private String place;

    /**
     * 作者
     */
    private String author;

    /**
     * 是否拉黑
     */
    private int state;

    /**
     * 开始时间
     */
    private long beginTime;

    /**
     * 结束时间
     */
    private long endTime;

    /**
     * 创建时间
     */
    private long createTime;

    /**
     * 更新时间
     */
    private long updateTime;

    public PcCampusJob() {
    }

    public PcCampusJob(String title, String content, String price, String place, String author, int state, long beginTime, long endTime, long createTime, long updateTime) {
        this.title = title;
        this.content = content;
        this.price = price;
        this.place = place;
        this.author = author;
        this.state = state;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public int getJid() {
        return jid;
    }

    public void setJid(int jid) {
        this.jid = jid;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getstate() {
        return state;
    }

    public void setstate(int state) {
        this.state = state;
    }

    public long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(long beginTime) {
        this.beginTime = beginTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
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
