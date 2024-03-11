package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.util.Arrays;

/* renamed from: o.dbU  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7965dbU {
    private final Context a;
    private final C9868yB c;
    private final int d;

    public C7965dbU(Context context, int i) {
        C8632dsu.c((Object) context, "");
        this.a = context;
        this.d = i;
        C1332Xp c1332Xp = C1332Xp.b;
        this.c = new C9868yB(context, i, 0, 0, 0.0f, (int) TypedValue.applyDimension(1, 3, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()), 16, null);
    }

    public /* synthetic */ C7965dbU(Context context, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    public final Drawable c(int i, int i2, boolean z, int[] iArr) {
        Rect rect;
        C8632dsu.c((Object) iArr, "");
        this.c.a(iArr);
        C9868yB c9868yB = this.c;
        dsE dse = dsE.b;
        String format = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        C8632dsu.a(format, "");
        c9868yB.d(i2, format);
        int c = this.c.c();
        C1332Xp c1332Xp = C1332Xp.b;
        Bitmap createBitmap = Bitmap.createBitmap(c + ((int) TypedValue.applyDimension(1, 10, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())), this.c.e(), Bitmap.Config.ARGB_8888);
        C8632dsu.a(createBitmap, "");
        Canvas canvas = new Canvas(createBitmap);
        float f = new Rect(0, 0, canvas.getWidth(), canvas.getHeight()).bottom;
        float f2 = this.d;
        this.c.b(canvas, z ? rect.right - f2 : rect.left + f2, f - f2);
        return new BitmapDrawable(this.a.getResources(), createBitmap);
    }
}
