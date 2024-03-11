package androidx.compose.ui.platform;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import o.drO;

/* loaded from: classes.dex */
public final class InspectionModeKt {
    private static final ProvidableCompositionLocal<Boolean> LocalInspectionMode = CompositionLocalKt.staticCompositionLocalOf(new drO<Boolean>() { // from class: androidx.compose.ui.platform.InspectionModeKt$LocalInspectionMode$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drO
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    });

    public static final ProvidableCompositionLocal<Boolean> getLocalInspectionMode() {
        return LocalInspectionMode;
    }
}
