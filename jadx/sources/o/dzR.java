package o;

import kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1;

/* loaded from: classes5.dex */
public final class dzR {
    public static final <R> Object d(drX<? super dwU, ? super InterfaceC8585dra<? super R>, ? extends Object> drx, InterfaceC8585dra<? super R> interfaceC8585dra) {
        Object e;
        dzS dzs = new dzS(interfaceC8585dra.getContext(), interfaceC8585dra);
        Object b = dAV.b(dzs, dzs, drx);
        e = C8586drb.e();
        if (b == e) {
            C8592drh.c(interfaceC8585dra);
        }
        return b;
    }

    public static final <R> dyS<R> d(InterfaceC8612dsa<? super dwU, ? super dyQ<? super R>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa) {
        return new d(interfaceC8612dsa);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes5.dex */
    public static final class d<R> implements dyS<R> {
        final /* synthetic */ InterfaceC8612dsa a;

        public d(InterfaceC8612dsa interfaceC8612dsa) {
            this.a = interfaceC8612dsa;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super R> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            Object e;
            Object d = dzR.d(new FlowCoroutineKt$scopedFlow$1$1(this.a, dyq, null), interfaceC8585dra);
            e = C8586drb.e();
            return d == e ? d : dpR.c;
        }
    }
}
