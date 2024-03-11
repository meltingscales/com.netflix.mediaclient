package com.uber.autodispose;

import io.reactivex.Completable;
import io.reactivex.CompletableSource;

/* loaded from: classes.dex */
public interface ScopeProvider {
    public static final ScopeProvider d = new ScopeProvider() { // from class: com.uber.autodispose.ScopeProvider$$ExternalSyntheticLambda0
        @Override // com.uber.autodispose.ScopeProvider
        public final CompletableSource a() {
            return Completable.never();
        }
    };

    CompletableSource a();
}
