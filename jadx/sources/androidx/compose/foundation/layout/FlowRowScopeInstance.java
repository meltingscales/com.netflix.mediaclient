package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class FlowRowScopeInstance implements FlowRowScope {
    public static final FlowRowScopeInstance INSTANCE = new FlowRowScopeInstance();
    private final /* synthetic */ RowScopeInstance $$delegate_0 = RowScopeInstance.INSTANCE;

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier align(Modifier modifier, Alignment.Vertical vertical) {
        return this.$$delegate_0.align(modifier, vertical);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier alignByBaseline(Modifier modifier) {
        return this.$$delegate_0.alignByBaseline(modifier);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier weight(Modifier modifier, float f, boolean z) {
        return this.$$delegate_0.weight(modifier, f, z);
    }

    private FlowRowScopeInstance() {
    }
}
