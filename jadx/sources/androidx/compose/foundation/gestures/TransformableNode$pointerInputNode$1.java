package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineStart;
import o.C8556dpz;
import o.C8586drb;
import o.C8737dwr;
import o.InterfaceC8585dra;
import o.InterfaceC8792dys;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;
import o.dwY;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TransformableNode$pointerInputNode$1 extends SuspendLambda implements drX<PointerInputScope, InterfaceC8585dra<? super dpR>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransformableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableNode$pointerInputNode$1(TransformableNode transformableNode, InterfaceC8585dra<? super TransformableNode$pointerInputNode$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = transformableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        TransformableNode$pointerInputNode$1 transformableNode$pointerInputNode$1 = new TransformableNode$pointerInputNode$1(this.this$0, interfaceC8585dra);
        transformableNode$pointerInputNode$1.L$0 = obj;
        return transformableNode$pointerInputNode$1;
    }

    @Override // o.drX
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((TransformableNode$pointerInputNode$1) create(pointerInputScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        boolean z;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            z = this.this$0.enabled;
            if (!z) {
                return dpR.c;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pointerInputScope, this.this$0, null);
            this.label = 1;
            if (dwY.b(anonymousClass1, this) == e) {
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
    /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ PointerInputScope $$this$SuspendingPointerInputModifierNode;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TransformableNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PointerInputScope pointerInputScope, TransformableNode transformableNode, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.$$this$SuspendingPointerInputModifierNode = pointerInputScope;
            this.this$0 = transformableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$SuspendingPointerInputModifierNode, this.this$0, interfaceC8585dra);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // o.drX
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00091 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ TransformableNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00091(TransformableNode transformableNode, InterfaceC8585dra<? super C00091> interfaceC8585dra) {
                super(2, interfaceC8585dra);
                this.this$0 = transformableNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                C00091 c00091 = new C00091(this.this$0, interfaceC8585dra);
                c00091.L$0 = obj;
                return c00091;
            }

            @Override // o.drX
            public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                return ((C00091) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005e -> B:14:0x0037). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007c -> B:14:0x0037). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0037 -> B:14:0x0037). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = o.C8588drd.c()
                    int r1 = r9.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L2e
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r1 = r9.L$0
                    o.dwU r1 = (o.dwU) r1
                    o.C8556dpz.d(r10)     // Catch: java.util.concurrent.CancellationException -> L36
                    goto L36
                L16:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L1e:
                    java.lang.Object r1 = r9.L$2
                    kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                    java.lang.Object r4 = r9.L$1
                    kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
                    java.lang.Object r5 = r9.L$0
                    o.dwU r5 = (o.dwU) r5
                    o.C8556dpz.d(r10)
                    goto L58
                L2e:
                    o.C8556dpz.d(r10)
                    java.lang.Object r10 = r9.L$0
                    r1 = r10
                    o.dwU r1 = (o.dwU) r1
                L36:
                    r5 = r1
                L37:
                    boolean r10 = o.dwY.b(r5)
                    if (r10 == 0) goto L7f
                    kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                    r1.<init>()
                    androidx.compose.foundation.gestures.TransformableNode r10 = r9.this$0
                    o.dys r10 = androidx.compose.foundation.gestures.TransformableNode.access$getChannel$p(r10)
                    r9.L$0 = r5
                    r9.L$1 = r1
                    r9.L$2 = r1
                    r9.label = r3
                    java.lang.Object r10 = r10.c(r9)
                    if (r10 != r0) goto L57
                    return r0
                L57:
                    r4 = r1
                L58:
                    r1.d = r10
                    T r10 = r4.d
                    boolean r10 = r10 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStarted
                    if (r10 == 0) goto L37
                    androidx.compose.foundation.gestures.TransformableNode r10 = r9.this$0     // Catch: java.util.concurrent.CancellationException -> L37
                    androidx.compose.foundation.gestures.TransformableState r10 = androidx.compose.foundation.gestures.TransformableNode.access$getState$p(r10)     // Catch: java.util.concurrent.CancellationException -> L37
                    androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.UserInput     // Catch: java.util.concurrent.CancellationException -> L37
                    androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1 r6 = new androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1     // Catch: java.util.concurrent.CancellationException -> L37
                    androidx.compose.foundation.gestures.TransformableNode r7 = r9.this$0     // Catch: java.util.concurrent.CancellationException -> L37
                    r8 = 0
                    r6.<init>(r4, r7, r8)     // Catch: java.util.concurrent.CancellationException -> L37
                    r9.L$0 = r5     // Catch: java.util.concurrent.CancellationException -> L37
                    r9.L$1 = r8     // Catch: java.util.concurrent.CancellationException -> L37
                    r9.L$2 = r8     // Catch: java.util.concurrent.CancellationException -> L37
                    r9.label = r2     // Catch: java.util.concurrent.CancellationException -> L37
                    java.lang.Object r10 = r10.transform(r1, r6, r9)     // Catch: java.util.concurrent.CancellationException -> L37
                    if (r10 != r0) goto L37
                    return r0
                L7f:
                    o.dpR r10 = o.dpR.c
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1.AnonymousClass1.C00091.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00101 extends SuspendLambda implements drX<TransformScope, InterfaceC8585dra<? super dpR>, Object> {
                final /* synthetic */ Ref.ObjectRef<TransformEvent> $event;
                private /* synthetic */ Object L$0;
                Object L$1;
                int label;
                final /* synthetic */ TransformableNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00101(Ref.ObjectRef<TransformEvent> objectRef, TransformableNode transformableNode, InterfaceC8585dra<? super C00101> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.$event = objectRef;
                    this.this$0 = transformableNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    C00101 c00101 = new C00101(this.$event, this.this$0, interfaceC8585dra);
                    c00101.L$0 = obj;
                    return c00101;
                }

                @Override // o.drX
                public final Object invoke(TransformScope transformScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((C00101) create(transformScope, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005a -> B:20:0x005d). Please submit an issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                    /*
                        r6 = this;
                        java.lang.Object r0 = o.C8588drd.c()
                        int r1 = r6.label
                        r2 = 1
                        if (r1 == 0) goto L1f
                        if (r1 != r2) goto L17
                        java.lang.Object r1 = r6.L$1
                        kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                        java.lang.Object r3 = r6.L$0
                        androidx.compose.foundation.gestures.TransformScope r3 = (androidx.compose.foundation.gestures.TransformScope) r3
                        o.C8556dpz.d(r7)
                        goto L5d
                    L17:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r0)
                        throw r7
                    L1f:
                        o.C8556dpz.d(r7)
                        java.lang.Object r7 = r6.L$0
                        androidx.compose.foundation.gestures.TransformScope r7 = (androidx.compose.foundation.gestures.TransformScope) r7
                        r3 = r7
                    L27:
                        kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TransformEvent> r7 = r6.$event
                        T r7 = r7.d
                        boolean r1 = r7 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStopped
                        if (r1 != 0) goto L60
                        boolean r1 = r7 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformDelta
                        if (r1 == 0) goto L36
                        androidx.compose.foundation.gestures.TransformEvent$TransformDelta r7 = (androidx.compose.foundation.gestures.TransformEvent.TransformDelta) r7
                        goto L37
                    L36:
                        r7 = 0
                    L37:
                        if (r7 == 0) goto L48
                        float r1 = r7.getZoomChange()
                        long r4 = r7.m217getPanChangeF1C5BW0()
                        float r7 = r7.getRotationChange()
                        r3.mo161transformByd4ec7I(r1, r4, r7)
                    L48:
                        kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TransformEvent> r1 = r6.$event
                        androidx.compose.foundation.gestures.TransformableNode r7 = r6.this$0
                        o.dys r7 = androidx.compose.foundation.gestures.TransformableNode.access$getChannel$p(r7)
                        r6.L$0 = r3
                        r6.L$1 = r1
                        r6.label = r2
                        java.lang.Object r7 = r7.c(r6)
                        if (r7 != r0) goto L5d
                        return r0
                    L5d:
                        r1.d = r7
                        goto L27
                    L60:
                        o.dpR r7 = o.dpR.c
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1.AnonymousClass1.C00091.C00101.invokeSuspend(java.lang.Object):java.lang.Object");
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
                C8737dwr.c(dwu, null, CoroutineStart.UNDISPATCHED, new C00091(this.this$0, null), 1, null);
                PointerInputScope pointerInputScope = this.$$this$SuspendingPointerInputModifierNode;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, dwu, null);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass2, this) == e) {
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
        /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends RestrictedSuspendLambda implements drX<AwaitPointerEventScope, InterfaceC8585dra<? super dpR>, Object> {
            final /* synthetic */ dwU $$this$coroutineScope;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TransformableNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(TransformableNode transformableNode, dwU dwu, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
                super(2, interfaceC8585dra);
                this.this$0 = transformableNode;
                this.$$this$coroutineScope = dwu;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$$this$coroutineScope, interfaceC8585dra);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // o.drX
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                return ((AnonymousClass2) create(awaitPointerEventScope, interfaceC8585dra)).invokeSuspend(dpR.c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object e;
                InterfaceC8792dys interfaceC8792dys;
                InterfaceC8792dys interfaceC8792dys2;
                boolean z;
                InterfaceC8792dys interfaceC8792dys3;
                drM drm;
                Object detectZoom;
                e = C8586drb.e();
                int i = this.label;
                try {
                    try {
                        if (i == 0) {
                            C8556dpz.d(obj);
                            AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                            z = this.this$0.lockRotationOnZoomPan;
                            interfaceC8792dys3 = this.this$0.channel;
                            drm = this.this$0.updatedCanPan;
                            this.label = 1;
                            detectZoom = TransformableKt.detectZoom(awaitPointerEventScope, z, interfaceC8792dys3, drm, this);
                            if (detectZoom == e) {
                                return e;
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            C8556dpz.d(obj);
                        }
                    } catch (CancellationException e2) {
                        if (!dwY.b(this.$$this$coroutineScope)) {
                            throw e2;
                        }
                    }
                    interfaceC8792dys2 = this.this$0.channel;
                    interfaceC8792dys2.d((InterfaceC8792dys) TransformEvent.TransformStopped.INSTANCE);
                    return dpR.c;
                } catch (Throwable th) {
                    interfaceC8792dys = this.this$0.channel;
                    interfaceC8792dys.d((InterfaceC8792dys) TransformEvent.TransformStopped.INSTANCE);
                    throw th;
                }
            }
        }
    }
}
