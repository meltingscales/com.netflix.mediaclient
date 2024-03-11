package o;

import android.os.SystemClock;
import com.netflix.mediaclient.servicemgr.ZuulAgent;

/* renamed from: o.brQ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5047brQ {
    private static final b b = new b(null);
    private String a;
    private InterfaceC7830dGy c;
    private InterfaceC7830dGy d;
    private final ZuulAgent.e e = new ZuulAgent.e(null, 1, null);

    public final InterfaceC7830dGy b() {
        return this.d;
    }

    public final ZuulAgent.e d() {
        return this.e;
    }

    public final InterfaceC7830dGy e() {
        return this.c;
    }

    /* renamed from: o.brQ$b */
    /* loaded from: classes4.dex */
    static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("nf_zuul_ws_holder");
        }
    }

    public final void c() {
        synchronized (this) {
            InterfaceC7830dGy interfaceC7830dGy = this.c;
            if (interfaceC7830dGy != null) {
                interfaceC7830dGy.a(1000, null);
            }
            a();
        }
    }

    public final void a() {
        synchronized (this) {
            InterfaceC7830dGy interfaceC7830dGy = this.d;
            this.d = null;
            if (interfaceC7830dGy != null) {
                interfaceC7830dGy.a(1000, this.a);
            }
            this.a = null;
        }
    }

    public final boolean a(InterfaceC7830dGy interfaceC7830dGy) {
        boolean z;
        synchronized (this) {
            C8632dsu.c((Object) interfaceC7830dGy, "");
            if (C8632dsu.c(this.c, interfaceC7830dGy)) {
                b.getLogTag();
                InterfaceC7830dGy interfaceC7830dGy2 = this.d;
                this.d = this.c;
                this.c = null;
                if (interfaceC7830dGy2 != null) {
                    interfaceC7830dGy2.a(1000, this.a);
                }
                this.a = null;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void a(boolean z) {
        ZuulAgent.e eVar = this.e;
        eVar.c(ZuulAgent.ConnectionStatus.e);
        eVar.a(z);
    }

    public final void j() {
        ZuulAgent.e eVar = this.e;
        eVar.c(ZuulAgent.ConnectionStatus.b);
        eVar.b(SystemClock.elapsedRealtime());
        eVar.a(false);
    }

    public final void i() {
        ZuulAgent.e eVar = this.e;
        eVar.c(ZuulAgent.ConnectionStatus.d);
        eVar.a(eVar.d() + 1);
    }

    public final void b(boolean z, boolean z2) {
        ZuulAgent.e eVar = this.e;
        eVar.c(ZuulAgent.ConnectionStatus.c);
        eVar.b(0L);
        eVar.a(z);
        eVar.d(z2);
    }

    public final void b(InterfaceC7830dGy interfaceC7830dGy) {
        C8632dsu.c((Object) interfaceC7830dGy, "");
        if (this.d == null) {
            b.getLogTag();
            this.d = interfaceC7830dGy;
            return;
        }
        b.getLogTag();
        this.c = interfaceC7830dGy;
    }
}
