package o;

import android.content.Context;
import java.io.File;
import org.chromium.net.ExperimentalCronetEngine;

/* loaded from: classes.dex */
public final class aHK {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExperimentalCronetEngine d(Context context) {
        aHG ahg = new aHG(context);
        b(context, ahg);
        ahg.c(true);
        return ahg.e();
    }

    private static void b(Context context, aHG ahg) {
        File file = new File(context.getCacheDir(), "cronet");
        String path = file.getPath();
        boolean exists = file.exists();
        C1044Mm.a("nf_cr_helper", "Set cache to %s, it exists %b, absolute path %s", path, Boolean.valueOf(exists), file.getAbsolutePath());
        if (!file.exists()) {
            C1044Mm.a("nf_cr_helper", "Cache created %b", Boolean.valueOf(file.mkdir()));
        }
        if (file.exists() && file.isDirectory()) {
            ahg.c(file.getPath());
            ahg.c(2, 524288);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(String str) {
        return str.endsWith(".bif") || str.endsWith(".webp") || str.endsWith(".png") || str.endsWith(".jpg") || str.endsWith(".jpeg") || str.endsWith(".avif");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(android.content.Context r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            android.net.NetworkInfo r3 = com.netflix.mediaclient.util.ConnectivityUtils.a(r3)
            if (r3 != 0) goto Lb
            return r0
        Lb:
            int r0 = r3.getType()
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L28
            r2 = 6
            if (r0 == r2) goto L25
            r2 = 7
            if (r0 == r2) goto L22
            r2 = 9
            if (r0 == r2) goto L1f
            goto L2c
        L1f:
            java.lang.String r0 = "ethernet"
            goto L2a
        L22:
            java.lang.String r0 = "bluetooth"
            goto L2a
        L25:
            java.lang.String r0 = "wimax"
            goto L2a
        L28:
            java.lang.String r0 = "wifi"
        L2a:
            r1 = 0
            goto L2e
        L2c:
            java.lang.String r0 = "mobile"
        L2e:
            if (r1 == 0) goto L7f
            int r3 = r3.getSubtype()
            com.netflix.mediaclient.service.net.NetworkType r3 = com.netflix.mediaclient.service.net.NetworkType.b(r3)
            boolean r1 = com.netflix.mediaclient.service.net.NetworkType.b(r3)
            if (r1 == 0) goto L50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "_2g"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L7f
        L50:
            boolean r1 = com.netflix.mediaclient.service.net.NetworkType.d(r3)
            if (r1 == 0) goto L68
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "_3g"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L7f
        L68:
            boolean r3 = com.netflix.mediaclient.service.net.NetworkType.a(r3)
            if (r3 == 0) goto L7f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "_4g"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aHK.c(android.content.Context):java.lang.String");
    }
}
