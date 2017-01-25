package hello.sampleapp;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by waps12b on 2017. 1. 21..
 */

public class ColoredButton extends Button {

    private boolean isRed = true;

    public ColoredButton(Context context) {
        super(context);
    }

    public ColoredButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ColoredButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setIsRed(boolean isRed) {
        this.isRed = isRed;
        changeBgColor();
    }

    private void changeBgColor() {
        isRed = !isRed; //flip

        if(isRed)
        {
            this.setBackgroundColor(Color.rgb(255,0,0));
            this.setText("Red");
        }else
        {
            setBackgroundColor(Color.rgb(0,255,0));
            setText("Green");
        }
    }

}