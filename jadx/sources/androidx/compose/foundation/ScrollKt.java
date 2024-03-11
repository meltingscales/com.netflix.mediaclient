package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8737dwr;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import o.dwU;

/* loaded from: classes.dex */
public final class ScrollKt {
    public static final ScrollState rememberScrollState(final int i, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1464256199);
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1464256199, i2, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:73)");
        }
        Object[] objArr = new Object[0];
        Saver<ScrollState, ?> saver = ScrollState.Companion.getSaver();
        composer.startReplaceableGroup(546516376);
        boolean changed = composer.changed(i);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new drO<ScrollState>() { // from class: androidx.compose.foundation.ScrollKt$rememberScrollState$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // o.drO
                public final ScrollState invoke() {
                    return new ScrollState(i);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ScrollState scrollState = (ScrollState) RememberSaveableKt.rememberSaveable(objArr, saver, null, (drO) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return scrollState;
    }

    public static /* synthetic */ Modifier verticalScroll$default(Modifier modifier, ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            flingBehavior = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return verticalScroll(modifier, scrollState, z, flingBehavior, z2);
    }

    public static final Modifier verticalScroll(Modifier modifier, ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z2) {
        return scroll(modifier, scrollState, z2, flingBehavior, z, true);
    }

    private static final Modifier scroll(Modifier modifier, final ScrollState scrollState, final boolean z, final FlingBehavior flingBehavior, final boolean z2, final boolean z3) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.ScrollKt$scroll$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("scroll");
                inspectorInfo.getProperties().set("state", ScrollState.this);
                inspectorInfo.getProperties().set("reverseScrolling", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("flingBehavior", flingBehavior);
                inspectorInfo.getProperties().set("isScrollable", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("isVertical", Boolean.valueOf(z3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC8612dsa<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.startReplaceableGroup(1478351300);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1478351300, i, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:272)");
                }
                ScrollableDefaults scrollableDefaults = ScrollableDefaults.INSTANCE;
                OverscrollEffect overscrollEffect = scrollableDefaults.overscrollEffect(composer, 6);
                composer.startReplaceableGroup(773894976);
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.e, composer));
                    composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    rememberedValue = compositionScopedCoroutineScopeCanceller;
                }
                composer.endReplaceableGroup();
                final dwU coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                composer.endReplaceableGroup();
                Modifier.Companion companion = Modifier.Companion;
                final boolean z4 = z;
                final boolean z5 = z3;
                final boolean z6 = z2;
                final ScrollState scrollState2 = scrollState;
                Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, new drM<SemanticsPropertyReceiver, dpR>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* bridge */ /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return dpR.c;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
                        final ScrollState scrollState3 = scrollState2;
                        drO<Float> dro = new drO<Float>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$accessibilityScrollState$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // o.drO
                            public final Float invoke() {
                                return Float.valueOf(ScrollState.this.getValue());
                            }
                        };
                        final ScrollState scrollState4 = scrollState2;
                        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(dro, new drO<Float>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2
                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // o.drO
                            public final Float invoke() {
                                return Float.valueOf(ScrollState.this.getMaxValue());
                            }
                        }, z4);
                        if (z5) {
                            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
                        } else {
                            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
                        }
                        if (z6) {
                            final dwU dwu = coroutineScope;
                            final boolean z7 = z5;
                            final ScrollState scrollState5 = scrollState2;
                            SemanticsPropertiesKt.scrollBy$default(semanticsPropertyReceiver, null, new drX<Float, Float, Boolean>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // o.drX
                                public /* synthetic */ Boolean invoke(Float f, Float f2) {
                                    return invoke(f.floatValue(), f2.floatValue());
                                }

                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* renamed from: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1  reason: invalid class name and collision with other inner class name */
                                /* loaded from: classes.dex */
                                public static final class C00021 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                                    final /* synthetic */ boolean $isVertical;
                                    final /* synthetic */ ScrollState $state;
                                    final /* synthetic */ float $x;
                                    final /* synthetic */ float $y;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C00021(boolean z, ScrollState scrollState, float f, float f2, InterfaceC8585dra<? super C00021> interfaceC8585dra) {
                                        super(2, interfaceC8585dra);
                                        this.$isVertical = z;
                                        this.$state = scrollState;
                                        this.$y = f;
                                        this.$x = f2;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                                        return new C00021(this.$isVertical, this.$state, this.$y, this.$x, interfaceC8585dra);
                                    }

                                    @Override // o.drX
                                    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                                        return ((C00021) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object e;
                                        e = C8586drb.e();
                                        int i = this.label;
                                        if (i == 0) {
                                            C8556dpz.d(obj);
                                            if (this.$isVertical) {
                                                ScrollState scrollState = this.$state;
                                                C8632dsu.d(scrollState);
                                                float f = this.$y;
                                                this.label = 1;
                                                if (ScrollExtensionsKt.animateScrollBy$default(scrollState, f, null, this, 2, null) == e) {
                                                    return e;
                                                }
                                            } else {
                                                ScrollState scrollState2 = this.$state;
                                                C8632dsu.d(scrollState2);
                                                float f2 = this.$x;
                                                this.label = 2;
                                                if (ScrollExtensionsKt.animateScrollBy$default(scrollState2, f2, null, this, 2, null) == e) {
                                                    return e;
                                                }
                                            }
                                        } else if (i != 1 && i != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        } else {
                                            C8556dpz.d(obj);
                                        }
                                        return dpR.c;
                                    }
                                }

                                public final Boolean invoke(float f, float f2) {
                                    C8737dwr.c(dwU.this, null, null, new C00021(z7, scrollState5, f2, f, null), 3, null);
                                    return Boolean.TRUE;
                                }
                            }, 1, null);
                        }
                    }
                }, 1, null);
                Orientation orientation = z3 ? Orientation.Vertical : Orientation.Horizontal;
                Modifier then = OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(semantics$default, orientation), overscrollEffect).then(ScrollableKt.scrollable$default(companion, scrollState, orientation, overscrollEffect, z2, scrollableDefaults.reverseDirection((LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z), flingBehavior, scrollState.getInternalInteractionSource$foundation_release(), null, 128, null)).then(new ScrollingLayoutElement(scrollState, z, z3));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return then;
            }
        });
    }
}
