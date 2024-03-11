package com.netflix.mediaclient.acquisition.components.status;

import android.content.Context;
import android.view.View;
import androidx.core.text.HtmlCompat;
import androidx.lifecycle.Observer;
import com.netflix.mediaclient.acquisition.components.banner.SignupBannerView;
import com.netflix.mediaclient.util.AccessibilityUtils;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class InlineWarningObserver implements Observer<String> {
    public static final int $stable = 8;
    private final View scrollView;
    private final SignupBannerView signupInlineWarningView;

    public InlineWarningObserver(SignupBannerView signupBannerView, View view) {
        C8632dsu.c((Object) signupBannerView, "");
        this.signupInlineWarningView = signupBannerView;
        this.scrollView = view;
    }

    public /* synthetic */ InlineWarningObserver(SignupBannerView signupBannerView, View view, int i, C8627dsp c8627dsp) {
        this(signupBannerView, (i & 2) != 0 ? null : view);
    }

    @Override // androidx.lifecycle.Observer
    public void onChanged(String str) {
        C8632dsu.c((Object) str, "");
        this.signupInlineWarningView.setText(str.length() == 0 ? null : str);
        if (str.length() > 0) {
            View view = this.scrollView;
            if (view != null) {
                view.scrollTo(0, 0);
            }
            String obj = HtmlCompat.fromHtml(str, 0).toString();
            Context context = this.signupInlineWarningView.getContext();
            C8632dsu.a(context, "");
            AccessibilityUtils.b(context, obj);
        }
    }
}
