package androidx.compose.foundation.interaction;

import o.C8627dsp;

/* loaded from: classes.dex */
public interface PressInteraction extends Interaction {

    /* loaded from: classes.dex */
    public static final class Press implements PressInteraction {
        private final long pressPosition;

        public /* synthetic */ Press(long j, C8627dsp c8627dsp) {
            this(j);
        }

        /* renamed from: getPressPosition-F1C5BW0  reason: not valid java name */
        public final long m222getPressPositionF1C5BW0() {
            return this.pressPosition;
        }

        private Press(long j) {
            this.pressPosition = j;
        }
    }

    /* loaded from: classes.dex */
    public static final class Release implements PressInteraction {
        private final Press press;

        public final Press getPress() {
            return this.press;
        }

        public Release(Press press) {
            this.press = press;
        }
    }

    /* loaded from: classes.dex */
    public static final class Cancel implements PressInteraction {
        private final Press press;

        public final Press getPress() {
            return this.press;
        }

        public Cancel(Press press) {
            this.press = press;
        }
    }
}
