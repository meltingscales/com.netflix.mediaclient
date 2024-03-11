package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class zzaq {
    private static zzaq zza;
    private String zzb = null;
    private Boolean zzc = null;
    private Boolean zzd = null;
    private final Queue<Intent> zze = new ArrayDeque();

    public static zzaq zza() {
        zzaq zzaqVar;
        synchronized (zzaq.class) {
            if (zza == null) {
                zza = new zzaq();
            }
            zzaqVar = zza;
        }
        return zzaqVar;
    }

    private zzaq() {
    }

    public final Intent zzb() {
        return this.zze.poll();
    }

    public final int zza(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Starting service");
        }
        this.zze.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return zzb(context, intent2);
    }

    private final int zzb(Context context, Intent intent) {
        ComponentName startService;
        String zzc = zzc(context, intent);
        if (zzc != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", zzc.length() != 0 ? "Restricting intent to a specific service: ".concat(zzc) : new String("Restricting intent to a specific service: "));
            }
            intent.setClassName(context.getPackageName(), zzc);
        }
        try {
            if (zza(context)) {
                startService = zzaw.zza(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
            }
            if (startService == null) {
                Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
                return 404;
            }
            return -1;
        } catch (IllegalStateException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 45);
            sb.append("Failed to start service while in background: ");
            sb.append(valueOf);
            Log.e("FirebaseInstanceId", sb.toString());
            return 402;
        } catch (SecurityException e2) {
            Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e2);
            return 401;
        }
    }

    private final String zzc(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        synchronized (this) {
            String str2 = this.zzb;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        String valueOf = String.valueOf(context.getPackageName());
                        String valueOf2 = String.valueOf(serviceInfo.name);
                        this.zzb = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                    } else {
                        this.zzb = serviceInfo.name;
                    }
                    return this.zzb;
                }
                String str3 = serviceInfo.packageName;
                String str4 = serviceInfo.name;
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 94 + String.valueOf(str4).length());
                sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                sb.append(str3);
                sb.append("/");
                sb.append(str4);
                Log.e("FirebaseInstanceId", sb.toString());
                return null;
            }
            Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(Context context) {
        if (this.zzc == null) {
            this.zzc = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.zzc.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.zzc.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzb(Context context) {
        if (this.zzd == null) {
            this.zzd = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.zzc.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.zzd.booleanValue();
    }
}
