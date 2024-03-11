package androidx.compose.material;

import androidx.compose.runtime.SnapshotStateKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drO;
import o.drX;
import o.dwU;
import o.dwY;
import o.dxD;
import o.dyQ;
import o.dyS;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: I
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes5.dex */
final class AnchoredDraggableKt$restartable$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drX<I, InterfaceC8585dra<? super dpR>, Object> $block;
    final /* synthetic */ drO<I> $inputs;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableKt$restartable$2(drO<? extends I> dro, drX<? super I, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super AnchoredDraggableKt$restartable$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$inputs = dro;
        this.$block = drx;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(this.$inputs, this.$block, interfaceC8585dra);
        anchoredDraggableKt$restartable$2.L$0 = obj;
        return anchoredDraggableKt$restartable$2;
    }

    @Override // o.drX
    public /* bridge */ /* synthetic */ Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return invoke2(dwu, interfaceC8585dra);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((AnchoredDraggableKt$restartable$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            dyS snapshotFlow = SnapshotStateKt.snapshotFlow(this.$inputs);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef, (dwU) this.L$0, this.$block);
            this.label = 1;
            if (snapshotFlow.collect(anonymousClass1, this) == e) {
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
    /* renamed from: androidx.compose.material.AnchoredDraggableKt$restartable$2$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1<T> implements dyQ {
        final /* synthetic */ dwU $$this$coroutineScope;
        final /* synthetic */ drX<I, InterfaceC8585dra<? super dpR>, Object> $block;
        final /* synthetic */ Ref.ObjectRef<dxD> $previousDrag;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Ref.ObjectRef<dxD> objectRef, dwU dwu, drX<? super I, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
            this.$previousDrag = objectRef;
            this.$$this$coroutineScope = dwu;
            this.$block = drx;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
        @Override // o.dyQ
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(I r8, o.InterfaceC8585dra<? super o.dpR> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1
                if (r0 == 0) goto L13
                r0 = r9
                androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = (androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = new androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3b
                if (r2 != r3) goto L33
                java.lang.Object r8 = r0.L$2
                o.dxD r8 = (o.dxD) r8
                java.lang.Object r8 = r0.L$1
                java.lang.Object r0 = r0.L$0
                androidx.compose.material.AnchoredDraggableKt$restartable$2$1 r0 = (androidx.compose.material.AnchoredDraggableKt$restartable$2.AnonymousClass1) r0
                o.C8556dpz.d(r9)
                goto L5e
            L33:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3b:
                o.C8556dpz.d(r9)
                kotlin.jvm.internal.Ref$ObjectRef<o.dxD> r9 = r7.$previousDrag
                T r9 = r9.d
                o.dxD r9 = (o.dxD) r9
                if (r9 == 0) goto L5d
                androidx.compose.material.AnchoredDragFinishedSignal r2 = new androidx.compose.material.AnchoredDragFinishedSignal
                r2.<init>()
                r9.e(r2)
                r0.L$0 = r7
                r0.L$1 = r8
                r0.L$2 = r9
                r0.label = r3
                java.lang.Object r9 = r9.a_(r0)
                if (r9 != r1) goto L5d
                return r1
            L5d:
                r0 = r7
            L5e:
                kotlin.jvm.internal.Ref$ObjectRef<o.dxD> r9 = r0.$previousDrag
                o.dwU r1 = r0.$$this$coroutineScope
                r2 = 0
                kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2 r4 = new androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2
                o.drX<I, o.dra<? super o.dpR>, java.lang.Object> r0 = r0.$block
                r5 = 0
                r4.<init>(r0, r8, r1, r5)
                r5 = 1
                r6 = 0
                o.dxD r8 = o.C8738dws.e(r1, r2, r3, r4, r5, r6)
                r9.d = r8
                o.dpR r8 = o.dpR.c
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableKt$restartable$2.AnonymousClass1.emit(java.lang.Object, o.dra):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2  reason: invalid class name */
        /* loaded from: classes5.dex */
        public static final class AnonymousClass2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
            final /* synthetic */ dwU $$this$coroutineScope;
            final /* synthetic */ drX<I, InterfaceC8585dra<? super dpR>, Object> $block;
            final /* synthetic */ I $latestInputs;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(drX<? super I, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, I i, dwU dwu, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
                super(2, interfaceC8585dra);
                this.$block = drx;
                this.$latestInputs = i;
                this.$$this$coroutineScope = dwu;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                return new AnonymousClass2(this.$block, this.$latestInputs, this.$$this$coroutineScope, interfaceC8585dra);
            }

            @Override // o.drX
            public /* bridge */ /* synthetic */ Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                return invoke2(dwu, interfaceC8585dra);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                return ((AnonymousClass2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object e;
                e = C8586drb.e();
                int i = this.label;
                if (i == 0) {
                    C8556dpz.d(obj);
                    drX<I, InterfaceC8585dra<? super dpR>, Object> drx = this.$block;
                    I i2 = this.$latestInputs;
                    this.label = 1;
                    if (drx.invoke(i2, this) == e) {
                        return e;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C8556dpz.d(obj);
                }
                dwY.a(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                return dpR.c;
            }
        }
    }
}
