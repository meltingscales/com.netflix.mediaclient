package o;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnitKt;
import com.netflix.hawkins.consumer.tokens.Token;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes3.dex */
public final class LH {

    /* loaded from: classes3.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[Token.Typography.FontFamily.values().length];
            try {
                iArr[Token.Typography.FontFamily.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            c = iArr;
        }
    }

    public static final TextStyle e(Token.Typography typography) {
        C8632dsu.c((Object) typography, "");
        long sp = TextUnitKt.getSp(typography.b());
        FontWeight fontWeight = new FontWeight(typography.d());
        if (a.c[typography.c().ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        return new TextStyle(0L, sp, fontWeight, (FontStyle) null, (FontSynthesis) null, C1031Ly.a(FontFamily.Companion), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252889, (C8627dsp) null).merge(new ParagraphStyle((TextAlign) null, (TextDirection) null, TextUnitKt.getSp(typography.a()), (TextIndent) null, (PlatformParagraphStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 507, (C8627dsp) null));
    }
}
