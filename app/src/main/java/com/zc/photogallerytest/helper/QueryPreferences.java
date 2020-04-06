/*
 * @ClassName QueryPreferences
 * @Description 搜索关键字读取和存储
 * @Author zc
 * @Date 2020/4/6 13:17
 * @Version 1.0
 */

package com.zc.photogallerytest.helper;

import android.content.Context;
import android.preference.PreferenceManager;

public class QueryPreferences {
    private static final String PRED_SEARCH_QUERY = "searchQuery";

    public static String getStoredQuery(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(PRED_SEARCH_QUERY, null);
    }

    public static void setStoredQuery(Context context, String query){
        PreferenceManager.getDefaultSharedPreferences(context)
                         .edit()
                         .putString(PRED_SEARCH_QUERY, query)
                         .apply();
    }
}
