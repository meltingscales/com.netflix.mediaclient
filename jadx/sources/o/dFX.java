package o;

import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.TypeCastException;
import o.C8572dqo;
import o.dFX;
import o.dHV;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class dFX {
    public static final b d = new b(null);
    public static final dFX e = new c().b();
    private final dHV b;
    private final Set<a> c;

    public final dHV d() {
        return this.b;
    }

    public dFX(Set<a> set, dHV dhv) {
        C8632dsu.d(set, "");
        this.c = set;
        this.b = dhv;
    }

    public /* synthetic */ dFX(Set set, dHV dhv, int i, C8627dsp c8627dsp) {
        this(set, (i & 2) != 0 ? null : dhv);
    }

    public final void b(final String str, final List<? extends Certificate> list) {
        C8632dsu.d((Object) str, "");
        C8632dsu.d(list, "");
        e(str, new drO<List<? extends X509Certificate>>() { // from class: okhttp3.CertificatePinner$check$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final List<X509Certificate> invoke() {
                List<Certificate> list2;
                int d2;
                dHV d3 = dFX.this.d();
                if (d3 == null || (list2 = d3.b(list, str)) == null) {
                    list2 = list;
                }
                d2 = C8572dqo.d(list2, 10);
                ArrayList arrayList = new ArrayList(d2);
                for (Certificate certificate : list2) {
                    if (certificate == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            }
        });
    }

    public final void e(String str, drO<? extends List<? extends X509Certificate>> dro) {
        C8632dsu.d((Object) str, "");
        C8632dsu.d(dro, "");
        List<a> c2 = c(str);
        if (c2.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> invoke = dro.invoke();
        for (X509Certificate x509Certificate : invoke) {
            ByteString byteString = null;
            ByteString byteString2 = null;
            for (a aVar : c2) {
                String b2 = aVar.b();
                int hashCode = b2.hashCode();
                if (hashCode == -903629273) {
                    if (!b2.equals("sha256")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + aVar.b());
                    }
                    if (byteString == null) {
                        byteString = d.c(x509Certificate);
                    }
                    if (C8632dsu.c(aVar.c(), byteString)) {
                        return;
                    }
                } else {
                    if (hashCode == 3528965 && b2.equals("sha1")) {
                        if (byteString2 == null) {
                            byteString2 = d.d(x509Certificate);
                        }
                        if (C8632dsu.c(aVar.c(), byteString2)) {
                            return;
                        }
                    }
                    throw new AssertionError("unsupported hashAlgorithm: " + aVar.b());
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : invoke) {
            sb.append("\n    ");
            sb.append(d.e(x509Certificate2));
            sb.append(": ");
            Principal subjectDN = x509Certificate2.getSubjectDN();
            C8632dsu.b(subjectDN, "");
            sb.append(subjectDN.getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        for (a aVar2 : c2) {
            sb.append("\n    ");
            sb.append(aVar2);
        }
        String sb2 = sb.toString();
        C8632dsu.b(sb2, "");
        throw new SSLPeerUnverifiedException(sb2);
    }

    public final List<a> c(String str) {
        List<a> i;
        C8632dsu.d((Object) str, "");
        i = C8569dql.i();
        for (Object obj : this.c) {
            if (((a) obj).e(str)) {
                if (i.isEmpty()) {
                    i = new ArrayList<>();
                }
                dsH.a(i).add(obj);
            }
        }
        return i;
    }

    public final dFX b(dHV dhv) {
        C8632dsu.d(dhv, "");
        return C8632dsu.c(this.b, dhv) ? this : new dFX(this.c, dhv);
    }

    public boolean equals(Object obj) {
        if (obj instanceof dFX) {
            dFX dfx = (dFX) obj;
            if (C8632dsu.c(dfx.c, this.c) && C8632dsu.c(dfx.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        dHV dhv = this.b;
        return ((hashCode + 1517) * 41) + (dhv != null ? dhv.hashCode() : 0);
    }

    /* loaded from: classes5.dex */
    public static final class a {
        private final String a;
        private final String b;
        private final ByteString c;

        public final String b() {
            return this.b;
        }

        public final ByteString c() {
            return this.c;
        }

        public final boolean e(String str) {
            boolean i;
            boolean i2;
            boolean b;
            int c;
            boolean b2;
            C8632dsu.d((Object) str, "");
            i = C8691duz.i(this.a, "**.", false, 2, null);
            if (i) {
                int length = this.a.length() - 3;
                int length2 = str.length() - length;
                b2 = C8691duz.b(str, str.length() - length, this.a, 3, length, false, 16, null);
                if (!b2) {
                    return false;
                }
                if (length2 != 0 && str.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                i2 = C8691duz.i(this.a, "*.", false, 2, null);
                if (i2) {
                    int length3 = this.a.length() - 1;
                    int length4 = str.length();
                    b = C8691duz.b(str, str.length() - length3, this.a, 1, length3, false, 16, null);
                    if (!b) {
                        return false;
                    }
                    c = duD.c((CharSequence) str, '.', (length4 - length3) - 1, false, 4, (Object) null);
                    if (c != -1) {
                        return false;
                    }
                } else {
                    return C8632dsu.c((Object) str, (Object) this.a);
                }
            }
            return true;
        }

        public String toString() {
            return this.b + '/' + this.c.d();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return ((C8632dsu.c((Object) this.a, (Object) aVar.a) ^ true) || (C8632dsu.c((Object) this.b, (Object) aVar.b) ^ true) || (C8632dsu.c(this.c, aVar.c) ^ true)) ? false : true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            return (((hashCode * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }
    }

    /* loaded from: classes5.dex */
    public static final class c {
        private final List<a> a = new ArrayList();

        public final dFX b() {
            Set W;
            W = C8576dqs.W(this.a);
            return new dFX(W, null, 2, null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        public final ByteString d(X509Certificate x509Certificate) {
            C8632dsu.d(x509Certificate, "");
            ByteString.b bVar = ByteString.c;
            PublicKey publicKey = x509Certificate.getPublicKey();
            C8632dsu.b(publicKey, "");
            byte[] encoded = publicKey.getEncoded();
            C8632dsu.b(encoded, "");
            return ByteString.b.c(bVar, encoded, 0, 0, 3, null).i();
        }

        public final ByteString c(X509Certificate x509Certificate) {
            C8632dsu.d(x509Certificate, "");
            ByteString.b bVar = ByteString.c;
            PublicKey publicKey = x509Certificate.getPublicKey();
            C8632dsu.b(publicKey, "");
            byte[] encoded = publicKey.getEncoded();
            C8632dsu.b(encoded, "");
            return ByteString.b.c(bVar, encoded, 0, 0, 3, null).g();
        }

        public final String e(Certificate certificate) {
            C8632dsu.d(certificate, "");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
            }
            return "sha256/" + c((X509Certificate) certificate).d();
        }
    }
}
