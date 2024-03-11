package o;

import kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2;
import kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1;

/* loaded from: classes5.dex */
public final class dzO {
    public static final <R, T> Object c(dyQ<? super R> dyq, dyS<? extends T>[] dysArr, drO<T[]> dro, InterfaceC8612dsa<? super dyQ<? super R>, ? super T[], ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object d = dzR.d(new CombineKt$combineInternal$2(dysArr, dro, interfaceC8612dsa, dyq, null), interfaceC8585dra);
        e = C8586drb.e();
        return d == e ? d : dpR.c;
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes5.dex */
    public static final class c<R> implements dyS<R> {
        final /* synthetic */ dyS a;
        final /* synthetic */ dyS b;
        final /* synthetic */ InterfaceC8612dsa c;

        public c(dyS dys, dyS dys2, InterfaceC8612dsa interfaceC8612dsa) {
            this.a = dys;
            this.b = dys2;
            this.c = interfaceC8612dsa;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super R> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            Object e;
            Object b = dwY.b(new CombineKt$zipImpl$1$1(dyq, this.a, this.b, this.c, null), interfaceC8585dra);
            e = C8586drb.e();
            return b == e ? b : dpR.c;
        }
    }

    public static final <T1, T2, R> dyS<R> b(dyS<? extends T1> dys, dyS<? extends T2> dys2, InterfaceC8612dsa<? super T1, ? super T2, ? super InterfaceC8585dra<? super R>, ? extends Object> interfaceC8612dsa) {
        return new c(dys2, dys, interfaceC8612dsa);
    }
}
