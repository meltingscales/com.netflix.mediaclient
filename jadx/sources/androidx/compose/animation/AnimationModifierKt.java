package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import o.dpR;
import o.drX;

/* loaded from: classes.dex */
public final class AnimationModifierKt {
    private static final long InvalidSize = IntSizeKt.IntSize(Integer.MIN_VALUE, Integer.MIN_VALUE);

    public static final long getInvalidSize() {
        return InvalidSize;
    }

    public static /* synthetic */ Modifier animateContentSize$default(Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, drX drx, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            drx = null;
        }
        return animateContentSize(modifier, finiteAnimationSpec, drx);
    }

    public static final Modifier animateContentSize(Modifier modifier, FiniteAnimationSpec<IntSize> finiteAnimationSpec, drX<? super IntSize, ? super IntSize, dpR> drx) {
        return ClipKt.clipToBounds(modifier).then(new SizeAnimationModifierElement(finiteAnimationSpec, drx));
    }

    /* renamed from: isValid-ozmzZPI  reason: not valid java name */
    public static final boolean m15isValidozmzZPI(long j) {
        return !IntSize.m2545equalsimpl0(j, InvalidSize);
    }
}
