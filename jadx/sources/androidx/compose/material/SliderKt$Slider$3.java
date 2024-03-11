package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableKt$draggable$1;
import androidx.compose.foundation.gestures.DraggableKt$draggable$2;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8657dts;
import o.C8658dtt;
import o.C8737dwr;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.InterfaceC8650dtl;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$Slider$3 extends Lambda implements InterfaceC8612dsa<BoxWithConstraintsScope, Composer, Integer, dpR> {
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ drO<dpR> $onValueChangeFinished;
    final /* synthetic */ State<drM<Float, dpR>> $onValueChangeState;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ float $value;
    final /* synthetic */ InterfaceC8650dtl<Float> $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$Slider$3(InterfaceC8650dtl<Float> interfaceC8650dtl, float f, MutableInteractionSource mutableInteractionSource, boolean z, List<Float> list, SliderColors sliderColors, State<? extends drM<? super Float, dpR>> state, drO<dpR> dro) {
        super(3);
        this.$valueRange = interfaceC8650dtl;
        this.$value = f;
        this.$interactionSource = mutableInteractionSource;
        this.$enabled = z;
        this.$tickFractions = list;
        this.$colors = sliderColors;
        this.$onValueChangeState = state;
        this.$onValueChangeFinished = dro;
    }

    @Override // o.InterfaceC8612dsa
    public /* synthetic */ dpR invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return dpR.c;
    }

    public final void invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i) {
        int i2;
        InterfaceC8650dtl e;
        Modifier sliderTapModifier;
        Modifier draggable;
        float a;
        float calcFraction;
        if ((i & 14) == 0) {
            i2 = i | (composer.changed(boxWithConstraintsScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2085116814, i2, -1, "androidx.compose.material.Slider.<anonymous> (Slider.kt:179)");
            }
            boolean z = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            float m2473getMaxWidthimpl = Constraints.m2473getMaxWidthimpl(boxWithConstraintsScope.mo244getConstraintsmsEJaDk());
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            floatRef.d = Math.max(m2473getMaxWidthimpl - density.mo193toPx0680j_4(SliderKt.getThumbRadius()), 0.0f);
            floatRef2.d = Math.min(density.mo193toPx0680j_4(SliderKt.getThumbRadius()), floatRef.d);
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.e, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            final dwU coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            float f = this.$value;
            InterfaceC8650dtl<Float> interfaceC8650dtl = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(interfaceC8650dtl, floatRef2, floatRef, f));
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            final MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue2;
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            final MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue3;
            float f2 = floatRef2.d;
            float f3 = floatRef.d;
            final InterfaceC8650dtl<Float> interfaceC8650dtl2 = this.$valueRange;
            final State<drM<Float, dpR>> state = this.$onValueChangeState;
            composer.startReplaceableGroup(1618982084);
            boolean changed = composer.changed(Float.valueOf(f2));
            boolean changed2 = composer.changed(Float.valueOf(f3));
            boolean changed3 = composer.changed(interfaceC8650dtl2);
            Object rememberedValue4 = composer.rememberedValue();
            if ((changed | changed2 | changed3) || rememberedValue4 == companion.getEmpty()) {
                Object sliderDraggableState = new SliderDraggableState(new drM<Float, dpR>() { // from class: androidx.compose.material.SliderKt$Slider$3$draggableState$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Float f4) {
                        invoke(f4.floatValue());
                        return dpR.c;
                    }

                    public final void invoke(float f4) {
                        float a2;
                        float invoke$scaleToUserValue;
                        MutableFloatState mutableFloatState3 = MutableFloatState.this;
                        mutableFloatState3.setFloatValue(mutableFloatState3.getFloatValue() + f4 + mutableFloatState2.getFloatValue());
                        mutableFloatState2.setFloatValue(0.0f);
                        a2 = C8657dts.a(MutableFloatState.this.getFloatValue(), floatRef2.d, floatRef.d);
                        invoke$scaleToUserValue = SliderKt$Slider$3.invoke$scaleToUserValue(floatRef2, floatRef, interfaceC8650dtl2, a2);
                        state.getValue().invoke(Float.valueOf(invoke$scaleToUserValue));
                    }
                });
                composer.updateRememberedValue(sliderDraggableState);
                rememberedValue4 = sliderDraggableState;
            }
            composer.endReplaceableGroup();
            final SliderDraggableState sliderDraggableState2 = (SliderDraggableState) rememberedValue4;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$valueRange, floatRef2, floatRef);
            InterfaceC8650dtl<Float> interfaceC8650dtl3 = this.$valueRange;
            e = C8658dtt.e(floatRef2.d, floatRef.d);
            SliderKt.CorrectValueSideEffect(anonymousClass2, interfaceC8650dtl3, e, mutableFloatState, this.$value, composer, 3072);
            final List<Float> list = this.$tickFractions;
            final drO<dpR> dro = this.$onValueChangeFinished;
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new drM<Float, dpR>() { // from class: androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Float f4) {
                    invoke(f4.floatValue());
                    return dpR.c;
                }

                public final void invoke(float f4) {
                    float snapValueToTick;
                    drO<dpR> dro2;
                    float floatValue = MutableFloatState.this.getFloatValue();
                    snapValueToTick = SliderKt.snapValueToTick(floatValue, list, floatRef2.d, floatRef.d);
                    if (floatValue != snapValueToTick) {
                        C8737dwr.c(coroutineScope, null, null, new AnonymousClass1(sliderDraggableState2, floatValue, snapValueToTick, f4, dro, null), 3, null);
                    } else if (sliderDraggableState2.isDragging() || (dro2 = dro) == null) {
                    } else {
                        dro2.invoke();
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                    final /* synthetic */ float $current;
                    final /* synthetic */ SliderDraggableState $draggableState;
                    final /* synthetic */ drO<dpR> $onValueChangeFinished;
                    final /* synthetic */ float $target;
                    final /* synthetic */ float $velocity;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(SliderDraggableState sliderDraggableState, float f, float f2, float f3, drO<dpR> dro, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                        super(2, interfaceC8585dra);
                        this.$draggableState = sliderDraggableState;
                        this.$current = f;
                        this.$target = f2;
                        this.$velocity = f3;
                        this.$onValueChangeFinished = dro;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                        return new AnonymousClass1(this.$draggableState, this.$current, this.$target, this.$velocity, this.$onValueChangeFinished, interfaceC8585dra);
                    }

                    @Override // o.drX
                    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                        return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object e;
                        Object animateToTarget;
                        e = C8586drb.e();
                        int i = this.label;
                        if (i == 0) {
                            C8556dpz.d(obj);
                            SliderDraggableState sliderDraggableState = this.$draggableState;
                            float f = this.$current;
                            float f2 = this.$target;
                            float f3 = this.$velocity;
                            this.label = 1;
                            animateToTarget = SliderKt.animateToTarget(sliderDraggableState, f, f2, f3, this);
                            if (animateToTarget == e) {
                                return e;
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            C8556dpz.d(obj);
                        }
                        drO<dpR> dro = this.$onValueChangeFinished;
                        if (dro != null) {
                            dro.invoke();
                        }
                        return dpR.c;
                    }
                }
            }, composer, 0);
            Modifier.Companion companion2 = Modifier.Companion;
            sliderTapModifier = SliderKt.sliderTapModifier(companion2, sliderDraggableState2, this.$interactionSource, m2473getMaxWidthimpl, z, mutableFloatState, rememberUpdatedState, mutableFloatState2, this.$enabled);
            Orientation orientation = Orientation.Horizontal;
            boolean isDragging = sliderDraggableState2.isDragging();
            boolean z2 = this.$enabled;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            composer.startReplaceableGroup(1457364243);
            boolean changed4 = composer.changed(rememberUpdatedState);
            Object rememberedValue5 = composer.rememberedValue();
            if (changed4 || rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new SliderKt$Slider$3$drag$1$1(rememberUpdatedState, null);
                composer.updateRememberedValue(rememberedValue5);
            }
            composer.endReplaceableGroup();
            draggable = DraggableKt.draggable(companion2, sliderDraggableState2, orientation, (r20 & 4) != 0 ? true : z2, (r20 & 8) != 0 ? null : mutableInteractionSource, (r20 & 16) != 0 ? false : isDragging, (r20 & 32) != 0 ? new DraggableKt$draggable$1(null) : null, (r20 & 64) != 0 ? new DraggableKt$draggable$2(null) : (InterfaceC8612dsa) rememberedValue5, (r20 & 128) != 0 ? false : z);
            a = C8657dts.a(this.$value, this.$valueRange.h().floatValue(), this.$valueRange.g().floatValue());
            calcFraction = SliderKt.calcFraction(this.$valueRange.h().floatValue(), this.$valueRange.g().floatValue(), a);
            SliderKt.SliderImpl(this.$enabled, calcFraction, this.$tickFractions, this.$colors, floatRef.d - floatRef2.d, this.$interactionSource, sliderTapModifier.then(draggable), composer, 512);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToUserValue(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, InterfaceC8650dtl<Float> interfaceC8650dtl, float f) {
        float scale;
        scale = SliderKt.scale(floatRef.d, floatRef2.d, f, interfaceC8650dtl.h().floatValue(), interfaceC8650dtl.g().floatValue());
        return scale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToOffset(InterfaceC8650dtl<Float> interfaceC8650dtl, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f) {
        float scale;
        scale = SliderKt.scale(interfaceC8650dtl.h().floatValue(), interfaceC8650dtl.g().floatValue(), f, floatRef.d, floatRef2.d);
        return scale;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.SliderKt$Slider$3$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements drM<Float, Float> {
        final /* synthetic */ Ref.FloatRef $maxPx;
        final /* synthetic */ Ref.FloatRef $minPx;
        final /* synthetic */ InterfaceC8650dtl<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(InterfaceC8650dtl<Float> interfaceC8650dtl, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
            super(1, C8632dsu.b.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
            this.$valueRange = interfaceC8650dtl;
            this.$minPx = floatRef;
            this.$maxPx = floatRef2;
        }

        public final Float invoke(float f) {
            return Float.valueOf(SliderKt$Slider$3.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f));
        }

        @Override // o.drM
        public /* synthetic */ Float invoke(Float f) {
            return invoke(f.floatValue());
        }
    }
}
