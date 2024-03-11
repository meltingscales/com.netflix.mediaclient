package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import o.C8627dsp;

/* loaded from: classes.dex */
public abstract class LazyListMeasuredItemProvider {
    private final long childConstraints;
    private final LazyListItemProvider itemProvider;
    private final LazyLayoutMeasureScope measureScope;

    public /* synthetic */ LazyListMeasuredItemProvider(long j, boolean z, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, C8627dsp c8627dsp) {
        this(j, z, lazyListItemProvider, lazyLayoutMeasureScope);
    }

    public abstract LazyListMeasuredItem createItem(int i, Object obj, Object obj2, List<? extends Placeable> list);

    /* renamed from: getChildConstraints-msEJaDk  reason: not valid java name */
    public final long m336getChildConstraintsmsEJaDk() {
        return this.childConstraints;
    }

    private LazyListMeasuredItemProvider(long j, boolean z, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope) {
        this.itemProvider = lazyListItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.childConstraints = ConstraintsKt.Constraints$default(0, z ? Constraints.m2473getMaxWidthimpl(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : Constraints.m2472getMaxHeightimpl(j), 5, null);
    }

    public final LazyListMeasuredItem getAndMeasure(int i) {
        return createItem(i, this.itemProvider.getKey(i), this.itemProvider.getContentType(i), this.measureScope.mo376measure0kLqBqw(i, this.childConstraints));
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }
}
