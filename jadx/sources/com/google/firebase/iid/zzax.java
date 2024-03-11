package com.google.firebase.iid;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzax {
    private int zza = 0;
    private final Map<Integer, TaskCompletionSource<Void>> zzb = new ArrayMap();
    private final zzat zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzax(zzat zzatVar) {
        this.zzc = zzatVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza() {
        String zzb;
        synchronized (this) {
            zzb = zzb();
        }
        return zzb != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (com.google.firebase.iid.FirebaseInstanceId.zzd() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
        android.util.Log.d("FirebaseInstanceId", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(com.google.firebase.iid.FirebaseInstanceId r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            java.lang.String r0 = r4.zzb()     // Catch: java.lang.Throwable -> L42
            r1 = 1
            if (r0 != 0) goto L17
            boolean r5 = com.google.firebase.iid.FirebaseInstanceId.zzd()     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L15
            java.lang.String r5 = "FirebaseInstanceId"
            java.lang.String r0 = "topic sync succeeded"
            android.util.Log.d(r5, r0)     // Catch: java.lang.Throwable -> L42
        L15:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            return r1
        L17:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            boolean r2 = zza(r5, r0)
            if (r2 != 0) goto L20
            r5 = 0
            return r5
        L20:
            monitor-enter(r4)
            java.util.Map<java.lang.Integer, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>> r2 = r4.zzb     // Catch: java.lang.Throwable -> L3f
            int r3 = r4.zza     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r2 = r2.remove(r3)     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.tasks.TaskCompletionSource r2 = (com.google.android.gms.tasks.TaskCompletionSource) r2     // Catch: java.lang.Throwable -> L3f
            r4.zzb(r0)     // Catch: java.lang.Throwable -> L3f
            int r0 = r4.zza     // Catch: java.lang.Throwable -> L3f
            int r0 = r0 + r1
            r4.zza = r0     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L0
            r0 = 0
            r2.setResult(r0)
            goto L0
        L3f:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3f
            throw r5
        L42:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.zzax.zza(com.google.firebase.iid.FirebaseInstanceId):boolean");
    }

    private final String zzb() {
        String zza;
        synchronized (this.zzc) {
            zza = this.zzc.zza();
        }
        if (TextUtils.isEmpty(zza)) {
            return null;
        }
        String[] split = zza.split(",");
        if (split.length <= 1 || TextUtils.isEmpty(split[1])) {
            return null;
        }
        return split[1];
    }

    private final boolean zzb(String str) {
        synchronized (this) {
            synchronized (this.zzc) {
                String zza = this.zzc.zza();
                String valueOf = String.valueOf(str);
                if (zza.startsWith(valueOf.length() != 0 ? ",".concat(valueOf) : new String(","))) {
                    String valueOf2 = String.valueOf(str);
                    this.zzc.zza(zza.substring((valueOf2.length() != 0 ? ",".concat(valueOf2) : new String(",")).length()));
                    return true;
                }
                return false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048 A[Catch: IOException -> 0x0057, TryCatch #0 {IOException -> 0x0057, blocks: (B:5:0x0012, B:20:0x0039, B:22:0x0042, B:23:0x0048, B:25:0x0051, B:10:0x001f, B:13:0x0029), top: B:41:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean zza(com.google.firebase.iid.FirebaseInstanceId r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r1 = "!"
            java.lang.String[] r7 = r7.split(r1)
            int r1 = r7.length
            r2 = 2
            r3 = 1
            if (r1 != r2) goto La6
            r1 = 0
            r2 = r7[r1]
            r7 = r7[r3]
            int r4 = r2.hashCode()     // Catch: java.io.IOException -> L57
            r5 = 83
            if (r4 == r5) goto L29
            r5 = 85
            if (r4 == r5) goto L1f
            goto L33
        L1f:
            java.lang.String r4 = "U"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L57
            if (r2 == 0) goto L33
            r2 = r3
            goto L34
        L29:
            java.lang.String r4 = "S"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L57
            if (r2 == 0) goto L33
            r2 = r1
            goto L34
        L33:
            r2 = -1
        L34:
            if (r2 == 0) goto L48
            if (r2 == r3) goto L39
            goto La6
        L39:
            r6.zzc(r7)     // Catch: java.io.IOException -> L57
            boolean r6 = com.google.firebase.iid.FirebaseInstanceId.zzd()     // Catch: java.io.IOException -> L57
            if (r6 == 0) goto La6
            java.lang.String r6 = "unsubscribe operation succeeded"
            android.util.Log.d(r0, r6)     // Catch: java.io.IOException -> L57
            goto La6
        L48:
            r6.zzb(r7)     // Catch: java.io.IOException -> L57
            boolean r6 = com.google.firebase.iid.FirebaseInstanceId.zzd()     // Catch: java.io.IOException -> L57
            if (r6 == 0) goto La6
            java.lang.String r6 = "subscribe operation succeeded"
            android.util.Log.d(r0, r6)     // Catch: java.io.IOException -> L57
            goto La6
        L57:
            r6 = move-exception
            java.lang.String r7 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r2 = r6.getMessage()
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L7e
            java.lang.String r7 = "INTERNAL_SERVER_ERROR"
            java.lang.String r2 = r6.getMessage()
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L71
            goto L7e
        L71:
            java.lang.String r7 = r6.getMessage()
            if (r7 != 0) goto L7d
            java.lang.String r6 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r0, r6)
            return r1
        L7d:
            throw r6
        L7e:
            java.lang.String r6 = r6.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = java.lang.String.valueOf(r6)
            int r2 = r2.length()
            int r2 = r2 + 53
            r7.<init>(r2)
            java.lang.String r2 = "Topic operation failed: "
            r7.append(r2)
            r7.append(r6)
            java.lang.String r6 = ". Will retry Topic operation."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.e(r0, r6)
            return r1
        La6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.zzax.zza(com.google.firebase.iid.FirebaseInstanceId, java.lang.String):boolean");
    }
}
