package o;

/* renamed from: o.dzd  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C8804dzd {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.dzd$a */
    /* loaded from: classes5.dex */
    public static final class a<T> implements dyS<T> {
        final /* synthetic */ drX a;
        final /* synthetic */ dyS e;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[RETURN] */
        @Override // o.dyS
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(o.dyQ<? super T> r7, o.InterfaceC8585dra<? super o.dpR> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.e
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                o.C8556dpz.d(r8)
                goto L84
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.a
                kotlinx.coroutines.flow.internal.SafeCollector r7 = (kotlinx.coroutines.flow.internal.SafeCollector) r7
                java.lang.Object r2 = r0.d
                o.dyQ r2 = (o.dyQ) r2
                java.lang.Object r4 = r0.b
                o.dzd$a r4 = (o.C8804dzd.a) r4
                o.C8556dpz.d(r8)     // Catch: java.lang.Throwable -> L44
                goto L6f
            L44:
                r8 = move-exception
                goto L8a
            L46:
                o.C8556dpz.d(r8)
                o.dqZ r8 = r0.getContext()
                kotlinx.coroutines.flow.internal.SafeCollector r2 = new kotlinx.coroutines.flow.internal.SafeCollector
                r2.<init>(r7, r8)
                o.drX r8 = r6.a     // Catch: java.lang.Throwable -> L87
                r0.b = r6     // Catch: java.lang.Throwable -> L87
                r0.d = r7     // Catch: java.lang.Throwable -> L87
                r0.a = r2     // Catch: java.lang.Throwable -> L87
                r0.c = r4     // Catch: java.lang.Throwable -> L87
                r4 = 6
                o.C8635dsx.b(r4)     // Catch: java.lang.Throwable -> L87
                java.lang.Object r8 = r8.invoke(r2, r0)     // Catch: java.lang.Throwable -> L87
                r4 = 7
                o.C8635dsx.b(r4)     // Catch: java.lang.Throwable -> L87
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r4 = r6
                r5 = r2
                r2 = r7
                r7 = r5
            L6f:
                r7.releaseIntercepted()
                o.dyS r7 = r4.e
                r8 = 0
                r0.b = r8
                r0.d = r8
                r0.a = r8
                r0.c = r3
                java.lang.Object r7 = r7.collect(r2, r0)
                if (r7 != r1) goto L84
                return r1
            L84:
                o.dpR r7 = o.dpR.c
                return r7
            L87:
                r7 = move-exception
                r8 = r7
                r7 = r2
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C8804dzd.a.collect(o.dyQ, o.dra):java.lang.Object");
        }

        public a(drX drx, dyS dys) {
            this.a = drx;
            this.e = dys;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.dzd$d */
    /* loaded from: classes5.dex */
    public static final class d<T> implements dyS<T> {
        final /* synthetic */ dyS a;
        final /* synthetic */ InterfaceC8612dsa d;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00aa A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        @Override // o.dyS
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(o.dyQ<? super T> r8, o.InterfaceC8585dra<? super o.dpR> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.b = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.c
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.b
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L54
                if (r2 == r5) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r8 = r0.e
                kotlinx.coroutines.flow.internal.SafeCollector r8 = (kotlinx.coroutines.flow.internal.SafeCollector) r8
                o.C8556dpz.d(r9)     // Catch: java.lang.Throwable -> L34
                goto L88
            L34:
                r9 = move-exception
                goto L91
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                java.lang.Object r8 = r0.e
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                o.C8556dpz.d(r9)
                goto Lab
            L46:
                java.lang.Object r8 = r0.d
                o.dyQ r8 = (o.dyQ) r8
                java.lang.Object r2 = r0.e
                o.dzd$d r2 = (o.C8804dzd.d) r2
                o.C8556dpz.d(r9)     // Catch: java.lang.Throwable -> L52
                goto L67
            L52:
                r8 = move-exception
                goto L97
            L54:
                o.C8556dpz.d(r9)
                o.dyS r9 = r7.a     // Catch: java.lang.Throwable -> L95
                r0.e = r7     // Catch: java.lang.Throwable -> L95
                r0.d = r8     // Catch: java.lang.Throwable -> L95
                r0.b = r5     // Catch: java.lang.Throwable -> L95
                java.lang.Object r9 = r9.collect(r8, r0)     // Catch: java.lang.Throwable -> L95
                if (r9 != r1) goto L66
                return r1
            L66:
                r2 = r7
            L67:
                o.dqZ r9 = r0.getContext()
                kotlinx.coroutines.flow.internal.SafeCollector r4 = new kotlinx.coroutines.flow.internal.SafeCollector
                r4.<init>(r8, r9)
                o.dsa r8 = r2.d     // Catch: java.lang.Throwable -> L8e
                r0.e = r4     // Catch: java.lang.Throwable -> L8e
                r0.d = r6     // Catch: java.lang.Throwable -> L8e
                r0.b = r3     // Catch: java.lang.Throwable -> L8e
                r9 = 6
                o.C8635dsx.b(r9)     // Catch: java.lang.Throwable -> L8e
                java.lang.Object r8 = r8.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L8e
                r9 = 7
                o.C8635dsx.b(r9)     // Catch: java.lang.Throwable -> L8e
                if (r8 != r1) goto L87
                return r1
            L87:
                r8 = r4
            L88:
                r8.releaseIntercepted()
                o.dpR r8 = o.dpR.c
                return r8
            L8e:
                r8 = move-exception
                r9 = r8
                r8 = r4
            L91:
                r8.releaseIntercepted()
                throw r9
            L95:
                r8 = move-exception
                r2 = r7
            L97:
                o.dzD r9 = new o.dzD
                r9.<init>(r8)
                o.dsa r2 = r2.d
                r0.e = r8
                r0.d = r6
                r0.b = r4
                java.lang.Object r9 = o.C8804dzd.a(r9, r2, r8, r0)
                if (r9 != r1) goto Lab
                return r1
            Lab:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C8804dzd.d.collect(o.dyQ, o.dra):java.lang.Object");
        }

        public d(dyS dys, InterfaceC8612dsa interfaceC8612dsa) {
            this.a = dys;
            this.d = interfaceC8612dsa;
        }
    }

    public static final void e(dyQ<?> dyq) {
        if (dyq instanceof dzD) {
            throw ((dzD) dyq).c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object d(o.dyQ<? super T> r4, o.InterfaceC8612dsa<? super o.dyQ<? super T>, ? super java.lang.Throwable, ? super o.InterfaceC8585dra<? super o.dpR>, ? extends java.lang.Object> r5, java.lang.Throwable r6, o.InterfaceC8585dra<? super o.dpR> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.a
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            o.C8556dpz.d(r7)     // Catch: java.lang.Throwable -> L47
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            o.C8556dpz.d(r7)
            r0.a = r6     // Catch: java.lang.Throwable -> L47
            r0.c = r3     // Catch: java.lang.Throwable -> L47
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L47
            if (r4 != r1) goto L44
            return r1
        L44:
            o.dpR r4 = o.dpR.c
            return r4
        L47:
            r4 = move-exception
            if (r6 == 0) goto L4f
            if (r6 == r4) goto L4f
            o.C8549dps.e(r4, r6)
        L4f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8804dzd.d(o.dyQ, o.dsa, java.lang.Throwable, o.dra):java.lang.Object");
    }

    public static final <T> dyS<T> b(dyS<? extends T> dys, drX<? super dyQ<? super T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return new a(drx, dys);
    }

    public static final <T> dyS<T> c(dyS<? extends T> dys, InterfaceC8612dsa<? super dyQ<? super T>, ? super Throwable, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa) {
        return new d(dys, interfaceC8612dsa);
    }
}
