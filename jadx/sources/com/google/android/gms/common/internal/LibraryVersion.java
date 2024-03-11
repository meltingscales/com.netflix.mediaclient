package com.google.android.gms.common.internal;

import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* loaded from: classes2.dex */
public class LibraryVersion {
    private static final GmsLogger zza = new GmsLogger("LibraryVersion", "");
    private static final LibraryVersion zzb = new LibraryVersion();
    private final ConcurrentHashMap zzc = new ConcurrentHashMap();

    protected LibraryVersion() {
    }

    public static LibraryVersion getInstance() {
        return zzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getVersion(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to get app version for libraryName: "
            java.lang.String r1 = "LibraryVersion"
            java.lang.String r2 = "Please provide a valid libraryName"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9, r2)
            java.util.concurrent.ConcurrentHashMap r2 = r8.zzc
            boolean r2 = r2.containsKey(r9)
            if (r2 == 0) goto L1a
            java.util.concurrent.ConcurrentHashMap r0 = r8.zzc
            java.lang.Object r9 = r0.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L1a:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.String r5 = "/%s.properties"
            java.lang.String r4 = java.lang.String.format(r5, r4)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            java.lang.Class<com.google.android.gms.common.internal.LibraryVersion> r5 = com.google.android.gms.common.internal.LibraryVersion.class
            java.io.InputStream r4 = r5.getResourceAsStream(r4)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L73
            if (r4 == 0) goto L55
            r2.load(r4)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            java.lang.String r5 = "version"
            java.lang.String r3 = r2.getProperty(r5, r3)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            com.google.android.gms.common.internal.GmsLogger r2 = com.google.android.gms.common.internal.LibraryVersion.zza     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r5.<init>()     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r5.append(r9)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            java.lang.String r6 = " version is "
            r5.append(r6)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r5.append(r3)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r2.v(r1, r5)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            goto L8c
        L55:
            com.google.android.gms.common.internal.GmsLogger r2 = com.google.android.gms.common.internal.LibraryVersion.zza     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r5.<init>()     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r5.append(r0)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r5.append(r9)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r2.w(r1, r5)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            goto L8c
        L6a:
            r9 = move-exception
            goto La3
        L6c:
            r2 = move-exception
            r7 = r4
            r4 = r3
            r3 = r7
            goto L75
        L71:
            r9 = move-exception
            goto La2
        L73:
            r2 = move-exception
            r4 = r3
        L75:
            com.google.android.gms.common.internal.GmsLogger r5 = com.google.android.gms.common.internal.LibraryVersion.zza     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r6.<init>()     // Catch: java.lang.Throwable -> L71
            r6.append(r0)     // Catch: java.lang.Throwable -> L71
            r6.append(r9)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L71
            r5.e(r1, r0, r2)     // Catch: java.lang.Throwable -> L71
            r7 = r4
            r4 = r3
            r3 = r7
        L8c:
            if (r4 == 0) goto L91
            com.google.android.gms.common.util.IOUtils.closeQuietly(r4)
        L91:
            if (r3 != 0) goto L9c
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.android.gms.common.internal.LibraryVersion.zza
            java.lang.String r2 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r0.d(r1, r2)
            java.lang.String r3 = "UNKNOWN"
        L9c:
            java.util.concurrent.ConcurrentHashMap r0 = r8.zzc
            r0.put(r9, r3)
            return r3
        La2:
            r4 = r3
        La3:
            if (r4 == 0) goto La8
            com.google.android.gms.common.util.IOUtils.closeQuietly(r4)
        La8:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.LibraryVersion.getVersion(java.lang.String):java.lang.String");
    }
}
