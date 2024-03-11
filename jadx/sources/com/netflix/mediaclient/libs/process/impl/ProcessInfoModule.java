package com.netflix.mediaclient.libs.process.impl;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import javax.inject.Singleton;
import o.C8632dsu;
import o.aGR;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public final class ProcessInfoModule {
    @Provides
    @Singleton
    public final String e(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        return aGR.b.b(context);
    }

    @Provides
    @IntoSet
    public final String b(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        String packageName = context.getPackageName();
        C8632dsu.a(packageName, "");
        return packageName;
    }
}
