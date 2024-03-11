package o;

import kotlin.jvm.internal.Ref;

/* renamed from: o.dzb  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C8802dzb {

    /* renamed from: o.dzb$a */
    /* loaded from: classes5.dex */
    public static final class a<T> implements dyQ {
        final /* synthetic */ int a;
        final /* synthetic */ Ref.IntRef c;
        final /* synthetic */ dyQ<T> e;

        /* JADX WARN: Multi-variable type inference failed */
        a(Ref.IntRef intRef, int i, dyQ<? super T> dyq) {
            this.c = intRef;
            this.a = i;
            this.e = dyq;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // o.dyQ
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r6, o.InterfaceC8585dra<? super o.dpR> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.a
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                o.C8556dpz.d(r7)
                goto L47
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                o.C8556dpz.d(r7)
                kotlin.jvm.internal.Ref$IntRef r7 = r5.c
                int r2 = r7.b
                int r4 = r5.a
                if (r2 < r4) goto L4a
                o.dyQ<T> r7 = r5.e
                r0.c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                o.dpR r6 = o.dpR.c
                return r6
            L4a:
                int r2 = r2 + r3
                r7.b = r2
                o.dpR r6 = o.dpR.c
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C8802dzb.a.emit(java.lang.Object, o.dra):java.lang.Object");
        }
    }

    /* renamed from: o.dzb$b */
    /* loaded from: classes5.dex */
    public static final class b<T> implements dyQ {
        final /* synthetic */ dyQ<T> b;
        final /* synthetic */ drX<T, InterfaceC8585dra<? super Boolean>, Object> c;
        final /* synthetic */ Ref.BooleanRef e;

        /* JADX WARN: Multi-variable type inference failed */
        b(Ref.BooleanRef booleanRef, dyQ<? super T> dyq, drX<? super T, ? super InterfaceC8585dra<? super Boolean>, ? extends Object> drx) {
            this.e = booleanRef;
            this.b = dyq;
            this.c = drx;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        @Override // o.dyQ
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r7, o.InterfaceC8585dra<? super o.dpR> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1) r0
                int r1 = r0.a
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.a = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.b
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.a
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                o.C8556dpz.d(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.c
                java.lang.Object r2 = r0.e
                o.dzb$b r2 = (o.C8802dzb.b) r2
                o.C8556dpz.d(r8)
                goto L6c
            L41:
                o.C8556dpz.d(r8)
                goto L59
            L45:
                o.C8556dpz.d(r8)
                kotlin.jvm.internal.Ref$BooleanRef r8 = r6.e
                boolean r8 = r8.a
                if (r8 == 0) goto L5c
                o.dyQ<T> r8 = r6.b
                r0.a = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                o.dpR r7 = o.dpR.c
                return r7
            L5c:
                o.drX<T, o.dra<? super java.lang.Boolean>, java.lang.Object> r8 = r6.c
                r0.e = r6
                r0.c = r7
                r0.a = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.Ref$BooleanRef r8 = r2.e
                r8.a = r5
                o.dyQ<T> r8 = r2.b
                r2 = 0
                r0.e = r2
                r0.c = r2
                r0.a = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                o.dpR r7 = o.dpR.c
                return r7
            L8b:
                o.dpR r7 = o.dpR.c
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C8802dzb.b.emit(java.lang.Object, o.dra):java.lang.Object");
        }
    }

    /* renamed from: o.dzb$j */
    /* loaded from: classes5.dex */
    public static final class j<T> implements dyQ {
        final /* synthetic */ dyQ<T> c;
        final /* synthetic */ Ref.IntRef d;
        final /* synthetic */ int e;

        /* JADX WARN: Multi-variable type inference failed */
        j(Ref.IntRef intRef, int i, dyQ<? super T> dyq) {
            this.d = intRef;
            this.e = i;
            this.c = dyq;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
        @Override // o.dyQ
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r6, o.InterfaceC8585dra<? super o.dpR> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1) r0
                int r1 = r0.a
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.a = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.d
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.a
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                o.C8556dpz.d(r7)
                goto L5f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                o.C8556dpz.d(r7)
                goto L51
            L38:
                o.C8556dpz.d(r7)
                kotlin.jvm.internal.Ref$IntRef r7 = r5.d
                int r2 = r7.b
                int r2 = r2 + r4
                r7.b = r2
                int r7 = r5.e
                if (r2 >= r7) goto L54
                o.dyQ<T> r7 = r5.c
                r0.a = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                o.dpR r6 = o.dpR.c
                return r6
            L54:
                o.dyQ<T> r7 = r5.c
                r0.a = r3
                java.lang.Object r6 = o.C8802dzb.d(r7, r6, r0)
                if (r6 != r1) goto L5f
                return r1
            L5f:
                o.dpR r6 = o.dpR.c
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C8802dzb.j.emit(java.lang.Object, o.dra):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object c(o.dyQ<? super T> r4, T r5, o.InterfaceC8585dra<? super o.dpR> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.c
            o.dyQ r4 = (o.dyQ) r4
            o.C8556dpz.d(r6)
            goto L43
        L35:
            o.C8556dpz.d(r6)
            r0.c = r4
            r0.d = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8802dzb.c(o.dyQ, java.lang.Object, o.dra):java.lang.Object");
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.dzb$d */
    /* loaded from: classes5.dex */
    public static final class d<T> implements dyS<T> {
        final /* synthetic */ int a;
        final /* synthetic */ dyS d;

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
            r8 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
            o.dzP.a(r8, r7);
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
        @Override // o.dyS
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(o.dyQ<? super T> r7, o.InterfaceC8585dra<? super o.dpR> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.d
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.c
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.b
                o.dyQ r7 = (o.dyQ) r7
                o.C8556dpz.d(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                goto L55
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                o.C8556dpz.d(r8)
                kotlin.jvm.internal.Ref$IntRef r8 = new kotlin.jvm.internal.Ref$IntRef
                r8.<init>()
                o.dyS r2 = r6.d     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                o.dzb$j r4 = new o.dzb$j     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                int r5 = r6.a     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                r4.<init>(r8, r5, r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                r0.b = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                r0.c = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                java.lang.Object r7 = r2.collect(r4, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                if (r7 != r1) goto L55
                return r1
            L51:
                r8 = move-exception
                o.dzP.a(r8, r7)
            L55:
                o.dpR r7 = o.dpR.c
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C8802dzb.d.collect(o.dyQ, o.dra):java.lang.Object");
        }

        public d(dyS dys, int i) {
            this.d = dys;
            this.a = i;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.dzb$c */
    /* loaded from: classes5.dex */
    public static final class c<T> implements dyS<T> {
        final /* synthetic */ drX a;
        final /* synthetic */ dyS c;

        public c(dyS dys, drX drx) {
            this.c = dys;
            this.a = drx;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super T> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            Object e;
            Object collect = this.c.collect(new b(new Ref.BooleanRef(), dyq, this.a), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.dzb$e */
    /* loaded from: classes5.dex */
    public static final class e<T> implements dyS<T> {
        final /* synthetic */ dyS b;
        final /* synthetic */ int c;

        public e(dyS dys, int i) {
            this.b = dys;
            this.c = i;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super T> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            Object e;
            Object collect = this.b.collect(new a(new Ref.IntRef(), this.c, dyq), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }
    }

    public static final <T> dyS<T> e(dyS<? extends T> dys, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i).toString());
        }
        return new e(dys, i);
    }

    public static final <T> dyS<T> c(dyS<? extends T> dys, drX<? super T, ? super InterfaceC8585dra<? super Boolean>, ? extends Object> drx) {
        return new c(dys, drx);
    }

    public static final <T> dyS<T> b(dyS<? extends T> dys, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " should be positive").toString());
        }
        return new d(dys, i);
    }
}
