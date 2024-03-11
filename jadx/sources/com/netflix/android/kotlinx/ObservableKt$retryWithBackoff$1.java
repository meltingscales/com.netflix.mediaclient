package com.netflix.android.kotlinx;

import com.netflix.android.kotlinx.ObservableKt$retryWithBackoff$1;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Lambda;
import o.C8632dsu;
import o.drM;
import o.drX;

/* loaded from: classes2.dex */
public final class ObservableKt$retryWithBackoff$1 extends Lambda implements drM<Observable<Throwable>, ObservableSource<?>> {
    final /* synthetic */ int a;
    final /* synthetic */ drX<Throwable, Integer, Integer> b;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ObservableKt$retryWithBackoff$1(int i, drX<? super Throwable, ? super Integer, Integer> drx, long j) {
        super(1);
        this.a = i;
        this.b = drx;
        this.d = j;
    }

    @Override // o.drM
    /* renamed from: c */
    public final ObservableSource<?> invoke(Observable<Throwable> observable) {
        C8632dsu.c((Object) observable, "");
        Observable<Integer> range = Observable.range(1, this.a);
        C8632dsu.a(range, "");
        Observable<R> zipWith = observable.zipWith(range, new d(this.b));
        C8632dsu.b(zipWith, "");
        final long j = this.d;
        final drM<Integer, ObservableSource<? extends Long>> drm = new drM<Integer, ObservableSource<? extends Long>>() { // from class: com.netflix.android.kotlinx.ObservableKt$retryWithBackoff$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final ObservableSource<? extends Long> invoke(Integer num) {
                C8632dsu.c((Object) num, "");
                return Observable.timer(j * num.intValue(), TimeUnit.SECONDS);
            }
        };
        return zipWith.flatMap(new Function() { // from class: o.vJ
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource d2;
                d2 = ObservableKt$retryWithBackoff$1.d(drM.this, obj);
                return d2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (ObservableSource) drm.invoke(obj);
    }

    /* loaded from: classes2.dex */
    public static final class d<T1, T2, R> implements BiFunction<Throwable, Integer, R> {
        final /* synthetic */ drX e;

        public d(drX drx) {
            this.e = drx;
        }

        @Override // io.reactivex.functions.BiFunction
        public final R apply(Throwable th, Integer num) {
            C8632dsu.d(th, "");
            C8632dsu.d(num, "");
            return (R) this.e.invoke(th, num);
        }
    }
}
