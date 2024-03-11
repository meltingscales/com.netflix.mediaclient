package io.reactivex.rxkotlin;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import kotlin.Pair;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class ObservablesKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, U> Observable<Pair<T, U>> zipWith(Observable<T> observable, ObservableSource<U> observableSource) {
        C8632dsu.d(observable, "");
        C8632dsu.d(observableSource, "");
        Observable<Pair<T, U>> observable2 = (Observable<Pair<T, U>>) observable.zipWith(observableSource, new BiFunction<T, U, Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.ObservablesKt$zipWith$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((ObservablesKt$zipWith$2<T1, T2, R, T, U>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Pair<T, U> apply(T t, U u) {
                C8632dsu.d(t, "");
                C8632dsu.d(u, "");
                return new Pair<>(t, u);
            }
        });
        C8632dsu.b(observable2, "");
        return observable2;
    }
}
