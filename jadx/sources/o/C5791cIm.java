package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.netflix.mediaclient.ui.player.v2.interactive.MomentState;
import com.netflix.model.leafs.originals.interactive.BaseLayout;
import com.netflix.model.leafs.originals.interactive.ImpressionData;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.TransitionType;
import o.InterfaceC9638uF;
import o.cHW;
import o.cIE;

/* renamed from: o.cIm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5791cIm extends AbstractC5780cIb implements cHQ {
    public static final b d = new b(null);
    private final FrameLayout a;

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
    }

    @Override // o.AbstractC9944zY
    public /* bridge */ /* synthetic */ View e() {
        return this.a;
    }

    public final FrameLayout m() {
        return this.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5791cIm(ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        View e = C9703vR.e(viewGroup, cIE.c.j, 0, 2, null);
        C8632dsu.d(e);
        this.a = (FrameLayout) e;
    }

    /* renamed from: o.cIm$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("PlayerInteractiveMomentUIView");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final cBZ a(Moment moment, ViewGroup viewGroup) {
        cBZ cbz;
        String subType = moment.subType();
        switch (subType.hashCode()) {
            case -2031382801:
                if (subType.equals("cs_bs_phone")) {
                    View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.C, viewGroup, false);
                    C8632dsu.d(inflate);
                    cbz = (cHY) inflate;
                    break;
                }
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.G, viewGroup, false);
                C8632dsu.d(inflate2);
                cbz = (C5625cCi) inflate2;
                break;
            case -1438895286:
                if (subType.equals("headspaceInterrupter")) {
                    View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.E, viewGroup, false);
                    C8632dsu.d(inflate3);
                    cbz = (cHV) inflate3;
                    break;
                }
                View inflate22 = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.G, viewGroup, false);
                C8632dsu.d(inflate22);
                cbz = (C5625cCi) inflate22;
                break;
            case -660329155:
                if (subType.equals("cs_triviaverse_multi")) {
                    View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.K, viewGroup, false);
                    C8632dsu.d(inflate4);
                    cbz = (C5635cCs) inflate4;
                    break;
                }
                View inflate222 = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.G, viewGroup, false);
                C8632dsu.d(inflate222);
                cbz = (C5625cCi) inflate222;
                break;
            case 94948992:
                if (subType.equals("cs_bs")) {
                    View inflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.D, viewGroup, false);
                    C8632dsu.d(inflate5);
                    cbz = (C5622cCf) inflate5;
                    break;
                }
                View inflate2222 = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.G, viewGroup, false);
                C8632dsu.d(inflate2222);
                cbz = (C5625cCi) inflate2222;
                break;
            case 1543978988:
                if (subType.equals("cs_trivia_multi")) {
                    View inflate6 = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.H, viewGroup, false);
                    C8632dsu.d(inflate6);
                    cbz = (C5636cCt) inflate6;
                    break;
                }
                View inflate22222 = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.G, viewGroup, false);
                C8632dsu.d(inflate22222);
                cbz = (C5625cCi) inflate22222;
                break;
            case 1547666325:
                if (subType.equals("cs_trivia_quest")) {
                    View inflate7 = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.f13667J, viewGroup, false);
                    C8632dsu.d(inflate7);
                    cbz = (C5634cCr) inflate7;
                    break;
                }
                View inflate222222 = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.G, viewGroup, false);
                C8632dsu.d(inflate222222);
                cbz = (C5625cCi) inflate222222;
                break;
            default:
                View inflate2222222 = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.G, viewGroup, false);
                C8632dsu.d(inflate2222222);
                cbz = (C5625cCi) inflate2222222;
                break;
        }
        cbz.setDebug(k());
        return cbz;
    }

    @Override // o.AbstractC5765cHn, o.InterfaceC5730cGf
    public boolean w() {
        return this.a.getVisibility() == 0;
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        if (w()) {
            return;
        }
        this.a.setVisibility(0);
    }

    @Override // o.cHR
    public void g() {
        this.a.setVisibility(8);
    }

    public void c(aJY ajy, Moment moment, BaseLayout baseLayout, InteractiveMoments interactiveMoments, int i) {
        C8632dsu.c((Object) ajy, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) baseLayout, "");
        C8632dsu.c((Object) interactiveMoments, "");
        cBZ a = a(moment, this.a);
        b(a);
        this.a.removeAllViews();
        this.a.addView(a);
        this.a.setVisibility(0);
        InterfaceC9638uF.e eVar = InterfaceC9638uF.a;
        Context context = this.a.getContext();
        C8632dsu.a(context, "");
        InterfaceC9638uF d2 = eVar.d(context);
        cBZ l = l();
        if (l instanceof cBX) {
            C8632dsu.d(a);
            ((cBX) a).d(ajy, d2, this, moment, baseLayout, i);
        } else if ((l instanceof C5636cCt) || (l instanceof C5634cCr) || (l instanceof C5635cCs) || (l instanceof C5625cCi)) {
            C8632dsu.d(a);
            ((cBY) a).d(ajy, d2, this, moment, baseLayout, interactiveMoments, i);
        } else if (l instanceof cHV) {
            C8632dsu.d(a);
            ((cHV) a).b(ajy, this, moment);
        } else {
            throw new IllegalStateException("invalid scene for moment.");
        }
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
        final cBZ l = l();
        if (l != null) {
            l.e();
            b((cBZ) null);
            this.a.post(new Runnable() { // from class: o.cIk
                @Override // java.lang.Runnable
                public final void run() {
                    C5791cIm.d(cBZ.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(cBZ cbz) {
        C8632dsu.c((Object) cbz, "");
        cbz.removeAllViews();
    }

    @Override // o.AbstractC5780cIb, o.cHR
    public void a(boolean z, Moment moment, String str, String str2, ImpressionData impressionData, TransitionType transitionType, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) transitionType, "");
        cBZ l = l();
        super.a(z, moment, str, str2, impressionData, transitionType, str3 == null ? l instanceof cBX ? ((cBX) l).a() : null : str3);
    }

    @Override // o.cHR
    public void f() {
        cBZ l = l();
        if (l != null) {
            l.l();
        }
    }

    @Override // o.cHR
    public void j() {
        cBZ l = l();
        if (l != null) {
            l.s();
        }
    }
}
