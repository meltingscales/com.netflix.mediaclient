package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.layout.FoldingFeature;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class HardwareFoldingFeature implements FoldingFeature {
    public static final Companion Companion = new Companion(null);
    private final Bounds featureBounds;
    private final FoldingFeature.State state;
    private final Type type;

    @Override // androidx.window.layout.FoldingFeature
    public FoldingFeature.State getState() {
        return this.state;
    }

    public HardwareFoldingFeature(Bounds bounds, Type type, FoldingFeature.State state) {
        C8632dsu.c((Object) bounds, "");
        C8632dsu.c((Object) type, "");
        C8632dsu.c((Object) state, "");
        this.featureBounds = bounds;
        this.type = type;
        this.state = state;
        Companion.validateFeatureBounds$window_release(bounds);
    }

    @Override // androidx.window.layout.DisplayFeature
    public Rect getBounds() {
        return this.featureBounds.toRect();
    }

    @Override // androidx.window.layout.FoldingFeature
    public boolean isSeparating() {
        Type type = this.type;
        Type.Companion companion = Type.Companion;
        return C8632dsu.c(type, companion.getHINGE()) || (C8632dsu.c(this.type, companion.getFOLD()) && C8632dsu.c(getState(), FoldingFeature.State.HALF_OPENED));
    }

    @Override // androidx.window.layout.FoldingFeature
    public FoldingFeature.Orientation getOrientation() {
        if (this.featureBounds.getWidth() > this.featureBounds.getHeight()) {
            return FoldingFeature.Orientation.HORIZONTAL;
        }
        return FoldingFeature.Orientation.VERTICAL;
    }

    public String toString() {
        return ((Object) HardwareFoldingFeature.class.getSimpleName()) + " { " + this.featureBounds + ", type=" + this.type + ", state=" + getState() + " }";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C8632dsu.c(HardwareFoldingFeature.class, obj == null ? null : obj.getClass())) {
            if (obj != null) {
                HardwareFoldingFeature hardwareFoldingFeature = (HardwareFoldingFeature) obj;
                return C8632dsu.c(this.featureBounds, hardwareFoldingFeature.featureBounds) && C8632dsu.c(this.type, hardwareFoldingFeature.type) && C8632dsu.c(getState(), hardwareFoldingFeature.getState());
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        }
        return false;
    }

    public int hashCode() {
        return (((this.featureBounds.hashCode() * 31) + this.type.hashCode()) * 31) + getState().hashCode();
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final void validateFeatureBounds$window_release(Bounds bounds) {
            C8632dsu.c((Object) bounds, "");
            if (bounds.getWidth() == 0 && bounds.getHeight() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero".toString());
            }
            if (bounds.getLeft() != 0 && bounds.getTop() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class Type {
        public static final Companion Companion = new Companion(null);
        private static final Type FOLD = new Type("FOLD");
        private static final Type HINGE = new Type("HINGE");
        private final String description;

        public String toString() {
            return this.description;
        }

        private Type(String str) {
            this.description = str;
        }

        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            public final Type getFOLD() {
                return Type.FOLD;
            }

            public final Type getHINGE() {
                return Type.HINGE;
            }
        }
    }
}
