package com.netflix.mediaclient.acquisition.components.form2.edittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.res.TypedArrayKt;
import com.netflix.mediaclient.acquisition.R;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class IconFormViewEditText extends FormViewEditText {
    public static final int $stable = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconFormViewEditText(Context context) {
        this(context, null, 0, 0, 14, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconFormViewEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconFormViewEditText(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ IconFormViewEditText(Context context, AttributeSet attributeSet, int i, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconFormViewEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2, R.layout.icon_form_input_view_holder);
        C8632dsu.c((Object) context, "");
        applyAttrs(attributeSet);
    }

    private final ImageView getIcon() {
        View findViewById = findViewById(R.id.imageButton);
        C8632dsu.a(findViewById, "");
        return (ImageView) findViewById;
    }

    private final void applyAttrs(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.IconFormViewEditText);
        C8632dsu.a(obtainStyledAttributes, "");
        if (obtainStyledAttributes.hasValue(R.styleable.IconFormViewEditText_src)) {
            getIcon().setImageResource(TypedArrayKt.getResourceIdOrThrow(obtainStyledAttributes, R.styleable.IconFormViewEditText_src));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText
    public View getInputLayoutBackground() {
        View findViewById = findViewById(R.id.inputBackground);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void setOnIconClickListener(View.OnClickListener onClickListener) {
        ImageView icon = getIcon();
        icon.setOnClickListener(onClickListener);
        icon.setClickable(onClickListener != null);
    }
}
