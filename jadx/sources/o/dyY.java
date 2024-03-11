package o;

/* loaded from: classes5.dex */
public final /* synthetic */ class dyY {
    public static final <T> Object b(dyQ<? super T> dyq, dyJ<? extends T> dyj, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object c = c(dyq, dyj, true, interfaceC8585dra);
        e = C8586drb.e();
        return c == e ? c : dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #0 {all -> 0x009b, blocks: (B:13:0x0036, B:22:0x0060, B:26:0x0075, B:28:0x007d, B:18:0x0052, B:21:0x005c), top: B:41:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008f -> B:14:0x0039). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object c(o.dyQ<? super T> r6, o.dyJ<? extends T> r7, boolean r8, o.InterfaceC8585dra<? super o.dpR> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.j
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L56
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            boolean r8 = r0.a
            java.lang.Object r6 = r0.b
            o.dyy r6 = (o.InterfaceC8798dyy) r6
            java.lang.Object r7 = r0.e
            o.dyJ r7 = (o.dyJ) r7
            java.lang.Object r2 = r0.d
            o.dyQ r2 = (o.dyQ) r2
            o.C8556dpz.d(r9)     // Catch: java.lang.Throwable -> L9b
        L39:
            r9 = r6
            r6 = r2
            goto L60
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L44:
            boolean r8 = r0.a
            java.lang.Object r6 = r0.b
            o.dyy r6 = (o.InterfaceC8798dyy) r6
            java.lang.Object r7 = r0.e
            o.dyJ r7 = (o.dyJ) r7
            java.lang.Object r2 = r0.d
            o.dyQ r2 = (o.dyQ) r2
            o.C8556dpz.d(r9)     // Catch: java.lang.Throwable -> L9b
            goto L75
        L56:
            o.C8556dpz.d(r9)
            o.dyR.b(r6)
            o.dyy r9 = r7.ct_()     // Catch: java.lang.Throwable -> L9b
        L60:
            r0.d = r6     // Catch: java.lang.Throwable -> L9b
            r0.e = r7     // Catch: java.lang.Throwable -> L9b
            r0.b = r9     // Catch: java.lang.Throwable -> L9b
            r0.a = r8     // Catch: java.lang.Throwable -> L9b
            r0.c = r4     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r2 = r9.c(r0)     // Catch: java.lang.Throwable -> L9b
            if (r2 != r1) goto L71
            return r1
        L71:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L75:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L9b
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L9b
            if (r9 == 0) goto L92
            java.lang.Object r9 = r6.a()     // Catch: java.lang.Throwable -> L9b
            r0.d = r2     // Catch: java.lang.Throwable -> L9b
            r0.e = r7     // Catch: java.lang.Throwable -> L9b
            r0.b = r6     // Catch: java.lang.Throwable -> L9b
            r0.a = r8     // Catch: java.lang.Throwable -> L9b
            r0.c = r3     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L9b
            if (r9 != r1) goto L39
            return r1
        L92:
            if (r8 == 0) goto L98
            r6 = 0
            o.dyA.c(r7, r6)
        L98:
            o.dpR r6 = o.dpR.c
            return r6
        L9b:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L9d
        L9d:
            r9 = move-exception
            if (r8 == 0) goto La3
            o.dyA.c(r7, r6)
        La3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dyY.c(o.dyQ, o.dyJ, boolean, o.dra):java.lang.Object");
    }
}
