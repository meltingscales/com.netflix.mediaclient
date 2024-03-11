package o;

import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* loaded from: classes5.dex */
public final class dHQ implements dHN {
    private boolean a;
    private dHN c;
    private final String e;

    @Override // o.dHN
    public boolean e() {
        return true;
    }

    public dHQ(String str) {
        C8632dsu.d((Object) str, "");
        this.e = str;
    }

    @Override // o.dHN
    public boolean a(SSLSocket sSLSocket) {
        boolean i;
        C8632dsu.d(sSLSocket, "");
        String name = sSLSocket.getClass().getName();
        C8632dsu.b(name, "");
        i = C8691duz.i(name, this.e, false, 2, null);
        return i;
    }

    @Override // o.dHN
    public void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        C8632dsu.d(sSLSocket, "");
        C8632dsu.d(list, "");
        dHN e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }

    @Override // o.dHN
    public String c(SSLSocket sSLSocket) {
        C8632dsu.d(sSLSocket, "");
        dHN e = e(sSLSocket);
        if (e != null) {
            return e.c(sSLSocket);
        }
        return null;
    }

    private final dHN e(SSLSocket sSLSocket) {
        dHN dhn;
        synchronized (this) {
            if (!this.a) {
                try {
                    Class<?> cls = sSLSocket.getClass();
                    while (true) {
                        String name = cls.getName();
                        if (!C8632dsu.c((Object) name, (Object) (this.e + ".OpenSSLSocketImpl"))) {
                            cls = cls.getSuperclass();
                            C8632dsu.b(cls, "");
                            if (cls == null) {
                                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + sSLSocket);
                            }
                        } else {
                            this.c = new dHM(cls);
                            break;
                        }
                    }
                } catch (Exception e) {
                    dHG b = dHG.i.b();
                    b.d("Failed to initialize DeferredSocketAdapter " + this.e, 5, e);
                }
                this.a = true;
            }
            dhn = this.c;
        }
        return dhn;
    }
}
