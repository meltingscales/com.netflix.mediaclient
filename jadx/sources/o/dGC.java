package o;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.TypeCastException;

/* loaded from: classes5.dex */
public final class dGC implements dFR {
    private final InterfaceC7814dGi e;

    public dGC() {
        this(null, 1, null);
    }

    public dGC(InterfaceC7814dGi interfaceC7814dGi) {
        C8632dsu.d(interfaceC7814dGi, "");
        this.e = interfaceC7814dGi;
    }

    public /* synthetic */ dGC(InterfaceC7814dGi interfaceC7814dGi, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? InterfaceC7814dGi.a : interfaceC7814dGi);
    }

    @Override // o.dFR
    public C7826dGu d(C7828dGw c7828dGw, C7824dGs c7824dGs) {
        Proxy proxy;
        boolean a;
        InterfaceC7814dGi interfaceC7814dGi;
        PasswordAuthentication requestPasswordAuthentication;
        dFT c;
        C8632dsu.d(c7824dGs, "");
        List<C7807dGb> a2 = c7824dGs.a();
        C7826dGu n = c7824dGs.n();
        C7818dGm j = n.j();
        boolean z = c7824dGs.c() == 407;
        if (c7828dGw == null || (proxy = c7828dGw.a()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C7807dGb c7807dGb : a2) {
            a = C8691duz.a("Basic", c7807dGb.c(), true);
            if (a) {
                if (c7828dGw == null || (c = c7828dGw.c()) == null || (interfaceC7814dGi = c.a()) == null) {
                    interfaceC7814dGi = this.e;
                }
                if (z) {
                    SocketAddress address = proxy.address();
                    if (address == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    C8632dsu.b(proxy, "");
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, c(proxy, j, interfaceC7814dGi), inetSocketAddress.getPort(), j.l(), c7807dGb.b(), c7807dGb.c(), j.t(), Authenticator.RequestorType.PROXY);
                } else {
                    String f = j.f();
                    C8632dsu.b(proxy, "");
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(f, c(proxy, j, interfaceC7814dGi), j.n(), j.l(), c7807dGb.b(), c7807dGb.c(), j.t(), Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    String str = z ? "Proxy-Authorization" : "Authorization";
                    String userName = requestPasswordAuthentication.getUserName();
                    C8632dsu.b(userName, "");
                    char[] password = requestPasswordAuthentication.getPassword();
                    C8632dsu.b(password, "");
                    return n.g().a(str, C7816dGk.a(userName, new String(password), c7807dGb.e())).a();
                }
            }
        }
        return null;
    }

    private final InetAddress c(Proxy proxy, C7818dGm c7818dGm, InterfaceC7814dGi interfaceC7814dGi) {
        Object y;
        Proxy.Type type = proxy.type();
        if (type != null && dGD.d[type.ordinal()] == 1) {
            y = C8576dqs.y(interfaceC7814dGi.a(c7818dGm.f()));
            return (InetAddress) y;
        }
        SocketAddress address = proxy.address();
        if (address != null) {
            InetAddress address2 = ((InetSocketAddress) address).getAddress();
            C8632dsu.b(address2, "");
            return address2;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.net.InetSocketAddress");
    }
}
