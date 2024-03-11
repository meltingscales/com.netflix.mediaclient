package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public abstract class Outline {
    public /* synthetic */ Outline(C8627dsp c8627dsp) {
        this();
    }

    private Outline() {
    }

    /* loaded from: classes.dex */
    public static final class Rectangle extends Outline {
        private final Rect rect;

        public final Rect getRect() {
            return this.rect;
        }

        public Rectangle(Rect rect) {
            super(null);
            this.rect = rect;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Rectangle) && C8632dsu.c(this.rect, ((Rectangle) obj).rect);
        }

        public int hashCode() {
            return this.rect.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class Rounded extends Outline {
        private final RoundRect roundRect;
        private final Path roundRectPath;

        public final RoundRect getRoundRect() {
            return this.roundRect;
        }

        public final Path getRoundRectPath$ui_graphics_release() {
            return this.roundRectPath;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Rounded(RoundRect roundRect) {
            super(null);
            Path path = null;
            this.roundRect = roundRect;
            if (!OutlineKt.access$hasSameCornerRadius(roundRect)) {
                path = AndroidPath_androidKt.Path();
                path.addRoundRect(roundRect);
            }
            this.roundRectPath = path;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Rounded) && C8632dsu.c(this.roundRect, ((Rounded) obj).roundRect);
        }

        public int hashCode() {
            return this.roundRect.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class Generic extends Outline {
        private final Path path;

        public final Path getPath() {
            return this.path;
        }

        public Generic(Path path) {
            super(null);
            this.path = path;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Generic) && C8632dsu.c(this.path, ((Generic) obj).path);
        }

        public int hashCode() {
            return this.path.hashCode();
        }
    }
}
