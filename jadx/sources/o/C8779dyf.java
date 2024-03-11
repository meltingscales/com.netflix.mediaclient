package o;

import kotlinx.coroutines.TimeoutCancellationException;

/* renamed from: o.dyf  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8779dyf {
    public static final <T> Object a(long j, drX<? super dwU, ? super InterfaceC8585dra<? super T>, ? extends Object> drx, InterfaceC8585dra<? super T> interfaceC8585dra) {
        Object e;
        if (j <= 0) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        Object c = c(new RunnableC8777dyd(j, interfaceC8585dra), drx);
        e = C8586drb.e();
        if (c == e) {
            C8592drh.c(interfaceC8585dra);
        }
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Type inference failed for: r2v1, types: [o.dyd, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object c(long r7, o.drX<? super o.dwU, ? super o.InterfaceC8585dra<? super T>, ? extends java.lang.Object> r9, o.InterfaceC8585dra<? super T> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = (kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.d = r1
            goto L18
        L13:
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = new kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.e
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.c
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            java.lang.Object r8 = r0.a
            o.drX r8 = (o.drX) r8
            o.C8556dpz.d(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L32
            goto L6b
        L32:
            r8 = move-exception
            goto L6f
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            o.C8556dpz.d(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r0.a = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r0.c = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r0.b = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r0.d = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            o.dyd r2 = new o.dyd     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            r10.d = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            java.lang.Object r7 = c(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            java.lang.Object r8 = o.C8588drd.c()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
            if (r7 != r8) goto L67
            o.C8592drh.c(r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L6c
        L67:
            if (r7 != r1) goto L6a
            return r1
        L6a:
            r10 = r7
        L6b:
            return r10
        L6c:
            r7 = move-exception
            r8 = r7
            r7 = r10
        L6f:
            o.dxD r9 = r8.b
            T r7 = r7.d
            if (r9 != r7) goto L76
            return r3
        L76:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8779dyf.c(long, o.drX, o.dra):java.lang.Object");
    }

    private static final <U, T extends U> Object c(RunnableC8777dyd<U, ? super T> runnableC8777dyd, drX<? super dwU, ? super InterfaceC8585dra<? super T>, ? extends Object> drx) {
        dxG.e(runnableC8777dyd, C8749dxc.c(runnableC8777dyd.e.getContext()).e(runnableC8777dyd.d, runnableC8777dyd, runnableC8777dyd.getContext()));
        return dAV.d(runnableC8777dyd, runnableC8777dyd, drx);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r4 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlinx.coroutines.TimeoutCancellationException a(long r2, o.InterfaceC8748dxb r4, o.dxD r5) {
        /*
            boolean r0 = r4 instanceof o.InterfaceC8750dxd
            if (r0 == 0) goto L7
            o.dxd r4 = (o.InterfaceC8750dxd) r4
            goto L8
        L7:
            r4 = 0
        L8:
            if (r4 == 0) goto L18
            o.duI$b r0 = o.duI.d
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.a
            long r0 = o.duM.e(r2, r0)
            java.lang.String r4 = r4.e(r0)
            if (r4 != 0) goto L2e
        L18:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Timed out waiting for "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = " ms"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L2e:
            kotlinx.coroutines.TimeoutCancellationException r2 = new kotlinx.coroutines.TimeoutCancellationException
            r2.<init>(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8779dyf.a(long, o.dxb, o.dxD):kotlinx.coroutines.TimeoutCancellationException");
    }
}
