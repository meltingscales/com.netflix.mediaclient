package o;

import android.animation.ValueAnimator;
import android.view.View;
import com.netflix.android.mdxpanel.skipintro.MdxSkipIntroUIViewImpl$skipIntroAnimator$2;
import o.AbstractC9791we;

/* renamed from: o.wP  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9754wP extends AbstractC9710vY implements InterfaceC9755wQ {
    public static final c a = new c(null);
    private final drO<dpR> c;
    private final int d;
    private final C1203Sq e;
    private final InterfaceC8554dpx f;
    private final View h;
    private String i;

    @Override // o.AbstractC9944zY
    public View e() {
        return this.h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9754wP(View view, C9812wz c9812wz, drO<dpR> dro) {
        super(view);
        InterfaceC8554dpx b;
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) c9812wz, "");
        C8632dsu.c((Object) dro, "");
        this.c = dro;
        C1203Sq c1203Sq = c9812wz.C;
        C8632dsu.a(c1203Sq, "");
        this.e = c1203Sq;
        b = dpB.b(new MdxSkipIntroUIViewImpl$skipIntroAnimator$2(this));
        this.f = b;
        c1203Sq.setOnClickListener(new View.OnClickListener() { // from class: o.wN
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C9754wP.b(C9754wP.this, view2);
            }
        });
        this.h = view;
        this.d = e().getId();
    }

    /* renamed from: o.wP$c */
    /* loaded from: classes2.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("MdxSkipIntroUIViewImpl");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValueAnimator r() {
        return (ValueAnimator) this.f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C9754wP c9754wP, View view) {
        C8632dsu.c((Object) c9754wP, "");
        c9754wP.b((C9754wP) new AbstractC9791we.o(c9754wP.i));
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void d() {
        this.e.setEnabled(true);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void b() {
        this.e.setEnabled(false);
    }

    @Override // o.InterfaceC9755wQ
    public void c(CharSequence charSequence, String str) {
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) str, "");
        this.e.setText(charSequence);
        this.i = str;
        e(1.0f);
    }

    @Override // o.InterfaceC9755wQ
    public void g() {
        e(0.0f);
    }

    private final void e(float f) {
        float floatValue;
        if (r().isStarted() || r().isRunning()) {
            r().cancel();
        }
        if (r().getAnimatedValue() == null) {
            floatValue = 0.0f;
        } else {
            Object animatedValue = r().getAnimatedValue();
            C8632dsu.d(animatedValue);
            floatValue = ((Float) animatedValue).floatValue();
        }
        r().setFloatValues(floatValue, f);
        r().start();
    }
}
