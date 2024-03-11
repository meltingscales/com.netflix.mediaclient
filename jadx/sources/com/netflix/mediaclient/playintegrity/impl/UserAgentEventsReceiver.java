package com.netflix.mediaclient.playintegrity.impl;

import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.user.UserAgentListener;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import java.util.List;
import o.C1045Mp;
import o.C1693aKt;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC5283bvo;
import o.dpR;

/* loaded from: classes3.dex */
public final class UserAgentEventsReceiver implements UserAgentListener {
    public static final d b = new d(null);
    private static C1693aKt c;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface PlayIntegrityModule {
        @Binds
        @IntoSet
        UserAgentListener a(UserAgentEventsReceiver userAgentEventsReceiver);
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
    public void onUserLogOut() {
        UserAgentListener.b.b(this);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserProfileDeactivated(InterfaceC5283bvo interfaceC5283bvo, List<? extends InterfaceC5283bvo> list) {
        UserAgentListener.b.c(this, interfaceC5283bvo, list);
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("nf_PlayIntegrity_user");
        }

        public final void c(C1693aKt c1693aKt) {
            UserAgentEventsReceiver.c = c1693aKt;
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserAccountActive() {
        C1693aKt c1693aKt = c;
        if (c1693aKt != null) {
            c1693aKt.d();
            dpR dpr = dpR.c;
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserAccountDeactivated(List<? extends InterfaceC5283bvo> list, String str) {
        C1693aKt c1693aKt = c;
        if (c1693aKt != null) {
            c1693aKt.b();
            dpR dpr = dpR.c;
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserProfileActive(InterfaceC5283bvo interfaceC5283bvo) {
        C8632dsu.c((Object) interfaceC5283bvo, "");
        C1693aKt c1693aKt = c;
        if (c1693aKt != null) {
            b.getLogTag();
            c1693aKt.d();
            dpR dpr = dpR.c;
        }
    }
}
