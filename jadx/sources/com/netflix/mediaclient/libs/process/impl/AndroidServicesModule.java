package com.netflix.mediaclient.libs.process.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.UserManager;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;
import o.C8632dsu;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public final class AndroidServicesModule {
    @Provides
    @Singleton
    public final UserManager c(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        Object systemService = context.getSystemService("user");
        C8632dsu.d(systemService);
        return (UserManager) systemService;
    }

    @Provides
    @Singleton
    public final PackageManager b(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        PackageManager packageManager = context.getPackageManager();
        C8632dsu.a(packageManager, "");
        return packageManager;
    }
}
