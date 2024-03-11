package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8737dwr;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import o.dwU;

/* loaded from: classes.dex */
public final class LazyLayoutSemanticsKt {
    public static final Modifier lazyLayoutSemantics(Modifier modifier, final drO<? extends LazyLayoutItemProvider> dro, final LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z, boolean z2, Composer composer, int i) {
        composer.startReplaceableGroup(1070136913);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1070136913, i, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:46)");
        }
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
        Object[] objArr = {dro, lazyLayoutSemanticState, orientation, Boolean.valueOf(z)};
        composer.startReplaceableGroup(-568225417);
        boolean z3 = false;
        for (int i2 = 0; i2 < 4; i2++) {
            z3 |= composer.changed(objArr[i2]);
        }
        Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == Composer.Companion.getEmpty()) {
            final boolean z4 = orientation == Orientation.Vertical;
            final drM<Object, Integer> drm = new drM<Object, Integer>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // o.drM
                public final Integer invoke(Object obj) {
                    LazyLayoutItemProvider invoke = dro.invoke();
                    int itemCount = invoke.getItemCount();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= itemCount) {
                            i3 = -1;
                            break;
                        } else if (C8632dsu.c(invoke.getKey(i3), obj)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    return Integer.valueOf(i3);
                }
            };
            final ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new drO<Float>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$accessibilityScrollState$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // o.drO
                public final Float invoke() {
                    return Float.valueOf(LazyLayoutSemanticState.this.pseudoScrollOffset());
                }
            }, new drO<Float>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$accessibilityScrollState$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // o.drO
                public final Float invoke() {
                    return Float.valueOf(LazyLayoutSemanticState.this.pseudoMaxScrollOffset());
                }
            }, z2);
            final drX<Float, Float, Boolean> drx = z ? new drX<Float, Float, Boolean>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ Boolean invoke(Float f, Float f2) {
                    return invoke(f.floatValue(), f2.floatValue());
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                    final /* synthetic */ float $delta;
                    final /* synthetic */ LazyLayoutSemanticState $state;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(LazyLayoutSemanticState lazyLayoutSemanticState, float f, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                        super(2, interfaceC8585dra);
                        this.$state = lazyLayoutSemanticState;
                        this.$delta = f;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                        return new AnonymousClass1(this.$state, this.$delta, interfaceC8585dra);
                    }

                    @Override // o.drX
                    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                        return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object e;
                        e = C8586drb.e();
                        int i = this.label;
                        if (i == 0) {
                            C8556dpz.d(obj);
                            LazyLayoutSemanticState lazyLayoutSemanticState = this.$state;
                            float f = this.$delta;
                            this.label = 1;
                            if (lazyLayoutSemanticState.animateScrollBy(f, this) == e) {
                                return e;
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            C8556dpz.d(obj);
                        }
                        return dpR.c;
                    }
                }

                public final Boolean invoke(float f, float f2) {
                    if (z4) {
                        f = f2;
                    }
                    C8737dwr.c(coroutineScope, null, null, new AnonymousClass1(lazyLayoutSemanticState, f, null), 3, null);
                    return Boolean.TRUE;
                }
            } : null;
            final drM<Integer, Boolean> drm2 = z ? new drM<Integer, Boolean>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ Boolean invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Boolean invoke(int i3) {
                    LazyLayoutItemProvider invoke = dro.invoke();
                    if (i3 >= 0 && i3 < invoke.getItemCount()) {
                        C8737dwr.c(coroutineScope, null, null, new AnonymousClass2(lazyLayoutSemanticState, i3, null), 3, null);
                        return Boolean.TRUE;
                    }
                    throw new IllegalArgumentException(("Can't scroll to index " + i3 + ", it is out of bounds [0, " + invoke.getItemCount() + ')').toString());
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                    final /* synthetic */ int $index;
                    final /* synthetic */ LazyLayoutSemanticState $state;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(LazyLayoutSemanticState lazyLayoutSemanticState, int i, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
                        super(2, interfaceC8585dra);
                        this.$state = lazyLayoutSemanticState;
                        this.$index = i;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                        return new AnonymousClass2(this.$state, this.$index, interfaceC8585dra);
                    }

                    @Override // o.drX
                    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                        return ((AnonymousClass2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object e;
                        e = C8586drb.e();
                        int i = this.label;
                        if (i == 0) {
                            C8556dpz.d(obj);
                            LazyLayoutSemanticState lazyLayoutSemanticState = this.$state;
                            int i2 = this.$index;
                            this.label = 1;
                            if (lazyLayoutSemanticState.scrollToItem(i2, this) == e) {
                                return e;
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            C8556dpz.d(obj);
                        }
                        return dpR.c;
                    }
                }
            } : null;
            final CollectionInfo collectionInfo = lazyLayoutSemanticState.collectionInfo();
            rememberedValue2 = SemanticsModifierKt.semantics$default(Modifier.Companion, false, new drM<SemanticsPropertyReceiver, dpR>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    SemanticsPropertiesKt.indexForKey(semanticsPropertyReceiver, drm);
                    if (z4) {
                        SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
                    } else {
                        SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
                    }
                    drX<Float, Float, Boolean> drx2 = drx;
                    if (drx2 != null) {
                        SemanticsPropertiesKt.scrollBy$default(semanticsPropertyReceiver, null, drx2, 1, null);
                    }
                    drM<Integer, Boolean> drm3 = drm2;
                    if (drm3 != null) {
                        SemanticsPropertiesKt.scrollToIndex$default(semanticsPropertyReceiver, null, drm3, 1, null);
                    }
                    SemanticsPropertiesKt.setCollectionInfo(semanticsPropertyReceiver, collectionInfo);
                }
            }, 1, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier then = modifier.then((Modifier) rememberedValue2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }
}
