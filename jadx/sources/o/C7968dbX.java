package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.netflix.mediaclient.android.widget.NetflixImageView;

/* renamed from: o.dbX  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7968dbX extends NetflixImageView {
    public static final c b = new c(null);
    private int d;
    private int e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7968dbX(Context context) {
        this(context, null, 2, null);
        C8632dsu.c((Object) context, "");
    }

    public final int c() {
        return this.d;
    }

    public final void setIdealHeightPx(int i) {
        this.d = i;
    }

    public final void setMaxHeightPx(int i) {
        this.e = i;
    }

    public /* synthetic */ C7968dbX(Context context, AttributeSet attributeSet, int i, C8627dsp c8627dsp) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7968dbX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
        this.d = -1;
        this.e = -1;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* renamed from: o.dbX$c */
    /* loaded from: classes5.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("TitleTreatmentImageView");
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        a();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        a();
    }

    private final void a() {
        int i;
        if (this.d == -1) {
            throw new IllegalStateException("You must set idealHeightPx");
        }
        Matrix matrix = new Matrix(getImageMatrix());
        matrix.reset();
        if (getDrawable() == null || getWidth() == 0) {
            return;
        }
        float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float paddingTop = (this.d - getPaddingTop()) - getPaddingBottom();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float f = width / intrinsicWidth;
        float min = Math.min(intrinsicHeight * f, paddingTop);
        float f2 = intrinsicWidth / intrinsicHeight;
        float min2 = Math.min(width, paddingTop * f2);
        if (f2 < 1.6d || min2 / width < 0.6f) {
            min *= 1.4f;
        }
        if (this.e > 0) {
            min = Math.min(min, (i - getPaddingTop()) - getPaddingBottom());
        }
        float f3 = min / intrinsicHeight;
        if (intrinsicWidth * f3 <= width) {
            f = f3;
        }
        b.getLogTag();
        matrix.setScale(f, f, 0.0f, 0.0f);
        int paddingTop2 = ((int) (intrinsicHeight * f)) + getPaddingTop() + getPaddingBottom();
        int max = Math.max(paddingTop2, this.d);
        matrix.postTranslate(0.0f, (max - paddingTop2) / 2);
        setImageMatrix(matrix);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = max;
            setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
