package com.netflix.mediaclient.service.job;

import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.job.NetflixJob;
import com.netflix.mediaclient.service.job.NetflixJobExecutor;
import com.netflix.mediaclient.service.job.NetflixJobInitializer;
import com.netflix.mediaclient.service.user.UserAgentListener;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import o.AbstractApplicationC1040Mh;
import o.C1052Mw;
import o.C1917aTa;
import o.C8632dsu;
import o.InterfaceC1929aTm;
import o.InterfaceC5283bvo;

@Singleton
/* loaded from: classes.dex */
public final class NetflixJobInitializer implements UserAgentListener {
    private final Map<NetflixJob.NetflixJobId, Provider<NetflixJobExecutor>> b;
    private Disposable d;
    private final InterfaceC1929aTm e;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface InitializerModule {
        @Binds
        @IntoSet
        UserAgentListener d(NetflixJobInitializer netflixJobInitializer);
    }

    @Inject
    public NetflixJobInitializer(InterfaceC1929aTm interfaceC1929aTm, Map<NetflixJob.NetflixJobId, Provider<NetflixJobExecutor>> map) {
        C8632dsu.c((Object) interfaceC1929aTm, "");
        C8632dsu.c((Object) map, "");
        this.e = interfaceC1929aTm;
        this.b = map;
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
    public void onUserProfileActive(InterfaceC5283bvo interfaceC5283bvo) {
        UserAgentListener.b.e(this, interfaceC5283bvo);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserProfileDeactivated(InterfaceC5283bvo interfaceC5283bvo, List<InterfaceC5283bvo> list) {
        UserAgentListener.b.c(this, interfaceC5283bvo, list);
    }

    public final void e() {
        c();
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserAccountActive() {
        c();
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserAccountDeactivated(List<InterfaceC5283bvo> list, String str) {
        c();
    }

    private final void c() {
        final C1052Mw i = AbstractApplicationC1040Mh.getInstance().i();
        C8632dsu.a(i, "");
        Disposable disposable = this.d;
        if (disposable != null) {
            disposable.dispose();
        }
        this.d = i.t().observeOn(Schedulers.computation()).subscribe(new Action() { // from class: o.aTo
            @Override // io.reactivex.functions.Action
            public final void run() {
                NetflixJobInitializer.a(C1052Mw.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C1052Mw c1052Mw, NetflixJobInitializer netflixJobInitializer) {
        C8632dsu.c((Object) c1052Mw, "");
        C8632dsu.c((Object) netflixJobInitializer, "");
        C1917aTa c1917aTa = new C1917aTa(c1052Mw);
        for (Map.Entry<NetflixJob.NetflixJobId, Provider<NetflixJobExecutor>> entry : netflixJobInitializer.b.entrySet()) {
            NetflixJobExecutor netflixJobExecutor = entry.getValue().get();
            C8632dsu.d(netflixJobExecutor);
            ((NetflixJobExecutor.a) netflixJobExecutor).e(netflixJobInitializer.e, c1917aTa, c1917aTa.e().v());
        }
    }
}
