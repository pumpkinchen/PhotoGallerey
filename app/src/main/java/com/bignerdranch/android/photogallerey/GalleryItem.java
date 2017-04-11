package com.bignerdranch.android.photogallerey;

/**
 * Created by Administrator on 2017/4/6.
 */

public class GalleryItem {
    private  String mCaption;
    private  String mId;
    private  String mUrl;

    @Override
    public String toString() {
        return mCaption;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }
}
