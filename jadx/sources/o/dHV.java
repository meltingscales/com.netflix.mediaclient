package o;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes5.dex */
public abstract class dHV {
    public static final b d = new b(null);

    public abstract List<Certificate> b(List<? extends Certificate> list, String str);

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        public final dHV a(X509TrustManager x509TrustManager) {
            C8632dsu.d(x509TrustManager, "");
            return dHG.i.b().e(x509TrustManager);
        }
    }
}
