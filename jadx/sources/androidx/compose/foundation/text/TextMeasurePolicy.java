package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import o.dpR;
import o.drM;
import o.drO;
import o.dsT;

/* loaded from: classes.dex */
final class TextMeasurePolicy implements MeasurePolicy {
    private final drO<List<Rect>> placements;

    /* JADX WARN: Multi-variable type inference failed */
    public TextMeasurePolicy(drO<? extends List<Rect>> dro) {
        this.placements = dro;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo9measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Pair pair;
        int e;
        int e2;
        List<Rect> invoke = this.placements.invoke();
        final ArrayList arrayList = null;
        if (invoke != null) {
            ArrayList arrayList2 = new ArrayList(invoke.size());
            int size = invoke.size();
            for (int i = 0; i < size; i++) {
                Rect rect = invoke.get(i);
                if (rect != null) {
                    Placeable mo1803measureBRTryo0 = list.get(i).mo1803measureBRTryo0(ConstraintsKt.Constraints$default(0, (int) Math.floor(rect.getWidth()), 0, (int) Math.floor(rect.getHeight()), 5, null));
                    e = dsT.e(rect.getLeft());
                    e2 = dsT.e(rect.getTop());
                    pair = new Pair(mo1803measureBRTryo0, IntOffset.m2525boximpl(IntOffsetKt.IntOffset(e, e2)));
                } else {
                    pair = null;
                }
                if (pair != null) {
                    arrayList2.add(pair);
                }
            }
            arrayList = arrayList2;
        }
        return MeasureScope.layout$default(measureScope, Constraints.m2473getMaxWidthimpl(j), Constraints.m2472getMaxHeightimpl(j), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.text.TextMeasurePolicy$measure$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                List<Pair<Placeable, IntOffset>> list2 = arrayList;
                if (list2 != null) {
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Pair<Placeable, IntOffset> pair2 = list2.get(i2);
                        Placeable.PlacementScope.m1827place70tqf50$default(placementScope, pair2.b(), pair2.c().m2537unboximpl(), 0.0f, 2, null);
                    }
                }
            }
        }, 4, null);
    }
}
