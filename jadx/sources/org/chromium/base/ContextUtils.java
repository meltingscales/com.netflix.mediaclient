package org.chromium.base;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.preference.PreferenceManager;
import org.chromium.base.compat.ApiHelperForO;
import org.chromium.build.BuildConfig;

/* loaded from: classes5.dex */
public class ContextUtils {
    private static Context sApplicationContext;

    /* loaded from: classes6.dex */
    static class Holder {
        private static SharedPreferences sSharedPreferences = ContextUtils.m3198$$Nest$smfetchAppSharedPreferences();
    }

    /* renamed from: -$$Nest$smfetchAppSharedPreferences  reason: not valid java name */
    static /* synthetic */ SharedPreferences m3198$$Nest$smfetchAppSharedPreferences() {
        return fetchAppSharedPreferences();
    }

    public static Context getApplicationContext() {
        return sApplicationContext;
    }

    public static void initApplicationContext(Context context) {
        initJavaSideApplicationContext(context);
    }

    private static SharedPreferences fetchAppSharedPreferences() {
        StrictModeContext allowDiskWrites = StrictModeContext.allowDiskWrites();
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(sApplicationContext);
            if (allowDiskWrites != null) {
                allowDiskWrites.close();
            }
            return defaultSharedPreferences;
        } catch (Throwable th) {
            if (allowDiskWrites != null) {
                try {
                    allowDiskWrites.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static SharedPreferences getAppSharedPreferences() {
        return Holder.sSharedPreferences;
    }

    private static void initJavaSideApplicationContext(Context context) {
        if (BuildConfig.ENABLE_ASSERTS && (context instanceof Application)) {
            context = new ContextWrapper(context);
        }
        sApplicationContext = context;
    }

    public static boolean isSdkSandboxProcess() {
        boolean isSdkSandbox;
        if (Build.VERSION.SDK_INT >= 33) {
            isSdkSandbox = Process.isSdkSandbox();
            return isSdkSandbox;
        }
        return false;
    }

    public static Intent registerProtectedBroadcastReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return registerBroadcastReceiver(context, broadcastReceiver, intentFilter, null, null, 0);
    }

    public static Intent registerNonExportedBroadcastReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return registerBroadcastReceiver(context, broadcastReceiver, intentFilter, null, null, 4);
    }

    private static Intent registerBroadcastReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ApiHelperForO.registerReceiver(context, broadcastReceiver, intentFilter, str, handler, i);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }
}
