package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.jvm.internal.Lambda;
import o.C8626dso;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
final class CrossfadeKt$Crossfade$5$1 extends Lambda implements drX<Composer, Integer, dpR> {
    final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
    final /* synthetic */ InterfaceC8612dsa<T, Composer, Integer, dpR> $content;
    final /* synthetic */ T $stateForContent;
    final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CrossfadeKt$Crossfade$5$1(Transition<T> transition, FiniteAnimationSpec<Float> finiteAnimationSpec, T t, InterfaceC8612dsa<? super T, ? super Composer, ? super Integer, dpR> interfaceC8612dsa) {
        super(2);
        this.$this_Crossfade = transition;
        this.$animationSpec = finiteAnimationSpec;
        this.$stateForContent = t;
        this.$content = interfaceC8612dsa;
    }

    @Override // o.drX
    public /* synthetic */ dpR invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return dpR.c;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1426421288, i, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:128)");
            }
            Transition<T> transition = this.$this_Crossfade;
            final FiniteAnimationSpec<Float> finiteAnimationSpec = this.$animationSpec;
            InterfaceC8612dsa<Transition.Segment<T>, Composer, Integer, FiniteAnimationSpec<Float>> interfaceC8612dsa = new InterfaceC8612dsa<Transition.Segment<T>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // o.InterfaceC8612dsa
                public /* synthetic */ FiniteAnimationSpec<Float> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<T> segment, Composer composer2, int i2) {
                    composer2.startReplaceableGroup(438406499);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(438406499, i2, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
                    }
                    FiniteAnimationSpec<Float> finiteAnimationSpec2 = finiteAnimationSpec;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return finiteAnimationSpec2;
                }
            };
            T t = this.$stateForContent;
            composer.startReplaceableGroup(-1338768149);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(C8626dso.e);
            composer.startReplaceableGroup(-142660079);
            Object currentState = transition.getCurrentState();
            composer.startReplaceableGroup(-438678252);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)");
            }
            float f = C8632dsu.c(currentState, t) ? 1.0f : 0.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            Object targetState = transition.getTargetState();
            composer.startReplaceableGroup(-438678252);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)");
            }
            float f2 = C8632dsu.c(targetState, t) ? 1.0f : 0.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            final State createTransitionAnimation = TransitionKt.createTransitionAnimation(transition, Float.valueOf(f), Float.valueOf(f2), interfaceC8612dsa.invoke(transition.getSegment(), composer, 0), vectorConverter, "FloatAnimation", composer, 0);
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            Modifier.Companion companion = Modifier.Companion;
            composer.startReplaceableGroup(317054099);
            boolean changed = composer.changed(createTransitionAnimation);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new drM<GraphicsLayerScope, dpR>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* bridge */ /* synthetic */ dpR invoke(GraphicsLayerScope graphicsLayerScope) {
                        invoke2(graphicsLayerScope);
                        return dpR.c;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                        float invoke$lambda$1;
                        invoke$lambda$1 = CrossfadeKt$Crossfade$5$1.invoke$lambda$1(createTransitionAnimation);
                        graphicsLayerScope.setAlpha(invoke$lambda$1);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (drM) rememberedValue);
            InterfaceC8612dsa<T, Composer, Integer, dpR> interfaceC8612dsa2 = this.$content;
            T t2 = this.$stateForContent;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            drO<ComposeUiNode> constructor = companion2.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(graphicsLayer);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m1009constructorimpl = Updater.m1009constructorimpl(composer);
            Updater.m1013setimpl(m1009constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            interfaceC8612dsa2.invoke(t2, composer, 0);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }
}
