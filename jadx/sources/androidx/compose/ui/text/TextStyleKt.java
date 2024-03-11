package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class TextStyleKt {

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final TextStyle lerp(TextStyle textStyle, TextStyle textStyle2, float f) {
        return new TextStyle(SpanStyleKt.lerp(textStyle.toSpanStyle(), textStyle2.toSpanStyle(), f), ParagraphStyleKt.lerp(textStyle.toParagraphStyle(), textStyle2.toParagraphStyle(), f));
    }

    public static final TextStyle resolveDefaults(TextStyle textStyle, LayoutDirection layoutDirection) {
        return new TextStyle(SpanStyleKt.resolveSpanStyleDefaults(textStyle.getSpanStyle$ui_text_release()), ParagraphStyleKt.resolveParagraphStyleDefaults(textStyle.getParagraphStyle$ui_text_release(), layoutDirection), textStyle.getPlatformStyle());
    }

    /* renamed from: resolveTextDirection-IhaHGbI */
    public static final int m2180resolveTextDirectionIhaHGbI(LayoutDirection layoutDirection, int i) {
        TextDirection.Companion companion = TextDirection.Companion;
        if (TextDirection.m2427equalsimpl0(i, companion.m2431getContents_7Xco())) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return companion.m2433getContentOrRtls_7Xco();
                }
                throw new NoWhenBranchMatchedException();
            }
            return companion.m2432getContentOrLtrs_7Xco();
        } else if (TextDirection.m2427equalsimpl0(i, companion.m2436getUnspecifieds_7Xco())) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    return companion.m2435getRtls_7Xco();
                }
                throw new NoWhenBranchMatchedException();
            }
            return companion.m2434getLtrs_7Xco();
        } else {
            return i;
        }
    }

    public static final PlatformTextStyle createPlatformTextStyleInternal(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (platformSpanStyle == null && platformParagraphStyle == null) {
            return null;
        }
        return AndroidTextStyle_androidKt.createPlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }
}
