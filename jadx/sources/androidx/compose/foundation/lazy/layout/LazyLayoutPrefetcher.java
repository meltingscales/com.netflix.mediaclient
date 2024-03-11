package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import java.util.concurrent.TimeUnit;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes.dex */
public final class LazyLayoutPrefetcher implements RememberObserver, LazyLayoutPrefetchState.Prefetcher, Runnable, Choreographer.FrameCallback {
    private static long frameIntervalNs;
    private long averagePrecomposeTimeNs;
    private long averagePremeasureTimeNs;
    private boolean isActive;
    private final LazyLayoutItemContentFactory itemContentFactory;
    private boolean prefetchScheduled;
    private final LazyLayoutPrefetchState prefetchState;
    private final SubcomposeLayoutState subcomposeLayoutState;
    private final View view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final MutableVector<PrefetchRequest> prefetchRequests = new MutableVector<>(new PrefetchRequest[16], 0);
    private final Choreographer choreographer = Choreographer.getInstance();

    private final boolean enoughTimeLeft(long j, long j2, long j3) {
        return j + j3 < j2;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    public LazyLayoutPrefetcher(LazyLayoutPrefetchState lazyLayoutPrefetchState, SubcomposeLayoutState subcomposeLayoutState, LazyLayoutItemContentFactory lazyLayoutItemContentFactory, View view) {
        this.prefetchState = lazyLayoutPrefetchState;
        this.subcomposeLayoutState = subcomposeLayoutState;
        this.itemContentFactory = lazyLayoutItemContentFactory;
        this.view = view;
        Companion.calculateFrameIntervalIfNeeded(view);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prefetchRequests.isEmpty() || !this.prefetchScheduled || !this.isActive || this.view.getWindowVisibility() != 0) {
            this.prefetchScheduled = false;
            return;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.view.getDrawingTime()) + frameIntervalNs;
        boolean z = System.nanoTime() > nanos;
        boolean z2 = false;
        while (this.prefetchRequests.isNotEmpty() && !z2) {
            PrefetchRequest prefetchRequest = this.prefetchRequests.getContent()[0];
            LazyLayoutItemProvider invoke = this.itemContentFactory.getItemProvider().invoke();
            if (!prefetchRequest.getCanceled()) {
                int itemCount = invoke.getItemCount();
                int index = prefetchRequest.getIndex();
                if (index >= 0 && index < itemCount) {
                    if (prefetchRequest.getPrecomposeHandle() != null) {
                        if (!(!prefetchRequest.getMeasured())) {
                            throw new IllegalStateException("request already measured".toString());
                        }
                        Trace.beginSection("compose:lazylist:prefetch:measure");
                        try {
                            long nanoTime = System.nanoTime();
                            if (!enoughTimeLeft(nanoTime, nanos, this.averagePremeasureTimeNs) && !z) {
                                dpR dpr = dpR.c;
                                z2 = true;
                            }
                            SubcomposeLayoutState.PrecomposedSlotHandle precomposeHandle = prefetchRequest.getPrecomposeHandle();
                            C8632dsu.d(precomposeHandle);
                            int placeablesCount = precomposeHandle.getPlaceablesCount();
                            for (int i = 0; i < placeablesCount; i++) {
                                precomposeHandle.mo1817premeasure0kLqBqw(i, prefetchRequest.m379getConstraintsmsEJaDk());
                            }
                            this.averagePremeasureTimeNs = calculateAverageTime(System.nanoTime() - nanoTime, this.averagePremeasureTimeNs);
                            this.prefetchRequests.removeAt(0);
                            z = false;
                        } finally {
                        }
                    } else {
                        Trace.beginSection("compose:lazylist:prefetch:compose");
                        try {
                            long nanoTime2 = System.nanoTime();
                            if (!enoughTimeLeft(nanoTime2, nanos, this.averagePrecomposeTimeNs) && !z) {
                                z2 = true;
                                dpR dpr2 = dpR.c;
                            }
                            Object key = invoke.getKey(prefetchRequest.getIndex());
                            prefetchRequest.setPrecomposeHandle(this.subcomposeLayoutState.precompose(key, this.itemContentFactory.getContent(prefetchRequest.getIndex(), key, invoke.getContentType(prefetchRequest.getIndex()))));
                            this.averagePrecomposeTimeNs = calculateAverageTime(System.nanoTime() - nanoTime2, this.averagePrecomposeTimeNs);
                            z = false;
                            dpR dpr22 = dpR.c;
                        } finally {
                        }
                    }
                }
            }
            this.prefetchRequests.removeAt(0);
        }
        if (z2) {
            this.choreographer.postFrameCallback(this);
        } else {
            this.prefetchScheduled = false;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (this.isActive) {
            this.view.post(this);
        }
    }

    private final long calculateAverageTime(long j, long j2) {
        if (j2 == 0) {
            return j;
        }
        long j3 = 4;
        return (j / j3) + ((j2 / j3) * 3);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.Prefetcher
    /* renamed from: schedulePrefetch-0kLqBqw */
    public LazyLayoutPrefetchState.PrefetchHandle mo378schedulePrefetch0kLqBqw(int i, long j) {
        PrefetchRequest prefetchRequest = new PrefetchRequest(i, j, null);
        this.prefetchRequests.add(prefetchRequest);
        if (!this.prefetchScheduled) {
            this.prefetchScheduled = true;
            this.view.post(this);
        }
        return prefetchRequest;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.prefetchState.setPrefetcher$foundation_release(this);
        this.isActive = true;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.isActive = false;
        this.prefetchState.setPrefetcher$foundation_release(null);
        this.view.removeCallbacks(this);
        this.choreographer.removeFrameCallback(this);
    }

    /* loaded from: classes.dex */
    static final class PrefetchRequest implements LazyLayoutPrefetchState.PrefetchHandle {
        private boolean canceled;
        private final long constraints;
        private final int index;
        private boolean measured;
        private SubcomposeLayoutState.PrecomposedSlotHandle precomposeHandle;

        public /* synthetic */ PrefetchRequest(int i, long j, C8627dsp c8627dsp) {
            this(i, j);
        }

        public final boolean getCanceled() {
            return this.canceled;
        }

        /* renamed from: getConstraints-msEJaDk  reason: not valid java name */
        public final long m379getConstraintsmsEJaDk() {
            return this.constraints;
        }

        public final int getIndex() {
            return this.index;
        }

        public final boolean getMeasured() {
            return this.measured;
        }

        public final SubcomposeLayoutState.PrecomposedSlotHandle getPrecomposeHandle() {
            return this.precomposeHandle;
        }

        public final void setPrecomposeHandle(SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle) {
            this.precomposeHandle = precomposedSlotHandle;
        }

        private PrefetchRequest(int i, long j) {
            this.index = i;
            this.constraints = j;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public void cancel() {
            if (this.canceled) {
                return;
            }
            this.canceled = true;
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle != null) {
                precomposedSlotHandle.dispose();
            }
            this.precomposeHandle = null;
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
            if (r5 >= 30.0f) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void calculateFrameIntervalIfNeeded(android.view.View r5) {
            /*
                r4 = this;
                long r0 = androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher.access$getFrameIntervalNs$cp()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L2c
                android.view.Display r0 = r5.getDisplay()
                boolean r5 = r5.isInEditMode()
                if (r5 != 0) goto L21
                if (r0 == 0) goto L21
                float r5 = r0.getRefreshRate()
                r0 = 1106247680(0x41f00000, float:30.0)
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 < 0) goto L21
                goto L23
            L21:
                r5 = 1114636288(0x42700000, float:60.0)
            L23:
                r0 = 1000000000(0x3b9aca00, float:0.0047237873)
                float r0 = (float) r0
                float r0 = r0 / r5
                long r0 = (long) r0
                androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher.access$setFrameIntervalNs$cp(r0)
            L2c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher.Companion.calculateFrameIntervalIfNeeded(android.view.View):void");
        }
    }
}
