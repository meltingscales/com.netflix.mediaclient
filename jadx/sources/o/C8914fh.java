package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* renamed from: o.fh  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8914fh {
    private static final ThreadLocal<PathMeasure> a = new ThreadLocal<PathMeasure>() { // from class: o.fh.4
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: e */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    };
    private static final ThreadLocal<Path> d = new ThreadLocal<Path>() { // from class: o.fh.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: e */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<Path> c = new ThreadLocal<Path>() { // from class: o.fh.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: d */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<float[]> b = new ThreadLocal<float[]>() { // from class: o.fh.5
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: c */
        public float[] initialValue() {
            return new float[4];
        }
    };
    private static final float e = (float) (Math.sqrt(2.0d) / 2.0d);

    public static int a(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (527 * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        return f4 != 0.0f ? (int) (i * 31 * f4) : i;
    }

    public static boolean d(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    public static Path c(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            float f = pointF.x;
            float f2 = pointF3.x;
            float f3 = pointF.y;
            float f4 = pointF3.y;
            float f5 = pointF2.x;
            float f6 = pointF4.x;
            float f7 = pointF2.y;
            path.cubicTo(f2 + f, f3 + f4, f5 + f6, f7 + pointF4.y, f5, f7);
        } else {
            path.lineTo(pointF2.x, pointF2.y);
        }
        return path;
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static float c(Matrix matrix) {
        float[] fArr = b.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean a(Matrix matrix) {
        float[] fArr = b.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static void e(Path path, C5859cL c5859cL) {
        if (c5859cL == null || c5859cL.j()) {
            return;
        }
        d(path, ((C6020cR) c5859cL.d()).h() / 100.0f, ((C6020cR) c5859cL.a()).h() / 100.0f, ((C6020cR) c5859cL.c()).h() / 360.0f);
    }

    public static void d(Path path, float f, float f2, float f3) {
        C3550bC.d("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = a.get();
        Path path2 = d.get();
        Path path3 = c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C3550bC.a("applyTrimPathIfNeeded");
        } else if (length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            C3550bC.a("applyTrimPathIfNeeded");
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = C8853eZ.b(min, length);
                max = C8853eZ.b(max, length);
            }
            if (min < 0.0f) {
                min = C8853eZ.b(min, length);
            }
            if (max < 0.0f) {
                max = C8853eZ.b(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
                C3550bC.a("applyTrimPathIfNeeded");
                return;
            }
            if (i >= 0) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            C3550bC.a("applyTrimPathIfNeeded");
        }
    }

    public static float d() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float b(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap d(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static boolean a(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static void a(Canvas canvas, RectF rectF, Paint paint) {
        c(canvas, rectF, paint, 31);
    }

    public static void c(Canvas canvas, RectF rectF, Paint paint, int i) {
        C3550bC.d("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        C3550bC.a("Utils#saveLayer");
    }
}
