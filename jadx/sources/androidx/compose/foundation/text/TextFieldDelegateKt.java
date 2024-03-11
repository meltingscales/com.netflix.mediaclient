package androidx.compose.foundation.text;

import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import o.C8569dql;
import o.C8691duz;

/* loaded from: classes.dex */
public final class TextFieldDelegateKt {
    private static final String EmptyTextReplacement;

    public static final String getEmptyTextReplacement() {
        return EmptyTextReplacement;
    }

    static {
        String c;
        c = C8691duz.c("H", 10);
        EmptyTextReplacement = c;
    }

    public static /* synthetic */ long computeSizeForDefaultText$default(TextStyle textStyle, Density density, FontFamily.Resolver resolver, String str, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = EmptyTextReplacement;
        }
        if ((i2 & 16) != 0) {
            i = 1;
        }
        return computeSizeForDefaultText(textStyle, density, resolver, str, i);
    }

    public static final long computeSizeForDefaultText(TextStyle textStyle, Density density, FontFamily.Resolver resolver, String str, int i) {
        List i2;
        i2 = C8569dql.i();
        Paragraph m2090ParagraphUdtVg6A$default = ParagraphKt.m2090ParagraphUdtVg6A$default(str, textStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), density, resolver, i2, null, i, false, 64, null);
        return IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(m2090ParagraphUdtVg6A$default.getMinIntrinsicWidth()), TextDelegateKt.ceilToIntPx(m2090ParagraphUdtVg6A$default.getHeight()));
    }
}
