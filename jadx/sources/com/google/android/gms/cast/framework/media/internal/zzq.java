package com.google.android.gms.cast.framework.media.internal;

/* loaded from: classes5.dex */
public final class zzq {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r1 != 4) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r4.containsKey("com.google.android.gms.cast.metadata.COMPOSER") != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String zza(com.google.android.gms.cast.MediaMetadata r4) {
        /*
            java.lang.String r0 = "com.google.android.gms.cast.metadata.SUBTITLE"
            boolean r1 = r4.containsKey(r0)
            if (r1 != 0) goto L3b
            int r1 = r4.getMediaType()
            r2 = 1
            if (r1 == r2) goto L39
            r2 = 2
            if (r1 == r2) goto L36
            r2 = 3
            java.lang.String r3 = "com.google.android.gms.cast.metadata.ARTIST"
            if (r1 == r2) goto L1b
            r2 = 4
            if (r1 == r2) goto L21
            goto L3b
        L1b:
            boolean r1 = r4.containsKey(r3)
            if (r1 == 0) goto L23
        L21:
            r0 = r3
            goto L3b
        L23:
            java.lang.String r1 = "com.google.android.gms.cast.metadata.ALBUM_ARTIST"
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L2d
        L2b:
            r0 = r1
            goto L3b
        L2d:
            java.lang.String r1 = "com.google.android.gms.cast.metadata.COMPOSER"
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L3b
            goto L2b
        L36:
            java.lang.String r0 = "com.google.android.gms.cast.metadata.SERIES_TITLE"
            goto L3b
        L39:
            java.lang.String r0 = "com.google.android.gms.cast.metadata.STUDIO"
        L3b:
            java.lang.String r4 = r4.getString(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.internal.zzq.zza(com.google.android.gms.cast.MediaMetadata):java.lang.String");
    }
}
