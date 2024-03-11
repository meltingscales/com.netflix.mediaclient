package com.netflix.mediaclient.acquisition.components.signupButton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.netflix.mediaclient.acquisition.R;
import o.C1203Sq;
import o.C8627dsp;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC8554dpx;
import o.dpA;
import o.drO;

/* loaded from: classes3.dex */
public class NetflixSignupButton extends FrameLayout {
    public static final int $stable = 8;
    private boolean isLoading;
    private final InterfaceC8554dpx loadingView$delegate;
    private final InterfaceC8554dpx textButton$delegate;
    private int textColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NetflixSignupButton(Context context) {
        this(context, null, 0, 0, 14, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NetflixSignupButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NetflixSignupButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        C8632dsu.c((Object) context, "");
    }

    public static /* synthetic */ void getLoadingView$annotations() {
    }

    public static /* synthetic */ void getTextButton$annotations() {
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public /* synthetic */ NetflixSignupButton(Context context, AttributeSet attributeSet, int i, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetflixSignupButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C8632dsu.c((Object) context, "");
        this.loadingView$delegate = dpA.d(new drO<ProgressBar>() { // from class: com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton$loadingView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final ProgressBar invoke() {
                return (ProgressBar) NetflixSignupButton.this.findViewById(R.id.loadingView);
            }
        });
        this.textButton$delegate = dpA.d(new drO<C1203Sq>() { // from class: com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton$textButton$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public final C1203Sq invoke() {
                return (C1203Sq) NetflixSignupButton.this.findViewById(R.id.textButton);
            }
        });
        this.textColor = C9834xU.c.I;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.NetflixSignupButton);
        C8632dsu.a(obtainStyledAttributes, "");
        View.inflate(context, obtainStyledAttributes.getResourceId(R.styleable.NetflixSignupButton_buttonLayout, R.layout.netflix_signup_button_layout), this);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{16843087});
        C8632dsu.a(obtainStyledAttributes2, "");
        getTextButton().setText(obtainStyledAttributes2.getText(0));
        obtainStyledAttributes2.recycle();
    }

    public final ProgressBar getLoadingView() {
        return (ProgressBar) this.loadingView$delegate.getValue();
    }

    public final C1203Sq getTextButton() {
        return (C1203Sq) this.textButton$delegate.getValue();
    }

    public final TextView getButton() {
        C1203Sq textButton = getTextButton();
        C8632dsu.a(textButton, "");
        return textButton;
    }

    public final CharSequence getText() {
        CharSequence text = getTextButton().getText();
        C8632dsu.a(text, "");
        return text;
    }

    public final void setText(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
        getTextButton().setText(charSequence);
    }

    public final boolean isAllCaps() {
        return NetflixSignupButton$$ExternalSyntheticApiModelOutline0.m(getTextButton());
    }

    public final void setAllCaps(boolean z) {
        getTextButton().setAllCaps(z);
    }

    public final void setLoading(boolean z) {
        this.isLoading = z;
        if (z) {
            showSpinner();
        } else {
            hideSpinner();
        }
    }

    public final void setDoubleLineText(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.signup_cta_button_text);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.signup_cta_button_second_line_text);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new AbsoluteSizeSpan(dimensionPixelSize), 0, str.length(), 18);
        SpannableString spannableString2 = new SpannableString(str2);
        spannableString2.setSpan(new AbsoluteSizeSpan(dimensionPixelSize2), 0, str2.length(), 18);
        getTextButton().setText(TextUtils.concat(spannableString, "\n", spannableString2));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
        }
        if (viewGroup == null) {
            return;
        }
        viewGroup.setClipToPadding(false);
    }

    private final void showSpinner() {
        ColorStateList valueOf = ColorStateList.valueOf(ContextCompat.getColor(getContext(), 17170445));
        C8632dsu.a(valueOf, "");
        C1203Sq textButton = getTextButton();
        C8632dsu.a(textButton, "");
        C1203Sq.a(textButton, null, null, valueOf, null, false, 0, 0, 0, 0, false, false, 2043, null);
        getLoadingView().setVisibility(0);
        setEnabled(false);
    }

    private final void hideSpinner() {
        C1203Sq textButton = getTextButton();
        C8632dsu.a(textButton, "");
        ColorStateList valueOf = ColorStateList.valueOf(ContextCompat.getColor(getContext(), this.textColor));
        C8632dsu.a(valueOf, "");
        C1203Sq.a(textButton, null, null, valueOf, null, false, 0, 0, 0, 0, false, false, 2043, null);
        getLoadingView().setVisibility(8);
        setEnabled(true);
    }

    public final void updateTextAndButtonColor(int i, int i2) {
        this.textColor = i;
        C1203Sq textButton = getTextButton();
        ColorStateList valueOf = ColorStateList.valueOf(ContextCompat.getColor(getContext(), i));
        ColorStateList valueOf2 = ColorStateList.valueOf(ContextCompat.getColor(getContext(), i2));
        int color = ContextCompat.getColor(getContext(), R.color.signup_cta_ripple);
        C8632dsu.d(textButton);
        C8632dsu.d(valueOf2);
        C8632dsu.d(valueOf);
        C1203Sq.a(textButton, null, valueOf2, valueOf, null, false, color, 0, 0, 0, false, false, 2009, null);
    }
}
