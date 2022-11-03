package com.tochycomputerservices.jobportal.RichEditor.styles.windows;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;

import com.tochycomputerservices.jobportal.R;
import com.tochycomputerservices.jobportal.RichEditor.Util;
import com.tochycomputerservices.jobportal.RichEditor.colorpicker.ColorPickerListener;
import com.tochycomputerservices.jobportal.RichEditor.colorpicker.ColorPickerView;

public class ColorPickerWindow extends PopupWindow {

    private Context mContext;

    private ColorPickerView colorPickerView;

    private ColorPickerListener mColorPickerListener;

    public ColorPickerWindow(Context context, ColorPickerListener colorPickerListener) {
        mContext = context;
        mColorPickerListener = colorPickerListener;
        this.colorPickerView = inflateContentView();
        this.setContentView(this.colorPickerView);
        int[] wh = Util.getScreenWidthAndHeight(context);
        this.setWidth(wh[0]);
        int h = Util.getPixelByDp(context, 50);
        this.setHeight(h);
        this.setBackgroundDrawable(new BitmapDrawable());
        this.setOutsideTouchable(true);
        this.setFocusable(true);
        this.setupListeners();
//        this.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_UNCHANGED
//                | WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
    }

    private ColorPickerView inflateContentView() {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        ColorPickerView colorPickerView = (ColorPickerView) layoutInflater.inflate(R.layout.are_color_picker, null);
        return colorPickerView;
    }

    private <T extends View> T findViewById(int id) {
        return colorPickerView.findViewById(id);
    }

    public void setColor(int color) {
        this.colorPickerView.setColor(color);
    }

    private void setupListeners() {
        this.colorPickerView.setColorPickerListener(mColorPickerListener);
    }
}
