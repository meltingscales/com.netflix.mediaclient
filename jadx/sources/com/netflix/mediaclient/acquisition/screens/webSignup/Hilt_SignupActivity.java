package com.netflix.mediaclient.acquisition.screens.webSignup;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import o.cVD;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class Hilt_SignupActivity extends cVD {
    private boolean injected = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_SignupActivity() {
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: com.netflix.mediaclient.acquisition.screens.webSignup.Hilt_SignupActivity.1
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                Hilt_SignupActivity.this.inject();
            }
        });
    }

    @Override // o.MT, o.AbstractActivityC1635aIp
    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((SignupActivity_GeneratedInjector) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).injectSignupActivity((SignupActivity) UnsafeCasts.unsafeCast(this));
    }
}
