package o;

import android.annotation.SuppressLint;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.netflix.mediaclient.ui.player.IPlayerFragment;
import o.C7595czF;
import o.C7639czx;
import o.cIE;

/* renamed from: o.czC  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7592czC implements InterfaceC7594czE {
    protected static String d = "nf_postplay";
    protected IPlayerFragment a;
    protected ViewGroup b;
    protected C7595czF.c c;
    protected d e;
    protected aJY h;
    protected TextureView j;
    private final int i = 12;
    private final int g = 12;
    private final int f = 300;

    @Override // o.InterfaceC7594czE
    public boolean b() {
        return true;
    }

    protected C7595czF.c e() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7592czC(IPlayerFragment iPlayerFragment) {
        this.a = iPlayerFragment;
        View h = iPlayerFragment.h();
        this.h = (aJY) h.findViewById(cIE.b.aN);
        this.j = (TextureView) h.findViewById(cIE.b.bL);
        this.b = (ViewGroup) h.findViewById(C7639czx.e.c);
        if (this.h == null) {
            C1044Mm.j(d, "PostPlayWithScaling:: surface not found");
        }
        if (this.j == null) {
            C1044Mm.j(d, "PostPlayWithScaling:: surface2 not found");
        }
        if (this.b == null) {
            C1044Mm.j(d, "PostPlayWithScaling:: rootFrame not found");
        }
        int p = C8150deu.p(this.a.d());
        this.c = new C7595czF.c(0, 0, 0, 1.0f, C9870yD.b(this.a.d(), 12), C9870yD.b(this.a.d(), 12), C9870yD.b(this.a.d(), 300) / p);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(final int i, final int i2, final float f) {
        this.a.b(new Runnable() { // from class: o.czC.1
            @Override // java.lang.Runnable
            public void run() {
                C7592czC.this.d(i, i2, f);
                C7592czC.this.e(i, i2);
            }
        });
    }

    protected void e(int i, int i2) {
        TextureView textureView = this.j;
        if (textureView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textureView.getLayoutParams();
            marginLayoutParams.setMargins(i, i2, 0, 0);
            this.j.setLayoutParams(marginLayoutParams);
            this.j.postInvalidate();
        }
    }

    protected void d(int i, int i2, float f) {
        aJY ajy = this.h;
        if (ajy != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ajy.getLayoutParams();
            marginLayoutParams.setMargins(i, i2, 0, 0);
            this.h.setLayoutParams(marginLayoutParams);
            this.h.setScaleX(f);
            this.h.setScaleY(f);
            this.h.postInvalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d a() {
        aJY ajy = this.h;
        if (ajy != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ajy.getLayoutParams();
            return new d(marginLayoutParams.bottomMargin, marginLayoutParams.topMargin, marginLayoutParams.leftMargin, marginLayoutParams.rightMargin);
        }
        return null;
    }

    @Override // o.InterfaceC7594czE
    public void c() {
        C1044Mm.e(d, "PostPlayWithScaling:: doTransitionToPostPlay starts");
        if (this.h == null) {
            C1044Mm.j(d, "PostPlayWithScaling:: surface not found");
            return;
        }
        this.e = a();
        c(this.h);
        c(this.j);
        e(0, 0, this.c.b());
        C1044Mm.e(d, "PostPlayWithScaling:: doTransitionToPostPlay ends after request layout");
    }

    @Override // o.InterfaceC7594czE
    public void c(Runnable runnable) {
        C1044Mm.e(d, "PostPlayWithScaling:: doTransitionFromPostPlay starts");
        if (this.h == null) {
            C1044Mm.j(d, "PostPlayWithScaling:: surface not found");
            return;
        }
        if (this.e == null) {
            C1044Mm.d(d, "Previous state unknown");
            this.e = new d(0, 0, 0, 0);
        }
        d(this.h);
        aJY ajy = this.h;
        d dVar = this.e;
        d(ajy, dVar.c, dVar.b, dVar.e, dVar.a);
        this.h.postInvalidate();
        TextureView textureView = this.j;
        if (textureView != null) {
            d(textureView);
            TextureView textureView2 = this.j;
            d dVar2 = this.e;
            d(textureView2, dVar2.c, dVar2.b, dVar2.e, dVar2.a);
            this.j.postInvalidate();
        }
        C1044Mm.e(d, "PostPlayWithScaling:: doTransitionFromPostPlay ends after request layout");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    public void c(View view) {
        if (view == null) {
            return;
        }
        if (view.getParent() instanceof ConstraintLayout) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone((ConstraintLayout) view.getParent());
            constraintSet.clear(view.getId(), 3);
            constraintSet.clear(view.getId(), 4);
            constraintSet.clear(view.getId(), 6);
            constraintSet.clear(view.getId(), 7);
            constraintSet.setHorizontalBias(view.getId(), 0.0f);
            constraintSet.setVerticalBias(view.getId(), 0.0f);
            constraintSet.applyTo((ConstraintLayout) view.getParent());
        } else if (view instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams.removeRule(13);
            view.setLayoutParams(layoutParams);
        } else if (view instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.gravity = 0;
            view.setLayoutParams(layoutParams2);
        }
    }

    protected void d(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMargins(i, i2, i3, i4);
        view.setLayoutParams(marginLayoutParams);
    }

    protected void d(View view) {
        if (view != null) {
            if (view.getParent() instanceof ConstraintLayout) {
                ConstraintSet constraintSet = new ConstraintSet();
                constraintSet.clone((ConstraintLayout) view.getParent());
                constraintSet.connect(view.getId(), 3, 0, 3);
                constraintSet.connect(view.getId(), 4, 0, 4);
                constraintSet.connect(view.getId(), 6, 0, 6);
                constraintSet.connect(view.getId(), 7, 0, 7);
                constraintSet.setHorizontalBias(view.getId(), 0.5f);
                constraintSet.setVerticalBias(view.getId(), 0.5f);
                constraintSet.applyTo((ConstraintLayout) view.getParent());
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams).addRule(13, -1);
                view.setLayoutParams(layoutParams);
            } else if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o.czC$d */
    /* loaded from: classes4.dex */
    public static class d {
        int a;
        int b;
        int c;
        int e;

        d(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.e = i4;
        }
    }
}
