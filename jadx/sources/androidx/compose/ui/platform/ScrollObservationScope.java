package androidx.compose.ui.platform;

import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.semantics.ScrollAxisRange;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollObservationScope implements OwnerScope {
    private final List<ScrollObservationScope> allScopes;
    private ScrollAxisRange horizontalScrollAxisRange;
    private Float oldXValue;
    private Float oldYValue;
    private final int semanticsNodeId;
    private ScrollAxisRange verticalScrollAxisRange;

    public final ScrollAxisRange getHorizontalScrollAxisRange() {
        return this.horizontalScrollAxisRange;
    }

    public final Float getOldXValue() {
        return this.oldXValue;
    }

    public final Float getOldYValue() {
        return this.oldYValue;
    }

    public final int getSemanticsNodeId() {
        return this.semanticsNodeId;
    }

    public final ScrollAxisRange getVerticalScrollAxisRange() {
        return this.verticalScrollAxisRange;
    }

    public final void setHorizontalScrollAxisRange(ScrollAxisRange scrollAxisRange) {
        this.horizontalScrollAxisRange = scrollAxisRange;
    }

    public final void setOldXValue(Float f) {
        this.oldXValue = f;
    }

    public final void setOldYValue(Float f) {
        this.oldYValue = f;
    }

    public final void setVerticalScrollAxisRange(ScrollAxisRange scrollAxisRange) {
        this.verticalScrollAxisRange = scrollAxisRange;
    }

    public ScrollObservationScope(int i, List<ScrollObservationScope> list, Float f, Float f2, ScrollAxisRange scrollAxisRange, ScrollAxisRange scrollAxisRange2) {
        this.semanticsNodeId = i;
        this.allScopes = list;
        this.oldXValue = f;
        this.oldYValue = f2;
        this.horizontalScrollAxisRange = scrollAxisRange;
        this.verticalScrollAxisRange = scrollAxisRange2;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.allScopes.contains(this);
    }
}
