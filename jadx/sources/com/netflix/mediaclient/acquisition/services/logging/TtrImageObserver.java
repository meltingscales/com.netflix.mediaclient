package com.netflix.mediaclient.acquisition.services.logging;

import com.netflix.android.imageloader.api.ShowImageRequest;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class TtrImageObserver implements SingleObserver<ShowImageRequest.a> {
    public static final int $stable = 8;
    private final WeakReference<TtrEventListener> weakTtrEventListener;

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable) {
        C8632dsu.c((Object) disposable, "");
    }

    @Inject
    public TtrImageObserver(TtrEventListener ttrEventListener) {
        C8632dsu.c((Object) ttrEventListener, "");
        this.weakTtrEventListener = new WeakReference<>(ttrEventListener);
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(ShowImageRequest.a aVar) {
        C8632dsu.c((Object) aVar, "");
        TtrEventListener ttrEventListener = this.weakTtrEventListener.get();
        if (ttrEventListener != null) {
            ttrEventListener.onPageRenderSuccess();
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th) {
        C8632dsu.c((Object) th, "");
        TtrEventListener ttrEventListener = this.weakTtrEventListener.get();
        if (ttrEventListener != null) {
            ttrEventListener.onPageRenderFail();
        }
    }
}
