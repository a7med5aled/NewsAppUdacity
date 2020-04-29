package com.example.newsappudacity;

public class Data {

    private String title;
    private String mInformation;
    private String date;
    private String mUrl;
    private String mِAuthorName;


    public Data(String title, String information, String authorName, String time, String url) {
        this.title = title;
        this.mInformation = information;
        this.date = time;
        this.mUrl = url;
        this.mِAuthorName = authorName;
    }


    public String getTitle() {
        return title;
    }


    public String getmInformation() {
        return mInformation;
    }


    public String getDate() {
        return date;
    }


    public String getmUrl() {
        return mUrl;
    }


    public String getAuthorName() {
        return mِAuthorName;
    }

}
