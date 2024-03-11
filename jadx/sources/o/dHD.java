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
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;

/* loaded from: classes5.dex */
public final class dHD extends dHG {
    private static final boolean d;
    public static final d e;
    private final Provider a;

    private dHD() {
        this.a = new OpenJSSE();
    }

    public /* synthetic */ dHD(C8627dsp c8627dsp) {
        this();
    }

    @Override // o.dHG
    public SSLContext cG_() {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.a);
        C8632dsu.b(sSLContext, "");
        return sSLContext;
    }

    @Override // o.dHG
    public X509TrustManager c() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.a);
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
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                SSLParameters sSLParameters2 = sSLParameters;
                Object[] array = dHG.i.d(list).toArray(new String[0]);
                if (array != null) {
                    sSLParameters2.setApplicationProtocols((String[]) array);
                    sSLSocket2.setSSLParameters(sSLParameters);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            return;
        }
        super.b(sSLSocket, str, list);
    }

    @Override // o.dHG
    public String d(SSLSocket sSLSocket) {
        C8632dsu.d(sSLSocket, "");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol == null || C8632dsu.c((Object) applicationProtocol, (Object) "")) {
                return null;
            }
            return applicationProtocol;
        }
        return super.d(sSLSocket);
    }

    /* loaded from: classes5.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        public final boolean e() {
            return dHD.d;
        }

        public final dHD a() {
            if (e()) {
                return new dHD(null);
            }
            return null;
        }
    }

    static {
        d dVar = new d(null);
        e = dVar;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, dVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        d = z;
    }
}
