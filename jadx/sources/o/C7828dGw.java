package o;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: o.dGw  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7828dGw {
    private final dFT b;
    private final Proxy c;
    private final InetSocketAddress d;

    public final Proxy a() {
        return this.c;
    }

    public final dFT c() {
        return this.b;
    }

    public final InetSocketAddress e() {
        return this.d;
    }

    public C7828dGw(dFT dft, Proxy proxy, InetSocketAddress inetSocketAddress) {
        C8632dsu.d(dft, "");
        C8632dsu.d(proxy, "");
        C8632dsu.d(inetSocketAddress, "");
        this.b = dft;
        this.c = proxy;
        this.d = inetSocketAddress;
    }

    public final boolean b() {
        return this.b.h() != null && this.c.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7828dGw) {
            C7828dGw c7828dGw = (C7828dGw) obj;
            if (C8632dsu.c(c7828dGw.b, this.b) && C8632dsu.c(c7828dGw.c, this.c) && C8632dsu.c(c7828dGw.d, this.d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        return ((((hashCode + 527) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "Route{" + this.d + '}';
    }
}
