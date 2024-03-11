package o;

import android.content.Context;
import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Cdx;
import java.util.List;
import o.AbstractC1804aOw;

/* renamed from: o.aOr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1799aOr {
    private static final a e = new a(null);
    private final C1800aOs a;
    private C1805aOx b;
    private final CdxAgentImpl c;
    private final C1802aOu d;
    private aOC i;

    public final C1805aOx a() {
        return this.b;
    }

    public final aOC b() {
        return this.i;
    }

    public final C1802aOu c() {
        return this.d;
    }

    public final C1800aOs d() {
        return this.a;
    }

    public final void d(aOC aoc) {
        this.i = aoc;
    }

    public C1799aOr(CdxAgentImpl cdxAgentImpl) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        this.c = cdxAgentImpl;
        this.d = new C1802aOu(cdxAgentImpl);
        this.a = new C1800aOs();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aOr$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("nf_cdx_pairing_manager");
        }
    }

    public final boolean e() {
        C1805aOx c1805aOx = this.b;
        if (c1805aOx != null) {
            return c1805aOx.a();
        }
        return false;
    }

    public final void b(C1805aOx c1805aOx) {
        String j;
        this.b = c1805aOx;
        if (c1805aOx == null || !c1805aOx.a() || (j = this.c.j()) == null) {
            return;
        }
        C1800aOs c1800aOs = this.a;
        Context context = this.c.getContext();
        C8632dsu.a(context, "");
        c1800aOs.d(context, j, this.c.m(), c1805aOx.e());
        dpR dpr = dpR.c;
    }

    public final void e(String str) {
        C8632dsu.c((Object) str, "");
        C1805aOx c1805aOx = this.b;
        if (c1805aOx == null || !c1805aOx.a()) {
            return;
        }
        e.getLogTag();
        String j = this.c.j();
        if (j != null) {
            C1800aOs c1800aOs = this.a;
            Context context = this.c.getContext();
            C8632dsu.a(context, "");
            c1800aOs.d(context, j, this.c.m(), c1805aOx.e());
            dpR dpr = dpR.c;
        }
    }

    public final void c(List<C1255Uq> list) {
        C8632dsu.c((Object) list, "");
        Config_FastProperty_Cdx.a aVar = Config_FastProperty_Cdx.Companion;
        if ((aVar.a() && aVar.c()) || this.c.o()) {
            return;
        }
        C1255Uq m = this.c.m();
        C1777aNw k = this.c.k();
        String c = k != null ? k.c() : null;
        if (m != null) {
            e.getLogTag();
            C1800aOs c1800aOs = this.a;
            Context context = this.c.getContext();
            C8632dsu.a(context, "");
            AbstractC1804aOw a2 = c1800aOs.a(context, c, this.c.j(), m, list);
            if (a2 instanceof AbstractC1804aOw.a) {
                a(((AbstractC1804aOw.a) a2).c());
            } else if (a2 instanceof AbstractC1804aOw.d) {
                a(((AbstractC1804aOw.d) a2).e());
            }
            dpR dpr = dpR.c;
        }
    }

    private final void a(List<C1255Uq> list) {
        a aVar = e;
        aVar.getLogTag();
        if (Config_FastProperty_Cdx.Companion.c() || e()) {
            return;
        }
        aVar.getLogTag();
        for (C1255Uq c1255Uq : list) {
            e.getLogTag();
        }
        this.c.i().c(new aOB(list));
    }

    private final void a(C1255Uq c1255Uq) {
        a aVar = e;
        aVar.getLogTag();
        if (e() || Config_FastProperty_Cdx.Companion.a()) {
            return;
        }
        aVar.getLogTag();
        this.c.i().a(new C1797aOp(c1255Uq));
    }
}
