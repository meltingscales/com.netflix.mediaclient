package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$detectTapAndPress$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterfaceC8612dsa<PressGestureScope, Offset, InterfaceC8585dra<? super dpR>, Object> $onPress;
    final /* synthetic */ drM<Offset, dpR> $onTap;
    final /* synthetic */ PressGestureScopeImpl $pressScope;
    final /* synthetic */ PointerInputScope $this_detectTapAndPress;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TapGestureDetectorKt$detectTapAndPress$2(PointerInputScope pointerInputScope, InterfaceC8612dsa<? super PressGestureScope, ? super Offset, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa, drM<? super Offset, dpR> drm, PressGestureScopeImpl pressGestureScopeImpl, InterfaceC8585dra<? super TapGestureDetectorKt$detectTapAndPress$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$this_detectTapAndPress = pointerInputScope;
        this.$onPress = interfaceC8612dsa;
        this.$onTap = drm;
        this.$pressScope = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, interfaceC8585dra);
        tapGestureDetectorKt$detectTapAndPress$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((TapGestureDetectorKt$detectTapAndPress$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements drX<AwaitPointerEventScope, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ dwU $$this$coroutineScope;
        final /* synthetic */ InterfaceC8612dsa<PressGestureScope, Offset, InterfaceC8585dra<? super dpR>, Object> $onPress;
        final /* synthetic */ drM<Offset, dpR> $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(dwU dwu, InterfaceC8612dsa<? super PressGestureScope, ? super Offset, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa, drM<? super Offset, dpR> drm, PressGestureScopeImpl pressGestureScopeImpl, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.$$this$coroutineScope = dwu;
            this.$onPress = interfaceC8612dsa;
            this.$onTap = drm;
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onTap, this.$pressScope, interfaceC8585dra);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // o.drX
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(awaitPointerEventScope, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00061 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00061(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC8585dra<? super C00061> interfaceC8585dra) {
                super(2, interfaceC8585dra);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                return new C00061(this.$pressScope, interfaceC8585dra);
            }

            @Override // o.drX
            public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                return ((C00061) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object e;
                e = C8586drb.e();
                int i = this.label;
                if (i == 0) {
                    C8556dpz.d(obj);
                    PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                    this.label = 1;
                    if (pressGestureScopeImpl.reset(this) == e) {
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

        /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                r23 = this;
                r6 = r23
                java.lang.Object r7 = o.C8588drd.c()
                int r0 = r6.label
                r8 = 2
                r9 = 1
                r10 = 0
                if (r0 == 0) goto L2a
                if (r0 == r9) goto L1f
                if (r0 != r8) goto L17
                o.C8556dpz.d(r24)
                r0 = r24
                goto L7d
            L17:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1f:
                java.lang.Object r0 = r6.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
                o.C8556dpz.d(r24)
                r11 = r0
                r0 = r24
                goto L51
            L2a:
                o.C8556dpz.d(r24)
                java.lang.Object r0 = r6.L$0
                r11 = r0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r11
                o.dwU r0 = r6.$$this$coroutineScope
                r1 = 0
                r2 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1 r3 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1
                androidx.compose.foundation.gestures.PressGestureScopeImpl r4 = r6.$pressScope
                r3.<init>(r4, r10)
                r4 = 3
                r5 = 0
                o.C8738dws.e(r0, r1, r2, r3, r4, r5)
                r6.L$0 = r11
                r6.label = r9
                r1 = 0
                r0 = r11
                r3 = r23
                java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r0, r1, r2, r3, r4, r5)
                if (r0 != r7) goto L51
                return r7
            L51:
                androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                r0.consume()
                o.dsa<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, o.dra<? super o.dpR>, java.lang.Object> r1 = r6.$onPress
                o.dsa r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.access$getNoPressGesture$p()
                if (r1 == r2) goto L72
                o.dwU r12 = r6.$$this$coroutineScope
                r13 = 0
                r14 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2 r15 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2
                o.dsa<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, o.dra<? super o.dpR>, java.lang.Object> r1 = r6.$onPress
                androidx.compose.foundation.gestures.PressGestureScopeImpl r2 = r6.$pressScope
                r15.<init>(r1, r2, r0, r10)
                r16 = 3
                r17 = 0
                o.C8738dws.e(r12, r13, r14, r15, r16, r17)
            L72:
                r6.L$0 = r10
                r6.label = r8
                java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation$default(r11, r10, r6, r9, r10)
                if (r0 != r7) goto L7d
                return r7
            L7d:
                androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                if (r0 != 0) goto L93
                o.dwU r11 = r6.$$this$coroutineScope
                r12 = 0
                r13 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3 r14 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r6.$pressScope
                r14.<init>(r0, r10)
                r15 = 3
                r16 = 0
                o.C8738dws.e(r11, r12, r13, r14, r15, r16)
                goto Lbd
            L93:
                r0.consume()
                o.dwU r1 = r6.$$this$coroutineScope
                r18 = 0
                r19 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4 r2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4
                androidx.compose.foundation.gestures.PressGestureScopeImpl r3 = r6.$pressScope
                r2.<init>(r3, r10)
                r21 = 3
                r22 = 0
                r17 = r1
                r20 = r2
                o.C8738dws.e(r17, r18, r19, r20, r21, r22)
                o.drM<androidx.compose.ui.geometry.Offset, o.dpR> r1 = r6.$onTap
                if (r1 == 0) goto Lbd
                long r2 = r0.m1729getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.m1126boximpl(r2)
                r1.invoke(r0)
            Lbd:
                o.dpR r0 = o.dpR.c
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
            final /* synthetic */ PointerInputChange $down;
            final /* synthetic */ InterfaceC8612dsa<PressGestureScope, Offset, InterfaceC8585dra<? super dpR>, Object> $onPress;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(InterfaceC8612dsa<? super PressGestureScope, ? super Offset, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
                super(2, interfaceC8585dra);
                this.$onPress = interfaceC8612dsa;
                this.$pressScope = pressGestureScopeImpl;
                this.$down = pointerInputChange;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                return new AnonymousClass2(this.$onPress, this.$pressScope, this.$down, interfaceC8585dra);
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
                    InterfaceC8612dsa<PressGestureScope, Offset, InterfaceC8585dra<? super dpR>, Object> interfaceC8612dsa = this.$onPress;
                    PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                    Offset m1126boximpl = Offset.m1126boximpl(this.$down.m1729getPositionF1C5BW0());
                    this.label = 1;
                    if (interfaceC8612dsa.invoke(pressGestureScopeImpl, m1126boximpl, this) == e) {
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

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass3 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC8585dra<? super AnonymousClass3> interfaceC8585dra) {
                super(2, interfaceC8585dra);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                return new AnonymousClass3(this.$pressScope, interfaceC8585dra);
            }

            @Override // o.drX
            public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                return ((AnonymousClass3) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                C8586drb.e();
                if (this.label == 0) {
                    C8556dpz.d(obj);
                    this.$pressScope.cancel();
                    return dpR.c;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass4 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC8585dra<? super AnonymousClass4> interfaceC8585dra) {
                super(2, interfaceC8585dra);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                return new AnonymousClass4(this.$pressScope, interfaceC8585dra);
            }

            @Override // o.drX
            public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                return ((AnonymousClass4) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                C8586drb.e();
                if (this.label == 0) {
                    C8556dpz.d(obj);
                    this.$pressScope.release();
                    return dpR.c;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            dwU dwu = (dwU) this.L$0;
            PointerInputScope pointerInputScope = this.$this_detectTapAndPress;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dwu, this.$onPress, this.$onTap, this.$pressScope, null);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass1, this) == e) {
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
