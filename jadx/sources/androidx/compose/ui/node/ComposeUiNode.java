package androidx.compose.ui.node;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import o.dpR;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public interface ComposeUiNode {
    public static final Companion Companion = Companion.$$INSTANCE;

    void setCompositeKeyHash(int i);

    void setCompositionLocalMap(CompositionLocalMap compositionLocalMap);

    void setDensity(Density density);

    void setLayoutDirection(LayoutDirection layoutDirection);

    void setMeasurePolicy(MeasurePolicy measurePolicy);

    void setModifier(Modifier modifier);

    void setViewConfiguration(ViewConfiguration viewConfiguration);

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final drO<ComposeUiNode> Constructor = LayoutNode.Companion.getConstructor$ui_release();
        private static final drO<ComposeUiNode> VirtualConstructor = new drO<LayoutNode>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$VirtualConstructor$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final LayoutNode invoke() {
                return new LayoutNode(true, 0, 2, null);
            }
        };
        private static final drX<ComposeUiNode, Modifier, dpR> SetModifier = new drX<ComposeUiNode, Modifier, dpR>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1
            @Override // o.drX
            public /* bridge */ /* synthetic */ dpR invoke(ComposeUiNode composeUiNode, Modifier modifier) {
                invoke2(composeUiNode, modifier);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ComposeUiNode composeUiNode, Modifier modifier) {
                composeUiNode.setModifier(modifier);
            }
        };
        private static final drX<ComposeUiNode, Density, dpR> SetDensity = new drX<ComposeUiNode, Density, dpR>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetDensity$1
            @Override // o.drX
            public /* bridge */ /* synthetic */ dpR invoke(ComposeUiNode composeUiNode, Density density) {
                invoke2(composeUiNode, density);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ComposeUiNode composeUiNode, Density density) {
                composeUiNode.setDensity(density);
            }
        };
        private static final drX<ComposeUiNode, CompositionLocalMap, dpR> SetResolvedCompositionLocals = new drX<ComposeUiNode, CompositionLocalMap, dpR>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetResolvedCompositionLocals$1
            @Override // o.drX
            public /* bridge */ /* synthetic */ dpR invoke(ComposeUiNode composeUiNode, CompositionLocalMap compositionLocalMap) {
                invoke2(composeUiNode, compositionLocalMap);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ComposeUiNode composeUiNode, CompositionLocalMap compositionLocalMap) {
                composeUiNode.setCompositionLocalMap(compositionLocalMap);
            }
        };
        private static final drX<ComposeUiNode, MeasurePolicy, dpR> SetMeasurePolicy = new drX<ComposeUiNode, MeasurePolicy, dpR>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetMeasurePolicy$1
            @Override // o.drX
            public /* bridge */ /* synthetic */ dpR invoke(ComposeUiNode composeUiNode, MeasurePolicy measurePolicy) {
                invoke2(composeUiNode, measurePolicy);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ComposeUiNode composeUiNode, MeasurePolicy measurePolicy) {
                composeUiNode.setMeasurePolicy(measurePolicy);
            }
        };
        private static final drX<ComposeUiNode, LayoutDirection, dpR> SetLayoutDirection = new drX<ComposeUiNode, LayoutDirection, dpR>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetLayoutDirection$1
            @Override // o.drX
            public /* bridge */ /* synthetic */ dpR invoke(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
                invoke2(composeUiNode, layoutDirection);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
                composeUiNode.setLayoutDirection(layoutDirection);
            }
        };
        private static final drX<ComposeUiNode, ViewConfiguration, dpR> SetViewConfiguration = new drX<ComposeUiNode, ViewConfiguration, dpR>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetViewConfiguration$1
            @Override // o.drX
            public /* bridge */ /* synthetic */ dpR invoke(ComposeUiNode composeUiNode, ViewConfiguration viewConfiguration) {
                invoke2(composeUiNode, viewConfiguration);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ComposeUiNode composeUiNode, ViewConfiguration viewConfiguration) {
                composeUiNode.setViewConfiguration(viewConfiguration);
            }
        };
        private static final drX<ComposeUiNode, Integer, dpR> SetCompositeKeyHash = new drX<ComposeUiNode, Integer, dpR>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetCompositeKeyHash$1
            @Override // o.drX
            public /* synthetic */ dpR invoke(ComposeUiNode composeUiNode, Integer num) {
                invoke(composeUiNode, num.intValue());
                return dpR.c;
            }

            public final void invoke(ComposeUiNode composeUiNode, int i) {
                composeUiNode.setCompositeKeyHash(i);
            }
        };

        public final drO<ComposeUiNode> getConstructor() {
            return Constructor;
        }

        public final drX<ComposeUiNode, Integer, dpR> getSetCompositeKeyHash() {
            return SetCompositeKeyHash;
        }

        public final drX<ComposeUiNode, Density, dpR> getSetDensity() {
            return SetDensity;
        }

        public final drX<ComposeUiNode, LayoutDirection, dpR> getSetLayoutDirection() {
            return SetLayoutDirection;
        }

        public final drX<ComposeUiNode, MeasurePolicy, dpR> getSetMeasurePolicy() {
            return SetMeasurePolicy;
        }

        public final drX<ComposeUiNode, Modifier, dpR> getSetModifier() {
            return SetModifier;
        }

        public final drX<ComposeUiNode, CompositionLocalMap, dpR> getSetResolvedCompositionLocals() {
            return SetResolvedCompositionLocals;
        }

        public final drX<ComposeUiNode, ViewConfiguration, dpR> getSetViewConfiguration() {
            return SetViewConfiguration;
        }

        private Companion() {
        }
    }
}
