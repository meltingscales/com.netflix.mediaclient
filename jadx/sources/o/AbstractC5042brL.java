package o;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.netflix.android.volley.Request;
import com.netflix.android.volley.VolleyError;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.brL  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5042brL<T> extends Request<T> implements NetflixDataRequest {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int a$s75$3210 = 1998870156;
    private static char b$s76$3210 = 239;
    private static long d$s74$3210 = -6422965311034337652L;
    private static int g = 1;
    private static int i;
    private final Map<String, String> a;
    private String d;
    private int e;
    private InterfaceC5034brD f;
    protected int q;
    public aOV s;
    protected long t;

    public String J() {
        int i2 = 2 % 2;
        int i3 = i;
        int i4 = i3 + 49;
        g = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 95;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 82 / 0;
        }
        return null;
    }

    protected abstract String K();

    protected boolean M() {
        int i2 = 2 % 2;
        int i3 = i + 27;
        int i4 = i3 % 128;
        g = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 81;
        i = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public boolean O() {
        int i2 = 2 % 2;
        int i3 = i + 113;
        int i4 = i3 % 128;
        g = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 17;
        i = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public boolean S() {
        int i2 = 2 % 2;
        int i3 = i;
        int i4 = i3 + 77;
        g = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 61;
        g = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected boolean X() {
        int i2 = 2 % 2;
        int i3 = i + 105;
        int i4 = i3 % 128;
        g = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 19;
        i = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 28 / 0;
        }
        return true;
    }

    protected abstract String a(String str);

    public abstract void a(ApiEndpointRegistry apiEndpointRegistry);

    protected abstract void a(T t);

    protected abstract T a_(String str, String str2);

    public long aa() {
        int i2 = 2 % 2;
        int i3 = i + 85;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            return this.t;
        }
        throw null;
    }

    public boolean ab() {
        boolean z;
        int i2 = 2 % 2;
        if (this.f != null) {
            int i3 = g + 33;
            i = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = i + 33;
            g = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        int i7 = g + 53;
        i = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 69 / 0;
        }
        return z;
    }

    public void b(aOV aov) {
        int i2 = 2 % 2;
        int i3 = g;
        int i4 = i3 + 69;
        i = i4 % 128;
        int i5 = i4 % 2;
        this.s = aov;
        int i6 = i3 + 17;
        i = i6 % 128;
        int i7 = i6 % 2;
    }

    public abstract void d(Status status);

    public void e(InterfaceC5034brD interfaceC5034brD) {
        int i2 = 2 % 2;
        int i3 = i + 37;
        int i4 = i3 % 128;
        g = i4;
        int i5 = i3 % 2;
        this.f = interfaceC5034brD;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 61;
        i = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 89 / 0;
        }
    }

    @Override // com.netflix.android.volley.Request
    public String u() {
        int i2 = 2 % 2;
        int i3 = g + 103;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            return this.d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.netflix.android.volley.Request
    public int v() {
        int i2 = 2 % 2;
        int i3 = i + 15;
        int i4 = i3 % 128;
        g = i4;
        int i5 = i3 % 2;
        int i6 = this.e;
        int i7 = i4 + 107;
        i = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        throw null;
    }

    public AbstractC5042brL(int i2) {
        super(i2, null, null);
        this.a = new HashMap(1);
        e(false);
        this.t = SystemClock.elapsedRealtime();
    }

    public void g(String str) {
        int i2 = 2 % 2;
        if (this.d != null) {
            throw new IllegalStateException("Can not change the URL of a VolleyWebCLientRequest.");
        }
        String a = a(str);
        this.d = a;
        this.e = TextUtils.isEmpty(a) ? 0 : Uri.parse(this.d).getHost().hashCode();
        if (TextUtils.isEmpty(this.d)) {
            int i3 = g + 47;
            i = i3 % 128;
            int i4 = i3 % 2;
            this.e = 0;
            return;
        }
        String host = Uri.parse(this.d).getHost();
        if (host != null) {
            this.e = host.hashCode();
            return;
        }
        int i5 = g;
        int i6 = i5 + 55;
        i = i6 % 128;
        int i7 = i6 % 2;
        this.e = 0;
        int i8 = i5 + 21;
        i = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.netflix.android.volley.Request
    public void b(String str) {
        int i2 = 2 % 2;
        int i3 = i + 57;
        g = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.d = Request.b(this.d, str);
            this.e = str.hashCode();
            int i4 = i + 47;
            g = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.d = Request.b(this.d, str);
        this.e = str.hashCode();
        throw null;
    }

    @Override // com.netflix.android.volley.Request
    public Request.Priority s() {
        int i2 = 2 % 2;
        int i3 = i + 99;
        g = i3 % 128;
        int i4 = i3 % 2;
        Request.Priority priority = Request.Priority.HIGH;
        int i5 = i + 77;
        g = i5 % 128;
        int i6 = i5 % 2;
        return priority;
    }

    @Override // com.netflix.android.volley.Request
    public Map<String, String> j() {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        String a = C8284dhV.a();
        if (!(!C8168dfL.h(a))) {
            int i3 = i + 17;
            g = i3 % 128;
            int i4 = i3 % 2;
            a(sb, "nfvdid", a);
        }
        String b = C8284dhV.b();
        if (C8168dfL.h(b)) {
            a(sb, "flwssn", b);
        }
        String c = C8284dhV.c();
        if (C8168dfL.h(c)) {
            a(sb, "netflix-mfa-nonce", c);
        }
        if (!Y()) {
            a(sb, this.f.f(), this.f.i());
            a(sb, this.f.g(), this.f.j(), true);
        }
        String sb2 = sb.toString();
        this.a.put("Cookie", sb2);
        InterfaceC5034brD interfaceC5034brD = this.f;
        if (interfaceC5034brD != null) {
            int i5 = g + 105;
            i = i5 % 128;
            if (i5 % 2 == 0) {
                String d = interfaceC5034brD.d();
                if (C8168dfL.h(d)) {
                    this.a.put("X-Netflix.request.client.user.guid", d);
                    int i6 = i + 45;
                    g = i6 % 128;
                    int i7 = i6 % 2;
                }
            } else {
                C8168dfL.h(interfaceC5034brD.d());
                throw null;
            }
        }
        this.a.put("Cookie", sb2);
        InterfaceC9814xA t = t();
        if (t == null) {
            Map<String, String> map = this.a;
            Object[] objArr = new Object[1];
            ad(new char[]{24379, 45089, 59153, 39673}, new char[]{0, 0, 0, 0}, 296755551, (char) 63975, new char[]{35814}, objArr);
            map.put("X-Netflix.Request.Attempt", ((String) objArr[0]).intern());
        } else {
            this.a.put("X-Netflix.Request.Attempt", Integer.toString(t.b() + 1));
        }
        if (TS.c.b(AbstractApplicationC1040Mh.d()).d()) {
            this.a.put("X-Netflix.zuul.brotli.allowed", "true");
        }
        e(this.a);
        return this.a;
    }

    private void e(Map<String, String> map) {
        int i2 = 2 % 2;
        int i3 = i + 11;
        g = i3 % 128;
        int i4 = i3 % 2;
        if (Y()) {
            return;
        }
        aOV aov = this.s;
        if (aov != null && aov.w() != null) {
            int i5 = i + 13;
            g = i5 % 128;
            if (i5 % 2 == 0) {
                this.s.w().k();
                Object obj = null;
                obj.hashCode();
                throw null;
            } else if (this.s.w().k() != null) {
                map.put("X-Netflix.esn", "" + this.s.w().m());
            }
        }
        map.put("X-Netflix.session.id", "" + C8127deX.d());
        int i6 = i + 53;
        g = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void a(StringBuilder sb, String str, String str2) {
        int i2 = 2 % 2;
        int i3 = i + 35;
        g = i3 % 128;
        int i4 = i3 % 2;
        a(sb, str, str2, false);
        int i5 = g + 23;
        i = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static void a(StringBuilder sb, String str, String str2, boolean z) {
        int i2 = 2 % 2;
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        if (!z) {
            int i3 = i + 3;
            g = i3 % 128;
            if (i3 % 2 == 0) {
                sb.append("; ");
                int i4 = 16 / 0;
            } else {
                sb.append("; ");
            }
        }
        int i5 = i + 71;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (o.C8168dfL.g(r4.f.j()) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (o.C8168dfL.g(r4.f.j()) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        r1 = o.AbstractC5042brL.g + 73;
        o.AbstractC5042brL.i = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Y() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            o.brD r1 = r4.f
            if (r1 == 0) goto L5b
            int r2 = o.AbstractC5042brL.i
            int r2 = r2 + 71
            int r3 = r2 % 128
            o.AbstractC5042brL.g = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L4f
            java.lang.String r1 = r1.i()
            boolean r1 = o.C8168dfL.g(r1)
            if (r1 != 0) goto L5b
            int r1 = o.AbstractC5042brL.i
            int r1 = r1 + 89
            int r2 = r1 % 128
            o.AbstractC5042brL.g = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L38
            o.brD r1 = r4.f
            java.lang.String r1 = r1.j()
            boolean r1 = o.C8168dfL.g(r1)
            r3 = 47
            int r3 = r3 / r2
            if (r1 == 0) goto L45
            goto L5b
        L38:
            o.brD r1 = r4.f
            java.lang.String r1 = r1.j()
            boolean r1 = o.C8168dfL.g(r1)
            if (r1 == 0) goto L45
            goto L5b
        L45:
            int r1 = o.AbstractC5042brL.g
            int r1 = r1 + 73
            int r3 = r1 % 128
            o.AbstractC5042brL.i = r3
            int r1 = r1 % r0
            goto L5c
        L4f:
            java.lang.String r0 = r1.i()
            o.C8168dfL.g(r0)
            r0 = 0
            r0.hashCode()
            throw r0
        L5b:
            r2 = 1
        L5c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC5042brL.Y():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r4 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        r4 = r4.get("X-Netflix.eas.identity.mismatchack");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (o.C8168dfL.g(r4) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        r4 = o.AbstractC5042brL.g + 15;
        o.AbstractC5042brL.i = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
        if ((r4 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        r4 = "true".equalsIgnoreCase(r4);
        r1 = o.AbstractC5042brL.i + 115;
        o.AbstractC5042brL.g = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r4 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static boolean e(o.C9858xs r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            if (r4 == 0) goto L49
            int r2 = o.AbstractC5042brL.g
            int r2 = r2 + 49
            int r3 = r2 % 128
            o.AbstractC5042brL.i = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L19
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.d
            r2 = 82
            int r2 = r2 / r1
            if (r4 != 0) goto L1e
            goto L49
        L19:
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.d
            if (r4 != 0) goto L1e
            goto L49
        L1e:
            java.lang.String r2 = "X-Netflix.eas.identity.mismatchack"
            java.lang.Object r4 = r4.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            boolean r2 = o.C8168dfL.g(r4)
            if (r2 == 0) goto L39
            int r4 = o.AbstractC5042brL.g
            int r4 = r4 + 15
            int r2 = r4 % 128
            o.AbstractC5042brL.i = r2
            int r4 = r4 % r0
            if (r4 == 0) goto L38
            r1 = 1
        L38:
            return r1
        L39:
            java.lang.String r1 = "true"
            boolean r4 = r1.equalsIgnoreCase(r4)
            int r1 = o.AbstractC5042brL.i
            int r1 = r1 + 115
            int r2 = r1 % 128
            o.AbstractC5042brL.g = r2
            int r1 = r1 % r0
            return r4
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC5042brL.e(o.xs):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r2 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        r14.q = r2.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
        if (r5 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
        if (r5 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
        r10 = r14.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
        if (r10 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
        r12 = r12 + 71;
        o.AbstractC5042brL.g = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
        if ((r12 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
        r10.c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
        r10.c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r2 != null) goto L7;
     */
    @Override // com.netflix.android.volley.Request
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.C9864xy<T> b(o.C9858xs r15) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC5042brL.b(o.xs):o.xy");
    }

    @Override // com.netflix.android.volley.Request
    public void b(T t) {
        int i2 = 2 % 2;
        int i3 = g + 83;
        i = i3 % 128;
        int i4 = i3 % 2;
        this.t = SystemClock.elapsedRealtime() - this.t;
        a((AbstractC5042brL<T>) t);
        int i5 = i + 33;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netflix.android.volley.Request
    public void a_(VolleyError volleyError) {
        int i2 = 2 % 2;
        C1044Mm.j("nf_volleyrequest", "VolleyError: %s", volleyError.getMessage());
        this.t = SystemClock.elapsedRealtime() - this.t;
        if (volleyError.b != null) {
            C1044Mm.e("nf_volleyrequest", "Error on response:" + new String(volleyError.b.c));
            int i3 = g + 17;
            i = i3 % 128;
            int i4 = i3 % 2;
        }
        d((Status) C8237dgb.a(volleyError, StatusCode.NET_GENERAL_NETWORK_ERROR));
        int i5 = i + 13;
        g = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (o.C8168dfL.g(r2) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean ac() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            o.brD r1 = r6.f
            if (r1 == 0) goto L1b
            java.lang.String r1 = r1.d()
            o.brD r2 = r6.f
            java.lang.String r2 = r2.b()
            int r3 = o.AbstractC5042brL.i
            int r3 = r3 + 117
            int r4 = r3 % 128
            o.AbstractC5042brL.g = r4
            int r3 = r3 % r0
            goto L1d
        L1b:
            r1 = 0
            r2 = r1
        L1d:
            boolean r3 = r6.M()
            if (r3 == 0) goto L3a
            boolean r3 = o.C8168dfL.g(r1)
            r4 = 1
            if (r3 == r4) goto L39
            int r3 = o.AbstractC5042brL.i
            int r3 = r3 + 93
            int r5 = r3 % 128
            o.AbstractC5042brL.g = r5
            int r3 = r3 % r0
            boolean r3 = o.C8168dfL.g(r2)
            if (r3 == 0) goto L3a
        L39:
            return r4
        L3a:
            if (r1 != 0) goto L47
            int r1 = o.AbstractC5042brL.g
            int r1 = r1 + 91
            int r2 = r1 % 128
            o.AbstractC5042brL.i = r2
            int r1 = r1 % r0
            r0 = 0
            return r0
        L47:
            boolean r0 = r1.equalsIgnoreCase(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC5042brL.ac():boolean");
    }

    private static void ad(char[] cArr, char[] cArr2, int i2, char c, char[] cArr3, Object[] objArr) {
        int i3 = 2 % 2;
        C9585sR c9585sR = new C9585sR();
        int length = cArr.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        c9585sR.d = 0;
        int i4 = $10 + 29;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (c9585sR.d < length3) {
            int i6 = $10 + 25;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = (c9585sR.d + 2) % 4;
            int i9 = (c9585sR.d + 3) % 4;
            c9585sR.a = (char) (((cArr4[c9585sR.d % 4] * 32718) + cArr5[i8]) % 65535);
            cArr5[i9] = (char) (((cArr4[i9] * 32718) + cArr5[i8]) / 65535);
            cArr4[i9] = c9585sR.a;
            cArr6[c9585sR.d] = (char) ((((cArr4[i9] ^ cArr3[c9585sR.d]) ^ (d$s74$3210 ^ (-6422965311034337652L))) ^ ((int) (a$s75$3210 ^ (-6422965311034337652L)))) ^ ((char) (b$s76$3210 ^ (-6422965311034337652L))));
            c9585sR.d++;
        }
        objArr[0] = new String(cArr6);
    }
}
