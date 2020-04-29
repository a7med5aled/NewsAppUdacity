package com.example.newsappudacity;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;
import java.lang.String;



public class DataLoader extends AsyncTaskLoader<List<Data>> {

    private String wUrl;

    public DataLoader(Context context, String url) {
        super(context);
        wUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Data> loadInBackground() {
        if (wUrl == null) {
            return null;
        }
        //
        List<Data> data = QueryUtils.fetchNewsData(wUrl);
        return data;
    }
}
