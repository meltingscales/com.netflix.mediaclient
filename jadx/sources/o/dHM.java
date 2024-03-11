package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* loaded from: classes5.dex */
public class dHM implements dHN {
    public static final d b = new d(null);
    private final Method a;
    private final Method c;
    private final Method d;
    private final Method e;
    private final Class<? super SSLSocket> f;

    public dHM(Class<? super SSLSocket> cls) {
        C8632dsu.d(cls, "");
        this.f = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        C8632dsu.b(declaredMethod, "");
        this.c = declaredMethod;
        this.d = cls.getMethod("setHostname", String.class);
        this.a = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // o.dHN
    public boolean e() {
        return C7854dHv.a.d();
    }

    @Override // o.dHN
    public boolean a(SSLSocket sSLSocket) {
        C8632dsu.d(sSLSocket, "");
        return this.f.isInstance(sSLSocket);
    }

    @Override // o.dHN
    public void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        C8632dsu.d(sSLSocket, "");
        C8632dsu.d(list, "");
        if (a(sSLSocket)) {
            try {
                this.c.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.d.invoke(sSLSocket, str);
                }
                this.e.invoke(sSLSocket, dHG.i.a(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // o.dHN
    public String c(SSLSocket sSLSocket) {
        C8632dsu.d(sSLSocket, "");
        if (a(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.a.invoke(sSLSocket, new Object[0]);
                if (bArr != null) {
                    Charset charset = StandardCharsets.UTF_8;
                    C8632dsu.b(charset, "");
                    return new String(bArr, charset);
                }
                return null;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (NullPointerException e2) {
                if (C8632dsu.c((Object) e2.getMessage(), (Object) "ssl == null")) {
                    return null;
                }
                throw e2;
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
        return null;
    }

    /* loaded from: classes5.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }
    }
}
