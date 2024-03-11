package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimation;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import o.C8627dsp;
import o.C8657dts;

/* loaded from: classes.dex */
public final class LazyGridMeasuredItem implements LazyGridItemInfo {
    private final int afterContentPadding;
    private final LazyGridItemPlacementAnimator animator;
    private final int beforeContentPadding;
    private int column;
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private int row;
    private final long size;
    private final long visualOffset;

    public /* synthetic */ LazyGridMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, List list, long j, Object obj2, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, C8627dsp c8627dsp) {
        this(i, obj, z, i2, i3, z2, layoutDirection, i4, i5, list, j, obj2, lazyGridItemPlacementAnimator);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.column;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getIndex() {
        return this.index;
    }

    public Object getKey() {
        return this.key;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getOffset-nOcc-ac */
    public long mo349getOffsetnOccac() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.row;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public final void setNonScrollableItem(boolean z) {
        this.nonScrollableItem = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyGridMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, List<? extends Placeable> list, long j, Object obj2, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator) {
        int b;
        long IntSize;
        this.index = i;
        this.key = obj;
        this.isVertical = z;
        this.crossAxisSize = i2;
        this.reverseLayout = z2;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i4;
        this.afterContentPadding = i5;
        this.placeables = list;
        this.visualOffset = j;
        this.contentType = obj2;
        this.animator = lazyGridItemPlacementAnimator;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Placeable placeable = (Placeable) list.get(i7);
            i6 = Math.max(i6, this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.mainAxisSize = i6;
        b = C8657dts.b(i3 + i6, 0);
        this.mainAxisSizeWithSpacings = b;
        if (this.isVertical) {
            IntSize = IntSizeKt.IntSize(this.crossAxisSize, i6);
        } else {
            IntSize = IntSizeKt.IntSize(i6, this.crossAxisSize);
        }
        this.size = IntSize;
        this.offset = IntOffset.Companion.m2538getZeronOccac();
        this.row = -1;
        this.column = -1;
    }

    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    public final Object getParentData(int i) {
        return this.placeables.get(i).getParentData();
    }

    public final int getCrossAxisOffset() {
        return this.isVertical ? IntOffset.m2533getXimpl(mo349getOffsetnOccac()) : IntOffset.m2534getYimpl(mo349getOffsetnOccac());
    }

    public final void position(int i, int i2, int i3, int i4, int i5, int i6) {
        long IntOffset;
        boolean z = this.isVertical;
        this.mainAxisLayoutSize = z ? i4 : i3;
        if (!z) {
            i3 = i4;
        }
        if (z && this.layoutDirection == LayoutDirection.Rtl) {
            i2 = (i3 - i2) - this.crossAxisSize;
        }
        if (z) {
            IntOffset = IntOffsetKt.IntOffset(i2, i);
        } else {
            IntOffset = IntOffsetKt.IntOffset(i, i2);
        }
        this.offset = IntOffset;
        this.row = i5;
        this.column = i6;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void applyScrollDelta(int i) {
        if (this.nonScrollableItem) {
            return;
        }
        long mo349getOffsetnOccac = mo349getOffsetnOccac();
        int m2533getXimpl = this.isVertical ? IntOffset.m2533getXimpl(mo349getOffsetnOccac) : IntOffset.m2533getXimpl(mo349getOffsetnOccac) + i;
        boolean z = this.isVertical;
        int m2534getYimpl = IntOffset.m2534getYimpl(mo349getOffsetnOccac);
        if (z) {
            m2534getYimpl += i;
        }
        this.offset = IntOffsetKt.IntOffset(m2533getXimpl, m2534getYimpl);
        int placeablesCount = getPlaceablesCount();
        for (int i2 = 0; i2 < placeablesCount; i2++) {
            LazyLayoutAnimation animation = this.animator.getAnimation(getKey(), i2);
            if (animation != null) {
                long m363getRawOffsetnOccac = animation.m363getRawOffsetnOccac();
                int m2533getXimpl2 = this.isVertical ? IntOffset.m2533getXimpl(m363getRawOffsetnOccac) : Integer.valueOf(IntOffset.m2533getXimpl(m363getRawOffsetnOccac) + i).intValue();
                boolean z2 = this.isVertical;
                int m2534getYimpl2 = IntOffset.m2534getYimpl(m363getRawOffsetnOccac);
                if (z2) {
                    m2534getYimpl2 += i;
                }
                animation.m365setRawOffsetgyyYBs(IntOffsetKt.IntOffset(m2533getXimpl2, m2534getYimpl2));
            }
        }
    }

    public final void place(Placeable.PlacementScope placementScope) {
        int m2533getXimpl;
        int m2534getYimpl;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first".toString());
        }
        int placeablesCount = getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            Placeable placeable = this.placeables.get(i);
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i2 = this.maxMainAxisOffset;
            long mo349getOffsetnOccac = mo349getOffsetnOccac();
            LazyLayoutAnimation animation = this.animator.getAnimation(getKey(), i);
            if (animation != null) {
                long m362getPlacementDeltanOccac = animation.m362getPlacementDeltanOccac();
                long IntOffset = IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(mo349getOffsetnOccac) + IntOffset.m2533getXimpl(m362getPlacementDeltanOccac), IntOffset.m2534getYimpl(mo349getOffsetnOccac) + IntOffset.m2534getYimpl(m362getPlacementDeltanOccac));
                if ((m352getMainAxisgyyYBs(mo349getOffsetnOccac) <= mainAxisSize && m352getMainAxisgyyYBs(IntOffset) <= mainAxisSize) || (m352getMainAxisgyyYBs(mo349getOffsetnOccac) >= i2 && m352getMainAxisgyyYBs(IntOffset) >= i2)) {
                    animation.cancelPlacementAnimation();
                }
                mo349getOffsetnOccac = IntOffset;
            }
            if (this.reverseLayout) {
                if (!this.isVertical) {
                    m2533getXimpl = (this.mainAxisLayoutSize - IntOffset.m2533getXimpl(mo349getOffsetnOccac)) - getMainAxisSize(placeable);
                } else {
                    m2533getXimpl = IntOffset.m2533getXimpl(mo349getOffsetnOccac);
                }
                if (this.isVertical) {
                    m2534getYimpl = (this.mainAxisLayoutSize - IntOffset.m2534getYimpl(mo349getOffsetnOccac)) - getMainAxisSize(placeable);
                } else {
                    m2534getYimpl = IntOffset.m2534getYimpl(mo349getOffsetnOccac);
                }
                mo349getOffsetnOccac = IntOffsetKt.IntOffset(m2533getXimpl, m2534getYimpl);
            }
            long j = this.visualOffset;
            long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(mo349getOffsetnOccac) + IntOffset.m2533getXimpl(j), IntOffset.m2534getYimpl(mo349getOffsetnOccac) + IntOffset.m2534getYimpl(j));
            if (this.isVertical) {
                Placeable.PlacementScope.m1830placeWithLayeraW9wM$default(placementScope, placeable, IntOffset2, 0.0f, null, 6, null);
            } else {
                Placeable.PlacementScope.m1829placeRelativeWithLayeraW9wM$default(placementScope, placeable, IntOffset2, 0.0f, null, 6, null);
            }
        }
    }

    /* renamed from: getMainAxis--gyyYBs  reason: not valid java name */
    private final int m352getMainAxisgyyYBs(long j) {
        return this.isVertical ? IntOffset.m2534getYimpl(j) : IntOffset.m2533getXimpl(j);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }
}
