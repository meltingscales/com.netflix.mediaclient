package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.TypeCastException;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import okhttp3.TlsVersion;

/* renamed from: o.dGd  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7809dGd {
    public static final C7809dGd a;
    public static final C7809dGd b;
    public static final a c = new a(null);
    public static final C7809dGd d;
    public static final C7809dGd e;
    private static final C7810dGe[] f;
    private static final C7810dGe[] h;
    private final String[] g;
    private final boolean i;
    private final boolean j;

    /* renamed from: o  reason: collision with root package name */
    private final String[] f13803o;

    public final boolean a() {
        return this.j;
    }

    public final boolean e() {
        return this.i;
    }

    public C7809dGd(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.i = z;
        this.j = z2;
        this.g = strArr;
        this.f13803o = strArr2;
    }

    public final void c(SSLSocket sSLSocket, boolean z) {
        C8632dsu.d(sSLSocket, "");
        C7809dGd b2 = b(sSLSocket, z);
        if (b2.c() != null) {
            sSLSocket.setEnabledProtocols(b2.f13803o);
        }
        if (b2.b() != null) {
            sSLSocket.setEnabledCipherSuites(b2.g);
        }
    }

    private final C7809dGd b(SSLSocket sSLSocket, boolean z) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        Comparator naturalOrder;
        if (this.g != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            C8632dsu.b(enabledCipherSuites2, "");
            enabledCipherSuites = dGB.b(enabledCipherSuites2, this.g, C7810dGe.e.e());
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f13803o != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            C8632dsu.b(enabledProtocols2, "");
            String[] strArr = this.f13803o;
            naturalOrder = ComparisonsKt__ComparisonsKt.naturalOrder();
            enabledProtocols = dGB.b(enabledProtocols2, strArr, naturalOrder);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        C8632dsu.b(supportedCipherSuites, "");
        int d2 = dGB.d(supportedCipherSuites, "TLS_FALLBACK_SCSV", C7810dGe.e.e());
        if (z && d2 != -1) {
            C8632dsu.b(enabledCipherSuites, "");
            String str = supportedCipherSuites[d2];
            C8632dsu.b(str, "");
            enabledCipherSuites = dGB.a(enabledCipherSuites, str);
        }
        b bVar = new b(this);
        C8632dsu.b(enabledCipherSuites, "");
        b e2 = bVar.e((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        C8632dsu.b(enabledProtocols, "");
        return e2.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).b();
    }

    public final boolean b(SSLSocket sSLSocket) {
        Comparator naturalOrder;
        C8632dsu.d(sSLSocket, "");
        if (this.i) {
            String[] strArr = this.f13803o;
            if (strArr != null) {
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                naturalOrder = ComparisonsKt__ComparisonsKt.naturalOrder();
                if (!dGB.d(strArr, enabledProtocols, naturalOrder)) {
                    return false;
                }
            }
            String[] strArr2 = this.g;
            return strArr2 == null || dGB.d(strArr2, sSLSocket.getEnabledCipherSuites(), C7810dGe.e.e());
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7809dGd) {
            if (obj == this) {
                return true;
            }
            boolean z = this.i;
            C7809dGd c7809dGd = (C7809dGd) obj;
            if (z != c7809dGd.i) {
                return false;
            }
            return !z || (Arrays.equals(this.g, c7809dGd.g) && Arrays.equals(this.f13803o, c7809dGd.f13803o) && this.j == c7809dGd.j);
        }
        return false;
    }

    public int hashCode() {
        if (this.i) {
            String[] strArr = this.g;
            int hashCode = strArr != null ? Arrays.hashCode(strArr) : 0;
            String[] strArr2 = this.f13803o;
            return ((((hashCode + 527) * 31) + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.j ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (this.i) {
            return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.j + ')';
        }
        return "ConnectionSpec()";
    }

    /* renamed from: o.dGd$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private String[] a;
        private boolean b;
        private boolean c;
        private String[] d;

        public b(boolean z) {
            this.c = z;
        }

        public b(C7809dGd c7809dGd) {
            C8632dsu.d(c7809dGd, "");
            this.c = c7809dGd.e();
            this.d = c7809dGd.g;
            this.a = c7809dGd.f13803o;
            this.b = c7809dGd.a();
        }

        public final b e(String... strArr) {
            C8632dsu.d(strArr, "");
            if (this.c) {
                if (!(!(strArr.length == 0))) {
                    throw new IllegalArgumentException("At least one cipher suite is required".toString());
                }
                Object clone = strArr.clone();
                if (clone != null) {
                    this.d = (String[]) clone;
                    return this;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final b d(String... strArr) {
            C8632dsu.d(strArr, "");
            if (this.c) {
                if (!(!(strArr.length == 0))) {
                    throw new IllegalArgumentException("At least one TLS version is required".toString());
                }
                Object clone = strArr.clone();
                if (clone != null) {
                    this.a = (String[]) clone;
                    return this;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final b d(boolean z) {
            if (this.c) {
                this.b = z;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        public final C7809dGd b() {
            return new C7809dGd(this.c, this.b, this.d, this.a);
        }

        public final b e(C7810dGe... c7810dGeArr) {
            C8632dsu.d(c7810dGeArr, "");
            if (!this.c) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(c7810dGeArr.length);
            for (C7810dGe c7810dGe : c7810dGeArr) {
                arrayList.add(c7810dGe.d());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                return e((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public final b a(TlsVersion... tlsVersionArr) {
            C8632dsu.d(tlsVersionArr, "");
            if (!this.c) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(tlsVersionArr.length);
            for (TlsVersion tlsVersion : tlsVersionArr) {
                arrayList.add(tlsVersion.c());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                return d((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: o.dGd$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }
    }

    static {
        C7810dGe c7810dGe = C7810dGe.c;
        C7810dGe c7810dGe2 = C7810dGe.b;
        C7810dGe c7810dGe3 = C7810dGe.h;
        C7810dGe c7810dGe4 = C7810dGe.Q;
        C7810dGe c7810dGe5 = C7810dGe.ag;
        C7810dGe c7810dGe6 = C7810dGe.U;
        C7810dGe c7810dGe7 = C7810dGe.ad;
        C7810dGe c7810dGe8 = C7810dGe.X;
        C7810dGe c7810dGe9 = C7810dGe.ak;
        C7810dGe[] c7810dGeArr = {c7810dGe, c7810dGe2, c7810dGe3, c7810dGe4, c7810dGe5, c7810dGe6, c7810dGe7, c7810dGe8, c7810dGe9};
        f = c7810dGeArr;
        C7810dGe[] c7810dGeArr2 = {c7810dGe, c7810dGe2, c7810dGe3, c7810dGe4, c7810dGe5, c7810dGe6, c7810dGe7, c7810dGe8, c7810dGe9, C7810dGe.ac, C7810dGe.af, C7810dGe.bd, C7810dGe.bg, C7810dGe.be, C7810dGe.bb, C7810dGe.ba};
        h = c7810dGeArr2;
        b e2 = new b(true).e((C7810dGe[]) Arrays.copyOf(c7810dGeArr, 9));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        d = e2.a(tlsVersion, tlsVersion2).d(true).b();
        a = new b(true).e((C7810dGe[]) Arrays.copyOf(c7810dGeArr2, 16)).a(tlsVersion, tlsVersion2).d(true).b();
        e = new b(true).e((C7810dGe[]) Arrays.copyOf(c7810dGeArr2, 16)).a(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).d(true).b();
        b = new b(false).b();
    }

    public final List<C7810dGe> b() {
        List<C7810dGe> U;
        String[] strArr = this.g;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(C7810dGe.e.b(str));
            }
            U = C8576dqs.U(arrayList);
            return U;
        }
        return null;
    }

    public final List<TlsVersion> c() {
        List<TlsVersion> U;
        String[] strArr = this.f13803o;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(TlsVersion.a.c(str));
            }
            U = C8576dqs.U(arrayList);
            return U;
        }
        return null;
    }
}
