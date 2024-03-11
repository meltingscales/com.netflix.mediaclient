package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionObserver;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class CompositionObserverHolder {
    private CompositionObserver observer;
    private boolean root;

    public CompositionObserverHolder() {
        this(null, false, 3, null);
    }

    public final CompositionObserver getObserver() {
        return this.observer;
    }

    public final boolean getRoot() {
        return this.root;
    }

    public final void setObserver(CompositionObserver compositionObserver) {
        this.observer = compositionObserver;
    }

    public CompositionObserverHolder(CompositionObserver compositionObserver, boolean z) {
        this.observer = compositionObserver;
        this.root = z;
    }

    public /* synthetic */ CompositionObserverHolder(CompositionObserver compositionObserver, boolean z, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : compositionObserver, (i & 2) != 0 ? false : z);
    }
}
