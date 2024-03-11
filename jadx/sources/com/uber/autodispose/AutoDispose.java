package com.uber.autodispose;

import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class AutoDispose {
    public static <T> AutoDisposeConverter<T> b(final ScopeProvider scopeProvider) {
        AutoDisposeUtil.c(scopeProvider, "provider == null");
        return b(Completable.defer(new Callable() { // from class: com.uber.autodispose.AutoDispose$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CompletableSource d;
                d = AutoDispose.d(ScopeProvider.this);
                return d;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CompletableSource d(ScopeProvider scopeProvider) {
        try {
            return scopeProvider.a();
        } catch (OutsideScopeException e) {
            Consumer<? super OutsideScopeException> d = AutoDisposePlugins.d();
            if (d != null) {
                d.accept(e);
                return Completable.complete();
            }
            return Completable.error(e);
        }
    }

    public static <T> AutoDisposeConverter<T> b(final CompletableSource completableSource) {
        AutoDisposeUtil.c(completableSource, "scope == null");
        return new AutoDisposeConverter<T>() { // from class: com.uber.autodispose.AutoDispose.1
            @Override // io.reactivex.CompletableConverter
            /* renamed from: d */
            public CompletableSubscribeProxy apply(final Completable completable) {
                return new CompletableSubscribeProxy() { // from class: com.uber.autodispose.AutoDispose.1.1
                    @Override // com.uber.autodispose.CompletableSubscribeProxy
                    public Disposable b() {
                        return new AutoDisposeCompletable(completable, CompletableSource.this).subscribe();
                    }

                    @Override // com.uber.autodispose.CompletableSubscribeProxy
                    public Disposable e(Action action) {
                        return new AutoDisposeCompletable(completable, CompletableSource.this).subscribe(action);
                    }
                };
            }

            @Override // io.reactivex.MaybeConverter
            /* renamed from: a */
            public MaybeSubscribeProxy<T> apply(final Maybe<T> maybe) {
                return new MaybeSubscribeProxy<T>() { // from class: com.uber.autodispose.AutoDispose.1.3
                    @Override // com.uber.autodispose.MaybeSubscribeProxy
                    public Disposable b(Consumer<? super T> consumer) {
                        return new AutoDisposeMaybe(maybe, CompletableSource.this).subscribe(consumer);
                    }

                    @Override // com.uber.autodispose.MaybeSubscribeProxy
                    public Disposable e(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
                        return new AutoDisposeMaybe(maybe, CompletableSource.this).subscribe(consumer, consumer2, action);
                    }
                };
            }

            @Override // io.reactivex.ObservableConverter
            /* renamed from: e */
            public ObservableSubscribeProxy<T> apply(final Observable<T> observable) {
                return new ObservableSubscribeProxy<T>() { // from class: com.uber.autodispose.AutoDispose.1.4
                    @Override // com.uber.autodispose.ObservableSubscribeProxy
                    public Disposable e(Consumer<? super T> consumer) {
                        return new AutoDisposeObservable(observable, CompletableSource.this).subscribe(consumer);
                    }

                    @Override // com.uber.autodispose.ObservableSubscribeProxy
                    public Disposable b(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
                        return new AutoDisposeObservable(observable, CompletableSource.this).subscribe(consumer, consumer2);
                    }

                    @Override // com.uber.autodispose.ObservableSubscribeProxy
                    public Disposable a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
                        return new AutoDisposeObservable(observable, CompletableSource.this).subscribe(consumer, consumer2, action);
                    }
                };
            }

            @Override // io.reactivex.SingleConverter
            /* renamed from: e */
            public SingleSubscribeProxy<T> apply(final Single<T> single) {
                return new SingleSubscribeProxy<T>() { // from class: com.uber.autodispose.AutoDispose.1.5
                    @Override // com.uber.autodispose.SingleSubscribeProxy
                    public Disposable a(Consumer<? super T> consumer) {
                        return new AutoDisposeSingle(single, CompletableSource.this).subscribe(consumer);
                    }

                    @Override // com.uber.autodispose.SingleSubscribeProxy
                    public Disposable c(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
                        return new AutoDisposeSingle(single, CompletableSource.this).subscribe(consumer, consumer2);
                    }

                    @Override // com.uber.autodispose.SingleSubscribeProxy
                    public void d(SingleObserver<? super T> singleObserver) {
                        new AutoDisposeSingle(single, CompletableSource.this).subscribe(singleObserver);
                    }
                };
            }
        };
    }

    private AutoDispose() {
        throw new AssertionError("No instances");
    }
}
