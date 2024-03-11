package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.netflix.mediaclient.android.widget.NetflixImageView;

/* renamed from: o.Tc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1215Tc extends NetflixImageView {
    private boolean a;
    private int b;
    private String d;
    private boolean e;

    public C1215Tc(Context context) {
        super(context);
        this.e = true;
        this.a = false;
        b(null);
    }

    public C1215Tc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = true;
        this.a = false;
        b(attributeSet);
    }

    public C1215Tc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = true;
        this.a = false;
        b(attributeSet);
    }

    public void setCutomCroppingEnabled(boolean z) {
        this.e = z;
        if (z) {
            setScaleType(ImageView.ScaleType.MATRIX);
            a();
        } else if (C8168dfL.g(this.d)) {
        } else {
            setScaleType(ImageView.ScaleType.values()[Integer.valueOf(this.d).intValue()]);
        }
    }

    public void setCenterHorizontally(boolean z) {
        this.a = z;
        a();
    }

    private void b(AttributeSet attributeSet) {
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleType");
        if (C8168dfL.g(attributeValue)) {
            setScaleType(ImageView.ScaleType.MATRIX);
            this.e = true;
        } else {
            this.d = attributeValue;
            this.e = false;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.netflix.mediaclient.ui.R.k.f13250o, 0, 0);
        try {
            this.b = obtainStyledAttributes.getDimensionPixelSize(com.netflix.mediaclient.ui.R.k.n, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setCropPointYOffsetPx(int i) {
        this.b = i;
        a();
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int i, int i2, int i3, int i4) {
        a();
        return super.setFrame(i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a();
    }

    public void a() {
        float f;
        float f2;
        if (this.e) {
            Matrix matrix = new Matrix(getImageMatrix());
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int intrinsicWidth = getDrawable() == null ? 0 : getDrawable().getIntrinsicWidth();
            int intrinsicHeight = getDrawable() != null ? getDrawable().getIntrinsicHeight() : 0;
            if (intrinsicWidth * height > intrinsicHeight * width) {
                f = height;
                f2 = intrinsicHeight;
            } else {
                f = width;
                f2 = intrinsicWidth;
            }
            float f3 = f / f2;
            matrix.setScale(f3, f3, 0.0f, this.b);
            if (this.a) {
                float f4 = intrinsicWidth * f3;
                float f5 = width;
                if (f4 > f5) {
                    matrix.postTranslate(-((f4 - f5) / 2.0f), 0.0f);
                }
            }
            setImageMatrix(matrix);
        }
    }
}
