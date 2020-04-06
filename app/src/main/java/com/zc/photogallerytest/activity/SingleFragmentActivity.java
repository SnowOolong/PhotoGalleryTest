package com.zc.photogallerytest.activity;

import android.os.Bundle;

import com.example.photogallerytest.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/**
 * Created by zc on 2020/4/04.
 */

public abstract class SingleFragmentActivity extends AppCompatActivity {

    protected abstract Fragment createFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        //获得FragmentManger本身
        FragmentManager fm = getSupportFragmentManager();
        //获取Fragment,还是空的
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        //对空Fragment获得内容并提交
        if (fragment == null) {
            fragment = createFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }
}
