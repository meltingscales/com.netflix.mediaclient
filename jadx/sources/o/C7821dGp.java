package o;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import o.C8569dql;
import o.drO;
import okhttp3.TlsVersion;

/* renamed from: o.dGp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7821dGp {
    public static final a c = new a(null);
    private final C7810dGe a;
    private final InterfaceC8554dpx b;
    private final List<Certificate> d;
    private final TlsVersion e;

    public final List<Certificate> a() {
        return (List) this.b.getValue();
    }

    public final List<Certificate> b() {
        return this.d;
    }

    public final C7810dGe c() {
        return this.a;
    }

    public final TlsVersion d() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7821dGp(TlsVersion tlsVersion, C7810dGe c7810dGe, List<? extends Certificate> list, final drO<? extends List<? extends Certificate>> dro) {
        InterfaceC8554dpx b;
        C8632dsu.d(tlsVersion, "");
        C8632dsu.d(c7810dGe, "");
        C8632dsu.d(list, "");
        C8632dsu.d(dro, "");
        this.e = tlsVersion;
        this.a = c7810dGe;
        this.d = list;
        b = dpB.b(new drO<List<? extends Certificate>>() { // from class: okhttp3.Handshake$peerCertificates$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final List<Certificate> invoke() {
                List<Certificate> i;
                try {
                    return (List) drO.this.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    i = C8569dql.i();
                    return i;
                }
            }
        });
        this.b = b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7821dGp) {
            C7821dGp c7821dGp = (C7821dGp) obj;
            if (c7821dGp.e == this.e && C8632dsu.c(c7821dGp.a, this.a) && C8632dsu.c(c7821dGp.a(), a()) && C8632dsu.c(c7821dGp.d, this.d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        int hashCode2 = this.a.hashCode();
        return ((((((hashCode + 527) * 31) + hashCode2) * 31) + a().hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        int d;
        int d2;
        List<Certificate> a2 = a();
        d = C8572dqo.d(a2, 10);
        ArrayList arrayList = new ArrayList(d);
        for (Certificate certificate : a2) {
            arrayList.add(a(certificate));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{");
        sb.append("tlsVersion=");
        sb.append(this.e);
        sb.append(' ');
        sb.append("cipherSuite=");
        sb.append(this.a);
        sb.append(' ');
        sb.append("peerCertificates=");
        sb.append(obj);
        sb.append(' ');
        sb.append("localCertificates=");
        List<Certificate> list = this.d;
        d2 = C8572dqo.d(list, 10);
        ArrayList arrayList2 = new ArrayList(d2);
        for (Certificate certificate2 : list) {
            arrayList2.add(a(certificate2));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }

    private final String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        C8632dsu.b(type, "");
        return type;
    }

    /* renamed from: o.dGp$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        public final C7821dGp a(SSLSession sSLSession) {
            final List<Certificate> i;
            C8632dsu.d(sSLSession, "");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            int hashCode = cipherSuite.hashCode();
            if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            C7810dGe b = C7810dGe.e.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (C8632dsu.c((Object) "NONE", (Object) protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion c = TlsVersion.a.c(protocol);
            try {
                i = d(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                i = C8569dql.i();
            }
            return new C7821dGp(c, b, d(sSLSession.getLocalCertificates()), new drO<List<? extends Certificate>>() { // from class: okhttp3.Handshake$Companion$handshake$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: d */
                public final List<Certificate> invoke() {
                    return i;
                }
            });
        }

        private final List<Certificate> d(Certificate[] certificateArr) {
            List<Certificate> i;
            if (certificateArr != null) {
                return dGB.a((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length));
            }
            i = C8569dql.i();
            return i;
        }

        public final C7821dGp b(TlsVersion tlsVersion, C7810dGe c7810dGe, List<? extends Certificate> list, List<? extends Certificate> list2) {
            C8632dsu.d(tlsVersion, "");
            C8632dsu.d(c7810dGe, "");
            C8632dsu.d(list, "");
            C8632dsu.d(list2, "");
            final List e = dGB.e(list);
            return new C7821dGp(tlsVersion, c7810dGe, dGB.e(list2), new drO<List<? extends Certificate>>() { // from class: okhttp3.Handshake$Companion$get$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: c */
                public final List<Certificate> invoke() {
                    return e;
                }
            });
        }
    }
}
