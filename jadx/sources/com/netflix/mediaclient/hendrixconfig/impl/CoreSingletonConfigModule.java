package com.netflix.mediaclient.hendrixconfig.impl;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.user.UserAgentListener;
import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import java.util.List;
import java.util.Set;
import javax.inject.Singleton;
import o.C1555aFq;
import o.C8632dsu;
import o.C8737dwr;
import o.InterfaceC1543aFe;
import o.InterfaceC1544aFf;
import o.InterfaceC1550aFl;
import o.InterfaceC5283bvo;
import o.aFD;
import o.dwU;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes3.dex */
public final class CoreSingletonConfigModule {

    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC1550aFl {
        private final String b = "singleton";

        @Override // o.InterfaceC1550aFl
        public String e() {
            return this.b;
        }

        b() {
        }
    }

    @Provides
    @Singleton
    public final C1555aFq e(@ApplicationContext Context context, dwU dwu, Set<InterfaceC1544aFf> set, Set<InterfaceC1543aFe> set2) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) set, "");
        C8632dsu.c((Object) set2, "");
        return new C1555aFq(context, new b(), dwu, set, set2, true);
    }

    @Provides
    @Reusable
    public final aFD e(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        return new aFD(c1555aFq);
    }

    /* loaded from: classes3.dex */
    public static final class d implements UserAgentListener {
        final /* synthetic */ dwU a;
        final /* synthetic */ C1555aFq d;
        final /* synthetic */ Context e;

        d(C1555aFq c1555aFq, dwU dwu, Context context) {
            this.d = c1555aFq;
            this.a = dwu;
            this.e = context;
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
        public void onUserProfileActive(InterfaceC5283bvo interfaceC5283bvo) {
            UserAgentListener.b.e(this, interfaceC5283bvo);
        }

        @Override // com.netflix.mediaclient.service.user.UserAgentListener
        public void onUserProfileDeactivated(InterfaceC5283bvo interfaceC5283bvo, List<? extends InterfaceC5283bvo> list) {
            UserAgentListener.b.c(this, interfaceC5283bvo, list);
        }

        @Override // com.netflix.mediaclient.service.user.UserAgentListener
        public void onUserLogOut() {
            UserAgentListener.b.b(this);
            this.d.d();
            C8737dwr.c(this.a, null, null, new CoreSingletonConfigModule$cleanupAccountDataCallback$1$onUserLogOut$1(this.e, null), 3, null);
        }
    }

    @Provides
    @IntoSet
    public final UserAgentListener d(@ApplicationContext Context context, dwU dwu, C1555aFq c1555aFq) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) c1555aFq, "");
        return new d(c1555aFq, dwu, context);
    }
}
