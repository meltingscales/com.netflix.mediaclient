package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* loaded from: classes.dex */
public abstract class LazyGridMeasuredItemProvider {
    private final int defaultMainAxisSpacing;
    private final LazyGridItemProvider itemProvider;
    private final LazyLayoutMeasureScope measureScope;

    public abstract LazyGridMeasuredItem createItem(int i, Object obj, Object obj2, int i2, int i3, List<? extends Placeable> list);

    public LazyGridMeasuredItemProvider(LazyGridItemProvider lazyGridItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i) {
        this.itemProvider = lazyGridItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.defaultMainAxisSpacing = i;
    }

    /* renamed from: getAndMeasure-3p2s80s$default  reason: not valid java name */
    public static /* synthetic */ LazyGridMeasuredItem m353getAndMeasure3p2s80s$default(LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, int i, int i2, long j, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = lazyGridMeasuredItemProvider.defaultMainAxisSpacing;
            }
            return lazyGridMeasuredItemProvider.m354getAndMeasure3p2s80s(i, i2, j);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-3p2s80s");
    }

    /* renamed from: getAndMeasure-3p2s80s  reason: not valid java name */
    public final LazyGridMeasuredItem m354getAndMeasure3p2s80s(int i, int i2, long j) {
        int m2474getMinHeightimpl;
        Object key = this.itemProvider.getKey(i);
        Object contentType = this.itemProvider.getContentType(i);
        List<Placeable> mo376measure0kLqBqw = this.measureScope.mo376measure0kLqBqw(i, j);
        if (Constraints.m2471getHasFixedWidthimpl(j)) {
            m2474getMinHeightimpl = Constraints.m2475getMinWidthimpl(j);
        } else if (!Constraints.m2470getHasFixedHeightimpl(j)) {
            throw new IllegalArgumentException("does not have fixed height".toString());
        } else {
            m2474getMinHeightimpl = Constraints.m2474getMinHeightimpl(j);
        }
        return createItem(i, key, contentType, m2474getMinHeightimpl, i2, mo376measure0kLqBqw);
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }
}
