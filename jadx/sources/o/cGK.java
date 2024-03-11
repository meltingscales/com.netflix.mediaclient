package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.ui.player.v2.SkipCreditsType;
import o.cBO;
import o.cGK;
import o.cIE;

/* loaded from: classes4.dex */
public final class cGK extends AbstractC5765cHn implements InterfaceC5725cGa {
    private final InterfaceC8554dpx b;
    private final View d;
    private final RS e;

    @Override // o.InterfaceC5725cGa
    public void a(int i) {
    }

    @Override // o.InterfaceC5725cGa
    public void a(SkipCreditsType skipCreditsType) {
        C8632dsu.c((Object) skipCreditsType, "");
    }

    @Override // o.InterfaceC5725cGa
    public void b(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
    }

    @Override // o.AbstractC9944zY
    /* renamed from: f */
    public RS e() {
        return this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cGK(ViewGroup viewGroup) {
        super(viewGroup);
        InterfaceC8554dpx b;
        C8632dsu.c((Object) viewGroup, "");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.x, viewGroup, true);
        C8632dsu.a(inflate, "");
        this.d = inflate;
        View findViewById = inflate.findViewById(cIE.b.bI);
        C8632dsu.a(findViewById, "");
        this.e = (RS) findViewById;
        b = dpB.b(new drO<Integer>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PlayerPrePlaySkipRecapUIView$containerId$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final Integer invoke() {
                return Integer.valueOf(cGK.this.e().getId());
            }
        });
        this.b = b;
        e().setOnClickListener(new View.OnClickListener() { // from class: o.cGI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cGK.a(cGK.this, view);
            }
        });
    }

    @Override // o.AbstractC5765cHn
    public int bI_() {
        return ((Number) this.b.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(cGK cgk, View view) {
        C8632dsu.c((Object) cgk, "");
        cgk.b((cGK) cBO.L.b);
        cgk.e().e(true);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        b((cGK) cBO.M.c);
        e().c(true);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        e().e(true);
    }

    @Override // o.InterfaceC5725cGa
    public void b(int i) {
        e().setText(i);
    }

    @Override // o.InterfaceC5725cGa
    public void b(boolean z) {
        e().e(z);
    }

    @Override // o.InterfaceC5725cGa
    public void e(boolean z) {
        e().c(z);
    }

    @Override // o.InterfaceC5725cGa
    public void j() {
        e().setVisibility(8);
    }
}
