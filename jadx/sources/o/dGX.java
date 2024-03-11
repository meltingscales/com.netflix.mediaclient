package o;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import o.C8566dqi;
import o.dFT;
import o.dGB;
import o.dGX;

/* loaded from: classes5.dex */
public final class dGX {
    public static final e e = new e(null);
    private List<? extends InetSocketAddress> a;
    private final dFT b;
    private final AbstractC7820dGo c;
    private final dFY d;
    private int f;
    private List<? extends Proxy> g;
    private final dGY h;
    private final List<C7828dGw> j;

    public dGX(dFT dft, dGY dgy, dFY dfy, AbstractC7820dGo abstractC7820dGo) {
        List<? extends Proxy> i;
        List<? extends InetSocketAddress> i2;
        C8632dsu.d(dft, "");
        C8632dsu.d(dgy, "");
        C8632dsu.d(dfy, "");
        C8632dsu.d(abstractC7820dGo, "");
        this.b = dft;
        this.h = dgy;
        this.d = dfy;
        this.c = abstractC7820dGo;
        i = C8569dql.i();
        this.g = i;
        i2 = C8569dql.i();
        this.a = i2;
        this.j = new ArrayList();
        e(dft.l(), dft.g());
    }

    public final boolean d() {
        return b() || (this.j.isEmpty() ^ true);
    }

    public final b a() {
        if (!d()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy e2 = e();
            for (InetSocketAddress inetSocketAddress : this.a) {
                C7828dGw c7828dGw = new C7828dGw(this.b, e2, inetSocketAddress);
                if (this.h.d(c7828dGw)) {
                    this.j.add(c7828dGw);
                } else {
                    arrayList.add(c7828dGw);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            C8571dqn.b(arrayList, this.j);
            this.j.clear();
        }
        return new b(arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.connection.RouteSelector$resetNextProxy$1] */
    private final void e(final C7818dGm c7818dGm, final Proxy proxy) {
        ?? r0 = new drO<List<? extends Proxy>>() { // from class: okhttp3.internal.connection.RouteSelector$resetNextProxy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final List<Proxy> invoke() {
                dFT dft;
                List<Proxy> e2;
                Proxy proxy2 = proxy;
                if (proxy2 != null) {
                    e2 = C8566dqi.e(proxy2);
                    return e2;
                }
                URI k = c7818dGm.k();
                if (k.getHost() == null) {
                    return dGB.a(Proxy.NO_PROXY);
                }
                dft = dGX.this.b;
                List<Proxy> select = dft.i().select(k);
                if (select == null || select.isEmpty()) {
                    return dGB.a(Proxy.NO_PROXY);
                }
                return dGB.e(select);
            }
        };
        this.c.d(this.d, c7818dGm);
        List<Proxy> invoke = r0.invoke();
        this.g = invoke;
        this.f = 0;
        this.c.e(this.d, c7818dGm, invoke);
    }

    private final boolean b() {
        return this.f < this.g.size();
    }

    private final Proxy e() {
        if (!b()) {
            throw new SocketException("No route to " + this.b.l().f() + "; exhausted proxy configurations: " + this.g);
        }
        List<? extends Proxy> list = this.g;
        int i = this.f;
        this.f = i + 1;
        Proxy proxy = list.get(i);
        e(proxy);
        return proxy;
    }

    private final void e(Proxy proxy) {
        String f;
        int n;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            f = this.b.l().f();
            n = this.b.l().n();
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            f = e.d(inetSocketAddress);
            n = inetSocketAddress.getPort();
        }
        if (1 > n || 65535 < n) {
            throw new SocketException("No route to " + f + ':' + n + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(f, n));
        } else {
            this.c.a(this.d, f);
            List<InetAddress> a = this.b.a().a(f);
            if (a.isEmpty()) {
                throw new UnknownHostException(this.b.a() + " returned no addresses for " + f);
            }
            this.c.a(this.d, f, a);
            for (InetAddress inetAddress : a) {
                arrayList.add(new InetSocketAddress(inetAddress, n));
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private final List<C7828dGw> a;
        private int b;

        public final List<C7828dGw> c() {
            return this.a;
        }

        public b(List<C7828dGw> list) {
            C8632dsu.d(list, "");
            this.a = list;
        }

        public final boolean a() {
            return this.b < this.a.size();
        }

        public final C7828dGw b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            List<C7828dGw> list = this.a;
            int i = this.b;
            this.b = i + 1;
            return list.get(i);
        }
    }

    /* loaded from: classes5.dex */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        public final String d(InetSocketAddress inetSocketAddress) {
            C8632dsu.d(inetSocketAddress, "");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                C8632dsu.b(hostName, "");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            C8632dsu.b(hostAddress, "");
            return hostAddress;
        }
    }
}
