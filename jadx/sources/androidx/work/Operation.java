package androidx.work;

import android.annotation.SuppressLint;

/* loaded from: classes2.dex */
public interface Operation {
    @SuppressLint({"SyntheticAccessor"})
    public static final State.SUCCESS SUCCESS = new State.SUCCESS();
    @SuppressLint({"SyntheticAccessor"})
    public static final State.IN_PROGRESS IN_PROGRESS = new State.IN_PROGRESS();

    /* loaded from: classes2.dex */
    public static abstract class State {
        State() {
        }

        /* loaded from: classes2.dex */
        public static final class SUCCESS extends State {
            public String toString() {
                return "SUCCESS";
            }

            private SUCCESS() {
            }
        }

        /* loaded from: classes2.dex */
        public static final class IN_PROGRESS extends State {
            public String toString() {
                return "IN_PROGRESS";
            }

            private IN_PROGRESS() {
            }
        }

        /* loaded from: classes2.dex */
        public static final class FAILURE extends State {
            private final Throwable mThrowable;

            public Throwable getThrowable() {
                return this.mThrowable;
            }

            public FAILURE(Throwable th) {
                this.mThrowable = th;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.mThrowable.getMessage());
            }
        }
    }
}
