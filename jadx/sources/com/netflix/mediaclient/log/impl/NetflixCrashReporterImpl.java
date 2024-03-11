package com.netflix.mediaclient.log.impl;

import android.content.Context;
import android.os.DeadSystemException;
import com.netflix.cl.Logger;
import com.netflix.cl.model.Error;
import com.netflix.cl.model.event.discrete.LastAppCrashed;
import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.service.logging.logblob.StartupErrorTracker;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import java.lang.Thread;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.C1045Mp;
import o.C8157dfA;
import o.C8159dfC;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1602aHj;
import o.aUG;
import org.json.JSONObject;

@Singleton
/* loaded from: classes3.dex */
public final class NetflixCrashReporterImpl implements InterfaceC1602aHj, Thread.UncaughtExceptionHandler {
    public static final c b = new c(null);
    private Thread.UncaughtExceptionHandler a;
    private final Context c;
    private final LoggerConfig d;
    private final ErrorLoggingDataCollectorImpl e;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface ReporterModule {
        @Binds
        InterfaceC1602aHj b(NetflixCrashReporterImpl netflixCrashReporterImpl);
    }

    @Inject
    public NetflixCrashReporterImpl(@ApplicationContext Context context, ErrorLoggingDataCollectorImpl errorLoggingDataCollectorImpl, LoggerConfig loggerConfig) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) errorLoggingDataCollectorImpl, "");
        C8632dsu.c((Object) loggerConfig, "");
        this.c = context;
        this.e = errorLoggingDataCollectorImpl;
        this.d = loggerConfig;
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("NetflixCrashReporterImpl");
        }
    }

    @Override // o.InterfaceC1602aHj
    public void d() {
        boolean c2;
        String b2;
        try {
            String d = C8157dfA.d(this.c);
            if (d != null) {
                Logger.INSTANCE.logEvent(new LastAppCrashed(new JSONObject(d).getJSONObject("clv2").toString()));
            }
            if (!ConfigFastPropertyFeatureControlConfig.Companion.h() || (b2 = C8157dfA.b(this.c)) == null) {
                return;
            }
            C8159dfC.c(new aUG(new JSONObject(b2)));
        } finally {
            if (!c2) {
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        C8632dsu.c((Object) thread, "");
        C8632dsu.c((Object) th, "");
        if (this.d.e() && b(th)) {
            return;
        }
        StartupErrorTracker.a(th);
        Error error = ExtCLUtils.toError("unhandledException", this.e.d(th), th);
        JSONObject jSONObject = new JSONObject();
        if (error != null) {
            jSONObject.put("clv2", error.toJSONObject());
            String jSONObject2 = jSONObject.toString();
            C8632dsu.a(jSONObject2, "");
            C8157dfA.e.i(this.c);
            JSONObject a = aUG.d.a(th);
            C8157dfA.a(this.c, a != null ? a.toString() : null);
            C8157dfA.d(this.c, jSONObject2);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final boolean b(Throwable th) {
        return th instanceof DeadSystemException;
    }

    public final void e() {
        b.getLogTag();
        this.a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }
}
