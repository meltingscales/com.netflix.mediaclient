package androidx.compose.foundation.interaction;

/* loaded from: classes.dex */
public interface DragInteraction extends Interaction {

    /* loaded from: classes.dex */
    public static final class Start implements DragInteraction {
    }

    /* loaded from: classes.dex */
    public static final class Stop implements DragInteraction {
        private final Start start;

        public final Start getStart() {
            return this.start;
        }

        public Stop(Start start) {
            this.start = start;
        }
    }

    /* loaded from: classes.dex */
    public static final class Cancel implements DragInteraction {
        private final Start start;

        public final Start getStart() {
            return this.start;
        }

        public Cancel(Start start) {
            this.start = start;
        }
    }
}
