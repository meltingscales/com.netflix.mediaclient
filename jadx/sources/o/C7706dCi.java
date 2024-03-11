package o;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import o.dpF;
import o.dpJ;
import o.dpL;
import o.dpO;
import o.duI;

/* renamed from: o.dCi  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7706dCi {
    public static final <T> dBT<T> a(dBT<T> dbt) {
        C8632dsu.c((Object) dbt, "");
        return dbt.e().i() ? dbt : new dDL(dbt);
    }

    public static final <K, V> dBT<Pair<K, V>> e(dBT<K> dbt, dBT<V> dbt2) {
        C8632dsu.c((Object) dbt, "");
        C8632dsu.c((Object) dbt2, "");
        return new dDP(dbt, dbt2);
    }

    public static final <K, V> dBT<Map.Entry<K, V>> b(dBT<K> dbt, dBT<V> dbt2) {
        C8632dsu.c((Object) dbt, "");
        C8632dsu.c((Object) dbt2, "");
        return new dDC(dbt, dbt2);
    }

    public static final <A, B, C> dBT<Triple<A, B, C>> e(dBT<A> dbt, dBT<B> dbt2, dBT<C> dbt3) {
        C8632dsu.c((Object) dbt, "");
        C8632dsu.c((Object) dbt2, "");
        C8632dsu.c((Object) dbt3, "");
        return new C7759dEh(dbt, dbt2, dbt3);
    }

    public static final dBT<Character> d(C8625dsn c8625dsn) {
        C8632dsu.c((Object) c8625dsn, "");
        return dCN.c;
    }

    public static final dBT<char[]> a() {
        return dCQ.d;
    }

    public static final dBT<Byte> a(C8623dsl c8623dsl) {
        C8632dsu.c((Object) c8623dsl, "");
        return dCJ.b;
    }

    public static final dBT<byte[]> c() {
        return dCG.d;
    }

    public static final dBT<dpI> h() {
        return C7762dEk.b;
    }

    public static final dBT<Short> a(dsF dsf) {
        C8632dsu.c((Object) dsf, "");
        return C7761dEj.e;
    }

    public static final dBT<short[]> f() {
        return C7758dEg.e;
    }

    public static final dBT<dpP> o() {
        return C7772dEu.d;
    }

    public static final dBT<Integer> e(C8634dsw c8634dsw) {
        C8632dsu.c((Object) c8634dsw, "");
        return C7737dDm.a;
    }

    public static final dBT<int[]> j() {
        return C7740dDp.b;
    }

    public static final dBT<dpN> l() {
        return C7769dEr.a;
    }

    public static final dBT<Long> b(dsB dsb) {
        C8632dsu.c((Object) dsb, "");
        return dDF.a;
    }

    public static final dBT<long[]> i() {
        return C7747dDw.b;
    }

    public static final dBT<dpK> m() {
        return C7770dEs.d;
    }

    public static final dBT<Float> a(C8626dso c8626dso) {
        C8632dsu.c((Object) c8626dso, "");
        return C7727dDc.b;
    }

    public static final dBT<float[]> e() {
        return C7730dDf.e;
    }

    public static final dBT<Double> e(C8629dsr c8629dsr) {
        C8632dsu.c((Object) c8629dsr, "");
        return dCZ.e;
    }

    public static final dBT<double[]> d() {
        return C7725dDa.a;
    }

    public static final dBT<Boolean> d(C8624dsm c8624dsm) {
        C8632dsu.c((Object) c8624dsm, "");
        return dCD.a;
    }

    public static final dBT<boolean[]> b() {
        return dCH.a;
    }

    public static final dBT<dpR> e(dpR dpr) {
        C8632dsu.c((Object) dpr, "");
        return C7775dEx.b;
    }

    public static final dBT<String> b(dsE dse) {
        C8632dsu.c((Object) dse, "");
        return C7760dEi.b;
    }

    public static final <T, E extends T> dBT<E[]> b(InterfaceC8660dtv<T> interfaceC8660dtv, dBT<E> dbt) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        C8632dsu.c((Object) dbt, "");
        return new C7754dEc(interfaceC8660dtv, dbt);
    }

    public static final <T> dBT<List<T>> e(dBT<T> dbt) {
        C8632dsu.c((Object) dbt, "");
        return new C7722dCy(dbt);
    }

    public static final <K, V> dBT<Map<K, V>> a(dBT<K> dbt, dBT<V> dbt2) {
        C8632dsu.c((Object) dbt, "");
        C8632dsu.c((Object) dbt2, "");
        return new C7745dDu(dbt, dbt2);
    }

    public static final dBT<dpJ> c(dpJ.a aVar) {
        C8632dsu.c((Object) aVar, "");
        return C7767dEp.d;
    }

    public static final dBT<dpL> a(dpL.c cVar) {
        C8632dsu.c((Object) cVar, "");
        return C7771dEt.e;
    }

    public static final dBT<dpF> d(dpF.b bVar) {
        C8632dsu.c((Object) bVar, "");
        return C7764dEm.e;
    }

    public static final dBT<dpO> d(dpO.d dVar) {
        C8632dsu.c((Object) dVar, "");
        return C7776dEy.c;
    }

    public static final dBT<duI> e(duI.b bVar) {
        C8632dsu.c((Object) bVar, "");
        return C7726dDb.d;
    }

    public static final dBT g() {
        return dDJ.b;
    }
}
