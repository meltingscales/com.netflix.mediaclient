package com.netflix.mediaclient.acquisition.screens.signupContainer;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.netflix.mediaclient.acquisition.di.DependencyInjectionNetflixActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes3.dex */
public abstract class Hilt_SignupNativeActivity extends DependencyInjectionNetflixActivity {
    private boolean injected = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_SignupNativeActivity() {
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: com.netflix.mediaclient.acquisition.screens.signupContainer.Hilt_SignupNativeActivity.1
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                Hilt_SignupNativeActivity.this.inject();
            }
        });
    }

    @Override // o.MT, o.AbstractActivityC1635aIp
    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((SignupNativeActivity_GeneratedInjector) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).injectSignupNativeActivity((SignupNativeActivity) UnsafeCasts.unsafeCast(this));
    }
}
