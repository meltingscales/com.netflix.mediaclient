package o;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import o.C7818dGm;
import okhttp3.Protocol;

/* loaded from: classes5.dex */
public final class dFT {
    private final List<C7809dGd> a;
    private final List<Protocol> b;
    private final dFX c;
    private final InterfaceC7814dGi d;
    private final HostnameVerifier e;
    private final SSLSocketFactory f;
    private final ProxySelector g;
    private final dFR h;
    private final SocketFactory i;
    private final Proxy j;
    private final C7818dGm k;

    public final InterfaceC7814dGi a() {
        return this.d;
    }

    public final List<Protocol> b() {
        return this.b;
    }

    public final dFX c() {
        return this.c;
    }

    public final HostnameVerifier d() {
        return this.e;
    }

    public final List<C7809dGd> e() {
        return this.a;
    }

    public final dFR f() {
        return this.h;
    }

    public final Proxy g() {
        return this.j;
    }

    public final SSLSocketFactory h() {
        return this.f;
    }

    public final ProxySelector i() {
        return this.g;
    }

    public final SocketFactory j() {
        return this.i;
    }

    public final C7818dGm l() {
        return this.k;
    }

    public dFT(String str, int i, InterfaceC7814dGi interfaceC7814dGi, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, dFX dfx, dFR dfr, Proxy proxy, List<? extends Protocol> list, List<C7809dGd> list2, ProxySelector proxySelector) {
        C8632dsu.d((Object) str, "");
        C8632dsu.d(interfaceC7814dGi, "");
        C8632dsu.d(socketFactory, "");
        C8632dsu.d(dfr, "");
        C8632dsu.d(list, "");
        C8632dsu.d(list2, "");
        C8632dsu.d(proxySelector, "");
        this.d = interfaceC7814dGi;
        this.i = socketFactory;
        this.f = sSLSocketFactory;
        this.e = hostnameVerifier;
        this.c = dfx;
        this.h = dfr;
        this.j = proxy;
        this.g = proxySelector;
        this.k = new C7818dGm.b().e(sSLSocketFactory != null ? "https" : "http").b(str).d(i).b();
        this.b = dGB.e(list);
        this.a = dGB.e(list2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof dFT) {
            dFT dft = (dFT) obj;
            if (C8632dsu.c(this.k, dft.k) && e(dft)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.k.hashCode();
        int hashCode2 = this.d.hashCode();
        int hashCode3 = this.h.hashCode();
        int hashCode4 = this.b.hashCode();
        int hashCode5 = this.a.hashCode();
        int hashCode6 = this.g.hashCode();
        int hashCode7 = Objects.hashCode(this.j);
        int hashCode8 = Objects.hashCode(this.f);
        return ((((((((((((((((((hashCode + 527) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + Objects.hashCode(this.e)) * 31) + Objects.hashCode(this.c);
    }

    public final boolean e(dFT dft) {
        C8632dsu.d(dft, "");
        return C8632dsu.c(this.d, dft.d) && C8632dsu.c(this.h, dft.h) && C8632dsu.c(this.b, dft.b) && C8632dsu.c(this.a, dft.a) && C8632dsu.c(this.g, dft.g) && C8632dsu.c(this.j, dft.j) && C8632dsu.c(this.f, dft.f) && C8632dsu.c(this.e, dft.e) && C8632dsu.c(this.c, dft.c) && this.k.n() == dft.k.n();
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.k.f());
        sb2.append(':');
        sb2.append(this.k.n());
        sb2.append(", ");
        if (this.j != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.j;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.g;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append("}");
        return sb2.toString();
    }
}
