package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.TrafficStats;
import android.os.Handler;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Zuul;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.ZuulAgent;
import com.netflix.mediaclient.util.ConnectivityUtils;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;
import o.C5110bsa;
import o.C7826dGu;
import o.cQQ;
import o.dpR;
import okio.ByteString;

/* renamed from: o.bsa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5110bsa extends AbstractC7827dGv implements InterfaceC5050brT {
    private final C1052Mw a;
    private final InterfaceC8286dhX e;
    private final e f;
    private final Handler g;
    private final Context h;
    private final Runnable i;
    private final InterfaceC5171bti j;
    private final C5047brQ k;
    private final NC l;
    private final PublishSubject<dpR> m;
    private final Runnable n;
    public static final b d = new b(null);
    private static int c = 1;
    private static final C8165dfI b = new C8165dfI(10, TimeUnit.MINUTES.toMillis(1));

    /* renamed from: o.bsa$a */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[ZuulAgent.ConnectionStatus.values().length];
            try {
                iArr[ZuulAgent.ConnectionStatus.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ZuulAgent.ConnectionStatus.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            d = iArr;
        }
    }

    public C5110bsa(Context context, Handler handler, NC nc, C1052Mw c1052Mw, InterfaceC5171bti interfaceC5171bti, PublishSubject<dpR> publishSubject) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) handler, "");
        C8632dsu.c((Object) nc, "");
        C8632dsu.c((Object) c1052Mw, "");
        C8632dsu.c((Object) interfaceC5171bti, "");
        C8632dsu.c((Object) publishSubject, "");
        this.h = context;
        this.g = handler;
        this.l = nc;
        this.a = c1052Mw;
        this.j = interfaceC5171bti;
        this.m = publishSubject;
        this.k = new C5047brQ();
        this.f = new e(0, 0, 0, 7, null);
        this.e = C5040brJ.b.c();
        this.i = new Runnable() { // from class: o.brY
            @Override // java.lang.Runnable
            public final void run() {
                C5110bsa.i(C5110bsa.this);
            }
        };
        C5052brV.b.e(context, new c());
        c1052Mw.b(new Runnable() { // from class: o.bsc
            @Override // java.lang.Runnable
            public final void run() {
                C5110bsa.h(C5110bsa.this);
            }
        });
        this.n = new Runnable() { // from class: o.brZ
            @Override // java.lang.Runnable
            public final void run() {
                C5110bsa.f(C5110bsa.this);
            }
        };
    }

    /* renamed from: o.bsa$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("nf_zuul_ws");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(C5110bsa c5110bsa) {
        C8632dsu.c((Object) c5110bsa, "");
        c5110bsa.l.c(new d());
        if (C5052brV.b.a(c5110bsa.a).v()) {
            d.getLogTag();
            c5110bsa.h();
        }
    }

    private final void o() {
        this.g.postDelayed(this.i, Config_FastProperty_Zuul.Companion.a());
    }

    private final void f() {
        this.g.removeCallbacks(this.i);
    }

    private final void l() {
        f();
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C5110bsa c5110bsa) {
        C8632dsu.c((Object) c5110bsa, "");
        c5110bsa.o();
        InterfaceC7830dGy b2 = c5110bsa.k.b();
        if (b2 != null) {
            b2.a("ECHO ping");
            d.getLogTag();
            dpR dpr = dpR.c;
        }
    }

    private final void k() {
        g();
        p();
    }

    static /* synthetic */ void a(C5110bsa c5110bsa, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c5110bsa.e(z);
    }

    private final void e(boolean z) {
        synchronized (this) {
            if (this.k.d().i()) {
                return;
            }
            if (!ConnectivityUtils.c() || C8153dex.J()) {
                b bVar = d;
                if (b.d()) {
                    return;
                }
                C5052brV c5052brV = C5052brV.b;
                UserAgent a2 = c5052brV.a(this.a);
                aOV e2 = c5052brV.e(this.a);
                C7823dGr b2 = new C7823dGr().v().c(new C5049brS(e2, a2)).b();
                String g = e2.j().g();
                c5052brV.a(a2);
                bVar.getLogTag();
                C7826dGu.b bVar2 = new C7826dGu.b();
                C8632dsu.d((Object) g);
                C7826dGu.b e3 = bVar2.a(g).e("Origin", "http://www.netflix.com");
                String m = e2.w().m();
                C8632dsu.a(m, "");
                C7826dGu a3 = e3.e("X-Netflix-ProxyEsn", m).a();
                this.k.a(z);
                C5048brR.c.b(a3);
                TrafficStats.setThreadStatsTag(0);
                this.k.b(b2.b(a3, this));
                return;
            }
            d.getLogTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C5110bsa c5110bsa) {
        C8632dsu.c((Object) c5110bsa, "");
        c5110bsa.k();
        c5110bsa.a("onProfileChange", true, true);
        d.getLogTag();
    }

    static /* synthetic */ void b(C5110bsa c5110bsa, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        c5110bsa.a(str, z, z2);
    }

    @Override // o.AbstractC7827dGv
    public void d(InterfaceC7830dGy interfaceC7830dGy, C7824dGs c7824dGs) {
        synchronized (this) {
            C8632dsu.c((Object) interfaceC7830dGy, "");
            C8632dsu.c((Object) c7824dGs, "");
            C5045brO c5045brO = C5045brO.c;
            if (!c5045brO.b(this.k, interfaceC7830dGy)) {
                if (c5045brO.c(this.k, interfaceC7830dGy)) {
                    d.getLogTag();
                }
            } else {
                d.getLogTag();
                this.k.a(interfaceC7830dGy);
            }
            if (C8632dsu.c(this.k.b(), interfaceC7830dGy)) {
                b bVar = d;
                bVar.getLogTag();
                this.k.j();
                this.e.b();
                bVar.getLogTag();
                b(interfaceC7830dGy);
            }
        }
    }

    private final void b(InterfaceC7830dGy interfaceC7830dGy) {
        String i = C5052brV.b.a(this.a).l().i();
        if (i == null) {
            a("Unable to send Netflix ID to lambda", false, false);
            return;
        }
        d.getLogTag();
        interfaceC7830dGy.a(i);
        this.j.b(this.k.d());
    }

    @Override // o.AbstractC7827dGv
    public void a(InterfaceC7830dGy interfaceC7830dGy, int i, String str) {
        synchronized (this) {
            C8632dsu.c((Object) interfaceC7830dGy, "");
            C8632dsu.c((Object) str, "");
            C5045brO c5045brO = C5045brO.c;
            if (c5045brO.e(this.k, interfaceC7830dGy)) {
                b bVar = d;
                bVar.getLogTag();
                if (c5045brO.c(this.k, interfaceC7830dGy)) {
                    int i2 = a.d[this.k.d().a().ordinal()];
                    if (i2 == 1) {
                        bVar.getLogTag();
                    } else if (i2 != 2) {
                        b(this, "Closed WebSocket by Server", false, false, 6, null);
                    } else {
                        bVar.getLogTag();
                    }
                }
            }
        }
    }

    @Override // o.AbstractC7827dGv
    public void c(InterfaceC7830dGy interfaceC7830dGy, int i, String str) {
        C8632dsu.c((Object) interfaceC7830dGy, "");
        C8632dsu.c((Object) str, "");
        C5045brO c5045brO = C5045brO.c;
        if (c5045brO.e(this.k, interfaceC7830dGy)) {
            if (c5045brO.c(this.k, interfaceC7830dGy)) {
                this.k.i();
                if (this.k.d().e()) {
                    d.getLogTag();
                    e(this.k.d().b());
                    return;
                }
                return;
            }
            d.getLogTag();
        }
    }

    @Override // o.AbstractC7827dGv
    public void b(InterfaceC7830dGy interfaceC7830dGy, Throwable th, C7824dGs c7824dGs) {
        C8632dsu.c((Object) interfaceC7830dGy, "");
        C8632dsu.c((Object) th, "");
        C5045brO c5045brO = C5045brO.c;
        if (c5045brO.e(this.k, interfaceC7830dGy)) {
            this.k.d().c(ZuulAgent.ConnectionStatus.a);
            C5048brR c5048brR = C5048brR.c;
            c5048brR.e(th, c7824dGs);
            if (c5045brO.b(this.k, interfaceC7830dGy)) {
                this.k.c();
            } else {
                b(this, "onFailure", false, false, 6, null);
            }
            if (ConnectivityUtils.n(this.h)) {
                ZuulAgent.e d2 = this.k.d();
                d2.d(d2.c() + 1);
                if (c7824dGs != null && c7824dGs.c() == 401) {
                    C5048brR.b(c5048brR, "401, not authorized. Cookies are expired, refresh them", false, 2, null);
                    m();
                    return;
                }
                d(this, false, 1, null);
                return;
            }
            d.getLogTag();
        }
    }

    @SuppressLint({"CheckResult"})
    private final void m() {
        Observable<cQQ.d> takeUntil = new cQQ().c(6000L).takeUntil(this.m);
        final drM<cQQ.d, dpR> drm = new drM<cQQ.d, dpR>() { // from class: com.netflix.mediaclient.service.zuul.ZuulBridgeWebSocketImpl$reconnectAfterCookieRefresh$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cQQ.d dVar) {
                c(dVar);
                return dpR.c;
            }

            public final void c(cQQ.d dVar) {
                C5110bsa.d(C5110bsa.this, false, 1, null);
            }
        };
        takeUntil.subscribe(new Consumer() { // from class: o.bsg
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5110bsa.a(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public static /* synthetic */ void d(C5110bsa c5110bsa, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c5110bsa.d(z);
    }

    private final void d(boolean z) {
        if (z || C5052brV.b.a(this.k.d())) {
            a(this, false, 1, null);
        } else {
            n();
        }
    }

    private final void n() {
        if (C5040brJ.b.a(this.h, this.e)) {
            final long d2 = this.e.d();
            if (d2 > 0) {
                this.g.postDelayed(new Runnable() { // from class: o.bsb
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5110bsa.b(C5110bsa.this, d2);
                    }
                }, d2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C5110bsa c5110bsa, long j) {
        C8632dsu.c((Object) c5110bsa, "");
        if (c5110bsa.k.d().i()) {
            return;
        }
        a(c5110bsa, false, 1, null);
    }

    @Override // o.AbstractC7827dGv
    public void d(InterfaceC7830dGy interfaceC7830dGy, String str) {
        boolean z;
        CharSequence n;
        C8632dsu.c((Object) interfaceC7830dGy, "");
        C8632dsu.c((Object) str, "");
        if (C8632dsu.c(this.k.b(), interfaceC7830dGy)) {
            d.getLogTag();
            z = true;
        } else {
            z = false;
        }
        l();
        n = duD.n((CharSequence) str);
        String obj = n.toString();
        if (C8632dsu.c((Object) obj, (Object) "_CLOSE_")) {
            a(z);
        } else if (C8632dsu.c((Object) obj, (Object) "ECHO ping")) {
            j();
        } else {
            this.j.e(str);
        }
    }

    private final void a(boolean z) {
        if (z) {
            e eVar = this.f;
            eVar.b(eVar.d() + 1);
            this.k.d().d(0);
            this.j.b();
            b(this, "Closing on server request", false, false, 6, null);
        }
    }

    @Override // o.AbstractC7827dGv
    public void a(InterfaceC7830dGy interfaceC7830dGy, ByteString byteString) {
        C8632dsu.c((Object) interfaceC7830dGy, "");
        C8632dsu.c((Object) byteString, "");
        C8632dsu.c(this.k.b(), interfaceC7830dGy);
    }

    public final void d() {
        this.k.d().g();
        if (C5052brV.b.a(this.a).v()) {
            if (this.k.d().i()) {
                d.getLogTag();
                return;
            }
            d.getLogTag();
            h();
            return;
        }
        d.getLogTag();
    }

    public final void e() {
        if (this.j.a()) {
            return;
        }
        d.getLogTag();
        b(this, "onBackground", false, false, 4, null);
    }

    @Override // o.InterfaceC5050brT
    public ZuulAgent.ConnectionStatus c() {
        return this.k.d().a();
    }

    @Override // o.InterfaceC5050brT
    public int a() {
        int i;
        synchronized (this) {
            i = c;
            c = i + 1;
        }
        return i;
    }

    @Override // o.InterfaceC5050brT
    public boolean a(String str) {
        boolean a2;
        synchronized (this) {
            C8632dsu.c((Object) str, "");
            InterfaceC7830dGy b2 = this.k.b();
            a2 = b2 != null ? b2.a(str) : false;
            d.getLogTag();
        }
        return a2;
    }

    /* renamed from: o.bsa$e */
    /* loaded from: classes4.dex */
    public static final class e {
        private int b;
        private int d;
        private int e;

        public e() {
            this(0, 0, 0, 7, null);
        }

        public final void b(int i) {
            this.b = i;
        }

        public final int d() {
            return this.b;
        }

        public final int e() {
            return this.e;
        }

        public final void e(int i) {
            this.e = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return this.b == eVar.b && this.e == eVar.e && this.d == eVar.d;
            }
            return false;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.b) * 31) + Integer.hashCode(this.e)) * 31) + Integer.hashCode(this.d);
        }

        public String toString() {
            int i = this.b;
            int i2 = this.e;
            int i3 = this.d;
            return "MessageCounter(close=" + i + ", ping=" + i2 + ", other=" + i3 + ")";
        }

        public e(int i, int i2, int i3) {
            this.b = i;
            this.e = i2;
            this.d = i3;
        }

        public /* synthetic */ e(int i, int i2, int i3, int i4, C8627dsp c8627dsp) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
        }
    }

    /* renamed from: o.bsa$c */
    /* loaded from: classes4.dex */
    public final class c extends ConnectivityManager.NetworkCallback {
        public c() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            C8632dsu.c((Object) network, "");
            C5110bsa.this.a("onAvailable", false, false);
            C5110bsa.this.k.d().g();
            b bVar = C5110bsa.d;
            if (C5052brV.b.a(C5110bsa.this.a).v()) {
                bVar.getLogTag();
                C5110bsa.this.h();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            C8632dsu.c((Object) network, "");
            b bVar = C5110bsa.d;
            C5110bsa.b(C5110bsa.this, "Network lost", false, false, 4, null);
        }
    }

    /* renamed from: o.bsa$d */
    /* loaded from: classes4.dex */
    public final class d extends C1076Nu {
        public d() {
        }

        @Override // o.C1076Nu, o.InterfaceC1072Nq
        public void c(NC nc, Intent intent) {
            C8632dsu.c((Object) nc, "");
            C5110bsa.this.d();
        }

        @Override // o.C1076Nu, o.InterfaceC1072Nq
        public void a(NC nc, boolean z) {
            C8632dsu.c((Object) nc, "");
            C5110bsa.this.e();
        }
    }

    private final void g() {
        d.getLogTag();
        this.g.removeCallbacks(this.n);
    }

    private final void p() {
        d.getLogTag();
        this.g.postDelayed(this.n, Config_FastProperty_Zuul.Companion.e());
    }

    public final void h() {
        d.getLogTag();
        k();
        a(this, false, 1, null);
    }

    public final void i() {
        d.getLogTag();
        a("User logout", false, false);
    }

    public final void b() {
        d.getLogTag();
        this.g.post(new Runnable() { // from class: o.bsf
            @Override // java.lang.Runnable
            public final void run() {
                C5110bsa.g(C5110bsa.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, boolean z, boolean z2) {
        synchronized (this) {
            b bVar = d;
            bVar.getLogTag();
            this.k.b(z, z2);
            if (C5052brV.b.a(z)) {
                bVar.getLogTag();
                e(false);
            } else {
                bVar.getLogTag();
                this.k.a();
            }
        }
    }

    private final void j() {
        d.getLogTag();
        e eVar = this.f;
        eVar.e(eVar.e() + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C5110bsa c5110bsa) {
        C8632dsu.c((Object) c5110bsa, "");
        d.getLogTag();
        c5110bsa.a("Ping", true, false);
        c5110bsa.p();
    }
}
