package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextDecoration;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.hawkins.consumer.component.textlink.HawkinsTextLinkType;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;

/* loaded from: classes3.dex */
public final class KG {
    public static final KG e = new KG();

    private KG() {
    }

    public final KL d(Theme theme, HawkinsTextLinkType hawkinsTextLinkType, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, SpanStyle spanStyle, Composer composer, int i, int i2, int i3) {
        composer.startReplaceableGroup(-1648420298);
        Theme theme2 = (i3 & 1) != 0 ? (Theme) composer.consume(LC.e()) : theme;
        HawkinsTextLinkType hawkinsTextLinkType2 = (i3 & 2) != 0 ? HawkinsTextLinkType.e : hawkinsTextLinkType;
        TextStyle e2 = (i3 & 4) != 0 ? LH.e(Token.Typography.M.e) : textStyle;
        TextStyle e3 = (i3 & 8) != 0 ? LH.e(Token.Typography.R.d) : textStyle2;
        TextStyle e4 = (i3 & 16) != 0 ? LH.e(Token.Typography.an.c) : textStyle3;
        TextStyle e5 = (i3 & 32) != 0 ? LH.e(Token.Typography.aq.e) : textStyle4;
        TextStyle e6 = (i3 & 64) != 0 ? LH.e(Token.Typography.ar.b) : textStyle5;
        TextStyle e7 = (i3 & 128) != 0 ? LH.e(Token.Typography.C0693f.b) : textStyle6;
        TextStyle textStyle8 = (i3 & JSONzip.end) != 0 ? null : textStyle7;
        SpanStyle spanStyle2 = (i3 & 512) != 0 ? new SpanStyle(LA.d(C1016Lj.e(hawkinsTextLinkType2), theme2), 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.Companion.getUnderline(), null, null, null, 61438, null) : spanStyle;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1648420298, i, i2, "com.netflix.hawkins.consumer.component.extensions.MarkdownDefaults.hawkinsStyles (ParseAsMarkdown.kt:107)");
        }
        a aVar = new a(e2, e3, e4, e5, e6, e7, textStyle8, spanStyle2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return aVar;
    }

    /* loaded from: classes3.dex */
    public static final class a implements KL {
        private final TextStyle a;
        private final TextStyle b;
        private final TextStyle c;
        private final TextStyle d;
        private final TextStyle e;
        private final SpanStyle f;
        private final TextStyle g;
        private final TextStyle h;

        @Override // o.KL
        public TextStyle a() {
            return this.b;
        }

        @Override // o.KL
        public TextStyle b() {
            return this.c;
        }

        @Override // o.KL
        public TextStyle c() {
            return this.e;
        }

        @Override // o.KL
        public TextStyle d() {
            return this.a;
        }

        @Override // o.KL
        public TextStyle e() {
            return this.d;
        }

        @Override // o.KL
        public TextStyle h() {
            return this.g;
        }

        @Override // o.KL
        public SpanStyle i() {
            return this.f;
        }

        @Override // o.KL
        public TextStyle j() {
            return this.h;
        }

        a(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, SpanStyle spanStyle) {
            this.b = textStyle;
            this.a = textStyle2;
            this.e = textStyle3;
            this.d = textStyle4;
            this.c = textStyle5;
            this.h = textStyle6;
            this.g = textStyle7;
            this.f = spanStyle;
        }
    }
}
