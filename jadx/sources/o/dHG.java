package o;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.TypeCastException;
import okhttp3.Protocol;

/* loaded from: classes5.dex */
public class dHG {
    private static final Logger a;
    private static volatile dHG e;
    public static final e i;

    public void b(SSLSocket sSLSocket, String str, List<Protocol> list) {
        C8632dsu.d(sSLSocket, "");
        C8632dsu.d(list, "");
    }

    public String d(SSLSocket sSLSocket) {
        C8632dsu.d(sSLSocket, "");
        return null;
    }

    public void e(SSLSocket sSLSocket) {
        C8632dsu.d(sSLSocket, "");
    }

    public boolean e(String str) {
        C8632dsu.d((Object) str, "");
        return true;
    }

    public final String h() {
        return "OkHttp";
    }

    public SSLContext cG_() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        C8632dsu.b(sSLContext, "");
        return sSLContext;
    }

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

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        C8632dsu.d(socket, "");
        C8632dsu.d(inetSocketAddress, "");
        socket.connect(inetSocketAddress, i2);
    }

    public static /* synthetic */ void a(dHG dhg, String str, int i2, Throwable th, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i3 & 2) != 0) {
            i2 = 4;
        }
        if ((i3 & 4) != 0) {
            th = null;
        }
        dhg.d(str, i2, th);
    }

    public void d(String str, int i2, Throwable th) {
        C8632dsu.d((Object) str, "");
        a.log(i2 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public Object d(String str) {
        C8632dsu.d((Object) str, "");
        if (a.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public void a(String str, Object obj) {
        C8632dsu.d((Object) str, "");
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        d(str, 5, (Throwable) obj);
    }

    public dHV e(X509TrustManager x509TrustManager) {
        C8632dsu.d(x509TrustManager, "");
        return new dHT(a(x509TrustManager));
    }

    public dHZ a(X509TrustManager x509TrustManager) {
        C8632dsu.d(x509TrustManager, "");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        C8632dsu.b(acceptedIssuers, "");
        return new dHU((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public SSLSocketFactory d(X509TrustManager x509TrustManager) {
        C8632dsu.d(x509TrustManager, "");
        try {
            SSLContext cG_ = cG_();
            cG_.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = cG_.getSocketFactory();
            C8632dsu.b(socketFactory, "");
            return socketFactory;
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS: " + e2, e2);
        }
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        C8632dsu.b(simpleName, "");
        return simpleName;
    }

    /* loaded from: classes5.dex */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        public final dHG b() {
            return dHG.e;
        }

        public final boolean a() {
            return C8632dsu.c((Object) "Dalvik", (Object) System.getProperty("java.vm.name"));
        }

        private final boolean f() {
            Provider provider = Security.getProviders()[0];
            C8632dsu.b(provider, "");
            return C8632dsu.c((Object) "Conscrypt", (Object) provider.getName());
        }

        private final boolean j() {
            Provider provider = Security.getProviders()[0];
            C8632dsu.b(provider, "");
            return C8632dsu.c((Object) "OpenJSSE", (Object) provider.getName());
        }

        private final boolean g() {
            Provider provider = Security.getProviders()[0];
            C8632dsu.b(provider, "");
            return C8632dsu.c((Object) "BC", (Object) provider.getName());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final dHG c() {
            if (a()) {
                return d();
            }
            return e();
        }

        private final dHG d() {
            dHL.c.d();
            dHG b = C7856dHx.d.b();
            if (b == null && (b = C7854dHv.a.e()) == null) {
                C8632dsu.e();
            }
            return b;
        }

        private final dHG e() {
            dHD a;
            C7853dHu d;
            dHA b;
            if (!f() || (b = dHA.b.b()) == null) {
                if (!g() || (d = C7853dHu.c.d()) == null) {
                    if (!j() || (a = dHD.e.a()) == null) {
                        C7858dHz c = C7858dHz.e.c();
                        if (c != null) {
                            return c;
                        }
                        dHG d2 = dHC.a.d();
                        return d2 != null ? d2 : new dHG();
                    }
                    return a;
                }
                return d;
            }
            return b;
        }

        public final byte[] a(List<? extends Protocol> list) {
            C8632dsu.d(list, "");
            C7872dIo c7872dIo = new C7872dIo();
            for (String str : d(list)) {
                c7872dIo.c(str.length());
                c7872dIo.b(str);
            }
            return c7872dIo.q();
        }

        public final List<String> d(List<? extends Protocol> list) {
            int d;
            C8632dsu.d(list, "");
            ArrayList<Protocol> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            d = C8572dqo.d(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(d);
            for (Protocol protocol : arrayList) {
                arrayList2.add(protocol.toString());
            }
            return arrayList2;
        }
    }

    static {
        e eVar = new e(null);
        i = eVar;
        e = eVar.c();
        a = Logger.getLogger(C7823dGr.class.getName());
    }
}
