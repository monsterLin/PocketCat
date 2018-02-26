package com.monsterlin.PocketCat.domain;

/**
 * @author : monsterLin
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @blog : https://monsterlin.com/
 * @desc : 管理员实体类
 * @date : 2017/12/14
 */
public class PcAdmin {
    /**
     * id
     */
    private int aid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐值
     */
    private String salt;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 登陆时间
     */
    private long activated;

    /**
     * 创建时间
     */
    private long created;

    public PcAdmin() {
    }

    /**
     * 构造方法
     *
     * @param username
     * @param password
     * @param salt
     * @param email
     * @param activated
     * @param created
     */
    public PcAdmin(String username, String password, String salt, String email, long activated, long created) {
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.email = email;
        this.activated = activated;
        this.created = created;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getActivated() {
        return activated;
    }

    public void setActivated(long activated) {
        this.activated = activated;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }
}
