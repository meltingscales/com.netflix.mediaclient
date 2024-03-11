package o;

import android.net.http.X509TrustManagerExtensions;
import com.netflix.ale.AleCryptoBouncyCastle;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.TypeCastException;

/* loaded from: classes5.dex */
public final class dHJ extends dHV {
    public static final b b = new b(null);
    private final X509TrustManagerExtensions a;
    private final X509TrustManager c;

    public dHJ(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        C8632dsu.d(x509TrustManager, "");
        C8632dsu.d(x509TrustManagerExtensions, "");
        this.c = x509TrustManager;
        this.a = x509TrustManagerExtensions;
    }

    public boolean equals(Object obj) {
        return (obj instanceof dHJ) && ((dHJ) obj).c == this.c;
    }

    public int hashCode() {
        return System.identityHashCode(this.c);
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        public final dHJ e(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            C8632dsu.d(x509TrustManager, "");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new dHJ(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }

    @Override // o.dHV
    public List<Certificate> b(List<? extends Certificate> list, String str) {
        C8632dsu.d(list, "");
        C8632dsu.d((Object) str, "");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.a.checkServerTrusted((X509Certificate[]) array, AleCryptoBouncyCastle.RSA_KEY_ALG, str);
                C8632dsu.b(checkServerTrusted, "");
                return checkServerTrusted;
            } catch (CertificateException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            }
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
