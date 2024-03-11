package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.SolidColor;
import kotlin.NoWhenBranchMatchedException;
import o.C8632dsu;
import o.drO;

/* loaded from: classes.dex */
public interface TextForegroundStyle {
    public static final Companion Companion = Companion.$$INSTANCE;

    float getAlpha();

    Brush getBrush();

    /* renamed from: getColor-0d7_KjU */
    long mo2340getColor0d7_KjU();

    default TextForegroundStyle merge(TextForegroundStyle textForegroundStyle) {
        boolean z = textForegroundStyle instanceof BrushStyle;
        if (z && (this instanceof BrushStyle)) {
            return new BrushStyle(((BrushStyle) textForegroundStyle).getValue(), TextDrawStyleKt.access$takeOrElse(textForegroundStyle.getAlpha(), new drO<Float>() { // from class: androidx.compose.ui.text.style.TextForegroundStyle$merge$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // o.drO
                public final Float invoke() {
                    return Float.valueOf(TextForegroundStyle.this.getAlpha());
                }
            }));
        }
        return (!z || (this instanceof BrushStyle)) ? (z || !(this instanceof BrushStyle)) ? textForegroundStyle.takeOrElse(new drO<TextForegroundStyle>() { // from class: androidx.compose.ui.text.style.TextForegroundStyle$merge$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final TextForegroundStyle invoke() {
                return TextForegroundStyle.this;
            }
        }) : this : textForegroundStyle;
    }

    default TextForegroundStyle takeOrElse(drO<? extends TextForegroundStyle> dro) {
        return !C8632dsu.c(this, Unspecified.INSTANCE) ? this : dro.invoke();
    }

    /* loaded from: classes.dex */
    public static final class Unspecified implements TextForegroundStyle {
        public static final Unspecified INSTANCE = new Unspecified();

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public float getAlpha() {
            return Float.NaN;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public Brush getBrush() {
            return null;
        }

        private Unspecified() {
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        /* renamed from: getColor-0d7_KjU */
        public long mo2340getColor0d7_KjU() {
            return Color.Companion.m1309getUnspecified0d7_KjU();
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final TextForegroundStyle from(Brush brush, float f) {
            if (brush == null) {
                return Unspecified.INSTANCE;
            }
            if (brush instanceof SolidColor) {
                return m2438from8_81llA(TextDrawStyleKt.m2437modulateDxMtmZc(((SolidColor) brush).m1441getValue0d7_KjU(), f));
            }
            if (brush instanceof ShaderBrush) {
                return new BrushStyle((ShaderBrush) brush, f);
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: from-8_81llA  reason: not valid java name */
        public final TextForegroundStyle m2438from8_81llA(long j) {
            return j != Color.Companion.m1309getUnspecified0d7_KjU() ? new ColorStyle(j, null) : Unspecified.INSTANCE;
        }
    }
}
