package com.netflix.mediaclient.log.impl;

import android.content.Context;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.util.Map;
import javax.inject.Inject;
import o.C8632dsu;
import o.InterfaceC1593aHa;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* loaded from: classes3.dex */
public final class LoggingRegistrationImpl implements InterfaceC1601aHi {
    private final InterfaceC1593aHa a;
    private final InterfaceC1597aHe b;
    private final NetflixCrashReporterImpl d;
    private final ErrorLoggingDataCollectorImpl e;
    private final InterfaceC1598aHf h;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface RegistrationModule {
        @Binds
        InterfaceC1601aHi e(LoggingRegistrationImpl loggingRegistrationImpl);
    }

    @Inject
    public LoggingRegistrationImpl(InterfaceC1598aHf interfaceC1598aHf, InterfaceC1597aHe interfaceC1597aHe, InterfaceC1593aHa interfaceC1593aHa, NetflixCrashReporterImpl netflixCrashReporterImpl, ErrorLoggingDataCollectorImpl errorLoggingDataCollectorImpl) {
        C8632dsu.c((Object) interfaceC1598aHf, "");
        C8632dsu.c((Object) interfaceC1597aHe, "");
        C8632dsu.c((Object) interfaceC1593aHa, "");
        C8632dsu.c((Object) netflixCrashReporterImpl, "");
        C8632dsu.c((Object) errorLoggingDataCollectorImpl, "");
        this.h = interfaceC1598aHf;
        this.b = interfaceC1597aHe;
        this.a = interfaceC1593aHa;
        this.d = netflixCrashReporterImpl;
        this.e = errorLoggingDataCollectorImpl;
    }

    @Override // o.InterfaceC1601aHi
    public void e(Context context, Map<String, String> map) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) map, "");
        InterfaceC1601aHi.c.a(this.h, this.b, this.a, ConfigFastPropertyFeatureControlConfig.Companion.n().isCatchAllBugsnagLoggingEnabled());
        this.d.e();
        this.e.b(map);
    }
}
