package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.View;
import com.netflix.mediaclient.android.widget.NetflixImageView;

/* renamed from: o.Td  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1216Td {
    public static final a a = new a(null);
    public static final int d = 8;
    private int b;
    private boolean c;
    private Drawable e;
    private boolean f;
    private final Rect g;
    private ColorStateList h;
    private final Rect i;
    private int j;
    private View l;
    private PorterDuff.Mode m;

    public final Drawable a() {
        return this.e;
    }

    public boolean a(Drawable drawable) {
        C8632dsu.c((Object) drawable, "");
        return drawable == this.e;
    }

    public void b(int i, int i2) {
        this.c = true;
    }

    public C1216Td(View view, boolean z) {
        C8632dsu.c((Object) view, "");
        this.l = view;
        this.f = z;
        this.c = true;
        this.i = new Rect();
        this.g = new Rect();
        this.m = PorterDuff.Mode.SRC_IN;
        this.b = NetflixImageView.DEFAULT_LAYER_GRAVITY;
        this.j = this.l.getLayoutDirection();
    }

    /* renamed from: o.Td$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("DrawableLayer");
        }
    }

    public final void b(Drawable drawable) {
        if (C8632dsu.c(this.e, drawable)) {
            return;
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            this.l.unscheduleDrawable(drawable2);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setTintList(this.h);
        }
        PorterDuff.Mode mode = this.m;
        Drawable drawable3 = this.e;
        if (drawable3 != null) {
            drawable3.setTintMode(mode);
        }
        Drawable drawable4 = this.e;
        if (drawable4 != null) {
            drawable4.setCallback(this.l);
        }
        Drawable drawable5 = this.e;
        if (drawable5 != null) {
            drawable5.setLayoutDirection(this.l.getLayoutDirection());
        }
        e();
        this.c = true;
        this.l.requestLayout();
    }

    public final void a(int i) {
        if (this.b != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.b = i;
            if (this.e != null) {
                this.l.requestLayout();
            }
        }
    }

    public void c(int i) {
        this.j = i;
        Drawable drawable = this.e;
        if (drawable == null) {
            return;
        }
        drawable.setLayoutDirection(i);
    }

    public void d(Canvas canvas) {
        C8632dsu.c((Object) canvas, "");
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.c) {
                this.c = false;
                if (this.f) {
                    this.i.set(0, 0, this.l.getWidth(), this.l.getHeight());
                } else {
                    this.i.set(this.l.getPaddingLeft(), this.l.getPaddingTop(), this.l.getWidth() - this.l.getPaddingRight(), this.l.getHeight() - this.l.getPaddingBottom());
                }
                Gravity.apply(this.b, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), this.i, this.g, this.l.getLayoutDirection());
                drawable.setBounds(this.g);
            }
            drawable.draw(canvas);
        }
    }

    public void e(float f, float f2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public void c() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void e() {
        Drawable drawable = this.e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(this.l.getDrawableState());
    }
}
