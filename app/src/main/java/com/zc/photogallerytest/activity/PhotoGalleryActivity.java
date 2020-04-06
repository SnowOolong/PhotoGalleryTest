/**
 * PhotoGalleryActivity
 *
 * @author zcchenk
 * @date 2020/4/04
 */
package com.zc.photogallerytest.activity;

import com.zc.photogallerytest.fragment.PhotoGalleryFragment;

import androidx.fragment.app.Fragment;

public class PhotoGalleryActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }
}
