package com.netflix.mediaclient.acquisition.components.heading;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.TypedArrayKt;
import androidx.core.view.ViewGroupKt;
import androidx.core.widget.TextViewCompat;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.databinding.SignupHeadingLayoutBinding;
import com.netflix.mediaclient.acquisition.lib.util.kotlinx.TextViewKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C1204Sr;
import o.C8150deu;
import o.C8168dfL;
import o.C8566dqi;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import o.C9834xU;
import o.C9870yD;

/* loaded from: classes3.dex */
public final class SignupHeadingView extends LinearLayout {
    public static final String SUB_HEADING_TAG = "SubHeadingText";
    private final SignupHeadingLayoutBinding binding;
    private final C1204Sr headerTitle;
    private final C1204Sr headerTitle2;
    private final C1204Sr stepLabel;
    private final LinearLayout subHeadingContainer;
    private Integer subHeadingPixelWidth;
    private Integer subHeadingTextAppearance;
    private Integer subHeadingTextColor;
    private Float subHeadingTextSize;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SignupHeadingView(Context context) {
        this(context, null, 0, 0, 14, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SignupHeadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SignupHeadingView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        C8632dsu.c((Object) context, "");
    }

    public static /* synthetic */ void getHeaderTitle$annotations() {
    }

    public static /* synthetic */ void getHeaderTitle2$annotations() {
    }

    public static /* synthetic */ void getStepLabel$annotations() {
    }

    public static /* synthetic */ void getSubHeadingContainer$annotations() {
    }

    public static /* synthetic */ void getSubHeadingPixelWidth$annotations() {
    }

    public static /* synthetic */ void getSubHeadingTextAppearance$annotations() {
    }

    public static /* synthetic */ void getSubHeadingTextColor$annotations() {
    }

    public static /* synthetic */ void getSubHeadingTextSize$annotations() {
    }

    public final C1204Sr getHeaderTitle() {
        return this.headerTitle;
    }

    public final C1204Sr getHeaderTitle2() {
        return this.headerTitle2;
    }

    public final C1204Sr getStepLabel() {
        return this.stepLabel;
    }

    public final LinearLayout getSubHeadingContainer() {
        return this.subHeadingContainer;
    }

    public final Integer getSubHeadingPixelWidth() {
        return this.subHeadingPixelWidth;
    }

    public final Integer getSubHeadingTextAppearance() {
        return this.subHeadingTextAppearance;
    }

    public final Integer getSubHeadingTextColor() {
        return this.subHeadingTextColor;
    }

    public final Float getSubHeadingTextSize() {
        return this.subHeadingTextSize;
    }

    public final void setSubHeadingPixelWidth(Integer num) {
        this.subHeadingPixelWidth = num;
    }

    public final void setSubHeadingTextAppearance(Integer num) {
        this.subHeadingTextAppearance = num;
    }

    public final void setSubHeadingTextColor(Integer num) {
        this.subHeadingTextColor = num;
    }

    public final void setSubHeadingTextSize(Float f) {
        this.subHeadingTextSize = f;
    }

    public /* synthetic */ SignupHeadingView(Context context, AttributeSet attributeSet, int i, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignupHeadingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        List e;
        List e2;
        C8632dsu.c((Object) context, "");
        SignupHeadingLayoutBinding inflate = SignupHeadingLayoutBinding.inflate(LayoutInflater.from(context), this);
        C8632dsu.a(inflate, "");
        this.binding = inflate;
        C1204Sr c1204Sr = inflate.stepLabel;
        C8632dsu.a(c1204Sr, "");
        this.stepLabel = c1204Sr;
        C1204Sr c1204Sr2 = inflate.headerTitle;
        C8632dsu.a(c1204Sr2, "");
        this.headerTitle = c1204Sr2;
        C1204Sr c1204Sr3 = inflate.header2Title;
        C8632dsu.a(c1204Sr3, "");
        this.headerTitle2 = c1204Sr3;
        LinearLayout linearLayout = inflate.subHeadingContainer;
        C8632dsu.a(linearLayout, "");
        this.subHeadingContainer = linearLayout;
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.SignupHeadingView, 0, 0);
        try {
            if (obtainStyledAttributes.hasValue(R.styleable.SignupHeadingView_stepsText)) {
                c1204Sr.setText(obtainStyledAttributes.getString(R.styleable.SignupHeadingView_stepsText));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.SignupHeadingView_titleText)) {
                c1204Sr2.setText(obtainStyledAttributes.getString(R.styleable.SignupHeadingView_titleText));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.SignupHeadingView_subheadingText)) {
                e2 = C8566dqi.e(obtainStyledAttributes.getString(R.styleable.SignupHeadingView_subheadingText));
                setSubHeadingStrings$default(this, e2, 0, 2, null);
            }
            if (obtainStyledAttributes.hasValue(R.styleable.SignupHeadingView_subheadingPixelWidth)) {
                this.subHeadingPixelWidth = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(R.styleable.SignupHeadingView_subheadingPixelWidth, 0));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.SignupHeadingView_signUpheaderTextColor)) {
                C8632dsu.d(obtainStyledAttributes);
                c1204Sr2.setTextColor(TypedArrayKt.getColorOrThrow(obtainStyledAttributes, R.styleable.SignupHeadingView_signUpheaderTextColor));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.SignupHeadingView_headerTextSize)) {
                C8632dsu.d(obtainStyledAttributes);
                c1204Sr2.setTextSize(0, TypedArrayKt.getDimensionPixelSizeOrThrow(obtainStyledAttributes, R.styleable.SignupHeadingView_headerTextSize));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.SignupHeadingView_headerTextAppearance)) {
                TextViewCompat.setTextAppearance(c1204Sr2, obtainStyledAttributes.getResourceId(R.styleable.SignupHeadingView_headerTextAppearance, 0));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.SignupHeadingView_subheaderTextAppearance)) {
                this.subHeadingTextAppearance = Integer.valueOf(obtainStyledAttributes.getResourceId(R.styleable.SignupHeadingView_subheaderTextAppearance, 0));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.SignupHeadingView_subHeaderTextSize)) {
                C8632dsu.d(obtainStyledAttributes);
                this.subHeadingTextSize = Float.valueOf(TypedArrayKt.getDimensionPixelSizeOrThrow(obtainStyledAttributes, R.styleable.SignupHeadingView_subHeaderTextSize));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.SignupHeadingView_subHeaderTextColor)) {
                C8632dsu.d(obtainStyledAttributes);
                this.subHeadingTextColor = Integer.valueOf(TypedArrayKt.getColorOrThrow(obtainStyledAttributes, R.styleable.SignupHeadingView_subHeaderTextColor));
            }
            obtainStyledAttributes.recycle();
            if (isInEditMode()) {
                e = C8566dqi.e("<b>This</b> is what a subheading looks like");
                setSubHeadingStrings$default(this, e, 0, 2, null);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    private final void setTextViewDrawableColor(TextView textView, int i) {
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        C8632dsu.a(compoundDrawables, "");
        for (Drawable drawable : compoundDrawables) {
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(textView.getContext(), i), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public static /* synthetic */ void setStepLabelString$default(SignupHeadingView signupHeadingView, CharSequence charSequence, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = null;
        }
        signupHeadingView.setStepLabelString(charSequence);
    }

    public final void setStepLabelString(CharSequence charSequence) {
        TextViewKt.setTextOrGone(this.stepLabel, charSequence);
    }

    public static /* synthetic */ void setHeadingString$default(SignupHeadingView signupHeadingView, CharSequence charSequence, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = null;
        }
        signupHeadingView.setHeadingString(charSequence);
    }

    public final void setHeadingString(CharSequence charSequence) {
        TextViewKt.setTextOrGone(this.headerTitle, charSequence);
    }

    public static /* synthetic */ void setHeading2String$default(SignupHeadingView signupHeadingView, CharSequence charSequence, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = null;
        }
        signupHeadingView.setHeading2String(charSequence);
    }

    public final void setHeading2String(CharSequence charSequence) {
        TextViewKt.setTextOrGone(this.headerTitle2, charSequence);
    }

    public final void removeHeader2MarginTop() {
        C9870yD.d(this.headerTitle2, 1, 0);
    }

    public final void setSubHeadingPixelWidth(int i) {
        this.subHeadingPixelWidth = Integer.valueOf(i);
    }

    public final void startAlignText() {
        this.stepLabel.setTextAlignment(2);
        this.headerTitle.setTextAlignment(2);
        this.headerTitle2.setTextAlignment(2);
        this.subHeadingContainer.setGravity(8388611);
        for (View view : ViewGroupKt.getChildren(this.subHeadingContainer)) {
            view.setTextAlignment(2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setSubHeadingStrings$default(SignupHeadingView signupHeadingView, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = C8569dql.i();
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        signupHeadingView.setSubHeadingStrings(list, i);
    }

    public final void setSubHeadingStrings(List<String> list, int i) {
        int intValue;
        C8632dsu.c((Object) list, "");
        this.subHeadingContainer.removeAllViews();
        ArrayList<String> arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str = (String) next;
            if (!((str == null || str.length() == 0) ? true : true)) {
                arrayList.add(next);
            }
        }
        for (String str2 : arrayList) {
            TextView textView = new TextView(getContext(), null, 0, R.style.SignupContextSubHeadingText);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = C9870yD.b(getContext(), 10);
            Integer num = this.subHeadingPixelWidth;
            if (num != null && ((intValue = num.intValue()) < getWidth() || C8150deu.h())) {
                layoutParams.width = intValue;
            }
            textView.setTag(SUB_HEADING_TAG);
            textView.setLayoutParams(layoutParams);
            textView.setText(C8168dfL.c(str2));
            Float f = this.subHeadingTextSize;
            if (f != null) {
                textView.setTextSize(0, f.floatValue());
            }
            Integer num2 = this.subHeadingTextColor;
            if (num2 != null) {
                textView.setTextColor(num2.intValue());
            }
            Integer num3 = this.subHeadingTextAppearance;
            if (num3 != null) {
                TextViewCompat.setTextAppearance(textView, num3.intValue());
            }
            if (i != 0) {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
                textView.setCompoundDrawablePadding(50);
                setTextViewDrawableColor(textView, C9834xU.c.e);
            }
            this.subHeadingContainer.addView(textView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setStrings$default(SignupHeadingView signupHeadingView, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = null;
        }
        if ((i & 2) != 0) {
            charSequence2 = null;
        }
        if ((i & 4) != 0) {
            charSequence3 = null;
        }
        if ((i & 8) != 0) {
            list = C8569dql.i();
        }
        signupHeadingView.setStrings(charSequence, charSequence2, charSequence3, list);
    }

    public final void setStrings(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, List<String> list) {
        C8632dsu.c((Object) list, "");
        setStepLabelString(charSequence);
        setHeadingString(charSequence2);
        setHeading2String(charSequence3);
        setSubHeadingStrings$default(this, list, 0, 2, null);
    }
}
