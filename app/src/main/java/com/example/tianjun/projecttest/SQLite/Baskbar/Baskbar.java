package com.example.tianjun.projecttest.SQLite.Baskbar;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.
/**
 * Entity mapped to table "BASKBAR".
 */
@Entity(schema = "baskbar")
public class Baskbar {

    @Id(autoincrement = true)
    private Long id;
    private String share_id;
    private String images;
    private String content;
    private String nick_name;

    @Generated
    public Baskbar() {
    }

    public Baskbar(Long id) {
        this.id = id;
    }

    @Generated
    public Baskbar(Long id, String share_id, String images, String content, String nick_name) {
        this.id = id;
        this.share_id = share_id;
        this.images = images;
        this.content = content;
        this.nick_name = nick_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShare_id() {
        return share_id;
    }

    public void setShare_id(String share_id) {
        this.share_id = share_id;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

}