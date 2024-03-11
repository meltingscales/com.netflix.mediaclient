package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final /* synthetic */ class dyT {
    public static final <T> dyS<T> a(drX<? super dyQ<? super T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return new C8815dzo(drx);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class c<T> implements dyS<T> {
        final /* synthetic */ Iterable c;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        @Override // o.dyS
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(o.dyQ<? super T> r5, o.InterfaceC8585dra<? super o.dpR> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1 r0 = (kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.b = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.d
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.b
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r5 = r0.e
                java.util.Iterator r5 = (java.util.Iterator) r5
                java.lang.Object r2 = r0.a
                o.dyQ r2 = (o.dyQ) r2
                o.C8556dpz.d(r6)
                goto L44
            L31:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L39:
                o.C8556dpz.d(r6)
                java.lang.Iterable r6 = r4.c
                java.util.Iterator r6 = r6.iterator()
                r2 = r5
                r5 = r6
            L44:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L5b
                java.lang.Object r6 = r5.next()
                r0.a = r2
                r0.e = r5
                r0.b = r3
                java.lang.Object r6 = r2.emit(r6, r0)
                if (r6 != r1) goto L44
                return r1
            L5b:
                o.dpR r5 = o.dpR.c
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dyT.c.collect(o.dyQ, o.dra):java.lang.Object");
        }

        public c(Iterable iterable) {
            this.c = iterable;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class d<T> implements dyS<T> {
        final /* synthetic */ Object[] a;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005d -> B:19:0x0060). Please submit an issue!!! */
        @Override // o.dyS
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(o.dyQ<? super T> r8, o.InterfaceC8585dra<? super o.dpR> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.d = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.j
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.d
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r8 = r0.e
                int r2 = r0.c
                java.lang.Object r4 = r0.b
                o.dyQ r4 = (o.dyQ) r4
                java.lang.Object r5 = r0.a
                o.dyT$d r5 = (o.dyT.d) r5
                o.C8556dpz.d(r9)
                r9 = r4
                goto L60
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                o.C8556dpz.d(r9)
                java.lang.Object[] r9 = r7.a
                int r9 = r9.length
                r2 = 0
                r5 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L49:
                if (r2 >= r8) goto L62
                java.lang.Object[] r4 = r5.a
                r4 = r4[r2]
                r0.a = r5
                r0.b = r9
                r0.c = r2
                r0.e = r8
                r0.d = r3
                java.lang.Object r4 = r9.emit(r4, r0)
                if (r4 != r1) goto L60
                return r1
            L60:
                int r2 = r2 + r3
                goto L49
            L62:
                o.dpR r8 = o.dpR.c
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dyT.d.collect(o.dyQ, o.dra):java.lang.Object");
        }

        public d(Object[] objArr) {
            this.a = objArr;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class a<T> implements dyS<T> {
        final /* synthetic */ Object b;

        public a(Object obj) {
            this.b = obj;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super T> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            Object e;
            Object emit = dyq.emit((Object) this.b, interfaceC8585dra);
            e = C8586drb.e();
            return emit == e ? emit : dpR.c;
        }
    }

    public static final <T> dyS<T> e(drX<? super dyK<? super T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return new dyL(drx, null, 0, null, 14, null);
    }

    public static final <T> dyS<T> d(Iterable<? extends T> iterable) {
        return new c(iterable);
    }

    public static final <T> dyS<T> a(T... tArr) {
        return new d(tArr);
    }

    public static final <T> dyS<T> d(T t) {
        return new a(t);
    }
}
