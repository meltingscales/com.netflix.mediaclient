package o;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.TypeCastException;
import okhttp3.Protocol;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* renamed from: o.dHu  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7853dHu extends dHG {
    public static final c c;
    private static final boolean d;
    private final Provider a;

    private C7853dHu() {
        this.a = new BouncyCastleJsseProvider();
    }

    public /* synthetic */ C7853dHu(C8627dsp c8627dsp) {
        this();
    }

    @Override // o.dHG
    public SSLContext cG_() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.a);
        C8632dsu.b(sSLContext, "");
        return sSLContext;
    }

    @Override // o.dHG
    public X509TrustManager c() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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
                    return (X509TrustManager) trustManager;
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
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            List<String> d2 = dHG.i.d(list);
            C8632dsu.b(parameters, "");
            Object[] array = d2.toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        super.b(sSLSocket, str, list);
    }

    @Override // o.dHG
    public String d(SSLSocket sSLSocket) {
        C8632dsu.d(sSLSocket, "");
        if (sSLSocket instanceof BCSSLSocket) {
            String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol == null || C8632dsu.c((Object) applicationProtocol, (Object) "")) {
                return null;
            }
            return applicationProtocol;
        }
        return super.d(sSLSocket);
    }

    /* renamed from: o.dHu$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        public final boolean e() {
            return C7853dHu.d;
        }

        public final C7853dHu d() {
            if (e()) {
                return new C7853dHu(null);
            }
            return null;
        }
    }

    static {
        c cVar = new c(null);
        c = cVar;
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, cVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        d = z;
    }
}
