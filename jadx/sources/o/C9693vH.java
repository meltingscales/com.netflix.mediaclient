package o;

import com.netflix.android.kotlinx.ObservableKt$retryWithBackoff$1;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* renamed from: o.vH  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9693vH {
    public static final <T> Observable<T> b(Observable<T> observable, int i, long j, final drM<? super Integer, dpR> drm) {
        C8632dsu.c((Object) observable, "");
        if (j < 1) {
            throw new IllegalArgumentException("backoffMultiplier must be positive number");
        }
        final int i2 = i + 1;
        final ObservableKt$retryWithBackoff$1 observableKt$retryWithBackoff$1 = new ObservableKt$retryWithBackoff$1(i2, new drX<Throwable, Integer, Integer>() { // from class: com.netflix.android.kotlinx.ObservableKt$retryWithBackoff$zipperCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ Integer invoke(Throwable th, Integer num) {
                return d(th, num.intValue());
            }

            public final Integer d(Throwable th, int i3) {
                C8632dsu.c((Object) th, "");
                drM<Integer, dpR> drm2 = drm;
                if (drm2 != null) {
                    drm2.invoke(Integer.valueOf(i3));
                }
                if (i3 == i2) {
                    throw th;
                }
                return Integer.valueOf(i3);
            }
        }, j);
        Observable<T> retryWhen = observable.retryWhen(new Function() { // from class: o.vG
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource c;
                c = C9693vH.c(drM.this, obj);
                return c;
            }
        });
        C8632dsu.a(retryWhen, "");
        return retryWhen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (ObservableSource) drm.invoke(obj);
    }
}
