package androidx.compose.ui.text;

import o.C8627dsp;

/* loaded from: classes.dex */
public final class PlatformSpanStyle {
    public static final Companion Companion = new Companion(null);
    private static final PlatformSpanStyle Default = new PlatformSpanStyle();

    public final PlatformSpanStyle merge(PlatformSpanStyle platformSpanStyle) {
        return this;
    }

    public String toString() {
        return "PlatformSpanStyle()";
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final PlatformSpanStyle getDefault() {
            return PlatformSpanStyle.Default;
        }
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof PlatformSpanStyle);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
