package o;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: o.yy  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9917yy extends ViewOutlineProvider {
    private final boolean a;
    private int b;
    private final Rect c = new Rect();
    private final boolean e;

    public final void d(int i) {
        this.b = i;
    }

    public C9917yy(int i, boolean z, boolean z2) {
        this.e = z;
        this.a = z2;
        this.b = i;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) outline, "");
        int measuredHeight = view.getMeasuredHeight() - view.getPaddingBottom();
        this.c.top = this.a ? view.getPaddingTop() - this.b : view.getPaddingTop();
        this.c.left = view.getPaddingLeft();
        this.c.right = view.getMeasuredWidth() - view.getPaddingRight();
        Rect rect = this.c;
        if (this.e) {
            measuredHeight += this.b;
        }
        rect.bottom = measuredHeight;
        outline.setRoundRect(rect, this.b);
    }
}
