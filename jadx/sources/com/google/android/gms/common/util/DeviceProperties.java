package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.common.proguard.SideEffectFree;
import com.google.android.gms.common.GooglePlayServicesUtilLight;

/* loaded from: classes2.dex */
public final class DeviceProperties {
    private static Boolean zze;
    private static Boolean zzf;
    private static Boolean zzh;
    private static Boolean zzj;

    public static boolean isAuto(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (zzj == null) {
            zzj = Boolean.valueOf(PlatformVersion.isAtLeastO() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        return zzj.booleanValue();
    }

    @TargetApi(21)
    public static boolean isSidewinder(Context context) {
        return zza(context);
    }

    public static boolean isUserBuild() {
        int i = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return "user".equals(Build.TYPE);
    }

    @SideEffectFree
    @TargetApi(20)
    public static boolean isWearable(Context context) {
        return zzd(context.getPackageManager());
    }

    @TargetApi(26)
    public static boolean isWearableWithoutPlayStore(Context context) {
        if (!isWearable(context) || PlatformVersion.isAtLeastN()) {
            if (zza(context)) {
                return !PlatformVersion.isAtLeastO() || PlatformVersion.isAtLeastR();
            }
            return false;
        }
        return true;
    }

    @TargetApi(21)
    public static boolean zza(Context context) {
        if (zzf == null) {
            zzf = Boolean.valueOf(PlatformVersion.isAtLeastLollipop() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return zzf.booleanValue();
    }

    public static boolean zzb(Context context) {
        if (zzh == null) {
            zzh = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return zzh.booleanValue();
    }

    @SideEffectFree
    @TargetApi(20)
    public static boolean zzd(PackageManager packageManager) {
        if (zze == null) {
            zze = Boolean.valueOf(PlatformVersion.isAtLeastKitKatWatch() && packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return zze.booleanValue();
    }
}
