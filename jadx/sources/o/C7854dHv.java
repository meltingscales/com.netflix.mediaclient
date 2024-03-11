package o;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.TypeCastException;
import o.dHS;
import okhttp3.Protocol;

/* renamed from: o.dHv  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7854dHv extends dHG {
    public static final b a = new b(null);
    private static final boolean b;
    private final List<dHN> c;
    private final dHR d;

    public C7854dHv() {
        List i;
        i = C8569dql.i(dHS.d.c(dHS.c, null, 1, null), dHO.e.d(), new dHQ("com.google.android.gms.org.conscrypt"), dHP.c.e());
        ArrayList arrayList = new ArrayList();
        for (Object obj : i) {
            if (((dHN) obj).e()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
        this.d = dHR.e.c();
    }

    @Override // o.dHG
    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        C8632dsu.d(socket, "");
        C8632dsu.d(inetSocketAddress, "");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e2);
            }
            throw e2;
        }
    }

    @Override // o.dHG
    public void b(SSLSocket sSLSocket, String str, List<Protocol> list) {
        Object obj;
        C8632dsu.d(sSLSocket, "");
        C8632dsu.d(list, "");
        Iterator<T> it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((dHN) obj).a(sSLSocket)) {
                break;
            }
        }
        dHN dhn = (dHN) obj;
        if (dhn != null) {
            dhn.d(sSLSocket, str, list);
        }
    }

    @Override // o.dHG
    public String d(SSLSocket sSLSocket) {
        Object obj;
        C8632dsu.d(sSLSocket, "");
        Iterator<T> it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((dHN) obj).a(sSLSocket)) {
                break;
            }
        }
        dHN dhn = (dHN) obj;
        if (dhn != null) {
            return dhn.c(sSLSocket);
        }
        return null;
    }

    @Override // o.dHG
    public Object d(String str) {
        C8632dsu.d((Object) str, "");
        return this.d.d(str);
    }

    @Override // o.dHG
    public void a(String str, Object obj) {
        C8632dsu.d((Object) str, "");
        if (this.d.d(obj)) {
            return;
        }
        dHG.a(this, str, 5, null, 4, null);
    }

    @Override // o.dHG
    public boolean e(String str) {
        C8632dsu.d((Object) str, "");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // o.dHG
    public dHV e(X509TrustManager x509TrustManager) {
        C8632dsu.d(x509TrustManager, "");
        dHJ e2 = dHJ.b.e(x509TrustManager);
        return e2 != null ? e2 : super.e(x509TrustManager);
    }

    @Override // o.dHG
    public dHZ a(X509TrustManager x509TrustManager) {
        C8632dsu.d(x509TrustManager, "");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            C8632dsu.b(declaredMethod, "");
            declaredMethod.setAccessible(true);
            return new e(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.a(x509TrustManager);
        }
    }

    /* renamed from: o.dHv$e */
    /* loaded from: classes5.dex */
    public static final class e implements dHZ {
        private final Method a;
        private final X509TrustManager c;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof e) {
                    e eVar = (e) obj;
                    return C8632dsu.c(this.c, eVar.c) && C8632dsu.c(this.a, eVar.a);
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.c;
            int hashCode = x509TrustManager != null ? x509TrustManager.hashCode() : 0;
            Method method = this.a;
            return (hashCode * 31) + (method != null ? method.hashCode() : 0);
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.c + ", findByIssuerAndSignatureMethod=" + this.a + ")";
        }

        public e(X509TrustManager x509TrustManager, Method method) {
            C8632dsu.d(x509TrustManager, "");
            C8632dsu.d(method, "");
            this.c = x509TrustManager;
            this.a = method;
        }

        @Override // o.dHZ
        public X509Certificate d(X509Certificate x509Certificate) {
            C8632dsu.d(x509Certificate, "");
            try {
                Object invoke = this.a.invoke(this.c, x509Certificate);
                if (invoke == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
                }
                return ((TrustAnchor) invoke).getTrustedCert();
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }
    }

    /* renamed from: o.dHv$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        public final boolean d() {
            return C7854dHv.b;
        }

        public final dHG e() {
            if (d()) {
                return new C7854dHv();
            }
            return null;
        }
    }

    static {
        b = dHG.i.a() && Build.VERSION.SDK_INT < 30;
    }
}
