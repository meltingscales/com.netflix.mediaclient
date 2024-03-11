package o;

import android.support.v4.media.session.PlaybackStateCompat;
import com.netflix.model.leafs.originals.interactive.Audio;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.TypeCastException;
import o.AbstractC7820dGo;
import o.InterfaceC7830dGy;
import o.dFY;
import o.dHG;
import o.dHV;
import okhttp3.Protocol;

/* renamed from: o.dGr  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7823dGr implements Cloneable, dFY.e, InterfaceC7830dGy.b {
    private final int A;
    private final SocketFactory B;
    private final ProxySelector C;
    private final dGY D;
    private final X509TrustManager E;
    private final int F;
    private final SSLSocketFactory G;
    private final dFR b;
    private final dFW e;
    private final dHV f;
    private final int g;
    private final int h;
    private final dFX i;
    private final C7808dGc j;
    private final InterfaceC7814dGi k;
    private final InterfaceC7812dGg l;
    private final AbstractC7820dGo.e m;
    private final C7815dGj n;

    /* renamed from: o  reason: collision with root package name */
    private final List<C7809dGd> f13807o;
    private final HostnameVerifier p;
    private final boolean q;
    private final boolean r;
    private final long s;
    private final List<InterfaceC7817dGl> t;
    private final dFR u;
    private final List<InterfaceC7817dGl> v;
    private final int w;
    private final List<Protocol> x;
    private final Proxy y;
    private final boolean z;
    public static final e c = new e(null);
    private static final List<Protocol> a = dGB.a(Protocol.HTTP_2, Protocol.HTTP_1_1);
    private static final List<C7809dGd> d = dGB.a(C7809dGd.a, C7809dGd.b);

    public final dFR A() {
        return this.u;
    }

    public final SocketFactory B() {
        return this.B;
    }

    public final int C() {
        return this.A;
    }

    public final ProxySelector D() {
        return this.C;
    }

    public final X509TrustManager H() {
        return this.E;
    }

    public final int I() {
        return this.F;
    }

    public final int b() {
        return this.h;
    }

    public final dFR c() {
        return this.b;
    }

    public final dFW e() {
        return this.e;
    }

    public final List<C7809dGd> f() {
        return this.f13807o;
    }

    public final C7808dGc g() {
        return this.j;
    }

    public final int h() {
        return this.g;
    }

    public final dFX i() {
        return this.i;
    }

    public final dHV j() {
        return this.f;
    }

    public final AbstractC7820dGo.e k() {
        return this.m;
    }

    public final InterfaceC7812dGg l() {
        return this.l;
    }

    public final InterfaceC7814dGi m() {
        return this.k;
    }

    public final boolean n() {
        return this.r;
    }

    public final C7815dGj o() {
        return this.n;
    }

    public final HostnameVerifier p() {
        return this.p;
    }

    public final long q() {
        return this.s;
    }

    public final boolean r() {
        return this.q;
    }

    public final dGY s() {
        return this.D;
    }

    public final List<InterfaceC7817dGl> t() {
        return this.t;
    }

    public final Proxy u() {
        return this.y;
    }

    public final int w() {
        return this.w;
    }

    public final List<InterfaceC7817dGl> x() {
        return this.v;
    }

    public final List<Protocol> y() {
        return this.x;
    }

    public final boolean z() {
        return this.z;
    }

    public C7823dGr(b bVar) {
        ProxySelector w;
        C8632dsu.d(bVar, "");
        this.n = bVar.o();
        this.j = bVar.i();
        this.t = dGB.e(bVar.q());
        this.v = dGB.e(bVar.s());
        this.m = bVar.m();
        this.z = bVar.C();
        this.b = bVar.d();
        this.r = bVar.l();
        this.q = bVar.n();
        this.l = bVar.f();
        this.e = bVar.e();
        this.k = bVar.k();
        this.y = bVar.y();
        if (bVar.y() != null) {
            w = dHW.e;
        } else {
            w = bVar.w();
            w = w == null ? ProxySelector.getDefault() : w;
            if (w == null) {
                w = dHW.e;
            }
        }
        this.C = w;
        this.u = bVar.v();
        this.B = bVar.B();
        List<C7809dGd> h = bVar.h();
        this.f13807o = h;
        this.x = bVar.u();
        this.p = bVar.p();
        this.h = bVar.c();
        this.g = bVar.g();
        this.A = bVar.x();
        this.F = bVar.A();
        this.w = bVar.r();
        this.s = bVar.t();
        dGY z = bVar.z();
        this.D = z == null ? new dGY() : z;
        if (!(h instanceof Collection) || !h.isEmpty()) {
            for (C7809dGd c7809dGd : h) {
                if (c7809dGd.e()) {
                    if (bVar.D() != null) {
                        this.G = bVar.D();
                        dHV a2 = bVar.a();
                        if (a2 == null) {
                            C8632dsu.e();
                        }
                        this.f = a2;
                        X509TrustManager F = bVar.F();
                        if (F == null) {
                            C8632dsu.e();
                        }
                        this.E = F;
                        dFX j = bVar.j();
                        if (a2 == null) {
                            C8632dsu.e();
                        }
                        this.i = j.b(a2);
                    } else {
                        dHG.e eVar = dHG.i;
                        X509TrustManager c2 = eVar.b().c();
                        this.E = c2;
                        dHG b2 = eVar.b();
                        if (c2 == null) {
                            C8632dsu.e();
                        }
                        this.G = b2.d(c2);
                        dHV.b bVar2 = dHV.d;
                        if (c2 == null) {
                            C8632dsu.e();
                        }
                        dHV a3 = bVar2.a(c2);
                        this.f = a3;
                        dFX j2 = bVar.j();
                        if (a3 == null) {
                            C8632dsu.e();
                        }
                        this.i = j2.b(a3);
                    }
                    F();
                }
            }
        }
        this.G = null;
        this.f = null;
        this.E = null;
        this.i = dFX.e;
        F();
    }

    public Object clone() {
        return super.clone();
    }

    public final SSLSocketFactory G() {
        SSLSocketFactory sSLSocketFactory = this.G;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public C7823dGr() {
        this(new b());
    }

    private final void F() {
        List<InterfaceC7817dGl> list = this.t;
        if (list == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!list.contains(null))) {
            throw new IllegalStateException(("Null interceptor: " + this.t).toString());
        }
        List<InterfaceC7817dGl> list2 = this.v;
        if (list2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!list2.contains(null))) {
            throw new IllegalStateException(("Null network interceptor: " + this.v).toString());
        }
        List<C7809dGd> list3 = this.f13807o;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            for (C7809dGd c7809dGd : list3) {
                if (c7809dGd.e()) {
                    if (this.G == null) {
                        throw new IllegalStateException("sslSocketFactory == null".toString());
                    }
                    if (this.f == null) {
                        throw new IllegalStateException("certificateChainCleaner == null".toString());
                    }
                    if (this.E == null) {
                        throw new IllegalStateException("x509TrustManager == null".toString());
                    }
                    return;
                }
            }
        }
        if (this.G != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.f != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.E != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!C8632dsu.c(this.i, dFX.e)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Override // o.dFY.e
    public dFY a(C7826dGu c7826dGu) {
        C8632dsu.d(c7826dGu, "");
        return new dGS(this, c7826dGu, false);
    }

    @Override // o.InterfaceC7830dGy.b
    public InterfaceC7830dGy b(C7826dGu c7826dGu, AbstractC7827dGv abstractC7827dGv) {
        C8632dsu.d(c7826dGu, "");
        C8632dsu.d(abstractC7827dGv, "");
        C7866dIg c7866dIg = new C7866dIg(dGL.e, c7826dGu, abstractC7827dGv, new Random(), this.w, null, this.s);
        c7866dIg.c(this);
        return c7866dIg;
    }

    public b v() {
        return new b(this);
    }

    /* renamed from: o.dGr$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private SocketFactory A;
        private dGY B;
        private int C;
        private X509TrustManager D;
        private int a;
        private dFR b;
        private dFW c;
        private dHV d;
        private dFX e;
        private C7815dGj f;
        private int g;
        private InterfaceC7812dGg h;
        private C7808dGc i;
        private List<C7809dGd> j;
        private HostnameVerifier k;
        private InterfaceC7814dGi l;
        private boolean m;
        private AbstractC7820dGo.e n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f13808o;
        private List<? extends Protocol> p;
        private int q;
        private long r;
        private final List<InterfaceC7817dGl> s;
        private final List<InterfaceC7817dGl> t;
        private Proxy u;
        private ProxySelector v;
        private int w;
        private dFR x;
        private boolean y;
        private SSLSocketFactory z;

        public final int A() {
            return this.C;
        }

        public final SocketFactory B() {
            return this.A;
        }

        public final boolean C() {
            return this.y;
        }

        public final SSLSocketFactory D() {
            return this.z;
        }

        public final X509TrustManager F() {
            return this.D;
        }

        public final dHV a() {
            return this.d;
        }

        public final int c() {
            return this.a;
        }

        public final b c(InterfaceC7812dGg interfaceC7812dGg) {
            C8632dsu.d(interfaceC7812dGg, "");
            this.h = interfaceC7812dGg;
            return this;
        }

        public final dFR d() {
            return this.b;
        }

        public final dFW e() {
            return this.c;
        }

        public final InterfaceC7812dGg f() {
            return this.h;
        }

        public final int g() {
            return this.g;
        }

        public final List<C7809dGd> h() {
            return this.j;
        }

        public final C7808dGc i() {
            return this.i;
        }

        public final dFX j() {
            return this.e;
        }

        public final InterfaceC7814dGi k() {
            return this.l;
        }

        public final boolean l() {
            return this.m;
        }

        public final AbstractC7820dGo.e m() {
            return this.n;
        }

        public final boolean n() {
            return this.f13808o;
        }

        public final C7815dGj o() {
            return this.f;
        }

        public final HostnameVerifier p() {
            return this.k;
        }

        public final List<InterfaceC7817dGl> q() {
            return this.s;
        }

        public final int r() {
            return this.q;
        }

        public final List<InterfaceC7817dGl> s() {
            return this.t;
        }

        public final long t() {
            return this.r;
        }

        public final List<Protocol> u() {
            return this.p;
        }

        public final dFR v() {
            return this.x;
        }

        public final ProxySelector w() {
            return this.v;
        }

        public final int x() {
            return this.w;
        }

        public final Proxy y() {
            return this.u;
        }

        public final dGY z() {
            return this.B;
        }

        public b() {
            this.f = new C7815dGj();
            this.i = new C7808dGc();
            this.s = new ArrayList();
            this.t = new ArrayList();
            this.n = dGB.b(AbstractC7820dGo.c);
            this.y = true;
            dFR dfr = dFR.c;
            this.b = dfr;
            this.m = true;
            this.f13808o = true;
            this.h = InterfaceC7812dGg.e;
            this.l = InterfaceC7814dGi.a;
            this.x = dfr;
            SocketFactory socketFactory = SocketFactory.getDefault();
            C8632dsu.b(socketFactory, "");
            this.A = socketFactory;
            e eVar = C7823dGr.c;
            this.j = eVar.e();
            this.p = eVar.c();
            this.k = dHY.c;
            this.e = dFX.e;
            this.g = 10000;
            this.w = 10000;
            this.C = 10000;
            this.r = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(C7823dGr c7823dGr) {
            this();
            C8632dsu.d(c7823dGr, "");
            this.f = c7823dGr.o();
            this.i = c7823dGr.g();
            C8571dqn.b(this.s, c7823dGr.t());
            C8571dqn.b(this.t, c7823dGr.x());
            this.n = c7823dGr.k();
            this.y = c7823dGr.z();
            this.b = c7823dGr.c();
            this.m = c7823dGr.n();
            this.f13808o = c7823dGr.r();
            this.h = c7823dGr.l();
            this.c = c7823dGr.e();
            this.l = c7823dGr.m();
            this.u = c7823dGr.u();
            this.v = c7823dGr.D();
            this.x = c7823dGr.A();
            this.A = c7823dGr.B();
            this.z = c7823dGr.G;
            this.D = c7823dGr.H();
            this.j = c7823dGr.f();
            this.p = c7823dGr.y();
            this.k = c7823dGr.p();
            this.e = c7823dGr.i();
            this.d = c7823dGr.j();
            this.a = c7823dGr.b();
            this.g = c7823dGr.h();
            this.w = c7823dGr.C();
            this.C = c7823dGr.I();
            this.q = c7823dGr.w();
            this.r = c7823dGr.q();
            this.B = c7823dGr.s();
        }

        public final b b(AbstractC7820dGo abstractC7820dGo) {
            C8632dsu.d(abstractC7820dGo, "");
            this.n = dGB.b(abstractC7820dGo);
            return this;
        }

        public final b b(InterfaceC7814dGi interfaceC7814dGi) {
            C8632dsu.d(interfaceC7814dGi, "");
            if (!C8632dsu.c(interfaceC7814dGi, this.l)) {
                this.B = null;
            }
            this.l = interfaceC7814dGi;
            return this;
        }

        public final b c(List<? extends Protocol> list) {
            List n;
            C8632dsu.d(list, "");
            n = C8576dqs.n(list);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!n.contains(protocol) && !n.contains(Protocol.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + n).toString());
            } else if (n.contains(protocol) && n.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + n).toString());
            } else if (!(!n.contains(Protocol.HTTP_1_0))) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + n).toString());
            } else if (!(!n.contains(null))) {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            } else {
                n.remove(Protocol.SPDY_3);
                if (true ^ C8632dsu.c(n, this.p)) {
                    this.B = null;
                }
                List<? extends Protocol> unmodifiableList = Collections.unmodifiableList(n);
                C8632dsu.b(unmodifiableList, "");
                this.p = unmodifiableList;
                return this;
            }
        }

        public final b e(long j, TimeUnit timeUnit) {
            C8632dsu.d(timeUnit, "");
            this.g = dGB.c(Audio.TYPE.timeout, j, timeUnit);
            return this;
        }

        public final b c(long j, TimeUnit timeUnit) {
            C8632dsu.d(timeUnit, "");
            this.w = dGB.c(Audio.TYPE.timeout, j, timeUnit);
            return this;
        }

        public final C7823dGr b() {
            return new C7823dGr(this);
        }
    }

    /* renamed from: o.dGr$e */
    /* loaded from: classes5.dex */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        public final List<Protocol> c() {
            return C7823dGr.a;
        }

        public final List<C7809dGd> e() {
            return C7823dGr.d;
        }
    }
}
