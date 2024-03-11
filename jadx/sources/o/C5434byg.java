package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.netflix.mediaclient.android.widget.NetflixImageView;

/* renamed from: o.byg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5434byg extends NetflixImageView {
    public static final d c = new d(null);
    private boolean a;
    private float d;
    private final Matrix e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5434byg(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5434byg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C5434byg(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5434byg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.e = new Matrix();
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* renamed from: o.byg$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("RaterBackgroundImageView");
        }
    }

    public final void setYBias(float f) {
        this.d = f;
        c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        C8632dsu.c((Object) canvas, "");
        if (!this.a) {
            c();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int i, int i2, int i3, int i4) {
        c();
        return super.setFrame(i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        c();
    }

    private final void c() {
        int b = b();
        Drawable drawable = getDrawable();
        if (b <= 0 || getHeight() <= 0) {
            return;
        }
        if (drawable != null && getScaleType() == ImageView.ScaleType.MATRIX) {
            this.e.reset();
            float width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / drawable.getIntrinsicWidth();
            this.e.setScale(width, width, 0.0f, 0.0f);
            this.e.postTranslate(0.0f, (-this.d) * (b - getHeight()));
            setImageMatrix(this.e);
        }
        this.a = true;
    }

    private final int b() {
        Drawable drawable;
        if (getWidth() <= 0 || getHeight() <= 0 || (drawable = getDrawable()) == null) {
            return 0;
        }
        return (int) ((((getWidth() - getPaddingLeft()) - getPaddingRight()) / drawable.getIntrinsicWidth()) * drawable.getIntrinsicHeight());
    }
}
