package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AbstractDraggableNode$startListeningForEvents$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AbstractDraggableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDraggableNode$startListeningForEvents$1(AbstractDraggableNode abstractDraggableNode, InterfaceC8585dra<? super AbstractDraggableNode$startListeningForEvents$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = abstractDraggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        AbstractDraggableNode$startListeningForEvents$1 abstractDraggableNode$startListeningForEvents$1 = new AbstractDraggableNode$startListeningForEvents$1(this.this$0, interfaceC8585dra);
        abstractDraggableNode$startListeningForEvents$1.L$0 = obj;
        return abstractDraggableNode$startListeningForEvents$1;
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((AbstractDraggableNode$startListeningForEvents$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[Catch: CancellationException -> 0x00db, TryCatch #0 {CancellationException -> 0x00db, blocks: (B:29:0x0094, B:32:0x00a9, B:34:0x00af, B:37:0x00c4, B:39:0x00c8, B:11:0x002a), top: B:50:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4 A[Catch: CancellationException -> 0x00db, TryCatch #0 {CancellationException -> 0x00db, blocks: (B:29:0x0094, B:32:0x00a9, B:34:0x00af, B:37:0x00c4, B:39:0x00c8, B:11:0x002a), top: B:50:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007c -> B:17:0x0054). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d8 -> B:17:0x0054). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00e9 -> B:16:0x0053). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<AbstractDragScope, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ Ref.ObjectRef<DragEvent> $event;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AbstractDraggableNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.ObjectRef<DragEvent> objectRef, AbstractDraggableNode abstractDraggableNode, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.$event = objectRef;
            this.this$0 = abstractDraggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$event, this.this$0, interfaceC8585dra);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // o.drX
        public final Object invoke(AbstractDragScope abstractDragScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(abstractDragScope, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0073 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0071 -> B:27:0x0074). Please submit an issue!!! */
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
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r6.L$1
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                java.lang.Object r4 = r6.L$0
                androidx.compose.foundation.gestures.AbstractDragScope r4 = (androidx.compose.foundation.gestures.AbstractDragScope) r4
                o.C8556dpz.d(r7)
                goto L74
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                java.lang.Object r1 = r6.L$0
                androidx.compose.foundation.gestures.AbstractDragScope r1 = (androidx.compose.foundation.gestures.AbstractDragScope) r1
                o.C8556dpz.d(r7)
                r4 = r1
                goto L5f
            L2b:
                o.C8556dpz.d(r7)
                java.lang.Object r7 = r6.L$0
                androidx.compose.foundation.gestures.AbstractDragScope r7 = (androidx.compose.foundation.gestures.AbstractDragScope) r7
            L32:
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r1 = r6.$event
                T r1 = r1.d
                boolean r4 = r1 instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped
                if (r4 != 0) goto L78
                boolean r4 = r1 instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled
                if (r4 != 0) goto L78
                boolean r4 = r1 instanceof androidx.compose.foundation.gestures.DragEvent.DragDelta
                r5 = 0
                if (r4 == 0) goto L47
                r4 = r1
                androidx.compose.foundation.gestures.DragEvent$DragDelta r4 = (androidx.compose.foundation.gestures.DragEvent.DragDelta) r4
                goto L48
            L47:
                r4 = r5
            L48:
                if (r4 == 0) goto L5e
                androidx.compose.foundation.gestures.AbstractDraggableNode r4 = r6.this$0
                o.C8632dsu.d(r1)
                androidx.compose.foundation.gestures.DragEvent$DragDelta r1 = (androidx.compose.foundation.gestures.DragEvent.DragDelta) r1
                r6.L$0 = r7
                r6.L$1 = r5
                r6.label = r3
                java.lang.Object r1 = r4.draggingBy(r7, r1, r6)
                if (r1 != r0) goto L5e
                return r0
            L5e:
                r4 = r7
            L5f:
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r1 = r6.$event
                androidx.compose.foundation.gestures.AbstractDraggableNode r7 = r6.this$0
                o.dys r7 = androidx.compose.foundation.gestures.AbstractDraggableNode.access$getChannel$p(r7)
                r6.L$0 = r4
                r6.L$1 = r1
                r6.label = r2
                java.lang.Object r7 = r7.c(r6)
                if (r7 != r0) goto L74
                return r0
            L74:
                r1.d = r7
                r7 = r4
                goto L32
            L78:
                o.dpR r7 = o.dpR.c
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
