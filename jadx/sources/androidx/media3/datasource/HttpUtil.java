package androidx.media3.datasource;

import android.text.TextUtils;
import androidx.media3.common.util.Assertions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class HttpUtil {
    private static final Pattern CONTENT_RANGE_WITH_START_AND_END = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern CONTENT_RANGE_WITH_SIZE = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String buildRangeRequestHeader(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("bytes=");
        sb.append(j);
        sb.append("-");
        if (j2 != -1) {
            sb.append((j + j2) - 1);
        }
        return sb.toString();
    }

    public static long getDocumentSize(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = CONTENT_RANGE_WITH_SIZE.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) Assertions.checkNotNull(matcher.group(1)));
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long getContentLength(java.lang.String r9, java.lang.String r10) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r1 = "HttpUtil"
            java.lang.String r2 = "]"
            if (r0 != 0) goto L26
            long r3 = java.lang.Long.parseLong(r9)     // Catch: java.lang.NumberFormatException -> Lf
            goto L28
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Unexpected Content-Length ["
            r0.append(r3)
            r0.append(r9)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.util.Log.e(r1, r0)
        L26:
            r3 = -1
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto La3
            java.util.regex.Pattern r0 = androidx.media3.datasource.HttpUtil.CONTENT_RANGE_WITH_START_AND_END
            java.util.regex.Matcher r0 = r0.matcher(r10)
            boolean r5 = r0.matches()
            if (r5 == 0) goto La3
            r5 = 2
            java.lang.String r5 = r0.group(r5)     // Catch: java.lang.NumberFormatException -> L8c
            java.lang.Object r5 = androidx.media3.common.util.Assertions.checkNotNull(r5)     // Catch: java.lang.NumberFormatException -> L8c
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.NumberFormatException -> L8c
            long r5 = java.lang.Long.parseLong(r5)     // Catch: java.lang.NumberFormatException -> L8c
            r7 = 1
            java.lang.String r0 = r0.group(r7)     // Catch: java.lang.NumberFormatException -> L8c
            java.lang.Object r0 = androidx.media3.common.util.Assertions.checkNotNull(r0)     // Catch: java.lang.NumberFormatException -> L8c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L8c
            long r7 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L8c
            long r5 = r5 - r7
            r7 = 1
            long r5 = r5 + r7
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L64
            r3 = r5
            goto La3
        L64:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto La3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L8c
            r0.<init>()     // Catch: java.lang.NumberFormatException -> L8c
            java.lang.String r7 = "Inconsistent headers ["
            r0.append(r7)     // Catch: java.lang.NumberFormatException -> L8c
            r0.append(r9)     // Catch: java.lang.NumberFormatException -> L8c
            java.lang.String r9 = "] ["
            r0.append(r9)     // Catch: java.lang.NumberFormatException -> L8c
            r0.append(r10)     // Catch: java.lang.NumberFormatException -> L8c
            r0.append(r2)     // Catch: java.lang.NumberFormatException -> L8c
            java.lang.String r9 = r0.toString()     // Catch: java.lang.NumberFormatException -> L8c
            androidx.media3.common.util.Log.w(r1, r9)     // Catch: java.lang.NumberFormatException -> L8c
            long r3 = java.lang.Math.max(r3, r5)     // Catch: java.lang.NumberFormatException -> L8c
            goto La3
        L8c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Unexpected Content-Range ["
            r9.append(r0)
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            androidx.media3.common.util.Log.e(r1, r9)
        La3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.HttpUtil.getContentLength(java.lang.String, java.lang.String):long");
    }
}
