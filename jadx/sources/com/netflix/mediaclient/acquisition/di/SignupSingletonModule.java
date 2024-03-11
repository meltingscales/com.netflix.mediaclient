package com.netflix.mediaclient.acquisition.di;

import android.content.Context;
import com.netflix.mediaclient.acquisition.StringKeyMapping;
import com.netflix.mediaclient.acquisition.lib.AcquisitionStringMapping;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import java.util.Map;
import javax.inject.Named;
import o.C1814aPf;
import o.C8632dsu;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes3.dex */
public final class SignupSingletonModule {
    public static final int $stable = 0;

    @Provides
    @AcquisitionStringMapping
    public final Map<String, Integer> providesStringMapping() {
        return StringKeyMapping.INSTANCE.getKeyResourceMap();
    }

    @Provides
    @Named("webViewBaseUrl")
    public final String providesWebViewBaseUrl(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        return C1814aPf.b(context);
    }
}
