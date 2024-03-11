package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class AbstractMaybeWithUpstream<T, R> extends Maybe<R> {
    protected final MaybeSource<T> source;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractMaybeWithUpstream(MaybeSource<T> maybeSource) {
        this.source = maybeSource;
    }
}
