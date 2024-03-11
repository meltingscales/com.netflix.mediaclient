package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import o.C9834xU;
import o.SJ;
import o.cBO;
import o.cGJ;
import o.cIE;
import o.dpR;

/* loaded from: classes4.dex */
public final class cGJ extends AbstractC5765cHn implements cFO {
    public static final e a = new e(null);
    private final ViewGroup b;
    private final a d;
    private final ImageButton e;
    private final SJ f;
    private final PublishSubject<dpR> g;
    private final SJ h;
    private final ViewGroup j;

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void b() {
    }

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void d() {
    }

    @Override // o.cFO
    public Observable<dpR> i() {
        return this.g;
    }

    @Override // o.AbstractC9944zY
    /* renamed from: m */
    public ViewGroup e() {
        return this.j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cGJ(ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        this.b = viewGroup;
        View e2 = C9703vR.e(viewGroup, cIE.c.w, 0, 2, null);
        C8632dsu.d(e2);
        this.j = (ViewGroup) e2;
        View findViewById = e().findViewById(cIE.b.bd);
        C8632dsu.a(findViewById, "");
        ImageButton imageButton = (ImageButton) findViewById;
        this.e = imageButton;
        View findViewById2 = e().findViewById(cIE.b.bE);
        C8632dsu.a(findViewById2, "");
        SJ sj = (SJ) findViewById2;
        this.f = sj;
        View findViewById3 = e().findViewById(cIE.b.bA);
        C8632dsu.a(findViewById3, "");
        SJ sj2 = (SJ) findViewById3;
        this.h = sj2;
        PublishSubject<dpR> create = PublishSubject.create();
        C8632dsu.a(create, "");
        this.g = create;
        a aVar = new a();
        this.d = aVar;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: o.cGL
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cGJ.c(cGJ.this, view);
            }
        });
        sj.setOnSeekButtonListener(aVar);
        sj2.setOnSeekButtonListener(aVar);
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("PlayerPrimaryControlsUIView");
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements SJ.a {
        a() {
        }

        @Override // o.SJ.a
        public void c(SJ sj, int i, int i2) {
            C8632dsu.c((Object) sj, "");
            cGJ.this.b((cGJ) new cBO.C5584t(i == -1));
            cGJ.this.b((cGJ) cBO.X.a);
        }

        @Override // o.SJ.a
        public void e(SJ sj, int i, int i2) {
            C8632dsu.c((Object) sj, "");
            cGJ.a.getLogTag();
            cGJ.this.b((cGJ) new cBO.C5582r(i == -1, i2 * 10000, false, 0, 8, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(cGJ cgj, View view) {
        C8632dsu.c((Object) cgj, "");
        view.performHapticFeedback(1);
        cgj.b((cGJ) cBO.C5581q.d);
    }

    @Override // o.cFO
    public void k() {
        int dimensionPixelSize = this.e.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.I);
        ImageButton imageButton = this.e;
        ViewGroup.LayoutParams layoutParams = imageButton.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = dimensionPixelSize;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = dimensionPixelSize;
            imageButton.setLayoutParams(layoutParams2);
            int dimensionPixelSize2 = this.e.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.G);
            this.e.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
            ImageButton imageButton2 = this.e;
            imageButton2.invalidateDrawable(imageButton2.getDrawable());
            this.f.c();
            this.h.c();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    @Override // o.AbstractC5765cHn, o.InterfaceC5730cGf
    public boolean w() {
        return e().getVisibility() == 0;
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        e().setVisibility(0);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        e().setVisibility(8);
    }

    @Override // o.cFO
    public void g() {
        B().c(this.e, true);
    }

    @Override // o.cFO
    public void d(boolean z) {
        if (z) {
            B().c(this.f, true);
            B().c(this.h, true);
            return;
        }
        this.f.setEnabled(true);
        this.h.setEnabled(true);
    }

    @Override // o.cFO
    public void h() {
        B().c(this.e, false);
    }

    @Override // o.cFO
    public void a(boolean z) {
        if (z) {
            B().c(this.f, false);
            B().c(this.h, false);
            return;
        }
        this.f.setEnabled(false);
        this.h.setEnabled(false);
    }

    public boolean t() {
        return this.e.getVisibility() == 0;
    }

    @Override // o.cFO
    public void o() {
        if (t()) {
            return;
        }
        this.e.setVisibility(0);
    }

    @Override // o.cFO
    public void j() {
        if (t()) {
            this.e.setVisibility(4);
        }
    }

    @Override // o.cFO
    public void e(boolean z) {
        if (z) {
            ImageButton imageButton = this.e;
            imageButton.setImageDrawable(ResourcesCompat.getDrawable(imageButton.getResources(), com.netflix.mediaclient.ui.R.e.ac, this.e.getContext().getTheme()));
            ImageButton imageButton2 = this.e;
            imageButton2.setContentDescription(imageButton2.getResources().getString(C9834xU.h.a));
            return;
        }
        ImageButton imageButton3 = this.e;
        imageButton3.setImageDrawable(ResourcesCompat.getDrawable(imageButton3.getResources(), com.netflix.mediaclient.ui.R.e.Y, this.e.getContext().getTheme()));
        ImageButton imageButton4 = this.e;
        imageButton4.setContentDescription(imageButton4.getResources().getString(C9834xU.h.b));
    }

    @Override // o.cFO
    public void c(boolean z) {
        drO<dpR> dro = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PlayerPrimaryControlsUIView$performSkipAnimation$onAnimationEnd$1
            {
                super(0);
            }

            public final void b() {
                PublishSubject publishSubject;
                publishSubject = cGJ.this.g;
                publishSubject.onNext(dpR.c);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                b();
                return dpR.c;
            }
        };
        if (z) {
            this.f.b(dro);
        } else {
            this.h.b(dro);
        }
    }

    @Override // o.cFO
    public void j(boolean z) {
        if (z) {
            this.f.setVisibility(0);
        } else {
            this.h.setVisibility(0);
        }
    }

    @Override // o.cFO
    public void b(boolean z) {
        if (z) {
            this.f.setVisibility(4);
        } else {
            this.h.setVisibility(4);
        }
    }

    @Override // o.cFO
    public void l() {
        e().setVisibility(0);
    }

    @Override // o.cFO
    public void f() {
        e().setVisibility(8);
    }

    @Override // o.cFO
    public void a(int i) {
        float f = i == 1 ? 0.73f : 1.0f;
        C9702vQ.a(this.e, f);
        C9702vQ.a(this.f, f);
        C9702vQ.a(this.h, f);
        int i2 = i == 1 ? 102 : 101;
        this.f.setAnimMode(i2);
        this.h.setAnimMode(i2);
    }

    @Override // o.cFO
    public void n() {
        this.f.setVisibility(8);
        this.h.setVisibility(8);
    }
}
