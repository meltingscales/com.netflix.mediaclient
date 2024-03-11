package o;

import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1;

/* renamed from: o.dzi  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C8809dzi {
    public static final /* synthetic */ drO b() {
        return a();
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* renamed from: o.dzi$a */
    /* loaded from: classes5.dex */
    public static final class a<R> implements dyS<R> {
        final /* synthetic */ InterfaceC8615dsd a;
        final /* synthetic */ dyS[] e;

        public a(dyS[] dysArr, InterfaceC8615dsd interfaceC8615dsd) {
            this.e = dysArr;
            this.a = interfaceC8615dsd;
        }

        @Override // o.dyS
        public Object collect(dyQ dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object c = dzO.c(dyq, this.e, C8809dzi.b(), new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2(null, this.a), interfaceC8585dra);
            e = C8586drb.e();
            return c == e ? c : dpR.c;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* renamed from: o.dzi$b */
    /* loaded from: classes5.dex */
    public static final class b<R> implements dyS<R> {
        final /* synthetic */ dyS a;
        final /* synthetic */ dyS b;
        final /* synthetic */ InterfaceC8612dsa c;

        public b(dyS dys, dyS dys2, InterfaceC8612dsa interfaceC8612dsa) {
            this.b = dys;
            this.a = dys2;
            this.c = interfaceC8612dsa;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super R> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            Object e;
            Object c = dzO.c(dyq, new dyS[]{this.b, this.a}, C8809dzi.b(), new FlowKt__ZipKt$combine$1$1(this.c, null), interfaceC8585dra);
            e = C8586drb.e();
            return c == e ? c : dpR.c;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* renamed from: o.dzi$e */
    /* loaded from: classes5.dex */
    public static final class e<R> implements dyS<R> {
        final /* synthetic */ InterfaceC8619dsh a;
        final /* synthetic */ dyS[] d;

        public e(dyS[] dysArr, InterfaceC8619dsh interfaceC8619dsh) {
            this.d = dysArr;
            this.a = interfaceC8619dsh;
        }

        @Override // o.dyS
        public Object collect(dyQ dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object c = dzO.c(dyq, this.d, C8809dzi.b(), new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2(null, this.a), interfaceC8585dra);
            e = C8586drb.e();
            return c == e ? c : dpR.c;
        }
    }

    private static final <T> drO<T[]> a() {
        return new drO() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
            @Override // o.drO
            /* renamed from: c */
            public final Void invoke() {
                return null;
            }
        };
    }

    public static final <T1, T2, R> dyS<R> d(dyS<? extends T1> dys, dyS<? extends T2> dys2, InterfaceC8612dsa<? super T1, ? super T2, ? super InterfaceC8585dra<? super R>, ? extends Object> interfaceC8612dsa) {
        return dzO.b(dys, dys2, interfaceC8612dsa);
    }

    public static final <T1, T2, R> dyS<R> c(dyS<? extends T1> dys, dyS<? extends T2> dys2, InterfaceC8612dsa<? super T1, ? super T2, ? super InterfaceC8585dra<? super R>, ? extends Object> interfaceC8612dsa) {
        return new b(dys, dys2, interfaceC8612dsa);
    }

    public static final <T1, T2, T3, T4, R> dyS<R> b(dyS<? extends T1> dys, dyS<? extends T2> dys2, dyS<? extends T3> dys3, dyS<? extends T4> dys4, InterfaceC8615dsd<? super T1, ? super T2, ? super T3, ? super T4, ? super InterfaceC8585dra<? super R>, ? extends Object> interfaceC8615dsd) {
        return new a(new dyS[]{dys, dys2, dys3, dys4}, interfaceC8615dsd);
    }

    public static final <T1, T2, T3, T4, T5, R> dyS<R> b(dyS<? extends T1> dys, dyS<? extends T2> dys2, dyS<? extends T3> dys3, dyS<? extends T4> dys4, dyS<? extends T5> dys5, InterfaceC8619dsh<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super InterfaceC8585dra<? super R>, ? extends Object> interfaceC8619dsh) {
        return new e(new dyS[]{dys, dys2, dys3, dys4, dys5}, interfaceC8619dsh);
    }
}
