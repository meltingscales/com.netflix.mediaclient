package io.reactivex.rxkotlin;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public final class SubscribersKt {
    private static final drM<Object, dpR> onNextStub = new drM<Object, dpR>() { // from class: io.reactivex.rxkotlin.SubscribersKt$onNextStub$1
        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(Object obj) {
            invoke2(obj);
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
            C8632dsu.d(obj, "");
        }
    };
    private static final drM<Throwable, dpR> onErrorStub = new drM<Throwable, dpR>() { // from class: io.reactivex.rxkotlin.SubscribersKt$onErrorStub$1
        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(Throwable th) {
            invoke2(th);
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C8632dsu.d(th, "");
        }
    };
    private static final drO<dpR> onCompleteStub = new drO<dpR>() { // from class: io.reactivex.rxkotlin.SubscribersKt$onCompleteStub$1
        @Override // o.drO
        public /* bridge */ /* synthetic */ dpR invoke() {
            invoke2();
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxkotlin.SubscribersKt$sam$io_reactivex_functions_Consumer$0] */
    private static final <T> Consumer<T> asConsumer(drM<? super T, dpR> drm) {
        if (drm == onNextStub) {
            Consumer<T> emptyConsumer = Functions.emptyConsumer();
            C8632dsu.b(emptyConsumer, "");
            return emptyConsumer;
        }
        if (drm != null) {
            drm = new SubscribersKt$sam$io_reactivex_functions_Consumer$0(drm);
        }
        return (Consumer) drm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxkotlin.SubscribersKt$sam$io_reactivex_functions_Consumer$0] */
    private static final Consumer<Throwable> asOnErrorConsumer(drM<? super Throwable, dpR> drm) {
        if (drm == onErrorStub) {
            Consumer<Throwable> consumer = Functions.ON_ERROR_MISSING;
            C8632dsu.b(consumer, "");
            return consumer;
        }
        if (drm != null) {
            drm = new SubscribersKt$sam$io_reactivex_functions_Consumer$0(drm);
        }
        return (Consumer) drm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxkotlin.SubscribersKt$sam$io_reactivex_functions_Action$0] */
    private static final Action asOnCompleteAction(drO<dpR> dro) {
        if (dro == onCompleteStub) {
            Action action = Functions.EMPTY_ACTION;
            C8632dsu.b(action, "");
            return action;
        }
        if (dro != null) {
            dro = new SubscribersKt$sam$io_reactivex_functions_Action$0(dro);
        }
        return (Action) dro;
    }

    public static /* synthetic */ Disposable subscribeBy$default(Observable observable, drM drm, drO dro, drM drm2, int i, Object obj) {
        if ((i & 1) != 0) {
            drm = onErrorStub;
        }
        if ((i & 2) != 0) {
            dro = onCompleteStub;
        }
        if ((i & 4) != 0) {
            drm2 = onNextStub;
        }
        return subscribeBy(observable, drm, dro, drm2);
    }

    public static final <T> Disposable subscribeBy(Observable<T> observable, drM<? super Throwable, dpR> drm, drO<dpR> dro, drM<? super T, dpR> drm2) {
        C8632dsu.d(observable, "");
        C8632dsu.d(drm, "");
        C8632dsu.d(dro, "");
        C8632dsu.d(drm2, "");
        Disposable subscribe = observable.subscribe(asConsumer(drm2), asOnErrorConsumer(drm), asOnCompleteAction(dro));
        C8632dsu.b(subscribe, "");
        return subscribe;
    }

    public static /* synthetic */ Disposable subscribeBy$default(Flowable flowable, drM drm, drO dro, drM drm2, int i, Object obj) {
        if ((i & 1) != 0) {
            drm = onErrorStub;
        }
        if ((i & 2) != 0) {
            dro = onCompleteStub;
        }
        if ((i & 4) != 0) {
            drm2 = onNextStub;
        }
        return subscribeBy(flowable, drm, dro, drm2);
    }

    public static final <T> Disposable subscribeBy(Flowable<T> flowable, drM<? super Throwable, dpR> drm, drO<dpR> dro, drM<? super T, dpR> drm2) {
        C8632dsu.d(flowable, "");
        C8632dsu.d(drm, "");
        C8632dsu.d(dro, "");
        C8632dsu.d(drm2, "");
        Disposable subscribe = flowable.subscribe(asConsumer(drm2), asOnErrorConsumer(drm), asOnCompleteAction(dro));
        C8632dsu.b(subscribe, "");
        return subscribe;
    }

    public static /* synthetic */ Disposable subscribeBy$default(Single single, drM drm, drM drm2, int i, Object obj) {
        if ((i & 1) != 0) {
            drm = onErrorStub;
        }
        if ((i & 2) != 0) {
            drm2 = onNextStub;
        }
        return subscribeBy(single, drm, drm2);
    }

    public static final <T> Disposable subscribeBy(Single<T> single, drM<? super Throwable, dpR> drm, drM<? super T, dpR> drm2) {
        C8632dsu.d(single, "");
        C8632dsu.d(drm, "");
        C8632dsu.d(drm2, "");
        Disposable subscribe = single.subscribe(asConsumer(drm2), asOnErrorConsumer(drm));
        C8632dsu.b(subscribe, "");
        return subscribe;
    }

    public static /* synthetic */ Disposable subscribeBy$default(Maybe maybe, drM drm, drO dro, drM drm2, int i, Object obj) {
        if ((i & 1) != 0) {
            drm = onErrorStub;
        }
        if ((i & 2) != 0) {
            dro = onCompleteStub;
        }
        if ((i & 4) != 0) {
            drm2 = onNextStub;
        }
        return subscribeBy(maybe, drm, dro, drm2);
    }

    public static final <T> Disposable subscribeBy(Maybe<T> maybe, drM<? super Throwable, dpR> drm, drO<dpR> dro, drM<? super T, dpR> drm2) {
        C8632dsu.d(maybe, "");
        C8632dsu.d(drm, "");
        C8632dsu.d(dro, "");
        C8632dsu.d(drm2, "");
        Disposable subscribe = maybe.subscribe(asConsumer(drm2), asOnErrorConsumer(drm), asOnCompleteAction(dro));
        C8632dsu.b(subscribe, "");
        return subscribe;
    }

    public static /* synthetic */ Disposable subscribeBy$default(Completable completable, drM drm, drO dro, int i, Object obj) {
        if ((i & 1) != 0) {
            drm = onErrorStub;
        }
        if ((i & 2) != 0) {
            dro = onCompleteStub;
        }
        return subscribeBy(completable, drm, dro);
    }

    public static final Disposable subscribeBy(Completable completable, drM<? super Throwable, dpR> drm, drO<dpR> dro) {
        C8632dsu.d(completable, "");
        C8632dsu.d(drm, "");
        C8632dsu.d(dro, "");
        drM<Throwable, dpR> drm2 = onErrorStub;
        if (drm == drm2 && dro == onCompleteStub) {
            Disposable subscribe = completable.subscribe();
            C8632dsu.b(subscribe, "");
            return subscribe;
        } else if (drm == drm2) {
            Disposable subscribe2 = completable.subscribe(new SubscribersKt$sam$io_reactivex_functions_Action$0(dro));
            C8632dsu.b(subscribe2, "");
            return subscribe2;
        } else {
            Disposable subscribe3 = completable.subscribe(asOnCompleteAction(dro), new SubscribersKt$sam$io_reactivex_functions_Consumer$0(drm));
            C8632dsu.b(subscribe3, "");
            return subscribe3;
        }
    }
}
