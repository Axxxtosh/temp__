package com.uriahsolution.sms.data.model;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Entity(tableName = "notification")
public class Item {


    public void setId(int id) {
        this.id = id;
    }

    @PrimaryKey
    private int id;

    public int getId() {
        return id;
    }



    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("file_links")
    @Expose
    private String fileLinks;
    @SerializedName("file_url")
    @Expose
    private String fileUrl;
    @SerializedName("date_added")
    @Expose
    private String dateAdded;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFileLinks() {
        return fileLinks;
    }

    public void setFileLinks(String fileLinks) {
        this.fileLinks = fileLinks;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

}