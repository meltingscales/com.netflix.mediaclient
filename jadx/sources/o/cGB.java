package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import o.cBO;
import o.cBQ;
import o.cGB;
import o.cIE;
import o.dpR;

/* loaded from: classes4.dex */
public final class cGB extends AbstractC5765cHn {
    private final C1203Sq a;
    private boolean b;
    private final View c;
    private boolean d;
    private final ImageButton e;

    @Override // o.AbstractC9944zY
    public View e() {
        return this.c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cGB(ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.N, viewGroup, false);
        C8632dsu.d(inflate);
        this.c = inflate;
        View findViewById = e().findViewById(cIE.b.aA);
        C8632dsu.a(findViewById, "");
        ImageButton imageButton = (ImageButton) findViewById;
        this.e = imageButton;
        View findViewById2 = e().findViewById(cIE.b.cl);
        C8632dsu.a(findViewById2, "");
        C1203Sq c1203Sq = (C1203Sq) findViewById2;
        this.a = c1203Sq;
        viewGroup.addView(e());
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: o.cGF
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cGB.b(cGB.this, view);
            }
        });
        c1203Sq.setOnClickListener(new View.OnClickListener() { // from class: o.cGG
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cGB.a(cGB.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(cGB cgb, View view) {
        C8632dsu.c((Object) cgb, "");
        cgb.a.setVisibility(0);
        cgb.e.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(cGB cgb, View view) {
        C8632dsu.c((Object) cgb, "");
        cgb.d = true;
        cgb.c();
    }

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void d() {
        e().setEnabled(true);
        B().c(e(), true);
    }

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void b() {
        e().setEnabled(false);
        B().c(e(), false);
    }

    @Override // o.AbstractC5765cHn, o.InterfaceC5730cGf
    public boolean w() {
        return e().getVisibility() == 0;
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        this.b = true;
        this.a.setVisibility(8);
        this.e.setVisibility(0);
        this.d = false;
        AbstractC5765cHn.a(this, true, true, 0.0f, false, null, 28, null);
        b((cGB) new cBQ.s(true, e().getHeight()));
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        if (this.b) {
            this.b = false;
            if (this.d) {
                this.a.setVisibility(0);
                this.e.setVisibility(8);
            } else {
                this.a.setVisibility(8);
                this.e.setVisibility(0);
            }
            AbstractC5765cHn.a(this, false, true, 0.0f, false, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PlayerLockUIView$hide$1
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    b();
                    return dpR.c;
                }

                public final void b() {
                    boolean z;
                    z = cGB.this.d;
                    if (z) {
                        cGB.this.b((cGB) new cBO.C5572h(false));
                    }
                }
            }, 12, null);
            b((cGB) new cBQ.s(false, e().getHeight()));
        }
    }
}
