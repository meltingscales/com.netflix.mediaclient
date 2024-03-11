package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MouseWheelScrollNode extends DelegatingNode implements CompositionLocalConsumerModifierNode {
    private ScrollConfig scrollConfig;
    private final ScrollingLogic scrollingLogic;

    public final ScrollConfig getScrollConfig() {
        return this.scrollConfig;
    }

    public MouseWheelScrollNode(ScrollingLogic scrollingLogic) {
        this.scrollingLogic = scrollingLogic;
        delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new AnonymousClass1(null)));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.scrollConfig = AndroidScrollable_androidKt.platformScrollConfig(this);
    }

    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollNode$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends SuspendLambda implements drX<PointerInputScope, InterfaceC8585dra<? super dpR>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC8585dra);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // o.drX
        public final Object invoke(PointerInputScope pointerInputScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(pointerInputScope, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00051 extends RestrictedSuspendLambda implements drX<AwaitPointerEventScope, InterfaceC8585dra<? super dpR>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MouseWheelScrollNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00051(MouseWheelScrollNode mouseWheelScrollNode, InterfaceC8585dra<? super C00051> interfaceC8585dra) {
                super(2, interfaceC8585dra);
                this.this$0 = mouseWheelScrollNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                C00051 c00051 = new C00051(this.this$0, interfaceC8585dra);
                c00051.L$0 = obj;
                return c00051;
            }

            @Override // o.drX
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                return ((C00051) create(awaitPointerEventScope, interfaceC8585dra)).invokeSuspend(dpR.c);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
                */
            /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x004d A[EDGE_INSN: B:22:0x004d->B:18:0x004d ?: BREAK  , SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:12:0x002e). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    r14 = this;
                    java.lang.Object r0 = o.C8588drd.c()
                    int r1 = r14.label
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r14.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                    o.C8556dpz.d(r15)
                    goto L2e
                L13:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r15.<init>(r0)
                    throw r15
                L1b:
                    o.C8556dpz.d(r15)
                    java.lang.Object r15 = r14.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r15 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r15
                    r1 = r15
                L23:
                    r14.L$0 = r1
                    r14.label = r2
                    java.lang.Object r15 = androidx.compose.foundation.gestures.ScrollableKt.access$awaitScrollEvent(r1, r14)
                    if (r15 != r0) goto L2e
                    return r0
                L2e:
                    androidx.compose.ui.input.pointer.PointerEvent r15 = (androidx.compose.ui.input.pointer.PointerEvent) r15
                    java.util.List r3 = r15.getChanges()
                    int r4 = r3.size()
                    r5 = 0
                    r6 = r5
                L3a:
                    if (r6 >= r4) goto L4d
                    java.lang.Object r7 = r3.get(r6)
                    androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
                    boolean r7 = r7.isConsumed()
                    r7 = r7 ^ r2
                    if (r7 != 0) goto L4a
                    goto L23
                L4a:
                    int r6 = r6 + 1
                    goto L3a
                L4d:
                    androidx.compose.foundation.gestures.MouseWheelScrollNode r3 = r14.this$0
                    androidx.compose.foundation.gestures.ScrollConfig r3 = r3.getScrollConfig()
                    o.C8632dsu.d(r3)
                    androidx.compose.foundation.gestures.MouseWheelScrollNode r4 = r14.this$0
                    long r6 = r1.mo1684getSizeYbymL2g()
                    long r6 = r3.mo152calculateMouseWheelScroll8xgXZGE(r1, r15, r6)
                    androidx.compose.foundation.gestures.ScrollingLogic r3 = androidx.compose.foundation.gestures.MouseWheelScrollNode.access$getScrollingLogic$p(r4)
                    o.dwU r8 = r4.getCoroutineScope()
                    r9 = 0
                    r10 = 0
                    androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1$2$1$1 r11 = new androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1$2$1$1
                    r4 = 0
                    r11.<init>(r3, r6, r4)
                    r12 = 3
                    r13 = 0
                    o.C8738dws.e(r8, r9, r10, r11, r12, r13)
                    java.util.List r15 = r15.getChanges()
                    int r3 = r15.size()
                L7d:
                    if (r5 >= r3) goto L23
                    java.lang.Object r4 = r15.get(r5)
                    androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
                    r4.consume()
                    int r5 = r5 + 1
                    goto L7d
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollNode.AnonymousClass1.C00051.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            e = C8586drb.e();
            int i = this.label;
            if (i == 0) {
                C8556dpz.d(obj);
                C00051 c00051 = new C00051(MouseWheelScrollNode.this, null);
                this.label = 1;
                if (((PointerInputScope) this.L$0).awaitPointerEventScope(c00051, this) == e) {
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
}
