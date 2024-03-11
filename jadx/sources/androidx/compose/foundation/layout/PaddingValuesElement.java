package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PaddingValuesElement extends ModifierNodeElement<PaddingValuesModifier> {
    private final drM<InspectorInfo, dpR> inspectorInfo;
    private final PaddingValues paddingValues;

    /* JADX WARN: Multi-variable type inference failed */
    public PaddingValuesElement(PaddingValues paddingValues, drM<? super InspectorInfo, dpR> drm) {
        this.paddingValues = paddingValues;
        this.inspectorInfo = drm;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public PaddingValuesModifier create() {
        return new PaddingValuesModifier(this.paddingValues);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(PaddingValuesModifier paddingValuesModifier) {
        paddingValuesModifier.setPaddingValues(this.paddingValues);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    public boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return C8632dsu.c(this.paddingValues, paddingValuesElement.paddingValues);
    }
}
