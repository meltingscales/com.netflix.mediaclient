package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import o.InterfaceC8585dra;
import o.InterfaceC8822dzv;
import o.dpR;
import o.dqZ;
import o.drO;
import o.drX;
import o.dyS;

/* loaded from: classes.dex */
public final class SnapshotStateKt {
    public static final <T extends R, R> State<R> collectAsState(dyS<? extends T> dys, R r, dqZ dqz, Composer composer, int i, int i2) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(dys, r, dqz, composer, i, i2);
    }

    public static final <T> State<T> collectAsState(InterfaceC8822dzv<? extends T> interfaceC8822dzv, dqZ dqz, Composer composer, int i, int i2) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(interfaceC8822dzv, dqz, composer, i, i2);
    }

    public static final MutableVector<DerivedStateObserver> derivedStateObservers() {
        return SnapshotStateKt__DerivedStateKt.derivedStateObservers();
    }

    public static final <T> State<T> derivedStateOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, drO<? extends T> dro) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(snapshotMutationPolicy, dro);
    }

    public static final <T> State<T> derivedStateOf(drO<? extends T> dro) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(dro);
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf();
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf(T... tArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf(tArr);
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf();
    }

    public static final <T> MutableState<T> mutableStateOf(T t, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf(t, snapshotMutationPolicy);
    }

    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy();
    }

    public static final <T> State<T> produceState(T t, Object obj, Object obj2, drX<? super ProduceStateScope<T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, obj, obj2, drx, composer, i);
    }

    public static final <T> State<T> produceState(T t, Object obj, drX<? super ProduceStateScope<T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, obj, drx, composer, i);
    }

    public static final <T> State<T> produceState(T t, drX<? super ProduceStateScope<T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, drx, composer, i);
    }

    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy();
    }

    public static final <T> State<T> rememberUpdatedState(T t, Composer composer, int i) {
        return SnapshotStateKt__SnapshotStateKt.rememberUpdatedState(t, composer, i);
    }

    public static final <T> dyS<T> snapshotFlow(drO<? extends T> dro) {
        return SnapshotStateKt__SnapshotFlowKt.snapshotFlow(dro);
    }

    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy();
    }
}
