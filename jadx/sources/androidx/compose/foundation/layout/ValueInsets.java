package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class ValueInsets implements WindowInsets {
    private final String name;
    private final MutableState value$delegate;

    public ValueInsets(InsetsValues insetsValues, String str) {
        MutableState mutableStateOf$default;
        this.name = str;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(insetsValues, null, 2, null);
        this.value$delegate = mutableStateOf$default;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return getValue$foundation_layout_release().getLeft();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return getValue$foundation_layout_release().getTop();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return getValue$foundation_layout_release().getRight();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return getValue$foundation_layout_release().getBottom();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ValueInsets) {
            return C8632dsu.c(getValue$foundation_layout_release(), ((ValueInsets) obj).getValue$foundation_layout_release());
        }
        return false;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return this.name + "(left=" + getValue$foundation_layout_release().getLeft() + ", top=" + getValue$foundation_layout_release().getTop() + ", right=" + getValue$foundation_layout_release().getRight() + ", bottom=" + getValue$foundation_layout_release().getBottom() + ')';
    }

    public final InsetsValues getValue$foundation_layout_release() {
        return (InsetsValues) this.value$delegate.getValue();
    }

    public final void setValue$foundation_layout_release(InsetsValues insetsValues) {
        this.value$delegate.setValue(insetsValues);
    }
}
