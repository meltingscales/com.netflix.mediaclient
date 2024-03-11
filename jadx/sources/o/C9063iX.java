package o;

import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.channels.BufferOverflow;
import o.AbstractC9054iO;
import o.AbstractC9055iP;
import o.C8632dsu;
import o.C9051iL;
import o.C9063iX;
import o.C9065iZ;
import o.InterfaceC8991hE;
import o.InterfaceC9034hv;
import o.InterfaceC9041iB;
import o.InterfaceC9046iG;
import o.dpR;
import o.drM;

/* renamed from: o.iX  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9063iX implements InterfaceC9080io {
    private final InterfaceC9042iC a;
    private final InterfaceC8554dpx b;
    private final InterfaceC8810dzj<Set<String>> c;
    private final InterfaceC9046iG d;
    private final InterfaceC8814dzn<Set<String>> e;
    private final C9121jc g;

    @Override // o.InterfaceC9080io
    public InterfaceC8814dzn<Set<String>> a() {
        return this.e;
    }

    public C9063iX(final AbstractC9054iO abstractC9054iO, InterfaceC9042iC interfaceC9042iC, InterfaceC9046iG interfaceC9046iG) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) abstractC9054iO, "");
        C8632dsu.c((Object) interfaceC9042iC, "");
        C8632dsu.c((Object) interfaceC9046iG, "");
        this.a = interfaceC9042iC;
        this.d = interfaceC9046iG;
        InterfaceC8810dzj<Set<String>> b2 = C8820dzt.b(0, 10, BufferOverflow.DROP_OLDEST, 1, null);
        this.c = b2;
        this.e = dyR.e((InterfaceC8810dzj) b2);
        b = dpB.b(new drO<C9065iZ>() { // from class: com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$cache$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final C9065iZ invoke() {
                AbstractC9055iP a = new C9065iZ().a(AbstractC9054iO.this.d());
                C8632dsu.d(a);
                return (C9065iZ) a;
            }
        });
        this.b = b;
        this.g = new C9121jc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C9065iZ b() {
        return (C9065iZ) this.b.getValue();
    }

    @Override // o.InterfaceC9080io
    public Object c(Set<String> set, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        if (set.isEmpty()) {
            return dpR.c;
        }
        Object emit = this.c.emit(set, interfaceC8585dra);
        e = C8586drb.e();
        return emit == e ? emit : dpR.c;
    }

    @Override // o.InterfaceC9080io
    public boolean e() {
        this.g.d(new drO<dpR>() { // from class: com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$clearAll$1
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                c();
                return dpR.c;
            }

            public final void c() {
                C9065iZ b;
                b = C9063iX.this.b();
                b.c();
            }
        });
        return true;
    }

    @Override // o.InterfaceC9080io
    public <D extends InterfaceC8991hE.b> Map<String, C9053iN> a(InterfaceC8991hE<D> interfaceC8991hE, D d, C9028hp c9028hp) {
        C8632dsu.c((Object) interfaceC8991hE, "");
        C8632dsu.c((Object) d, "");
        C8632dsu.c((Object) c9028hp, "");
        return C9051iL.c(interfaceC8991hE, d, c9028hp, this.a);
    }

    @Override // o.InterfaceC9080io
    public <D extends InterfaceC8991hE.b> Object b(final InterfaceC8991hE<D> interfaceC8991hE, C9028hp c9028hp, final C9044iE c9044iE, InterfaceC8585dra<? super D> interfaceC8585dra) {
        final InterfaceC9034hv.c c = C9036hx.c(interfaceC8991hE, c9028hp, true);
        return C9051iL.e((InterfaceC9041iB) this.g.e(new drO<InterfaceC9041iB>() { // from class: com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$readOperation$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final InterfaceC9041iB invoke() {
                C9065iZ b;
                InterfaceC9046iG interfaceC9046iG;
                InterfaceC9034hv interfaceC9034hv = interfaceC8991hE;
                b = this.b();
                interfaceC9046iG = this.d;
                return C9051iL.a(interfaceC9034hv, b, interfaceC9046iG, c9044iE, c);
            }
        }), interfaceC8991hE.e(), c9028hp, c);
    }

    @Override // o.InterfaceC9080io
    public <R> Object a(final drM<? super AbstractC9055iP, ? extends R> drm, InterfaceC8585dra<? super R> interfaceC8585dra) {
        return this.g.d(new drO<R>() { // from class: com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$accessCache$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // o.drO
            public final R invoke() {
                C9065iZ b;
                drM<AbstractC9055iP, R> drm2 = drm;
                b = this.b();
                return drm2.invoke(b);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // o.InterfaceC9080io
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <D extends o.InterfaceC8991hE.b> java.lang.Object d(o.InterfaceC8991hE<D> r9, D r10, o.C9028hp r11, o.C9044iE r12, boolean r13, o.InterfaceC8585dra<? super java.util.Set<java.lang.String>> r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$writeOperation$1
            if (r0 == 0) goto L13
            r0 = r14
            com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$writeOperation$1 r0 = (com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$writeOperation$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.b = r1
            goto L18
        L13:
            com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$writeOperation$1 r0 = new com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$writeOperation$1
            r0.<init>(r8, r14)
        L18:
            r7 = r0
            java.lang.Object r14 = r7.c
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r7.b
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            o.C8556dpz.d(r14)
            goto L44
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            o.C8556dpz.d(r14)
            r7.b = r2
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r12
            r5 = r13
            r6 = r11
            java.lang.Object r14 = r1.d(r2, r3, r4, r5, r6, r7)
            if (r14 != r0) goto L44
            return r0
        L44:
            kotlin.Pair r14 = (kotlin.Pair) r14
            java.lang.Object r9 = r14.a()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9063iX.d(o.hE, o.hE$b, o.hp, o.iE, boolean, o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <D extends o.InterfaceC8991hE.b> java.lang.Object d(o.InterfaceC8991hE<D> r5, D r6, final o.C9044iE r7, boolean r8, o.C9028hp r9, o.InterfaceC8585dra<? super kotlin.Pair<? extends java.util.Set<o.C9053iN>, ? extends java.util.Set<java.lang.String>>> r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$writeOperationWithRecords$1
            if (r0 == 0) goto L13
            r0 = r10
            com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$writeOperationWithRecords$1 r0 = (com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$writeOperationWithRecords$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.b = r1
            goto L18
        L13:
            com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$writeOperationWithRecords$1 r0 = new com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$writeOperationWithRecords$1
            r0.<init>(r4, r10)
        L18:
            java.lang.Object r10 = r0.c
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.e
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r0.a
            java.util.Set r6 = (java.util.Set) r6
            o.C8556dpz.d(r10)
            goto L68
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            o.C8556dpz.d(r10)
            o.iC r10 = r4.a
            java.util.Map r5 = o.C9051iL.c(r5, r6, r9, r10)
            java.util.Collection r5 = r5.values()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Set r6 = o.C8570dqm.y(r5)
            o.jc r5 = r4.g
            com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$writeOperationWithRecords$changedKeys$1 r9 = new com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$writeOperationWithRecords$changedKeys$1
            r9.<init>()
            java.lang.Object r5 = r5.d(r9)
            java.util.Set r5 = (java.util.Set) r5
            if (r8 == 0) goto L68
            r0.a = r6
            r0.e = r5
            r0.b = r3
            java.lang.Object r7 = r4.c(r5, r0)
            if (r7 != r1) goto L68
            return r1
        L68:
            kotlin.Pair r5 = o.dpD.a(r6, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9063iX.d(o.hE, o.hE$b, o.iE, boolean, o.hp, o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // o.InterfaceC9080io
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <D extends o.InterfaceC8991hE.b> java.lang.Object a(o.InterfaceC8991hE<D> r5, D r6, java.util.UUID r7, o.C9028hp r8, boolean r9, o.InterfaceC8585dra<? super java.util.Set<java.lang.String>> r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$writeOptimisticUpdates$1
            if (r0 == 0) goto L13
            r0 = r10
            com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$writeOptimisticUpdates$1 r0 = (com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$writeOptimisticUpdates$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.b = r1
            goto L18
        L13:
            com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$writeOptimisticUpdates$1 r0 = new com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$writeOptimisticUpdates$1
            r0.<init>(r4, r10)
        L18:
            java.lang.Object r10 = r0.e
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.d
            java.util.Set r5 = (java.util.Set) r5
            o.C8556dpz.d(r10)
            goto L8a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            o.C8556dpz.d(r10)
            o.iC r10 = r4.a
            java.util.Map r5 = o.C9051iL.c(r5, r6, r8, r10)
            java.util.Collection r5 = r5.values()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r8 = 10
            int r8 = o.C8570dqm.a(r5, r8)
            r6.<init>(r8)
            java.util.Iterator r5 = r5.iterator()
        L53:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L70
            java.lang.Object r8 = r5.next()
            o.iN r8 = (o.C9053iN) r8
            java.lang.String r10 = r8.e()
            java.util.Map r8 = r8.d()
            o.iN r2 = new o.iN
            r2.<init>(r10, r8, r7)
            r6.add(r2)
            goto L53
        L70:
            o.jc r5 = r4.g
            com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$writeOptimisticUpdates$changedKeys$1 r7 = new com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$writeOptimisticUpdates$changedKeys$1
            r7.<init>()
            java.lang.Object r5 = r5.d(r7)
            java.util.Set r5 = (java.util.Set) r5
            if (r9 == 0) goto L8a
            r0.d = r5
            r0.b = r3
            java.lang.Object r6 = r4.c(r5, r0)
            if (r6 != r1) goto L8a
            return r1
        L8a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9063iX.a(o.hE, o.hE$b, java.util.UUID, o.hp, boolean, o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // o.InterfaceC9080io
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(final java.util.UUID r5, boolean r6, o.InterfaceC8585dra<? super java.util.Set<java.lang.String>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$rollbackOptimisticUpdates$1
            if (r0 == 0) goto L13
            r0 = r7
            com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$rollbackOptimisticUpdates$1 r0 = (com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$rollbackOptimisticUpdates$1) r0
            int r1 = r0.a
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.a = r1
            goto L18
        L13:
            com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$rollbackOptimisticUpdates$1 r0 = new com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$rollbackOptimisticUpdates$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.a
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.d
            java.util.Set r5 = (java.util.Set) r5
            o.C8556dpz.d(r7)
            goto L52
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            o.C8556dpz.d(r7)
            o.jc r7 = r4.g
            com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$rollbackOptimisticUpdates$changedKeys$1 r2 = new com.apollographql.apollo3.cache.normalized.internal.DefaultApolloStore$rollbackOptimisticUpdates$changedKeys$1
            r2.<init>()
            java.lang.Object r5 = r7.d(r2)
            java.util.Set r5 = (java.util.Set) r5
            if (r6 == 0) goto L52
            r0.d = r5
            r0.a = r3
            java.lang.Object r6 = r4.c(r5, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9063iX.c(java.util.UUID, boolean, o.dra):java.lang.Object");
    }
}
