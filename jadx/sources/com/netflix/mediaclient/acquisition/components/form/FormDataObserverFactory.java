package com.netflix.mediaclient.acquisition.components.form;

import android.view.View;
import com.netflix.mediaclient.acquisition.components.banner.SignupBannerView;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.components.status.ButtonLoadingObserver;
import com.netflix.mediaclient.acquisition.components.status.InlineWarningObserver;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class FormDataObserverFactory {
    public static final int $stable = 0;

    public final InlineWarningObserver createInlineWarningObserver(SignupBannerView signupBannerView, View view) {
        C8632dsu.c((Object) signupBannerView, "");
        return new InlineWarningObserver(signupBannerView, view);
    }

    public final ButtonLoadingObserver createButtonLoadingObserver(NetflixSignupButton netflixSignupButton) {
        C8632dsu.c((Object) netflixSignupButton, "");
        return new ButtonLoadingObserver(netflixSignupButton);
    }
}
