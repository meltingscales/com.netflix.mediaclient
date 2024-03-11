package o;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.TypeCastException;
import okhttp3.Protocol;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes5.dex */
public final class dHP implements dHN {
    public static final b c = new b(null);

    @Override // o.dHN
    public boolean a(SSLSocket sSLSocket) {
        C8632dsu.d(sSLSocket, "");
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // o.dHN
    public boolean e() {
        return C7853dHu.c.e();
    }

    @Override // o.dHN
    public String c(SSLSocket sSLSocket) {
        C8632dsu.d(sSLSocket, "");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || C8632dsu.c((Object) applicationProtocol, (Object) "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // o.dHN
    public void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        C8632dsu.d(sSLSocket, "");
        C8632dsu.d(list, "");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            C8632dsu.b(parameters, "");
            Object[] array = dHG.i.d(list).toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        public final dHN e() {
            if (C7853dHu.c.e()) {
                return new dHP();
            }
            return null;
        }
    }
}
