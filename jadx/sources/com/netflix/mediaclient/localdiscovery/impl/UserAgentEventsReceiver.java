package com.netflix.mediaclient.localdiscovery.impl;

import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.user.UserAgentListener;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import java.util.List;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC5283bvo;
import o.aGW;

/* loaded from: classes3.dex */
public final class UserAgentEventsReceiver implements UserAgentListener {
    private static aGW a;
    public static final a c = new a(null);

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface AgentModule {
        @Binds
        @IntoSet
        UserAgentListener d(UserAgentEventsReceiver userAgentEventsReceiver);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onProfileSelectionResultStatus(StatusCode statusCode) {
        C8632dsu.c((Object) statusCode, "");
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserAccountActive() {
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
    public void onUserProfileActive(InterfaceC5283bvo interfaceC5283bvo) {
        UserAgentListener.b.e(this, interfaceC5283bvo);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserProfileDeactivated(InterfaceC5283bvo interfaceC5283bvo, List<? extends InterfaceC5283bvo> list) {
        UserAgentListener.b.c(this, interfaceC5283bvo, list);
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("nf_local_discovery_user");
        }

        public final void b(aGW agw) {
            UserAgentEventsReceiver.a = agw;
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserAccountDeactivated(List<? extends InterfaceC5283bvo> list, String str) {
        aGW agw = a;
        if (agw != null) {
            agw.a();
        }
    }
}
