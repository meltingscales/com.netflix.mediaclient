package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import o.C9834xU;
import o.cBO;
import o.cIE;

/* renamed from: o.cGj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5734cGj extends AbstractC5765cHn implements cFN {
    private final View a;
    private float b;
    private final cFK c;
    private int d;

    private final int g() {
        return cIE.c.p;
    }

    @Override // o.AbstractC9944zY
    public View e() {
        return this.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5734cGj(ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(g(), viewGroup, false);
        C8632dsu.d(inflate);
        this.a = inflate;
        cFK f = f();
        this.c = f;
        viewGroup.addView(e());
        f.setBrightnessChangedListener(this);
        this.d = e().getLayoutParams().height;
    }

    @Override // o.cFN
    public void j() {
        b((C5734cGj) cBO.Q.e);
    }

    @Override // o.cFN
    public void c(float f) {
        b((C5734cGj) new cBO.W(f));
        this.b = f;
    }

    @Override // o.cFN
    public void h() {
        b((C5734cGj) new cBO.C5566b(this.b));
    }

    private final cFK f() {
        View findViewById = e().findViewById(cIE.b.h);
        C8632dsu.a(findViewById, "");
        return (cFK) findViewById;
    }

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void d() {
        super.d();
        this.c.b();
    }

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void b() {
        super.b();
        this.c.c();
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

    public final void e(float f) {
        this.c.setBrightness(f);
    }

    public final void i() {
        int dimensionPixelSize = e().getContext().getResources().getDimensionPixelSize(C9834xU.a.g);
        int dimensionPixelSize2 = e().getContext().getResources().getDimensionPixelSize(C9834xU.a.h);
        View e = e();
        ViewGroup.LayoutParams layoutParams = e.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = dimensionPixelSize;
            layoutParams.width = dimensionPixelSize2;
            e.setLayoutParams(layoutParams);
            e().setTranslationX(e().getContext().getResources().getDimension(C9834xU.a.j));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
