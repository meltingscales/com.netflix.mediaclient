package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C8566dqi;
import o.C8576dqs;
import o.C8608drx;
import o.C8627dsp;
import o.C8632dsu;
import o.C8670due;
import o.InterfaceC7871dIn;
import o.dGB;
import o.dHG;
import o.dIr;
import o.dIw;
import o.dpR;
import o.dtQ;
import o.duD;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes5.dex */
public final class PublicSuffixDatabase {
    private static final PublicSuffixDatabase b;
    private static final List<String> d;
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final CountDownLatch f = new CountDownLatch(1);
    private byte[] h;
    private byte[] i;
    public static final c a = new c(null);
    private static final byte[] e = {(byte) 42};

    public final String c(String str) {
        List<String> b2;
        int size;
        int size2;
        List b3;
        dtQ C;
        dtQ c2;
        String d2;
        C8632dsu.d((Object) str, "");
        String unicode = IDN.toUnicode(str);
        C8632dsu.b(unicode, "");
        b2 = duD.b((CharSequence) unicode, new char[]{'.'}, false, 0, 6, (Object) null);
        List<String> d3 = d(b2);
        if (b2.size() != d3.size() || d3.get(0).charAt(0) == '!') {
            if (d3.get(0).charAt(0) == '!') {
                size = b2.size();
                size2 = d3.size();
            } else {
                size = b2.size();
                size2 = d3.size() + 1;
            }
            b3 = duD.b((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
            C = C8576dqs.C((Iterable) b3);
            c2 = C8670due.c(C, size - size2);
            d2 = C8670due.d(c2, ".", null, null, 0, null, null, 62, null);
            return d2;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dc, code lost:
        r4 = o.duD.b((java.lang.CharSequence) r8, new char[]{'.'}, false, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f3, code lost:
        r1 = o.duD.b((java.lang.CharSequence) r5, new char[]{'.'}, false, 0, 6, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<java.lang.String> d(java.util.List<java.lang.String> r18) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.d(java.util.List):java.util.List");
    }

    private final void d() {
        boolean z = false;
        while (true) {
            try {
                try {
                    a();
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e2) {
                    dHG.i.b().d("Failed to read public suffix list", 5, e2);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
    }

    private final void a() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        InterfaceC7871dIn e2 = dIw.e(new dIr(dIw.a(resourceAsStream)));
        try {
            byte[] e3 = e2.e(e2.p());
            byte[] e4 = e2.e(e2.p());
            dpR dpr = dpR.c;
            C8608drx.a(e2, null);
            synchronized (this) {
                if (e3 == null) {
                    C8632dsu.e();
                }
                this.i = e3;
                if (e4 == null) {
                    C8632dsu.e();
                }
                this.h = e4;
            }
            this.f.countDown();
        } finally {
        }
    }

    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            int b;
            boolean z;
            int b2;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = (i3 + length) / 2;
                while (i4 > -1 && bArr[i4] != ((byte) 10)) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (bArr[i2] == ((byte) 10)) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        b = 46;
                        z = false;
                    } else {
                        boolean z3 = z2;
                        b = dGB.b(bArr2[i8][i9], (int) PrivateKeyType.INVALID);
                        z = z3;
                    }
                    b2 = b - dGB.b(bArr[i5 + i10], (int) PrivateKeyType.INVALID);
                    if (b2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    } else if (bArr2[i8].length != i9) {
                        z2 = z;
                    } else if (i8 == bArr2.length - 1) {
                        break;
                    } else {
                        i8++;
                        z2 = true;
                        i9 = -1;
                    }
                }
                if (b2 >= 0) {
                    if (b2 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                Charset charset = StandardCharsets.UTF_8;
                                C8632dsu.b(charset, "");
                                return new String(bArr, i5, i7, charset);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i4;
            }
            return null;
        }
    }

    static {
        List<String> e2;
        e2 = C8566dqi.e("*");
        d = e2;
        b = new PublicSuffixDatabase();
    }
}
