package com.netflix.mediaclient.log.impl;

import android.content.Context;
import com.netflix.cl.Logger;
import com.netflix.cl.model.Error;
import com.netflix.cl.model.event.discrete.ExceptionOccurred;
import com.netflix.cl.util.ExtCLUtils;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Inject;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1599aHg;

/* loaded from: classes3.dex */
public final class OutOfMemoryReporterImpl implements InterfaceC1599aHg {
    public static final d c = new d(null);
    private final ErrorLoggingDataCollectorImpl b;
    private final Context e;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface ReporterModule {
        @Binds
        InterfaceC1599aHg b(OutOfMemoryReporterImpl outOfMemoryReporterImpl);
    }

    @Inject
    public OutOfMemoryReporterImpl(@ApplicationContext Context context, ErrorLoggingDataCollectorImpl errorLoggingDataCollectorImpl) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) errorLoggingDataCollectorImpl, "");
        this.e = context;
        this.b = errorLoggingDataCollectorImpl;
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("OutOfMemoryReporterImpl");
        }
    }

    @Override // o.InterfaceC1599aHg
    public void e(OutOfMemoryError outOfMemoryError) {
        C8632dsu.c((Object) outOfMemoryError, "");
        System.gc();
        try {
            Error error = ExtCLUtils.toError("handledException", this.b.c(outOfMemoryError), outOfMemoryError);
            if (error != null) {
                String jSONObject = error.toJSONObject().toString();
                C8632dsu.a(jSONObject, "");
                Logger.INSTANCE.logEvent(new ExceptionOccurred(null, jSONObject));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } catch (Throwable unused) {
        }
    }
}
