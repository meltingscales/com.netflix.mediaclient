package com.netflix.mediaclient.service.cdx;

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

/* loaded from: classes3.dex */
public final class UserAgentEventsReceiver implements UserAgentListener {
    private static CdxAgentImpl a;
    public static final e d = new e(null);

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface AgentModule {
        @Binds
        @IntoSet
        UserAgentListener b(UserAgentEventsReceiver userAgentEventsReceiver);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onProfileSelectionResultStatus(StatusCode statusCode) {
        C8632dsu.c((Object) statusCode, "");
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
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("nf_cdx_user");
        }

        public final void c(CdxAgentImpl cdxAgentImpl) {
            UserAgentEventsReceiver.a = cdxAgentImpl;
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserAccountActive() {
        d.getLogTag();
        CdxAgentImpl cdxAgentImpl = a;
        if (cdxAgentImpl != null) {
            cdxAgentImpl.t();
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserAccountDeactivated(List<? extends InterfaceC5283bvo> list, String str) {
        d.getLogTag();
        CdxAgentImpl cdxAgentImpl = a;
        if (cdxAgentImpl != null) {
            cdxAgentImpl.p();
        }
    }
}
