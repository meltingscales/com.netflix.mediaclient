package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import o.C9834xU;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: o.Rl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1172Rl extends ImageView {
    private int e;

    public C1172Rl(Context context) {
        super(context);
        this.e = 1;
    }

    public C1172Rl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9834xU.n.b);
        this.e = obtainStyledAttributes.getInt(C9834xU.n.d, 1);
        obtainStyledAttributes.recycle();
    }

    public C1172Rl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 1;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int i3;
        Drawable drawable = getDrawable();
        if (drawable != null) {
            if (this.e == 0) {
                intrinsicWidth = View.MeasureSpec.getSize(i);
                int intrinsicWidth2 = drawable.getIntrinsicWidth();
                if (intrinsicWidth2 <= 0) {
                    super.onMeasure(i, i2);
                    return;
                }
                i3 = (drawable.getIntrinsicHeight() * intrinsicWidth) / intrinsicWidth2;
            } else {
                int size = View.MeasureSpec.getSize(i2);
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight <= 0) {
                    super.onMeasure(i, i2);
                    return;
                } else {
                    intrinsicWidth = (drawable.getIntrinsicWidth() * size) / intrinsicHeight;
                    i3 = size;
                }
            }
            setMeasuredDimension(intrinsicWidth, i3);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMeasureBy(int i) {
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException("nvalid measureBy type");
        }
        this.e = i;
        requestLayout();
    }
}
