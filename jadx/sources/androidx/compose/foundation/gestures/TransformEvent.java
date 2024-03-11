package androidx.compose.foundation.gestures;

import o.C8627dsp;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class TransformEvent {
    public /* synthetic */ TransformEvent(C8627dsp c8627dsp) {
        this();
    }

    /* loaded from: classes.dex */
    public static final class TransformStarted extends TransformEvent {
        public static final TransformStarted INSTANCE = new TransformStarted();

        private TransformStarted() {
            super(null);
        }
    }

    private TransformEvent() {
    }

    /* loaded from: classes.dex */
    public static final class TransformStopped extends TransformEvent {
        public static final TransformStopped INSTANCE = new TransformStopped();

        private TransformStopped() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class TransformDelta extends TransformEvent {
        private final long panChange;
        private final float rotationChange;
        private final float zoomChange;

        public /* synthetic */ TransformDelta(float f, long j, float f2, C8627dsp c8627dsp) {
            this(f, j, f2);
        }

        /* renamed from: getPanChange-F1C5BW0  reason: not valid java name */
        public final long m217getPanChangeF1C5BW0() {
            return this.panChange;
        }

        public final float getRotationChange() {
            return this.rotationChange;
        }

        public final float getZoomChange() {
            return this.zoomChange;
        }

        private TransformDelta(float f, long j, float f2) {
            super(null);
            this.zoomChange = f;
            this.panChange = j;
            this.rotationChange = f2;
        }
    }
}
