package androidx.compose.ui;

import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public interface Alignment {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public interface Horizontal {
        int align(int i, int i2, LayoutDirection layoutDirection);
    }

    /* loaded from: classes.dex */
    public interface Vertical {
        int align(int i, int i2);
    }

    /* renamed from: align-KFBX0sM  reason: not valid java name */
    long mo1056alignKFBX0sM(long j, long j2, LayoutDirection layoutDirection);

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Alignment TopStart = new BiasAlignment(-1.0f, -1.0f);
        private static final Alignment TopCenter = new BiasAlignment(0.0f, -1.0f);
        private static final Alignment TopEnd = new BiasAlignment(1.0f, -1.0f);
        private static final Alignment CenterStart = new BiasAlignment(-1.0f, 0.0f);
        private static final Alignment Center = new BiasAlignment(0.0f, 0.0f);
        private static final Alignment CenterEnd = new BiasAlignment(1.0f, 0.0f);
        private static final Alignment BottomStart = new BiasAlignment(-1.0f, 1.0f);
        private static final Alignment BottomCenter = new BiasAlignment(0.0f, 1.0f);
        private static final Alignment BottomEnd = new BiasAlignment(1.0f, 1.0f);
        private static final Vertical Top = new BiasAlignment.Vertical(-1.0f);
        private static final Vertical CenterVertically = new BiasAlignment.Vertical(0.0f);
        private static final Vertical Bottom = new BiasAlignment.Vertical(1.0f);
        private static final Horizontal Start = new BiasAlignment.Horizontal(-1.0f);
        private static final Horizontal CenterHorizontally = new BiasAlignment.Horizontal(0.0f);
        private static final Horizontal End = new BiasAlignment.Horizontal(1.0f);

        public final Vertical getBottom() {
            return Bottom;
        }

        public final Alignment getBottomCenter() {
            return BottomCenter;
        }

        public final Alignment getBottomEnd() {
            return BottomEnd;
        }

        public final Alignment getBottomStart() {
            return BottomStart;
        }

        public final Alignment getCenter() {
            return Center;
        }

        public final Alignment getCenterEnd() {
            return CenterEnd;
        }

        public final Horizontal getCenterHorizontally() {
            return CenterHorizontally;
        }

        public final Alignment getCenterStart() {
            return CenterStart;
        }

        public final Vertical getCenterVertically() {
            return CenterVertically;
        }

        public final Horizontal getEnd() {
            return End;
        }

        public final Horizontal getStart() {
            return Start;
        }

        public final Vertical getTop() {
            return Top;
        }

        public final Alignment getTopCenter() {
            return TopCenter;
        }

        public final Alignment getTopEnd() {
            return TopEnd;
        }

        public final Alignment getTopStart() {
            return TopStart;
        }

        private Companion() {
        }
    }
}
