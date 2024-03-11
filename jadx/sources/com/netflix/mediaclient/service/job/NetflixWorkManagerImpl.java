package com.netflix.mediaclient.service.job;

import android.content.Context;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.C1596aHd;
import o.C8157dfA;
import o.C8632dsu;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.InterfaceC1938aTv;
import o.dqE;

@Singleton
/* loaded from: classes3.dex */
public final class NetflixWorkManagerImpl implements InterfaceC1938aTv {
    private final Context a;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface SchedulerModule {
        @Binds
        InterfaceC1938aTv e(NetflixWorkManagerImpl netflixWorkManagerImpl);
    }

    @Inject
    public NetflixWorkManagerImpl(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        this.a = context;
    }

    public WorkManager b() {
        Map k;
        Throwable th;
        try {
            return WorkManager.getInstance(this.a);
        } catch (IllegalStateException e) {
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            k = dqE.k(new LinkedHashMap());
            C1596aHd c1596aHd = new C1596aHd("SPY-37499 WorkManager Init Failure", e, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b);
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
            return null;
        }
    }

    @Override // o.InterfaceC1938aTv
    public void c(String str, long j, PeriodicWorkRequest periodicWorkRequest) {
        ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) periodicWorkRequest, "");
        WorkManager b = b();
        if (b == null) {
            return;
        }
        String str2 = str + "_internal_ms";
        long b2 = C8157dfA.b(this.a, str2, 0L);
        if (j == b2) {
            existingPeriodicWorkPolicy = ExistingPeriodicWorkPolicy.KEEP;
        } else {
            existingPeriodicWorkPolicy = ExistingPeriodicWorkPolicy.REPLACE;
        }
        if (b2 == 0) {
            C8157dfA.e(this.a, str2, j);
        }
        b.enqueueUniquePeriodicWork(str, existingPeriodicWorkPolicy, periodicWorkRequest);
    }

    @Override // o.InterfaceC1938aTv
    public void b(String str) {
        C8632dsu.c((Object) str, "");
        WorkManager b = b();
        if (b == null) {
            return;
        }
        b.cancelUniqueWork(str);
    }
}
