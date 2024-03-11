package o;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.TypeCastException;
import okhttp3.Protocol;

@SuppressLint({"NewApi"})
/* loaded from: classes5.dex */
public final class dHH implements dHN {
    public static final a c = new a(null);

    @Override // o.dHN
    public boolean a(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        C8632dsu.d(sSLSocket, "");
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // o.dHN
    public boolean e() {
        return c.a();
    }

    @Override // o.dHN
    @SuppressLint({"NewApi"})
    public String c(SSLSocket sSLSocket) {
        String applicationProtocol;
        C8632dsu.d(sSLSocket, "");
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || C8632dsu.c((Object) applicationProtocol, (Object) "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // o.dHN
    @SuppressLint({"NewApi"})
    public void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        C8632dsu.d(sSLSocket, "");
        C8632dsu.d(list, "");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            C8632dsu.b(sSLParameters, "");
            Object[] array = dHG.i.d(list).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        public final dHN d() {
            if (a()) {
                return new dHH();
            }
            return null;
        }

        public final boolean a() {
            return dHG.i.a() && Build.VERSION.SDK_INT >= 29;
        }
    }
}
