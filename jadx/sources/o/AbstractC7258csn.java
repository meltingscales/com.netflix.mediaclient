package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.Map;
import kotlin.Pair;
import o.AbstractC3179au;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;

/* renamed from: o.csn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7258csn<T extends AbstractC3179au> extends AbstractC7331cuG<T> {
    private String b;
    private long c;
    private CharSequence d;

    public final void c(long j) {
        this.c = j;
    }

    public final void e(CharSequence charSequence) {
        this.d = charSequence;
    }

    public final void e(String str) {
        this.b = str;
    }

    public final String i() {
        return this.b;
    }

    public final long m() {
        return this.c;
    }

    public final CharSequence n() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public /* synthetic */ void c(Object obj) {
        e((AbstractC7258csn<T>) ((AbstractC3179au) obj));
    }

    @Override // o.AbstractC3336ax
    public void e(T t) {
        Map i;
        Throwable th;
        C8632dsu.c((Object) t, "");
        if (this.d == null) {
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            Pair[] pairArr = new Pair[9];
            pairArr[0] = dpD.a("model", String.valueOf(getClass()));
            pairArr[1] = dpD.a("holder", String.valueOf(t.getClass()));
            pairArr[2] = dpD.a("boxShotUrl", String.valueOf(this.b));
            pairArr[3] = dpD.a("currentSize", String.valueOf(this.c));
            pairArr[4] = dpD.a("selectable", String.valueOf(K()));
            pairArr[5] = dpD.a(VisualStateDefinition.ELEMENT_STATE.SELECTED, String.valueOf(N()));
            boolean z = this instanceof AbstractC7260csp;
            AbstractC7260csp abstractC7260csp = z ? (AbstractC7260csp) this : null;
            pairArr[6] = dpD.a("playableId", String.valueOf(abstractC7260csp != null ? abstractC7260csp.w() : null));
            AbstractC7260csp abstractC7260csp2 = z ? (AbstractC7260csp) this : null;
            pairArr[7] = dpD.a("videoType", String.valueOf(abstractC7260csp2 != null ? abstractC7260csp2.C() : null));
            AbstractC7259cso abstractC7259cso = this instanceof AbstractC7259cso ? (AbstractC7259cso) this : null;
            pairArr[8] = dpD.a("showId", String.valueOf(abstractC7259cso != null ? abstractC7259cso.t() : null));
            i = dqE.i(pairArr);
            C1596aHd c1596aHd = new C1596aHd("SPY-31884 - Title is null", null, null, false, i, false, false, 110, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b);
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
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1597aHe c2 = dVar2.c();
            if (c2 != null) {
                c2.d(c1596aHd, th);
            } else {
                dVar2.e().b(c1596aHd, th);
            }
        }
        super.e((AbstractC7258csn<T>) t);
    }
}
