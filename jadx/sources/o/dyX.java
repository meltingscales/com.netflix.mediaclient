package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public final /* synthetic */ class dyX {
    public static final <T> Object d(dyS<? extends T> dys, List<T> list, InterfaceC8585dra<? super List<? extends T>> interfaceC8585dra) {
        return dyR.a((dyS) dys, list, (InterfaceC8585dra<? super List<T>>) interfaceC8585dra);
    }

    public static /* synthetic */ Object e(dyS dys, List list, InterfaceC8585dra interfaceC8585dra, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return dyR.e(dys, list, interfaceC8585dra);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object d(o.dyS<? extends T> r4, C r5, o.InterfaceC8585dra<? super C> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1 r0 = (kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1) r0
            int r1 = r0.a
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.a = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1 r0 = new kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.e
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.a
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.d
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            o.C8556dpz.d(r6)
            goto L49
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            o.C8556dpz.d(r6)
            o.dyX$d r6 = new o.dyX$d
            r6.<init>(r5)
            r0.d = r5
            r0.a = r3
            java.lang.Object r4 = r4.collect(r6, r0)
            if (r4 != r1) goto L49
            return r1
        L49:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dyX.d(o.dyS, java.util.Collection, o.dra):java.lang.Object");
    }

    /* loaded from: classes5.dex */
    public static final class d<T> implements dyQ {
        final /* synthetic */ Collection c;

        d(Collection collection) {
            this.c = collection;
        }

        @Override // o.dyQ
        public final Object emit(T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            this.c.add(t);
            return dpR.c;
        }
    }
}
