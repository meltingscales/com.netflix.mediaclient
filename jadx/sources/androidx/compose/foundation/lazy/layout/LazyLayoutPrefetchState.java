package androidx.compose.foundation.lazy.layout;

/* loaded from: classes.dex */
public final class LazyLayoutPrefetchState {
    private Prefetcher prefetcher;

    /* loaded from: classes.dex */
    public interface PrefetchHandle {
        void cancel();
    }

    /* loaded from: classes.dex */
    public interface Prefetcher {
        /* renamed from: schedulePrefetch-0kLqBqw  reason: not valid java name */
        PrefetchHandle mo378schedulePrefetch0kLqBqw(int i, long j);
    }

    public final void setPrefetcher$foundation_release(Prefetcher prefetcher) {
        this.prefetcher = prefetcher;
    }

    /* renamed from: schedulePrefetch-0kLqBqw  reason: not valid java name */
    public final PrefetchHandle m377schedulePrefetch0kLqBqw(int i, long j) {
        PrefetchHandle mo378schedulePrefetch0kLqBqw;
        Prefetcher prefetcher = this.prefetcher;
        return (prefetcher == null || (mo378schedulePrefetch0kLqBqw = prefetcher.mo378schedulePrefetch0kLqBqw(i, j)) == null) ? DummyHandle.INSTANCE : mo378schedulePrefetch0kLqBqw;
    }
}
