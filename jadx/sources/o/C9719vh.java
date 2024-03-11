package o;

import com.netflix.android.imageloader.api.ShowImageRequest;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

/* renamed from: o.vh  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9719vh implements SingleObserver<ShowImageRequest.a> {
    private final SingleEmitter<ShowImageRequest.a> e;

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable) {
        C8632dsu.c((Object) disposable, "");
    }

    public C9719vh(SingleEmitter<ShowImageRequest.a> singleEmitter) {
        C8632dsu.c((Object) singleEmitter, "");
        this.e = singleEmitter;
    }

    @Override // io.reactivex.SingleObserver
    /* renamed from: d */
    public void onSuccess(ShowImageRequest.a aVar) {
        C8632dsu.c((Object) aVar, "");
        this.e.onSuccess(aVar);
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th) {
        C8632dsu.c((Object) th, "");
        this.e.tryOnError(th);
    }
}
