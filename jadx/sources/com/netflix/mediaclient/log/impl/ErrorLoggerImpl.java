package com.netflix.mediaclient.log.impl;

import android.content.Context;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.discrete.ExceptionOccurred;
import com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import o.C1045Mp;
import o.C1596aHd;
import o.C1606aHn;
import o.C1607aHo;
import o.C8067ddQ;
import o.C8159dfC;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1568aGc;
import o.InterfaceC1597aHe;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class ErrorLoggerImpl implements InterfaceC1597aHe {
    public static final b a = new b(null);
    private final ErrorLoggingDataCollectorImpl c;
    private final Context d;
    private final Set<ExternalCrashReporter> e;
    private final InterfaceC1568aGc f;
    private final LoggerConfig j;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface ErrorLoggerModule {
        @Binds
        InterfaceC1597aHe b(ErrorLoggerImpl errorLoggerImpl);
    }

    @Inject
    public ErrorLoggerImpl(@ApplicationContext Context context, LoggerConfig loggerConfig, Set<ExternalCrashReporter> set, ErrorLoggingDataCollectorImpl errorLoggingDataCollectorImpl, InterfaceC1568aGc interfaceC1568aGc) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) loggerConfig, "");
        C8632dsu.c((Object) set, "");
        C8632dsu.c((Object) errorLoggingDataCollectorImpl, "");
        C8632dsu.c((Object) interfaceC1568aGc, "");
        this.d = context;
        this.j = loggerConfig;
        this.e = set;
        this.c = errorLoggingDataCollectorImpl;
        this.f = interfaceC1568aGc;
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("ErrorLoggerImpl");
        }
    }

    @Override // o.InterfaceC1597aHe
    public void d(C1596aHd c1596aHd, Throwable th) {
        C8632dsu.c((Object) c1596aHd, "");
        C8632dsu.c((Object) th, "");
        for (Map.Entry<String, String> entry : c1596aHd.e.entrySet()) {
            entry.getKey();
            entry.getValue();
        }
        if (c1596aHd.c && this.j.c() && !C8159dfC.b()) {
            throw C1607aHo.d.e(c1596aHd);
        }
        c(c1596aHd, th);
        if (!C8067ddQ.c() && !C8159dfC.b()) {
            d(th);
        }
        b(c1596aHd, th);
    }

    private final void c(C1596aHd c1596aHd, Throwable th) {
        C1606aHn b2 = this.j.b(c1596aHd);
        if (b2.b()) {
            try {
                Logger.INSTANCE.logEvent(new ExceptionOccurred(null, C1607aHo.d.d(c1596aHd, th, this.c.c(th), b2).toString()));
            } catch (JSONException unused) {
            }
        }
    }

    private final void d(Throwable th) {
        try {
            this.f.b(this.d, th);
        } catch (Throwable unused) {
        }
    }

    private final void b(C1596aHd c1596aHd, Throwable th) {
        C1606aHn e = this.j.e(c1596aHd);
        if (e.b()) {
            C1607aHo c1607aHo = C1607aHo.d;
            String c = c1607aHo.c(c1596aHd);
            if (this.j.a(c)) {
                return;
            }
            Map<String, String> d = c1607aHo.d(c1596aHd, e, c);
            for (ExternalCrashReporter externalCrashReporter : this.e) {
                externalCrashReporter.b(new ExternalCrashReporter.a(th, d));
            }
        }
    }
}
