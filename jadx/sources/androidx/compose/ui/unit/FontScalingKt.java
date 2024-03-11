package androidx.compose.ui.unit;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* loaded from: classes.dex */
public final class FontScalingKt {
    private static final MutableState DisableNonLinearFontScalingInCompose$delegate;

    static {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        DisableNonLinearFontScalingInCompose$delegate = mutableStateOf$default;
    }

    public static final boolean getDisableNonLinearFontScalingInCompose() {
        return ((Boolean) DisableNonLinearFontScalingInCompose$delegate.getValue()).booleanValue();
    }
}
