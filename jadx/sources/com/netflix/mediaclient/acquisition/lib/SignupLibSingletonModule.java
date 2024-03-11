package com.netflix.mediaclient.acquisition.lib;

import android.content.Context;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.mediaclient.acquisition.lib.services.logging.ClientNetworkDetails;
import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import java.util.Map;
import javax.inject.Named;
import o.C8632dsu;
import o.dqE;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes3.dex */
public final class SignupLibSingletonModule {
    @Provides
    public final ClientNetworkDetails providesClientNetworkDetails(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        return ClientNetworkDetails.Companion.newInstance(context);
    }

    @Provides
    public final Logger providesClLogger() {
        return Logger.INSTANCE;
    }

    @Provides
    public final ExtLogger providesExtClLogger() {
        return ExtLogger.INSTANCE;
    }

    @Provides
    @Reusable
    @Named("MultiModuleStringMapping")
    public final Map<String, Integer> providesMultiModuleStringMapping(@AcquisitionLibStringMapping Map<String, Integer> map, @AcquisitionStringMapping Map<String, Integer> map2, @CfourStringMapping Map<String, Integer> map3) {
        Map e;
        Map<String, Integer> e2;
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) map2, "");
        C8632dsu.c((Object) map3, "");
        e = dqE.e((Map) map, (Map) map2);
        e2 = dqE.e(e, (Map) map3);
        return e2;
    }
}
