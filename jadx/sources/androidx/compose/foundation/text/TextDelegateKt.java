package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import java.util.List;
import o.C8632dsu;
import o.dsT;

/* loaded from: classes.dex */
public final class TextDelegateKt {
    public static final int ceilToIntPx(float f) {
        int e;
        e = dsT.e((float) Math.ceil(f));
        return e;
    }

    /* renamed from: updateTextDelegate-rm0N8CA  reason: not valid java name */
    public static final TextDelegate m449updateTextDelegaterm0N8CA(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z, int i, int i2, int i3, List<AnnotatedString.Range<Placeholder>> list) {
        if (C8632dsu.c(textDelegate.getText(), annotatedString) && C8632dsu.c(textDelegate.getStyle(), textStyle)) {
            if (textDelegate.getSoftWrap() == z) {
                if (TextOverflow.m2453equalsimpl0(textDelegate.m447getOverflowgIe3tQ8(), i)) {
                    if (textDelegate.getMaxLines() == i2) {
                        if (textDelegate.getMinLines() == i3 && C8632dsu.c(textDelegate.getDensity(), density)) {
                            if (C8632dsu.c(textDelegate.getPlaceholders(), list) && textDelegate.getFontFamilyResolver() == resolver) {
                                return textDelegate;
                            }
                            return new TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, null);
                        }
                        return new TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, null);
                    }
                    return new TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, null);
                }
                return new TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, null);
            }
            return new TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, null);
        }
        return new TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, null);
    }
}
