package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import java.util.concurrent.atomic.AtomicInteger;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class SemanticsModifierKt {
    private static AtomicInteger lastIdentifier = new AtomicInteger(0);

    public static final int generateSemanticsId() {
        return lastIdentifier.addAndGet(1);
    }

    public static /* synthetic */ Modifier semantics$default(Modifier modifier, boolean z, drM drm, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return semantics(modifier, z, drm);
    }

    public static final Modifier semantics(Modifier modifier, boolean z, drM<? super SemanticsPropertyReceiver, dpR> drm) {
        return modifier.then(new AppendedSemanticsElement(z, drm));
    }

    public static final Modifier clearAndSetSemantics(Modifier modifier, drM<? super SemanticsPropertyReceiver, dpR> drm) {
        return modifier.then(new ClearAndSetSemanticsElement(drm));
    }
}
