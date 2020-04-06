/*
 * @ClassName GalleryItem
 * @Description TODO
 * @Author zc
 * @Date 2020/4/6 13:17
 * @Version 1.0
 */

package com.zc.photogallerytest.model;

import androidx.annotation.NonNull;

public class GalleryItem {
    private String caption;
    private String id;
    private String url;


    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @NonNull
    @Override
    public String toString() {
        return caption;
    }
}
