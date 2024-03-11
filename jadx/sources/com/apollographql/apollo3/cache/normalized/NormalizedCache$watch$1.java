package com.apollographql.apollo3.cache.normalized;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8942gI;
import o.C8954gU;
import o.C9083ir;
import o.InterfaceC8585dra;
import o.InterfaceC8999hM;
import o.InterfaceC9136jr;
import o.dpR;
import o.drX;
import o.dyQ;
import o.dyR;
import o.dyS;

/* JADX INFO: Add missing generic type declarations: [D] */
/* loaded from: classes2.dex */
public final class NormalizedCache$watch$1<D> extends SuspendLambda implements drX<dyQ<? super C8954gU<D>>, InterfaceC8585dra<? super dpR>, Object> {
    private /* synthetic */ Object a;
    int b;
    Object c;
    Object d;
    final /* synthetic */ C8942gI<D> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalizedCache$watch$1(C8942gI<D> c8942gI, InterfaceC8585dra<? super NormalizedCache$watch$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = c8942gI;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        NormalizedCache$watch$1 normalizedCache$watch$1 = new NormalizedCache$watch$1(this.e, interfaceC8585dra);
        normalizedCache$watch$1.a = obj;
        return normalizedCache$watch$1;
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dyQ<? super C8954gU<D>> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((NormalizedCache$watch$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        final dyQ dyq;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        InterfaceC9136jr a;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            dyq = (dyQ) this.a;
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            objectRef = new Ref.ObjectRef();
            dyS<C8954gU<D>> i2 = this.e.i();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef, objectRef3, dyq);
            this.a = dyq;
            this.d = objectRef3;
            this.c = objectRef;
            this.b = 1;
            if (i2.collect(anonymousClass1, this) == e) {
                return e;
            }
            objectRef2 = objectRef3;
        } else if (i != 1) {
            if (i == 2) {
                C8556dpz.d(obj);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            objectRef = (Ref.ObjectRef) this.c;
            objectRef2 = (Ref.ObjectRef) this.d;
            dyq = (dyQ) this.a;
            C8556dpz.d(obj);
        }
        C8942gI<D> e2 = this.e.e();
        a = C9083ir.a(this.e);
        C8942gI c8942gI = (C8942gI) C9083ir.b(e2, a);
        C8954gU c8954gU = (C8954gU) objectRef.d;
        dyS j = dyR.j(C9083ir.c(c8942gI, c8954gU != null ? (InterfaceC8999hM.c) c8954gU.d : null), new AnonymousClass2(objectRef2, null));
        dyQ dyq2 = new dyQ() { // from class: com.apollographql.apollo3.cache.normalized.NormalizedCache$watch$1.5
            @Override // o.dyQ
            /* renamed from: a */
            public final Object emit(C8954gU<D> c8954gU2, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                Object e3;
                Object emit = dyq.emit(c8954gU2, interfaceC8585dra);
                e3 = C8586drb.e();
                return emit == e3 ? emit : dpR.c;
            }
        };
        this.a = null;
        this.d = null;
        this.c = null;
        this.b = 2;
        if (j.collect(dyq2, this) == e) {
            return e;
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.apollographql.apollo3.cache.normalized.NormalizedCache$watch$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1<T> implements dyQ {
        final /* synthetic */ dyQ<C8954gU<D>> a;
        final /* synthetic */ Ref.ObjectRef<C8954gU<D>> c;
        final /* synthetic */ Ref.ObjectRef<C8954gU<D>> e;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Ref.ObjectRef<C8954gU<D>> objectRef, Ref.ObjectRef<C8954gU<D>> objectRef2, dyQ<? super C8954gU<D>> dyq) {
            this.e = objectRef;
            this.c = objectRef2;
            this.a = dyq;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
        @Override // o.dyQ
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(o.C8954gU<D> r6, o.InterfaceC8585dra<? super o.dpR> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.apollographql.apollo3.cache.normalized.NormalizedCache$watch$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r7
                com.apollographql.apollo3.cache.normalized.NormalizedCache$watch$1$1$emit$1 r0 = (com.apollographql.apollo3.cache.normalized.NormalizedCache$watch$1$1$emit$1) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.b = r1
                goto L18
            L13:
                com.apollographql.apollo3.cache.normalized.NormalizedCache$watch$1$1$emit$1 r0 = new com.apollographql.apollo3.cache.normalized.NormalizedCache$watch$1$1$emit$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.e
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                o.C8556dpz.d(r7)
                goto L81
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.a
                o.gU r6 = (o.C8954gU) r6
                java.lang.Object r0 = r0.d
                com.apollographql.apollo3.cache.normalized.NormalizedCache$watch$1$1 r0 = (com.apollographql.apollo3.cache.normalized.NormalizedCache$watch$1.AnonymousClass1) r0
                o.C8556dpz.d(r7)
                goto L6f
            L40:
                o.C8556dpz.d(r7)
                kotlin.jvm.internal.Ref$ObjectRef<o.gU<D>> r7 = r5.e
                r7.d = r6
                boolean r7 = r6.j
                if (r7 == 0) goto L76
                kotlin.jvm.internal.Ref$ObjectRef<o.gU<D>> r7 = r5.c
                T r7 = r7.d
                if (r7 == 0) goto L6e
                java.io.PrintStream r7 = java.lang.System.out
                java.lang.String r2 = "ApolloGraphQL: extra response received after the last one"
                r7.println(r2)
                o.dyQ<o.gU<D>> r7 = r5.a
                kotlin.jvm.internal.Ref$ObjectRef<o.gU<D>> r2 = r5.c
                T r2 = r2.d
                o.C8632dsu.d(r2)
                r0.d = r5
                r0.a = r6
                r0.b = r4
                java.lang.Object r7 = r7.emit(r2, r0)
                if (r7 != r1) goto L6e
                return r1
            L6e:
                r0 = r5
            L6f:
                kotlin.jvm.internal.Ref$ObjectRef<o.gU<D>> r7 = r0.c
                r7.d = r6
                o.dpR r6 = o.dpR.c
                return r6
            L76:
                o.dyQ<o.gU<D>> r7 = r5.a
                r0.b = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L81
                return r1
            L81:
                o.dpR r6 = o.dpR.c
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo3.cache.normalized.NormalizedCache$watch$1.AnonymousClass1.emit(o.gU, o.dra):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.apollographql.apollo3.cache.normalized.NormalizedCache$watch$1$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements drX<dyQ<? super C8954gU<D>>, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ Ref.ObjectRef<C8954gU<D>> b;
        int c;
        private /* synthetic */ Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Ref.ObjectRef<C8954gU<D>> objectRef, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.b = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.b, interfaceC8585dra);
            anonymousClass2.d = obj;
            return anonymousClass2;
        }

        @Override // o.drX
        /* renamed from: d */
        public final Object invoke(dyQ<? super C8954gU<D>> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass2) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            e = C8586drb.e();
            int i = this.c;
            if (i == 0) {
                C8556dpz.d(obj);
                dyQ dyq = (dyQ) this.d;
                C8954gU<D> c8954gU = this.b.d;
                if (c8954gU != null) {
                    C8632dsu.d(c8954gU);
                    this.c = 1;
                    if (dyq.emit(c8954gU, this) == e) {
                        return e;
                    }
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
