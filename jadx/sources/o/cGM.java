package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import o.C9834xU;
import o.SJ;
import o.cBO;
import o.cGM;
import o.cIE;
import o.dpR;

/* loaded from: classes4.dex */
public final class cGM extends AbstractC5765cHn implements cFT {
    public static final c b = new c(null);
    private final C1203Sq c;
    private final ImageButton d;
    private final d e;
    private final PublishSubject<dpR> f;
    private final C1203Sq g;
    private final SJ h;
    private final SJ j;
    private final ViewGroup n;

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void b() {
    }

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void d() {
    }

    @Override // o.cFT
    public Observable<dpR> j() {
        return this.f;
    }

    @Override // o.AbstractC9944zY
    /* renamed from: u */
    public ViewGroup e() {
        return this.n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cGM(ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        View e = C9703vR.e(viewGroup, cIE.c.y, 0, 2, null);
        C8632dsu.d(e);
        this.n = (ViewGroup) e;
        View findViewById = e().findViewById(cIE.b.bd);
        C8632dsu.a(findViewById, "");
        ImageButton imageButton = (ImageButton) findViewById;
        this.d = imageButton;
        View findViewById2 = e().findViewById(cIE.b.bE);
        C8632dsu.a(findViewById2, "");
        SJ sj = (SJ) findViewById2;
        this.h = sj;
        View findViewById3 = e().findViewById(cIE.b.bA);
        C8632dsu.a(findViewById3, "");
        SJ sj2 = (SJ) findViewById3;
        this.j = sj2;
        View findViewById4 = e().findViewById(cIE.b.bt);
        C8632dsu.a(findViewById4, "");
        C1203Sq c1203Sq = (C1203Sq) findViewById4;
        this.g = c1203Sq;
        View findViewById5 = e().findViewById(cIE.b.aD);
        C8632dsu.a(findViewById5, "");
        C1203Sq c1203Sq2 = (C1203Sq) findViewById5;
        this.c = c1203Sq2;
        PublishSubject<dpR> create = PublishSubject.create();
        C8632dsu.a(create, "");
        this.f = create;
        d dVar = new d();
        this.e = dVar;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: o.cGN
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cGM.d(cGM.this, view);
            }
        });
        imageButton.setClickable(true);
        sj.setOnSeekButtonListener(dVar);
        sj2.setOnSeekButtonListener(dVar);
        c1203Sq.setOnClickListener(new View.OnClickListener() { // from class: o.cGQ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cGM.a(cGM.this, view);
            }
        });
        c1203Sq.setClickable(true);
        c1203Sq2.setOnClickListener(new View.OnClickListener() { // from class: o.cGP
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cGM.f(cGM.this, view);
            }
        });
        c1203Sq2.setClickable(true);
    }

    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements SJ.a {
        d() {
        }

        @Override // o.SJ.a
        public void c(SJ sj, int i, int i2) {
            C8632dsu.c((Object) sj, "");
            cGM.this.b((cGM) new cBO.C5584t(i == -1));
            cGM.this.b((cGM) cBO.X.a);
        }

        @Override // o.SJ.a
        public void e(SJ sj, int i, int i2) {
            C8632dsu.c((Object) sj, "");
            C1044Mm.e("PlayerPrimaryControlsUIView", "onSeekConfirmed, tapCount is " + i2);
            cGM.this.b((cGM) new cBO.C5582r(i == -1, i2 * 10000, false, 0, 8, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(cGM cgm, View view) {
        C8632dsu.c((Object) cgm, "");
        view.performHapticFeedback(1);
        cgm.b((cGM) cBO.C5581q.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(cGM cgm, View view) {
        C8632dsu.c((Object) cgm, "");
        cgm.b((cGM) cBO.C5585u.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(cGM cgm, View view) {
        C8632dsu.c((Object) cgm, "");
        cgm.b((cGM) cBO.C5573i.e);
    }

    @Override // o.AbstractC5765cHn, o.InterfaceC5730cGf
    public boolean w() {
        return e().getVisibility() == 0;
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        AbstractC5765cHn.a(this, true, 0L, 0L, false, 14, null);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        AbstractC5765cHn.a(this, false, 0L, 0L, false, 14, null);
    }

    @Override // o.cFT
    public void h() {
        B().c(this.d, true);
    }

    @Override // o.cFT
    public void a(boolean z) {
        if (z) {
            B().c(this.h, true);
            B().c(this.j, true);
            return;
        }
        this.h.setEnabled(true);
        this.j.setEnabled(true);
    }

    @Override // o.cFT
    public void g() {
        B().c(this.d, false);
    }

    @Override // o.cFT
    public void d(boolean z) {
        if (z) {
            B().c(this.h, false);
            B().c(this.j, false);
            return;
        }
        this.h.setEnabled(false);
        this.j.setEnabled(false);
    }

    public boolean D() {
        return this.d.getVisibility() == 0;
    }

    @Override // o.cFT
    public void t() {
        if (D()) {
            return;
        }
        this.d.setVisibility(0);
    }

    @Override // o.cFT
    public void o() {
        if (D()) {
            this.d.setVisibility(4);
        }
    }

    @Override // o.cFT
    public void e(boolean z) {
        if (z) {
            this.d.setImageResource(com.netflix.mediaclient.ui.R.e.ac);
            ImageButton imageButton = this.d;
            imageButton.setContentDescription(imageButton.getResources().getString(C9834xU.h.a));
            return;
        }
        this.d.setImageResource(com.netflix.mediaclient.ui.R.e.Y);
        ImageButton imageButton2 = this.d;
        imageButton2.setContentDescription(imageButton2.getResources().getString(C9834xU.h.b));
    }

    @Override // o.cFT
    public void b(boolean z) {
        drO<dpR> dro = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PlayerPrimaryControlsUIView_Ab49548$performSkipAnimation$onAnimationEnd$1
            {
                super(0);
            }

            public final void a() {
                PublishSubject publishSubject;
                publishSubject = cGM.this.f;
                publishSubject.onNext(dpR.c);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                a();
                return dpR.c;
            }
        };
        if (z) {
            this.h.b(dro);
        } else {
            this.j.b(dro);
        }
    }

    @Override // o.cFT
    public void i(boolean z) {
        if (z) {
            this.h.setVisibility(0);
        } else {
            this.j.setVisibility(0);
        }
    }

    @Override // o.cFT
    public void c(boolean z) {
        if (z) {
            this.h.setVisibility(4);
        } else {
            this.j.setVisibility(4);
        }
    }

    @Override // o.cFT
    public void p() {
        e().setVisibility(0);
    }

    @Override // o.cFT
    public void l() {
        e().setVisibility(8);
    }

    @Override // o.cFT
    public void c(int i) {
        float f = i == 1 ? 0.73f : 1.0f;
        C9702vQ.a(this.d, f);
        C9702vQ.a(this.h, f);
        C9702vQ.a(this.j, f);
        int i2 = i == 1 ? 102 : 101;
        this.h.setAnimMode(i2);
        this.j.setAnimMode(i2);
    }

    @Override // o.cFT
    public void n() {
        this.h.setVisibility(8);
        this.j.setVisibility(8);
    }

    @Override // o.cFT
    public void k() {
        this.g.setVisibility(8);
    }

    @Override // o.cFT
    public void m() {
        this.c.setVisibility(8);
    }

    @Override // o.cFT
    public void r() {
        this.g.setVisibility(0);
        this.c.setVisibility(0);
    }

    @Override // o.cFT
    public void s() {
        this.g.setVisibility(8);
        this.c.setVisibility(8);
    }

    @Override // o.cFT
    public void i() {
        B().c(this.g, false);
        B().c(this.c, false);
    }

    @Override // o.cFT
    public void f() {
        B().c(this.g, true);
        B().c(this.c, true);
    }
}
