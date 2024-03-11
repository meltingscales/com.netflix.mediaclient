package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class RootMeasurePolicy extends LayoutNode.NoIntrinsicsMeasurePolicy {
    public static final RootMeasurePolicy INSTANCE = new RootMeasurePolicy();

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo9measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        if (list.isEmpty()) {
            return MeasureScope.layout$default(measureScope, Constraints.m2475getMinWidthimpl(j), Constraints.m2474getMinHeightimpl(j), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$1
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return dpR.c;
                }
            }, 4, null);
        }
        if (list.size() == 1) {
            final Placeable mo1803measureBRTryo0 = list.get(0).mo1803measureBRTryo0(j);
            return MeasureScope.layout$default(measureScope, ConstraintsKt.m2486constrainWidthK40F9xA(j, mo1803measureBRTryo0.getWidth()), ConstraintsKt.m2485constrainHeightK40F9xA(j, mo1803measureBRTryo0.getHeight()), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$2
                /* JADX INFO: Access modifiers changed from: package-private */
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
                    Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, Placeable.this, 0, 0, 0.0f, null, 12, null);
                }
            }, 4, null);
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i).mo1803measureBRTryo0(j));
        }
        int size2 = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            Placeable placeable = (Placeable) arrayList.get(i4);
            i2 = Math.max(placeable.getWidth(), i2);
            i3 = Math.max(placeable.getHeight(), i3);
        }
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m2486constrainWidthK40F9xA(j, i2), ConstraintsKt.m2485constrainHeightK40F9xA(j, i3), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$4
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
                List<Placeable> list2 = arrayList;
                int size3 = list2.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, list2.get(i5), 0, 0, 0.0f, null, 12, null);
                }
            }
        }, 4, null);
    }
}
