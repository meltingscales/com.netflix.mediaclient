package androidx.compose.runtime;

/* loaded from: classes.dex */
public final class RememberObserverHolder {
    private RememberObserver wrapped;

    public final RememberObserver getWrapped() {
        return this.wrapped;
    }

    public RememberObserverHolder(RememberObserver rememberObserver) {
        this.wrapped = rememberObserver;
    }
}
