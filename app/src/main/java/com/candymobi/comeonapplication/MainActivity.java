package com.candymobi.comeonapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.OnClick;

@Viewject(mainlayoutId = R.layout.activity_main)
public class MainActivity extends BaseActivity {

    @BindView(R.id.fac_main_home)
    FloatingActionButton facMainHome;
    @BindView(R.id.rg_main_top)
    RadioGroup rgMainTop;
    @BindView(R.id.fl_main_bottom)
    FrameLayout flMainBottom;
    @BindView(R.id.rg_main_top_shanghai)
    RadioButton rgMainTopShanghai;
    @BindView(R.id.rg_main_top_hangzhou)
    RadioButton rgMainTopHangzhou;
    @BindView(R.id.rg_main_bottom_shenzhen)
    RadioButton rgMainBottomShenzhen;
    @BindView(R.id.rg_main_bottom_beijing)
    RadioButton rgMainBottomBeijing;
    @BindView(R.id.rg_main_bottom)
    RadioGroup rgMainBottom;
    private boolean ischangedToporBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @OnClick(R.id.fac_main_home)
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fac_main_home:
                ischangedToporBottom = !ischangedToporBottom;
                if (ischangedToporBottom) {
                    Changeanmimation(rgMainTop, rgMainBottom);
                }else {
                    Changeanmimation(rgMainBottom, rgMainTop);
                }
                break;
        }

    }

    private void Changeanmimation(RadioGroup gone, RadioGroup show) {
        gone.clearAnimation();
        Animation goneAnimation = AnimationUtils.loadAnimation(this, R.anim.main_tab_translate_hide);
        gone.setAnimation(goneAnimation);
        gone.setVisibility(View.GONE);


        show.clearAnimation();
        Animation showAnimation = AnimationUtils.loadAnimation(this, R.anim.main_tab_translate_show);
        show.startAnimation(showAnimation);
        show.setVisibility(View.VISIBLE);
    }

}
