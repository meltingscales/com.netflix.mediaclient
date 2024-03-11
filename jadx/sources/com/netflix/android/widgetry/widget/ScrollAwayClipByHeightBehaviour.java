package com.netflix.android.widgetry.widget;

import android.graphics.Rect;
import android.view.View;
import o.C8632dsu;

/* loaded from: classes2.dex */
public class ScrollAwayClipByHeightBehaviour<T extends View> extends ScrollAwayBehavior<T> {
    private Rect e;
    private Rect f;

    public ScrollAwayClipByHeightBehaviour(int i, View view) {
        super(i, view);
        this.f = new Rect();
        this.e = new Rect();
    }

    @Override // com.netflix.android.widgetry.widget.ScrollAwayBehavior
    protected void c(View view, float f) {
        Number valueOf;
        C8632dsu.c((Object) view, "");
        View view2 = this.d;
        if (view2 != null) {
            view2.setTranslationY(f);
            this.e.set(view2.getLeft(), (int) (-f), view2.getRight(), view2.getHeight());
            view2.setClipBounds(this.e);
            a(view2, f);
        }
        View view3 = this.d;
        if (view3 != null && view3.getVisibility() == 0) {
            valueOf = Float.valueOf(view.getHeight() + f);
        } else {
            valueOf = Integer.valueOf(view.getHeight());
        }
        this.f.set(view.getLeft(), 0, view.getRight(), valueOf.intValue());
        view.setClipBounds(this.f);
        view.invalidate();
    }
}
