package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.colorspace.ColorSpace;

/* loaded from: classes.dex */
public final class AndroidImageBitmap_androidKt {
    public static final ImageBitmap asImageBitmap(Bitmap bitmap) {
        return new AndroidImageBitmap(bitmap);
    }

    /* renamed from: ActualImageBitmap-x__-hDU  reason: not valid java name */
    public static final ImageBitmap m1198ActualImageBitmapx__hDU(int i, int i2, int i3, boolean z, ColorSpace colorSpace) {
        Bitmap createBitmap;
        Bitmap.Config m1199toBitmapConfig1JJdX4A = m1199toBitmapConfig1JJdX4A(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = Api26Bitmap.m1226createBitmapx__hDU$ui_graphics_release(i, i2, i3, z, colorSpace);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, m1199toBitmapConfig1JJdX4A);
            createBitmap.setHasAlpha(z);
        }
        return new AndroidImageBitmap(createBitmap);
    }

    public static final Bitmap asAndroidBitmap(ImageBitmap imageBitmap) {
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).getBitmap$ui_graphics_release();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    /* renamed from: toBitmapConfig-1JJdX4A  reason: not valid java name */
    public static final Bitmap.Config m1199toBitmapConfig1JJdX4A(int i) {
        Bitmap.Config config;
        Bitmap.Config config2;
        ImageBitmapConfig.Companion companion = ImageBitmapConfig.Companion;
        if (ImageBitmapConfig.m1357equalsimpl0(i, companion.m1362getArgb8888_sVssgQ())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (ImageBitmapConfig.m1357equalsimpl0(i, companion.m1361getAlpha8_sVssgQ())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (ImageBitmapConfig.m1357equalsimpl0(i, companion.m1365getRgb565_sVssgQ())) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && ImageBitmapConfig.m1357equalsimpl0(i, companion.m1363getF16_sVssgQ())) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        } else if (i2 >= 26 && ImageBitmapConfig.m1357equalsimpl0(i, companion.m1364getGpu_sVssgQ())) {
            config = Bitmap.Config.HARDWARE;
            return config;
        } else {
            return Bitmap.Config.ARGB_8888;
        }
    }

    public static final int toImageConfig(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        if (config == Bitmap.Config.ALPHA_8) {
            return ImageBitmapConfig.Companion.m1361getAlpha8_sVssgQ();
        }
        if (config == Bitmap.Config.RGB_565) {
            return ImageBitmapConfig.Companion.m1365getRgb565_sVssgQ();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return ImageBitmapConfig.Companion.m1362getArgb8888_sVssgQ();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            config3 = Bitmap.Config.RGBA_F16;
            if (config == config3) {
                return ImageBitmapConfig.Companion.m1363getF16_sVssgQ();
            }
        }
        if (i >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                return ImageBitmapConfig.Companion.m1364getGpu_sVssgQ();
            }
        }
        return ImageBitmapConfig.Companion.m1362getArgb8888_sVssgQ();
    }
}
