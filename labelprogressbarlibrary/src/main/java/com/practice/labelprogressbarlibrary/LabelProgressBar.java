package com.practice.labelprogressbarlibrary;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by usera on 2017/9/13.
 */

public class LabelProgressBar extends FrameLayout {
    ProgressBar labelPb;
    TextView labelTv;
    View labelLayout;
    float progress;

    public LabelProgressBar(@NonNull Context context) {
        super(context);
        init();
    }

    public LabelProgressBar(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public LabelProgressBar(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init() {
        progress = 0;
        LayoutInflater.from(getContext()).inflate(R.layout.label_progress_bar, this, true);
        labelPb = (ProgressBar) findViewById(R.id.com_practice_labelProgressBar_labelPb);
        labelTv = (TextView) findViewById(R.id.com_practice_labelProgressBar_labelTv);
        labelLayout = findViewById(R.id.com_practice_labelProgressBar_labelLayout);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        updateView();
    }

    /**
     * 设置进度
     *
     * @param progress 范围为0.00~100.00
     */
    public void setProgress(float progress) {
        this.progress = Math.max(0, Math.min(progress, 100));
        updateView();
    }

    public void updateView() {
        labelPb.setProgress((int) (labelPb.getMax() * progress / 100f));
        labelTv.setText((int) progress + "%");
        labelLayout.setTranslationX((int) (progress / 100f * labelPb.getMeasuredWidth()));
    }
}
