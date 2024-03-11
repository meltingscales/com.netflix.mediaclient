package androidx.compose.animation;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class SingleValueAnimationKt {
    private static final SpringSpec<Color> colorDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

    /* renamed from: animateColorAsState-euL9pac  reason: not valid java name */
    public static final State<Color> m46animateColorAsStateeuL9pac(long j, AnimationSpec<Color> animationSpec, String str, drM<? super Color, dpR> drm, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-451899108);
        AnimationSpec<Color> animationSpec2 = (i2 & 2) != 0 ? colorDefaultSpring : animationSpec;
        String str2 = (i2 & 4) != 0 ? "ColorAnimation" : str;
        drM<? super Color, dpR> drm2 = (i2 & 8) != 0 ? null : drm;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-451899108, i, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        ColorSpace m1297getColorSpaceimpl = Color.m1297getColorSpaceimpl(j);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(m1297getColorSpaceimpl);
        TwoWayConverter<Color, AnimationVector4D> rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m1297getColorSpaceimpl(j));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        int i3 = i << 6;
        State<Color> animateValueAsState = AnimateAsStateKt.animateValueAsState(Color.m1284boximpl(j), (TwoWayConverter) rememberedValue, animationSpec2, null, str2, drm2, composer, (i & 14) | 576 | (57344 & i3) | (i3 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }
}
