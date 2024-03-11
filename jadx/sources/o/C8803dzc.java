package o;

import kotlin.jvm.internal.Ref;

/* renamed from: o.dzc  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C8803dzc {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.dzc$c */
    /* loaded from: classes5.dex */
    public static final class c<T> implements dyS<T> {
        final /* synthetic */ dyS a;
        final /* synthetic */ InterfaceC8612dsa b;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
        @Override // o.dyS
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(o.dyQ<? super T> r6, o.InterfaceC8585dra<? super o.dpR> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1) r0
                int r1 = r0.a
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.a = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.b
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.a
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                o.C8556dpz.d(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.e
                o.dyQ r6 = (o.dyQ) r6
                java.lang.Object r2 = r0.c
                o.dzc$c r2 = (o.C8803dzc.c) r2
                o.C8556dpz.d(r7)
                goto L53
            L40:
                o.C8556dpz.d(r7)
                o.dyS r7 = r5.a
                r0.c = r5
                r0.e = r6
                r0.a = r4
                java.lang.Object r7 = o.dyR.d(r7, r6, r0)
                if (r7 != r1) goto L52
                return r1
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                o.dsa r2 = r2.b
                r4 = 0
                r0.c = r4
                r0.e = r4
                r0.a = r3
                r3 = 6
                o.C8635dsx.b(r3)
                java.lang.Object r6 = r2.invoke(r6, r7, r0)
                r7 = 7
                o.C8635dsx.b(r7)
                if (r6 != r1) goto L6f
                return r1
            L6f:
                o.dpR r6 = o.dpR.c
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C8803dzc.c.collect(o.dyQ, o.dra):java.lang.Object");
        }

        public c(dyS dys, InterfaceC8612dsa interfaceC8612dsa) {
            this.a = dys;
            this.b = interfaceC8612dsa;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object d(o.dyS<? extends T> r4, o.dyQ<? super T> r5, o.InterfaceC8585dra<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.b = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.c
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            o.C8556dpz.d(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L54
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            o.C8556dpz.d(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            o.dzc$d r2 = new o.dzc$d     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.c = r6     // Catch: java.lang.Throwable -> L51
            r0.b = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r4 = move-exception
            r5 = r4
            r4 = r6
        L54:
            T r4 = r4.d
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = a(r5, r4)
            if (r6 != 0) goto L77
            o.dqZ r6 = r0.getContext()
            boolean r6 = d(r5, r6)
            if (r6 != 0) goto L77
            if (r4 != 0) goto L6b
            return r5
        L6b:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L73
            o.C8549dps.e(r4, r5)
            throw r4
        L73:
            o.C8549dps.e(r5, r4)
            throw r5
        L77:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8803dzc.d(o.dyS, o.dyQ, o.dra):java.lang.Object");
    }

    /* renamed from: o.dzc$d */
    /* loaded from: classes5.dex */
    public static final class d<T> implements dyQ {
        final /* synthetic */ Ref.ObjectRef<Throwable> b;
        final /* synthetic */ dyQ<T> e;

        /* JADX WARN: Multi-variable type inference failed */
        d(dyQ<? super T> dyq, Ref.ObjectRef<Throwable> objectRef) {
            this.e = dyq;
            this.b = objectRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        @Override // o.dyQ
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r5, o.InterfaceC8585dra<? super o.dpR> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1) r0
                int r1 = r0.a
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.a = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.d
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.a
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.c
                o.dzc$d r5 = (o.C8803dzc.d) r5
                o.C8556dpz.d(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4d
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                o.C8556dpz.d(r6)
                o.dyQ<T> r6 = r4.e     // Catch: java.lang.Throwable -> L4a
                r0.c = r4     // Catch: java.lang.Throwable -> L4a
                r0.a = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                o.dpR r5 = o.dpR.c
                return r5
            L4a:
                r5 = move-exception
                r6 = r5
                r5 = r4
            L4d:
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r5 = r5.b
                r5.d = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C8803dzc.d.emit(java.lang.Object, o.dra):java.lang.Object");
        }
    }

    private static final boolean d(Throwable th, dqZ dqz) {
        dxD dxd = (dxD) dqz.get(dxD.b);
        if (dxd == null || !dxd.g()) {
            return false;
        }
        return a(th, dxd.i());
    }

    public static final <T> dyS<T> a(dyS<? extends T> dys, InterfaceC8612dsa<? super dyQ<? super T>, ? super Throwable, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa) {
        return new c(dys, interfaceC8612dsa);
    }

    private static final boolean a(Throwable th, Throwable th2) {
        return th2 != null && C8632dsu.c(th2, th);
    }
}
