package o;

import android.view.ViewGroup;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import kotlin.Pair;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.aLX;

/* renamed from: o.bKl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3782bKl extends AbstractC1754aN {
    private String c;
    private int d = 4;
    private Pair<Integer, Integer> h;
    private boolean j;

    public final void a_(Pair<Integer, Integer> pair) {
        this.h = pair;
    }

    public final void b(boolean z) {
        this.j = z;
    }

    public final String i() {
        return this.c;
    }

    public final void j_(int i) {
        this.d = i;
    }

    public final Pair<Integer, Integer> k() {
        return this.h;
    }

    public final int l() {
        return this.d;
    }

    public final boolean m() {
        return this.j;
    }

    @Override // o.C3126at, o.AbstractC3336ax
    public /* bridge */ /* synthetic */ void a(C2077aZ c2077aZ, AbstractC3073as abstractC3073as) {
        a(c2077aZ, (AbstractC3073as<?>) abstractC3073as);
    }

    @Override // o.C3126at, o.AbstractC3336ax, o.AbstractC3073as
    public /* synthetic */ void c(Object obj, AbstractC3073as abstractC3073as) {
        a((C2077aZ) obj, (AbstractC3073as<?>) abstractC3073as);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.C3126at
    public void a(C2077aZ c2077aZ, AbstractC3073as<?> abstractC3073as) {
        C8632dsu.c((Object) c2077aZ, "");
        C8632dsu.c((Object) abstractC3073as, "");
        if (C8632dsu.c((Object) abstractC3073as.toString(), (Object) toString())) {
            return;
        }
        super.a2(c2077aZ, abstractC3073as);
    }

    @Override // o.C3126at, o.AbstractC3336ax
    /* renamed from: d */
    public void e(C2077aZ c2077aZ) {
        dpR dpr;
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) c2077aZ, "");
        if (!this.j) {
            Pair<Integer, Integer> pair = this.h;
            if (pair != null) {
                int intValue = pair.b().intValue();
                int intValue2 = pair.c().intValue();
                ViewGroup b = c2077aZ.b();
                ViewGroup.LayoutParams layoutParams = b.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = intValue;
                    layoutParams.height = intValue2;
                    b.setLayoutParams(layoutParams);
                    dpr = dpR.c;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else {
                dpr = null;
            }
            if (dpr == null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("When optInMeasuring is false you need to specify a size", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        c1596aHd.a(errorType.c() + " " + b2);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
            }
        }
        c2077aZ.b().setImportantForAccessibility(this.d);
        c2077aZ.b().setContentDescription(this.c);
        c2077aZ.b().setTag(aLX.a.e, this.j ? Boolean.TRUE : null);
        super.e(c2077aZ);
    }

    @Override // o.C3126at, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(C2077aZ c2077aZ) {
        C8632dsu.c((Object) c2077aZ, "");
        c2077aZ.b().setImportantForAccessibility(0);
        c2077aZ.b().setTag(aLX.a.e, null);
        super.e(c2077aZ);
    }
}
