package androidx.compose.foundation;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public final class FocusedBoundsKt {
    private static final ProvidableModifierLocal<drM<LayoutCoordinates, dpR>> ModifierLocalFocusedBoundsObserver = ModifierLocalKt.modifierLocalOf(new drO<drM<? super LayoutCoordinates, ? extends dpR>>() { // from class: androidx.compose.foundation.FocusedBoundsKt$ModifierLocalFocusedBoundsObserver$1
        @Override // o.drO
        public final drM<? super LayoutCoordinates, ? extends dpR> invoke() {
            return null;
        }
    });

    public static final ProvidableModifierLocal<drM<LayoutCoordinates, dpR>> getModifierLocalFocusedBoundsObserver() {
        return ModifierLocalFocusedBoundsObserver;
    }
}
