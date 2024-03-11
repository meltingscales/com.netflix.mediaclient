package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class ComposableLambdaKt {
    public static final int bitsForSlot(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final int sameBits(int i) {
        return bitsForSlot(1, i);
    }

    public static final int differentBits(int i) {
        return bitsForSlot(2, i);
    }

    public static final boolean replacableWith(RecomposeScope recomposeScope, RecomposeScope recomposeScope2) {
        if (recomposeScope != null) {
            if ((recomposeScope instanceof RecomposeScopeImpl) && (recomposeScope2 instanceof RecomposeScopeImpl)) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) recomposeScope;
                if (!recomposeScopeImpl.getValid() || C8632dsu.c(recomposeScope, recomposeScope2) || C8632dsu.c(recomposeScopeImpl.getAnchor(), ((RecomposeScopeImpl) recomposeScope2).getAnchor())) {
                }
            }
            return false;
        }
        return true;
    }

    public static final ComposableLambda composableLambdaInstance(int i, boolean z, Object obj) {
        return new ComposableLambdaImpl(i, z, obj);
    }

    public static final ComposableLambda composableLambda(Composer composer, int i, boolean z, Object obj) {
        ComposableLambdaImpl composableLambdaImpl;
        composer.startReplaceableGroup(Integer.rotateLeft(i, 1));
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            composableLambdaImpl = new ComposableLambdaImpl(i, z, obj);
            composer.updateRememberedValue(composableLambdaImpl);
        } else {
            C8632dsu.d(rememberedValue);
            composableLambdaImpl = (ComposableLambdaImpl) rememberedValue;
            composableLambdaImpl.update(obj);
        }
        composer.endReplaceableGroup();
        return composableLambdaImpl;
    }
}
