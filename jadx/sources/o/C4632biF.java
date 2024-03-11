package o;

import androidx.media3.datasource.DataSource;
import java.io.IOException;

/* renamed from: o.biF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4632biF {
    public static c a(String str) {
        int i;
        int indexOf;
        if (str != null) {
            try {
                int indexOf2 = str.indexOf(46);
                if (indexOf2 <= 0 || (indexOf = str.indexOf(46, (i = indexOf2 + 1))) <= 0) {
                    return null;
                }
                return new c(Integer.parseInt(str.substring(0, indexOf2)), str.substring(i, indexOf), Long.parseLong(str.substring(indexOf + 1)));
            } catch (Exception e) {
                C1044Mm.b("nf_cache", e, "unable to parse key %s", str);
                return null;
            }
        }
        return null;
    }

    public static int d(String str) {
        if (str != null) {
            try {
                int indexOf = str.indexOf(46);
                if (indexOf > 0) {
                    return Integer.parseInt(str.substring(0, indexOf));
                }
                return -1;
            } catch (Exception unused) {
                return -1;
            }
        }
        return -1;
    }

    public static boolean d(String str, String str2) {
        if (str != null && str2 != null) {
            if (str.contains("." + str2 + ".")) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(String str, long j) {
        return str != null && str.endsWith(Long.toString(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r5, java.lang.String r6, java.lang.Long r7) {
        /*
            r0 = 0
            if (r5 == 0) goto L50
            int r1 = r5.length()
            r2 = 1
            if (r1 < r2) goto L50
            java.lang.String r5 = r5.substring(r0, r2)
            r5.hashCode()
            int r1 = r5.hashCode()
            r3 = 65
            r4 = 2
            if (r1 == r3) goto L39
            r3 = 84
            if (r1 == r3) goto L2e
            r3 = 86
            if (r1 == r3) goto L23
            goto L41
        L23:
            java.lang.String r1 = "V"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L2c
            goto L41
        L2c:
            r5 = r4
            goto L44
        L2e:
            java.lang.String r1 = "T"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L37
            goto L41
        L37:
            r5 = r2
            goto L44
        L39:
            java.lang.String r1 = "A"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L43
        L41:
            r5 = -1
            goto L44
        L43:
            r5 = r0
        L44:
            if (r5 == 0) goto L4f
            if (r5 == r2) goto L4d
            if (r5 == r4) goto L4b
            goto L50
        L4b:
            r0 = r4
            goto L50
        L4d:
            r0 = 3
            goto L50
        L4f:
            r0 = r2
        L50:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = "."
            r5.append(r0)
            r5.append(r6)
            r5.append(r0)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4632biF.b(java.lang.String, java.lang.String, java.lang.Long):java.lang.String");
    }

    public static void a(DataSource dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: o.biF$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public final long a;
        public final String b;
        public final int e;

        c(int i, String str, long j) {
            this.e = i;
            this.b = str;
            this.a = j;
        }
    }
}
