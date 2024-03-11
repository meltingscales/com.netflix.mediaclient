package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import o.C8632dsu;
import o.drX;

/* loaded from: classes.dex */
final class GridSlotCache implements LazyGridSlotsProvider {
    private long cachedConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private float cachedDensity;
    private LazyGridSlots cachedSizes;
    private final drX<Density, Constraints, LazyGridSlots> calculation;

    /* JADX WARN: Multi-variable type inference failed */
    public GridSlotCache(drX<? super Density, ? super Constraints, LazyGridSlots> drx) {
        this.calculation = drx;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider
    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public LazyGridSlots mo346invoke0kLqBqw(Density density, long j) {
        if (this.cachedSizes != null && Constraints.m2466equalsimpl0(this.cachedConstraints, j) && this.cachedDensity == density.getDensity()) {
            LazyGridSlots lazyGridSlots = this.cachedSizes;
            C8632dsu.d(lazyGridSlots);
            return lazyGridSlots;
        }
        this.cachedConstraints = j;
        this.cachedDensity = density.getDensity();
        LazyGridSlots invoke = this.calculation.invoke(density, Constraints.m2461boximpl(j));
        this.cachedSizes = invoke;
        return invoke;
    }
}
