package com.netflix.mediaclient.acquisition.components.form2.checkBox;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.TypedArrayKt;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form2.BooleanViewModel;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class FormViewCheckBox extends LinearLayout {
    public static final int $stable = 8;
    private final AppCompatCheckBox checkBox;
    private final AppCompatTextView checkBoxText;
    private CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
    private BooleanViewModel viewModel;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormViewCheckBox(Context context) {
        this(context, null, 0, 0, 14, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormViewCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormViewCheckBox(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        C8632dsu.c((Object) context, "");
    }

    public final CompoundButton.OnCheckedChangeListener getOnCheckedChangeListener() {
        return this.onCheckedChangeListener;
    }

    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    public /* synthetic */ FormViewCheckBox(Context context, AttributeSet attributeSet, int i, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormViewCheckBox(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int i3;
        int i4;
        C8632dsu.c((Object) context, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FormViewCheckBox);
        if (obtainStyledAttributes.hasValue(R.styleable.FormViewCheckBox_checkBoxStyle)) {
            C8632dsu.d(obtainStyledAttributes);
            i3 = TypedArrayKt.getResourceIdOrThrow(obtainStyledAttributes, R.styleable.FormViewCheckBox_checkBoxStyle);
        } else {
            i3 = 0;
        }
        if (obtainStyledAttributes.hasValue(R.styleable.FormViewCheckBox_textViewStyle)) {
            C8632dsu.d(obtainStyledAttributes);
            i4 = TypedArrayKt.getResourceIdOrThrow(obtainStyledAttributes, R.styleable.FormViewCheckBox_textViewStyle);
        } else {
            i4 = 0;
        }
        String string = obtainStyledAttributes.hasValue(R.styleable.FormViewCheckBox_android_text) ? obtainStyledAttributes.getString(R.styleable.FormViewCheckBox_android_text) : null;
        obtainStyledAttributes.recycle();
        setOrientation(0);
        setGravity(NetflixImageView.DEFAULT_LAYER_GRAVITY);
        AppCompatCheckBox appCompatCheckBox = new AppCompatCheckBox(new ContextThemeWrapper(context, i3));
        addView(appCompatCheckBox, -2, -2);
        this.checkBox = appCompatCheckBox;
        AppCompatTextView appCompatTextView = new AppCompatTextView(new ContextThemeWrapper(context, i4));
        appCompatTextView.setText(string);
        appCompatTextView.setPadding(0, 0, 0, 0);
        addView(appCompatTextView, -1, -2);
        this.checkBoxText = appCompatTextView;
        appCompatCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.netflix.mediaclient.acquisition.components.form2.checkBox.FormViewCheckBox$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                FormViewCheckBox._init_$lambda$3(FormViewCheckBox.this, compoundButton, z);
            }
        });
    }

    public final boolean isChecked() {
        return this.checkBox.isChecked();
    }

    public final void setChecked(boolean z) {
        BooleanViewModel booleanViewModel = this.viewModel;
        if (booleanViewModel != null) {
            booleanViewModel.setValue(z);
        }
        if (this.checkBox.isChecked() != z) {
            this.checkBox.setChecked(z);
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.onCheckedChangeListener;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(this.checkBox, z);
        }
    }

    public final CharSequence getText() {
        CharSequence text = this.checkBoxText.getText();
        C8632dsu.a(text, "");
        return text;
    }

    public final void setText(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
        this.checkBoxText.setText(charSequence);
    }

    public final MovementMethod getMovementMethod() {
        MovementMethod movementMethod = this.checkBoxText.getMovementMethod();
        C8632dsu.a(movementMethod, "");
        return movementMethod;
    }

    public final void setMovementMethod(MovementMethod movementMethod) {
        C8632dsu.c((Object) movementMethod, "");
        this.checkBoxText.setMovementMethod(movementMethod);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(FormViewCheckBox formViewCheckBox, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) formViewCheckBox, "");
        formViewCheckBox.setChecked(z);
    }

    public final void bind(BooleanViewModel booleanViewModel) {
        C8632dsu.c((Object) booleanViewModel, "");
        this.viewModel = booleanViewModel;
        if (isChecked() != booleanViewModel.getValue()) {
            setChecked(booleanViewModel.getValue());
        }
    }
}
