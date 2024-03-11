package o;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import o.C5748cGx;
import o.C8632dsu;
import o.C9737vz;
import o.cBO;
import o.cIH;
import o.dpR;

/* renamed from: o.cGx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5748cGx extends AbstractC5765cHn implements cFR {
    private final ViewGroup a;
    private final InterfaceC8554dpx c;
    private final InterfaceC8554dpx e;

    @Override // o.AbstractC9944zY
    /* renamed from: i */
    public ViewGroup e() {
        return this.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5748cGx(ViewGroup viewGroup) {
        super(viewGroup);
        InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) viewGroup, "");
        this.a = viewGroup;
        b = dpB.b(new drO<Integer>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PlayerJetpackComposeContainerUIView$containerId$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final Integer invoke() {
                return Integer.valueOf(C5748cGx.this.e().getId());
            }
        });
        this.e = b;
        b2 = dpB.b(new drO<cIH>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PlayerJetpackComposeContainerUIView$playerControlsCompose$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final cIH invoke() {
                cIH.e eVar = cIH.e;
                Context context = C5748cGx.this.e().getContext();
                C8632dsu.a(context, "");
                return eVar.e((Activity) C9737vz.e(context, Activity.class));
            }
        });
        this.c = b2;
        j();
    }

    @Override // o.AbstractC5765cHn
    public int bI_() {
        return ((Number) this.e.getValue()).intValue();
    }

    private final cIH n() {
        return (cIH) this.c.getValue();
    }

    @Override // o.cFR
    public void j() {
        e().setEnabled(false);
        e().setVisibility(4);
    }

    @Override // o.cFR
    public void f() {
        e().setEnabled(true);
        e().setVisibility(0);
    }

    @Override // o.cFR
    public void g() {
        n().d(e(), new drM<cBO, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PlayerJetpackComposeContainerUIView$initialize$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBO cbo) {
                d(cbo);
                return dpR.c;
            }

            public final void d(cBO cbo) {
                C8632dsu.c((Object) cbo, "");
                C5748cGx.this.b((C5748cGx) cbo);
            }
        });
    }

    @Override // o.cFR
    public void d(cBA cba) {
        C8632dsu.c((Object) cba, "");
        n().b(cba);
    }
}
