package o;

import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes5.dex */
public final class dyR {
    public static final <T, C extends Collection<? super T>> Object a(dyS<? extends T> dys, C c, InterfaceC8585dra<? super C> interfaceC8585dra) {
        return dyX.d(dys, c, interfaceC8585dra);
    }

    public static final <T> Object a(dyS<? extends T> dys, drX<? super T, ? super InterfaceC8585dra<? super Boolean>, ? extends Object> drx, InterfaceC8585dra<? super T> interfaceC8585dra) {
        return C8808dzh.b(dys, drx, interfaceC8585dra);
    }

    public static final Object a(dyS<?> dys, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return dyW.b(dys, interfaceC8585dra);
    }

    public static final <T> dyS<T> a(Iterable<? extends dyS<? extends T>> iterable) {
        return C8801dza.c(iterable);
    }

    public static final <T> dyS<T> a(dyS<? extends T> dys, int i) {
        return C8802dzb.b(dys, i);
    }

    public static final <T> dyS<T> a(dyS<? extends T> dys, long j) {
        return dyV.b(dys, j);
    }

    public static final <T> dyS<T> a(dyS<? extends T> dys, dqZ dqz) {
        return dyZ.b(dys, dqz);
    }

    public static final <T> dyS<T> a(dyS<? extends T> dys, drX<? super T, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return C8806dzf.b(dys, drx);
    }

    public static final <T> dyS<T> a(dyS<? extends T> dys, InterfaceC8612dsa<? super dyQ<? super T>, ? super Throwable, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa) {
        return C8804dzd.c(dys, interfaceC8612dsa);
    }

    public static final <T> dyS<T> a(T... tArr) {
        return dyT.a(tArr);
    }

    public static final <T> dyS<T> a(dyS<? extends T>... dysArr) {
        return C8801dza.e(dysArr);
    }

    public static final <T> dyS<T> b(Iterable<? extends T> iterable) {
        return dyT.d((Iterable) iterable);
    }

    public static final <T> dyS<T> b(dyS<? extends T> dys, int i) {
        return C8802dzb.e(dys, i);
    }

    public static final <T, R> dyS<R> b(dyS<? extends T> dys, drX<? super T, ? super InterfaceC8585dra<? super dyS<? extends R>>, ? extends Object> drx) {
        return C8801dza.e(dys, drx);
    }

    public static final <T1, T2, R> dyS<R> b(dyS<? extends T1> dys, dyS<? extends T2> dys2, InterfaceC8612dsa<? super T1, ? super T2, ? super InterfaceC8585dra<? super R>, ? extends Object> interfaceC8612dsa) {
        return C8809dzi.c(dys, dys2, interfaceC8612dsa);
    }

    public static final <T1, T2, T3, T4, R> dyS<R> b(dyS<? extends T1> dys, dyS<? extends T2> dys2, dyS<? extends T3> dys3, dyS<? extends T4> dys4, InterfaceC8615dsd<? super T1, ? super T2, ? super T3, ? super T4, ? super InterfaceC8585dra<? super R>, ? extends Object> interfaceC8615dsd) {
        return C8809dzi.b(dys, dys2, dys3, dys4, interfaceC8615dsd);
    }

    public static final <T> InterfaceC8822dzv<T> b(InterfaceC8812dzl<T> interfaceC8812dzl) {
        return C8807dzg.e(interfaceC8812dzl);
    }

    public static final void b(dyQ<?> dyq) {
        C8804dzd.e(dyq);
    }

    public static final <T> Object c(dyS<? extends T> dys, InterfaceC8585dra<? super T> interfaceC8585dra) {
        return C8808dzh.a(dys, interfaceC8585dra);
    }

    public static final <T> dyS<T> c(T t) {
        return dyT.d(t);
    }

    public static final <T> dyS<T> c(drX<? super dyK<? super T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return dyT.e(drx);
    }

    public static final <T> dyS<T> c(dyS<? extends dyS<? extends T>> dys) {
        return C8801dza.c(dys);
    }

    public static final <T> dyS<T> c(dyS<? extends dyS<? extends T>> dys, int i) {
        return C8801dza.e(dys, i);
    }

    public static final <T> dyS<T> c(dyS<? extends T> dys, int i, BufferOverflow bufferOverflow) {
        return dyZ.c(dys, i, bufferOverflow);
    }

    public static final <T> dyS<T> c(dyS<? extends T> dys, drX<? super T, ? super T, Boolean> drx) {
        return C8805dze.d(dys, drx);
    }

    public static final <T, R> dyS<R> c(dyS<? extends T> dys, InterfaceC8612dsa<? super dyQ<? super R>, ? super T, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa) {
        return C8801dza.a(dys, interfaceC8612dsa);
    }

    public static final <T> Object d(dyQ<? super T> dyq, dyJ<? extends T> dyj, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return dyY.b(dyq, dyj, interfaceC8585dra);
    }

    public static final <T> Object d(dyS<? extends T> dys, drX<? super T, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return dyW.a(dys, drx, interfaceC8585dra);
    }

    public static final <T> Object d(dyS<? extends T> dys, InterfaceC8585dra<? super T> interfaceC8585dra) {
        return C8808dzh.e(dys, interfaceC8585dra);
    }

    public static final <T> Object d(dyS<? extends T> dys, dyQ<? super T> dyq, InterfaceC8585dra<? super Throwable> interfaceC8585dra) {
        return C8803dzc.d(dys, dyq, interfaceC8585dra);
    }

    public static final <T> dyS<T> d(drX<? super dyQ<? super T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return dyT.a(drx);
    }

    public static /* synthetic */ dyS d(dyS dys, int i, drX drx, int i2, Object obj) {
        return C8801dza.b(dys, i, drx, i2, obj);
    }

    public static final <T> dyS<T> d(dyS<? extends T> dys, drX<? super T, ? super InterfaceC8585dra<? super Boolean>, ? extends Object> drx) {
        return C8802dzb.c(dys, drx);
    }

    public static final <T1, T2, R> dyS<R> d(dyS<? extends T1> dys, dyS<? extends T2> dys2, InterfaceC8612dsa<? super T1, ? super T2, ? super InterfaceC8585dra<? super R>, ? extends Object> interfaceC8612dsa) {
        return C8809dzi.d(dys, dys2, interfaceC8612dsa);
    }

    public static final <T> InterfaceC8814dzn<T> d(InterfaceC8814dzn<? extends T> interfaceC8814dzn, drX<? super dyQ<? super T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return C8807dzg.a(interfaceC8814dzn, drx);
    }

    public static final <T> Object e(dyQ<? super T> dyq, dyS<? extends T> dys, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return dyW.b(dyq, dys, interfaceC8585dra);
    }

    public static final <T> Object e(dyS<? extends T> dys, List<T> list, InterfaceC8585dra<? super List<? extends T>> interfaceC8585dra) {
        return dyX.d((dyS) dys, (List) list, (InterfaceC8585dra) interfaceC8585dra);
    }

    public static final <T> dxD e(dyS<? extends T> dys, dwU dwu) {
        return dyW.d(dys, dwu);
    }

    public static final <T> dyS<T> e(dyS<? extends T> dys) {
        return C8805dze.a(dys);
    }

    public static final <T, R> dyS<R> e(dyS<? extends T> dys, int i, drX<? super T, ? super InterfaceC8585dra<? super dyS<? extends R>>, ? extends Object> drx) {
        return C8801dza.a(dys, i, drx);
    }

    public static final <T> dyS<T> e(dyS<? extends T> dys, long j) {
        return dyV.c(dys, j);
    }

    public static final <T, R> dyS<R> e(dyS<? extends T> dys, drX<? super T, ? super InterfaceC8585dra<? super R>, ? extends Object> drx) {
        return C8801dza.b(dys, drx);
    }

    public static final <T> dyS<T> e(dyS<? extends T> dys, InterfaceC8612dsa<? super dyQ<? super T>, ? super Throwable, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa) {
        return C8803dzc.a(dys, interfaceC8612dsa);
    }

    public static final <T1, T2, T3, T4, T5, R> dyS<R> e(dyS<? extends T1> dys, dyS<? extends T2> dys2, dyS<? extends T3> dys3, dyS<? extends T4> dys4, dyS<? extends T5> dys5, InterfaceC8619dsh<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super InterfaceC8585dra<? super R>, ? extends Object> interfaceC8619dsh) {
        return C8809dzi.b(dys, dys2, dys3, dys4, dys5, interfaceC8619dsh);
    }

    public static final <T> InterfaceC8814dzn<T> e(InterfaceC8810dzj<T> interfaceC8810dzj) {
        return C8807dzg.b(interfaceC8810dzj);
    }

    public static final <T> InterfaceC8822dzv<T> e(dyS<? extends T> dys, dwU dwu, InterfaceC8817dzq interfaceC8817dzq, T t) {
        return C8807dzg.b(dys, dwu, interfaceC8817dzq, t);
    }

    public static final <T> dyS<T> j(dyS<? extends T> dys, drX<? super dyQ<? super T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return C8804dzd.b(dys, drx);
    }
}
