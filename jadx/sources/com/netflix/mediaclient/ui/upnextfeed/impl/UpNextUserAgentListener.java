package com.netflix.mediaclient.ui.upnextfeed.impl;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.user.UserAgentListener;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import java.util.ArrayList;
import java.util.List;
import o.C1332Xp;
import o.C1567aGb;
import o.C7972dbb;
import o.C8572dqo;
import o.C8632dsu;
import o.InterfaceC5283bvo;
import o.dpR;

/* loaded from: classes5.dex */
public final class UpNextUserAgentListener implements UserAgentListener {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface AgentModule {
        @Binds
        @IntoSet
        UserAgentListener c(UpNextUserAgentListener upNextUserAgentListener);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onProfileSelectionResultStatus(StatusCode statusCode) {
        UserAgentListener.b.a(this, statusCode);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserAccountActive() {
        UserAgentListener.b.a(this);
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
        e(list);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserAccountDeactivated(List<? extends InterfaceC5283bvo> list, String str) {
        e(list);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onProfileTypeChanged(String str) {
        C8632dsu.c((Object) str, "");
        C7972dbb c7972dbb = new C7972dbb(new C1567aGb(str));
        C1332Xp c1332Xp = C1332Xp.b;
        c7972dbb.a((Context) C1332Xp.b(Context.class));
    }

    private final void e(List<? extends InterfaceC5283bvo> list) {
        int d;
        if (list != null) {
            d = C8572dqo.d(list, 10);
            ArrayList arrayList = new ArrayList(d);
            for (InterfaceC5283bvo interfaceC5283bvo : list) {
                String profileGuid = interfaceC5283bvo.getProfileGuid();
                C8632dsu.a(profileGuid, "");
                C7972dbb c7972dbb = new C7972dbb(new C1567aGb(profileGuid));
                C1332Xp c1332Xp = C1332Xp.b;
                c7972dbb.a((Context) C1332Xp.b(Context.class));
                arrayList.add(dpR.c);
            }
        }
    }
}
