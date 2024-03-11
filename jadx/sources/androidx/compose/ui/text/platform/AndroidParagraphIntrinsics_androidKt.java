package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import java.util.List;

/* loaded from: classes.dex */
public final class AndroidParagraphIntrinsics_androidKt {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
        if (r4 == null) goto L24;
     */
    /* renamed from: resolveTextDirectionHeuristics-HklW4sA  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m2308resolveTextDirectionHeuristicsHklW4sA(int r4, androidx.compose.ui.text.intl.LocaleList r5) {
        /*
            androidx.compose.ui.text.style.TextDirection$Companion r0 = androidx.compose.ui.text.style.TextDirection.Companion
            int r1 = r0.m2432getContentOrLtrs_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m2427equalsimpl0(r4, r1)
            if (r1 == 0) goto Ld
            goto L6a
        Ld:
            int r1 = r0.m2433getContentOrRtls_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m2427equalsimpl0(r4, r1)
            if (r1 == 0) goto L18
            goto L68
        L18:
            int r1 = r0.m2434getLtrs_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m2427equalsimpl0(r4, r1)
            r2 = 0
            if (r1 == 0) goto L24
            goto L6b
        L24:
            int r1 = r0.m2435getRtls_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m2427equalsimpl0(r4, r1)
            r3 = 1
            if (r1 == 0) goto L31
            r2 = r3
            goto L6b
        L31:
            int r1 = r0.m2431getContents_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m2427equalsimpl0(r4, r1)
            if (r1 == 0) goto L3c
            goto L46
        L3c:
            int r0 = r0.m2436getUnspecifieds_7Xco()
            boolean r4 = androidx.compose.ui.text.style.TextDirection.m2427equalsimpl0(r4, r0)
            if (r4 == 0) goto L6c
        L46:
            if (r5 == 0) goto L5b
            androidx.compose.ui.text.intl.Locale r4 = r5.get(r2)
            androidx.compose.ui.text.intl.PlatformLocale r4 = r4.getPlatformLocale$ui_text_release()
            o.C8632dsu.d(r4)
            androidx.compose.ui.text.intl.AndroidLocale r4 = (androidx.compose.ui.text.intl.AndroidLocale) r4
            java.util.Locale r4 = r4.getJavaLocale()
            if (r4 != 0) goto L5f
        L5b:
            java.util.Locale r4 = java.util.Locale.getDefault()
        L5f:
            int r4 = androidx.core.text.TextUtilsCompat.getLayoutDirectionFromLocale(r4)
            if (r4 == 0) goto L6a
            if (r4 == r3) goto L68
            goto L6a
        L68:
            r2 = 3
            goto L6b
        L6a:
            r2 = 2
        L6b:
            return r2
        L6c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Invalid TextDirection."
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt.m2308resolveTextDirectionHeuristicsHklW4sA(int, androidx.compose.ui.text.intl.LocaleList):int");
    }

    public static final ParagraphIntrinsics ActualParagraphIntrinsics(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, FontFamily.Resolver resolver) {
        return new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHasEmojiCompat(TextStyle textStyle) {
        PlatformParagraphStyle paragraphStyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        EmojiSupportMatch m2068boximpl = (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) ? null : EmojiSupportMatch.m2068boximpl(paragraphStyle.m2116getEmojiSupportMatch_3YsG6Y());
        return !(m2068boximpl == null ? false : EmojiSupportMatch.m2071equalsimpl0(m2068boximpl.m2074unboximpl(), EmojiSupportMatch.Companion.m2076getNone_3YsG6Y()));
    }
}
