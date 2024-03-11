package com.netflix.mediaclient.log.impl;

import android.content.Context;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.discrete.ExceptionOccurred;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import java.util.Map;
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
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class MonitoringLoggerImpl implements InterfaceC1598aHf {
    public static final b d = new b(null);
    private final ErrorLoggingDataCollectorImpl b;
    private final Context c;
    private final InterfaceC1568aGc e;
    private final LoggerConfig f;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface MonitoringLoggerModule {
        @Binds
        InterfaceC1598aHf b(MonitoringLoggerImpl monitoringLoggerImpl);
    }

    @Inject
    public MonitoringLoggerImpl(@ApplicationContext Context context, LoggerConfig loggerConfig, ErrorLoggingDataCollectorImpl errorLoggingDataCollectorImpl, InterfaceC1568aGc interfaceC1568aGc) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) loggerConfig, "");
        C8632dsu.c((Object) errorLoggingDataCollectorImpl, "");
        C8632dsu.c((Object) interfaceC1568aGc, "");
        this.c = context;
        this.f = loggerConfig;
        this.b = errorLoggingDataCollectorImpl;
        this.e = interfaceC1568aGc;
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("MonitoringLoggerImpl");
        }
    }

    @Override // o.InterfaceC1598aHf
    public void e(C1596aHd c1596aHd, Throwable th) {
        C8632dsu.c((Object) c1596aHd, "");
        C8632dsu.c((Object) th, "");
        for (Map.Entry<String, String> entry : c1596aHd.e.entrySet()) {
            InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
            aVar.a("additional data: " + entry.getKey() + ", " + entry.getValue());
        }
        if (c1596aHd.c && this.f.c() && !C8159dfC.b()) {
            throw C1607aHo.d.e(c1596aHd);
        }
        b(c1596aHd, th);
        if (C8067ddQ.c() || C8159dfC.b()) {
            return;
        }
        e(th);
    }

    private final void b(C1596aHd c1596aHd, Throwable th) {
        C1606aHn a = this.f.a(c1596aHd);
        if (a.b()) {
            try {
                Logger.INSTANCE.logEvent(new ExceptionOccurred(null, C1607aHo.d.d(c1596aHd, th, this.b.c(th), a).toString()));
            } catch (JSONException unused) {
            }
        }
    }

    private final void e(Throwable th) {
        try {
            this.e.b(this.c, th);
        } catch (Throwable unused) {
        }
    }
}
