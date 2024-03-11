package androidx.compose.foundation.text;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.C8657dts;
import o.C8738dws;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes.dex */
public final class TextFieldCursorKt {
    private static final AnimationSpec<Float> cursorAnimationSpec = AnimationSpecKt.m55infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new drM<KeyframesSpec.KeyframesSpecConfig<Float>, dpR>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursorAnimationSpec$1
        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            invoke2(keyframesSpecConfig);
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            keyframesSpecConfig.setDurationMillis(1000);
            Float valueOf = Float.valueOf(1.0f);
            keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig<Float>) valueOf, 0);
            keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig<Float>) valueOf, 499);
            Float valueOf2 = Float.valueOf(0.0f);
            keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig<Float>) valueOf2, 500);
            keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig<Float>) valueOf2, 999);
        }
    }), null, 0, 6, null);
    private static final float DefaultCursorThickness = Dp.m2492constructorimpl(2);

    public static final float getDefaultCursorThickness() {
        return DefaultCursorThickness;
    }

    public static final Modifier cursor(Modifier modifier, final TextFieldState textFieldState, final TextFieldValue textFieldValue, final OffsetMapping offsetMapping, final Brush brush, boolean z) {
        return z ? ComposedModifierKt.composed$default(modifier, null, new InterfaceC8612dsa<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1
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
                Modifier modifier3;
                composer.startReplaceableGroup(1634330012);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1634330012, i, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)");
                }
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                final Animatable animatable = (Animatable) rememberedValue;
                Brush brush2 = Brush.this;
                boolean z2 = ((brush2 instanceof SolidColor) && ((SolidColor) brush2).m1441getValue0d7_KjU() == Color.Companion.m1309getUnspecified0d7_KjU()) ? false : true;
                if (textFieldState.getHasFocus() && TextRange.m2151getCollapsedimpl(textFieldValue.m2302getSelectiond9O1mEE()) && z2) {
                    EffectsKt.LaunchedEffect(textFieldValue.getAnnotatedString(), TextRange.m2145boximpl(textFieldValue.m2302getSelectiond9O1mEE()), new AnonymousClass1(animatable, null), composer, 512);
                    final OffsetMapping offsetMapping2 = offsetMapping;
                    final TextFieldValue textFieldValue2 = textFieldValue;
                    final TextFieldState textFieldState2 = textFieldState;
                    final Brush brush3 = Brush.this;
                    modifier3 = DrawModifierKt.drawWithContent(modifier2, new drM<ContentDrawScope, dpR>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* bridge */ /* synthetic */ dpR invoke(ContentDrawScope contentDrawScope) {
                            invoke2(contentDrawScope);
                            return dpR.c;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(ContentDrawScope contentDrawScope) {
                            float a;
                            Rect rect;
                            float h;
                            float c;
                            TextLayoutResult value;
                            contentDrawScope.drawContent();
                            a = C8657dts.a(animatable.getValue().floatValue(), 0.0f, 1.0f);
                            if (a == 0.0f) {
                                return;
                            }
                            int originalToTransformed = offsetMapping2.originalToTransformed(TextRange.m2157getStartimpl(textFieldValue2.m2302getSelectiond9O1mEE()));
                            TextLayoutResultProxy layoutResult = textFieldState2.getLayoutResult();
                            if (layoutResult == null || (value = layoutResult.getValue()) == null || (rect = value.getCursorRect(originalToTransformed)) == null) {
                                rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            float mo193toPx0680j_4 = contentDrawScope.mo193toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
                            float f = mo193toPx0680j_4 / 2;
                            h = C8657dts.h(rect.getLeft() + f, Size.m1176getWidthimpl(contentDrawScope.mo1562getSizeNHjbRc()) - f);
                            c = C8657dts.c(h, f);
                            DrawScope.m1550drawLine1RTmtNc$default(contentDrawScope, brush3, OffsetKt.Offset(c, rect.getTop()), OffsetKt.Offset(c, rect.getBottom()), mo193toPx0680j_4, 0, null, a, null, 0, 432, null);
                        }
                    });
                } else {
                    modifier3 = Modifier.Companion;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifier3;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.$cursorAlpha = animatable;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass1(this.$cursorAlpha, interfaceC8585dra);
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
                        FixedMotionDurationScale fixedMotionDurationScale = FixedMotionDurationScale.INSTANCE;
                        C00151 c00151 = new C00151(this.$cursorAlpha, null);
                        this.label = 1;
                        if (C8738dws.c(fixedMotionDurationScale, c00151, this) == e) {
                            return e;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C8556dpz.d(obj);
                    }
                    return dpR.c;
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1  reason: invalid class name and collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C00151 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                    final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00151(Animatable<Float, AnimationVector1D> animatable, InterfaceC8585dra<? super C00151> interfaceC8585dra) {
                        super(2, interfaceC8585dra);
                        this.$cursorAlpha = animatable;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                        return new C00151(this.$cursorAlpha, interfaceC8585dra);
                    }

                    @Override // o.drX
                    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                        return ((C00151) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object e;
                        AnimationSpec animationSpec;
                        e = C8586drb.e();
                        int i = this.label;
                        if (i == 0) {
                            C8556dpz.d(obj);
                            Animatable<Float, AnimationVector1D> animatable = this.$cursorAlpha;
                            Float e2 = C8589dre.e(1.0f);
                            this.label = 1;
                            if (animatable.snapTo(e2, this) == e) {
                                return e;
                            }
                        } else if (i != 1) {
                            if (i == 2) {
                                C8556dpz.d(obj);
                                return dpR.c;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            C8556dpz.d(obj);
                        }
                        Animatable<Float, AnimationVector1D> animatable2 = this.$cursorAlpha;
                        Float e3 = C8589dre.e(0.0f);
                        animationSpec = TextFieldCursorKt.cursorAnimationSpec;
                        this.label = 2;
                        if (Animatable.animateTo$default(animatable2, e3, animationSpec, null, null, this, 12, null) == e) {
                            return e;
                        }
                        return dpR.c;
                    }
                }
            }
        }, 1, null) : modifier;
    }
}
