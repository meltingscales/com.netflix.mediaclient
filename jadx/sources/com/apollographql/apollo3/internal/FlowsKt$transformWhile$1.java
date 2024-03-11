package com.apollographql.apollo3.internal;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drX;
import o.dyQ;
import o.dyS;

/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes2.dex */
public final class FlowsKt$transformWhile$1<R> extends SuspendLambda implements drX<dyQ<? super R>, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ InterfaceC8612dsa<dyQ<? super R>, T, InterfaceC8585dra<? super Boolean>, Object> b;
    private /* synthetic */ Object c;
    final /* synthetic */ dyS<T> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowsKt$transformWhile$1(dyS<? extends T> dys, InterfaceC8612dsa<? super dyQ<? super R>, ? super T, ? super InterfaceC8585dra<? super Boolean>, ? extends Object> interfaceC8612dsa, InterfaceC8585dra<? super FlowsKt$transformWhile$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = dys;
        this.b = interfaceC8612dsa;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dyQ<? super R> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((FlowsKt$transformWhile$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        FlowsKt$transformWhile$1 flowsKt$transformWhile$1 = new FlowsKt$transformWhile$1(this.e, this.b, interfaceC8585dra);
        flowsKt$transformWhile$1.c = obj;
        return flowsKt$transformWhile$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        a aVar;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            dyS<T> dys = this.e;
            a aVar2 = new a(this.b, (dyQ) this.c);
            try {
                b bVar = new b(aVar2);
                this.c = aVar2;
                this.a = 1;
                if (dys.collect(bVar, this) == e) {
                    return e;
                }
            } catch (AbortFlowException e2) {
                e = e2;
                aVar = aVar2;
                e.b(aVar);
                return dpR.c;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            aVar = (a) this.c;
            try {
                C8556dpz.d(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                e.b(aVar);
                return dpR.c;
            }
        }
        return dpR.c;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public static final class a<T> implements dyQ<T> {
        final /* synthetic */ InterfaceC8612dsa c;
        final /* synthetic */ dyQ d;

        public a(InterfaceC8612dsa interfaceC8612dsa, dyQ dyq) {
            this.c = interfaceC8612dsa;
            this.d = dyq;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
        @Override // o.dyQ
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(T r5, o.InterfaceC8585dra<? super o.dpR> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.apollographql.apollo3.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1
                if (r0 == 0) goto L13
                r0 = r6
                com.apollographql.apollo3.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1 r0 = (com.apollographql.apollo3.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.d = r1
                goto L18
            L13:
                com.apollographql.apollo3.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1 r0 = new com.apollographql.apollo3.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.b
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.d
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.a
                com.apollographql.apollo3.internal.FlowsKt$transformWhile$1$a r5 = (com.apollographql.apollo3.internal.FlowsKt$transformWhile$1.a) r5
                o.C8556dpz.d(r6)
                goto L50
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                o.C8556dpz.d(r6)
                o.dsa r6 = r4.c
                o.dyQ r2 = r4.d
                r0.a = r4
                r0.d = r3
                r3 = 6
                o.C8635dsx.b(r3)
                java.lang.Object r6 = r6.invoke(r2, r5, r0)
                r5 = 7
                o.C8635dsx.b(r5)
                if (r6 != r1) goto L4f
                return r1
            L4f:
                r5 = r4
            L50:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L5b
                o.dpR r5 = o.dpR.c
                return r5
            L5b:
                com.apollographql.apollo3.internal.AbortFlowException r6 = new com.apollographql.apollo3.internal.AbortFlowException
                r6.<init>(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo3.internal.FlowsKt$transformWhile$1.a.emit(java.lang.Object, o.dra):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> implements dyQ {
        final /* synthetic */ a d;

        public b(a aVar) {
            this.d = aVar;
        }

        @Override // o.dyQ
        public final Object emit(T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            Object e;
            Object emit = this.d.emit(t, interfaceC8585dra);
            e = C8586drb.e();
            return emit == e ? emit : dpR.c;
        }
    }
}
