package androidx.compose.material;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8627dsp;

/* loaded from: classes5.dex */
public final class MutableWindowInsets implements WindowInsets {
    private final MutableState insets$delegate;

    public MutableWindowInsets() {
        this(null, 1, null);
    }

    public MutableWindowInsets(WindowInsets windowInsets) {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInsets, null, 2, null);
        this.insets$delegate = mutableStateOf$default;
    }

    public /* synthetic */ MutableWindowInsets(WindowInsets windowInsets, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? WindowInsetsKt.WindowInsets(0, 0, 0, 0) : windowInsets);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return getInsets().getLeft(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return getInsets().getTop(density);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return getInsets().getRight(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return getInsets().getBottom(density);
    }

    public final WindowInsets getInsets() {
        return (WindowInsets) this.insets$delegate.getValue();
    }

    public final void setInsets(WindowInsets windowInsets) {
        this.insets$delegate.setValue(windowInsets);
    }
}
