package com.netflix.common.di;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import o.C8632dsu;
import o.GF;
import o.GH;
import o.dwQ;
import o.dwU;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes2.dex */
public final class CoroutinesModule {
    @Provides
    public final dwQ b(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        return GF.e.d(context);
    }

    @Provides
    public final dwQ e(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        return GF.e.a(context);
    }

    @Provides
    public final dwQ a(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        return GF.e.e(context);
    }

    @Provides
    public final dwU d(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        return GH.b.b(context);
    }
}
