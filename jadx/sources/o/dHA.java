package o;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.TypeCastException;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* loaded from: classes5.dex */
public final class dHA extends dHG {
    private static final boolean a;
    public static final b b;
    private final Provider c;

    /* loaded from: classes5.dex */
    static final class e implements ConscryptHostnameVerifier {
        public static final e a = new e();

        e() {
        }
    }

    private dHA() {
        Provider build = Conscrypt.newProviderBuilder().provideTrustManager(true).build();
        C8632dsu.b(build, "");
        this.c = build;
    }

    public /* synthetic */ dHA(C8627dsp c8627dsp) {
        this();
    }

    @Override // o.dHG
    public SSLContext cG_() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.c);
        C8632dsu.b(sSLContext, "");
        return sSLContext;
    }

    @Override // o.dHG
    public X509TrustManager c() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        C8632dsu.b(trustManagerFactory, "");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers == null) {
            C8632dsu.e();
        }
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager != null) {
                    X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                    Conscrypt.setHostnameVerifier(x509TrustManager, e.a);
                    return x509TrustManager;
                }
                throw new TypeCastException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        C8632dsu.b(arrays, "");
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }

    @Override // o.dHG
    public void b(SSLSocket sSLSocket, String str, List<Protocol> list) {
        C8632dsu.d(sSLSocket, "");
        C8632dsu.d(list, "");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = dHG.i.d(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        super.b(sSLSocket, str, list);
    }

    @Override // o.dHG
    public String d(SSLSocket sSLSocket) {
        C8632dsu.d(sSLSocket, "");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.d(sSLSocket);
    }

    @Override // o.dHG
    public SSLSocketFactory d(X509TrustManager x509TrustManager) {
        C8632dsu.d(x509TrustManager, "");
        SSLContext cG_ = cG_();
        cG_.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = cG_.getSocketFactory();
        Conscrypt.setUseEngineSocket(socketFactory, true);
        C8632dsu.b(socketFactory, "");
        return socketFactory;
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        public final boolean d() {
            return dHA.a;
        }

        public final dHA b() {
            if (d()) {
                return new dHA(null);
            }
            return null;
        }

        public final boolean e(int i, int i2, int i3) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i ? version.major() > i : version.minor() != i2 ? version.minor() > i2 : version.patch() >= i3;
        }
    }

    static {
        b bVar = new b(null);
        b = bVar;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, bVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (bVar.e(2, 1, 0)) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        a = z;
    }
}
