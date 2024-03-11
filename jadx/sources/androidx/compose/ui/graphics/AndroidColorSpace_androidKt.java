package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;

/* loaded from: classes.dex */
public final class AndroidColorSpace_androidKt {
    public static final ColorSpace toAndroidColorSpace(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        ColorSpaceVerificationHelper colorSpaceVerificationHelper = ColorSpaceVerificationHelper.INSTANCE;
        return ColorSpaceVerificationHelper.androidColorSpace(colorSpace);
    }

    public static final androidx.compose.ui.graphics.colorspace.ColorSpace toComposeColorSpace(ColorSpace colorSpace) {
        ColorSpaceVerificationHelper colorSpaceVerificationHelper = ColorSpaceVerificationHelper.INSTANCE;
        return ColorSpaceVerificationHelper.composeColorSpace(colorSpace);
    }
}
