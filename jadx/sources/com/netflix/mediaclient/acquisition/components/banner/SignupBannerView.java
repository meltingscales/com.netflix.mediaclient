package com.netflix.mediaclient.acquisition.components.banner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.databinding.SignupBannerViewBinding;
import dagger.hilt.android.AndroidEntryPoint;
import o.C1204Sr;
import o.C8168dfL;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.C9834xU;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public class SignupBannerView extends Hilt_SignupBannerView {
    public static final int $stable = 8;
    private final SignupBannerViewBinding binding;
    private final ImageView imageView;
    private final C1204Sr textView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SignupBannerView(Context context) {
        this(context, null, 0, 0, 14, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SignupBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SignupBannerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        C8632dsu.c((Object) context, "");
    }

    public final C1204Sr getTextView() {
        return this.textView;
    }

    public /* synthetic */ SignupBannerView(Context context, AttributeSet attributeSet, int i, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignupBannerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C8632dsu.c((Object) context, "");
        SignupBannerViewBinding inflate = SignupBannerViewBinding.inflate(LayoutInflater.from(context), this);
        C8632dsu.a(inflate, "");
        this.binding = inflate;
        C1204Sr c1204Sr = inflate.signupBannerTextView;
        C8632dsu.a(c1204Sr, "");
        this.textView = c1204Sr;
        ImageView imageView = inflate.signupBannerImageView;
        C8632dsu.a(imageView, "");
        this.imageView = imageView;
        setOrientation(0);
        setGravity(16);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.SignupBannerView, 0, 0);
        try {
            if (obtainStyledAttributes.hasValue(R.styleable.SignupBannerView_bannerIcon)) {
                setBannerIcon(obtainStyledAttributes.getDrawable(R.styleable.SignupBannerView_bannerIcon));
            }
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{16842904});
            C8632dsu.a(obtainStyledAttributes2, "");
            setTextColor(obtainStyledAttributes2.getColor(0, getResources().getColor(C9834xU.c.b)));
            obtainStyledAttributes2.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final String getText() {
        return this.textView.getText().toString();
    }

    public final void setText(String str) {
        int i;
        boolean g;
        if (str != null) {
            g = C8691duz.g(str);
            if (!g) {
                this.textView.setText(C8168dfL.c(str));
                i = 0;
                setVisibility(i);
                this.textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        this.textView.setText((CharSequence) null);
        i = 8;
        setVisibility(i);
        this.textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void setBannerIcon(Drawable drawable) {
        this.imageView.setImageDrawable(drawable);
    }

    public final void setTextColor(int i) {
        this.textView.setTextColor(i);
    }

    public final void setLinkColor(int i) {
        this.textView.setLinkTextColor(i);
    }

    public final void setSignupBannerInfoBlue(Context context) {
        C8632dsu.c((Object) context, "");
        setBannerIcon(context.getDrawable(R.drawable.ic_info_white));
        setTextColor(ContextCompat.getColor(context, C9834xU.c.I));
    }
}
