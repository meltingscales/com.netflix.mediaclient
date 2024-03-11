package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import o.C8657dts;

/* loaded from: classes.dex */
public final class ColumnScopeInstance implements ColumnScope {
    public static final ColumnScopeInstance INSTANCE = new ColumnScopeInstance();

    private ColumnScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public Modifier weight(Modifier modifier, float f, boolean z) {
        float h;
        if (f <= 0.0d) {
            throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
        }
        h = C8657dts.h(f, Float.MAX_VALUE);
        return modifier.then(new LayoutWeightElement(h, z));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public Modifier align(Modifier modifier, Alignment.Horizontal horizontal) {
        return modifier.then(new HorizontalAlignElement(horizontal));
    }
}
