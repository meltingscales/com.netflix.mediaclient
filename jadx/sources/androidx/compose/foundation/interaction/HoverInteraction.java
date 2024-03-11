package androidx.compose.foundation.interaction;

/* loaded from: classes.dex */
public interface HoverInteraction extends Interaction {

    /* loaded from: classes.dex */
    public static final class Enter implements HoverInteraction {
    }

    /* loaded from: classes.dex */
    public static final class Exit implements HoverInteraction {
        private final Enter enter;

        public final Enter getEnter() {
            return this.enter;
        }

        public Exit(Enter enter) {
            this.enter = enter;
        }
    }
}
