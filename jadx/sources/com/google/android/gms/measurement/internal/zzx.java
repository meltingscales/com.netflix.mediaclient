package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import o.C9584sQ;

/* loaded from: classes5.dex */
public final class zzx extends zzgr {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int a = 0;
    private static char[] a$s58$434 = {12888};
    private static int e = 1;
    private Boolean zza;
    private zzz zzb;
    private Boolean zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzx(zzga zzgaVar) {
        super(zzgaVar);
        this.zzb = zzaa.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzz zzzVar) {
        int i = 2 % 2;
        int i2 = a + 47;
        int i3 = i2 % 128;
        e = i3;
        int i4 = i2 % 2;
        this.zzb = zzzVar;
        int i5 = i3 + 41;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final int zza(String str) {
        int i = 2 % 2;
        int i2 = e + 7;
        a = i2 % 128;
        int i3 = i2 % 2;
        int zzb = zzb(str, zzap.zzo);
        int i4 = a + 55;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            return zzb;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long zze() {
        int i = 2 % 2;
        int i2 = a + 49;
        e = i2 % 128;
        int i3 = i2 % 2;
        zzu();
        int i4 = a + 113;
        e = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return 19000L;
    }

    public final boolean zzf() {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    ApplicationInfo applicationInfo = zzn().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.zzc = Boolean.valueOf(str != null && str.equals(myProcessName));
                    }
                    if (this.zzc == null) {
                        this.zzc = Boolean.TRUE;
                        zzr().zzf().zza("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzc.booleanValue();
    }

    public final long zza(String str, zzel<Long> zzelVar) {
        int i = 2 % 2;
        Object obj = null;
        if (str == null) {
            long longValue = zzelVar.zza(null).longValue();
            int i2 = a + 61;
            e = i2 % 128;
            if (i2 % 2 != 0) {
                return longValue;
            }
            obj.hashCode();
            throw null;
        }
        String zza = this.zzb.zza(str, zzelVar.zza());
        if (TextUtils.isEmpty(zza)) {
            return zzelVar.zza(null).longValue();
        }
        try {
            long longValue2 = zzelVar.zza(Long.valueOf(Long.parseLong(zza))).longValue();
            int i3 = e + 125;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                return longValue2;
            }
            throw null;
        } catch (NumberFormatException unused) {
            return zzelVar.zza(null).longValue();
        }
    }

    public final int zzb(String str, zzel<Integer> zzelVar) {
        int i = 2 % 2;
        int i2 = e + 73;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        } else if (str == null) {
            return zzelVar.zza(null).intValue();
        } else {
            String zza = this.zzb.zza(str, zzelVar.zza());
            if (!(!TextUtils.isEmpty(zza))) {
                int i3 = e + 47;
                a = i3 % 128;
                int i4 = i3 % 2;
                int intValue = zzelVar.zza(null).intValue();
                int i5 = a + 33;
                e = i5 % 128;
                int i6 = i5 % 2;
                return intValue;
            }
            try {
                return zzelVar.zza(Integer.valueOf(Integer.parseInt(zza))).intValue();
            } catch (NumberFormatException unused) {
                return zzelVar.zza(null).intValue();
            }
        }
    }

    public final double zzc(String str, zzel<Double> zzelVar) {
        int i = 2 % 2;
        Object obj = null;
        if (str == null) {
            return zzelVar.zza(null).doubleValue();
        }
        String zza = this.zzb.zza(str, zzelVar.zza());
        if (!TextUtils.isEmpty(zza)) {
            try {
                return zzelVar.zza(Double.valueOf(Double.parseDouble(zza))).doubleValue();
            } catch (NumberFormatException unused) {
                return zzelVar.zza(null).doubleValue();
            }
        }
        int i2 = a + 97;
        e = i2 % 128;
        if (i2 % 2 == 0) {
            zzelVar.zza(null).doubleValue();
            obj.hashCode();
            throw null;
        }
        double doubleValue = zzelVar.zza(null).doubleValue();
        int i3 = a + 113;
        e = i3 % 128;
        int i4 = i3 % 2;
        return doubleValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
        r5 = r4.zzb.zza(r5, r6.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
        if (android.text.TextUtils.isEmpty(r5) == true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        r5 = r6.zza(java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(r5))).booleanValue();
        r6 = com.google.android.gms.measurement.internal.zzx.e + 51;
        com.google.android.gms.measurement.internal.zzx.a = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
        return r6.zza(null).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r5 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r5 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        r5 = r6.zza(null).booleanValue();
        r6 = com.google.android.gms.measurement.internal.zzx.a + 7;
        com.google.android.gms.measurement.internal.zzx.e = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzd(java.lang.String r5, com.google.android.gms.measurement.internal.zzel<java.lang.Boolean> r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.measurement.internal.zzx.e
            int r1 = r1 + 67
            int r2 = r1 % 128
            com.google.android.gms.measurement.internal.zzx.a = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L16
            r1 = 40
            int r1 = r1 / 0
            if (r5 != 0) goto L2c
            goto L18
        L16:
            if (r5 != 0) goto L2c
        L18:
            java.lang.Object r5 = r6.zza(r2)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            int r6 = com.google.android.gms.measurement.internal.zzx.a
            int r6 = r6 + 7
            int r1 = r6 % 128
            com.google.android.gms.measurement.internal.zzx.e = r1
            int r6 = r6 % r0
            return r5
        L2c:
            com.google.android.gms.measurement.internal.zzz r1 = r4.zzb
            java.lang.String r3 = r6.zza()
            java.lang.String r5 = r1.zza(r5, r3)
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            r3 = 1
            if (r1 == r3) goto L59
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            java.lang.Object r5 = r6.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            int r6 = com.google.android.gms.measurement.internal.zzx.e
            int r6 = r6 + 51
            int r1 = r6 % 128
            com.google.android.gms.measurement.internal.zzx.a = r1
            int r6 = r6 % r0
            return r5
        L59:
            java.lang.Object r5 = r6.zza(r2)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzd(java.lang.String, com.google.android.gms.measurement.internal.zzel):boolean");
    }

    public final boolean zze(String str, zzel<Boolean> zzelVar) {
        int i = 2 % 2;
        int i2 = e + 109;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            boolean zzd = zzd(str, zzelVar);
            int i3 = e + 19;
            a = i3 % 128;
            int i4 = i3 % 2;
            return zzd;
        }
        zzd(str, zzelVar);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean zza(zzel<Boolean> zzelVar) {
        int i = 2 % 2;
        int i2 = a + 9;
        e = i2 % 128;
        int i3 = i2 % 2;
        boolean zzd = zzd(null, zzelVar);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        return zzd;
    }

    @VisibleForTesting
    private final Bundle zzy() {
        int i = 2 % 2;
        int i2 = a + 21;
        e = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (zzn().getPackageManager() == null) {
                int i4 = e + 75;
                a = i4 % 128;
                int i5 = i4 % 2;
                zzr().zzf().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(zzn()).getApplicationInfo(zzn().getPackageName(), 128);
            if (applicationInfo == null) {
                zzr().zzf().zza("Failed to load metadata: ApplicationInfo is null");
                int i6 = a + 67;
                e = i6 % 128;
                if (i6 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            Bundle bundle = applicationInfo.metaData;
            int i7 = e + 117;
            a = i7 % 128;
            int i8 = i7 % 2;
            return bundle;
        } catch (PackageManager.NameNotFoundException e2) {
            zzr().zzf().zza("Failed to load metadata: Package name not found", e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final Boolean zzb(String str) {
        int i = 2 % 2;
        int i2 = a + 25;
        e = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Preconditions.checkNotEmpty(str);
            zzy();
            obj.hashCode();
            throw null;
        }
        Preconditions.checkNotEmpty(str);
        Bundle zzy = zzy();
        if (zzy != null) {
            if (zzy.containsKey(str)) {
                return Boolean.valueOf(zzy.getBoolean(str));
            }
            int i3 = a + 117;
            e = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        zzr().zzf().zza("Failed to load metadata: Metadata bundle is null");
        int i5 = a + 27;
        e = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> zzc(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)
            android.os.Bundle r1 = r4.zzy()
            r2 = 0
            if (r1 != 0) goto L1b
            com.google.android.gms.measurement.internal.zzew r5 = r4.zzr()
            com.google.android.gms.measurement.internal.zzey r5 = r5.zzf()
            java.lang.String r1 = "Failed to load metadata: Metadata bundle is null"
            r5.zza(r1)
            goto L21
        L1b:
            boolean r3 = r1.containsKey(r5)
            if (r3 != 0) goto L23
        L21:
            r5 = r2
            goto L2b
        L23:
            int r5 = r1.getInt(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L2b:
            if (r5 != 0) goto L3a
            int r5 = com.google.android.gms.measurement.internal.zzx.a
            int r5 = r5 + 33
            int r1 = r5 % 128
            com.google.android.gms.measurement.internal.zzx.e = r1
            int r5 = r5 % r0
            if (r5 == 0) goto L39
            return r2
        L39:
            throw r2
        L3a:
            android.content.Context r1 = r4.zzn()     // Catch: android.content.res.Resources.NotFoundException -> L67
            android.content.res.Resources r1 = r1.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L67
            int r5 = r5.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L67
            java.lang.String[] r5 = r1.getStringArray(r5)     // Catch: android.content.res.Resources.NotFoundException -> L67
            if (r5 != 0) goto L59
            int r5 = com.google.android.gms.measurement.internal.zzx.e
            int r5 = r5 + 111
            int r1 = r5 % 128
            com.google.android.gms.measurement.internal.zzx.a = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L58
            return r2
        L58:
            throw r2
        L59:
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: android.content.res.Resources.NotFoundException -> L67
            int r1 = com.google.android.gms.measurement.internal.zzx.e
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.google.android.gms.measurement.internal.zzx.a = r2
            int r1 = r1 % r0
            return r5
        L67:
            r5 = move-exception
            com.google.android.gms.measurement.internal.zzew r0 = r4.zzr()
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzf()
            java.lang.String r1 = "Failed to load string array from metadata: resource not found"
            r0.zza(r1, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzc(java.lang.String):java.util.List");
    }

    public final boolean zzg() {
        int i = 2 % 2;
        int i2 = a + 113;
        e = i2 % 128;
        int i3 = i2 % 2;
        zzu();
        Boolean zzb = zzb("firebase_analytics_collection_deactivated");
        if (zzb != null) {
            int i4 = a + 69;
            e = i4 % 128;
            int i5 = i4 % 2;
            return !(zzb.booleanValue() ^ true);
        }
        return false;
    }

    public final Boolean zzh() {
        Boolean zzb;
        int i = 2 % 2;
        int i2 = a + 69;
        e = i2 % 128;
        if (i2 % 2 == 0) {
            zzu();
            zzb = zzb("firebase_analytics_collection_enabled");
            int i3 = 27 / 0;
        } else {
            zzu();
            zzb = zzb("firebase_analytics_collection_enabled");
        }
        int i4 = a + 39;
        e = i4 % 128;
        int i5 = i4 % 2;
        return zzb;
    }

    public final Boolean zzi() {
        boolean z;
        int i = 2 % 2;
        zzb();
        Boolean zzb = zzb("google_analytics_adid_collection_enabled");
        if (zzb != null) {
            int i2 = e + 113;
            a = i2 % 128;
            int i3 = i2 % 2;
            if (!zzb.booleanValue()) {
                z = false;
                return Boolean.valueOf(z);
            }
        }
        int i4 = e + 125;
        a = i4 % 128;
        int i5 = i4 % 2;
        z = true;
        return Boolean.valueOf(z);
    }

    public static long zzj() {
        int i = 2 % 2;
        int i2 = a + 83;
        e = i2 % 128;
        int i3 = i2 % 2;
        long longValue = zzap.zzad.zza(null).longValue();
        int i4 = a + 21;
        e = i4 % 128;
        int i5 = i4 % 2;
        return longValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
        if ((!android.text.TextUtils.isEmpty(r2)) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zza(com.google.android.gms.measurement.internal.zzg r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r2 = r7.zze()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 0
            if (r3 == 0) goto L66
            int r2 = com.google.android.gms.measurement.internal.zzx.a
            int r2 = r2 + 1
            int r3 = r2 % 128
            com.google.android.gms.measurement.internal.zzx.e = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L5f
            boolean r2 = com.google.android.gms.internal.measurement.zzle.zzb()
            if (r2 == 0) goto L5a
            int r2 = com.google.android.gms.measurement.internal.zzx.e
            int r2 = r2 + 99
            int r3 = r2 % 128
            com.google.android.gms.measurement.internal.zzx.a = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L4c
            com.google.android.gms.measurement.internal.zzx r2 = r6.zzt()
            java.lang.String r3 = r7.zzc()
            com.google.android.gms.measurement.internal.zzel<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.zzap.zzcc
            boolean r2 = r2.zzd(r3, r5)
            if (r2 == 0) goto L5a
            java.lang.String r2 = r7.zzg()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r3 = r3 ^ 1
            if (r3 == 0) goto L5a
            goto L66
        L4c:
            com.google.android.gms.measurement.internal.zzx r0 = r6.zzt()
            java.lang.String r7 = r7.zzc()
            com.google.android.gms.measurement.internal.zzel<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzap.zzcc
            r0.zzd(r7, r1)
            throw r4
        L5a:
            java.lang.String r2 = r7.zzf()
            goto L66
        L5f:
            com.google.android.gms.internal.measurement.zzle.zzb()
            r4.hashCode()
            throw r4
        L66:
            com.google.android.gms.measurement.internal.zzel<java.lang.String> r3 = com.google.android.gms.measurement.internal.zzap.zze
            java.lang.Object r3 = r3.zza(r4)
            java.lang.String r3 = (java.lang.String) r3
            android.net.Uri$Builder r3 = r1.scheme(r3)
            com.google.android.gms.measurement.internal.zzel<java.lang.String> r5 = com.google.android.gms.measurement.internal.zzap.zzf
            java.lang.Object r4 = r5.zza(r4)
            java.lang.String r4 = (java.lang.String) r4
            android.net.Uri$Builder r3 = r3.encodedAuthority(r4)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r4 = r2.length()
            java.lang.String r5 = "config/app/"
            if (r4 == 0) goto L8f
            java.lang.String r2 = r5.concat(r2)
            goto L94
        L8f:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r5)
        L94:
            android.net.Uri$Builder r2 = r3.path(r2)
            java.lang.String r3 = "app_instance_id"
            java.lang.String r7 = r7.zzd()
            android.net.Uri$Builder r7 = r2.appendQueryParameter(r3, r7)
            java.lang.String r2 = "platform"
            java.lang.String r3 = "android"
            android.net.Uri$Builder r7 = r7.appendQueryParameter(r2, r3)
            java.lang.String r2 = "gmp_version"
            long r3 = r6.zze()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r7.appendQueryParameter(r2, r3)
            android.net.Uri r7 = r1.build()
            java.lang.String r7 = r7.toString()
            int r1 = com.google.android.gms.measurement.internal.zzx.e
            int r1 = r1 + 51
            int r2 = r1 % 128
            com.google.android.gms.measurement.internal.zzx.a = r2
            int r1 = r1 % r0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zza(com.google.android.gms.measurement.internal.zzg):java.lang.String");
    }

    public static long zzk() {
        int i = 2 % 2;
        int i2 = a + 87;
        e = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return zzap.zzd.zza(null).longValue();
        }
        zzap.zzd.zza(null).longValue();
        obj.hashCode();
        throw null;
    }

    public final String zzv() {
        int i = 2 % 2;
        int i2 = a + 97;
        e = i2 % 128;
        int i3 = i2 % 2;
        String zza = zza("debug.firebase.analytics.app", "");
        int i4 = a + 33;
        e = i4 % 128;
        int i5 = i4 % 2;
        return zza;
    }

    public final String zzw() {
        int i = 2 % 2;
        int i2 = e + 67;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            zza("debug.deferred.deeplink", "");
            throw null;
        }
        String zza = zza("debug.deferred.deeplink", "");
        int i3 = e + 103;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return zza;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String zza(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.measurement.internal.zzx.a
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.google.android.gms.measurement.internal.zzx.e = r2
            int r1 = r1 % r0
            r1 = 0
            java.lang.String r2 = "android.os.SystemProperties"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L30 java.lang.IllegalAccessException -> L3f java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L5d
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L30 java.lang.IllegalAccessException -> L3f java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L5d
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L30 java.lang.IllegalAccessException -> L3f java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L5d
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 1
            r3[r5] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L30 java.lang.IllegalAccessException -> L3f java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L5d
            java.lang.String r4 = "get"
            java.lang.reflect.Method r2 = r2.getMethod(r4, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L30 java.lang.IllegalAccessException -> L3f java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L5d
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r8}     // Catch: java.lang.reflect.InvocationTargetException -> L30 java.lang.IllegalAccessException -> L3f java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L5d
            java.lang.Object r7 = r2.invoke(r1, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L30 java.lang.IllegalAccessException -> L3f java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L5d
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.reflect.InvocationTargetException -> L30 java.lang.IllegalAccessException -> L3f java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L5d
            return r7
        L30:
            r7 = move-exception
            com.google.android.gms.measurement.internal.zzew r2 = r6.zzr()
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzf()
            java.lang.String r3 = "SystemProperties.get() threw an exception"
            r2.zza(r3, r7)
            goto L6b
        L3f:
            r7 = move-exception
            com.google.android.gms.measurement.internal.zzew r2 = r6.zzr()
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzf()
            java.lang.String r3 = "Could not access SystemProperties.get()"
            r2.zza(r3, r7)
            goto L6b
        L4e:
            r7 = move-exception
            com.google.android.gms.measurement.internal.zzew r2 = r6.zzr()
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzf()
            java.lang.String r3 = "Could not find SystemProperties.get() method"
            r2.zza(r3, r7)
            goto L6b
        L5d:
            r7 = move-exception
            com.google.android.gms.measurement.internal.zzew r2 = r6.zzr()
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzf()
            java.lang.String r3 = "Could not find SystemProperties class"
            r2.zza(r3, r7)
        L6b:
            int r7 = com.google.android.gms.measurement.internal.zzx.e
            int r7 = r7 + 115
            int r2 = r7 % 128
            com.google.android.gms.measurement.internal.zzx.a = r2
            int r7 = r7 % r0
            if (r7 != 0) goto L77
            return r8
        L77:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zza(java.lang.String, java.lang.String):java.lang.String");
    }

    public final boolean zzd(String str) {
        zzz zzzVar;
        Object obj;
        int i = 2 % 2;
        int i2 = e + 89;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            zzzVar = this.zzb;
            Object[] objArr = new Object[1];
            b(false, new byte[]{1}, new int[]{0, 1, 178, 0}, objArr);
            obj = objArr[0];
        } else {
            zzzVar = this.zzb;
            Object[] objArr2 = new Object[1];
            b(false, new byte[]{1}, new int[]{0, 1, 178, 0}, objArr2);
            obj = objArr2[0];
        }
        boolean equals = ((String) obj).intern().equals(zzzVar.zza(str, "gaia_collection_enabled"));
        int i3 = e + 21;
        a = i3 % 128;
        int i4 = i3 % 2;
        return equals;
    }

    public final boolean zze(String str) {
        zzz zzzVar;
        Object obj;
        int i = 2 % 2;
        int i2 = e + 45;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            zzzVar = this.zzb;
            Object[] objArr = new Object[1];
            b(true, new byte[]{1}, new int[]{0, 1, 178, 0}, objArr);
            obj = objArr[0];
        } else {
            zzzVar = this.zzb;
            Object[] objArr2 = new Object[1];
            b(false, new byte[]{1}, new int[]{0, 1, 178, 0}, objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern().equals(zzzVar.zza(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzf(String str) {
        int i = 2 % 2;
        int i2 = a + 75;
        e = i2 % 128;
        if (i2 % 2 == 0) {
            zzd(str, zzap.zzah);
            throw null;
        }
        boolean zzd = zzd(str, zzap.zzah);
        int i3 = a + 7;
        e = i3 % 128;
        int i4 = i3 % 2;
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzg(String str) {
        int i = 2 % 2;
        zzel<String> zzelVar = zzap.zzai;
        if (str != null) {
            String zza = zzelVar.zza(this.zzb.zza(str, zzelVar.zza()));
            int i2 = a + 73;
            e = i2 % 128;
            int i3 = i2 % 2;
            return zza;
        }
        int i4 = a + 3;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            return zzelVar.zza(null);
        }
        zzelVar.zza(null);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzx() {
        int i = 2 % 2;
        if (this.zza == null) {
            int i2 = e + 109;
            a = i2 % 128;
            int i3 = i2 % 2;
            Boolean zzb = zzb("app_measurement_lite");
            this.zza = zzb;
            if (zzb == null) {
                int i4 = e + 7;
                a = i4 % 128;
                if (i4 % 2 != 0) {
                    this.zza = Boolean.FALSE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                this.zza = Boolean.FALSE;
            }
        }
        if (this.zza.booleanValue()) {
            return true;
        }
        int i5 = a + 19;
        e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 80 / 0;
            if (!this.zzx.zzt()) {
                return true;
            }
        } else if (!this.zzx.zzt()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* synthetic */ void zza() {
        int i = 2 % 2;
        int i2 = e + 15;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            super.zza();
            int i3 = 86 / 0;
        } else {
            super.zza();
        }
        int i4 = a + 73;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ void zzb() {
        int i = 2 % 2;
        int i2 = a + 97;
        e = i2 % 128;
        int i3 = i2 % 2;
        super.zzb();
        int i4 = a + 113;
        e = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ void zzc() {
        int i = 2 % 2;
        int i2 = a + 73;
        e = i2 % 128;
        int i3 = i2 % 2;
        super.zzc();
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ void zzd() {
        int i = 2 % 2;
        int i2 = a + 19;
        e = i2 % 128;
        int i3 = i2 % 2;
        super.zzd();
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ zzah zzl() {
        int i = 2 % 2;
        int i2 = a + 47;
        e = i2 % 128;
        if (i2 % 2 == 0) {
            super.zzl();
            throw null;
        }
        zzah zzl = super.zzl();
        int i3 = a + 5;
        e = i3 % 128;
        int i4 = i3 % 2;
        return zzl;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* synthetic */ Clock zzm() {
        int i = 2 % 2;
        int i2 = a + 117;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            return super.zzm();
        }
        super.zzm();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* bridge */ /* synthetic */ Context zzn() {
        int i = 2 % 2;
        int i2 = e + 55;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 0 / 0;
            return super.zzn();
        }
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ zzeu zzo() {
        int i = 2 % 2;
        int i2 = e + 5;
        a = i2 % 128;
        int i3 = i2 % 2;
        zzeu zzo = super.zzo();
        int i4 = e + 39;
        a = i4 % 128;
        int i5 = i4 % 2;
        return zzo;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ zzkm zzp() {
        zzkm zzp;
        int i = 2 % 2;
        int i2 = a + 73;
        e = i2 % 128;
        if (i2 % 2 == 0) {
            zzp = super.zzp();
            int i3 = 95 / 0;
        } else {
            zzp = super.zzp();
        }
        int i4 = a + 41;
        e = i4 % 128;
        int i5 = i4 % 2;
        return zzp;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* bridge */ /* synthetic */ zzft zzq() {
        int i = 2 % 2;
        int i2 = e + 31;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return super.zzq();
        }
        super.zzq();
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* synthetic */ zzew zzr() {
        int i = 2 % 2;
        int i2 = e + 123;
        a = i2 % 128;
        int i3 = i2 % 2;
        zzew zzr = super.zzr();
        int i4 = a + 87;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            return zzr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ zzff zzs() {
        int i = 2 % 2;
        int i2 = e + 69;
        a = i2 % 128;
        int i3 = i2 % 2;
        zzff zzs = super.zzs();
        int i4 = a + 71;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            return zzs;
        }
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* synthetic */ zzx zzt() {
        int i = 2 % 2;
        int i2 = a + 11;
        e = i2 % 128;
        if (i2 % 2 == 0) {
            super.zzt();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zzx zzt = super.zzt();
        int i3 = a + 75;
        e = i3 % 128;
        int i4 = i3 % 2;
        return zzt;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* bridge */ /* synthetic */ zzw zzu() {
        int i = 2 % 2;
        int i2 = a + 117;
        e = i2 % 128;
        int i3 = i2 % 2;
        zzw zzu = super.zzu();
        int i4 = e + 101;
        a = i4 % 128;
        int i5 = i4 % 2;
        return zzu;
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) {
        int length;
        char[] cArr;
        int i;
        int i2 = 2 % 2;
        C9584sQ c9584sQ = new C9584sQ();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = a$s58$434;
        if (cArr2 != null) {
            int i7 = $10 + 103;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i = 0;
            }
            while (i < length) {
                cArr[i] = (char) (cArr2[i] ^ (-1938542877577235927L));
                i++;
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            c9584sQ.c = 0;
            char c = 0;
            while (c9584sQ.c < i4) {
                int i8 = $10 + 17;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                if (bArr[c9584sQ.c] == 1) {
                    int i10 = $11 + 7;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr4[c9584sQ.c] = (char) (((cArr3[c9584sQ.c] * 2) + 1) - c);
                } else {
                    cArr4[c9584sQ.c] = (char) ((cArr3[c9584sQ.c] * 2) - c);
                }
                c = cArr4[c9584sQ.c];
                c9584sQ.c++;
                int i12 = $11 + 73;
                $10 = i12 % 128;
                int i13 = i12 % 2;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i14 = $10 + 11;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 1, cArr5, 1, i4);
                System.arraycopy(cArr5, 0, cArr3, i4 + i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 1, i4 >> i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i15 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i15, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i15);
            }
        }
        if (z) {
            char[] cArr7 = new char[i4];
            c9584sQ.c = 0;
            while (c9584sQ.c < i4) {
                cArr7[c9584sQ.c] = cArr3[(i4 - c9584sQ.c) - 1];
                c9584sQ.c++;
            }
            int i16 = $11 + 79;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            c9584sQ.c = 0;
            while (c9584sQ.c < i4) {
                cArr3[c9584sQ.c] = (char) (cArr3[c9584sQ.c] - iArr[2]);
                c9584sQ.c++;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
