package androidx.compose.ui.layout;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import o.drO;

/* loaded from: classes.dex */
public final class PinnableContainerKt {
    private static final ProvidableCompositionLocal<PinnableContainer> LocalPinnableContainer = CompositionLocalKt.compositionLocalOf$default(null, new drO<PinnableContainer>() { // from class: androidx.compose.ui.layout.PinnableContainerKt$LocalPinnableContainer$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drO
        public final PinnableContainer invoke() {
            return null;
        }
    }, 1, null);

    public static final ProvidableCompositionLocal<PinnableContainer> getLocalPinnableContainer() {
        return LocalPinnableContainer;
    }
}
