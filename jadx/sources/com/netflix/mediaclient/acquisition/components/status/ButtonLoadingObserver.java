package com.netflix.mediaclient.acquisition.components.status;

import androidx.lifecycle.Observer;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class ButtonLoadingObserver implements Observer<Boolean> {
    public static final int $stable = 8;
    private final NetflixSignupButton button;

    public final NetflixSignupButton getButton() {
        return this.button;
    }

    public ButtonLoadingObserver(NetflixSignupButton netflixSignupButton) {
        C8632dsu.c((Object) netflixSignupButton, "");
        this.button = netflixSignupButton;
    }

    @Override // androidx.lifecycle.Observer
    public /* synthetic */ void onChanged(Boolean bool) {
        onChanged(bool.booleanValue());
    }

    public void onChanged(boolean z) {
        this.button.setLoading(z);
    }
}
