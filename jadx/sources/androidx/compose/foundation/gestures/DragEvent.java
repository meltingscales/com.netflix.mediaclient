package androidx.compose.foundation.gestures;

import o.C8627dsp;

/* loaded from: classes.dex */
public abstract class DragEvent {
    public /* synthetic */ DragEvent(C8627dsp c8627dsp) {
        this();
    }

    /* loaded from: classes.dex */
    public static final class DragStarted extends DragEvent {
        private final long startPoint;

        public /* synthetic */ DragStarted(long j, C8627dsp c8627dsp) {
            this(j);
        }

        /* renamed from: getStartPoint-F1C5BW0  reason: not valid java name */
        public final long m163getStartPointF1C5BW0() {
            return this.startPoint;
        }

        private DragStarted(long j) {
            super(null);
            this.startPoint = j;
        }
    }

    private DragEvent() {
    }

    /* loaded from: classes.dex */
    public static final class DragStopped extends DragEvent {
        private final long velocity;

        public /* synthetic */ DragStopped(long j, C8627dsp c8627dsp) {
            this(j);
        }

        /* renamed from: getVelocity-9UxMQ8M  reason: not valid java name */
        public final long m164getVelocity9UxMQ8M() {
            return this.velocity;
        }

        private DragStopped(long j) {
            super(null);
            this.velocity = j;
        }
    }

    /* loaded from: classes.dex */
    public static final class DragCancelled extends DragEvent {
        public static final DragCancelled INSTANCE = new DragCancelled();

        private DragCancelled() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class DragDelta extends DragEvent {
        private final long delta;

        public /* synthetic */ DragDelta(long j, C8627dsp c8627dsp) {
            this(j);
        }

        /* renamed from: getDelta-F1C5BW0  reason: not valid java name */
        public final long m162getDeltaF1C5BW0() {
            return this.delta;
        }

        private DragDelta(long j) {
            super(null);
            this.delta = j;
        }
    }
}
