package o;

import com.netflix.android.imageloader.api.ShowImageRequest;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

/* renamed from: o.byv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5449byv implements SingleObserver<ShowImageRequest.a> {
    private final drO<dpR> c;

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th) {
        C8632dsu.c((Object) th, "");
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable) {
        C8632dsu.c((Object) disposable, "");
    }

    public C5449byv(drO<dpR> dro) {
        C8632dsu.c((Object) dro, "");
        this.c = dro;
    }

    @Override // io.reactivex.SingleObserver
    /* renamed from: a */
    public void onSuccess(ShowImageRequest.a aVar) {
        C8632dsu.c((Object) aVar, "");
        this.c.invoke();
    }
}
