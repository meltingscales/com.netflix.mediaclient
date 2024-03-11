package androidx.compose.ui.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class OnSizeChangedModifier extends InspectorValueInfo implements OnRemeasuredModifier {
    private final drM<IntSize, dpR> onSizeChanged;
    private long previousSize;

    /* JADX WARN: Multi-variable type inference failed */
    public OnSizeChangedModifier(drM<? super IntSize, dpR> drm, drM<? super InspectorInfo, dpR> drm2) {
        super(drm2);
        this.onSizeChanged = drm;
        this.previousSize = IntSizeKt.IntSize(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // androidx.compose.ui.layout.OnRemeasuredModifier
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo1819onRemeasuredozmzZPI(long j) {
        if (IntSize.m2545equalsimpl0(this.previousSize, j)) {
            return;
        }
        this.onSizeChanged.invoke(IntSize.m2542boximpl(j));
        this.previousSize = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return C8632dsu.c(this.onSizeChanged, ((OnSizeChangedModifier) obj).onSizeChanged);
        }
        return false;
    }

    public int hashCode() {
        return this.onSizeChanged.hashCode();
    }
}
