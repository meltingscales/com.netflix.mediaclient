package com.netflix.mediaclient.log.impl;

import android.content.Context;
import com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_CLHandledExceptionSampling;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.IClientLoggingListener;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.C1045Mp;
import o.C1596aHd;
import o.C1603aHk;
import o.C1604aHl;
import o.C1606aHn;
import o.C8150deu;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1248Uj;
import o.aOV;

@Singleton
/* loaded from: classes3.dex */
public final class LoggerConfig implements IClientLoggingListener {
    public static final d a = new d(null);
    private final Context b;
    private boolean c;
    private final InterfaceC1248Uj d;
    private final Set<ExternalCrashReporter> e;
    private C1603aHk j;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface LoggerConfigModule {
        @Binds
        @IntoSet
        IClientLoggingListener d(LoggerConfig loggerConfig);
    }

    @Inject
    public LoggerConfig(@ApplicationContext Context context, Set<ExternalCrashReporter> set, InterfaceC1248Uj interfaceC1248Uj) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) set, "");
        C8632dsu.c((Object) interfaceC1248Uj, "");
        this.b = context;
        this.e = set;
        this.d = interfaceC1248Uj;
        this.j = new C1603aHk(null, null, null, false, false, 31, null);
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("LoggerConfig");
        }
    }

    public final boolean e() {
        return this.j.c();
    }

    public final C1606aHn a(C1596aHd c1596aHd) {
        C8632dsu.c((Object) c1596aHd, "");
        return this.j.e().e(c1596aHd);
    }

    public final C1606aHn b(C1596aHd c1596aHd) {
        C8632dsu.c((Object) c1596aHd, "");
        return this.j.d().e(c1596aHd);
    }

    public final C1606aHn e(C1596aHd c1596aHd) {
        C8632dsu.c((Object) c1596aHd, "");
        return this.j.b().e(c1596aHd);
    }

    public final boolean d() {
        return this.j.a();
    }

    public final boolean c() {
        this.d.b();
        return false;
    }

    public final boolean a(String str) {
        return str != null && Config_FastProperty_CLHandledExceptionSampling.Companion.a().getBlocklistedMessageKeys().contains(str);
    }

    @Override // com.netflix.mediaclient.servicemgr.IClientLoggingListener
    public void e(IClientLogging iClientLogging, aOV aov, long j) {
        C8632dsu.c((Object) iClientLogging, "");
        C8632dsu.c((Object) aov, "");
        if (c()) {
            this.j = new C1603aHk(null, null, null, false, false, 31, null);
        } else if (aov.u().c("bugsnag").isDisabled()) {
            this.j = new C1603aHk(null, null, null, false, false, 31, null);
        } else {
            boolean a2 = aov.f().b("bugsnag").isDisabled() ? false : a(aov);
            Config_FastProperty_CLHandledExceptionSampling a3 = Config_FastProperty_CLHandledExceptionSampling.Companion.a();
            boolean as = aov.as();
            C1604aHl.a aVar = C1604aHl.e;
            this.j = new C1603aHk(aVar.a(a3.getMonitoringEventsClPercentage(), a3.getHighVolumeMonitoringEventsClPercentage(), as), aVar.a(a3.getErrorEventsClPercentage(), a3.getHighVolumeErrorEventsClPercentage(), as), aVar.a(a3.getErrorEventsBugsnagPercentage(), a3.getHighVolumeErrorEventsBugsnagPercentage(), as), a2, a3.getShouldFilterBlocklistedCrashes());
            e(aov, j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0013 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(o.aOV r16, long r17) {
        /*
            r15 = this;
            r1 = r15
            boolean r0 = r1.c
            if (r0 == 0) goto L6
            return
        L6:
            r0 = 1
            r1.c = r0
            boolean r2 = r15.a(r16)
            java.util.Set<com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter> r0 = r1.e
            java.util.Iterator r3 = r0.iterator()
        L13:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lde
            java.lang.Object r0 = r3.next()
            r4 = r0
            com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter r4 = (com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter) r4
            android.content.Context r0 = r1.b     // Catch: java.lang.Throwable -> L27
            r4.d(r0, r2)     // Catch: java.lang.Throwable -> L27
            goto Lc6
        L27:
            r0 = move-exception
            r7 = r0
            o.aHe$d r0 = o.InterfaceC1597aHe.b
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r10 = o.dqF.d(r0)
            o.aHd r0 = new o.aHd
            java.lang.String r6 = "SPY-35111 - unable to initialize Bugsnag"
            r8 = 0
            r9 = 1
            r11 = 0
            r12 = 0
            r13 = 96
            r14 = 0
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            com.netflix.mediaclient.api.logging.error.ErrorType r5 = r0.a
            if (r5 == 0) goto L73
            java.util.Map<java.lang.String, java.lang.String> r6 = r0.e
            java.lang.String r7 = "errorType"
            java.lang.String r8 = r5.c()
            r6.put(r7, r8)
            java.lang.String r6 = r0.b()
            if (r6 == 0) goto L73
            java.lang.String r5 = r5.c()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r5 = " "
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
            r0.a(r5)
        L73:
            java.lang.String r5 = r0.b()
            if (r5 == 0) goto L89
            java.lang.Throwable r5 = r0.i
            if (r5 == 0) goto L89
            java.lang.Throwable r5 = new java.lang.Throwable
            java.lang.String r6 = r0.b()
            java.lang.Throwable r7 = r0.i
            r5.<init>(r6, r7)
            goto Lb3
        L89:
            java.lang.String r5 = r0.b()
            if (r5 == 0) goto L99
            java.lang.Throwable r5 = new java.lang.Throwable
            java.lang.String r6 = r0.b()
            r5.<init>(r6)
            goto Lb3
        L99:
            java.lang.Throwable r5 = r0.i
            if (r5 == 0) goto Lac
            if (r5 == 0) goto La0
            goto Lb3
        La0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Required value was null."
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        Lac:
            java.lang.Throwable r5 = new java.lang.Throwable
            java.lang.String r6 = "Handled exception with no message"
            r5.<init>(r6)
        Lb3:
            o.aHi$d r6 = o.InterfaceC1601aHi.c
            o.aHe r7 = r6.c()
            if (r7 == 0) goto Lbf
            r7.d(r0, r5)
            goto Lc6
        Lbf:
            o.aHb r6 = r6.e()
            r6.b(r0, r5)
        Lc6:
            if (r2 == 0) goto L13
            o.Uj r0 = r1.d
            java.lang.String r5 = "version"
            java.lang.String r0 = r0.i()
            r4.d(r5, r0)
            java.lang.String r0 = "sessionId"
            java.lang.String r5 = java.lang.String.valueOf(r17)
            r4.d(r0, r5)
            goto L13
        Lde:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.log.impl.LoggerConfig.e(o.aOV, long):void");
    }

    private final boolean a(aOV aov) {
        return C8150deu.b(aov.u().c("bugsnag").getDisableChancePercentage());
    }
}
