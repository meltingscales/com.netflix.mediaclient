package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.dHk  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7843dHk {
    public static final C7843dHk b;
    private static final Map<ByteString, Integer> c;
    private static final C7845dHm[] d;

    public final C7845dHm[] a() {
        return d;
    }

    public final Map<ByteString, Integer> c() {
        return c;
    }

    static {
        C7843dHk c7843dHk = new C7843dHk();
        b = c7843dHk;
        C7845dHm c7845dHm = new C7845dHm(C7845dHm.a, "");
        ByteString byteString = C7845dHm.c;
        C7845dHm c7845dHm2 = new C7845dHm(byteString, "GET");
        C7845dHm c7845dHm3 = new C7845dHm(byteString, "POST");
        ByteString byteString2 = C7845dHm.g;
        C7845dHm c7845dHm4 = new C7845dHm(byteString2, "/");
        C7845dHm c7845dHm5 = new C7845dHm(byteString2, "/index.html");
        ByteString byteString3 = C7845dHm.h;
        C7845dHm c7845dHm6 = new C7845dHm(byteString3, "http");
        C7845dHm c7845dHm7 = new C7845dHm(byteString3, "https");
        ByteString byteString4 = C7845dHm.d;
        d = new C7845dHm[]{c7845dHm, c7845dHm2, c7845dHm3, c7845dHm4, c7845dHm5, c7845dHm6, c7845dHm7, new C7845dHm(byteString4, "200"), new C7845dHm(byteString4, "204"), new C7845dHm(byteString4, "206"), new C7845dHm(byteString4, "304"), new C7845dHm(byteString4, "400"), new C7845dHm(byteString4, "404"), new C7845dHm(byteString4, "500"), new C7845dHm("accept-charset", ""), new C7845dHm("accept-encoding", "gzip, deflate"), new C7845dHm("accept-language", ""), new C7845dHm("accept-ranges", ""), new C7845dHm("accept", ""), new C7845dHm("access-control-allow-origin", ""), new C7845dHm(SignupConstants.Field.AGE, ""), new C7845dHm("allow", ""), new C7845dHm("authorization", ""), new C7845dHm("cache-control", ""), new C7845dHm("content-disposition", ""), new C7845dHm("content-encoding", ""), new C7845dHm("content-language", ""), new C7845dHm("content-length", ""), new C7845dHm("content-location", ""), new C7845dHm("content-range", ""), new C7845dHm("content-type", ""), new C7845dHm("cookie", ""), new C7845dHm("date", ""), new C7845dHm("etag", ""), new C7845dHm("expect", ""), new C7845dHm("expires", ""), new C7845dHm(NetflixActivity.EXTRA_FROM, ""), new C7845dHm("host", ""), new C7845dHm("if-match", ""), new C7845dHm("if-modified-since", ""), new C7845dHm("if-none-match", ""), new C7845dHm("if-range", ""), new C7845dHm("if-unmodified-since", ""), new C7845dHm("last-modified", ""), new C7845dHm("link", ""), new C7845dHm("location", ""), new C7845dHm("max-forwards", ""), new C7845dHm("proxy-authenticate", ""), new C7845dHm("proxy-authorization", ""), new C7845dHm("range", ""), new C7845dHm("referer", ""), new C7845dHm("refresh", ""), new C7845dHm("retry-after", ""), new C7845dHm("server", ""), new C7845dHm("set-cookie", ""), new C7845dHm("strict-transport-security", ""), new C7845dHm("transfer-encoding", ""), new C7845dHm("user-agent", ""), new C7845dHm("vary", ""), new C7845dHm("via", ""), new C7845dHm("www-authenticate", "")};
        c = c7843dHk.b();
    }

    private C7843dHk() {
    }

    /* renamed from: o.dHk$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private final int a;
        public int b;
        public C7845dHm[] c;
        private final List<C7845dHm> d;
        public int e;
        private int g;
        private int i;
        private final InterfaceC7871dIn j;

        private final int e(int i) {
            return this.i + 1 + i;
        }

        public b(dIJ dij, int i, int i2) {
            C8632dsu.d(dij, "");
            this.a = i;
            this.g = i2;
            this.d = new ArrayList();
            this.j = dIw.e(dij);
            this.c = new C7845dHm[8];
            this.i = 7;
        }

        public /* synthetic */ b(dIJ dij, int i, int i2, int i3, C8627dsp c8627dsp) {
            this(dij, i, (i3 & 4) != 0 ? i : i2);
        }

        public final List<C7845dHm> c() {
            List<C7845dHm> U;
            U = C8576dqs.U(this.d);
            this.d.clear();
            return U;
        }

        private final void d() {
            int i = this.g;
            int i2 = this.b;
            if (i < i2) {
                if (i == 0) {
                    b();
                } else {
                    c(i2 - i);
                }
            }
        }

        private final void b() {
            C8564dqg.c(this.c, null, 0, 0, 6, null);
            this.i = this.c.length - 1;
            this.e = 0;
            this.b = 0;
        }

        private final int c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.c.length;
                while (true) {
                    length--;
                    i2 = this.i;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    C7845dHm c7845dHm = this.c[length];
                    if (c7845dHm == null) {
                        C8632dsu.e();
                    }
                    int i4 = c7845dHm.j;
                    i -= i4;
                    this.b -= i4;
                    this.e--;
                    i3++;
                }
                C7845dHm[] c7845dHmArr = this.c;
                int i5 = i2 + 1;
                System.arraycopy(c7845dHmArr, i5, c7845dHmArr, i5 + i3, this.e);
                this.i += i3;
            }
            return i3;
        }

        public final void e() {
            while (!this.j.m()) {
                int b = dGB.b(this.j.l(), (int) PrivateKeyType.INVALID);
                if (b == 128) {
                    throw new IOException("index == 0");
                }
                if ((b & 128) == 128) {
                    d(e(b, 127) - 1);
                } else if (b == 64) {
                    h();
                } else if ((b & 64) == 64) {
                    g(e(b, 63) - 1);
                } else if ((b & 32) == 32) {
                    int e = e(b, 31);
                    this.g = e;
                    if (e < 0 || e > this.a) {
                        throw new IOException("Invalid dynamic table size update " + this.g);
                    }
                    d();
                } else if (b == 16 || b == 0) {
                    i();
                } else {
                    j(e(b, 15) - 1);
                }
            }
        }

        private final void d(int i) {
            if (a(i)) {
                this.d.add(C7843dHk.b.a()[i]);
                return;
            }
            int e = e(i - C7843dHk.b.a().length);
            if (e >= 0) {
                C7845dHm[] c7845dHmArr = this.c;
                if (e < c7845dHmArr.length) {
                    List<C7845dHm> list = this.d;
                    C7845dHm c7845dHm = c7845dHmArr[e];
                    if (c7845dHm == null) {
                        C8632dsu.e();
                    }
                    list.add(c7845dHm);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private final void j(int i) {
            this.d.add(new C7845dHm(b(i), a()));
        }

        private final void i() {
            this.d.add(new C7845dHm(C7843dHk.b.e(a()), a()));
        }

        private final void g(int i) {
            c(-1, new C7845dHm(b(i), a()));
        }

        private final void h() {
            c(-1, new C7845dHm(C7843dHk.b.e(a()), a()));
        }

        private final ByteString b(int i) {
            if (a(i)) {
                return C7843dHk.b.a()[i].f;
            }
            int e = e(i - C7843dHk.b.a().length);
            if (e >= 0) {
                C7845dHm[] c7845dHmArr = this.c;
                if (e < c7845dHmArr.length) {
                    C7845dHm c7845dHm = c7845dHmArr[e];
                    if (c7845dHm == null) {
                        C8632dsu.e();
                    }
                    return c7845dHm.f;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private final boolean a(int i) {
            return i >= 0 && i <= C7843dHk.b.a().length - 1;
        }

        private final void c(int i, C7845dHm c7845dHm) {
            this.d.add(c7845dHm);
            int i2 = c7845dHm.j;
            if (i != -1) {
                C7845dHm c7845dHm2 = this.c[e(i)];
                if (c7845dHm2 == null) {
                    C8632dsu.e();
                }
                i2 -= c7845dHm2.j;
            }
            int i3 = this.g;
            if (i2 > i3) {
                b();
                return;
            }
            int c = c((this.b + i2) - i3);
            if (i == -1) {
                int i4 = this.e;
                C7845dHm[] c7845dHmArr = this.c;
                if (i4 + 1 > c7845dHmArr.length) {
                    C7845dHm[] c7845dHmArr2 = new C7845dHm[c7845dHmArr.length * 2];
                    System.arraycopy(c7845dHmArr, 0, c7845dHmArr2, c7845dHmArr.length, c7845dHmArr.length);
                    this.i = this.c.length - 1;
                    this.c = c7845dHmArr2;
                }
                int i5 = this.i;
                this.i = i5 - 1;
                this.c[i5] = c7845dHm;
                this.e++;
            } else {
                this.c[i + e(i) + c] = c7845dHm;
            }
            this.b += i2;
        }

        private final int f() {
            return dGB.b(this.j.l(), (int) PrivateKeyType.INVALID);
        }

        public final int e(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int f = f();
                if ((f & 128) == 0) {
                    return i2 + (f << i4);
                }
                i2 += (f & 127) << i4;
                i4 += 7;
            }
        }

        public final ByteString a() {
            int f = f();
            boolean z = (f & 128) == 128;
            long e = e(f, 127);
            if (z) {
                C7872dIo c7872dIo = new C7872dIo();
                C7847dHo.b.a(this.j, e, c7872dIo);
                return c7872dIo.r();
            }
            return this.j.c(e);
        }
    }

    private final Map<ByteString, Integer> b() {
        C7845dHm[] c7845dHmArr = d;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c7845dHmArr.length);
        int length = c7845dHmArr.length;
        for (int i = 0; i < length; i++) {
            C7845dHm[] c7845dHmArr2 = d;
            if (!linkedHashMap.containsKey(c7845dHmArr2[i].f)) {
                linkedHashMap.put(c7845dHmArr2[i].f, Integer.valueOf(i));
            }
        }
        Map<ByteString, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C8632dsu.b(unmodifiableMap, "");
        return unmodifiableMap;
    }

    /* renamed from: o.dHk$d */
    /* loaded from: classes5.dex */
    public static final class d {
        public int a;
        public int b;
        public int c;
        public C7845dHm[] d;
        public int e;
        private final C7872dIo f;
        private final boolean g;
        private boolean h;
        private int i;
        private int j;

        public d(int i, boolean z, C7872dIo c7872dIo) {
            C8632dsu.d(c7872dIo, "");
            this.c = i;
            this.g = z;
            this.f = c7872dIo;
            this.j = Integer.MAX_VALUE;
            this.e = i;
            this.d = new C7845dHm[8];
            this.i = 7;
        }

        public /* synthetic */ d(int i, boolean z, C7872dIo c7872dIo, int i2, C8627dsp c8627dsp) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, c7872dIo);
        }

        private final void b() {
            C8564dqg.c(this.d, null, 0, 0, 6, null);
            this.i = this.d.length - 1;
            this.a = 0;
            this.b = 0;
        }

        private final int e(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.d.length;
                while (true) {
                    length--;
                    i2 = this.i;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    C7845dHm c7845dHm = this.d[length];
                    if (c7845dHm == null) {
                        C8632dsu.e();
                    }
                    i -= c7845dHm.j;
                    int i4 = this.b;
                    C7845dHm c7845dHm2 = this.d[length];
                    if (c7845dHm2 == null) {
                        C8632dsu.e();
                    }
                    this.b = i4 - c7845dHm2.j;
                    this.a--;
                    i3++;
                }
                C7845dHm[] c7845dHmArr = this.d;
                int i5 = i2 + 1;
                System.arraycopy(c7845dHmArr, i5, c7845dHmArr, i5 + i3, this.a);
                C7845dHm[] c7845dHmArr2 = this.d;
                int i6 = this.i + 1;
                Arrays.fill(c7845dHmArr2, i6, i6 + i3, (Object) null);
                this.i += i3;
            }
            return i3;
        }

        private final void c(C7845dHm c7845dHm) {
            int i = c7845dHm.j;
            int i2 = this.e;
            if (i > i2) {
                b();
                return;
            }
            e((this.b + i) - i2);
            int i3 = this.a;
            C7845dHm[] c7845dHmArr = this.d;
            if (i3 + 1 > c7845dHmArr.length) {
                C7845dHm[] c7845dHmArr2 = new C7845dHm[c7845dHmArr.length * 2];
                System.arraycopy(c7845dHmArr, 0, c7845dHmArr2, c7845dHmArr.length, c7845dHmArr.length);
                this.i = this.d.length - 1;
                this.d = c7845dHmArr2;
            }
            int i4 = this.i;
            this.i = i4 - 1;
            this.d[i4] = c7845dHm;
            this.a++;
            this.b += i;
        }

        public final void c(List<C7845dHm> list) {
            int i;
            int i2;
            C8632dsu.d(list, "");
            if (this.h) {
                int i3 = this.j;
                if (i3 < this.e) {
                    a(i3, 31, 32);
                }
                this.h = false;
                this.j = Integer.MAX_VALUE;
                a(this.e, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C7845dHm c7845dHm = list.get(i4);
                ByteString o2 = c7845dHm.f.o();
                ByteString byteString = c7845dHm.i;
                C7843dHk c7843dHk = C7843dHk.b;
                Integer num = c7843dHk.c().get(o2);
                if (num != null) {
                    int intValue = num.intValue();
                    i2 = intValue + 1;
                    if (2 <= i2 && 7 >= i2) {
                        if (C8632dsu.c(c7843dHk.a()[intValue].i, byteString)) {
                            i = i2;
                        } else if (C8632dsu.c(c7843dHk.a()[i2].i, byteString)) {
                            i = intValue + 2;
                        }
                    }
                    i = -1;
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i == -1) {
                    int i5 = this.i + 1;
                    int length = this.d.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        C7845dHm c7845dHm2 = this.d[i5];
                        if (c7845dHm2 == null) {
                            C8632dsu.e();
                        }
                        if (C8632dsu.c(c7845dHm2.f, o2)) {
                            C7845dHm c7845dHm3 = this.d[i5];
                            if (c7845dHm3 == null) {
                                C8632dsu.e();
                            }
                            if (C8632dsu.c(c7845dHm3.i, byteString)) {
                                i = C7843dHk.b.a().length + (i5 - this.i);
                                break;
                            } else if (i2 == -1) {
                                i2 = (i5 - this.i) + C7843dHk.b.a().length;
                            }
                        }
                        i5++;
                    }
                }
                if (i != -1) {
                    a(i, 127, 128);
                } else if (i2 == -1) {
                    this.f.c(64);
                    d(o2);
                    d(byteString);
                    c(c7845dHm);
                } else if (o2.d(C7845dHm.e) && (!C8632dsu.c(C7845dHm.a, o2))) {
                    a(i2, 15, 0);
                    d(byteString);
                } else {
                    a(i2, 63, 64);
                    d(byteString);
                    c(c7845dHm);
                }
            }
        }

        public final void a(int i, int i2, int i3) {
            if (i < i2) {
                this.f.c(i | i3);
                return;
            }
            this.f.c(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f.c(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f.c(i4);
        }

        public final void d(ByteString byteString) {
            C8632dsu.d(byteString, "");
            if (this.g) {
                C7847dHo c7847dHo = C7847dHo.b;
                if (c7847dHo.e(byteString) < byteString.k()) {
                    C7872dIo c7872dIo = new C7872dIo();
                    c7847dHo.d(byteString, c7872dIo);
                    ByteString r = c7872dIo.r();
                    a(r.k(), 127, 128);
                    this.f.b(r);
                    return;
                }
            }
            a(byteString.k(), 127, 0);
            this.f.b(byteString);
        }

        public final void a(int i) {
            this.c = i;
            int min = Math.min(i, 16384);
            int i2 = this.e;
            if (i2 == min) {
                return;
            }
            if (min < i2) {
                this.j = Math.min(this.j, min);
            }
            this.h = true;
            this.e = min;
            c();
        }

        private final void c() {
            int i = this.e;
            int i2 = this.b;
            if (i < i2) {
                if (i == 0) {
                    b();
                } else {
                    e(i2 - i);
                }
            }
        }
    }

    public final ByteString e(ByteString byteString) {
        C8632dsu.d(byteString, "");
        int k = byteString.k();
        for (int i = 0; i < k; i++) {
            byte b2 = (byte) 65;
            byte b3 = (byte) 90;
            byte a = byteString.a(i);
            if (b2 <= a && b3 >= a) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + byteString.m());
            }
        }
        return byteString;
    }
}
