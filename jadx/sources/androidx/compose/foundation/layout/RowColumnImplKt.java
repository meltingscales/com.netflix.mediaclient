package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import java.util.List;
import o.InterfaceC8612dsa;
import o.drX;
import o.dsT;

/* loaded from: classes.dex */
public final class RowColumnImplKt {
    public static final /* synthetic */ int access$intrinsicSize(List list, drX drx, drX drx2, int i, int i2, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        return intrinsicSize(list, drx, drx2, i, i2, layoutOrientation, layoutOrientation2);
    }

    public static final RowColumnParentData getRowColumnParentData(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof RowColumnParentData) {
            return (RowColumnParentData) parentData;
        }
        return null;
    }

    public static final float getWeight(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getWeight();
        }
        return 0.0f;
    }

    public static final boolean getFill(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getFill();
        }
        return true;
    }

    public static final CrossAxisAlignment getCrossAxisAlignment(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getCrossAxisAlignment();
        }
        return null;
    }

    public static final boolean isRelative(RowColumnParentData rowColumnParentData) {
        CrossAxisAlignment crossAxisAlignment = getCrossAxisAlignment(rowColumnParentData);
        if (crossAxisAlignment != null) {
            return crossAxisAlignment.isRelative$foundation_layout_release();
        }
        return false;
    }

    public static final InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MinIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinWidth();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMinWidth();
    }

    public static final InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MinIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinHeight();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMinHeight();
    }

    public static final InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MaxIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxWidth();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxWidth();
    }

    public static final InterfaceC8612dsa<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MaxIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxHeight();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxHeight();
    }

    public static final int intrinsicSize(List<? extends IntrinsicMeasurable> list, drX<? super IntrinsicMeasurable, ? super Integer, Integer> drx, drX<? super IntrinsicMeasurable, ? super Integer, Integer> drx2, int i, int i2, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        if (layoutOrientation == layoutOrientation2) {
            return intrinsicMainAxisSize(list, drx, i, i2);
        }
        return intrinsicCrossAxisSize(list, drx2, drx, i, i2);
    }

    private static final int intrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, drX<? super IntrinsicMeasurable, ? super Integer, Integer> drx, int i, int i2) {
        int e;
        int e2;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i5);
            float weight = getWeight(getRowColumnParentData(intrinsicMeasurable));
            int intValue = drx.invoke(intrinsicMeasurable, Integer.valueOf(i)).intValue();
            if (weight == 0.0f) {
                i4 += intValue;
            } else if (weight > 0.0f) {
                f += weight;
                e2 = dsT.e(intValue / weight);
                i3 = Math.max(i3, e2);
            }
        }
        e = dsT.e(i3 * f);
        return e + i4 + ((list.size() - 1) * i2);
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, drX<? super IntrinsicMeasurable, ? super Integer, Integer> drx, drX<? super IntrinsicMeasurable, ? super Integer, Integer> drx2, int i, int i2) {
        int e;
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i4);
            float weight = getWeight(getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int min2 = Math.min(drx.invoke(intrinsicMeasurable, Integer.MAX_VALUE).intValue(), i - min);
                min += min2;
                i3 = Math.max(i3, drx2.invoke(intrinsicMeasurable, Integer.valueOf(min2)).intValue());
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        if (f == 0.0f) {
            e = 0;
        } else {
            e = i == Integer.MAX_VALUE ? Integer.MAX_VALUE : dsT.e(Math.max(i - min, 0) / f);
        }
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i5);
            float weight2 = getWeight(getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                i3 = Math.max(i3, drx2.invoke(intrinsicMeasurable2, Integer.valueOf(e != Integer.MAX_VALUE ? dsT.e(e * weight2) : Integer.MAX_VALUE)).intValue());
            }
        }
        return i3;
    }
}
