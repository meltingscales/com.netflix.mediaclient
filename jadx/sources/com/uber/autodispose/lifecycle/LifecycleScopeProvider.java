package com.uber.autodispose.lifecycle;

import com.uber.autodispose.ScopeProvider;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;

/* loaded from: classes.dex */
public interface LifecycleScopeProvider<E> extends ScopeProvider {
    CorrespondingEventsFunction<E> b();

    E c();

    Observable<E> d();

    @Override // com.uber.autodispose.ScopeProvider
    default CompletableSource a() {
        return LifecycleScopes.a(this);
    }
}
