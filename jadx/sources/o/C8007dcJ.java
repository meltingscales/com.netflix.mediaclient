package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.netflix.android.imageloader.api.BlurProcessor;

/* renamed from: o.dcJ  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8007dcJ {
    public static final C8007dcJ b = new C8007dcJ();

    private C8007dcJ() {
    }

    public static final Bitmap b(Bitmap bitmap) {
        C8632dsu.c((Object) bitmap, "");
        BlurProcessor.c cVar = BlurProcessor.c;
        C1332Xp c1332Xp = C1332Xp.b;
        Bitmap c = cVar.a((Context) C1332Xp.b(Context.class)).c(bitmap, BlurProcessor.Intensity.c);
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#60000000"));
        new Canvas(c).drawRect(new RectF(0.0f, 0.0f, c.getWidth(), c.getHeight()), paint);
        return c;
    }
}
