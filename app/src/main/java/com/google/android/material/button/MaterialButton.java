package com.google.android.material.button;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class MaterialButton extends View {
    public MaterialButton(Context context) {
        this(context, null);
    }

    public MaterialButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MaterialButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
