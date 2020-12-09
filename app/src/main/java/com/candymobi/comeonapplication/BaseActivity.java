package com.candymobi.comeonapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Viewject annotation = this.getClass().getAnnotation(Viewject.class);
        if (annotation != null) {
            int mainLayoutId = annotation.mainlayoutId();
            if (mainLayoutId > 0) {
                setContentView(mainLayoutId);
                ButterKnife.bind(this);
            } else {
                throw new RuntimeException("mainlayoutid<0");
            }
        } else {
            throw new RuntimeException("annotation=null");

        }
    }
}
