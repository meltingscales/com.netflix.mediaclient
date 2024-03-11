package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.netflix.mediaclient.android.widget.NetflixImageView;

/* renamed from: o.cdJ  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6435cdJ extends NetflixImageView {
    private boolean a;
    private final Matrix b;
    private float d;
    public static final b e = new b(null);
    public static final int c = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6435cdJ(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6435cdJ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C6435cdJ(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6435cdJ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.b = new Matrix();
        setScaleType(ImageView.ScaleType.MATRIX);
        this.d = 0.24647887f;
    }

    /* renamed from: o.cdJ$b */
    /* loaded from: classes6.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("TabletBillboardImageView");
        }
    }

    public final void setYBias(float f) {
        this.d = f;
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        C8632dsu.c((Object) canvas, "");
        if (!this.a) {
            e();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int i, int i2, int i3, int i4) {
        e();
        return super.setFrame(i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        e();
    }

    private final void e() {
        int a = a();
        Drawable drawable = getDrawable();
        if (a <= 0 || getHeight() <= 0) {
            return;
        }
        if (drawable != null && getScaleType() == ImageView.ScaleType.MATRIX) {
            this.b.reset();
            if (getHeight() / getWidth() > 0.5625f) {
                this.b.postTranslate((getWidth() - ((int) ((((getHeight() - getPaddingTop()) - getPaddingBottom()) / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth()))) / 2.0f, 0.0f);
            } else {
                float width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / drawable.getIntrinsicWidth();
                this.b.setScale(width, width, 0.0f, 0.0f);
                this.b.postTranslate(0.0f, (-this.d) * (a - getHeight()));
            }
            setImageMatrix(this.b);
        }
        this.a = true;
    }

    private final int a() {
        Drawable drawable;
        if (getWidth() <= 0 || getHeight() <= 0 || (drawable = getDrawable()) == null) {
            return 0;
        }
        return (int) ((((getWidth() - getPaddingLeft()) - getPaddingRight()) / drawable.getIntrinsicWidth()) * drawable.getIntrinsicHeight());
    }
}
