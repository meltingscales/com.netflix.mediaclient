package com.uber.autodispose.lifecycle;

import com.uber.autodispose.AutoDisposePlugins;
import com.uber.autodispose.OutsideScopeException;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.Comparator;

/* loaded from: classes5.dex */
public final class LifecycleScopes {
    private static final Comparator<Comparable<Object>> d = new Comparator() { // from class: com.uber.autodispose.lifecycle.LifecycleScopes$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    };

    public static <E> CompletableSource a(LifecycleScopeProvider<E> lifecycleScopeProvider) {
        return b((LifecycleScopeProvider) lifecycleScopeProvider, true);
    }

    public static <E> CompletableSource b(LifecycleScopeProvider<E> lifecycleScopeProvider, boolean z) {
        E c = lifecycleScopeProvider.c();
        CorrespondingEventsFunction<E> b = lifecycleScopeProvider.b();
        if (c == null) {
            throw new LifecycleNotStartedException();
        }
        try {
            return b(lifecycleScopeProvider.d(), b.apply(c));
        } catch (Exception e) {
            if (z && (e instanceof LifecycleEndedException)) {
                Consumer<? super OutsideScopeException> d2 = AutoDisposePlugins.d();
                if (d2 != null) {
                    try {
                        d2.accept((LifecycleEndedException) e);
                        return Completable.complete();
                    } catch (Exception e2) {
                        return Completable.error(e2);
                    }
                }
                throw e;
            }
            return Completable.error(e);
        }
    }

    public static <E> CompletableSource b(Observable<E> observable, E e) {
        return a(observable, e, e instanceof Comparable ? d : null);
    }

    public static <E> CompletableSource a(Observable<E> observable, final E e, final Comparator<E> comparator) {
        Predicate<? super E> predicate;
        if (comparator != null) {
            predicate = new Predicate() { // from class: com.uber.autodispose.lifecycle.LifecycleScopes$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean c;
                    c = LifecycleScopes.c(comparator, e, obj);
                    return c;
                }
            };
        } else {
            predicate = new Predicate() { // from class: com.uber.autodispose.lifecycle.LifecycleScopes$$ExternalSyntheticLambda2
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean c;
                    c = LifecycleScopes.c(e, obj);
                    return c;
                }
            };
        }
        return observable.skip(1L).takeUntil(predicate).ignoreElements();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(Comparator comparator, Object obj, Object obj2) {
        return comparator.compare(obj2, obj) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(Object obj, Object obj2) {
        return obj2.equals(obj);
    }
}
