package androidx.compose.foundation.interaction;

/* loaded from: classes.dex */
public interface FocusInteraction extends Interaction {

    /* loaded from: classes.dex */
    public static final class Focus implements FocusInteraction {
    }

    /* loaded from: classes.dex */
    public static final class Unfocus implements FocusInteraction {
        private final Focus focus;

        public final Focus getFocus() {
            return this.focus;
        }

        public Unfocus(Focus focus) {
            this.focus = focus;
        }
    }
}
