package com.netflix.mediaclient.android.sharing.impl;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.sharing.impl.ShareDialogFragment$onViewCreated$1;
import com.netflix.mediaclient.android.sharing.impl.types.Shareable;
import com.netflix.mediaclient.android.sharing.impl.types.ShareableInternal;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import o.C8632dsu;
import o.PF;
import o.QI;
import o.dpR;
import o.drM;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes3.dex */
public final class ShareDialogFragment$onViewCreated$1<T> extends Lambda implements drM<QI<T>, ObservableSource<? extends Pair<? extends QI<T>, ? extends Intent>>> {
    final /* synthetic */ PF<T> a;
    final /* synthetic */ ShareableInternal<T> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareDialogFragment$onViewCreated$1(PF<T> pf, ShareableInternal<T> shareableInternal) {
        super(1);
        this.a = pf;
        this.c = shareableInternal;
    }

    /* loaded from: classes3.dex */
    public static final class e<T> implements ObservableOnSubscribe {
        final /* synthetic */ LifecycleOwner a;

        public e(LifecycleOwner lifecycleOwner) {
            this.a = lifecycleOwner;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public final void subscribe(final ObservableEmitter<dpR> observableEmitter) {
            C8632dsu.c((Object) observableEmitter, "");
            LifecycleOwner lifecycleOwner = this.a;
            if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                observableEmitter.onNext(dpR.c);
                observableEmitter.onComplete();
                return;
            }
            this.a.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.android.sharing.impl.ShareDialogFragment$onViewCreated$1$invoke$$inlined$createDestroyObservable$1$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner lifecycleOwner2) {
                    C8632dsu.c((Object) lifecycleOwner2, "");
                    if (!ObservableEmitter.this.isDisposed()) {
                        ObservableEmitter.this.onNext(dpR.c);
                        try {
                            ObservableEmitter.this.onComplete();
                        } catch (CancellationException unused) {
                        }
                    }
                    super.onDestroy(lifecycleOwner2);
                }
            });
        }
    }

    @Override // o.drM
    /* renamed from: a */
    public final ObservableSource<? extends Pair<QI<T>, Intent>> invoke(final QI<T> qi) {
        C8632dsu.c((Object) qi, "");
        PF.e.getLogTag();
        NetflixActivity i = this.a.i();
        if (i != null) {
            Observable<Intent> observable = qi.d((FragmentActivity) i, (Shareable) this.c).observeOn(AndroidSchedulers.mainThread()).toObservable();
            final drM<Intent, Pair<? extends QI<T>, ? extends Intent>> drm = new drM<Intent, Pair<? extends QI<T>, ? extends Intent>>() { // from class: com.netflix.mediaclient.android.sharing.impl.ShareDialogFragment$onViewCreated$1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: e */
                public final Pair<QI<T>, Intent> invoke(Intent intent) {
                    C8632dsu.c((Object) intent, "");
                    return new Pair<>(qi, intent);
                }
            };
            Observable<R> map = observable.map(new Function() { // from class: o.PK
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    Pair c;
                    c = ShareDialogFragment$onViewCreated$1.c(drM.this, obj);
                    return c;
                }
            });
            Observable<T> subscribeOn = Observable.create(new e(this.a.getViewLifecycleOwner())).subscribeOn(AndroidSchedulers.mainThread());
            C8632dsu.a(subscribeOn, "");
            return map.takeUntil(subscribeOn);
        }
        return Observable.empty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (Pair) drm.invoke(obj);
    }
}
