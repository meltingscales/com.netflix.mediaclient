package io.reactivex.rxkotlin;

import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiFunction;
import kotlin.Pair;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class SinglesKt {
    public static final <T, U> Single<Pair<T, U>> zipWith(Single<T> single, SingleSource<U> singleSource) {
        C8632dsu.d(single, "");
        C8632dsu.d(singleSource, "");
        Single<Pair<T, U>> single2 = (Single<Pair<T, U>>) single.zipWith(singleSource, new BiFunction<T, U, Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.SinglesKt$zipWith$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((SinglesKt$zipWith$2<T1, T2, R, T, U>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Pair<T, U> apply(T t, U u) {
                C8632dsu.d(t, "");
                C8632dsu.d(u, "");
                return new Pair<>(t, u);
            }
        });
        C8632dsu.b(single2, "");
        return single2;
    }
}
