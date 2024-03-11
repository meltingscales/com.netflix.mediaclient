package o;

import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1;

/* renamed from: o.dzg  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C8807dzg {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r5 == 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final <T> o.C8819dzs<T> a(o.dyS<? extends T> r5, int r6) {
        /*
            o.dys$c r0 = o.InterfaceC8792dys.a
            int r0 = r0.d()
            int r0 = o.C8653dto.e(r6, r0)
            int r0 = r0 - r6
            boolean r1 = r5 instanceof o.dzH
            if (r1 == 0) goto L3c
            r1 = r5
            o.dzH r1 = (o.dzH) r1
            o.dyS r2 = r1.e()
            if (r2 == 0) goto L3c
            int r5 = r1.c
            r3 = -3
            if (r5 == r3) goto L24
            r3 = -2
            if (r5 == r3) goto L24
            if (r5 == 0) goto L24
            r0 = r5
            goto L32
        L24:
            kotlinx.coroutines.channels.BufferOverflow r3 = r1.d
            kotlinx.coroutines.channels.BufferOverflow r4 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r3 != r4) goto L2d
            if (r5 != 0) goto L32
            goto L31
        L2d:
            if (r6 != 0) goto L31
            r0 = 1
            goto L32
        L31:
            r0 = 0
        L32:
            kotlinx.coroutines.channels.BufferOverflow r5 = r1.d
            o.dqZ r6 = r1.b
            o.dzs r1 = new o.dzs
            r1.<init>(r2, r0, r5, r6)
            return r1
        L3c:
            kotlinx.coroutines.channels.BufferOverflow r6 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.e
            o.dzs r2 = new o.dzs
            r2.<init>(r5, r0, r6, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8807dzg.a(o.dyS, int):o.dzs");
    }

    private static final <T> dxD a(dwU dwu, dqZ dqz, dyS<? extends T> dys, InterfaceC8810dzj<T> interfaceC8810dzj, InterfaceC8817dzq interfaceC8817dzq, T t) {
        return C8738dws.c(dwu, dqz, C8632dsu.c(interfaceC8817dzq, InterfaceC8817dzq.d.d()) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowKt__ShareKt$launchSharing$1(interfaceC8817dzq, dys, interfaceC8810dzj, t, null));
    }

    public static final <T> InterfaceC8822dzv<T> b(dyS<? extends T> dys, dwU dwu, InterfaceC8817dzq interfaceC8817dzq, T t) {
        C8819dzs a = a(dys, 1);
        InterfaceC8812dzl d = dzB.d(t);
        return new C8811dzk(d, a(dwu, a.a, a.c, d, interfaceC8817dzq, t));
    }

    public static final <T> InterfaceC8814dzn<T> b(InterfaceC8810dzj<T> interfaceC8810dzj) {
        return new C8813dzm(interfaceC8810dzj, null);
    }

    public static final <T> InterfaceC8822dzv<T> e(InterfaceC8812dzl<T> interfaceC8812dzl) {
        return new C8811dzk(interfaceC8812dzl, null);
    }

    public static final <T> InterfaceC8814dzn<T> a(InterfaceC8814dzn<? extends T> interfaceC8814dzn, drX<? super dyQ<? super T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return new C8826dzz(interfaceC8814dzn, drx);
    }
}
