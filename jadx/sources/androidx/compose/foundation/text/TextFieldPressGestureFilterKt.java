package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8737dwr;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes.dex */
public final class TextFieldPressGestureFilterKt {
    public static final Modifier tapPressTextFieldModifier(Modifier modifier, final MutableInteractionSource mutableInteractionSource, boolean z, final drM<? super Offset, dpR> drm) {
        return z ? ComposedModifierKt.composed$default(modifier, null, new InterfaceC8612dsa<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.startReplaceableGroup(-102778667);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-102778667, i, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
                }
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
                dwU coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue2 = composer.rememberedValue();
                if (rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState = (MutableState) rememberedValue2;
                State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(drm, composer, 0);
                MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                composer.startReplaceableGroup(922652220);
                boolean changed = composer.changed(mutableState);
                boolean changed2 = composer.changed(mutableInteractionSource);
                final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                Object rememberedValue3 = composer.rememberedValue();
                if ((changed | changed2) || rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = new drM<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                            final MutableState<PressInteraction.Press> mutableState2 = mutableState;
                            final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    PressInteraction.Press press = (PressInteraction.Press) MutableState.this.getValue();
                                    if (press != null) {
                                        PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
                                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                        if (mutableInteractionSource5 != null) {
                                            mutableInteractionSource5.tryEmit(cancel);
                                        }
                                        MutableState.this.setValue(null);
                                    }
                                }
                            };
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceableGroup();
                EffectsKt.DisposableEffect(mutableInteractionSource2, (drM) rememberedValue3, composer, 0);
                Modifier.Companion companion2 = Modifier.Companion;
                MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource;
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, mutableInteractionSource4, new AnonymousClass2(coroutineScope, mutableState, mutableInteractionSource4, rememberUpdatedState, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return pointerInput;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2 extends SuspendLambda implements drX<PointerInputScope, InterfaceC8585dra<? super dpR>, Object> {
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ State<drM<Offset, dpR>> $onTapState;
                final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                final /* synthetic */ dwU $scope;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(dwU dwu, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, State<? extends drM<? super Offset, dpR>> state, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.$scope = dwu;
                    this.$pressedInteraction = mutableState;
                    this.$interactionSource = mutableInteractionSource;
                    this.$onTapState = state;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$scope, this.$pressedInteraction, this.$interactionSource, this.$onTapState, interfaceC8585dra);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // o.drX
                public final Object invoke(PointerInputScope pointerInputScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((AnonymousClass2) create(pointerInputScope, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object e;
                    e = C8586drb.e();
                    int i = this.label;
                    if (i == 0) {
                        C8556dpz.d(obj);
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, this.$pressedInteraction, this.$interactionSource, null);
                        final State<drM<Offset, dpR>> state = this.$onTapState;
                        drM<Offset, dpR> drm = new drM<Offset, dpR>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* synthetic */ dpR invoke(Offset offset) {
                                m467invokek4lQ0M(offset.m1146unboximpl());
                                return dpR.c;
                            }

                            /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
                            public final void m467invokek4lQ0M(long j) {
                                state.getValue().invoke(Offset.m1126boximpl(j));
                            }
                        };
                        this.label = 1;
                        if (TapGestureDetectorKt.detectTapAndPress((PointerInputScope) this.L$0, anonymousClass1, drm, this) == e) {
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
                /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC8612dsa<PressGestureScope, Offset, InterfaceC8585dra<? super dpR>, Object> {
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                    final /* synthetic */ dwU $scope;
                    /* synthetic */ long J$0;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(dwU dwu, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                        super(3, interfaceC8585dra);
                        this.$scope = dwu;
                        this.$pressedInteraction = mutableState;
                        this.$interactionSource = mutableInteractionSource;
                    }

                    @Override // o.InterfaceC8612dsa
                    public /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                        return m466invoked4ec7I(pressGestureScope, offset.m1146unboximpl(), interfaceC8585dra);
                    }

                    /* renamed from: invoke-d-4ec7I  reason: not valid java name */
                    public final Object m466invoked4ec7I(PressGestureScope pressGestureScope, long j, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, this.$pressedInteraction, this.$interactionSource, interfaceC8585dra);
                        anonymousClass1.L$0 = pressGestureScope;
                        anonymousClass1.J$0 = j;
                        return anonymousClass1.invokeSuspend(dpR.c);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1  reason: invalid class name and collision with other inner class name */
                    /* loaded from: classes.dex */
                    public static final class C00161 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        final /* synthetic */ long $it;
                        final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00161(MutableState<PressInteraction.Press> mutableState, long j, MutableInteractionSource mutableInteractionSource, InterfaceC8585dra<? super C00161> interfaceC8585dra) {
                            super(2, interfaceC8585dra);
                            this.$pressedInteraction = mutableState;
                            this.$it = j;
                            this.$interactionSource = mutableInteractionSource;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                            return new C00161(this.$pressedInteraction, this.$it, this.$interactionSource, interfaceC8585dra);
                        }

                        @Override // o.drX
                        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                            return ((C00161) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                            /*
                                r7 = this;
                                java.lang.Object r0 = o.C8588drd.c()
                                int r1 = r7.label
                                r2 = 2
                                r3 = 0
                                r4 = 1
                                if (r1 == 0) goto L27
                                if (r1 == r4) goto L1f
                                if (r1 != r2) goto L17
                                java.lang.Object r0 = r7.L$0
                                androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
                                o.C8556dpz.d(r8)
                                goto L66
                            L17:
                                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r8.<init>(r0)
                                throw r8
                            L1f:
                                java.lang.Object r1 = r7.L$0
                                androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
                                o.C8556dpz.d(r8)
                                goto L4b
                            L27:
                                o.C8556dpz.d(r8)
                                androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r8 = r7.$pressedInteraction
                                java.lang.Object r8 = r8.getValue()
                                androidx.compose.foundation.interaction.PressInteraction$Press r8 = (androidx.compose.foundation.interaction.PressInteraction.Press) r8
                                if (r8 == 0) goto L4f
                                androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.$interactionSource
                                androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r5 = r7.$pressedInteraction
                                androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                                r6.<init>(r8)
                                if (r1 == 0) goto L4c
                                r7.L$0 = r5
                                r7.label = r4
                                java.lang.Object r8 = r1.emit(r6, r7)
                                if (r8 != r0) goto L4a
                                return r0
                            L4a:
                                r1 = r5
                            L4b:
                                r5 = r1
                            L4c:
                                r5.setValue(r3)
                            L4f:
                                androidx.compose.foundation.interaction.PressInteraction$Press r8 = new androidx.compose.foundation.interaction.PressInteraction$Press
                                long r4 = r7.$it
                                r8.<init>(r4, r3)
                                androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.$interactionSource
                                if (r1 == 0) goto L65
                                r7.L$0 = r8
                                r7.label = r2
                                java.lang.Object r1 = r1.emit(r8, r7)
                                if (r1 != r0) goto L65
                                return r0
                            L65:
                                r0 = r8
                            L66:
                                androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r8 = r7.$pressedInteraction
                                r8.setValue(r0)
                                o.dpR r8 = o.dpR.c
                                return r8
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1.AnonymousClass2.AnonymousClass1.C00161.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object e;
                        e = C8586drb.e();
                        int i = this.label;
                        if (i == 0) {
                            C8556dpz.d(obj);
                            C8737dwr.c(this.$scope, null, null, new C00161(this.$pressedInteraction, this.J$0, this.$interactionSource, null), 3, null);
                            this.label = 1;
                            obj = ((PressGestureScope) this.L$0).tryAwaitRelease(this);
                            if (obj == e) {
                                return e;
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            C8556dpz.d(obj);
                        }
                        C8737dwr.c(this.$scope, null, null, new C00172(this.$pressedInteraction, ((Boolean) obj).booleanValue(), this.$interactionSource, null), 3, null);
                        return dpR.c;
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2  reason: invalid class name and collision with other inner class name */
                    /* loaded from: classes.dex */
                    public static final class C00172 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                        final /* synthetic */ boolean $success;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00172(MutableState<PressInteraction.Press> mutableState, boolean z, MutableInteractionSource mutableInteractionSource, InterfaceC8585dra<? super C00172> interfaceC8585dra) {
                            super(2, interfaceC8585dra);
                            this.$pressedInteraction = mutableState;
                            this.$success = z;
                            this.$interactionSource = mutableInteractionSource;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                            return new C00172(this.$pressedInteraction, this.$success, this.$interactionSource, interfaceC8585dra);
                        }

                        @Override // o.drX
                        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                            return ((C00172) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object e;
                            MutableState<PressInteraction.Press> mutableState;
                            Interaction cancel;
                            MutableState<PressInteraction.Press> mutableState2;
                            e = C8586drb.e();
                            int i = this.label;
                            if (i == 0) {
                                C8556dpz.d(obj);
                                PressInteraction.Press value = this.$pressedInteraction.getValue();
                                if (value != null) {
                                    boolean z = this.$success;
                                    MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                    mutableState = this.$pressedInteraction;
                                    if (z) {
                                        cancel = new PressInteraction.Release(value);
                                    } else {
                                        cancel = new PressInteraction.Cancel(value);
                                    }
                                    if (mutableInteractionSource != null) {
                                        this.L$0 = mutableState;
                                        this.label = 1;
                                        if (mutableInteractionSource.emit(cancel, this) == e) {
                                            return e;
                                        }
                                        mutableState2 = mutableState;
                                    }
                                    mutableState.setValue(null);
                                }
                                return dpR.c;
                            } else if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                mutableState2 = (MutableState) this.L$0;
                                C8556dpz.d(obj);
                            }
                            mutableState = mutableState2;
                            mutableState.setValue(null);
                            return dpR.c;
                        }
                    }
                }
            }
        }, 1, null) : modifier;
    }
}
