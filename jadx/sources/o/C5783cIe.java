package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.netflix.mediaclient.ui.player.v2.interactive.MomentState;
import com.netflix.model.leafs.originals.interactive.BaseLayout;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import o.InterfaceC9638uF;
import o.cBQ;
import o.cHW;
import o.cIE;

/* renamed from: o.cIe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5783cIe extends AbstractC5780cIb implements cHS {
    public static final e c = new e(null);
    private final FrameLayout a;

    @Override // o.AbstractC9944zY
    public /* bridge */ /* synthetic */ View e() {
        return this.a;
    }

    @Override // o.cHR
    public void j() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5783cIe(ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        View e2 = C9703vR.e(viewGroup, cIE.c.i, 0, 2, null);
        C8632dsu.d(e2);
        this.a = (FrameLayout) e2;
    }

    /* renamed from: o.cIe$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("PlayerInteractiveMomentUIView");
        }
    }

    @Override // o.AbstractC5765cHn, o.InterfaceC5730cGf
    public boolean w() {
        cBZ l = l();
        return l != null && l.getVisibility() == 0;
    }

    @Override // o.cHR
    public void g() {
        cBZ l = l();
        if (l == null) {
            return;
        }
        l.setVisibility(8);
    }

    public void r() {
        b((C5783cIe) cBQ.l.d);
    }

    public void e(aJY ajy, Moment moment, BaseLayout baseLayout, InteractiveMoments interactiveMoments, int i) {
        C8632dsu.c((Object) ajy, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) baseLayout, "");
        C8632dsu.c((Object) interactiveMoments, "");
        InterfaceC9638uF.e eVar = InterfaceC9638uF.a;
        Context context = this.a.getContext();
        C8632dsu.a(context, "");
        InterfaceC9638uF d = eVar.d(context);
        View inflate = LayoutInflater.from(o().getContext()).inflate(cIE.c.F, (ViewGroup) this.a, false);
        C8632dsu.d(inflate);
        C5631cCo c5631cCo = (C5631cCo) inflate;
        b((cBZ) c5631cCo);
        this.a.removeAllViews();
        this.a.addView(c5631cCo);
        this.a.setVisibility(0);
        c5631cCo.setVisibility(0);
        cBY.d(c5631cCo, ajy, d, this, moment, baseLayout, interactiveMoments, 0, 64, null);
    }

    @Override // o.AbstractC5780cIb, o.cHR
    public void a(MomentState momentState, Moment moment, long j) {
        cBZ l;
        C8632dsu.c((Object) momentState, "");
        C8632dsu.c((Object) moment, "");
        super.a(momentState, moment, j);
        cHW.e.b(this, 0, 0, 0, (momentState == MomentState.b || (l = l()) == null) ? 0 : l.v(), 7, null);
    }

    @Override // o.AbstractC5780cIb, o.cHR
    public void i() {
        super.i();
        cBZ l = l();
        if (l != null) {
            l.e();
        }
        b((cBZ) null);
        this.a.post(new Runnable() { // from class: o.cIi
            @Override // java.lang.Runnable
            public final void run() {
                C5783cIe.e(C5783cIe.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C5783cIe c5783cIe) {
        C8632dsu.c((Object) c5783cIe, "");
        c5783cIe.a.removeAllViews();
    }

    @Override // o.cHR
    public void f() {
        cBZ l = l();
        C5631cCo c5631cCo = l instanceof C5631cCo ? (C5631cCo) l : null;
        if (c5631cCo != null) {
            C5631cCo.c(c5631cCo, 0L, 1, null);
        }
    }

    public void m() {
        cBZ l = l();
        C5631cCo c5631cCo = l instanceof C5631cCo ? (C5631cCo) l : null;
        if (c5631cCo == null || !c5631cCo.k()) {
            return;
        }
        g();
    }
}
