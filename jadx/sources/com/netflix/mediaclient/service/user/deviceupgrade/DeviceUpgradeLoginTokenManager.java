package com.netflix.mediaclient.service.user.deviceupgrade;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PersistCredentialsAcrossDeviceUpgrade;
import com.netflix.mediaclient.service.user.UserAgentListener;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.C1045Mp;
import o.C1596aHd;
import o.C8246dgk;
import o.C8627dsp;
import o.C8632dsu;
import o.C8737dwr;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.InterfaceC5283bvo;
import o.dqE;
import o.dwQ;
import o.dwU;

/* loaded from: classes4.dex */
public final class DeviceUpgradeLoginTokenManager implements UserAgentListener {
    public static final b a = new b(null);
    private final dwU b;
    private final Context c;
    private final dwQ d;
    private final C8246dgk e;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface DeviceUpgradeTokenMangerModule {
        @Singleton
        @Binds
        @IntoSet
        UserAgentListener b(DeviceUpgradeLoginTokenManager deviceUpgradeLoginTokenManager);
    }

    @Inject
    public DeviceUpgradeLoginTokenManager(C8246dgk c8246dgk, @ApplicationContext Context context, dwU dwu, dwQ dwq) {
        C8632dsu.c((Object) c8246dgk, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) dwq, "");
        this.e = c8246dgk;
        this.c = context;
        this.b = dwu;
        this.d = dwq;
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
    public void onUserAccountActive() {
        Map k;
        Throwable th;
        Map k2;
        Throwable th2;
        Config_FastProperty_PersistCredentialsAcrossDeviceUpgrade.e eVar = Config_FastProperty_PersistCredentialsAcrossDeviceUpgrade.Companion;
        if (eVar.b()) {
            try {
                WorkManager.getInstance(this.c).cancelUniqueWork("DEVICE_UPGRADE_TOKEN_REFRESH_WORK");
            } catch (IllegalStateException e) {
                InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                k = dqE.k(new LinkedHashMap());
                C1596aHd c1596aHd = new C1596aHd("SPY-37499 WorkManager Init Failure", e, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b2);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                InterfaceC1597aHe c2 = dVar2.c();
                if (c2 != null) {
                    c2.d(c1596aHd, th);
                } else {
                    dVar2.e().b(c1596aHd, th);
                }
            }
            c();
        } else if (eVar.e()) {
            long d = eVar.d();
            Constraints build = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
            C8632dsu.a(build, "");
            PeriodicWorkRequest build2 = new PeriodicWorkRequest.Builder(DeviceUpgradeLoginTokenWorker.class, d, TimeUnit.MILLISECONDS).setConstraints(build).build();
            C8632dsu.a(build2, "");
            try {
                WorkManager.getInstance(this.c).enqueueUniquePeriodicWork("DEVICE_UPGRADE_TOKEN_REFRESH_WORK", ExistingPeriodicWorkPolicy.KEEP, build2);
            } catch (IllegalStateException e2) {
                InterfaceC1597aHe.d dVar3 = InterfaceC1597aHe.b;
                k2 = dqE.k(new LinkedHashMap());
                C1596aHd c1596aHd2 = new C1596aHd("SPY-37499 WorkManager Init Failure", e2, null, true, k2, false, false, 96, null);
                ErrorType errorType2 = c1596aHd2.a;
                if (errorType2 != null) {
                    c1596aHd2.e.put("errorType", errorType2.c());
                    String b3 = c1596aHd2.b();
                    if (b3 != null) {
                        String c3 = errorType2.c();
                        c1596aHd2.a(c3 + " " + b3);
                    }
                }
                if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                    th2 = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                } else if (c1596aHd2.b() != null) {
                    th2 = new Throwable(c1596aHd2.b());
                } else {
                    th2 = c1596aHd2.i;
                    if (th2 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar4 = InterfaceC1601aHi.c;
                InterfaceC1597aHe c4 = dVar4.c();
                if (c4 != null) {
                    c4.d(c1596aHd2, th2);
                } else {
                    dVar4.e().b(c1596aHd2, th2);
                }
            }
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserLogOut() {
        c();
    }

    private final void c() {
        C8737dwr.c(this.b, this.d, null, new DeviceUpgradeLoginTokenManager$clearLoginToken$1(this, null), 2, null);
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("DeviceUpgradeTokenManager");
        }
    }
}
