package androidx.compose.runtime;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8738dws;
import o.InterfaceC8585dra;
import o.dpR;
import o.dqZ;
import o.drX;
import o.dwU;
import o.dyQ;
import o.dyS;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes.dex */
public final class SnapshotStateKt__SnapshotFlowKt$collectAsState$1<R> extends SuspendLambda implements drX<ProduceStateScope<R>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ dqZ $context;
    final /* synthetic */ dyS<T> $this_collectAsState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateKt__SnapshotFlowKt$collectAsState$1(dqZ dqz, dyS<? extends T> dys, InterfaceC8585dra<? super SnapshotStateKt__SnapshotFlowKt$collectAsState$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$context = dqz;
        this.$this_collectAsState = dys;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(this.$context, this.$this_collectAsState, interfaceC8585dra);
        snapshotStateKt__SnapshotFlowKt$collectAsState$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$collectAsState$1;
    }

    public final Object invoke(ProduceStateScope<R> produceStateScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((SnapshotStateKt__SnapshotFlowKt$collectAsState$1) create(produceStateScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // o.drX
    public /* bridge */ /* synthetic */ Object invoke(Object obj, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return invoke((ProduceStateScope) ((ProduceStateScope) obj), interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
            if (C8632dsu.c(this.$context, EmptyCoroutineContext.e)) {
                dyS<T> dys = this.$this_collectAsState;
                dyQ dyq = new dyQ() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1.1
                    @Override // o.dyQ
                    public final Object emit(T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                        produceStateScope.setValue(t);
                        return dpR.c;
                    }
                };
                this.label = 1;
                if (dys.collect(dyq, this) == e) {
                    return e;
                }
            } else {
                dqZ dqz = this.$context;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_collectAsState, produceStateScope, null);
                this.label = 2;
                if (C8738dws.c(dqz, anonymousClass2, this) == e) {
                    return e;
                }
            }
        } else if (i != 1 && i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ ProduceStateScope<R> $$this$produceState;
        final /* synthetic */ dyS<T> $this_collectAsState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(dyS<? extends T> dys, ProduceStateScope<R> produceStateScope, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.$this_collectAsState = dys;
            this.$$this$produceState = produceStateScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass2(this.$this_collectAsState, this.$$this$produceState, interfaceC8585dra);
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
                dyS<T> dys = this.$this_collectAsState;
                final ProduceStateScope<R> produceStateScope = this.$$this$produceState;
                dyQ dyq = new dyQ() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState.1.2.1
                    @Override // o.dyQ
                    public final Object emit(T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                        produceStateScope.setValue(t);
                        return dpR.c;
                    }
                };
                this.label = 1;
                if (dys.collect(dyq, this) == e) {
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
