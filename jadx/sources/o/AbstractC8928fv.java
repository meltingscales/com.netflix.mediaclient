package o;

import kotlin.NoWhenBranchMatchedException;
import o.C8632dsu;
import o.dtE;

/* renamed from: o.fv  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8928fv {
    public /* synthetic */ AbstractC8928fv(C8627dsp c8627dsp) {
        this();
    }

    public abstract String b();

    private AbstractC8928fv() {
    }

    public final AbstractC8928fv b(dtE<?, ?>... dteArr) {
        String d;
        C8632dsu.c((Object) dteArr, "");
        if (this instanceof C8973gn) {
            return C8973gn.b;
        }
        if (this instanceof C8977gr) {
            d = C8563dqf.d(dteArr, ",", b() + '_', null, 0, null, new drM<dtE<?, ?>, CharSequence>() { // from class: com.airbnb.mvrx.DeliveryMode$appendPropertiesToId$1
                @Override // o.drM
                /* renamed from: d */
                public final CharSequence invoke(dtE<?, ?> dte) {
                    C8632dsu.c((Object) dte, "");
                    return dte.getName();
                }
            }, 28, null);
            return new C8977gr(d);
        }
        throw new NoWhenBranchMatchedException();
    }
}
