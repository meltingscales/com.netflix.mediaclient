package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class LazyLayoutMeasureScopeImpl implements LazyLayoutMeasureScope {
    private final LazyLayoutItemContentFactory itemContentFactory;
    private final LazyLayoutItemProvider itemProvider;
    private final HashMap<Integer, List<Placeable>> placeablesCache = new HashMap<>();
    private final SubcomposeMeasureScope subcomposeMeasureScope;

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.subcomposeMeasureScope.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.subcomposeMeasureScope.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.subcomposeMeasureScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.subcomposeMeasureScope.isLookingAhead();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(int i, int i2, Map<AlignmentLine, Integer> map, drM<? super Placeable.PlacementScope, dpR> drm) {
        return this.subcomposeMeasureScope.layout(i, i2, map, drm);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public int mo186roundToPxR2X_6o(long j) {
        return this.subcomposeMeasureScope.mo186roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public int mo187roundToPx0680j_4(float f) {
        return this.subcomposeMeasureScope.mo187roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public float mo192toPxR2X_6o(long j) {
        return this.subcomposeMeasureScope.mo192toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public float mo193toPx0680j_4(float f) {
        return this.subcomposeMeasureScope.mo193toPx0680j_4(f);
    }

    public LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeMeasureScope subcomposeMeasureScope) {
        this.itemContentFactory = lazyLayoutItemContentFactory;
        this.subcomposeMeasureScope = subcomposeMeasureScope;
        this.itemProvider = lazyLayoutItemContentFactory.getItemProvider().invoke();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    /* renamed from: measure-0kLqBqw */
    public List<Placeable> mo376measure0kLqBqw(int i, long j) {
        List<Placeable> list = this.placeablesCache.get(Integer.valueOf(i));
        if (list != null) {
            return list;
        }
        Object key = this.itemProvider.getKey(i);
        List<Measurable> subcompose = this.subcomposeMeasureScope.subcompose(key, this.itemContentFactory.getContent(i, key, this.itemProvider.getContentType(i)));
        int size = subcompose.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(subcompose.get(i2).mo1803measureBRTryo0(j));
        }
        this.placeablesCache.put(Integer.valueOf(i), arrayList);
        return arrayList;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo188toDpGaN1DYA(long j) {
        return this.subcomposeMeasureScope.mo188toDpGaN1DYA(j);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo190toDpu2uoSUM(int i) {
        return this.subcomposeMeasureScope.mo190toDpu2uoSUM(i);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo189toDpu2uoSUM(float f) {
        return this.subcomposeMeasureScope.mo189toDpu2uoSUM(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo196toSpkPz2Gy4(float f) {
        return this.subcomposeMeasureScope.mo196toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo195toSp0xMU5do(float f) {
        return this.subcomposeMeasureScope.mo195toSp0xMU5do(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo194toSizeXkaWNTQ(long j) {
        return this.subcomposeMeasureScope.mo194toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo191toDpSizekrfVVM(long j) {
        return this.subcomposeMeasureScope.mo191toDpSizekrfVVM(j);
    }
}
