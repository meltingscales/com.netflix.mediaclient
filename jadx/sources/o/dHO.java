package o;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.TypeCastException;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;

/* loaded from: classes5.dex */
public final class dHO implements dHN {
    public static final e e = new e(null);

    @Override // o.dHN
    public boolean a(SSLSocket sSLSocket) {
        C8632dsu.d(sSLSocket, "");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // o.dHN
    public boolean e() {
        return dHA.b.d();
    }

    @Override // o.dHN
    public String c(SSLSocket sSLSocket) {
        C8632dsu.d(sSLSocket, "");
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // o.dHN
    public void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        C8632dsu.d(sSLSocket, "");
        C8632dsu.d(list, "");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = dHG.i.d(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* loaded from: classes5.dex */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        public final dHN d() {
            if (dHA.b.d()) {
                return new dHO();
            }
            return null;
        }
    }
}
