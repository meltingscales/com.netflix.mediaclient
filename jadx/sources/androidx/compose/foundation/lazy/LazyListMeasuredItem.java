package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimationKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import o.C8627dsp;
import o.C8657dts;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class LazyListMeasuredItem implements LazyListItemInfo {
    private final int afterContentPadding;
    private final LazyListItemAnimator animator;
    private final int beforeContentPadding;
    private final Object contentType;
    private final int crossAxisSize;
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private int offset;
    private final int[] placeableOffsets;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;
    private final int sizeWithSpacings;
    private final int spacing;
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    public /* synthetic */ LazyListMeasuredItem(int i, List list, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, LazyListItemAnimator lazyListItemAnimator, C8627dsp c8627dsp) {
        this(i, list, z, horizontal, vertical, layoutDirection, z2, i2, i3, i4, j, obj, obj2, lazyListItemAnimator);
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getIndex() {
        return this.index;
    }

    public Object getKey() {
        return this.key;
    }

    public final boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getSize() {
        return this.size;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public final void setNonScrollableItem(boolean z) {
        this.nonScrollableItem = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyListMeasuredItem(int i, List<? extends Placeable> list, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, LazyListItemAnimator lazyListItemAnimator) {
        int b;
        this.index = i;
        this.placeables = list;
        this.isVertical = z;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z2;
        this.beforeContentPadding = i2;
        this.afterContentPadding = i3;
        this.spacing = i4;
        this.visualOffset = j;
        this.key = obj;
        this.contentType = obj2;
        this.animator = lazyListItemAnimator;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Placeable placeable = (Placeable) list.get(i7);
            i5 += this.isVertical ? placeable.getHeight() : placeable.getWidth();
            i6 = Math.max(i6, !this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.size = i5;
        b = C8657dts.b(getSize() + this.spacing, 0);
        this.sizeWithSpacings = b;
        this.crossAxisSize = i6;
        this.placeableOffsets = new int[this.placeables.size() * 2];
    }

    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    public final Object getParentData(int i) {
        return this.placeables.get(i).getParentData();
    }

    /* renamed from: getOffset-Bjo55l4  reason: not valid java name */
    public final long m335getOffsetBjo55l4(int i) {
        int[] iArr = this.placeableOffsets;
        int i2 = i * 2;
        return IntOffsetKt.IntOffset(iArr[i2], iArr[i2 + 1]);
    }

    public final void applyScrollDelta(int i, boolean z) {
        if (this.nonScrollableItem) {
            return;
        }
        this.offset = getOffset() + i;
        int length = this.placeableOffsets.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z2 = this.isVertical;
            if ((z2 && i2 % 2 == 1) || (!z2 && i2 % 2 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i2] = iArr[i2] + i;
            }
        }
        if (z) {
            int placeablesCount = getPlaceablesCount();
            for (int i3 = 0; i3 < placeablesCount; i3++) {
                LazyLayoutAnimation animation = this.animator.getAnimation(getKey(), i3);
                if (animation != null) {
                    long m363getRawOffsetnOccac = animation.m363getRawOffsetnOccac();
                    int m2533getXimpl = this.isVertical ? IntOffset.m2533getXimpl(m363getRawOffsetnOccac) : Integer.valueOf(IntOffset.m2533getXimpl(m363getRawOffsetnOccac) + i).intValue();
                    boolean z3 = this.isVertical;
                    int m2534getYimpl = IntOffset.m2534getYimpl(m363getRawOffsetnOccac);
                    if (z3) {
                        m2534getYimpl += i;
                    }
                    animation.m365setRawOffsetgyyYBs(IntOffsetKt.IntOffset(m2533getXimpl, m2534getYimpl));
                }
            }
        }
    }

    public final void place(Placeable.PlacementScope placementScope, boolean z) {
        drM<GraphicsLayerScope, dpR> defaultLayerBlock;
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
            long m335getOffsetBjo55l4 = m335getOffsetBjo55l4(i);
            LazyLayoutAnimation animation = this.animator.getAnimation(getKey(), i);
            if (animation != null) {
                if (z) {
                    animation.m364setLookaheadOffsetgyyYBs(m335getOffsetBjo55l4);
                } else {
                    if (!IntOffset.m2532equalsimpl0(animation.m361getLookaheadOffsetnOccac(), LazyLayoutAnimation.Companion.m366getNotInitializednOccac())) {
                        m335getOffsetBjo55l4 = animation.m361getLookaheadOffsetnOccac();
                    }
                    long m362getPlacementDeltanOccac = animation.m362getPlacementDeltanOccac();
                    long IntOffset = IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(m335getOffsetBjo55l4) + IntOffset.m2533getXimpl(m362getPlacementDeltanOccac), IntOffset.m2534getYimpl(m335getOffsetBjo55l4) + IntOffset.m2534getYimpl(m362getPlacementDeltanOccac));
                    if ((m334getMainAxisgyyYBs(m335getOffsetBjo55l4) <= mainAxisSize && m334getMainAxisgyyYBs(IntOffset) <= mainAxisSize) || (m334getMainAxisgyyYBs(m335getOffsetBjo55l4) >= i2 && m334getMainAxisgyyYBs(IntOffset) >= i2)) {
                        animation.cancelPlacementAnimation();
                    }
                    m335getOffsetBjo55l4 = IntOffset;
                }
                defaultLayerBlock = animation.getLayerBlock();
            } else {
                defaultLayerBlock = LazyLayoutAnimationKt.getDefaultLayerBlock();
            }
            drM<GraphicsLayerScope, dpR> drm = defaultLayerBlock;
            if (this.reverseLayout) {
                if (!this.isVertical) {
                    m2533getXimpl = (this.mainAxisLayoutSize - IntOffset.m2533getXimpl(m335getOffsetBjo55l4)) - getMainAxisSize(placeable);
                } else {
                    m2533getXimpl = IntOffset.m2533getXimpl(m335getOffsetBjo55l4);
                }
                if (this.isVertical) {
                    m2534getYimpl = (this.mainAxisLayoutSize - IntOffset.m2534getYimpl(m335getOffsetBjo55l4)) - getMainAxisSize(placeable);
                } else {
                    m2534getYimpl = IntOffset.m2534getYimpl(m335getOffsetBjo55l4);
                }
                m335getOffsetBjo55l4 = IntOffsetKt.IntOffset(m2533getXimpl, m2534getYimpl);
            }
            long j = this.visualOffset;
            long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(m335getOffsetBjo55l4) + IntOffset.m2533getXimpl(j), IntOffset.m2534getYimpl(m335getOffsetBjo55l4) + IntOffset.m2534getYimpl(j));
            if (this.isVertical) {
                Placeable.PlacementScope.m1830placeWithLayeraW9wM$default(placementScope, placeable, IntOffset2, 0.0f, drm, 2, null);
            } else {
                Placeable.PlacementScope.m1829placeRelativeWithLayeraW9wM$default(placementScope, placeable, IntOffset2, 0.0f, drm, 2, null);
            }
        }
    }

    /* renamed from: getMainAxis--gyyYBs  reason: not valid java name */
    private final int m334getMainAxisgyyYBs(long j) {
        return this.isVertical ? IntOffset.m2534getYimpl(j) : IntOffset.m2533getXimpl(j);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    public final void position(int i, int i2, int i3) {
        int width;
        this.offset = i;
        this.mainAxisLayoutSize = this.isVertical ? i3 : i2;
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Placeable placeable = list.get(i4);
            int i5 = i4 * 2;
            if (this.isVertical) {
                int[] iArr = this.placeableOffsets;
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true".toString());
                }
                iArr[i5] = horizontal.align(placeable.getWidth(), i2, this.layoutDirection);
                this.placeableOffsets[i5 + 1] = i;
                width = placeable.getHeight();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i5] = i;
                Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical == null) {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false".toString());
                }
                iArr2[i5 + 1] = vertical.align(placeable.getHeight(), i3);
                width = placeable.getWidth();
            }
            i += width;
        }
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }
}
