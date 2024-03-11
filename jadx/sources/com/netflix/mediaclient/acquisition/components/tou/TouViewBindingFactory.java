package com.netflix.mediaclient.acquisition.components.tou;

import o.C8632dsu;

/* loaded from: classes3.dex */
public final class TouViewBindingFactory {
    public static final int $stable = 0;

    public final TouPaymentViewBinding createPaymentBinding(TermsOfUseView termsOfUseView) {
        C8632dsu.c((Object) termsOfUseView, "");
        return new TouPaymentViewBinding(termsOfUseView);
    }
}
