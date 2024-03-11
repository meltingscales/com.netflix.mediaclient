package com.netflix.mediaclient.ui.verifyplay;

import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.user.UserAgentListener;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import java.util.List;
import o.C8082ddf;
import o.C8632dsu;
import o.InterfaceC5283bvo;

/* loaded from: classes5.dex */
public final class PinVerifierUserAgentListener implements UserAgentListener {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface InitializerModule {
        @Binds
        @IntoSet
        UserAgentListener a(PinVerifierUserAgentListener pinVerifierUserAgentListener);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onProfileSelectionResultStatus(StatusCode statusCode) {
        UserAgentListener.b.a(this, statusCode);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onProfileTypeChanged(String str) {
        UserAgentListener.b.c(this, str);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserAccountActive() {
        UserAgentListener.b.a(this);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserAccountDeactivated(List<? extends InterfaceC5283bvo> list, String str) {
        UserAgentListener.b.a(this, list, str);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserLogOut() {
        UserAgentListener.b.b(this);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserProfileDeactivated(InterfaceC5283bvo interfaceC5283bvo, List<? extends InterfaceC5283bvo> list) {
        UserAgentListener.b.c(this, interfaceC5283bvo, list);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserProfileActive(InterfaceC5283bvo interfaceC5283bvo) {
        C8632dsu.c((Object) interfaceC5283bvo, "");
        C8082ddf.e();
    }
}
