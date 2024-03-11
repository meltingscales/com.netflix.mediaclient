package androidx.compose.ui.text.font;

import java.util.List;
import o.C8564dqg;

/* loaded from: classes.dex */
public final class FontFamilyKt {
    public static final FontFamily FontFamily(Font... fontArr) {
        List p;
        p = C8564dqg.p(fontArr);
        return new FontListFontFamily(p);
    }
}
