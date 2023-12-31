package com.flashscreen.incomingcall.torchlight.utils;

import android.app.Activity;
import android.content.Intent;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.TextView;

public class Utility {
    public static void setGradientShaderToTextView(TextView textView, int firstColor, int secondColor) {
        Paint paint = textView.getPaint();
        int[] colors = {firstColor, secondColor};
        float width = paint.measureText(textView.getText().toString());
        Shader textShader = new LinearGradient(0f, 1f, width, textView.getTextSize(), colors, null, Shader.TileMode.CLAMP);
        textView.getPaint().setShader(textShader);
    }


}
