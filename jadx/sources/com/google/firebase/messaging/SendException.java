package com.google.firebase.messaging;

/* loaded from: classes5.dex */
public final class SendException extends Exception {
    private final int zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
        if (r7 != 4) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SendException(java.lang.String r7) {
        /*
            r6 = this;
            r6.<init>(r7)
            r0 = 0
            if (r7 == 0) goto L65
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r1)
            r7.hashCode()
            int r1 = r7.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -1743242157: goto L47;
                case -1290953729: goto L3c;
                case -920906446: goto L31;
                case -617027085: goto L26;
                case -95047692: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L52
        L1b:
            java.lang.String r1 = "missing_to"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L24
            goto L52
        L24:
            r7 = r2
            goto L53
        L26:
            java.lang.String r1 = "messagetoobig"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L2f
            goto L52
        L2f:
            r7 = r3
            goto L53
        L31:
            java.lang.String r1 = "invalid_parameters"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L3a
            goto L52
        L3a:
            r7 = r4
            goto L53
        L3c:
            java.lang.String r1 = "toomanymessages"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L45
            goto L52
        L45:
            r7 = r5
            goto L53
        L47:
            java.lang.String r1 = "service_not_available"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L50
            goto L52
        L50:
            r7 = r0
            goto L53
        L52:
            r7 = -1
        L53:
            if (r7 == 0) goto L64
            if (r7 == r5) goto L62
            if (r7 == r4) goto L60
            if (r7 == r3) goto L5e
            if (r7 == r2) goto L60
            goto L65
        L5e:
            r0 = r4
            goto L65
        L60:
            r0 = r5
            goto L65
        L62:
            r0 = r2
            goto L65
        L64:
            r0 = r3
        L65:
            r6.zza = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.SendException.<init>(java.lang.String):void");
    }
}
