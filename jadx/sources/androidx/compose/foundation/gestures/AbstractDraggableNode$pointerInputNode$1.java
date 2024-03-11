package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dwY;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AbstractDraggableNode$pointerInputNode$1 extends SuspendLambda implements drX<PointerInputScope, InterfaceC8585dra<? super dpR>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractDraggableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDraggableNode$pointerInputNode$1(AbstractDraggableNode abstractDraggableNode, InterfaceC8585dra<? super AbstractDraggableNode$pointerInputNode$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = abstractDraggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        AbstractDraggableNode$pointerInputNode$1 abstractDraggableNode$pointerInputNode$1 = new AbstractDraggableNode$pointerInputNode$1(this.this$0, interfaceC8585dra);
        abstractDraggableNode$pointerInputNode$1.L$0 = obj;
        return abstractDraggableNode$pointerInputNode$1;
    }

    @Override // o.drX
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((AbstractDraggableNode$pointerInputNode$1) create(pointerInputScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            if (!this.this$0.getEnabled()) {
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
    /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ PointerInputScope $$this$SuspendingPointerInputModifierNode;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractDraggableNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PointerInputScope pointerInputScope, AbstractDraggableNode abstractDraggableNode, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.$$this$SuspendingPointerInputModifierNode = pointerInputScope;
            this.this$0 = abstractDraggableNode;
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

        /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
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
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r7.L$0
                o.dwU r0 = (o.dwU) r0
                o.C8556dpz.d(r8)     // Catch: java.util.concurrent.CancellationException -> L13
                goto L43
            L13:
                r8 = move-exception
                goto L3d
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                o.C8556dpz.d(r8)
                java.lang.Object r8 = r7.L$0
                o.dwU r8 = (o.dwU) r8
                androidx.compose.ui.input.pointer.PointerInputScope r1 = r7.$$this$SuspendingPointerInputModifierNode     // Catch: java.util.concurrent.CancellationException -> L39
                androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1 r3 = new androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1     // Catch: java.util.concurrent.CancellationException -> L39
                androidx.compose.foundation.gestures.AbstractDraggableNode r4 = r7.this$0     // Catch: java.util.concurrent.CancellationException -> L39
                r5 = 0
                r3.<init>(r8, r4, r5)     // Catch: java.util.concurrent.CancellationException -> L39
                r7.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L39
                r7.label = r2     // Catch: java.util.concurrent.CancellationException -> L39
                java.lang.Object r8 = r1.awaitPointerEventScope(r3, r7)     // Catch: java.util.concurrent.CancellationException -> L39
                if (r8 != r0) goto L43
                return r0
            L39:
                r0 = move-exception
                r6 = r0
                r0 = r8
                r8 = r6
            L3d:
                boolean r0 = o.dwY.b(r0)
                if (r0 == 0) goto L46
            L43:
                o.dpR r8 = o.dpR.c
                return r8
            L46:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00031 extends RestrictedSuspendLambda implements drX<AwaitPointerEventScope, InterfaceC8585dra<? super dpR>, Object> {
            final /* synthetic */ dwU $$this$coroutineScope;
            int I$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ AbstractDraggableNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00031(dwU dwu, AbstractDraggableNode abstractDraggableNode, InterfaceC8585dra<? super C00031> interfaceC8585dra) {
                super(2, interfaceC8585dra);
                this.$$this$coroutineScope = dwu;
                this.this$0 = abstractDraggableNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                C00031 c00031 = new C00031(this.$$this$coroutineScope, this.this$0, interfaceC8585dra);
                c00031.L$0 = obj;
                return c00031;
            }

            @Override // o.drX
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                return ((C00031) create(awaitPointerEventScope, interfaceC8585dra)).invokeSuspend(dpR.c);
            }

            /* JADX WARN: Can't wrap try/catch for region: R(10:5|(3:6|7|8)|9|10|11|(6:13|(1:15)(1:68)|16|17|18|(5:20|(1:65)|22|23|(8:25|(1:27)|28|29|30|31|32|(1:34)(5:36|9|10|11|(0)))(3:64|18|(2:66|67)(0)))(0))|69|17|18|(0)(0)) */
            /* JADX WARN: Can't wrap try/catch for region: R(8:25|(1:27)|28|29|30|31|32|(1:34)(5:36|9|10|11|(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x0125, code lost:
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x0128, code lost:
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x012a, code lost:
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x012c, code lost:
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x012e, code lost:
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x012f, code lost:
                r20 = r6;
                r12 = r8;
                r18 = r9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x0134, code lost:
                r9 = r18;
                r6 = r20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0139, code lost:
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x013a, code lost:
                r19 = r5;
                r20 = r6;
                r16 = r7;
                r12 = r8;
                r18 = r9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x0143, code lost:
                r4 = r16;
                r2 = r19;
                r3 = r20;
             */
            /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x014f  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x016b A[Catch: all -> 0x016c, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x016c, blocks: (B:56:0x0149, B:61:0x016b), top: B:77:0x0149 }] */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0180  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x01a6  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x01b0  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x01b6  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e0 -> B:83:0x00e8). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x015c -> B:60:0x015e). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01b0 -> B:18:0x0055). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r22) {
                /*
                    Method dump skipped, instructions count: 441
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1.AnonymousClass1.C00031.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }
    }
}
