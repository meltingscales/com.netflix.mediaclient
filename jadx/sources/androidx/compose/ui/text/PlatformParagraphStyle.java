package androidx.compose.ui.text;

import o.C8627dsp;

/* loaded from: classes.dex */
public final class PlatformParagraphStyle {
    public static final Companion Companion = new Companion(null);
    private static final PlatformParagraphStyle Default = new PlatformParagraphStyle();
    private final int emojiSupportMatch;
    private final boolean includeFontPadding;

    public /* synthetic */ PlatformParagraphStyle(int i, boolean z, C8627dsp c8627dsp) {
        this(i, z);
    }

    /* renamed from: getEmojiSupportMatch-_3YsG6Y  reason: not valid java name */
    public final int m2116getEmojiSupportMatch_3YsG6Y() {
        return this.emojiSupportMatch;
    }

    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    public final PlatformParagraphStyle merge(PlatformParagraphStyle platformParagraphStyle) {
        return platformParagraphStyle == null ? this : platformParagraphStyle;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final PlatformParagraphStyle getDefault() {
            return PlatformParagraphStyle.Default;
        }
    }

    public PlatformParagraphStyle(boolean z) {
        this.includeFontPadding = z;
        this.emojiSupportMatch = EmojiSupportMatch.Companion.m2075getDefault_3YsG6Y();
    }

    private PlatformParagraphStyle(int i, boolean z) {
        this.includeFontPadding = z;
        this.emojiSupportMatch = i;
    }

    public PlatformParagraphStyle() {
        this(EmojiSupportMatch.Companion.m2075getDefault_3YsG6Y(), false, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlatformParagraphStyle) {
            PlatformParagraphStyle platformParagraphStyle = (PlatformParagraphStyle) obj;
            return this.includeFontPadding == platformParagraphStyle.includeFontPadding && EmojiSupportMatch.m2071equalsimpl0(this.emojiSupportMatch, platformParagraphStyle.emojiSupportMatch);
        }
        return false;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.includeFontPadding) * 31) + EmojiSupportMatch.m2072hashCodeimpl(this.emojiSupportMatch);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.includeFontPadding + ", emojiSupportMatch=" + ((Object) EmojiSupportMatch.m2073toStringimpl(this.emojiSupportMatch)) + ')';
    }
}
