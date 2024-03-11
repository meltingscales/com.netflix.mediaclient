package com.apollographql.apollo3.cache.normalized;

import com.apollographql.apollo3.exception.ApolloCompositeException;
import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.exception.DefaultApolloException;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8553dpw;
import o.C8556dpz;
import o.C8576dqs;
import o.C8586drb;
import o.C8951gR;
import o.C8954gU;
import o.C9083ir;
import o.InterfaceC8585dra;
import o.InterfaceC9135jq;
import o.dpR;
import o.drX;
import o.dyQ;
import o.dyS;

/* JADX INFO: Add missing generic type declarations: [D] */
/* loaded from: classes2.dex */
public final class FetchPolicyRouterInterceptor$intercept$1<D> extends SuspendLambda implements drX<dyQ<? super C8954gU<D>>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C8951gR<D> a;
    int b;
    final /* synthetic */ InterfaceC9135jq c;
    Object d;
    Object e;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchPolicyRouterInterceptor$intercept$1(C8951gR<D> c8951gR, InterfaceC9135jq interfaceC9135jq, InterfaceC8585dra<? super FetchPolicyRouterInterceptor$intercept$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = c8951gR;
        this.c = interfaceC9135jq;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        FetchPolicyRouterInterceptor$intercept$1 fetchPolicyRouterInterceptor$intercept$1 = new FetchPolicyRouterInterceptor$intercept$1(this.a, this.c, interfaceC8585dra);
        fetchPolicyRouterInterceptor$intercept$1.g = obj;
        return fetchPolicyRouterInterceptor$intercept$1;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dyQ<? super C8954gU<D>> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((FetchPolicyRouterInterceptor$intercept$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        dyQ dyq;
        List arrayList;
        Ref.BooleanRef booleanRef;
        ApolloException defaultApolloException;
        Object y;
        Object y2;
        Object y3;
        List<ApolloException> i;
        e = C8586drb.e();
        int i2 = this.b;
        if (i2 == 0) {
            C8556dpz.d(obj);
            dyq = (dyQ) this.g;
            arrayList = new ArrayList();
            booleanRef = new Ref.BooleanRef();
            dyS c = C9083ir.e(this.a).c(this.a, this.c);
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(booleanRef, arrayList, dyq);
            this.g = dyq;
            this.d = arrayList;
            this.e = booleanRef;
            this.b = 1;
            if (c.collect(anonymousClass4, this) == e) {
                return e;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                C8556dpz.d(obj);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            booleanRef = (Ref.BooleanRef) this.e;
            arrayList = (List) this.d;
            dyq = (dyQ) this.g;
            C8556dpz.d(obj);
        }
        if (!booleanRef.a) {
            int size = arrayList.size();
            if (size == 0) {
                defaultApolloException = new DefaultApolloException("No response emitted", null, 2, null);
            } else if (size == 1) {
                y = C8576dqs.y(arrayList);
                defaultApolloException = (ApolloException) y;
            } else if (size == 2) {
                y2 = C8576dqs.y(arrayList);
                defaultApolloException = new ApolloCompositeException((Throwable) y2, (Throwable) arrayList.get(1));
            } else {
                y3 = C8576dqs.y(arrayList);
                defaultApolloException = new ApolloCompositeException((Throwable) y3, (Throwable) arrayList.get(1));
                i = C8576dqs.i(arrayList, 2);
                for (ApolloException apolloException : i) {
                    C8553dpw.c(defaultApolloException, apolloException);
                }
            }
            C8954gU e2 = new C8954gU.c(this.a.h(), this.a.j()).c(defaultApolloException).e();
            this.g = null;
            this.d = null;
            this.e = null;
            this.b = 2;
            if (dyq.emit(e2, this) == e) {
                return e;
            }
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.apollographql.apollo3.cache.normalized.FetchPolicyRouterInterceptor$intercept$1$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass4<T> implements dyQ {
        final /* synthetic */ dyQ<C8954gU<D>> c;
        final /* synthetic */ List<ApolloException> d;
        final /* synthetic */ Ref.BooleanRef e;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(Ref.BooleanRef booleanRef, List<ApolloException> list, dyQ<? super C8954gU<D>> dyq) {
            this.e = booleanRef;
            this.d = list;
            this.c = dyq;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
        @Override // o.dyQ
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(o.C8954gU<D> r9, o.InterfaceC8585dra<? super o.dpR> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof com.apollographql.apollo3.cache.normalized.FetchPolicyRouterInterceptor$intercept$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r10
                com.apollographql.apollo3.cache.normalized.FetchPolicyRouterInterceptor$intercept$1$1$emit$1 r0 = (com.apollographql.apollo3.cache.normalized.FetchPolicyRouterInterceptor$intercept$1$1$emit$1) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.e = r1
                goto L18
            L13:
                com.apollographql.apollo3.cache.normalized.FetchPolicyRouterInterceptor$intercept$1$1$emit$1 r0 = new com.apollographql.apollo3.cache.normalized.FetchPolicyRouterInterceptor$intercept$1$1$emit$1
                r0.<init>(r8, r10)
            L18:
                java.lang.Object r10 = r0.a
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.e
                r3 = 1
                if (r2 == 0) goto L36
                if (r2 != r3) goto L2e
                java.lang.Object r9 = r0.d
                com.apollographql.apollo3.cache.normalized.FetchPolicyRouterInterceptor$intercept$1$4 r9 = (com.apollographql.apollo3.cache.normalized.FetchPolicyRouterInterceptor$intercept$1.AnonymousClass4) r9
                o.C8556dpz.d(r10)
                goto Lbe
            L2e:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L36:
                o.C8556dpz.d(r10)
                kotlin.jvm.internal.Ref$BooleanRef r10 = r8.e
                boolean r10 = r10.a
                if (r10 != 0) goto L4e
                com.apollographql.apollo3.exception.ApolloException r10 = r9.a
                if (r10 == 0) goto L4e
                java.util.List<com.apollographql.apollo3.exception.ApolloException> r9 = r8.d
                o.C8632dsu.d(r10)
                r9.add(r10)
                o.dpR r9 = o.dpR.c
                return r9
            L4e:
                o.dyQ<o.gU<D>> r10 = r8.c
                o.gU$c r2 = r9.d()
                o.im r9 = o.C9083ir.a(r9)
                o.C8632dsu.d(r9)
                o.im$b r9 = r9.d()
                java.util.List<com.apollographql.apollo3.exception.ApolloException> r4 = r8.d
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r4 = r4.iterator()
            L6a:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L7c
                java.lang.Object r6 = r4.next()
                boolean r7 = r6 instanceof com.apollographql.apollo3.exception.CacheMissException
                if (r7 == 0) goto L6a
                r5.add(r6)
                goto L6a
            L7c:
                java.lang.Object r4 = o.C8570dqm.d(r5)
                com.apollographql.apollo3.exception.CacheMissException r4 = (com.apollographql.apollo3.exception.CacheMissException) r4
                o.im$b r9 = r9.e(r4)
                java.util.List<com.apollographql.apollo3.exception.ApolloException> r4 = r8.d
                java.util.Iterator r4 = r4.iterator()
            L8c:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L9f
                java.lang.Object r5 = r4.next()
                r6 = r5
                com.apollographql.apollo3.exception.ApolloException r6 = (com.apollographql.apollo3.exception.ApolloException) r6
                boolean r6 = r6 instanceof com.apollographql.apollo3.exception.CacheMissException
                r6 = r6 ^ r3
                if (r6 == 0) goto L8c
                goto La0
            L9f:
                r5 = 0
            La0:
                com.apollographql.apollo3.exception.ApolloException r5 = (com.apollographql.apollo3.exception.ApolloException) r5
                o.im$b r9 = r9.c(r5)
                o.im r9 = r9.b()
                o.gU$c r9 = o.C9083ir.c(r2, r9)
                o.gU r9 = r9.e()
                r0.d = r8
                r0.e = r3
                java.lang.Object r9 = r10.emit(r9, r0)
                if (r9 != r1) goto Lbd
                return r1
            Lbd:
                r9 = r8
            Lbe:
                kotlin.jvm.internal.Ref$BooleanRef r9 = r9.e
                r9.a = r3
                o.dpR r9 = o.dpR.c
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo3.cache.normalized.FetchPolicyRouterInterceptor$intercept$1.AnonymousClass4.emit(o.gU, o.dra):java.lang.Object");
        }
    }
}
