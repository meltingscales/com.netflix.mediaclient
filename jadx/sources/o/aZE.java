package o;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.netflix.android.volley.Request;
import com.netflix.android.volley.ServerError;
import com.netflix.android.volley.VolleyError;
import com.netflix.cl.model.SignOutReason;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.volley.StatusCodeError;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.msl.MslConstants;
import com.netflix.msl.MslErrorException;
import com.netflix.msl.MslException;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC5129bst;

/* loaded from: classes3.dex */
public abstract class aZE<T> extends Request<T> implements InterfaceC5089bsF {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int A = 0;
    private static int a$s75$6726 = 0;
    private static char b$s76$6726 = 0;
    private static long d$s74$6726 = 0;
    protected static AtomicBoolean j = null;
    private static int z = 1;
    private boolean a;
    private int d;
    private boolean e;
    private InterfaceC5128bss f;
    protected long g;
    protected long h;
    public aOV i;
    protected boolean k;
    protected InterfaceC5093bsJ l;
    public InterfaceC5129bst m;
    protected String n;

    /* renamed from: o  reason: collision with root package name */
    protected long f13461o;
    protected UserAgent p;
    protected String q;
    protected long r;
    protected int s;
    protected int t;
    protected UUID u;
    private InterfaceC8387djs v;
    protected boolean w;
    private String x;
    private String y;

    static void am() {
        d$s74$6726 = -6422965311034337652L;
        a$s75$6726 = 256957912;
        b$s76$6726 = (char) 22156;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean F_() {
        int i = 2 % 2;
        int i2 = z;
        int i3 = i2 + 67;
        A = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 85;
        A = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    protected String G_() {
        int i = 2 % 2;
        int i2 = A + 105;
        int i3 = i2 % 128;
        z = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 9;
        A = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
        return null;
    }

    protected abstract void L();

    public String O() {
        int i = 2 % 2;
        int i2 = A + 113;
        z = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
            return this.x;
        }
        return this.x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean Q() {
        int i = 2 % 2;
        int i2 = A;
        int i3 = i2 + 109;
        z = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 75;
        z = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public boolean V() {
        int i = 2 % 2;
        int i2 = z + 89;
        A = i2 % 128;
        return i2 % 2 != 0;
    }

    protected long Y() {
        int i = 2 % 2;
        int i2 = A + 23;
        z = i2 % 128;
        if (i2 % 2 != 0) {
            return this.g;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected abstract void a(T t);

    public void a(InterfaceC5128bss interfaceC5128bss) {
        int i = 2 % 2;
        int i2 = A + 51;
        int i3 = i2 % 128;
        z = i3;
        int i4 = i2 % 2;
        this.f = interfaceC5128bss;
        int i5 = i3 + 27;
        A = i5 % 128;
        int i6 = i5 % 2;
    }

    public void a(InterfaceC8387djs interfaceC8387djs) {
        int i = 2 % 2;
        int i2 = z + 9;
        int i3 = i2 % 128;
        A = i3;
        int i4 = i2 % 2;
        this.v = interfaceC8387djs;
        int i5 = i3 + 59;
        z = i5 % 128;
        int i6 = i5 % 2;
    }

    public InterfaceC8387djs aa() {
        int i = 2 % 2;
        int i2 = z;
        int i3 = i2 + NetflixImageView.DEFAULT_LAYER_GRAVITY;
        A = i3 % 128;
        int i4 = i3 % 2;
        InterfaceC8387djs interfaceC8387djs = this.v;
        int i5 = i2 + 41;
        A = i5 % 128;
        int i6 = i5 % 2;
        return interfaceC8387djs;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean ac() {
        int i = 2 % 2;
        int i2 = z;
        int i3 = i2 + 45;
        A = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 61;
        A = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    protected Boolean ae() {
        int i = 2 % 2;
        int i2 = A + 19;
        z = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = Boolean.FALSE;
        int i4 = z + 19;
        A = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    public void c(int i) {
        int i2 = 2 % 2;
        int i3 = A;
        int i4 = i3 + 11;
        z = i4 % 128;
        int i5 = i4 % 2;
        this.s = i;
        int i6 = i3 + 9;
        z = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 58 / 0;
        }
    }

    public void c(InterfaceC5093bsJ interfaceC5093bsJ) {
        int i = 2 % 2;
        int i2 = z;
        int i3 = i2 + 33;
        A = i3 % 128;
        int i4 = i3 % 2;
        this.l = interfaceC5093bsJ;
        int i5 = i2 + 41;
        A = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 5 / 0;
        }
    }

    public abstract C8386djr d(Map<String, String> map);

    public void d(UserAgent userAgent) {
        int i = 2 % 2;
        int i2 = z;
        int i3 = i2 + 65;
        A = i3 % 128;
        int i4 = i3 % 2;
        this.p = userAgent;
        int i5 = i2 + NetflixImageView.DEFAULT_LAYER_GRAVITY;
        A = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected abstract void e(Status status);

    public void e(InterfaceC5129bst interfaceC5129bst) {
        int i = 2 % 2;
        int i2 = z + 101;
        int i3 = i2 % 128;
        A = i3;
        int i4 = i2 % 2;
        this.m = interfaceC5129bst;
        int i5 = i3 + 39;
        z = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected abstract boolean e(Exception exc);

    @Override // com.netflix.android.volley.Request
    public String u() {
        int i = 2 % 2;
        int i2 = A + 23;
        z = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 13 / 0;
            return this.q;
        }
        return this.q;
    }

    @Override // com.netflix.android.volley.Request
    public int v() {
        int i = 2 % 2;
        int i2 = A;
        int i3 = i2 + 125;
        z = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.d;
        int i6 = i2 + 69;
        z = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static {
        am();
        j = new AtomicBoolean(false);
        int i = A + 41;
        z = i % 128;
        int i2 = i % 2;
    }

    public aZE(int i) {
        super(i, null, null);
        this.r = -1L;
        this.a = false;
        this.e = false;
        this.y = null;
        e(false);
        this.u = UUID.randomUUID();
        this.g = SystemClock.elapsedRealtime();
    }

    public void k(String str) {
        int i = 2 % 2;
        if (this.q != null) {
            int i2 = z + 115;
            A = i2 % 128;
            int i3 = i2 % 2;
            C1044Mm.e("nf_volleyrequest", "Reusing existing request...");
            return;
        }
        this.q = str;
        if (!(!TextUtils.isEmpty(str))) {
            this.d = 0;
            return;
        }
        Uri parse = Uri.parse(this.q);
        String host = parse.getHost();
        String path = parse.getPath();
        this.x = path;
        if (path.startsWith("/msl")) {
            int i4 = A + 21;
            z = i4 % 128;
            this.x = i4 % 2 == 0 ? this.x.substring(2) : this.x.substring(4);
            int i5 = z + 5;
            A = i5 % 128;
            int i6 = i5 % 2;
        }
        if (host != null) {
            this.d = host.hashCode();
            return;
        }
        int i7 = A + 7;
        z = i7 % 128;
        if (i7 % 2 == 0) {
            this.d = 1;
        } else {
            this.d = 0;
        }
    }

    @Override // com.netflix.android.volley.Request
    public void b(String str) {
        int i = 2 % 2;
        int i2 = A + 49;
        z = i2 % 128;
        if (i2 % 2 != 0) {
            this.q = Request.b(this.q, str);
            this.d = str.hashCode();
            int i3 = z + NetflixImageView.DEFAULT_LAYER_GRAVITY;
            A = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.q = Request.b(this.q, str);
        this.d = str.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.netflix.android.volley.Request
    public void b(T t) {
        int i = 2 % 2;
        this.g = SystemClock.elapsedRealtime() - this.g;
        Y();
        InterfaceC8387djs interfaceC8387djs = this.v;
        if (interfaceC8387djs != null) {
            int i2 = A + 113;
            z = i2 % 128;
            int i3 = i2 % 2;
            if (interfaceC8387djs.k() != null) {
                C4221baS.a(this.v.k());
            }
        }
        a((aZE<T>) t);
        int i4 = A + 53;
        z = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netflix.android.volley.Request
    public void a_(VolleyError volleyError) {
        int i = 2 % 2;
        int i2 = z + 57;
        A = i2 % 128;
        int i3 = i2 % 2;
        if (volleyError.b != null) {
            C1044Mm.e("nf_volleyrequest", "Error on response:" + new String(volleyError.b.c));
        }
        if (this.w) {
            int i4 = A + 89;
            z = i4 % 128;
            int i5 = i4 % 2;
            this.w = false;
            if (this.m != null) {
                C1044Mm.a("nf_volleyrequest", "Retry request %s", getClass().getSimpleName());
                this.m.a(this);
                return;
            }
        }
        this.g = SystemClock.elapsedRealtime() - this.g;
        NetflixStatus a = C8237dgb.a(volleyError, StatusCode.NET_GENERAL_NETWORK_ERROR);
        b(a);
        InterfaceC8387djs interfaceC8387djs = this.v;
        if (interfaceC8387djs != null && ConnectivityUtils.l(interfaceC8387djs.k()) && new Random().nextInt(1000) == 31) {
            InterfaceC1598aHf.e(volleyError.getMessage(), volleyError);
        }
        e(a);
    }

    protected void b(NetflixStatus netflixStatus) {
        int i = 2 % 2;
        int i2 = A + 9;
        z = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        } else if (netflixStatus != null && netflixStatus.c() == StatusCode.MSL_USERAUTH_ENTITY_MISMATCH) {
            C1044Mm.e("nf_volleyrequest", "processStatus:: MSL_USERAUTH_ENTITY_MISMATCH, clear ESN depended saved data...");
            this.i.d();
            int i3 = z + 103;
            A = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public void e(aOV aov) {
        int i = 2 % 2;
        int i2 = z + 13;
        A = i2 % 128;
        int i3 = i2 % 2;
        this.i = aov;
        L();
        int i4 = z + 105;
        A = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netflix.android.volley.Request
    public Map<String, String> j() {
        InterfaceC1843aQh interfaceC1843aQh;
        int i = 2 % 2;
        Map<String, String> j2 = super.j();
        if (j2 == null || j2 == Collections.EMPTY_MAP) {
            j2 = new HashMap<>();
        }
        j2.put("X-Netflix.request.uuid", "" + this.u);
        aOV aov = this.i;
        Object obj = null;
        if (aov == null || aov.w() == null) {
            interfaceC1843aQh = null;
        } else {
            int i2 = A + 95;
            z = i2 % 128;
            int i3 = i2 % 2;
            interfaceC1843aQh = this.i.w();
        }
        c(j2);
        if (interfaceC1843aQh.k() != null) {
            j2 = aJM.e(j2, interfaceC1843aQh.k(), C8055ddE.e(AbstractApplicationC1040Mh.d()));
        }
        InterfaceC9814xA t = t();
        if (t != null) {
            int i4 = z + 55;
            A = i4 % 128;
            int i5 = i4 % 2;
            int b = t.b();
            j2.put("X-Netflix.Request.Attempt", Integer.toString(i5 != 0 ? b - 1 : b + 1));
        } else {
            Object[] objArr = new Object[1];
            ai(new char[]{46436, 61448, 17404, 34739}, new char[]{0, 0, 0, 0}, -51377995, (char) 45891, new char[]{54092}, objArr);
            j2.put("X-Netflix.Request.Attempt", ((String) objArr[0]).intern());
        }
        if (TS.c.b(AbstractApplicationC1040Mh.d()).d()) {
            int i6 = A + 43;
            z = i6 % 128;
            if (i6 % 2 == 0) {
                j2.put("X-Netflix.zuul.brotli.allowed", "true");
                obj.hashCode();
                throw null;
            }
            j2.put("X-Netflix.zuul.brotli.allowed", "true");
        }
        a(j2);
        int i7 = A + 95;
        z = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 19 / 0;
        }
        return j2;
    }

    private void a(Map<String, String> map) {
        InterfaceC5093bsJ interfaceC5093bsJ;
        int i = 2 % 2;
        int i2 = z + 103;
        int i3 = i2 % 128;
        A = i3;
        if (i2 % 2 != 0) {
            interfaceC5093bsJ = this.l;
            int i4 = 30 / 0;
            if (interfaceC5093bsJ == null) {
                return;
            }
        } else {
            interfaceC5093bsJ = this.l;
            if (interfaceC5093bsJ == null) {
                return;
            }
        }
        int i5 = i3 + 9;
        z = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            interfaceC5093bsJ.d();
            throw null;
        } else if (interfaceC5093bsJ.d() != null) {
            aOV aov = this.i;
            if (aov != null) {
                int i6 = z + 69;
                A = i6 % 128;
                if (i6 % 2 != 0) {
                    aov.w();
                    obj.hashCode();
                    throw null;
                } else if (aov.w() != null) {
                    int i7 = A + 125;
                    z = i7 % 128;
                    int i8 = i7 % 2;
                    if (this.i.w().m() != null) {
                        map.put("X-Netflix.esn", "" + this.i.w().m());
                    }
                }
            }
            map.put("X-Netflix.session.id", "" + C8127deX.d());
        }
    }

    private void c(Map<String, String> map) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        if (T_() != null) {
            String b = C8284dhV.b();
            String c = C8284dhV.c();
            String a = C8284dhV.a();
            if (C8168dfL.h(b)) {
                d(sb, "flwssn", b, false);
            }
            if (C8168dfL.h(c)) {
                int i2 = z + 67;
                A = i2 % 128;
                int i3 = i2 % 2;
                d(sb, "netflix-mfa-nonce", c, false);
            }
            if (!(!C8168dfL.h(a))) {
                d(sb, "nfvdid", a, true);
            }
        }
        map.put("cookie", sb.toString());
        int i4 = z + 55;
        A = i4 % 128;
        int i5 = i4 % 2;
    }

    private void d(StringBuilder sb, String str, String str2, boolean z2) {
        int i = 2 % 2;
        int i2 = z + 125;
        A = i2 % 128;
        int i3 = i2 % 2;
        sb.append(str);
        sb.append("=");
        if (i3 != 0) {
            sb.append(str2);
            int i4 = 62 / 0;
            if (z2) {
                return;
            }
        } else {
            sb.append(str2);
            if (z2) {
                return;
            }
        }
        sb.append("; ");
        int i5 = A + 55;
        z = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.netflix.android.volley.Request
    public String a() {
        int i = 2 % 2;
        String str = "application/msl; charset=" + n();
        int i2 = A + 81;
        z = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public boolean c(Status status) {
        int i = 2 % 2;
        if (aQQ.j()) {
            int i2 = z + 11;
            A = i2 % 128;
            int i3 = i2 % 2;
            if (this.m != null && !status.j() && (status instanceof BasePlayErrorStatus)) {
                int i4 = z + 79;
                A = i4 % 128;
                int i5 = i4 % 2;
                if (((BasePlayErrorStatus) status).m() == 2) {
                    int i6 = A + 3;
                    z = i6 % 128;
                    int i7 = i6 % 2;
                    InterfaceC9814xA t = t();
                    if (t != null) {
                        try {
                            t.c(new VolleyError());
                            C1044Mm.a("nf_volleyrequest", "found NQ error that can be retried. retrying this %s", getClass().getSimpleName());
                            return true;
                        } catch (VolleyError unused) {
                            C1044Mm.e("nf_volleyrequest", "found NQ error that can be retried. retires exhausted - bubbling up error");
                        }
                    }
                }
            }
        }
        return false;
    }

    public String x_() {
        int i = 2 % 2;
        int i2 = z + 35;
        A = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            i();
            obj.hashCode();
            throw null;
        } else if (i() == 0) {
            String J2 = J();
            int i3 = A + 111;
            z = i3 % 128;
            int i4 = i3 % 2;
            return J2;
        } else {
            int i5 = A + 91;
            z = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
    }

    public Map<String, String> ab() {
        int i = 2 % 2;
        int i2 = z + 59;
        A = i2 % 128;
        Map<String, String> map = null;
        try {
        } catch (Throwable th) {
            C1044Mm.b("nf_volleyrequest", th, "Failed to get MSL headers", new Object[0]);
        }
        if (i2 % 2 != 0) {
            j();
            map.hashCode();
            throw null;
        }
        map = j();
        int i3 = A + 109;
        z = i3 % 128;
        int i4 = i3 % 2;
        return map;
    }

    public String w_() {
        int i = 2 % 2;
        int i2 = z + 91;
        A = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (V()) {
            int i4 = z + 9;
            A = i4 % 128;
            if (i4 % 2 == 0) {
                return G_();
            }
            G_();
            obj.hashCode();
            throw null;
        } else if (i() == 0) {
            return null;
        } else {
            return J();
        }
    }

    private String J() {
        int i = 2 % 2;
        Object obj = null;
        try {
            Map<String, String> o2 = o();
            if (o2 == null || o2.size() <= 0) {
                int i2 = A + 51;
                z = i2 % 128;
                if (i2 % 2 != 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            String a = a(o2, n());
            int i3 = z + 71;
            A = i3 % 128;
            int i4 = i3 % 2;
            return a;
        } catch (Throwable th) {
            C1044Mm.b("nf_volleyrequest", th, "Failed to get BODY as string", new Object[0]);
            return null;
        }
    }

    public InterfaceC5093bsJ Z() {
        int i = 2 % 2;
        if (!(!C1876aRn.n())) {
            int i2 = z + 47;
            A = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            InterfaceC5093bsJ interfaceC5093bsJ = this.l;
            if (interfaceC5093bsJ != null) {
                this.y = interfaceC5093bsJ.d();
                int i3 = A + 13;
                z = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Boolean d(AbstractC8424dlb abstractC8424dlb) {
        int i = 2 % 2;
        int i2 = z;
        int i3 = i2 + 109;
        A = i3 % 128;
        int i4 = i3 % 2;
        if (abstractC8424dlb != null) {
            int i5 = i2 + 115;
            A = i5 % 128;
            if (i5 % 2 == 0) {
                return Boolean.TRUE;
            }
            Boolean bool = Boolean.TRUE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        return ae();
    }

    protected void c(MslErrorException mslErrorException) {
        int i = 2 % 2;
        int i2 = z + 15;
        A = i2 % 128;
        if (i2 % 2 == 0) {
            C8416dku c = mslErrorException.c();
            MslConstants.ResponseCode c2 = c.c();
            if (c2 == MslConstants.ResponseCode.USER_REAUTH || c2 == MslConstants.ResponseCode.USERDATA_REAUTH) {
                c(c);
                int i3 = z + 61;
                A = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            Status d = this.m.d(mslErrorException);
            if (d != null) {
                C1044Mm.j("nf_volleyrequest", "Special treatment for %s, resulting in status code %s", c2.name(), d.c());
                return;
            }
            C1044Mm.a("nf_volleyrequest", "No special treatment for %s", c2.name());
            int i5 = z + 11;
            A = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        mslErrorException.c().c();
        MslConstants.ResponseCode responseCode = MslConstants.ResponseCode.USER_REAUTH;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r1.c() == null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        if ((r1.c() instanceof o.dkV) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        o.C1044Mm.d("nf_volleyrequest", "User re-authorization required, while in change profile workflow. Most likely targeted profile is deleted and device is out of sync.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        throw new com.netflix.mediaclient.service.msl.client.ProfileSwitchFailedException("User re-authorization required, while in change profile workflow. Most likely targeted profile is deleted and device is out of sync.", com.netflix.mediaclient.StatusCode.MSL_REFRESH_PROFILE_LIST, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r1 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0138, code lost:
        if (r5.equals(r1) != true) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1 != null) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void c(o.C8416dku r10) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aZE.c(o.dku):void");
    }

    @Override // com.netflix.android.volley.Request
    public Map<String, String> o() {
        int i = 2 % 2;
        int i2 = A + NetflixImageView.DEFAULT_LAYER_GRAVITY;
        z = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> o2 = super.o();
        if (o2 == null) {
            C8190dfh c8190dfh = new C8190dfh();
            int i4 = A + 7;
            z = i4 % 128;
            int i5 = i4 % 2;
            return c8190dfh;
        } else if (o2 instanceof InterfaceC8195dfm) {
            return o2;
        } else {
            C8190dfh c8190dfh2 = new C8190dfh(o2.size());
            c8190dfh2.putAll(o2);
            return c8190dfh2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r1.c() != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        o.C1044Mm.b("nf_volleyrequest", r9, "API request failed with MSL error exception, error message: %s, error code %d, error code: %s %d", r1.e(), java.lang.Integer.valueOf(r1.a()), r1.c().name(), java.lang.Integer.valueOf(r1.c().e()));
        c(r9);
        r9 = o.aZE.A + 73;
        o.aZE.z = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
        o.C1044Mm.b("nf_volleyrequest", r9, "API request failed with MSL error exception, error message: %s, error code %d, error code: null", r1.e(), java.lang.Integer.valueOf(r1.a()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (r1.c() != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(com.netflix.msl.MslErrorException r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.aZE.A
            int r1 = r1 + 5
            int r2 = r1 % 128
            o.aZE.z = r2
            int r1 = r1 % r0
            o.dku r1 = r9.c()
            java.lang.String r2 = "nf_volleyrequest"
            r3 = 0
            if (r1 == 0) goto L85
            int r4 = o.aZE.A
            int r4 = r4 + 95
            int r5 = r4 % 128
            o.aZE.z = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L2a
            com.netflix.msl.MslConstants$ResponseCode r4 = r1.c()
            r5 = 45
            int r5 = r5 / r3
            if (r4 == 0) goto L6f
            goto L30
        L2a:
            com.netflix.msl.MslConstants$ResponseCode r4 = r1.c()
            if (r4 == 0) goto L6f
        L30:
            java.lang.String r4 = r1.e()
            int r5 = r1.a()
            com.netflix.msl.MslConstants$ResponseCode r6 = r1.c()
            java.lang.String r6 = r6.name()
            com.netflix.msl.MslConstants$ResponseCode r1 = r1.c()
            int r1 = r1.e()
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r3] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r5 = 1
            r7[r5] = r4
            r7[r0] = r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 3
            r7[r4] = r1
            java.lang.String r1 = "API request failed with MSL error exception, error message: %s, error code %d, error code: %s %d"
            o.C1044Mm.b(r2, r9, r1, r7)
            r8.c(r9)
            int r9 = o.aZE.A
            int r9 = r9 + 73
            int r1 = r9 % 128
            o.aZE.z = r1
            int r9 = r9 % r0
            goto L8c
        L6f:
            java.lang.String r4 = r1.e()
            int r1 = r1.a()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r1}
            java.lang.String r4 = "API request failed with MSL error exception, error message: %s, error code %d, error code: null"
            o.C1044Mm.b(r2, r9, r4, r1)
            goto L8c
        L85:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r4 = "API request failed with MSL error exception, no error header found"
            o.C1044Mm.b(r2, r9, r4, r1)
        L8c:
            int r9 = o.aZE.z
            int r9 = r9 + 123
            int r1 = r9 % 128
            o.aZE.A = r1
            int r9 = r9 % r0
            if (r9 == 0) goto L9a
            r9 = 13
            int r9 = r9 / r3
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aZE.b(com.netflix.msl.MslErrorException):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        if ((r4 instanceof com.netflix.mediaclient.service.webclient.volley.StatusCodeError) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        aj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        if ((r4 instanceof com.netflix.android.volley.VolleyError) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        r1 = o.aZE.z + 97;
        o.aZE.A = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        if ((r1 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        r0 = 95 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        throw ((com.netflix.android.volley.VolleyError) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        throw ((com.netflix.android.volley.VolleyError) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
        throw new com.netflix.android.volley.VolleyError(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
        aj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        throw ((com.netflix.android.volley.VolleyError) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if ((!(r4 instanceof com.netflix.mediaclient.service.webclient.volley.StatusCodeError)) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.Exception r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r3.e(r4)
            if (r1 != 0) goto L4a
            int r1 = o.aZE.z
            int r1 = r1 + 83
            int r2 = r1 % 128
            o.aZE.A = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1e
            boolean r1 = r4 instanceof com.netflix.mediaclient.service.webclient.volley.StatusCodeError
            r2 = 2
            int r2 = r2 / 0
            r1 = r1 ^ 1
            if (r1 == 0) goto L44
            goto L22
        L1e:
            boolean r1 = r4 instanceof com.netflix.mediaclient.service.webclient.volley.StatusCodeError
            if (r1 != 0) goto L44
        L22:
            r3.aj()
            boolean r1 = r4 instanceof com.netflix.android.volley.VolleyError
            if (r1 == 0) goto L3e
            int r1 = o.aZE.z
            int r1 = r1 + 97
            int r2 = r1 % 128
            o.aZE.A = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L3b
            com.netflix.android.volley.VolleyError r4 = (com.netflix.android.volley.VolleyError) r4
            r0 = 95
            int r0 = r0 / 0
            throw r4
        L3b:
            com.netflix.android.volley.VolleyError r4 = (com.netflix.android.volley.VolleyError) r4
            throw r4
        L3e:
            com.netflix.android.volley.VolleyError r0 = new com.netflix.android.volley.VolleyError
            r0.<init>(r4)
            throw r0
        L44:
            r3.aj()
            com.netflix.android.volley.VolleyError r4 = (com.netflix.android.volley.VolleyError) r4
            throw r4
        L4a:
            java.lang.String r0 = "nf_volleyrequest"
            java.lang.String r1 = "Not authorized handled ny implementation"
            o.C1044Mm.d(r0, r1)
            com.netflix.android.volley.VolleyError r4 = (com.netflix.android.volley.VolleyError) r4
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aZE.a(java.lang.Exception):void");
    }

    protected boolean ad() {
        int i = 2 % 2;
        int i2 = A + 109;
        z = i2 % 128;
        if (i2 % 2 == 0) {
            Z();
            throw null;
        }
        InterfaceC5093bsJ Z = Z();
        if (Z == null) {
            int i3 = A + 5;
            z = i3 % 128;
            return i3 % 2 == 0;
        }
        return Z.c() instanceof dkX;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void aj() {
        int i = 2 % 2;
        int i2 = A + 73;
        z = i2 % 128;
        int i3 = i2 % 2;
        if (M()) {
            int i4 = z + 99;
            A = i4 % 128;
            int i5 = i4 % 2;
            j.set(false);
            int i6 = A + 7;
            z = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(C8380djl c8380djl) {
        int i = 2 % 2;
        int i2 = A + 77;
        z = i2 % 128;
        int i3 = i2 % 2;
        C1044Mm.a("nf_volleyrequest", "checkForErrors ApiHttpWrapper status: %s, ", Integer.valueOf(c8380djl.d()));
        if (c8380djl.d() == 404) {
            throw new StatusCodeError(StatusCode.HTTP_ERR_404, String.format("%d bad url? %s", Integer.valueOf(c8380djl.d()), u()));
        }
        int i4 = z + 43;
        A = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private boolean M() {
        int i = 2 % 2;
        if (!ag()) {
            int i2 = A + 113;
            z = i2 % 128;
            if (i2 % 2 == 0) {
                ad();
                Object obj = null;
                obj.hashCode();
                throw null;
            } else if (!ad()) {
                return false;
            } else {
                int i3 = A + 73;
                z = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        return true;
    }

    protected boolean ag() {
        int i = 2 % 2;
        int i2 = A + 115;
        z = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC5093bsJ Z = Z();
        if (Z == null) {
            int i4 = z + 109;
            A = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }
        return Z.c() instanceof dkY;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean af() {
        int i = 2 % 2;
        if (ag()) {
            int i2 = A + 37;
            z = i2 % 128;
            int i3 = i2 % 2;
            C1044Mm.e("nf_volleyrequest", "handleNotAuthorized:: Already tried to relogin using tokens...");
            j.set(false);
            return false;
        }
        C8378djj f = aa().f();
        if (f != null) {
            int i4 = A + 95;
            z = i4 % 128;
            int i5 = i4 % 2;
            dkO dko = f.e;
            if (i5 == 0) {
                throw null;
            }
            if (dko != null && f.c != null) {
                C1044Mm.j("nf_volleyrequest", "handleNotAuthorized:: According to MSL store, user was logged in before, check user agent");
                if (!this.p.v()) {
                    C1044Mm.d("nf_volleyrequest", "handleNotAuthorized:: Mismatch between user agent and MSL store, user is NOT logged in according to user agent, but its credentials are found in MSL store. We can not renew its credentials, log user out!");
                    this.k = true;
                    InterfaceC1598aHf.a(new C1596aHd("MSL logout:: reason reloginByMslFailed").b(false).b(ErrorType.p));
                    this.p.e(SignOutReason.reloginByMslFailed, false);
                    return false;
                }
                C1044Mm.e("nf_volleyrequest", "handleNotAuthorized:: User is currently logged in, we will try to refresh his credentials, since we received that he/she is not authorized.");
                c(e(f));
                this.t++;
                j.set(true);
                return true;
            }
        }
        return false;
    }

    protected InterfaceC5093bsJ e(C8378djj c8378djj) {
        int i = 2 % 2;
        InterfaceC5093bsJ c = c(c8378djj.b, new dkY(c8378djj.e, c8378djj.c));
        int i2 = A + 1;
        z = i2 % 128;
        int i3 = i2 % 2;
        return c;
    }

    protected InterfaceC5093bsJ a(InterfaceC5034brD interfaceC5034brD) {
        int i = 2 % 2;
        InterfaceC5093bsJ c = c(interfaceC5034brD.d(), new dkX(interfaceC5034brD.i(), interfaceC5034brD.j()));
        int i2 = A + 109;
        z = i2 % 128;
        if (i2 % 2 != 0) {
            return c;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected InterfaceC5093bsJ c(final String str, final AbstractC8424dlb abstractC8424dlb) {
        int i = 2 % 2;
        InterfaceC5093bsJ interfaceC5093bsJ = new InterfaceC5093bsJ() { // from class: o.aZE.5
            @Override // o.InterfaceC5093bsJ
            public AbstractC8424dlb c() {
                return abstractC8424dlb;
            }

            @Override // o.InterfaceC5093bsJ
            public String d() {
                return str;
            }
        };
        int i2 = z + 85;
        A = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
        }
        return interfaceC5093bsJ;
    }

    private static String a(Map<String, String> map, String str) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        try {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (!(!it.hasNext())) {
                Map.Entry<String, String> next = it.next();
                if (next.getValue() != null) {
                    int i2 = A + 47;
                    z = i2 % 128;
                    int i3 = i2 % 2;
                    sb.append(URLEncoder.encode(next.getKey(), str));
                    sb.append('=');
                    sb.append(URLEncoder.encode(next.getValue(), str));
                    sb.append('&');
                    int i4 = z + 79;
                    A = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
        if (r7.p.v() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
        o.C1044Mm.d("nf_volleyrequest", "MSL logout:: reason MSL. ESN mismatch: current ESN is not same one from master token, clear MSL store and try to recover");
        o.InterfaceC1598aHf.a(new o.C1596aHd("MSL logout:: reason MSL. ESN mismatch: current ESN is not same one from master token, clear MSL store and try to recover").b(false).b(com.netflix.mediaclient.api.logging.error.ErrorType.p).d(r8));
        r7.v.c();
        r7.k = true;
        r7.p.e(com.netflix.cl.model.SignOutReason.msl, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
        o.C1044Mm.d("nf_volleyrequest", "ESN mismatch: current ESN is not same one from master token, clear MSL store and try to recover");
        o.InterfaceC1598aHf.a(new o.C1596aHd("ESN mismatch: current ESN is not same one from master token, clear MSL store and try to recover").b(false).b(com.netflix.mediaclient.api.logging.error.ErrorType.p).d(r8));
        r7.v.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
        if (r7.p.v() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Throwable c(com.netflix.msl.MslException r8) {
        /*
            r7 = this;
            java.lang.String r0 = "ESN mismatch: current ESN is not same one from master token, clear MSL store and try to recover"
            r1 = 2
            int r2 = r1 % r1
            java.lang.Throwable r8 = b(r8)
            boolean r2 = r8 instanceof com.netflix.msl.MslCryptoException
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == r3) goto Lb1
            int r2 = o.aZE.A
            int r2 = r2 + 55
            int r4 = r2 % 128
            o.aZE.z = r4
            int r2 = r2 % r1
            r2 = r8
            com.netflix.msl.MslCryptoException r2 = (com.netflix.msl.MslCryptoException) r2
            java.lang.String r4 = "Encryption envelope key ID does not match crypto context key ID"
            java.lang.String r2 = r2.getMessage()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lb1
            int r2 = o.aZE.z
            int r2 = r2 + 103
            int r4 = r2 % 128
            o.aZE.A = r4
            int r2 = r2 % r1
            java.lang.String r4 = "nf_volleyrequest"
            r5 = 0
            if (r2 == 0) goto L41
            com.netflix.mediaclient.service.user.UserAgent r2 = r7.p
            boolean r2 = r2.v()
            r6 = 32
            int r6 = r6 / r5
            if (r2 == 0) goto L73
            goto L49
        L41:
            com.netflix.mediaclient.service.user.UserAgent r2 = r7.p
            boolean r2 = r2.v()
            if (r2 == 0) goto L73
        L49:
            java.lang.String r0 = "MSL logout:: reason MSL. ESN mismatch: current ESN is not same one from master token, clear MSL store and try to recover"
            o.C1044Mm.d(r4, r0)
            o.aHd r2 = new o.aHd
            r2.<init>(r0)
            o.aHd r0 = r2.b(r5)
            com.netflix.mediaclient.api.logging.error.ErrorType r2 = com.netflix.mediaclient.api.logging.error.ErrorType.p
            o.aHd r0 = r0.b(r2)
            o.aHd r0 = r0.d(r8)
            o.InterfaceC1598aHf.a(r0)
            o.djs r0 = r7.v
            r0.c()
            r7.k = r3
            com.netflix.mediaclient.service.user.UserAgent r0 = r7.p
            com.netflix.cl.model.SignOutReason r2 = com.netflix.cl.model.SignOutReason.msl
            r0.e(r2, r5)
            goto L91
        L73:
            o.C1044Mm.d(r4, r0)
            o.aHd r2 = new o.aHd
            r2.<init>(r0)
            o.aHd r0 = r2.b(r5)
            com.netflix.mediaclient.api.logging.error.ErrorType r2 = com.netflix.mediaclient.api.logging.error.ErrorType.p
            o.aHd r0 = r0.b(r2)
            o.aHd r0 = r0.d(r8)
            o.InterfaceC1598aHf.a(r0)
            o.djs r0 = r7.v
            r0.c()
        L91:
            o.bss r0 = r7.f
            o.aMk r2 = o.aMH.c()
            o.aSn r2 = r2.a()
            android.content.Context r3 = o.AbstractApplicationC1040Mh.d()
            com.netflix.mediaclient.StatusCode r4 = com.netflix.mediaclient.StatusCode.MSL_ESN_MISMATCH
            o.aSp r2 = r2.b(r3, r4)
            r0.b(r2)
            int r0 = o.aZE.A
            int r0 = r0 + 71
            int r2 = r0 % 128
            o.aZE.z = r2
            int r0 = r0 % r1
        Lb1:
            int r0 = o.aZE.z
            int r0 = r0 + 5
            int r2 = r0 % 128
            o.aZE.A = r2
            int r0 = r0 % r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aZE.c(com.netflix.msl.MslException):java.lang.Throwable");
    }

    private static Throwable b(MslException mslException) {
        int i = 2 % 2;
        int i2 = z + 27;
        int i3 = i2 % 128;
        A = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        } else if (mslException != null) {
            return mslException.getCause() == null ? mslException : d(mslException.getCause());
        } else {
            int i4 = i3 + 73;
            z = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 109;
            z = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }
    }

    protected static Throwable d(Throwable th) {
        int i = 2 % 2;
        if (th != null) {
            if (th instanceof IOException) {
                return th;
            }
            if (th.getCause() == null) {
                int i2 = A + 23;
                z = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 48 / 0;
                }
                return th;
            }
            return d(th.getCause());
        }
        int i4 = z + 13;
        A = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    protected Context T_() {
        int i = 2 % 2;
        InterfaceC8387djs interfaceC8387djs = this.v;
        if (interfaceC8387djs != null) {
            int i2 = A + 87;
            z = i2 % 128;
            if (i2 % 2 != 0) {
                Context k = interfaceC8387djs.k();
                int i3 = z + 3;
                A = i3 % 128;
                int i4 = i3 % 2;
                return k;
            }
            interfaceC8387djs.k();
            throw null;
        }
        return null;
    }

    @Override // com.netflix.android.volley.Request
    public VolleyError e(VolleyError volleyError) {
        int i = 2 % 2;
        int i2 = A + 87;
        z = i2 % 128;
        int i3 = i2 % 2;
        StatusCode d = C8237dgb.d(volleyError);
        if (d != null) {
            return new StatusCodeError(d, volleyError.getCause());
        }
        if (!(volleyError instanceof ServerError)) {
            return !B() ? volleyError : C8237dgb.b(volleyError);
        }
        int i4 = z + 113;
        A = i4 % 128;
        int i5 = i4 % 2;
        return b(volleyError);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (o.C8168dfL.g(r1.d()) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (o.C8168dfL.g(r1.d()) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
        if (o.C8168dfL.g(r1.i()) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
        r5 = o.aZE.z + 31;
        o.aZE.A = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        if (o.C8168dfL.g(r1.j()) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
        o.C1044Mm.e("nf_volleyrequest", "handleNotAuthorized:: Mismatch between user agent and MSL store, user is logged in according to user agent. We have cookies, just retry");
        r7.t++;
        c(a(r1));
        o.aZE.j.set(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean ah() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r7.ad()
            java.lang.String r2 = "nf_volleyrequest"
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L2c
            int r1 = o.aZE.A
            int r1 = r1 + 17
            int r5 = r1 % 128
            o.aZE.z = r5
            int r1 = r1 % r0
            java.lang.String r0 = "handleNotAuthorized:: Already tried to relogin using cookies..."
            if (r1 != 0) goto L23
            o.C1044Mm.e(r2, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = o.aZE.j
            r0.set(r4)
            return r4
        L23:
            o.C1044Mm.e(r2, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = o.aZE.j
            r0.set(r3)
            return r3
        L2c:
            com.netflix.mediaclient.service.user.UserAgent r1 = r7.p
            boolean r1 = r1.v()
            if (r1 == r4) goto L3a
            java.lang.String r0 = "handleNotAuthorized:: User is NOT currently logged in, pass this failure regular way..."
            o.C1044Mm.e(r2, r0)
            return r3
        L3a:
            com.netflix.mediaclient.service.user.UserAgent r1 = r7.p
            o.brD r1 = r1.l()
            if (r1 == 0) goto L9a
            int r5 = o.aZE.A
            int r5 = r5 + 45
            int r6 = r5 % 128
            o.aZE.z = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L5b
            java.lang.String r5 = r1.d()
            boolean r5 = o.C8168dfL.g(r5)
            r6 = 25
            int r6 = r6 / r3
            if (r5 != 0) goto L9a
            goto L65
        L5b:
            java.lang.String r5 = r1.d()
            boolean r5 = o.C8168dfL.g(r5)
            if (r5 != 0) goto L9a
        L65:
            java.lang.String r5 = r1.i()
            boolean r5 = o.C8168dfL.g(r5)
            if (r5 != 0) goto L9a
            int r5 = o.aZE.z
            int r5 = r5 + 31
            int r6 = r5 % 128
            o.aZE.A = r6
            int r5 = r5 % r0
            java.lang.String r0 = r1.j()
            boolean r0 = o.C8168dfL.g(r0)
            if (r0 == 0) goto L83
            goto L9a
        L83:
            java.lang.String r0 = "handleNotAuthorized:: Mismatch between user agent and MSL store, user is logged in according to user agent. We have cookies, just retry"
            o.C1044Mm.e(r2, r0)
            int r0 = r7.t
            int r0 = r0 + r4
            r7.t = r0
            o.bsJ r0 = r7.a(r1)
            r7.c(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = o.aZE.j
            r0.set(r4)
            return r4
        L9a:
            java.lang.String r0 = "handleNotAuthorized:: Missing cookies, force user out... This should NOT happen here!"
            o.C1044Mm.j(r2, r0)
            r7.k = r4
            o.aHd r0 = new o.aHd
            java.lang.String r1 = "MSL logout:: reason reloginByCookiesFailed"
            r0.<init>(r1)
            o.aHd r0 = r0.b(r3)
            com.netflix.mediaclient.api.logging.error.ErrorType r1 = com.netflix.mediaclient.api.logging.error.ErrorType.p
            o.aHd r0 = r0.b(r1)
            o.InterfaceC1598aHf.a(r0)
            com.netflix.mediaclient.service.user.UserAgent r0 = r7.p
            com.netflix.cl.model.SignOutReason r1 = com.netflix.cl.model.SignOutReason.reloginByCookiesFailed
            r0.a(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aZE.ah():boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public InterfaceC5129bst.b b(Map<String, String> map) {
        String str;
        int i = 2 % 2;
        int i2 = A + 59;
        z = i2 % 128;
        if (i2 % 2 != 0) {
            map.putAll(ab());
            String w_ = w_();
            String x_ = x_();
            if (i() == 0) {
                int i3 = z + 9;
                A = i3 % 128;
                int i4 = i3 % 2;
                str = "GET";
            } else {
                str = "POST";
            }
            return new InterfaceC5129bst.b(O(), str, map, x_, w_);
        }
        map.putAll(ab());
        w_();
        x_();
        i();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static VolleyError b(VolleyError volleyError) {
        int i = 2 % 2;
        int i2 = A + 83;
        z = i2 % 128;
        int i3 = i2 % 2;
        int i4 = volleyError.b.e;
        if (i4 == 413) {
            StatusCodeError statusCodeError = new StatusCodeError(StatusCode.HTTP_ERR_413, volleyError);
            int i5 = z + 55;
            A = i5 % 128;
            int i6 = i5 % 2;
            return statusCodeError;
        } else if (i4 == 404) {
            return new StatusCodeError(StatusCode.HTTP_ERR_404, volleyError);
        } else {
            if (i4 == 502) {
                return new StatusCodeError(StatusCode.HTTP_ERR_502, volleyError);
            }
            return new StatusCodeError(StatusCode.MSL_GENERIC_NETWORK_ERROR, volleyError);
        }
    }

    public void e(Map<String, String> map) {
        int i = 2 % 2;
        int i2 = A + 97;
        z = i2 % 128;
        int i3 = i2 % 2;
        map.put("Content-Encoding", "msl_v1");
        int i4 = z + 103;
        A = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void ai(char[] cArr, char[] cArr2, int i, char c, char[] cArr3, Object[] objArr) {
        int i2 = 2 % 2;
        C9585sR c9585sR = new C9585sR();
        int length = cArr.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        c9585sR.d = 0;
        while (c9585sR.d < length3) {
            int i3 = $11 + 123;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = (c9585sR.d + 2) % 4;
            int i6 = (c9585sR.d + 3) % 4;
            c9585sR.a = (char) (((cArr4[c9585sR.d % 4] * 32718) + cArr5[i5]) % 65535);
            cArr5[i6] = (char) (((cArr4[i6] * 32718) + cArr5[i5]) / 65535);
            cArr4[i6] = c9585sR.a;
            cArr6[c9585sR.d] = (char) ((((cArr4[i6] ^ cArr3[c9585sR.d]) ^ (d$s74$6726 ^ (-6422965311034337652L))) ^ ((int) (a$s75$6726 ^ (-6422965311034337652L)))) ^ ((char) (b$s76$6726 ^ (-6422965311034337652L))));
            c9585sR.d++;
            int i7 = $11 + 117;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr6);
    }
}
