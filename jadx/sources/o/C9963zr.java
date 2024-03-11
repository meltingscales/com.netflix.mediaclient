package o;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: o.zr  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9963zr extends C9958zm {
    @Override // o.C9958zm
    protected String b() {
        return "ViewHolder";
    }

    public C9963zr(Context context) {
        this(context, null, 0);
    }

    public C9963zr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C9963zr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // o.C9958zm
    public void d() {
        b(". onViewAttachedToWindow");
    }

    @Override // o.C9958zm
    public void j() {
        b(". onViewDetachedFromWindow");
    }

    @Override // o.C9958zm
    public void h() {
        b(". onViewRecycled");
    }

    @Override // o.C9958zm
    public void e(int i) {
        b(". onBindViewHolder(" + i + ")");
    }

    @Override // o.C9958zm
    public void c() {
        b(". onFailedToRecycleView");
    }

    @Override // o.C9958zm
    public void a() {
        b(". onLayoutCoverView");
    }
}
