package androidx.compose.material3;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class FloatingActionButtonKt {
    private static final ExitTransition ExtendedFabCollapseAnimation;
    private static final EnterTransition ExtendedFabExpandAnimation;
    private static final float ExtendedFabStartIconPadding = Dp.m2492constructorimpl(16);
    private static final float ExtendedFabEndIconPadding = Dp.m2492constructorimpl(12);
    private static final float ExtendedFabTextPadding = Dp.m2492constructorimpl(20);
    private static final float ExtendedFabMinimumWidth = Dp.m2492constructorimpl(80);

    /* JADX WARN: Removed duplicated region for block: B:113:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da  */
    /* renamed from: FloatingActionButton-X-z6DiA  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m791FloatingActionButtonXz6DiA(final o.drO<o.dpR> r30, androidx.compose.ui.Modifier r31, androidx.compose.ui.graphics.Shape r32, long r33, long r35, androidx.compose.material3.FloatingActionButtonElevation r37, androidx.compose.foundation.interaction.MutableInteractionSource r38, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m791FloatingActionButtonXz6DiA(o.drO, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, o.drX, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da  */
    /* renamed from: ExtendedFloatingActionButton-X-z6DiA  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m790ExtendedFloatingActionButtonXz6DiA(final o.drO<o.dpR> r26, androidx.compose.ui.Modifier r27, androidx.compose.ui.graphics.Shape r28, long r29, long r31, androidx.compose.material3.FloatingActionButtonElevation r33, androidx.compose.foundation.interaction.MutableInteractionSource r34, final o.InterfaceC8612dsa<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m790ExtendedFloatingActionButtonXz6DiA(o.drO, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, o.dsa, androidx.compose.runtime.Composer, int, int):void");
    }

    static {
        MotionTokens motionTokens = MotionTokens.INSTANCE;
        ExitTransition fadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, motionTokens.getEasingLinearCubicBezier(), 2, null), 0.0f, 2, null);
        TweenSpec tween$default = AnimationSpecKt.tween$default(500, 0, motionTokens.getEasingEmphasizedCubicBezier(), 2, null);
        Alignment.Companion companion = Alignment.Companion;
        ExtendedFabCollapseAnimation = fadeOut$default.plus(EnterExitTransitionKt.shrinkHorizontally$default(tween$default, companion.getStart(), false, null, 12, null));
        ExtendedFabExpandAnimation = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween(200, 100, motionTokens.getEasingLinearCubicBezier()), 0.0f, 2, null).plus(EnterExitTransitionKt.expandHorizontally$default(AnimationSpecKt.tween$default(500, 0, motionTokens.getEasingEmphasizedCubicBezier(), 2, null), companion.getStart(), false, null, 12, null));
    }
}
