package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import o.C8632dsu;
import o.InterfaceC8613dsb;

/* loaded from: classes.dex */
public final class AndroidParagraphIntrinsics implements ParagraphIntrinsics {
    private final CharSequence charSequence;
    private final Density density;
    private final boolean emojiCompatProcessed;
    private final FontFamily.Resolver fontFamilyResolver;
    private final LayoutIntrinsics layoutIntrinsics;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private TypefaceDirtyTrackerLinkedList resolvedTypefaces;
    private final List<AnnotatedString.Range<SpanStyle>> spanStyles;
    private final TextStyle style;
    private final String text;
    private final int textDirectionHeuristic;
    private final AndroidTextPaint textPaint;

    public final CharSequence getCharSequence$ui_text_release() {
        return this.charSequence;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final LayoutIntrinsics getLayoutIntrinsics$ui_text_release() {
        return this.layoutIntrinsics;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final int getTextDirectionHeuristic$ui_text_release() {
        return this.textDirectionHeuristic;
    }

    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.textPaint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List<androidx.compose.ui.text.AnnotatedString$Range<androidx.compose.ui.text.SpanStyle>>, java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    public AndroidParagraphIntrinsics(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, FontFamily.Resolver resolver, Density density) {
        boolean hasEmojiCompat;
        AnnotatedString.Range<SpanStyle> range;
        this.text = str;
        this.style = textStyle;
        this.spanStyles = list;
        this.placeholders = list2;
        this.fontFamilyResolver = resolver;
        this.density = density;
        AndroidTextPaint androidTextPaint = new AndroidTextPaint(1, density.getDensity());
        this.textPaint = androidTextPaint;
        hasEmojiCompat = AndroidParagraphIntrinsics_androidKt.getHasEmojiCompat(textStyle);
        this.emojiCompatProcessed = !hasEmojiCompat ? false : EmojiCompatStatus.INSTANCE.getFontLoaded().getValue().booleanValue();
        this.textDirectionHeuristic = AndroidParagraphIntrinsics_androidKt.m2308resolveTextDirectionHeuristicsHklW4sA(textStyle.m2178getTextDirections_7Xco(), textStyle.getLocaleList());
        InterfaceC8613dsb<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> interfaceC8613dsb = new InterfaceC8613dsb<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface>() { // from class: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics$resolveTypeface$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(4);
            }

            @Override // o.InterfaceC8613dsb
            public /* synthetic */ Typeface invoke(FontFamily fontFamily, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis) {
                return m2307invokeDPcqOEQ(fontFamily, fontWeight, fontStyle.m2220unboximpl(), fontSynthesis.m2231unboximpl());
            }

            /* renamed from: invoke-DPcqOEQ  reason: not valid java name */
            public final Typeface m2307invokeDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i, int i2) {
                TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList;
                State<Object> mo2201resolveDPcqOEQ = AndroidParagraphIntrinsics.this.getFontFamilyResolver().mo2201resolveDPcqOEQ(fontFamily, fontWeight, i, i2);
                if (!(mo2201resolveDPcqOEQ instanceof TypefaceResult.Immutable)) {
                    typefaceDirtyTrackerLinkedList = AndroidParagraphIntrinsics.this.resolvedTypefaces;
                    TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList2 = new TypefaceDirtyTrackerLinkedList(mo2201resolveDPcqOEQ, typefaceDirtyTrackerLinkedList);
                    AndroidParagraphIntrinsics.this.resolvedTypefaces = typefaceDirtyTrackerLinkedList2;
                    return typefaceDirtyTrackerLinkedList2.getTypeface();
                }
                Object value = mo2201resolveDPcqOEQ.getValue();
                C8632dsu.d(value);
                return (Typeface) value;
            }
        };
        TextPaintExtensions_androidKt.setTextMotion(androidTextPaint, textStyle.getTextMotion());
        SpanStyle applySpanStyle = TextPaintExtensions_androidKt.applySpanStyle(androidTextPaint, textStyle.toSpanStyle(), interfaceC8613dsb, density, !list.isEmpty());
        if (applySpanStyle != null) {
            int size = list.size() + 1;
            list = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    range = new AnnotatedString.Range<>(applySpanStyle, 0, this.text.length());
                } else {
                    range = this.spanStyles.get(i - 1);
                }
                list.add(range);
            }
        }
        CharSequence createCharSequence = AndroidParagraphHelper_androidKt.createCharSequence(this.text, this.textPaint.getTextSize(), this.style, list, this.placeholders, this.density, interfaceC8613dsb, this.emojiCompatProcessed);
        this.charSequence = createCharSequence;
        this.layoutIntrinsics = new LayoutIntrinsics(createCharSequence, this.textPaint, this.textDirectionHeuristic);
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        boolean hasEmojiCompat;
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = this.resolvedTypefaces;
        if (typefaceDirtyTrackerLinkedList == null || !typefaceDirtyTrackerLinkedList.isStaleResolvedFont()) {
            if (!this.emojiCompatProcessed) {
                hasEmojiCompat = AndroidParagraphIntrinsics_androidKt.getHasEmojiCompat(this.style);
                if (!hasEmojiCompat || !EmojiCompatStatus.INSTANCE.getFontLoaded().getValue().booleanValue()) {
                }
            }
            return false;
        }
        return true;
    }
}