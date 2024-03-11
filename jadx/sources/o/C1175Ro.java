package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import o.C9834xU;

/* renamed from: o.Ro  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C1175Ro extends FrameLayout {
    private final int a;
    private final int b;

    public C1175Ro(Context context) {
        super(context);
        this.b = 0;
        this.a = 0;
    }

    public C1175Ro(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9834xU.n.k);
        this.b = obtainStyledAttributes.getDimensionPixelSize(C9834xU.n.n, 0);
        this.a = obtainStyledAttributes.getDimensionPixelSize(C9834xU.n.m, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.b;
        if (i3 > 0 && i3 < size) {
            i = View.MeasureSpec.makeMeasureSpec(this.b, View.MeasureSpec.getMode(i));
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.a;
        if (i4 > 0 && i4 < size2) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.a, View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }
}
