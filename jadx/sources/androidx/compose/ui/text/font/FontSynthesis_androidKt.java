package androidx.compose.ui.text.font;

/* loaded from: classes.dex */
public final class FontSynthesis_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /* renamed from: synthesizeTypeface-FxwP2eA  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m2236synthesizeTypefaceFxwP2eA(int r5, java.lang.Object r6, androidx.compose.ui.text.font.Font r7, androidx.compose.ui.text.font.FontWeight r8, int r9) {
        /*
            boolean r0 = r6 instanceof android.graphics.Typeface
            if (r0 != 0) goto L5
            return r6
        L5:
            boolean r0 = androidx.compose.ui.text.font.FontSynthesis.m2229isWeightOnimpl$ui_text_release(r5)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L33
            androidx.compose.ui.text.font.FontWeight r0 = r7.getWeight()
            boolean r0 = o.C8632dsu.c(r0, r8)
            if (r0 != 0) goto L33
            androidx.compose.ui.text.font.FontWeight$Companion r0 = androidx.compose.ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r3 = androidx.compose.ui.text.font.AndroidFontUtils_androidKt.getAndroidBold(r0)
            int r3 = r8.compareTo(r3)
            if (r3 < 0) goto L33
            androidx.compose.ui.text.font.FontWeight r3 = r7.getWeight()
            androidx.compose.ui.text.font.FontWeight r0 = androidx.compose.ui.text.font.AndroidFontUtils_androidKt.getAndroidBold(r0)
            int r0 = r3.compareTo(r0)
            if (r0 >= 0) goto L33
            r0 = r1
            goto L34
        L33:
            r0 = r2
        L34:
            boolean r5 = androidx.compose.ui.text.font.FontSynthesis.m2228isStyleOnimpl$ui_text_release(r5)
            if (r5 == 0) goto L46
            int r5 = r7.mo2199getStyle_LCdwA()
            boolean r5 = androidx.compose.ui.text.font.FontStyle.m2217equalsimpl0(r9, r5)
            if (r5 != 0) goto L46
            r5 = r1
            goto L47
        L46:
            r5 = r2
        L47:
            if (r5 != 0) goto L4c
            if (r0 != 0) goto L4c
            return r6
        L4c:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 >= r4) goto L6d
            if (r5 == 0) goto L61
            androidx.compose.ui.text.font.FontStyle$Companion r5 = androidx.compose.ui.text.font.FontStyle.Companion
            int r5 = r5.m2221getItalic_LCdwA()
            boolean r5 = androidx.compose.ui.text.font.FontStyle.m2217equalsimpl0(r9, r5)
            if (r5 == 0) goto L61
            goto L62
        L61:
            r1 = r2
        L62:
            int r5 = androidx.compose.ui.text.font.AndroidFontUtils_androidKt.getAndroidTypefaceStyle(r0, r1)
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r6, r5)
            goto L9f
        L6d:
            if (r0 == 0) goto L74
            int r8 = r8.getWeight()
            goto L7c
        L74:
            androidx.compose.ui.text.font.FontWeight r8 = r7.getWeight()
            int r8 = r8.getWeight()
        L7c:
            if (r5 == 0) goto L89
            androidx.compose.ui.text.font.FontStyle$Companion r5 = androidx.compose.ui.text.font.FontStyle.Companion
            int r5 = r5.m2221getItalic_LCdwA()
            boolean r5 = androidx.compose.ui.text.font.FontStyle.m2217equalsimpl0(r9, r5)
            goto L97
        L89:
            int r5 = r7.mo2199getStyle_LCdwA()
            androidx.compose.ui.text.font.FontStyle$Companion r7 = androidx.compose.ui.text.font.FontStyle.Companion
            int r7 = r7.m2221getItalic_LCdwA()
            boolean r5 = androidx.compose.ui.text.font.FontStyle.m2217equalsimpl0(r5, r7)
        L97:
            androidx.compose.ui.text.font.TypefaceHelperMethodsApi28 r7 = androidx.compose.ui.text.font.TypefaceHelperMethodsApi28.INSTANCE
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            android.graphics.Typeface r5 = r7.create(r6, r8, r5)
        L9f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.FontSynthesis_androidKt.m2236synthesizeTypefaceFxwP2eA(int, java.lang.Object, androidx.compose.ui.text.font.Font, androidx.compose.ui.text.font.FontWeight, int):java.lang.Object");
    }
}
