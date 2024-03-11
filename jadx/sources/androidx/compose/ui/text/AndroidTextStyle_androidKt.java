package androidx.compose.ui.text;

/* loaded from: classes.dex */
public final class AndroidTextStyle_androidKt {
    public static final PlatformSpanStyle lerp(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f) {
        return platformSpanStyle;
    }

    public static final PlatformTextStyle createPlatformTextStyle(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        return new PlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }

    public static final PlatformParagraphStyle lerp(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f) {
        if (platformParagraphStyle.getIncludeFontPadding() == platformParagraphStyle2.getIncludeFontPadding()) {
            return platformParagraphStyle;
        }
        return new PlatformParagraphStyle(((EmojiSupportMatch) SpanStyleKt.lerpDiscrete(EmojiSupportMatch.m2068boximpl(platformParagraphStyle.m2116getEmojiSupportMatch_3YsG6Y()), EmojiSupportMatch.m2068boximpl(platformParagraphStyle2.m2116getEmojiSupportMatch_3YsG6Y()), f)).m2074unboximpl(), ((Boolean) SpanStyleKt.lerpDiscrete(Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding()), Boolean.valueOf(platformParagraphStyle2.getIncludeFontPadding()), f)).booleanValue(), null);
    }
}
