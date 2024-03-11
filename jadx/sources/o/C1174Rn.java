package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import o.C9834xU;

/* renamed from: o.Rn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1174Rn extends LinearLayout {
    private final int b;
    private final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1174Rn(Context context) {
        super(context);
        C8632dsu.c((Object) context, "");
        this.d = 0;
        this.b = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1174Rn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) attributeSet, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9834xU.n.l);
        C8632dsu.a(obtainStyledAttributes, "");
        this.d = obtainStyledAttributes.getDimensionPixelSize(C9834xU.n.s, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(C9834xU.n.f13921o, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.d;
        if (i3 > 0 && i3 < size) {
            i = View.MeasureSpec.makeMeasureSpec(this.d, View.MeasureSpec.getMode(i));
        }
        int i4 = this.b;
        if (i4 > 0 && i4 < size2) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.b, View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }
}
