package androidx.compose.runtime.snapshots;

import o.C8627dsp;

/* loaded from: classes.dex */
public abstract class SnapshotApplyResult {
    public /* synthetic */ SnapshotApplyResult(C8627dsp c8627dsp) {
        this();
    }

    private SnapshotApplyResult() {
    }

    /* loaded from: classes.dex */
    public static final class Success extends SnapshotApplyResult {
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class Failure extends SnapshotApplyResult {
        private final Snapshot snapshot;

        public Failure(Snapshot snapshot) {
            super(null);
            this.snapshot = snapshot;
        }
    }
}
