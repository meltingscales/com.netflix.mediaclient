package com.netflix.mediaclient.acquisition.screens.signupContainer;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.Lambda;
import o.C8632dsu;
import o.drO;

/* loaded from: classes3.dex */
public final class SignupNativeActivity$special$$inlined$viewModels$default$1 extends Lambda implements drO<ViewModelProvider.Factory> {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignupNativeActivity$special$$inlined$viewModels$default$1(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.drO
    public final ViewModelProvider.Factory invoke() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = this.$this_viewModels.getDefaultViewModelProviderFactory();
        C8632dsu.a(defaultViewModelProviderFactory, "");
        return defaultViewModelProviderFactory;
    }
}
