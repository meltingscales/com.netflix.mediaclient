package com.google.android.gms.internal.firebase_messaging;

import java.io.PrintStream;

/* loaded from: classes2.dex */
public final class zzm {
    private static final zzp zza;
    private static final int zzb;

    /* loaded from: classes2.dex */
    static final class zza extends zzp {
        zza() {
        }

        @Override // com.google.android.gms.internal.firebase_messaging.zzp
        public final void zza(Throwable th, Throwable th2) {
        }
    }

    public static void zza(Throwable th, Throwable th2) {
        zza.zza(th, th2);
    }

    private static Integer zza() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            PrintStream printStream = System.err;
            printStream.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(printStream);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    static {
        /*
            r0 = 1
            java.lang.Integer r1 = zza()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L15
            int r2 = r1.intValue()     // Catch: java.lang.Throwable -> L2a
            r3 = 19
            if (r2 < r3) goto L15
            com.google.android.gms.internal.firebase_messaging.zzs r2 = new com.google.android.gms.internal.firebase_messaging.zzs     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L5d
        L15:
            java.lang.String r2 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch: java.lang.Throwable -> L2a
            r2 = r2 ^ r0
            if (r2 == 0) goto L24
            com.google.android.gms.internal.firebase_messaging.zzq r2 = new com.google.android.gms.internal.firebase_messaging.zzq     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L5d
        L24:
            com.google.android.gms.internal.firebase_messaging.zzm$zza r2 = new com.google.android.gms.internal.firebase_messaging.zzm$zza     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            goto L5d
        L2a:
            r2 = move-exception
            goto L2e
        L2c:
            r2 = move-exception
            r1 = 0
        L2e:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.Class<com.google.android.gms.internal.firebase_messaging.zzm$zza> r4 = com.google.android.gms.internal.firebase_messaging.zzm.zza.class
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r6 = r4.length()
            int r6 = r6 + 133
            r5.<init>(r6)
            java.lang.String r6 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = "will be used. The error is: "
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.println(r4)
            r2.printStackTrace(r3)
            com.google.android.gms.internal.firebase_messaging.zzm$zza r2 = new com.google.android.gms.internal.firebase_messaging.zzm$zza
            r2.<init>()
        L5d:
            com.google.android.gms.internal.firebase_messaging.zzm.zza = r2
            if (r1 != 0) goto L62
            goto L66
        L62:
            int r0 = r1.intValue()
        L66:
            com.google.android.gms.internal.firebase_messaging.zzm.zzb = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_messaging.zzm.<clinit>():void");
    }
}
