package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.netflix.android.imageloader.api.ImageDataSource;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.Arrays;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes3.dex */
public final class RF extends Drawable {
    private static final int b;
    private static final int c;
    private static final int e;
    private static final Paint f;
    private static Rect g;
    private static final Paint h;
    private static final Paint i;
    private final DisplayMetrics j;
    private final NetflixImageView l;
    private final Paint m;
    private final int n;
    public static final d d = new d(null);
    public static final int a = 8;

    /* loaded from: classes3.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ImageDataSource.values().length];
            try {
                iArr[ImageDataSource.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageDataSource.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageDataSource.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            b = iArr;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public RF(NetflixImageView netflixImageView) {
        C8632dsu.c((Object) netflixImageView, "");
        this.l = netflixImageView;
        DisplayMetrics displayMetrics = netflixImageView.getContext().getResources().getDisplayMetrics();
        this.j = displayMetrics;
        this.n = ((int) (displayMetrics.density * 12.0f)) + 4;
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setTextSize(displayMetrics.density * 12.0f);
        this.m = paint;
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("ImageDebugOverlayDrawable");
        }
    }

    static {
        int argb = Color.argb(96, 0, 160, 0);
        b = argb;
        int argb2 = Color.argb(96, 180, 70, 0);
        c = argb2;
        int argb3 = Color.argb(96, (int) PrivateKeyType.INVALID, 0, 0);
        e = argb3;
        Paint paint = new Paint();
        paint.setColor(argb);
        f = paint;
        Paint paint2 = new Paint();
        paint2.setColor(argb2);
        i = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(argb3);
        h = paint3;
        g = new Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i2;
        int i3;
        String str = "";
        C8632dsu.c((Object) canvas, "");
        Drawable drawable = this.l.getDrawable();
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable == null) {
            return;
        }
        Bitmap bitmap = bitmapDrawable.getBitmap();
        if (bitmap != null) {
            i3 = bitmap.getWidth();
            i2 = bitmap.getHeight();
        } else {
            i2 = 0;
            i3 = 0;
        }
        String str2 = i3 + InteractiveAnimation.ANIMATION_TYPE.X + i2;
        if (this.l.getWidth() != 0 && this.l.getHeight() != 0) {
            dsE dse = dsE.b;
            String format = String.format(Locale.ENGLISH, "%.2f/%.2f", Arrays.copyOf(new Object[]{Float.valueOf(i3 / this.l.getWidth()), Float.valueOf(i2 / this.l.getHeight())}, 2));
            C8632dsu.a(format, "");
            str = format;
        }
        Paint a2 = a(i3, i2);
        e(0, str2, a2, canvas);
        e(1, str, a2, canvas);
        NetflixImageView netflixImageView = this.l;
        e(2, String.valueOf(netflixImageView != null ? netflixImageView.getImageDataSource() : null), b(this.l.getImageDataSource()), canvas);
        e(3, this.l.getAssetFetchLatencyInMs() + "ms", b(this.l.getImageDataSource()), canvas);
        d.getLogTag();
    }

    private final void e(int i2, String str, Paint paint, Canvas canvas) {
        this.m.getTextBounds(str, 0, str.length(), g);
        int i3 = i2 + 1;
        g.offset(4, (this.n * i3) - 8);
        Rect rect = g;
        rect.right += 16;
        rect.bottom += 16;
        canvas.drawRect(rect, paint);
        canvas.drawText(str, 12.0f, this.n * i3, this.m);
    }

    private final Paint a(int i2, int i3) {
        return (i2 > this.l.getWidth() || i3 > this.l.getHeight()) ? h : (((float) i2) > ((float) this.l.getWidth()) * 0.75f || ((float) i3) > ((float) this.l.getHeight()) * 0.75f) ? i : f;
    }

    private final Paint b(ImageDataSource imageDataSource) {
        int i2 = imageDataSource == null ? -1 : a.b[imageDataSource.ordinal()];
        if (i2 != -1) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        return f;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return i;
            }
            return h;
        }
        return f;
    }
}
