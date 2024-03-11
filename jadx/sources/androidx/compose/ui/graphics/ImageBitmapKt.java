package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;

/* loaded from: classes.dex */
public final class ImageBitmapKt {
    /* renamed from: ImageBitmap-x__-hDU$default  reason: not valid java name */
    public static /* synthetic */ ImageBitmap m1367ImageBitmapx__hDU$default(int i, int i2, int i3, boolean z, ColorSpace colorSpace, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = ImageBitmapConfig.Companion.m1362getArgb8888_sVssgQ();
        }
        if ((i4 & 8) != 0) {
            z = true;
        }
        if ((i4 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return m1366ImageBitmapx__hDU(i, i2, i3, z, colorSpace);
    }

    /* renamed from: ImageBitmap-x__-hDU  reason: not valid java name */
    public static final ImageBitmap m1366ImageBitmapx__hDU(int i, int i2, int i3, boolean z, ColorSpace colorSpace) {
        return AndroidImageBitmap_androidKt.m1198ActualImageBitmapx__hDU(i, i2, i3, z, colorSpace);
    }
}
