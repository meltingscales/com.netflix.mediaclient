package com.netflix.mediaclient.libs.process.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;
import o.C8632dsu;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public final class PackageInfoModule {
    @Provides
    @Singleton
    public final PackageInfo d(@ApplicationContext Context context, PackageManager packageManager) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) packageManager, "");
        PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
        C8632dsu.a(packageInfo, "");
        return packageInfo;
    }

    @Provides
    @Reusable
    public final long b(PackageInfo packageInfo) {
        long longVersionCode;
        C8632dsu.c((Object) packageInfo, "");
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            return longVersionCode;
        }
        return packageInfo.versionCode;
    }
}
