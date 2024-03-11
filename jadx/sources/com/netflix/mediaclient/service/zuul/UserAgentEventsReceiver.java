package com.netflix.mediaclient.service.zuul;

import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.user.UserAgentListener;
import com.netflix.mediaclient.servicemgr.ZuulAgent;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import java.util.List;
import o.AbstractApplicationC1040Mh;
import o.C1045Mp;
import o.C5054brX;
import o.C5110bsa;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC5050brT;
import o.InterfaceC5283bvo;
import o.dpR;

/* loaded from: classes4.dex */
public final class UserAgentEventsReceiver implements UserAgentListener {
    private static final e e = new e(null);

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface AgentModule {
        @Binds
        @IntoSet
        UserAgentListener d(UserAgentEventsReceiver userAgentEventsReceiver);
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

    /* loaded from: classes4.dex */
    static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("nf_zuul_user");
        }
    }

    private final C5110bsa d() {
        ZuulAgent p = AbstractApplicationC1040Mh.getInstance().i().p();
        if (p instanceof C5054brX) {
            InterfaceC5050brT a = ((C5054brX) p).a();
            C8632dsu.d(a);
            return (C5110bsa) a;
        }
        return null;
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserAccountDeactivated(List<? extends InterfaceC5283bvo> list, String str) {
        C5110bsa d = d();
        if (d != null) {
            d.i();
            dpR dpr = dpR.c;
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserAccountActive() {
        e.getLogTag();
        C5110bsa d = d();
        if (d != null) {
            d.h();
            dpR dpr = dpR.c;
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onProfileSelectionResultStatus(StatusCode statusCode) {
        C5110bsa d;
        C8632dsu.c((Object) statusCode, "");
        e.getLogTag();
        if (!statusCode.isSucess() || (d = d()) == null) {
            return;
        }
        d.b();
    }
}
