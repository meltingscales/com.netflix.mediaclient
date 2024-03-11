package o;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: o.xi  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9848xi extends ViewOutlineProvider {
    private final Rect a;
    private final float b;
    private final Rect d;

    public C9848xi(int i, Rect rect) {
        C8632dsu.c((Object) rect, "");
        this.d = rect;
        this.b = i;
        this.a = new Rect();
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) outline, "");
        this.a.right = view.getMeasuredWidth();
        this.a.bottom = view.getMeasuredHeight() - this.d.height();
        outline.setRoundRect(this.a, this.b);
    }
}
