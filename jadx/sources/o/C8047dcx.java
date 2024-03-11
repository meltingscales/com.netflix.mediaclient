package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import o.AbstractC1403aA;
import o.C1026Lt;
import o.C1030Lx;
import o.C8029dcf;
import o.C9834xU;

/* renamed from: o.dcx  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8047dcx extends AbstractC1403aA.j<C8033dcj> {
    private final int a;
    private final boolean b;
    private final int c;
    private final ColorDrawable d;
    private final int e;
    private final Drawable f;
    private final int g;
    private final Drawable h;
    private final drM<String, dpR> i;
    private final int j;

    /* JADX WARN: Multi-variable type inference failed */
    public C8047dcx(Context context, boolean z, drM<? super String, dpR> drm) {
        C8632dsu.c((Object) context, "");
        this.b = z;
        this.i = drm;
        int color = ContextCompat.getColor(context, C1030Lx.d.j);
        this.g = color;
        this.d = new ColorDrawable(color);
        this.e = ContextCompat.getColor(context, C9834xU.c.b);
        Drawable drawable = ContextCompat.getDrawable(context, C1026Lt.a.NU);
        this.f = drawable;
        this.c = drawable != null ? drawable.getIntrinsicWidth() : 0;
        this.a = drawable != null ? drawable.getIntrinsicHeight() : 0;
        this.j = context.getResources().getDimensionPixelSize(C8029dcf.e.b);
        this.h = ContextCompat.getDrawable(context, C8029dcf.b.a);
    }

    @Override // o.AbstractC1403aA.j
    public void c(C8033dcj c8033dcj, View view, int i, int i2) {
        drM<String, dpR> drm;
        if (c8033dcj == null || (drm = this.i) == null) {
            return;
        }
        drm.invoke(c8033dcj.v());
    }

    @Override // o.AbstractC1403aA.j
    public void c(C8033dcj c8033dcj, View view, float f, Canvas canvas) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) canvas, "");
        int bottom = view.getBottom() - view.getTop();
        int right = (int) ((view.getRight() - view.getLeft()) * Math.abs(f));
        if (Math.abs(f) > 0.0f) {
            view.setBackground(this.h);
        } else {
            view.setBackgroundColor(this.e);
        }
        this.d.setBounds(this.b ? 0 : (view.getRight() - right) - this.j, view.getTop(), this.b ? right + this.j : view.getRight(), view.getBottom());
        this.d.draw(canvas);
        int top = view.getTop();
        int i = (bottom - this.a) / 2;
        int i2 = top + i;
        int right2 = this.b ? i : (view.getRight() - i) - this.c;
        int right3 = this.b ? i + this.c : view.getRight() - i;
        int i3 = this.a;
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setBounds(right2, i2, right3, i3 + i2);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        super.c((C8047dcx) c8033dcj, view, f, canvas);
    }
}
