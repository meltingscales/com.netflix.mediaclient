package o;

import kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1;

/* renamed from: o.dza */
/* loaded from: classes5.dex */
public final /* synthetic */ class C8801dza {
    private static final int e = dAL.c("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    /* renamed from: o.dza$a */
    /* loaded from: classes5.dex */
    public static final class a<R> implements dyS<dyS<? extends R>> {
        final /* synthetic */ drX a;
        final /* synthetic */ dyS b;

        /* renamed from: o.dza$a$3 */
        /* loaded from: classes5.dex */
        public static final class AnonymousClass3<T> implements dyQ {
            final /* synthetic */ dyQ b;
            final /* synthetic */ drX c;

            public AnonymousClass3(dyQ dyq, drX drx) {
                this.b = dyq;
                this.c = drx;
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x005c A[RETURN] */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r7, o.InterfaceC8585dra r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.e = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.c
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    o.C8556dpz.d(r8)
                    goto L5d
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.d
                    o.dyQ r7 = (o.dyQ) r7
                    o.C8556dpz.d(r8)
                    goto L51
                L3c:
                    o.C8556dpz.d(r8)
                    o.dyQ r8 = r6.b
                    o.drX r2 = r6.c
                    r0.d = r8
                    r0.e = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.d = r2
                    r0.e = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    o.dpR r7 = o.dpR.c
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C8801dza.a.AnonymousClass3.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }

        public a(dyS dys, drX drx) {
            this.b = dys;
            this.a = drx;
        }

        @Override // o.dyS
        public Object collect(dyQ dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.b.collect(new AnonymousClass3(dyq, this.a), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }
    }

    /* renamed from: o.dza$b */
    /* loaded from: classes5.dex */
    public static final class b<R> implements dyS<dyS<? extends R>> {
        final /* synthetic */ dyS b;
        final /* synthetic */ drX c;

        /* renamed from: o.dza$b$4 */
        /* loaded from: classes5.dex */
        public static final class AnonymousClass4<T> implements dyQ {
            final /* synthetic */ dyQ a;
            final /* synthetic */ drX b;

            public AnonymousClass4(dyQ dyq, drX drx) {
                this.a = dyq;
                this.b = drx;
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x005c A[RETURN] */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r7, o.InterfaceC8585dra r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.e = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.d
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    o.C8556dpz.d(r8)
                    goto L5d
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.a
                    o.dyQ r7 = (o.dyQ) r7
                    o.C8556dpz.d(r8)
                    goto L51
                L3c:
                    o.C8556dpz.d(r8)
                    o.dyQ r8 = r6.a
                    o.drX r2 = r6.b
                    r0.a = r8
                    r0.e = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.a = r2
                    r0.e = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    o.dpR r7 = o.dpR.c
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C8801dza.b.AnonymousClass4.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }

        public b(dyS dys, drX drx) {
            this.b = dys;
            this.c = drx;
        }

        @Override // o.dyS
        public Object collect(dyQ dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.b.collect(new AnonymousClass4(dyq, this.c), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }
    }

    public static /* synthetic */ dyS b(dyS dys, int i, drX drx, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = e;
        }
        return dyR.e(dys, i, drx);
    }

    /* renamed from: o.dza$e */
    /* loaded from: classes5.dex */
    public static final class e<T> implements dyQ {
        final /* synthetic */ dyQ<T> d;

        /* JADX WARN: Multi-variable type inference failed */
        e(dyQ<? super T> dyq) {
            this.d = dyq;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
        @Override // o.dyQ
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(o.dyS<? extends T> r5, o.InterfaceC8585dra<? super o.dpR> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1$emit$1) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.b = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.e
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.b
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                o.C8556dpz.d(r6)
                goto L3f
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                o.C8556dpz.d(r6)
                o.dyQ<T> r6 = r4.d
                r0.b = r3
                java.lang.Object r5 = o.dyR.e(r6, r5, r0)
                if (r5 != r1) goto L3f
                return r1
            L3f:
                o.dpR r5 = o.dpR.c
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C8801dza.e.emit(o.dyS, o.dra):java.lang.Object");
        }
    }

    /* renamed from: o.dza$c */
    /* loaded from: classes5.dex */
    public static final class c<T> implements dyS<T> {
        final /* synthetic */ dyS b;

        public c(dyS dys) {
            this.b = dys;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super T> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            Object e;
            Object collect = this.b.collect(new e(dyq), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }
    }

    public static final <T> dyS<T> c(Iterable<? extends dyS<? extends T>> iterable) {
        return new dzK(iterable, null, 0, null, 14, null);
    }

    public static final <T> dyS<T> e(dyS<? extends T>... dysArr) {
        Iterable t;
        t = C8563dqf.t(dysArr);
        return dyR.a(t);
    }

    public static final <T> dyS<T> e(dyS<? extends dyS<? extends T>> dys, int i) {
        if (i > 0) {
            return i == 1 ? dyR.c((dyS) dys) : new dzJ(dys, i, null, 0, null, 28, null);
        }
        throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i).toString());
    }

    public static final <T, R> dyS<R> a(dyS<? extends T> dys, InterfaceC8612dsa<? super dyQ<? super R>, ? super T, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa) {
        return new dzN(interfaceC8612dsa, dys, null, 0, null, 28, null);
    }

    public static final <T, R> dyS<R> b(dyS<? extends T> dys, drX<? super T, ? super InterfaceC8585dra<? super R>, ? extends Object> drx) {
        return dyR.c((dyS) dys, (InterfaceC8612dsa) new FlowKt__MergeKt$mapLatest$1(drx, null));
    }

    public static final <T, R> dyS<R> e(dyS<? extends T> dys, drX<? super T, ? super InterfaceC8585dra<? super dyS<? extends R>>, ? extends Object> drx) {
        return dyR.c((dyS) new a(dys, drx));
    }

    public static final <T, R> dyS<R> a(dyS<? extends T> dys, int i, drX<? super T, ? super InterfaceC8585dra<? super dyS<? extends R>>, ? extends Object> drx) {
        return dyR.c(new b(dys, drx), i);
    }

    public static final <T> dyS<T> c(dyS<? extends dyS<? extends T>> dys) {
        return new c(dys);
    }
}
