package com.netflix.mediaclient.acquisition.components.banner;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes3.dex */
public abstract class Hilt_SignupBannerView extends LinearLayout implements GeneratedComponentManagerHolder {
    private ViewComponentManager componentManager;
    private boolean injected;

    Hilt_SignupBannerView(Context context) {
        super(context);
        inject();
    }

    Hilt_SignupBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inject();
    }

    Hilt_SignupBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(21)
    public Hilt_SignupBannerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        inject();
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    protected ViewComponentManager createComponentManager() {
        return new ViewComponentManager(this, false);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final ViewComponentManager componentManager() {
        if (this.componentManager == null) {
            this.componentManager = createComponentManager();
        }
        return this.componentManager;
    }

    protected void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((SignupBannerView_GeneratedInjector) generatedComponent()).injectSignupBannerView((SignupBannerView) UnsafeCasts.unsafeCast(this));
    }
}
