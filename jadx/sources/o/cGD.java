package o;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.WindowInsetsCompat;
import o.cIE;

/* loaded from: classes4.dex */
public final class cGD extends AbstractC5765cHn implements cFS {
    public static final e e = new e(null);
    private ViewGroup a;
    private Rect b;
    private ViewGroup c;
    private Rect d;
    private Rect f;
    private final ViewGroup g;
    private final ViewGroup h;
    private boolean j;

    @Override // o.AbstractC5765cHn
    public int bI_() {
        return cIE.b.bp;
    }

    @Override // o.AbstractC9944zY
    /* renamed from: f */
    public ViewGroup e() {
        return this.h;
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("PlayerPostPlayUIView");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cGD(ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        this.g = viewGroup;
        View e2 = C9703vR.e(viewGroup, cIE.c.ah, 0, 2, null);
        C8632dsu.d(e2);
        this.h = (ViewGroup) e2;
        this.b = new Rect();
        this.d = new Rect();
        e().setVisibility(8);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        e().setVisibility(0);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        e().setVisibility(8);
    }

    @Override // o.cFS
    public void e(WindowInsetsCompat windowInsetsCompat) {
        C8632dsu.c((Object) windowInsetsCompat, "");
        if (this.j) {
            return;
        }
        final Rect rect = new Rect(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
        this.f = rect;
        e().post(new Runnable() { // from class: o.cGH
            @Override // java.lang.Runnable
            public final void run() {
                cGD.a(cGD.this, rect);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(cGD cgd, Rect rect) {
        C8632dsu.c((Object) cgd, "");
        C8632dsu.c((Object) rect, "");
        cgd.c(rect);
    }

    @Override // o.cFS
    public void i() {
        this.j = true;
        this.f = null;
        final Rect rect = new Rect(0, 0, 0, 0);
        e().post(new Runnable() { // from class: o.cGE
            @Override // java.lang.Runnable
            public final void run() {
                cGD.e(cGD.this, rect);
            }
        });
        ViewGroup viewGroup = this.c;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(cGD cgd, Rect rect) {
        C8632dsu.c((Object) cgd, "");
        C8632dsu.c((Object) rect, "");
        cgd.c(rect);
    }

    private final void b(View view, Rect rect, Rect rect2) {
        if (view != null) {
            view.setPadding(rect.left + rect2.left, rect.top + rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        }
    }

    @Override // o.cFS
    public void j() {
        if (e().getChildCount() == 0) {
            this.g.addView(LayoutInflater.from(e().getContext()).inflate(cIE.c.L, this.g, false), 1);
            LayoutInflater.from(e().getContext()).inflate(cIE.c.Z, e());
            ViewGroup viewGroup = (ViewGroup) e().findViewById(cIE.b.bo);
            this.b.set(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
            this.c = viewGroup;
            ViewGroup viewGroup2 = (ViewGroup) e().findViewById(cIE.b.bi);
            this.d.set(viewGroup2.getPaddingLeft(), viewGroup2.getPaddingTop(), viewGroup2.getPaddingRight(), viewGroup2.getPaddingBottom());
            this.a = viewGroup2;
            Rect rect = this.f;
            if (rect != null) {
                c(rect);
            }
        }
    }

    private final void c(Rect rect) {
        e.getLogTag();
        b(this.c, rect, this.b);
        b(this.a, rect, this.d);
    }
}
