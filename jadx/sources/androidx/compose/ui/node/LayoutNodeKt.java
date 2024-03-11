package androidx.compose.ui.node;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;

/* loaded from: classes.dex */
public final class LayoutNodeKt {
    private static final Density DefaultDensity = DensityKt.Density$default(1.0f, 0.0f, 2, null);

    public static final /* synthetic */ Density access$getDefaultDensity$p() {
        return DefaultDensity;
    }

    public static final Owner requireOwner(LayoutNode layoutNode) {
        Owner owner$ui_release = layoutNode.getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }
}