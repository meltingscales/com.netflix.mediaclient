package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8556dpz;
import o.C8586drb;
import o.C8737dwr;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$detectTapGestures$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drM<Offset, dpR> $onDoubleTap;
    final /* synthetic */ drM<Offset, dpR> $onLongPress;
    final /* synthetic */ InterfaceC8612dsa<PressGestureScope, Offset, InterfaceC8585dra<? super dpR>, Object> $onPress;
    final /* synthetic */ drM<Offset, dpR> $onTap;
    final /* synthetic */ PointerInputScope $this_detectTapGestures;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TapGestureDetectorKt$detectTapGestures$2(PointerInputScope pointerInputScope, InterfaceC8612dsa<? super PressGestureScope, ? super Offset, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa, drM<? super Offset, dpR> drm, drM<? super Offset, dpR> drm2, drM<? super Offset, dpR> drm3, InterfaceC8585dra<? super TapGestureDetectorKt$detectTapGestures$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$this_detectTapGestures = pointerInputScope;
        this.$onPress = interfaceC8612dsa;
        this.$onLongPress = drm;
        this.$onDoubleTap = drm2;
        this.$onTap = drm3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.$this_detectTapGestures, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, interfaceC8585dra);
        tapGestureDetectorKt$detectTapGestures$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((TapGestureDetectorKt$detectTapGestures$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            dwU dwu = (dwU) this.L$0;
            PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.$this_detectTapGestures);
            PointerInputScope pointerInputScope = this.$this_detectTapGestures;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dwu, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, pressGestureScopeImpl, null);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements drX<AwaitPointerEventScope, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ dwU $$this$coroutineScope;
        final /* synthetic */ drM<Offset, dpR> $onDoubleTap;
        final /* synthetic */ drM<Offset, dpR> $onLongPress;
        final /* synthetic */ InterfaceC8612dsa<PressGestureScope, Offset, InterfaceC8585dra<? super dpR>, Object> $onPress;
        final /* synthetic */ drM<Offset, dpR> $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(dwU dwu, InterfaceC8612dsa<? super PressGestureScope, ? super Offset, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa, drM<? super Offset, dpR> drm, drM<? super Offset, dpR> drm2, drM<? super Offset, dpR> drm3, PressGestureScopeImpl pressGestureScopeImpl, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.$$this$coroutineScope = dwu;
            this.$onPress = interfaceC8612dsa;
            this.$onLongPress = drm;
            this.$onDoubleTap = drm2;
            this.$onTap = drm3;
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, this.$pressScope, interfaceC8585dra);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // o.drX
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(awaitPointerEventScope, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ed A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00f7 A[Catch: PointerEventTimeoutCancellationException -> 0x011e, TryCatch #4 {PointerEventTimeoutCancellationException -> 0x011e, blocks: (B:32:0x00f1, B:34:0x00f7, B:35:0x0108), top: B:93:0x00f1 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0108 A[Catch: PointerEventTimeoutCancellationException -> 0x011e, TRY_LEAVE, TryCatch #4 {PointerEventTimeoutCancellationException -> 0x011e, blocks: (B:32:0x00f1, B:34:0x00f7, B:35:0x0108), top: B:93:0x00f1 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0147 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0190  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01f6  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0209  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0223 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 586
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00071 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00071(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC8585dra<? super C00071> interfaceC8585dra) {
                super(2, interfaceC8585dra);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                return new C00071(this.$pressScope, interfaceC8585dra);
            }

            @Override // o.drX
            public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                return ((C00071) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
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

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2  reason: invalid class name */
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
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass3 extends RestrictedSuspendLambda implements drX<AwaitPointerEventScope, InterfaceC8585dra<? super PointerInputChange>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(InterfaceC8585dra<? super AnonymousClass3> interfaceC8585dra) {
                super(2, interfaceC8585dra);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(interfaceC8585dra);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // o.drX
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC8585dra<? super PointerInputChange> interfaceC8585dra) {
                return ((AnonymousClass3) create(awaitPointerEventScope, interfaceC8585dra)).invokeSuspend(dpR.c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object e;
                e = C8586drb.e();
                int i = this.label;
                if (i == 0) {
                    C8556dpz.d(obj);
                    this.label = 1;
                    obj = TapGestureDetectorKt.waitForUpOrCancellation$default((AwaitPointerEventScope) this.L$0, null, this, 1, null);
                    if (obj == e) {
                        return e;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C8556dpz.d(obj);
                }
                return obj;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4  reason: invalid class name */
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
                    this.$pressScope.cancel();
                    return dpR.c;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass5 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC8585dra<? super AnonymousClass5> interfaceC8585dra) {
                super(2, interfaceC8585dra);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                return new AnonymousClass5(this.$pressScope, interfaceC8585dra);
            }

            @Override // o.drX
            public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                return ((AnonymousClass5) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
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

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass6 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC8585dra<? super AnonymousClass6> interfaceC8585dra) {
                super(2, interfaceC8585dra);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                return new AnonymousClass6(this.$pressScope, interfaceC8585dra);
            }

            @Override // o.drX
            public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                return ((AnonymousClass6) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
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

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass7 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC8585dra<? super AnonymousClass7> interfaceC8585dra) {
                super(2, interfaceC8585dra);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                return new AnonymousClass7(this.$pressScope, interfaceC8585dra);
            }

            @Override // o.drX
            public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                return ((AnonymousClass7) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
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

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass8 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
            final /* synthetic */ InterfaceC8612dsa<PressGestureScope, Offset, InterfaceC8585dra<? super dpR>, Object> $onPress;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            final /* synthetic */ PointerInputChange $secondDown;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass8(InterfaceC8612dsa<? super PressGestureScope, ? super Offset, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, InterfaceC8585dra<? super AnonymousClass8> interfaceC8585dra) {
                super(2, interfaceC8585dra);
                this.$onPress = interfaceC8612dsa;
                this.$pressScope = pressGestureScopeImpl;
                this.$secondDown = pointerInputChange;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                return new AnonymousClass8(this.$onPress, this.$pressScope, this.$secondDown, interfaceC8585dra);
            }

            @Override // o.drX
            public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                return ((AnonymousClass8) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
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
                    Offset m1126boximpl = Offset.m1126boximpl(this.$secondDown.m1729getPositionF1C5BW0());
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
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass9 extends RestrictedSuspendLambda implements drX<AwaitPointerEventScope, InterfaceC8585dra<? super dpR>, Object> {
            final /* synthetic */ dwU $$this$coroutineScope;
            final /* synthetic */ drM<Offset, dpR> $onDoubleTap;
            final /* synthetic */ drM<Offset, dpR> $onTap;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            final /* synthetic */ Ref.ObjectRef<PointerInputChange> $upOrCancel;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass9(dwU dwu, drM<? super Offset, dpR> drm, drM<? super Offset, dpR> drm2, Ref.ObjectRef<PointerInputChange> objectRef, PressGestureScopeImpl pressGestureScopeImpl, InterfaceC8585dra<? super AnonymousClass9> interfaceC8585dra) {
                super(2, interfaceC8585dra);
                this.$$this$coroutineScope = dwu;
                this.$onDoubleTap = drm;
                this.$onTap = drm2;
                this.$upOrCancel = objectRef;
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                AnonymousClass9 anonymousClass9 = new AnonymousClass9(this.$$this$coroutineScope, this.$onDoubleTap, this.$onTap, this.$upOrCancel, this.$pressScope, interfaceC8585dra);
                anonymousClass9.L$0 = obj;
                return anonymousClass9;
            }

            @Override // o.drX
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                return ((AnonymousClass9) create(awaitPointerEventScope, interfaceC8585dra)).invokeSuspend(dpR.c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object e;
                e = C8586drb.e();
                int i = this.label;
                if (i == 0) {
                    C8556dpz.d(obj);
                    this.label = 1;
                    obj = TapGestureDetectorKt.waitForUpOrCancellation$default((AwaitPointerEventScope) this.L$0, null, this, 1, null);
                    if (obj == e) {
                        return e;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C8556dpz.d(obj);
                }
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange == null) {
                    C8737dwr.c(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$pressScope, null), 3, null);
                    drM<Offset, dpR> drm = this.$onTap;
                    if (drm != null) {
                        drm.invoke(Offset.m1126boximpl(this.$upOrCancel.d.m1729getPositionF1C5BW0()));
                        return dpR.c;
                    }
                    return null;
                }
                pointerInputChange.consume();
                C8737dwr.c(this.$$this$coroutineScope, null, null, new C00081(this.$pressScope, null), 3, null);
                this.$onDoubleTap.invoke(Offset.m1126boximpl(pointerInputChange.m1729getPositionF1C5BW0()));
                return dpR.c;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00081 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00081(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC8585dra<? super C00081> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    return new C00081(this.$pressScope, interfaceC8585dra);
                }

                @Override // o.drX
                public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((C00081) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
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

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass2(this.$pressScope, interfaceC8585dra);
                }

                @Override // o.drX
                public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((AnonymousClass2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
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
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass10 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass10(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC8585dra<? super AnonymousClass10> interfaceC8585dra) {
                super(2, interfaceC8585dra);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                return new AnonymousClass10(this.$pressScope, interfaceC8585dra);
            }

            @Override // o.drX
            public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                return ((AnonymousClass10) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
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
}
