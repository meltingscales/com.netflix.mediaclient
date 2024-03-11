package androidx.compose.ui.text.style;

import androidx.compose.ui.util.MathHelpersKt;

/* loaded from: classes.dex */
public final class TextGeometricTransformKt {
    public static final TextGeometricTransform lerp(TextGeometricTransform textGeometricTransform, TextGeometricTransform textGeometricTransform2, float f) {
        return new TextGeometricTransform(MathHelpersKt.lerp(textGeometricTransform.getScaleX(), textGeometricTransform2.getScaleX(), f), MathHelpersKt.lerp(textGeometricTransform.getSkewX(), textGeometricTransform2.getSkewX(), f));
    }
}