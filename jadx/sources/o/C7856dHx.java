package o;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;

/* renamed from: o.dHx  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7856dHx extends dHG {
    private static final boolean a;
    public static final a d = new a(null);
    private final List<dHN> e;

    public C7856dHx() {
        List i;
        i = C8569dql.i(dHH.c.d(), dHO.e.d(), new dHQ("com.google.android.gms.org.conscrypt"), dHP.c.e());
        ArrayList arrayList = new ArrayList();
        for (Object obj : i) {
            if (((dHN) obj).e()) {
                arrayList.add(obj);
            }
        }
        this.e = arrayList;
    }

    @Override // o.dHG
    public void b(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        Object obj;
        C8632dsu.d(sSLSocket, "");
        C8632dsu.d(list, "");
        Iterator<T> it = this.e.iterator();
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
        Iterator<T> it = this.e.iterator();
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
    @SuppressLint({"NewApi"})
    public boolean e(String str) {
        C8632dsu.d((Object) str, "");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // o.dHG
    public dHV e(X509TrustManager x509TrustManager) {
        C8632dsu.d(x509TrustManager, "");
        dHJ e = dHJ.b.e(x509TrustManager);
        return e != null ? e : super.e(x509TrustManager);
    }

    /* renamed from: o.dHx$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        public final boolean d() {
            return C7856dHx.a;
        }

        public final dHG b() {
            if (d()) {
                return new C7856dHx();
            }
            return null;
        }
    }

    static {
        a = dHG.i.a() && Build.VERSION.SDK_INT >= 29;
    }
}
