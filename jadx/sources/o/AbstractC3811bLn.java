package o;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.netflix.mediaclient.ui.epoxymodels.api.HorizontalGravity;
import o.AbstractC3813bLp;
import o.C3796bKz;

/* renamed from: o.bLn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3811bLn extends AbstractC3813bLp {
    private HorizontalGravity b = HorizontalGravity.a;

    @Override // o.AbstractC3813bLp, o.AbstractC3073as
    public int a() {
        return C3796bKz.g.A;
    }

    public final HorizontalGravity i() {
        return this.b;
    }

    @Override // o.AbstractC3813bLp, o.AbstractC3336ax
    public void e(AbstractC3813bLp.c cVar) {
        C8632dsu.c((Object) cVar, "");
        super.e(cVar);
        ViewGroup.LayoutParams layoutParams = cVar.b().getLayoutParams();
        C8632dsu.d(layoutParams);
        ((FrameLayout.LayoutParams) layoutParams).gravity = this.b.c();
    }
}
