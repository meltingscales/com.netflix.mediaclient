package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import o.C9834xU;
import o.C9883yQ;
import o.InterfaceC9957zl;

/* renamed from: o.yT  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9886yT extends C9883yQ {
    public static final b d = new b(null);
    public static final int e = 8;
    private final ImageView a;
    private final View j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9886yT(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9886yT(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    @Override // o.C9883yQ
    protected long b() {
        return 100L;
    }

    @Override // o.C9883yQ
    protected int g() {
        return C9834xU.i.b;
    }

    @Override // o.C9883yQ
    protected int n() {
        return 3;
    }

    public /* synthetic */ C9886yT(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9886yT(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        C9836xW d2 = C9836xW.d(this);
        C8632dsu.a(d2, "");
        AppCompatImageView appCompatImageView = d2.b;
        C8632dsu.a(appCompatImageView, "");
        this.a = appCompatImageView;
        Space space = d2.f;
        C8632dsu.a(space, "");
        this.j = space;
        appCompatImageView.setVisibility(8);
        space.setVisibility(8);
    }

    /* renamed from: o.yT$b */
    /* loaded from: classes2.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("AroRibbon");
        }
    }

    private final boolean p() {
        return this.a.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(drM drm, View view) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(view);
    }

    public final void setCategoryCaratClickListener(final drM<? super View, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        this.a.setOnClickListener(new View.OnClickListener() { // from class: o.yW
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9886yT.j(drM.this, view);
            }
        });
    }

    @Override // o.C9883yQ, o.InterfaceC9957zl
    public void setupSubGenreHolder(String str, String str2, String str3, final drM<? super View, dpR> drm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) drm, "");
        C9883yQ.c cVar = i().get(i().size() - 1);
        C8632dsu.a(cVar, "");
        C9883yQ.c cVar2 = cVar;
        cVar2.e().setText(str2);
        cVar2.b(false);
        cVar2.e().setTag(C9834xU.g.c, new InterfaceC9957zl.c(str3, str2, false));
        cVar2.e().setOnClickListener(new View.OnClickListener() { // from class: o.yU
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9886yT.g(drM.this, view);
            }
        });
        b(cVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(drM drm, View view) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(view);
    }

    @Override // o.C9883yQ
    protected boolean l() {
        return k() || p();
    }

    @Override // o.C9883yQ
    protected int c(int i) {
        return (View.MeasureSpec.getSize(i) - h().getMeasuredWidth()) - e().getMeasuredWidth();
    }

    @Override // o.C9883yQ, o.InterfaceC9957zl
    public void setupHolder(int i, String str, String str2, boolean z, drM<? super View, dpR> drm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) drm, "");
        super.setupHolder(i, str, str2, z, drm);
        if (i < i().size()) {
            this.a.setVisibility(0);
            this.j.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C9883yQ
    public void o() {
        super.o();
        this.a.setVisibility(0);
        this.a.setAlpha(1.0f);
        this.j.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C9883yQ
    public void c(C9883yQ.c cVar) {
        C8632dsu.c((Object) cVar, "");
        super.c(cVar);
        if (cVar.a()) {
            cVar.e().setVisibility(0);
            cVar.d().setVisibility(0);
            return;
        }
        cVar.e().setVisibility(8);
        cVar.d().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C9883yQ
    public void d(C9883yQ.c cVar) {
        C8632dsu.c((Object) cVar, "");
        super.d(cVar);
        if (cVar.a()) {
            cVar.e().setVisibility(0);
            cVar.d().setVisibility(0);
            return;
        }
        cVar.e().setVisibility(8);
        cVar.d().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C9883yQ
    public void m() {
        super.m();
        this.a.setVisibility(8);
        this.j.setVisibility(8);
    }

    private final void b(C9883yQ.c cVar) {
        C1203Sq e2;
        if (j() != null) {
            a(false);
            C9883yQ.c j = j();
            if (j != null && (e2 = j.e()) != null) {
                e2.setTranslationX(0.0f);
                C9870yD.d(e2, 0, f());
            }
            C9883yQ.c j2 = j();
            C1203Sq e3 = j2 != null ? j2.e() : null;
            if (e3 != null) {
                e3.setVisibility(8);
            }
            e(cVar);
            a(cVar);
            C9870yD.d(cVar.e(), 0, f());
            cVar.e().setVisibility(0);
            cVar.e().setAlpha(1.0f);
            return;
        }
        a(true);
        e(cVar);
        a(cVar);
        if (isLaidOut()) {
            a(cVar.e().getVisibility() == 8 ? b() : ((i().indexOf(cVar) + 1) * 150) + 150);
            a().setDuration(0, c());
            a().setDuration(1, c());
            d(false);
            for (C9883yQ.c cVar2 : i()) {
                cVar2.d().setVisibility(8);
                if (!C8632dsu.c(cVar2, j())) {
                    cVar2.e().setVisibility(8);
                } else {
                    cVar2.e().setVisibility(0);
                }
            }
            C9870yD.d(cVar.e(), 0, f());
            cVar.e().animate().scaleX(1.15f).scaleY(1.15f).setDuration(50L).start();
            this.j.setVisibility(8);
            return;
        }
        c(cVar.e(), 1.15f);
    }
}
