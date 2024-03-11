package o;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.dGe  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7810dGe {
    public static final C7810dGe A;
    public static final C7810dGe B;
    public static final C7810dGe C;
    public static final C7810dGe D;
    public static final C7810dGe E;
    public static final C7810dGe F;
    public static final C7810dGe G;
    public static final C7810dGe H;
    public static final C7810dGe I;

    /* renamed from: J  reason: collision with root package name */
    public static final C7810dGe f13804J;
    public static final C7810dGe K;
    public static final C7810dGe L;
    public static final C7810dGe M;
    public static final C7810dGe N;
    public static final C7810dGe O;
    public static final C7810dGe P;
    public static final C7810dGe Q;
    public static final C7810dGe R;
    public static final C7810dGe S;
    public static final C7810dGe T;
    public static final C7810dGe U;
    public static final C7810dGe V;
    public static final C7810dGe W;
    public static final C7810dGe X;
    public static final C7810dGe Y;
    public static final C7810dGe Z;
    public static final C7810dGe a;
    public static final C7810dGe aA;
    public static final C7810dGe aB;
    public static final C7810dGe aC;
    public static final C7810dGe aD;
    public static final C7810dGe aE;
    public static final C7810dGe aF;
    public static final C7810dGe aG;
    public static final C7810dGe aH;
    public static final C7810dGe aI;
    public static final C7810dGe aJ;
    public static final C7810dGe aK;
    public static final C7810dGe aL;
    public static final C7810dGe aM;
    public static final C7810dGe aN;
    public static final C7810dGe aO;
    public static final C7810dGe aP;
    public static final C7810dGe aQ;
    public static final C7810dGe aR;
    public static final C7810dGe aS;
    public static final C7810dGe aT;
    public static final C7810dGe aU;
    public static final C7810dGe aV;
    public static final C7810dGe aW;
    public static final C7810dGe aX;
    public static final C7810dGe aY;
    public static final C7810dGe aZ;
    public static final C7810dGe aa;
    public static final C7810dGe ab;
    public static final C7810dGe ac;
    public static final C7810dGe ad;
    public static final C7810dGe ae;
    public static final C7810dGe af;
    public static final C7810dGe ag;
    public static final C7810dGe ah;
    public static final C7810dGe ai;
    public static final C7810dGe aj;
    public static final C7810dGe ak;
    public static final C7810dGe al;
    public static final C7810dGe am;
    public static final C7810dGe an;
    public static final C7810dGe ao;
    public static final C7810dGe ap;
    public static final C7810dGe aq;
    public static final C7810dGe ar;
    public static final C7810dGe as;
    public static final C7810dGe at;
    public static final C7810dGe au;
    public static final C7810dGe av;
    public static final C7810dGe aw;
    public static final C7810dGe ax;
    public static final C7810dGe ay;
    public static final C7810dGe az;
    public static final C7810dGe b;
    public static final C7810dGe ba;
    public static final C7810dGe bb;
    public static final C7810dGe bc;
    public static final C7810dGe bd;
    public static final C7810dGe be;
    public static final C7810dGe bf;
    public static final C7810dGe bg;
    public static final C7810dGe bh;
    public static final C7810dGe bi;
    public static final C7810dGe bj;
    public static final C7810dGe bk;
    public static final C7810dGe bl;
    public static final C7810dGe bm;
    public static final C7810dGe bn;
    public static final C7810dGe bo;
    public static final C7810dGe bp;
    private static final Comparator<String> bq;
    private static final Map<String, C7810dGe> br;
    public static final C7810dGe c;
    public static final C7810dGe d;
    public static final c e;
    public static final C7810dGe f;
    public static final C7810dGe g;
    public static final C7810dGe h;
    public static final C7810dGe i;
    public static final C7810dGe j;
    public static final C7810dGe k;
    public static final C7810dGe l;
    public static final C7810dGe m;
    public static final C7810dGe n;

    /* renamed from: o  reason: collision with root package name */
    public static final C7810dGe f13805o;
    public static final C7810dGe p;
    public static final C7810dGe q;
    public static final C7810dGe r;
    public static final C7810dGe s;
    public static final C7810dGe t;
    public static final C7810dGe u;
    public static final C7810dGe v;
    public static final C7810dGe w;
    public static final C7810dGe x;
    public static final C7810dGe y;
    public static final C7810dGe z;
    private final String bu;

    public final String d() {
        return this.bu;
    }

    public String toString() {
        return this.bu;
    }

    private C7810dGe(String str) {
        this.bu = str;
    }

    public /* synthetic */ C7810dGe(String str, C8627dsp c8627dsp) {
        this(str);
    }

    /* renamed from: o.dGe$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        public final Comparator<String> e() {
            return C7810dGe.bq;
        }

        public final C7810dGe b(String str) {
            C7810dGe c7810dGe;
            synchronized (this) {
                C8632dsu.d((Object) str, "");
                c7810dGe = (C7810dGe) C7810dGe.br.get(str);
                if (c7810dGe == null) {
                    c7810dGe = (C7810dGe) C7810dGe.br.get(c(str));
                    if (c7810dGe == null) {
                        c7810dGe = new C7810dGe(str, null);
                    }
                    C7810dGe.br.put(str, c7810dGe);
                }
            }
            return c7810dGe;
        }

        private final String c(String str) {
            boolean i;
            boolean i2;
            i = C8691duz.i(str, "TLS_", false, 2, null);
            if (i) {
                StringBuilder sb = new StringBuilder();
                sb.append("SSL_");
                if (str != null) {
                    String substring = str.substring(4);
                    C8632dsu.b(substring, "");
                    sb.append(substring);
                    return sb.toString();
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            i2 = C8691duz.i(str, "SSL_", false, 2, null);
            if (i2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("TLS_");
                if (str != null) {
                    String substring2 = str.substring(4);
                    C8632dsu.b(substring2, "");
                    sb2.append(substring2);
                    return sb2.toString();
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C7810dGe c(String str, int i) {
            C7810dGe c7810dGe = new C7810dGe(str, null);
            C7810dGe.br.put(str, c7810dGe);
            return c7810dGe;
        }
    }

    /* renamed from: o.dGe$b */
    /* loaded from: classes5.dex */
    public static final class b implements Comparator<String> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(String str, String str2) {
            C8632dsu.d((Object) str, "");
            C8632dsu.d((Object) str2, "");
            int min = Math.min(str.length(), str2.length());
            for (int i = 4; i < min; i++) {
                char charAt = str.charAt(i);
                char charAt2 = str2.charAt(i);
                if (charAt != charAt2) {
                    return charAt < charAt2 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    static {
        c cVar = new c(null);
        e = cVar;
        bq = new b();
        br = new LinkedHashMap();
        bh = cVar.c("SSL_RSA_WITH_NULL_MD5", 1);
        bl = cVar.c("SSL_RSA_WITH_NULL_SHA", 2);
        aW = cVar.c("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        bp = cVar.c("SSL_RSA_WITH_RC4_128_MD5", 4);
        bm = cVar.c("SSL_RSA_WITH_RC4_128_SHA", 5);
        aX = cVar.c("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        bk = cVar.c("SSL_RSA_WITH_DES_CBC_SHA", 9);
        ba = cVar.c("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        j = cVar.c("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        q = cVar.c("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        f = cVar.c("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        t = cVar.c("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        D = cVar.c("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        s = cVar.c("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        I = cVar.c("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        K = cVar.c("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        A = cVar.c("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        L = cVar.c("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        H = cVar.c("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        aV = cVar.c("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        aO = cVar.c("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        aT = cVar.c("TLS_KRB5_WITH_RC4_128_SHA", 32);
        aN = cVar.c("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        aP = cVar.c("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        aS = cVar.c("TLS_KRB5_WITH_RC4_128_MD5", 36);
        aJ = cVar.c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        aM = cVar.c("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        aI = cVar.c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        aQ = cVar.c("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        be = cVar.c("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        g = cVar.c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        r = cVar.c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        F = cVar.c("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        bb = cVar.c("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        m = cVar.c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        w = cVar.c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        N = cVar.c("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        bn = cVar.c("TLS_RSA_WITH_NULL_SHA256", 59);
        bf = cVar.c("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        bc = cVar.c("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        i = cVar.c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        bi = cVar.c("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        n = cVar.c("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        B = cVar.c("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        x = cVar.c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        f13805o = cVar.c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        v = cVar.c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        G = cVar.c("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        M = cVar.c("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        bj = cVar.c("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        p = cVar.c("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        z = cVar.c("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        aZ = cVar.c("TLS_PSK_WITH_RC4_128_SHA", 138);
        aR = cVar.c("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        aU = cVar.c("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        aY = cVar.c("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        bo = cVar.c("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        bd = cVar.c("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        bg = cVar.c("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        y = cVar.c("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        u = cVar.c("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        k = cVar.c("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        l = cVar.c("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        E = cVar.c("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        f13804J = cVar.c("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        aK = cVar.c("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", PrivateKeyType.INVALID);
        aH = cVar.c("TLS_FALLBACK_SCSV", 22016);
        au = cVar.c("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        as = cVar.c("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        al = cVar.c("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        aj = cVar.c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        aq = cVar.c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        T = cVar.c("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        W = cVar.c("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        O = cVar.c("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        R = cVar.c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        P = cVar.c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        ay = cVar.c("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        aC = cVar.c("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        av = cVar.c("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        at = cVar.c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        az = cVar.c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        am = cVar.c("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        ai = cVar.c("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        Y = cVar.c("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        ac = cVar.c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        af = cVar.c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        aE = cVar.c("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        aL = cVar.c("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        aD = cVar.c("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        aF = cVar.c("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        aG = cVar.c("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        S = cVar.c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        V = cVar.c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        an = cVar.c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        ap = cVar.c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        ae = cVar.c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        ah = cVar.c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        aw = cVar.c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        aB = cVar.c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        Q = cVar.c("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        U = cVar.c("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        ar = cVar.c("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        ao = cVar.c("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        ag = cVar.c("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        ad = cVar.c("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        aA = cVar.c("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        ax = cVar.c("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        aa = cVar.c("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        Z = cVar.c("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        ak = cVar.c("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        X = cVar.c("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        C = cVar.c("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        ab = cVar.c("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        c = cVar.c("TLS_AES_128_GCM_SHA256", 4865);
        b = cVar.c("TLS_AES_256_GCM_SHA384", 4866);
        h = cVar.c("TLS_CHACHA20_POLY1305_SHA256", 4867);
        a = cVar.c("TLS_AES_128_CCM_SHA256", 4868);
        d = cVar.c("TLS_AES_128_CCM_8_SHA256", 4869);
    }
}
