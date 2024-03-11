package androidx.window.layout;

import o.C8627dsp;

/* loaded from: classes.dex */
public interface FoldingFeature extends DisplayFeature {
    Orientation getOrientation();

    State getState();

    boolean isSeparating();

    /* loaded from: classes.dex */
    public static final class Orientation {
        private final String description;
        public static final Companion Companion = new Companion(null);
        public static final Orientation VERTICAL = new Orientation("VERTICAL");
        public static final Orientation HORIZONTAL = new Orientation("HORIZONTAL");

        public String toString() {
            return this.description;
        }

        private Orientation(String str) {
            this.description = str;
        }

        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class State {
        public static final Companion Companion = new Companion(null);
        public static final State FLAT = new State("FLAT");
        public static final State HALF_OPENED = new State("HALF_OPENED");
        private final String description;

        public String toString() {
            return this.description;
        }

        private State(String str) {
            this.description = str;
        }

        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }
        }
    }
}
