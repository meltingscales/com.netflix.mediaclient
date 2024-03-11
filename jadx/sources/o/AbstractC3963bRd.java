package o;

import android.view.ViewGroup;
import o.C2077aZ;
import o.dpR;

/* renamed from: o.bRd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3963bRd extends AbstractC3765bJv {
    private C9686vA g;
    private Integer i;

    public final void a(Integer num) {
        this.i = num;
    }

    public final void d(C9686vA c9686vA) {
        this.g = c9686vA;
    }

    public final Integer r() {
        return this.i;
    }

    public final C9686vA s() {
        return this.g;
    }

    @Override // o.AbstractC3765bJv, o.AbstractC3795bKy, o.C3126at, o.AbstractC3336ax
    /* renamed from: d */
    public void e(final C2077aZ c2077aZ) {
        C8632dsu.c((Object) c2077aZ, "");
        Integer num = this.i;
        if (num != null) {
            int intValue = num.intValue();
            ViewGroup b = c2077aZ.b();
            ViewGroup.LayoutParams layoutParams = b.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = intValue;
                b.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C9686vA c9686vA = this.g;
        if (c9686vA != null) {
            C9702vQ.c(c2077aZ.b(), c9686vA);
            dpR dpr = dpR.c;
        } else {
            new drO<dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.row.IPBasedGameGroupModel$bind$3
                {
                    super(0);
                }

                public final void c() {
                    C2077aZ.this.b().setOutlineProvider(null);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    c();
                    return dpR.c;
                }
            };
        }
        super.e(c2077aZ);
    }
}
