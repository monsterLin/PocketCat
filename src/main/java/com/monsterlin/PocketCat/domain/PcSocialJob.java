package com.monsterlin.PocketCat.domain;


/**
 * @author : monsterLin
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @blog : https://monsterlin.com/
 * @desc : 校外兼职
 * @date : 2017/12/5
 */
public class PcSocialJob {

    /**
     * 主键
     */
    private int jid;

    /**
     * 职位标题
     */
    private String title;

    /**
     * 职位地点
     */
    private String place ;

    /**
     * 职位时间
     */
    private String time ;

    /**
     * 职位价格
     */
    private String price;

    /**
     * 职位来源
     */
    private String source ;

    /**
     * 职位详情地址
     */
    private String detailUrl ;

    /**
     * 是否进入小黑屋（0:进入 1: 不进入）
     */
    private int state;

    /**
     * 职位创建时间
     */
    private long created;


    public PcSocialJob() {
    }

    public PcSocialJob(String title, String place, String time, String price, String source, String detailUrl, int state, long created) {
        this.title = title;
        this.place = place;
        this.time = time;
        this.price = price;
        this.source = source;
        this.detailUrl = detailUrl;
        this.state = state;
        this.created = created;
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

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public int getstate() {
        return state;
    }

    public void setstate(int state) {
        this.state = state;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }
}
