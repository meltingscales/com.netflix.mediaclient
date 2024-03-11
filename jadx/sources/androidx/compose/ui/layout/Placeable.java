package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8657dts;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public abstract class Placeable implements Measured {
    private int height;
    private int width;
    private long measuredSize = IntSizeKt.IntSize(0, 0);
    private long measurementConstraints = PlaceableKt.access$getDefaultConstraints$p();
    private long apparentToRealOffset = IntOffset.Companion.m2538getZeronOccac();

    /* renamed from: getApparentToRealOffset-nOcc-ac  reason: not valid java name */
    public final long m1822getApparentToRealOffsetnOccac() {
        return this.apparentToRealOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    /* renamed from: getMeasuredSize-YbymL2g  reason: not valid java name */
    public final long m1823getMeasuredSizeYbymL2g() {
        return this.measuredSize;
    }

    /* renamed from: getMeasurementConstraints-msEJaDk  reason: not valid java name */
    public final long m1824getMeasurementConstraintsmsEJaDk() {
        return this.measurementConstraints;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: placeAt-f8xVGno */
    public abstract void mo1804placeAtf8xVGno(long j, float f, drM<? super GraphicsLayerScope, dpR> drm);

    public int getMeasuredWidth() {
        return IntSize.m2547getWidthimpl(this.measuredSize);
    }

    public int getMeasuredHeight() {
        return IntSize.m2546getHeightimpl(this.measuredSize);
    }

    /* renamed from: setMeasuredSize-ozmzZPI  reason: not valid java name */
    public final void m1825setMeasuredSizeozmzZPI(long j) {
        if (IntSize.m2545equalsimpl0(this.measuredSize, j)) {
            return;
        }
        this.measuredSize = j;
        onMeasuredSizeChanged();
    }

    private final void onMeasuredSizeChanged() {
        int c;
        int c2;
        c = C8657dts.c(IntSize.m2547getWidthimpl(this.measuredSize), Constraints.m2475getMinWidthimpl(this.measurementConstraints), Constraints.m2473getMaxWidthimpl(this.measurementConstraints));
        this.width = c;
        c2 = C8657dts.c(IntSize.m2546getHeightimpl(this.measuredSize), Constraints.m2474getMinHeightimpl(this.measurementConstraints), Constraints.m2472getMaxHeightimpl(this.measurementConstraints));
        this.height = c2;
        this.apparentToRealOffset = IntOffsetKt.IntOffset((this.width - IntSize.m2547getWidthimpl(this.measuredSize)) / 2, (this.height - IntSize.m2546getHeightimpl(this.measuredSize)) / 2);
    }

    /* renamed from: setMeasurementConstraints-BRTryo0  reason: not valid java name */
    public final void m1826setMeasurementConstraintsBRTryo0(long j) {
        if (Constraints.m2466equalsimpl0(this.measurementConstraints, j)) {
            return;
        }
        this.measurementConstraints = j;
        onMeasuredSizeChanged();
    }

    /* loaded from: classes.dex */
    public static abstract class PlacementScope {
        /* JADX INFO: Access modifiers changed from: protected */
        public abstract LayoutDirection getParentLayoutDirection();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int getParentWidth();

        /* renamed from: placeRelative-70tqf50$default  reason: not valid java name */
        public static /* synthetic */ void m1828placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m1832placeRelative70tqf50(placeable, j, f);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.placeRelative(placeable, i, i2, f);
        }

        public final void placeRelative(Placeable placeable, int i, int i2, float f) {
            long IntOffset = IntOffsetKt.IntOffset(i, i2);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j = placeable.apparentToRealOffset;
                placeable.mo1804placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(IntOffset) + IntOffset.m2533getXimpl(j), IntOffset.m2534getYimpl(IntOffset) + IntOffset.m2534getYimpl(j)), f, null);
                return;
            }
            long IntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m2533getXimpl(IntOffset), IntOffset.m2534getYimpl(IntOffset));
            long j2 = placeable.apparentToRealOffset;
            placeable.mo1804placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(IntOffset2) + IntOffset.m2533getXimpl(j2), IntOffset.m2534getYimpl(IntOffset2) + IntOffset.m2534getYimpl(j2)), f, null);
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.place(placeable, i, i2, f);
        }

        public final void place(Placeable placeable, int i, int i2, float f) {
            long IntOffset = IntOffsetKt.IntOffset(i, i2);
            long j = placeable.apparentToRealOffset;
            placeable.mo1804placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(IntOffset) + IntOffset.m2533getXimpl(j), IntOffset.m2534getYimpl(IntOffset) + IntOffset.m2534getYimpl(j)), f, null);
        }

        /* renamed from: place-70tqf50$default  reason: not valid java name */
        public static /* synthetic */ void m1827place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m1831place70tqf50(placeable, j, f);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default  reason: not valid java name */
        public static /* synthetic */ void m1829placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, drM drm, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            drM drm2 = drm;
            if ((i & 4) != 0) {
                drm2 = PlaceableKt.access$getDefaultLayerBlock$p();
            }
            placementScope.m1833placeRelativeWithLayeraW9wM(placeable, j, f2, drm2);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, drM drm, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            drM drm2 = drm;
            if ((i3 & 8) != 0) {
                drm2 = PlaceableKt.access$getDefaultLayerBlock$p();
            }
            placementScope.placeRelativeWithLayer(placeable, i, i2, f2, drm2);
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i, int i2, float f, drM<? super GraphicsLayerScope, dpR> drm) {
            long IntOffset = IntOffsetKt.IntOffset(i, i2);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j = placeable.apparentToRealOffset;
                placeable.mo1804placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(IntOffset) + IntOffset.m2533getXimpl(j), IntOffset.m2534getYimpl(IntOffset) + IntOffset.m2534getYimpl(j)), f, drm);
                return;
            }
            long IntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m2533getXimpl(IntOffset), IntOffset.m2534getYimpl(IntOffset));
            long j2 = placeable.apparentToRealOffset;
            placeable.mo1804placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(IntOffset2) + IntOffset.m2533getXimpl(j2), IntOffset.m2534getYimpl(IntOffset2) + IntOffset.m2534getYimpl(j2)), f, drm);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, drM drm, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            drM drm2 = drm;
            if ((i3 & 8) != 0) {
                drm2 = PlaceableKt.access$getDefaultLayerBlock$p();
            }
            placementScope.placeWithLayer(placeable, i, i2, f2, drm2);
        }

        public final void placeWithLayer(Placeable placeable, int i, int i2, float f, drM<? super GraphicsLayerScope, dpR> drm) {
            long IntOffset = IntOffsetKt.IntOffset(i, i2);
            long j = placeable.apparentToRealOffset;
            placeable.mo1804placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(IntOffset) + IntOffset.m2533getXimpl(j), IntOffset.m2534getYimpl(IntOffset) + IntOffset.m2534getYimpl(j)), f, drm);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default  reason: not valid java name */
        public static /* synthetic */ void m1830placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, drM drm, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            drM drm2 = drm;
            if ((i & 4) != 0) {
                drm2 = PlaceableKt.access$getDefaultLayerBlock$p();
            }
            placementScope.m1834placeWithLayeraW9wM(placeable, j, f2, drm2);
        }

        /* renamed from: placeRelative-70tqf50  reason: not valid java name */
        public final void m1832placeRelative70tqf50(Placeable placeable, long j, float f) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j2 = placeable.apparentToRealOffset;
                placeable.mo1804placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(j) + IntOffset.m2533getXimpl(j2), IntOffset.m2534getYimpl(j) + IntOffset.m2534getYimpl(j2)), f, null);
                return;
            }
            long IntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m2533getXimpl(j), IntOffset.m2534getYimpl(j));
            long j3 = placeable.apparentToRealOffset;
            placeable.mo1804placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(IntOffset) + IntOffset.m2533getXimpl(j3), IntOffset.m2534getYimpl(IntOffset) + IntOffset.m2534getYimpl(j3)), f, null);
        }

        /* renamed from: place-70tqf50  reason: not valid java name */
        public final void m1831place70tqf50(Placeable placeable, long j, float f) {
            long j2 = placeable.apparentToRealOffset;
            placeable.mo1804placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(j) + IntOffset.m2533getXimpl(j2), IntOffset.m2534getYimpl(j) + IntOffset.m2534getYimpl(j2)), f, null);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM  reason: not valid java name */
        public final void m1833placeRelativeWithLayeraW9wM(Placeable placeable, long j, float f, drM<? super GraphicsLayerScope, dpR> drm) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j2 = placeable.apparentToRealOffset;
                placeable.mo1804placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(j) + IntOffset.m2533getXimpl(j2), IntOffset.m2534getYimpl(j) + IntOffset.m2534getYimpl(j2)), f, drm);
                return;
            }
            long IntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m2533getXimpl(j), IntOffset.m2534getYimpl(j));
            long j3 = placeable.apparentToRealOffset;
            placeable.mo1804placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(IntOffset) + IntOffset.m2533getXimpl(j3), IntOffset.m2534getYimpl(IntOffset) + IntOffset.m2534getYimpl(j3)), f, drm);
        }

        /* renamed from: placeWithLayer-aW-9-wM  reason: not valid java name */
        public final void m1834placeWithLayeraW9wM(Placeable placeable, long j, float f, drM<? super GraphicsLayerScope, dpR> drm) {
            long j2 = placeable.apparentToRealOffset;
            placeable.mo1804placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(j) + IntOffset.m2533getXimpl(j2), IntOffset.m2534getYimpl(j) + IntOffset.m2534getYimpl(j2)), f, drm);
        }
    }
}
