package o;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import o.dpR;

/* loaded from: classes5.dex */
public final class dyD {
    /* JADX WARN: Removed duplicated region for block: B:41:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(o.dyK<?> r4, o.drO<o.dpR> r5, o.InterfaceC8585dra<? super o.dpR> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = (kotlinx.coroutines.channels.ProduceKt$awaitClose$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.b = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.e
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.c
            r5 = r4
            o.drO r5 = (o.drO) r5
            java.lang.Object r4 = r0.a
            o.dyK r4 = (o.dyK) r4
            o.C8556dpz.d(r6)     // Catch: java.lang.Throwable -> L79
            goto L73
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            o.C8556dpz.d(r6)
            o.dqZ r6 = r0.getContext()
            o.dxD$c r2 = o.dxD.b
            o.dqZ$b r6 = r6.get(r2)
            if (r6 != r4) goto L7e
            r0.a = r4     // Catch: java.lang.Throwable -> L79
            r0.c = r5     // Catch: java.lang.Throwable -> L79
            r0.b = r3     // Catch: java.lang.Throwable -> L79
            o.dwv r6 = new o.dwv     // Catch: java.lang.Throwable -> L79
            o.dra r2 = o.C8588drd.c(r0)     // Catch: java.lang.Throwable -> L79
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L79
            r6.h()     // Catch: java.lang.Throwable -> L79
            kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1 r2 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1     // Catch: java.lang.Throwable -> L79
            r2.<init>()     // Catch: java.lang.Throwable -> L79
            r4.d(r2)     // Catch: java.lang.Throwable -> L79
            java.lang.Object r4 = r6.b()     // Catch: java.lang.Throwable -> L79
            java.lang.Object r6 = o.C8588drd.c()     // Catch: java.lang.Throwable -> L79
            if (r4 != r6) goto L70
            o.C8592drh.c(r0)     // Catch: java.lang.Throwable -> L79
        L70:
            if (r4 != r1) goto L73
            return r1
        L73:
            r5.invoke()
            o.dpR r4 = o.dpR.c
            return r4
        L79:
            r4 = move-exception
            r5.invoke()
            throw r4
        L7e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dyD.d(o.dyK, o.drO, o.dra):java.lang.Object");
    }

    public static /* synthetic */ Object d(dyK dyk, drO dro, InterfaceC8585dra interfaceC8585dra, int i, Object obj) {
        if ((i & 1) != 0) {
            dro = new drO<dpR>() { // from class: kotlinx.coroutines.channels.ProduceKt$awaitClose$2
                public final void d() {
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    d();
                    return dpR.c;
                }
            };
        }
        return d(dyk, dro, interfaceC8585dra);
    }

    public static /* synthetic */ dyJ b(dwU dwu, dqZ dqz, int i, drX drx, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dqz = EmptyCoroutineContext.e;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return a(dwu, dqz, i, drx);
    }

    public static final <E> dyJ<E> a(dwU dwu, dqZ dqz, int i, drX<? super dyK<? super E>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return a(dwu, dqz, i, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, drx);
    }

    public static /* synthetic */ dyJ d(dwU dwu, dqZ dqz, int i, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, drM drm, drX drx, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dqz = EmptyCoroutineContext.e;
        }
        dqZ dqz2 = dqz;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if ((i2 & 8) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i2 & 16) != 0) {
            drm = null;
        }
        return a(dwu, dqz2, i3, bufferOverflow2, coroutineStart2, drm, drx);
    }

    public static final <E> dyJ<E> a(dwU dwu, dqZ dqz, int i, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, drM<? super Throwable, dpR> drm, drX<? super dyK<? super E>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        dyH dyh = new dyH(dwP.a(dwu, dqz), C8799dyz.e(i, bufferOverflow, null, 4, null));
        if (drm != null) {
            dyh.e(drm);
        }
        dyh.e(coroutineStart, (CoroutineStart) dyh, (drX<? super CoroutineStart, ? super InterfaceC8585dra<? super T>, ? extends Object>) drx);
        return dyh;
    }
}
