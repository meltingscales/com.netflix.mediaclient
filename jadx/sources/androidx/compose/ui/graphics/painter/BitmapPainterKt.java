package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;

/* loaded from: classes.dex */
public final class BitmapPainterKt {
    /* renamed from: BitmapPainter-QZhYCtY$default  reason: not valid java name */
    public static /* synthetic */ BitmapPainter m1573BitmapPainterQZhYCtY$default(ImageBitmap imageBitmap, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = IntOffset.Companion.m2538getZeronOccac();
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            i = FilterQuality.Companion.m1333getLowfv9h1I();
        }
        return m1572BitmapPainterQZhYCtY(imageBitmap, j3, j4, i);
    }

    /* renamed from: BitmapPainter-QZhYCtY  reason: not valid java name */
    public static final BitmapPainter m1572BitmapPainterQZhYCtY(ImageBitmap imageBitmap, long j, long j2, int i) {
        BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, j, j2, null);
        bitmapPainter.m1571setFilterQualityvDHp3xo$ui_graphics_release(i);
        return bitmapPainter;
    }
}
