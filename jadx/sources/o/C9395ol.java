package o;

import com.netflix.ale.AleCryptoBouncyCastle;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.ol  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9395ol {
    private static final char[] a = C9391oh.a(true);
    private static final byte[] d = C9391oh.b(true);
    private static final C9395ol c = new C9395ol();

    public static C9395ol a() {
        return c;
    }

    private char[] b() {
        return new char[]{'\\', 0, '0', '0'};
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        r9 = r13.charAt(r8);
        r10 = r2[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r10 >= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        r9 = a(r9, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        r9 = c(r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        r10 = r7 + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r10 <= r1.length) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        r10 = r1.length - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r10 <= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        java.lang.System.arraycopy(r6, 0, r1, r7, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r4 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        r4 = o.C9443pg.b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        r1 = r4.d();
        r9 = r9 - r10;
        java.lang.System.arraycopy(r6, r10, r1, 0, r9);
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        java.lang.System.arraycopy(r6, 0, r1, r7, r9);
        r7 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r6 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        r6 = b();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public char[] c(java.lang.String r13) {
        /*
            r12 = this;
            int r0 = r13.length()
            int r1 = e(r0)
            char[] r1 = new char[r1]
            int[] r2 = o.C9391oh.e()
            int r3 = r2.length
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r5
            r8 = r7
        L14:
            if (r8 >= r0) goto L71
        L16:
            char r9 = r13.charAt(r8)
            if (r9 >= r3) goto L5a
            r10 = r2[r9]
            if (r10 == 0) goto L5a
            if (r6 != 0) goto L26
            char[] r6 = r12.b()
        L26:
            char r9 = r13.charAt(r8)
            r10 = r2[r9]
            if (r10 >= 0) goto L33
            int r9 = r12.a(r9, r6)
            goto L37
        L33:
            int r9 = r12.c(r10, r6)
        L37:
            int r10 = r7 + r9
            int r11 = r1.length
            if (r10 <= r11) goto L53
            int r10 = r1.length
            int r10 = r10 - r7
            if (r10 <= 0) goto L43
            java.lang.System.arraycopy(r6, r5, r1, r7, r10)
        L43:
            if (r4 != 0) goto L49
            o.pg r4 = o.C9443pg.b(r1)
        L49:
            char[] r1 = r4.d()
            int r9 = r9 - r10
            java.lang.System.arraycopy(r6, r10, r1, r5, r9)
            r7 = r9
            goto L57
        L53:
            java.lang.System.arraycopy(r6, r5, r1, r7, r9)
            r7 = r10
        L57:
            int r8 = r8 + 1
            goto L14
        L5a:
            int r10 = r1.length
            if (r7 < r10) goto L68
            if (r4 != 0) goto L63
            o.pg r4 = o.C9443pg.b(r1)
        L63:
            char[] r1 = r4.d()
            r7 = r5
        L68:
            int r10 = r7 + 1
            r1[r7] = r9
            int r8 = r8 + 1
            r7 = r10
            if (r8 < r0) goto L16
        L71:
            if (r4 != 0) goto L78
            char[] r13 = java.util.Arrays.copyOfRange(r1, r5, r7)
            return r13
        L78:
            r4.b(r7)
            char[] r13 = r4.b()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9395ol.c(java.lang.String):char[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] d(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9395ol.d(java.lang.String):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00df A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] e(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9395ol.e(java.lang.String):byte[]");
    }

    private int a(int i, char[] cArr) {
        cArr[1] = 'u';
        char[] cArr2 = a;
        cArr[4] = cArr2[i >> 4];
        cArr[5] = cArr2[i & 15];
        return 6;
    }

    private int c(int i, char[] cArr) {
        cArr[1] = (char) i;
        return 2;
    }

    private int d(int i, int i2, C9439pc c9439pc, int i3) {
        c9439pc.e(i3);
        c9439pc.a(92);
        if (i2 < 0) {
            c9439pc.a(117);
            if (i > 255) {
                byte[] bArr = d;
                c9439pc.a(bArr[i >> 12]);
                c9439pc.a(bArr[(i >> 8) & 15]);
                i &= PrivateKeyType.INVALID;
            } else {
                c9439pc.a(48);
                c9439pc.a(48);
            }
            byte[] bArr2 = d;
            c9439pc.a(bArr2[i >> 4]);
            c9439pc.a(bArr2[i & 15]);
        } else {
            c9439pc.a((byte) i2);
        }
        return c9439pc.a();
    }

    private static int d(int i, int i2) {
        if (i2 < 56320 || i2 > 57343) {
            throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(i2) + "; illegal combination");
        }
        return ((i - 55296) << 10) + AleCryptoBouncyCastle.MAX_RANDOM_BYTES + (i2 - 56320);
    }

    private static void a(int i) {
        throw new IllegalArgumentException(C9402os.b(i));
    }

    static int e(int i) {
        return Math.min(Math.max(16, i + Math.min((i >> 3) + 6, 1000)), 32000);
    }

    static int d(int i) {
        return Math.min(Math.max(24, i + 6 + (i >> 1)), 32000);
    }
}
