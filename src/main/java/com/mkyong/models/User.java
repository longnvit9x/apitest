package com.mkyong.models;

public class User {
    Integer Id;
    String login;
    String node_id;
    String avatar_url;
    String type;
    Boolean site_admin;

    public User(Integer id, String login, String node_id, String avatar_url, String type, Boolean site_admin) {
        Id = id;
        this.login = login;
        this.node_id = node_id;
        this.avatar_url = avatar_url;
        this.type = type;
        this.site_admin = site_admin;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getSite_admin() {
        return site_admin;
    }

    public void setSite_admin(Boolean site_admin) {
        this.site_admin = site_admin;
    }
}
