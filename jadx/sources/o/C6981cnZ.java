package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import o.AbstractC1403aA;
import o.AbstractC3073as;
import o.C1026Lt;
import o.C1030Lx;
import o.C6956cnA;
import o.C9834xU;

/* renamed from: o.cnZ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6981cnZ<T extends AbstractC3073as<?>> extends AbstractC1403aA.j<T> {
    private final int a;
    private final boolean b;
    private final int c;
    private final ColorDrawable d;
    private final int e;
    private final int f;
    private final int g;
    private float h;
    private final Drawable i;
    private final Drawable j;
    private final drM<T, dpR> l;
    private final drM<T, dpR> m;
    private final drM<T, dpR> n;

    public /* synthetic */ C6981cnZ(Context context, boolean z, drM drm, drM drm2, drM drm3, int i, C8627dsp c8627dsp) {
        this(context, z, (i & 4) != 0 ? null : drm, (i & 8) != 0 ? null : drm2, (i & 16) != 0 ? null : drm3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6981cnZ(Context context, boolean z, drM<? super T, dpR> drm, drM<? super T, dpR> drm2, drM<? super T, dpR> drm3) {
        C8632dsu.c((Object) context, "");
        this.b = z;
        this.l = drm;
        this.m = drm2;
        this.n = drm3;
        int color = ContextCompat.getColor(context, C1030Lx.d.j);
        this.f = color;
        this.d = new ColorDrawable(color);
        this.e = ContextCompat.getColor(context, C9834xU.c.b);
        Drawable drawable = ContextCompat.getDrawable(context, C1026Lt.a.NU);
        this.i = drawable;
        this.a = drawable != null ? drawable.getIntrinsicWidth() : 0;
        this.c = drawable != null ? drawable.getIntrinsicHeight() : 0;
        this.g = context.getResources().getDimensionPixelSize(C6956cnA.d.e);
        this.j = ContextCompat.getDrawable(context, C6956cnA.a.e);
    }

    @Override // o.AbstractC1403aA.j
    public void c(T t, View view, int i, int i2) {
        drM<T, dpR> drm = this.m;
        if (drm != null) {
            drm.invoke(t);
        }
    }

    @Override // o.AbstractC1403aA.j
    public void a(T t, View view, int i) {
        drM<T, dpR> drm = this.l;
        if (drm != null) {
            drm.invoke(t);
        }
    }

    @Override // o.AbstractC1403aA.j
    public void c(T t, View view, float f, Canvas canvas) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) canvas, "");
        if (Math.abs(f) > 0.0f) {
            view.setBackground(this.j);
            int bottom = view.getBottom() - view.getTop();
            int right = (int) ((view.getRight() - view.getLeft()) * Math.abs(f));
            this.d.setBounds(this.b ? 0 : (view.getRight() - right) - this.g, view.getTop(), this.b ? right + this.g : view.getRight(), view.getBottom());
            this.d.draw(canvas);
            int top = view.getTop();
            int i = (bottom - this.c) / 2;
            int i2 = top + i;
            int right2 = this.b ? i : (view.getRight() - i) - this.a;
            int right3 = this.b ? i + this.a : view.getRight() - i;
            int i3 = this.c;
            Drawable drawable = this.i;
            if (drawable != null) {
                drawable.setBounds(right2, i2, right3, i3 + i2);
            }
            Drawable drawable2 = this.i;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
            float f2 = this.h;
            if ((f2 < 50.0f && f >= 50.0f) || (f2 > 50.0f && f <= 50.0f)) {
                view.performHapticFeedback(4);
            }
        } else {
            view.setBackgroundColor(this.e);
        }
        this.h = f;
        drM<T, dpR> drm = this.n;
        if (drm != null) {
            drm.invoke(t);
        }
    }
}
