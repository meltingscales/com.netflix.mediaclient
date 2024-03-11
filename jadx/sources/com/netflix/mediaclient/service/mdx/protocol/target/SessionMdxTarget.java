package com.netflix.mediaclient.service.mdx.protocol.target;

import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.service.mdx.MdxErrorCode;
import com.netflix.mediaclient.service.mdx.MdxErrorSubCode;
import com.netflix.mediaclient.service.mdx.MdxErrorSuffix;
import com.netflix.mediaclient.service.mdx.MdxLoginPolicyEnum;
import com.netflix.mediaclient.service.mdx.logging.MdxTargetType;
import com.netflix.mediaclient.service.mdx.logging.connection.MdxConnectionLogblobLogger;
import com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget;
import com.netflix.ssdp.SsdpDevice;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import o.AbstractC2049aXz;
import o.AbstractC2065aYo;
import o.C1044Mm;
import o.C1999aWc;
import o.C2002aWf;
import o.C2005aWi;
import o.C2038aXo;
import o.C2053aYc;
import o.C2056aYf;
import o.C2057aYg;
import o.C2058aYh;
import o.C2059aYi;
import o.C2062aYl;
import o.C2069aYs;
import o.C2073aYw;
import o.C2075aYy;
import o.C2076aYz;
import o.C8168dfL;
import o.C8241dgf;
import o.C8379djk;
import o.C8404dki;
import o.C8427dle;
import o.C9581sN;
import o.InterfaceC8400dke;
import o.aVX;
import o.aWW;
import o.aXF;
import o.aXL;
import o.aXN;
import o.aYE;
import o.dkO;
import o.dkU;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class SessionMdxTarget<T extends aWW> extends AbstractC2065aYo<T> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int E = 0;
    private static int L = 1;
    private static char[] b$s43$8523;
    private static final String c;
    private static long d$s44$8523;
    private byte[] A;
    private aYE B;
    private String C;
    private boolean D;
    private String F;
    private boolean G;
    private boolean H;
    private MsgTransportType I;
    private int a;
    private JSONObject e;
    private String p;
    private Map<String, String> q;
    private boolean r;
    private boolean s;
    private PairingScheme u;
    private List<AbstractC2049aXz> v;
    private NetflixSecurityScheme w;
    private C2075aYy x;
    private C1999aWc y;
    private final AtomicLong z;

    /* loaded from: classes3.dex */
    public enum MsgTransportType {
        HTTP,
        WEBSOCKET,
        CAST
    }

    /* loaded from: classes3.dex */
    enum NetflixSecurityScheme {
        MSL,
        NTBA
    }

    /* loaded from: classes3.dex */
    public enum PairingScheme {
        PAIRING,
        REGPAIR,
        REGPAIR_V2
    }

    private void V() {
        int i = 2 % 2;
        int i2 = L + 3;
        int i3 = i2 % 128;
        E = i3;
        int i4 = i2 % 2;
        this.A = null;
        int i5 = i3 + 17;
        L = i5 % 128;
        int i6 = i5 % 2;
    }

    static void X() {
        d$s44$8523 = -4986176680863468046L;
        b$s43$8523 = new char[]{18283};
    }

    static /* bridge */ /* synthetic */ C2075aYy a(SessionMdxTarget sessionMdxTarget) {
        int i = 2 % 2;
        int i2 = E + 3;
        int i3 = i2 % 128;
        L = i3;
        int i4 = i2 % 2;
        C2075aYy c2075aYy = sessionMdxTarget.x;
        int i5 = i3 + 39;
        E = i5 % 128;
        if (i5 % 2 == 0) {
            return c2075aYy;
        }
        throw null;
    }

    static /* bridge */ /* synthetic */ void a(SessionMdxTarget sessionMdxTarget, boolean z) {
        int i = 2 % 2;
        int i2 = L + 97;
        int i3 = i2 % 128;
        E = i3;
        if (i2 % 2 != 0) {
            sessionMdxTarget.s = z;
            throw null;
        }
        sessionMdxTarget.s = z;
        int i4 = i3 + 99;
        L = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private MsgTransportType aa() {
        int i = 2 % 2;
        int i2 = E + 79;
        L = i2 % 128;
        int i3 = i2 % 2;
        MsgTransportType msgTransportType = this.I;
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        return msgTransportType;
    }

    private PairingScheme ab() {
        int i = 2 % 2;
        int i2 = L;
        int i3 = i2 + 19;
        E = i3 % 128;
        int i4 = i3 % 2;
        PairingScheme pairingScheme = this.u;
        int i5 = i2 + 43;
        E = i5 % 128;
        int i6 = i5 % 2;
        return pairingScheme;
    }

    static /* bridge */ /* synthetic */ boolean b(SessionMdxTarget sessionMdxTarget) {
        int i = 2 % 2;
        int i2 = L + 9;
        E = i2 % 128;
        if (i2 % 2 == 0) {
            return sessionMdxTarget.r;
        }
        boolean z = sessionMdxTarget.r;
        throw null;
    }

    static /* bridge */ /* synthetic */ aYE c(SessionMdxTarget sessionMdxTarget) {
        int i = 2 % 2;
        int i2 = L + 113;
        E = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 0 / 0;
            return sessionMdxTarget.B;
        }
        return sessionMdxTarget.B;
    }

    static /* bridge */ /* synthetic */ List d(SessionMdxTarget sessionMdxTarget) {
        int i = 2 % 2;
        int i2 = E + NetflixImageView.DEFAULT_LAYER_GRAVITY;
        L = i2 % 128;
        int i3 = i2 % 2;
        List<AbstractC2049aXz> list = sessionMdxTarget.v;
        if (i3 != 0) {
            return list;
        }
        throw null;
    }

    public static /* synthetic */ void d(SessionMdxTarget sessionMdxTarget, AbstractC2049aXz abstractC2049aXz) {
        int i = 2 % 2;
        int i2 = L + 65;
        E = i2 % 128;
        if (i2 % 2 != 0) {
            sessionMdxTarget.d(abstractC2049aXz);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        sessionMdxTarget.d(abstractC2049aXz);
        int i3 = E + 105;
        L = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 76 / 0;
        }
    }

    static /* bridge */ /* synthetic */ JSONObject e(SessionMdxTarget sessionMdxTarget) {
        int i = 2 % 2;
        int i2 = E + 17;
        int i3 = i2 % 128;
        L = i3;
        int i4 = i2 % 2;
        JSONObject jSONObject = sessionMdxTarget.e;
        int i5 = i3 + 105;
        E = i5 % 128;
        int i6 = i5 % 2;
        return jSONObject;
    }

    static /* synthetic */ void f(SessionMdxTarget sessionMdxTarget) {
        int i = 2 % 2;
        int i2 = L + 67;
        E = i2 % 128;
        int i3 = i2 % 2;
        sessionMdxTarget.ac();
        if (i3 != 0) {
            throw null;
        }
        int i4 = L + 83;
        E = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ String j() {
        int i = 2 % 2;
        int i2 = L + 93;
        int i3 = i2 % 128;
        E = i3;
        int i4 = i2 % 2;
        String str = c;
        int i5 = i3 + 73;
        L = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    boolean C() {
        int i = 2 % 2;
        int i2 = L + 85;
        int i3 = i2 % 128;
        E = i3;
        int i4 = i2 % 2;
        boolean z = this.e != null;
        int i5 = i3 + 99;
        L = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean E() {
        int i = 2 % 2;
        if (this.A != null) {
            int i2 = L + 7;
            int i3 = i2 % 128;
            E = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 61;
            L = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        return false;
    }

    public boolean F() {
        int i = 2 % 2;
        int i2 = L + 101;
        int i3 = i2 % 128;
        E = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = this.s;
            int i4 = i3 + 61;
            L = i4 % 128;
            if (i4 % 2 != 0) {
                return z;
            }
            obj.hashCode();
            throw null;
        }
        throw null;
    }

    public boolean N() {
        int i = 2 % 2;
        int i2 = L + 55;
        int i3 = i2 % 128;
        E = i3;
        if (i2 % 2 == 0) {
            boolean z = this.r;
            int i4 = i3 + 121;
            L = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }
        throw null;
    }

    public boolean S() {
        int i = 2 % 2;
        int i2 = L + 125;
        int i3 = i2 % 128;
        E = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 39;
        L = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public boolean U() {
        int i = 2 % 2;
        int i2 = L;
        int i3 = i2 + 103;
        E = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.H;
        int i5 = i2 + 61;
        E = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public C1999aWc x() {
        int i = 2 % 2;
        int i2 = L;
        int i3 = i2 + 111;
        E = i3 % 128;
        if (i3 % 2 == 0) {
            C1999aWc c1999aWc = this.y;
            int i4 = i2 + 125;
            E = i4 % 128;
            int i5 = i4 % 2;
            return c1999aWc;
        }
        throw null;
    }

    public Long B() {
        int i = 2 % 2;
        int i2 = E + 45;
        L = i2 % 128;
        int i3 = i2 % 2;
        Long valueOf = Long.valueOf(this.z.get());
        int i4 = E + 77;
        L = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return valueOf;
    }

    static {
        X();
        c = String.valueOf(9080);
        int i = L + 109;
        E = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* loaded from: classes3.dex */
    public static class b<U extends aWW> extends AbstractC2065aYo.e<b<U>, U, SessionMdxTarget<U>> {
        private PairingScheme a;
        private boolean b;
        private Map<String, String> c;
        private String d;
        private MsgTransportType e;
        private boolean g;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.AbstractC2065aYo.e
        /* renamed from: e */
        public b<U> b() {
            return this;
        }

        @Override // o.AbstractC2065aYo.e
        public /* bridge */ /* synthetic */ AbstractC2065aYo.e b(String str) {
            return super.b(str);
        }

        @Override // o.AbstractC2065aYo.e
        public /* bridge */ /* synthetic */ AbstractC2065aYo.e d(String str) {
            return super.d(str);
        }

        @Override // o.AbstractC2065aYo.e
        public /* bridge */ /* synthetic */ AbstractC2065aYo.e e(String str) {
            return super.e(str);
        }

        public b(String str, String str2, String str3, U u, MsgTransportType msgTransportType) {
            super(str, str2, str3, u);
            this.d = SessionMdxTarget.j();
            this.a = PairingScheme.PAIRING;
            this.b = false;
            this.g = false;
            this.e = msgTransportType;
        }

        public SessionMdxTarget<U> c() {
            return new SessionMdxTarget<>(this);
        }

        public b<U> a(String str) {
            this.d = str;
            return b();
        }

        public b<U> c(PairingScheme pairingScheme) {
            this.a = pairingScheme;
            return b();
        }

        public b<U> d(boolean z) {
            this.g = z;
            return b();
        }

        public b<U> e(boolean z) {
            this.b = z;
            return b();
        }

        public b<U> d(Map<String, String> map) {
            this.c = map;
            return b();
        }
    }

    private SessionMdxTarget(b<T> bVar) {
        super(bVar);
        this.z = new AtomicLong();
        this.a = 0;
        this.v = new ArrayList();
        this.r = false;
        this.C = ((b) bVar).d;
        this.I = ((b) bVar).e;
        this.u = ((b) bVar).a;
        this.D = ((b) bVar).b;
        this.G = ((b) bVar).g;
        this.q = ((b) bVar).c;
        this.k = this;
        this.B = new aYE(this, this.i.l());
        this.x = new C2075aYy(this.m, this.t, this.g);
        this.w = NetflixSecurityScheme.MSL;
        C1044Mm.c("SessionMdxTarget", "SessionMdxTarget %s", this.t);
    }

    public String g(String str) {
        int i = 2 % 2;
        int i2 = E + 95;
        L = i2 % 128;
        int i3 = i2 % 2;
        String b2 = b(str, (String) null);
        int i4 = E + 29;
        L = i4 % 128;
        int i5 = i4 % 2;
        return b2;
    }

    private String b(String str, String str2) {
        int i = 2 % 2;
        int i2 = L + 65;
        E = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Map<String, String> map = this.q;
            if (map == null || !map.containsKey(str)) {
                return null;
            }
            String str3 = this.q.get(str);
            if (C8168dfL.g(str3)) {
                int i3 = E + 49;
                int i4 = i3 % 128;
                L = i4;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i5 = i4 + NetflixImageView.DEFAULT_LAYER_GRAVITY;
                E = i5 % 128;
                int i6 = i5 % 2;
                return str2;
            }
            return str3;
        }
        throw null;
    }

    public void d(SsdpDevice ssdpDevice) {
        int i = 2 % 2;
        Map<String, String> c2 = ssdpDevice.c();
        Map<String, String> map = this.q;
        if (map != null) {
            int i2 = E + 71;
            L = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            } else if (c2 != null) {
                map.clear();
                this.q.putAll(c2);
                this.f = ssdpDevice.e();
                String str = this.q.get("X-Friendly-Name");
                if (C8168dfL.h(str)) {
                    byte[] e = C8427dle.e(str);
                    try {
                        this.d = new String(e, "UTF-8");
                        int i3 = E + 111;
                        L = i3 % 128;
                        int i4 = i3 % 2;
                    } catch (UnsupportedEncodingException unused) {
                        this.d = new String(e);
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(com.netflix.mediaclient.service.mdx.MdxLoginPolicyEnum r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.L
            int r2 = r1 + 13
            int r3 = r2 % 128
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L47
            o.aWc r2 = r6.y
            r4 = 0
            if (r2 == 0) goto L37
            int r1 = r1 + 109
            int r5 = r1 % 128
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E = r5
            int r1 = r1 % r0
            if (r1 != 0) goto L30
            boolean r7 = r2.a(r7)
            r1 = 1
            r7 = r7 ^ r1
            if (r7 == 0) goto L26
            goto L37
        L26:
            int r7 = com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E
            int r7 = r7 + 117
            int r2 = r7 % 128
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.L = r2
            int r7 = r7 % r0
            goto L38
        L30:
            r2.a(r7)
            r3.hashCode()
            throw r3
        L37:
            r1 = r4
        L38:
            int r7 = com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E
            int r7 = r7 + 67
            int r2 = r7 % 128
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.L = r2
            int r7 = r7 % r0
            if (r7 != 0) goto L46
            r7 = 91
            int r7 = r7 / r4
        L46:
            return r1
        L47:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.c(com.netflix.mediaclient.service.mdx.MdxLoginPolicyEnum):boolean");
    }

    public boolean d(Set<MdxLoginPolicyEnum> set) {
        C1999aWc c1999aWc;
        int i = 2 % 2;
        int i2 = L + 13;
        int i3 = i2 % 128;
        E = i3;
        int i4 = i2 % 2;
        if (set == null || (c1999aWc = this.y) == null) {
            int i5 = i3 + 39;
            L = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        boolean contains = set.contains(c1999aWc.b());
        int i7 = E + 91;
        L = i7 % 128;
        if (i7 % 2 != 0) {
            return contains;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean L() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.L = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L5c
            boolean r1 = r5.G()
            r2 = 0
            if (r1 != 0) goto L4c
            o.aWc r1 = r5.y
            if (r1 == 0) goto L4c
            boolean r1 = r1.c()
            if (r1 == 0) goto L4c
            boolean r1 = r5.r
            if (r1 == 0) goto L24
            goto L4c
        L24:
            java.util.Map<java.lang.String, java.lang.String> r1 = r5.q
            java.lang.String r3 = "X-MDX-Remote-Login-Supported"
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            Y(r3, r2, r2, r4)
            r4 = r4[r2]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.intern()
            boolean r1 = o.C8168dfL.d(r1, r4)
            if (r1 == 0) goto L4c
            int r1 = com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E
            int r1 = r1 + 55
            int r4 = r1 % 128
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.L = r4
            int r1 = r1 % r0
            goto L4d
        L4c:
            r3 = r2
        L4d:
            int r1 = com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.L
            int r1 = r1 + 91
            int r4 = r1 % 128
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L5b
            r0 = 39
            int r0 = r0 / r2
        L5b:
            return r3
        L5c:
            r5.G()
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.L():boolean");
    }

    public boolean I() {
        int i = 2 % 2;
        int i2 = E + 57;
        L = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        Y(1, (char) 0, 0, objArr);
        boolean d = C8168dfL.d(this.q.get("X-MDX-Remote-Login-Requested-By-Witcher"), ((String) objArr[0]).intern());
        int i4 = E + 81;
        L = i4 % 128;
        int i5 = i4 % 2;
        return d;
    }

    public void r() {
        int i = 2 % 2;
        Object obj = null;
        this.y = null;
        if (this.r) {
            this.r = false;
            ((C2038aXo) this.i).s();
            this.m.b();
            int i2 = L + 107;
            E = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = E + 47;
        L = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.AbstractC2065aYo
    public boolean i() {
        int i = 2 % 2;
        int i2 = E + 93;
        L = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.B.b();
            throw null;
        }
        boolean b2 = this.B.b();
        C1999aWc c1999aWc = this.y;
        if (c1999aWc != null) {
            if (!c1999aWc.a(MdxLoginPolicyEnum.LoginOnlyRequestedByTarget)) {
                int i3 = E + 105;
                L = i3 % 128;
                if (i3 % 2 == 0) {
                    this.y.a(MdxLoginPolicyEnum.LoginAndPairRequestedByTarget);
                    obj.hashCode();
                    throw null;
                } else if (!this.y.a(MdxLoginPolicyEnum.LoginAndPairRequestedByTarget)) {
                    return b2;
                }
            }
            if (G()) {
                return b2;
            }
            if (!this.r) {
                if (!b2) {
                    int i4 = E + 11;
                    L = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 5 / 5;
                    }
                    return false;
                }
                int i6 = E + 71;
                L = i6 % 128;
                int i7 = i6 % 2;
            }
            return true;
        }
        return b2;
    }

    @Override // o.AbstractC2065aYo
    public boolean a() {
        int i = 2 % 2;
        if (!i() && E()) {
            int i2 = L + 105;
            E = i2 % 128;
            if (i2 % 2 != 0) {
                C();
                Object obj = null;
                obj.hashCode();
                throw null;
            } else if (C()) {
                int i3 = E + 85;
                L = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
        }
        int i5 = E + 13;
        L = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public boolean D() {
        int i = 2 % 2;
        if (a()) {
            int i2 = L + 25;
            E = i2 % 128;
            int i3 = i2 % 2;
            C2075aYy c2075aYy = this.x;
            if (c2075aYy != null && !(!c2075aYy.e())) {
                int i4 = L + 25;
                E = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        int i6 = E + 35;
        L = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r5 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r5 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
        r3.y = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(final boolean r4, o.C1999aWc r5) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.L
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L7d
            if (r5 == 0) goto L65
            com.netflix.mediaclient.service.mdx.MdxLoginPolicyEnum r1 = com.netflix.mediaclient.service.mdx.MdxLoginPolicyEnum.LoginOnlyRequestedByTarget
            boolean r1 = r5.a(r1)
            if (r1 != 0) goto L20
            com.netflix.mediaclient.service.mdx.MdxLoginPolicyEnum r1 = com.netflix.mediaclient.service.mdx.MdxLoginPolicyEnum.LoginAndPairRequestedByTarget
            boolean r1 = r5.a(r1)
            if (r1 == 0) goto L65
        L20:
            if (r4 != 0) goto L3f
            int r1 = com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.L
            int r1 = r1 + 113
            int r2 = r1 % 128
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E = r2
            int r1 = r1 % r0
            boolean r1 = r3.i()
            if (r1 != 0) goto L3f
            boolean r1 = r3.a()
            if (r1 != 0) goto L3f
            java.lang.String r5 = r3.n()
            com.netflix.mediaclient.service.mdx.logging.connection.MdxConnectionLogblobLogger.c(r5)
            goto L6e
        L3f:
            if (r4 == 0) goto L6e
            boolean r1 = r3.G()
            if (r1 != 0) goto L6e
            boolean r1 = r3.r
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L4e
            goto L6e
        L4e:
            int r1 = com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E
            int r1 = r1 + 53
            int r2 = r1 % 128
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.L = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L60
            r0 = 86
            int r0 = r0 / 0
            if (r5 == 0) goto L6e
            goto L62
        L60:
            if (r5 == 0) goto L6e
        L62:
            r3.y = r5
            goto L6e
        L65:
            if (r4 != 0) goto L6e
            java.lang.String r5 = r3.n()
            com.netflix.mediaclient.service.mdx.logging.connection.MdxConnectionLogblobLogger.c(r5)
        L6e:
            o.aYE r5 = r3.B
            android.os.Handler r5 = r5.a()
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget$1 r0 = new com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget$1
            r0.<init>()
            r5.post(r0)
            return
        L7d:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.b(boolean, o.aWc):void");
    }

    public void b(boolean z) {
        int i = 2 % 2;
        int i2 = L + 1;
        E = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            b(z, (C1999aWc) null);
            obj.hashCode();
            throw null;
        }
        b(z, (C1999aWc) null);
        int i3 = E + 19;
        L = i3 % 128;
        int i4 = i3 % 2;
    }

    public void Q() {
        int i = 2 % 2;
        this.B.a().post(new Runnable() { // from class: com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.3
            @Override // java.lang.Runnable
            public void run() {
                SessionMdxTarget.f(SessionMdxTarget.this);
                SessionMdxTarget sessionMdxTarget = SessionMdxTarget.this;
                if (sessionMdxTarget.f13459o != null && !SessionMdxTarget.b(sessionMdxTarget)) {
                    SessionMdxTarget sessionMdxTarget2 = SessionMdxTarget.this;
                    if (sessionMdxTarget2.f13459o.a(sessionMdxTarget2)) {
                        SessionMdxTarget.this.f13459o.d((AbstractC2065aYo) null);
                        SessionMdxTarget.this.m.b();
                    }
                }
                if (SessionMdxTarget.this.G() || SessionMdxTarget.b(SessionMdxTarget.this)) {
                    return;
                }
                SessionMdxTarget.this.g.e().d(MdxTargetType.Nrdp, SessionMdxTarget.this.n(), SessionMdxTarget.this.t(), SessionMdxTarget.this.k(), SessionMdxTarget.this.d(), SessionMdxTarget.this.e(), SessionMdxTarget.this.b());
            }
        });
        int i2 = E + 87;
        L = i2 % 128;
        int i3 = i2 % 2;
    }

    public void f(final String str) {
        int i = 2 % 2;
        C1044Mm.c("SessionMdxTarget", "mdx regpair pin %s", str);
        this.B.a().post(new Runnable() { // from class: com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.5
            @Override // java.lang.Runnable
            public void run() {
                SessionMdxTarget.c(SessionMdxTarget.this).c(TargetStateEvent.RegPairPinSubmitted, str);
            }
        });
        int i2 = L + 17;
        E = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void g() {
        int i = 2 % 2;
        this.B.a().post(new Runnable() { // from class: com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.4
            @Override // java.lang.Runnable
            public void run() {
                SessionMdxTarget.c(SessionMdxTarget.this).e(TargetStateEvent.RegPairPinConfirmationCancelled);
            }
        });
        int i2 = L + 103;
        E = i2 % 128;
        int i3 = i2 % 2;
    }

    public void e(final boolean z) {
        int i = 2 % 2;
        C1044Mm.c("SessionMdxTarget", "Is remote login approved? %s", Boolean.valueOf(z));
        this.B.a().post(new Runnable() { // from class: com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.2
            @Override // java.lang.Runnable
            public void run() {
                SessionMdxTarget.c(SessionMdxTarget.this).e(z ? TargetStateEvent.RemoteLoginApproved : TargetStateEvent.RemoteLoginRejected);
            }
        });
        int i2 = E + 59;
        L = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.AbstractC2065aYo
    public void c(final AbstractC2049aXz abstractC2049aXz) {
        int i = 2 % 2;
        C1044Mm.c("SessionMdxTarget", "sendCommand %s", abstractC2049aXz.a());
        this.B.a().post(new Runnable() { // from class: com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.9
            @Override // java.lang.Runnable
            public void run() {
                if ("PLAYER_GET_CAPABILITIES".equals(abstractC2049aXz.a()) && SessionMdxTarget.e(SessionMdxTarget.this) != null) {
                    C1044Mm.a("SessionMdxTarget", "sendCommand, return cached capability.");
                    SessionMdxTarget sessionMdxTarget = SessionMdxTarget.this;
                    sessionMdxTarget.m.a(sessionMdxTarget.t(), SessionMdxTarget.e(SessionMdxTarget.this).toString());
                } else if ("GET_AUDIO_SUBTITLES".equals(abstractC2049aXz.a()) && SessionMdxTarget.a(SessionMdxTarget.this).b()) {
                    C1044Mm.a("SessionMdxTarget", "sendCommand, return cached audio subtitles.");
                } else {
                    SessionMdxTarget.a(SessionMdxTarget.this).a(abstractC2049aXz);
                    SessionMdxTarget.d(SessionMdxTarget.this).add(abstractC2049aXz);
                    if (SessionMdxTarget.this.a()) {
                        SessionMdxTarget.c(SessionMdxTarget.this).e(TargetStateEvent.SendMessageRequested);
                    }
                }
            }
        });
        int i2 = L + 9;
        E = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void e(final AbstractC2049aXz abstractC2049aXz) {
        int i = 2 % 2;
        this.B.a().post(new Runnable() { // from class: o.aYB
            @Override // java.lang.Runnable
            public final void run() {
                SessionMdxTarget.d(SessionMdxTarget.this, abstractC2049aXz);
            }
        });
        int i2 = L + 91;
        E = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private /* synthetic */ void d(AbstractC2049aXz abstractC2049aXz) {
        int i = 2 % 2;
        int i2 = L + 91;
        E = i2 % 128;
        int i3 = i2 % 2;
        a(abstractC2049aXz);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(JSONObject jSONObject) {
        char c2;
        int i = 2 % 2;
        int i2 = L + 103;
        E = i2 % 128;
        int i3 = i2 % 2;
        String optString = jSONObject.optString("errorcode");
        C1044Mm.j("SessionMdxTarget", "handleIncomingErrorMessage %s %s", optString, jSONObject.optString("errorstring"));
        optString.hashCode();
        int hashCode = optString.hashCode();
        if (hashCode == 53) {
            if (optString.equals("5")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode != 54) {
            switch (hashCode) {
                case 1567:
                    if (optString.equals("10")) {
                        int i4 = L + 13;
                        E = i4 % 128;
                        int i5 = i4 % 2;
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1568:
                    if (optString.equals("11")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1569:
                    if (optString.equals("12")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1570:
                    if (optString.equals("13")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
        } else if (optString.equals("6")) {
            c2 = 1;
        } else {
            int i6 = L + 109;
            E = i6 % 128;
            int i7 = i6 % 2;
            c2 = 65535;
        }
        if (c2 == 0 || c2 == 1) {
            this.B.e(TargetStateEvent.SendMessageFailedBadPair);
            this.g.b(TargetSessionMessageType.MESSAGE_TYPE_ERROR_BADPAIR);
            return;
        }
        if (c2 != 2) {
            if (c2 == 3) {
                this.B.e(TargetStateEvent.SendMessageFailedNeedNewSession);
                this.g.b(TargetSessionMessageType.MESSAGE_TYPE_ERROR_BADSESSION);
                return;
            } else if (c2 != 4 && c2 != 5) {
                return;
            }
        }
        this.B.e(TargetStateEvent.PairFail);
        int i8 = E + 65;
        L = i8 % 128;
        int i9 = i8 % 2;
    }

    /* renamed from: com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget$7  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[TargetSessionMessageType.values().length];
            d = iArr;
            try {
                iArr[TargetSessionMessageType.MESSAGE_TYPE_STARTSESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[TargetSessionMessageType.MESSAGE_TYPE_HANDSHAKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[TargetSessionMessageType.MESSAGE_TYPE_ENDSESSOIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[TargetSessionMessageType.MESSAGE_TYPE_CAPABILITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[TargetSessionMessageType.MESSAGE_TYPE_CURRENT_STATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[TargetSessionMessageType.MESSAGE_TYPE_STATE_CHANGED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d[TargetSessionMessageType.MESSAGE_TYPE_AUDIO_SUBTITLES_CHANGED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                d[TargetSessionMessageType.MESSAGE_TYPE_AUDIO_SUBTITLE_SETTINGS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                d[TargetSessionMessageType.MESSAGE_TYPE_DIALOG_SHOW.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                d[TargetSessionMessageType.MESSAGE_TYPE_DIALOG_CANCEL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                d[TargetSessionMessageType.MESSAGE_TYPE_META_DATA_CHANGED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                d[TargetSessionMessageType.MESSAGE_TYPE_PIN_VERIFICATION_SHOW.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                d[TargetSessionMessageType.MESSAGE_TYPE_PIN_VERIFICATION_NOT_REQUIRED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                d[TargetSessionMessageType.MESSAGE_TYPE_ERROR_BADPAIR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                d[TargetSessionMessageType.MESSAGE_TYPE_ERROR_BADSESSION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                d[TargetSessionMessageType.MESSAGE_TYPE_PIN_VERIFICATION_INCORRECT_PIN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public void b(JSONObject jSONObject) {
        int i = 2 % 2;
        if (!E()) {
            C1044Mm.j("SessionMdxTarget", "device has no pair, cannot handleIncomingSessionMessage");
            return;
        }
        this.z.set(System.currentTimeMillis());
        C2076aYz.b c2 = C2076aYz.c(jSONObject, this.A, this.m, t());
        if (c2 != null) {
            if (c2.b() != null) {
                C1044Mm.c("SessionMdxTarget", "has appMsg: %s", c2.b().f());
            }
            switch (AnonymousClass7.d[c2.e().ordinal()]) {
                case 1:
                    C2059aYi c2059aYi = (C2059aYi) c2.b();
                    if (!(!c2059aYi.b())) {
                        this.a = c2059aYi.d();
                        this.B.e(TargetStateEvent.StartSessionSucceed);
                        C1044Mm.j("SessionMdxTarget", "handleIncomingSessionMessage start session %d", Integer.valueOf(this.a));
                        return;
                    }
                    this.a = 0;
                    this.B.c(TargetStateEvent.StartSessionFail, c2059aYi);
                    C1044Mm.j("SessionMdxTarget", "handleIncomingSessionMessage start session failed");
                    return;
                case 2:
                    if (((C2053aYc) c2.b()).e()) {
                        this.B.e(TargetStateEvent.HandShakeSucceed);
                        C1044Mm.j("SessionMdxTarget", "handleIncomingSessionMessage handshake accepted");
                        return;
                    }
                    this.B.e(TargetStateEvent.HandShakeFailed);
                    C1044Mm.j("SessionMdxTarget", "handleIncomingSessionMessage handshake failed");
                    return;
                case 3:
                    this.a = 0;
                    C1044Mm.j("SessionMdxTarget", "handleIncomingSessionMessage session %d ended", 0);
                    return;
                case 4:
                    JSONObject f = c2.b().f();
                    this.e = f;
                    this.H = f.optBoolean("mediaVolumeControl");
                    C1044Mm.a("SessionMdxTarget", "mUsingMediaVolume=" + this.H);
                    this.B.e(c2.e());
                    this.m.a(t(), this.e.toString());
                    int i2 = L + 39;
                    E = i2 % 128;
                    int i3 = i2 % 2;
                    return;
                case 5:
                    this.x.e(((C2057aYg) c2.b()).e());
                    this.B.e(c2.e());
                    return;
                case 6:
                    C2062aYl c2062aYl = (C2062aYl) c2.b();
                    this.x.a(c2062aYl.e());
                    this.g.b().a(c2062aYl.e());
                    return;
                case 7:
                case 8:
                    JSONObject f2 = c2.b().f();
                    if (f2.has("audio_tracks")) {
                        int i4 = E + 49;
                        L = i4 % 128;
                        if (i4 % 2 != 0) {
                            if (!f2.has("timed_text_track")) {
                                return;
                            }
                        } else {
                            int i5 = 48 / 0;
                            if (!f2.has("timed_text_track")) {
                                return;
                            }
                        }
                        this.x.c(f2.toString());
                        return;
                    }
                    return;
                case 9:
                    this.m.d(t(), c2.b().f().toString());
                    return;
                case 10:
                    this.m.e(t(), c2.b().f().toString());
                    int i6 = E + 21;
                    L = i6 % 128;
                    int i7 = i6 % 2;
                    return;
                case 11:
                    this.m.b(t(), c2.b().f().toString());
                    return;
                case 12:
                    try {
                        C2058aYh c2058aYh = new C2058aYh(c2.b().f());
                        this.m.a(t(), c2058aYh.b(), c2058aYh.c(), c2058aYh.e(), c2058aYh.d());
                        return;
                    } catch (JSONException unused) {
                        C1044Mm.d("SessionMdxTarget", "failed to parse MESSAGE_TYPE_PIN_VERIFICATION_SHOW");
                        return;
                    }
                case 13:
                    try {
                        this.m.a(t(), new C2056aYf(c2.b().f()).e());
                        return;
                    } catch (JSONException unused2) {
                        C1044Mm.d("SessionMdxTarget", "failed to parse MESSAGE_TYPE_PIN_VERIFICATION_NOT_REQUIRED");
                        return;
                    }
                case 14:
                    this.B.e(TargetStateEvent.SendMessageFailedBadPair);
                    this.g.b(c2.e());
                    return;
                case 15:
                    this.B.e(TargetStateEvent.SendMessageFailedNeedNewSession);
                    this.g.b(c2.e());
                    return;
                case 16:
                    this.m.e(t());
                    return;
                default:
                    return;
            }
        }
        int i8 = L + 115;
        E = i8 % 128;
        int i9 = i8 % 2;
        C1044Mm.j("SessionMdxTarget", "handleIncomingSessionMessage fail to parse");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r5 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r5 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        if (r5.c() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
        r3 = com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E + 91;
        r5 = r3 % 128;
        com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.L = r5;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
        r5 = r5 + 89;
        com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
        if ((r5 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
        r7.y = r1;
        r7.r = r8.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
        r7.y = r1;
        r7.r = r8.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
        r7.A = r8.f();
        r7.p = r8.e();
        r7.F = r8.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(org.json.JSONObject r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.L
            int r1 = r1 + 15
            int r2 = r1 % 128
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto Lcc
            o.bst r1 = r7.n
            o.djk r1 = r1.c()
            r3 = 0
            r4 = 1
            if (r1 == 0) goto Lb3
            o.aYE r5 = r7.B
            boolean r5 = r5.b()
            if (r5 != 0) goto L23
            goto Lb3
        L23:
            o.djy r1 = r1.b
            o.bst r5 = r7.n
            o.dkd r5 = r5.e()
            o.dki r6 = o.C8404dki.b
            o.aYw$b r8 = o.C2073aYw.e(r8, r1, r5, r6)
            if (r8 == 0) goto Lb2
            boolean r1 = r7.E()
            r1 = r1 ^ r4
            if (r1 == r4) goto L3c
            goto Lb2
        L3c:
            boolean r1 = r8.l()
            if (r1 == 0) goto La0
            int r1 = com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.L
            int r1 = r1 + 81
            int r4 = r1 % 128
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E = r4
            int r1 = r1 % r0
            r4 = 89
            if (r1 == 0) goto L5a
            o.aWc r1 = r8.c()
            o.aWc r5 = r7.y
            int r3 = r4 / 0
            if (r5 == 0) goto L8d
            goto L62
        L5a:
            o.aWc r1 = r8.c()
            o.aWc r5 = r7.y
            if (r5 == 0) goto L8d
        L62:
            boolean r3 = r5.c()
            if (r3 == 0) goto L8d
            int r3 = com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E
            int r3 = r3 + 91
            int r5 = r3 % 128
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.L = r5
            int r3 = r3 % r0
            if (r1 == 0) goto L8d
            int r5 = r5 + r4
            int r3 = r5 % 128
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E = r3
            int r5 = r5 % r0
            if (r5 != 0) goto L84
            r7.y = r1
            boolean r0 = r8.j()
            r7.r = r0
            goto L8d
        L84:
            r7.y = r1
            boolean r8 = r8.j()
            r7.r = r8
            throw r2
        L8d:
            byte[] r0 = r8.f()
            r7.A = r0
            java.lang.String r0 = r8.e()
            r7.p = r0
            java.lang.String r0 = r8.g()
            r7.F = r0
            goto La9
        La0:
            o.aWP r0 = r7.g
            java.lang.String r1 = r8.b()
            r0.d(r1)
        La9:
            o.aYE r0 = r7.B
            com.netflix.mediaclient.service.mdx.protocol.target.TargetStateEvent r1 = r8.i()
            r0.c(r1, r8)
        Lb2:
            return
        Lb3:
            java.lang.Object[] r8 = new java.lang.Object[r4]
            o.aYE r0 = r7.B
            boolean r0 = r0.b()
            if (r0 == 0) goto Lc0
            java.lang.String r0 = "not expecting."
            goto Lc2
        Lc0:
            java.lang.String r0 = ""
        Lc2:
            r8[r3] = r0
            java.lang.String r0 = "SessionMdxTarget"
            java.lang.String r1 = "won't process pairing result %s"
            o.C1044Mm.c(r0, r1, r8)
            return
        Lcc:
            o.bst r8 = r7.n
            r8.c()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.d(org.json.JSONObject):void");
    }

    public boolean G() {
        int i = 2 % 2;
        int i2 = L + 57;
        E = i2 % 128;
        int i3 = i2 % 2;
        MsgTransportType aa = aa();
        if (i3 == 0) {
            return aa.equals(MsgTransportType.CAST);
        }
        aa.equals(MsgTransportType.CAST);
        throw null;
    }

    public void A() {
        int i = 2 % 2;
        int i2 = L + 45;
        E = i2 % 128;
        int i3 = i2 % 2;
        this.B.e(TargetStateEvent.SendMessageSucceed);
        int i4 = L + 117;
        E = i4 % 128;
        int i5 = i4 % 2;
    }

    public void c(int i) {
        int i2 = 2 % 2;
        int i3 = E + 71;
        L = i3 % 128;
        if (i3 % 2 != 0) {
            j(String.valueOf(i));
            return;
        }
        j(String.valueOf(i));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void j(String str) {
        int i = 2 % 2;
        int i2 = E + 29;
        L = i2 % 128;
        int i3 = i2 % 2;
        this.B.c(TargetStateEvent.SendMessageFail, str);
        int i4 = L + 79;
        E = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void e(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = L + 25;
        E = i2 % 128;
        int i3 = i2 % 2;
        C2069aYs.e b2 = C2069aYs.b(jSONObject);
        if (i3 != 0) {
            int i4 = 76 / 0;
            if (b2 == null) {
                return;
            }
        } else if (b2 == null) {
            return;
        }
        int i5 = L + 11;
        E = i5 % 128;
        if (i5 % 2 == 0) {
            this.B.c(b2.d(), b2);
        } else {
            this.B.c(b2.d(), b2);
            throw null;
        }
    }

    public void c(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = E + 79;
        L = i2 % 128;
        int i3 = i2 % 2;
        C1044Mm.a("SessionMdxTarget", "%s received a broadcast message: %s", k(), jSONObject.toString());
        int i4 = L + 125;
        E = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
    }

    public String w() {
        int i = 2 % 2;
        int i2 = E + 87;
        L = i2 % 128;
        if (i2 % 2 != 0) {
            return this.x.a();
        }
        this.x.a();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public C2005aWi v() {
        int i = 2 % 2;
        try {
            C2005aWi c2005aWi = new C2005aWi(this.e);
            int i2 = L + 79;
            E = i2 % 128;
            int i3 = i2 % 2;
            return c2005aWi;
        } catch (Exception unused) {
            C1044Mm.e("SessionMdxTarget", "device capbility not cached");
            return null;
        }
    }

    public C8241dgf.e z() {
        int i = 2 % 2;
        int i2 = E + 45;
        L = i2 % 128;
        int i3 = i2 % 2;
        C8241dgf.e d = this.x.d();
        int i4 = E + 25;
        L = i4 % 128;
        if (i4 % 2 != 0) {
            return d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private long Z() {
        int i = 2 % 2;
        int i2 = L + 29;
        E = i2 % 128;
        if (i2 % 2 == 0) {
            return System.currentTimeMillis();
        }
        System.currentTimeMillis();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private String W() {
        int i = 2 % 2;
        int i2 = L + 95;
        E = i2 % 128;
        int i3 = i2 % 2;
        if (aa().equals(MsgTransportType.CAST)) {
            return "cast://";
        }
        if (aa().equals(MsgTransportType.WEBSOCKET)) {
            return "ws://";
        }
        int i4 = L + 5;
        E = i4 % 128;
        int i5 = i4 % 2;
        return "http://";
    }

    private String T() {
        int i = 2 % 2;
        String str = W() + AbstractC2065aYo.f() + ":" + C2002aWf.e;
        int i2 = E + 121;
        L = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private String h(String str) {
        int i = 2 % 2;
        String str2 = W() + n() + ":" + this.C + "/" + str;
        int i2 = E + 9;
        L = i2 % 128;
        if (i2 % 2 != 0) {
            return str2;
        }
        throw null;
    }

    private String d(dkO dko, dkU dku) {
        int i = 2 % 2;
        String str = "1," + d(dko) + "," + d(dku);
        int i2 = E + 35;
        L = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private String d(InterfaceC8400dke interfaceC8400dke) {
        String e;
        int i = 2 % 2;
        int i2 = L + 95;
        E = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                e = C8427dle.e(interfaceC8400dke.c(this.n.e(), C8404dki.b));
                int i3 = 83 / 0;
            } else {
                e = C8427dle.e(interfaceC8400dke.c(this.n.e(), C8404dki.b));
            }
            int i4 = E + 121;
            L = i4 % 128;
            if (i4 % 2 != 0) {
                return e;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private String i(String str) {
        int i = 2 % 2;
        int i2 = E + 113;
        L = i2 % 128;
        int i3 = i2 % 2;
        if (E()) {
            String T = T();
            String str2 = this.p;
            String t = t();
            String str3 = this.F;
            long Z = Z();
            return C2076aYz.e(T, str2, t, str3, String.valueOf(Z), str, this.A);
        }
        int i4 = L + 11;
        E = i4 % 128;
        if (i4 % 2 != 0) {
            Object[] objArr = new Object[1];
            objArr[1] = str;
            C1044Mm.j("SessionMdxTarget", "device has no pair, cannot send session message %s", objArr);
            return null;
        }
        C1044Mm.j("SessionMdxTarget", "device has no pair, cannot send session message %s", str);
        return null;
    }

    private boolean a(AbstractC2049aXz abstractC2049aXz) {
        int i = 2 % 2;
        String d = abstractC2049aXz.d(this.a);
        String i2 = i(d);
        C1044Mm.c("SessionMdxTarget", "sendMessageMdxTarget %s", d);
        Object obj = null;
        if (C8168dfL.h(i2)) {
            this.i.b(i2, h(C2069aYs.c), t());
            int i3 = E + 95;
            L = i3 % 128;
            if (i3 % 2 != 0) {
                return true;
            }
            throw null;
        }
        C1044Mm.d("SessionMdxTarget", "sendMessageMdxTarget failed");
        int i4 = L + 55;
        E = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    private void ac() {
        int i = 2 % 2;
        C1044Mm.a("SessionMdxTarget", "resetState");
        V();
        this.s = false;
        this.e = null;
        this.B.d();
        if (!this.r) {
            int i2 = E + 115;
            L = i2 % 128;
            if (i2 % 2 == 0) {
                this.v.clear();
                this.x.c();
                throw null;
            }
            this.v.clear();
            this.x.c();
            int i3 = L + 57;
            E = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = E + 67;
        L = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 67 / 0;
        }
    }

    private String n(String str) {
        int i = 2 % 2;
        int i2 = L + 59;
        E = i2 % 128;
        if (i2 % 2 != 0) {
            C8168dfL.g(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (C8168dfL.g(str)) {
            str = "00000";
        }
        int i3 = L + 69;
        E = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public boolean P() {
        int i = 2 % 2;
        int i2 = L + 29;
        E = i2 % 128;
        int i3 = i2 % 2;
        boolean z = !c().ab().equals(PairingScheme.PAIRING);
        int i4 = E + 121;
        L = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public void R() {
        int i = 2 % 2;
        int i2 = E + 117;
        L = i2 % 128;
        if (i2 % 2 == 0) {
            long Z = Z();
            this.i.b(C2069aYs.a(String.valueOf(Z), T()), h(C2069aYs.e), t());
            int i3 = 80 / 0;
        } else {
            long Z2 = Z();
            this.i.b(C2069aYs.a(String.valueOf(Z2), T()), h(C2069aYs.e), t());
        }
        int i4 = L + 107;
        E = i4 % 128;
        int i5 = i4 % 2;
    }

    public void s() {
        int i = 2 % 2;
        V();
        C8379djk c2 = this.n.c();
        if (c2 == null) {
            C1044Mm.j("SessionMdxTarget", "doPair has invalid MSL credentials");
            int i2 = L + 79;
            E = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        String a = C2073aYw.a(T(), String.valueOf(Z()), d(c2.c, c2.e), c2.b, this.n.e(), C8404dki.b);
        if (L()) {
            int i4 = L + 17;
            E = i4 % 128;
            int i5 = i4 % 2;
            if (F()) {
                a = a + "loginsupported=true\r\n";
                if (this.y.a(MdxLoginPolicyEnum.LoginOnlyRequestedByTarget) || this.y.a(MdxLoginPolicyEnum.LoginAndPairRequestedByTarget)) {
                    a = a + "regpinconfirmation=true\r\n";
                }
            }
        }
        this.i.b(a, h(C2069aYs.d), t());
    }

    public void e(String str) {
        int i = 2 % 2;
        C8379djk c2 = this.n.c();
        if (c2 != null) {
            String T = T();
            long Z = Z();
            String d = C2073aYw.d(T, String.valueOf(Z), d(c2.c, c2.e), n(str), c2.b, this.n.e(), C8404dki.b);
            V();
            this.i.b(d, h(C2069aYs.a), t());
            return;
        }
        int i2 = L + 39;
        E = i2 % 128;
        if (i2 % 2 != 0) {
            C1044Mm.j("SessionMdxTarget", "doRegPair has invalid MSL credentials");
            int i3 = 71 / 0;
        } else {
            C1044Mm.j("SessionMdxTarget", "doRegPair has invalid MSL credentials");
        }
        int i4 = E + 51;
        L = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
        r11 = o.C2073aYw.d(T(), java.lang.String.valueOf(Z()), d(r1.c, r1.e), n(r11), r1.b, r10.n.e(), o.C8404dki.b);
        V();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
        if (G() == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
        r1 = com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E + 41;
        com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.L = r1 % 128;
        r1 = r1 % 2;
        r1 = r10.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
        if (r1.c() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
        r1 = com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.L + 21;
        com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
        r10.r = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
        if (r2 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
        r0 = r11 + "loginpolicy=" + r10.y.toString() + com.netflix.android.org.json.HTTP.CRLF;
        r1 = r10.y.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
        if (o.C8168dfL.h(r1) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
        r11 = r0 + "loginclid=" + r1 + com.netflix.android.org.json.HTTP.CRLF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c4, code lost:
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
        r10.i.b(r11, h(o.C2069aYs.a), t());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d4, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r1 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r1 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        o.C1044Mm.j("SessionMdxTarget", "doRemoteLogin has invalid MSL credentials");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.L
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1b
            o.bst r1 = r10.n
            o.djk r1 = r1.c()
            r3 = 23
            int r3 = r3 / r2
            if (r1 != 0) goto L2b
            goto L23
        L1b:
            o.bst r1 = r10.n
            o.djk r1 = r1.c()
            if (r1 != 0) goto L2b
        L23:
            java.lang.String r11 = "SessionMdxTarget"
            java.lang.String r0 = "doRemoteLogin has invalid MSL credentials"
            o.C1044Mm.j(r11, r0)
            return
        L2b:
            java.lang.String r3 = r10.T()
            long r4 = r10.Z()
            o.dkO r6 = r1.c
            o.dkU r7 = r1.e
            java.lang.String r6 = r10.d(r6, r7)
            java.lang.String r11 = r10.n(r11)
            o.djy r7 = r1.b
            o.bst r1 = r10.n
            o.dkd r8 = r1.e()
            o.dki r9 = o.C8404dki.b
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r5 = r6
            r6 = r11
            java.lang.String r11 = o.C2073aYw.d(r3, r4, r5, r6, r7, r8, r9)
            r10.V()
            boolean r1 = r10.G()
            if (r1 == 0) goto L5d
            goto L7d
        L5d:
            int r1 = com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E
            int r1 = r1 + 41
            int r3 = r1 % 128
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.L = r3
            int r1 = r1 % r0
            o.aWc r1 = r10.y
            if (r1 == 0) goto L7d
            boolean r1 = r1.c()
            if (r1 == 0) goto L7d
            int r1 = com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.L
            int r1 = r1 + 21
            int r3 = r1 % 128
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L7c
            goto L7d
        L7c:
            r2 = 1
        L7d:
            r10.r = r2
            if (r2 == 0) goto Lc5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            java.lang.String r11 = "loginpolicy="
            r0.append(r11)
            o.aWc r11 = r10.y
            java.lang.String r11 = r11.toString()
            r0.append(r11)
            java.lang.String r11 = "\r\n"
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            o.aWc r1 = r10.y
            java.lang.String r1 = r1.d()
            boolean r2 = o.C8168dfL.h(r1)
            if (r2 == 0) goto Lc4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "loginclid="
            r2.append(r0)
            r2.append(r1)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            goto Lc5
        Lc4:
            r11 = r0
        Lc5:
            T extends o.aWW r0 = r10.i
            java.lang.String r1 = o.C2069aYs.a
            java.lang.String r1 = r10.h(r1)
            java.lang.String r2 = r10.t()
            r0.b(r11, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.d(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
        if ((!o.C8168dfL.h(r1)) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
        if (o.C8168dfL.h(r1) != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
        r6.i.b(r1, h(o.C2069aYs.c), t());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void O() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E
            int r1 = r1 + 117
            int r2 = r1 % 128
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.L = r2
            int r1 = r1 % r0
            java.lang.String r2 = "startSession [%s]"
            java.lang.String r3 = "SessionMdxTarget"
            if (r1 != 0) goto L2a
            java.lang.String r1 = o.C2076aYz.c()
            java.lang.String r1 = r6.i(r1)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r4] = r1
            o.C1044Mm.c(r3, r2, r5)
            boolean r2 = o.C8168dfL.h(r1)
            r2 = r2 ^ r4
            if (r2 == 0) goto L3f
            goto L4e
        L2a:
            java.lang.String r1 = o.C2076aYz.c()
            java.lang.String r1 = r6.i(r1)
            java.lang.Object[] r4 = new java.lang.Object[]{r1}
            o.C1044Mm.c(r3, r2, r4)
            boolean r2 = o.C8168dfL.h(r1)
            if (r2 == 0) goto L4e
        L3f:
            T extends o.aWW r2 = r6.i
            java.lang.String r3 = o.C2069aYs.c
            java.lang.String r3 = r6.h(r3)
            java.lang.String r4 = r6.t()
            r2.b(r1, r3, r4)
        L4e:
            int r1 = com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.E
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.L = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L5d
            r0 = 64
            int r0 = r0 / 0
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget.O():void");
    }

    public void p() {
        int i = 2 % 2;
        C1044Mm.a("SessionMdxTarget", "doHandShake");
        a(new aXF());
        int i2 = E + 55;
        L = i2 % 128;
        int i3 = i2 % 2;
    }

    public void u() {
        int i = 2 % 2;
        C1044Mm.a("SessionMdxTarget", "getCapability");
        a(new aXL());
        int i2 = E + 75;
        L = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void y() {
        int i = 2 % 2;
        C1044Mm.a("SessionMdxTarget", "getState");
        a(new aXN());
        int i2 = E + 25;
        L = i2 % 128;
        int i3 = i2 % 2;
    }

    public void q() {
        int i = 2 % 2;
        int i2 = E + NetflixImageView.DEFAULT_LAYER_GRAVITY;
        L = i2 % 128;
        if (i2 % 2 == 0) {
            this.v.clear();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.v.clear();
        int i3 = E + 39;
        L = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 90 / 0;
        }
    }

    public boolean H() {
        int i = 2 % 2;
        int i2 = L + 13;
        E = i2 % 128;
        int i3 = i2 % 2;
        boolean z = !this.v.isEmpty();
        int i4 = L + 39;
        E = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return z;
    }

    public boolean J() {
        int i = 2 % 2;
        if (!(!this.v.isEmpty())) {
            C1044Mm.a("SessionMdxTarget", "sendPendingMessage, no message is currently pending");
            int i2 = E + 81;
            L = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AbstractC2049aXz abstractC2049aXz = this.v.get(0);
        int size = this.v.size();
        C1044Mm.c("SessionMdxTarget", "has %d, sending %s", Integer.valueOf(size), abstractC2049aXz.a());
        boolean a = a(abstractC2049aXz);
        int i3 = L + 41;
        E = i3 % 128;
        int i4 = i3 % 2;
        return a;
    }

    public void K() {
        int i = 2 % 2;
        if (!this.v.isEmpty()) {
            int i2 = E + 67;
            L = i2 % 128;
            int i3 = i2 % 2;
            int size = this.v.size();
            C1044Mm.c("SessionMdxTarget", "has %d, removing %s", Integer.valueOf(size), this.v.get(0).a());
            this.v.remove(0);
            return;
        }
        C1044Mm.a("SessionMdxTarget", "pendingMessageSent, but no message is currently pending");
        int i4 = L + 123;
        E = i4 % 128;
        int i5 = i4 % 2;
    }

    public aVX e(String str, MdxErrorSubCode mdxErrorSubCode) {
        int i = 2 % 2;
        int i2 = E + 51;
        L = i2 % 128;
        int i3 = i2 % 2;
        aVX a = a(str, mdxErrorSubCode, null);
        int i4 = L + 17;
        E = i4 % 128;
        if (i4 % 2 == 0) {
            return a;
        }
        throw null;
    }

    public aVX a(String str, MdxErrorSubCode mdxErrorSubCode, String str2) {
        MdxErrorCode mdxErrorCode;
        int i = 2 % 2;
        int i2 = E + 41;
        L = i2 % 128;
        int i3 = i2 % 2;
        if (MdxConnectionLogblobLogger.b()) {
            int i4 = L + NetflixImageView.DEFAULT_LAYER_GRAVITY;
            E = i4 % 128;
            if (i4 % 2 != 0) {
                MdxErrorCode mdxErrorCode2 = MdxErrorCode.ReconnectFailed;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            mdxErrorCode = MdxErrorCode.ReconnectFailed;
        } else {
            MdxErrorCode mdxErrorCode3 = MdxErrorCode.ConnectFailed;
            int i5 = E + 45;
            L = i5 % 128;
            int i6 = i5 % 2;
            mdxErrorCode = mdxErrorCode3;
        }
        return new aVX.d(mdxErrorCode).b(G() ? MdxErrorSuffix.GoogleCast : MdxErrorSuffix.NRDP).b(mdxErrorSubCode).e(str2).d(str).d();
    }

    public void b(aVX avx) {
        int i = 2 % 2;
        int i2 = E + 9;
        L = i2 % 128;
        int i3 = i2 % 2;
        C1044Mm.c("SessionMdxTarget", "reportError %s", avx.a());
        this.m.b(t(), avx.b().d(), avx.c(), avx.a());
        int i4 = E + 57;
        L = i4 % 128;
        int i5 = i4 % 2;
    }

    public void M() {
        int i = 2 % 2;
        int i2 = E + 69;
        L = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            EnumSet.of(MdxLoginPolicyEnum.LoginAndPair, MdxLoginPolicyEnum.LoginAndPairRequestedByTarget);
            N();
            throw null;
        }
        EnumSet of = EnumSet.of(MdxLoginPolicyEnum.LoginAndPair, MdxLoginPolicyEnum.LoginAndPairRequestedByTarget);
        if (!N() || this.y.e(of)) {
            if (!MdxConnectionLogblobLogger.b()) {
                MdxConnectionLogblobLogger e = this.g.e();
                MdxTargetType mdxTargetType = G() ? MdxTargetType.Cast : MdxTargetType.Nrdp;
                int i3 = E + 27;
                L = i3 % 128;
                int i4 = i3 % 2;
                e.a(mdxTargetType, n(), t(), k(), !C8168dfL.d(this.p, this.F), d(), e(), b(), this.r, this.D, this.G);
                return;
            }
            int i5 = L + 95;
            E = i5 % 128;
            if (i5 % 2 == 0) {
                this.g.e().e(G() ? MdxTargetType.Cast : MdxTargetType.Nrdp, n(), t(), k(), !C8168dfL.d(this.p, this.F), d(), e(), b());
                return;
            }
            this.g.e();
            G();
            obj.hashCode();
            throw null;
        }
    }

    public void e(aVX avx) {
        int i = 2 % 2;
        int i2 = L + 97;
        E = i2 % 128;
        if (i2 % 2 == 0) {
            e(avx, (String) null);
            return;
        }
        e(avx, (String) null);
        int i3 = 22 / 0;
    }

    void e(aVX avx, String str) {
        boolean z;
        int i = 2 % 2;
        EnumSet of = EnumSet.of(MdxLoginPolicyEnum.LoginAndPair, MdxLoginPolicyEnum.LoginAndPairRequestedByTarget);
        if (!(!N()) && !this.y.e(of)) {
            int i2 = E + 103;
            L = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } else if (MdxConnectionLogblobLogger.b()) {
            MdxConnectionLogblobLogger e = this.g.e();
            MdxTargetType mdxTargetType = G() ? MdxTargetType.Cast : MdxTargetType.Nrdp;
            int i3 = E + 105;
            L = i3 % 128;
            int i4 = i3 % 2;
            e.b(mdxTargetType, n(), t(), k(), !C8168dfL.d(this.p, this.F), d(), e(), b(), avx, str);
        } else {
            MdxConnectionLogblobLogger e2 = this.g.e();
            MdxTargetType mdxTargetType2 = G() ? MdxTargetType.Cast : MdxTargetType.Nrdp;
            String n = n();
            String t = t();
            String k = k();
            boolean d = C8168dfL.d(this.p, this.F);
            String d2 = d();
            String e3 = e();
            String b2 = b();
            if (this.r || MdxErrorSubCode.RemoteLoginCancelled.d(avx.b())) {
                z = true;
            } else {
                int i5 = L + 9;
                E = i5 % 128;
                int i6 = i5 % 2;
                z = false;
            }
            e2.c(mdxTargetType2, n, t, k, !d, d2, e3, b2, avx, str, z, this.D, this.G);
        }
    }

    private static void Y(int i, char c2, int i2, Object[] objArr) {
        int i3 = 2 % 2;
        C9581sN c9581sN = new C9581sN();
        long[] jArr = new long[i];
        c9581sN.d = 0;
        while (c9581sN.d < i) {
            int i4 = $11 + 13;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            jArr[c9581sN.d] = (((char) (b$s43$8523[i2 + c9581sN.d] ^ 8527296503698573146L)) ^ (c9581sN.d * (8527296503698573146L ^ d$s44$8523))) ^ c2;
            c9581sN.d++;
        }
        char[] cArr = new char[i];
        c9581sN.d = 0;
        while (c9581sN.d < i) {
            cArr[c9581sN.d] = (char) jArr[c9581sN.d];
            c9581sN.d++;
            int i6 = $11 + 97;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr);
    }
}
