package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class TextStringSimpleElement extends ModifierNodeElement<TextStringSimpleNode> {
    private final ColorProducer color;
    private final FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;
    private final int overflow;
    private final boolean softWrap;
    private final TextStyle style;
    private final String text;

    public /* synthetic */ TextStringSimpleElement(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, ColorProducer colorProducer, C8627dsp c8627dsp) {
        this(str, textStyle, resolver, i, z, i2, i3, colorProducer);
    }

    private TextStringSimpleElement(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, ColorProducer colorProducer) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.color = colorProducer;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextStringSimpleNode create() {
        return new TextStringSimpleNode(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.color, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TextStringSimpleNode textStringSimpleNode) {
        textStringSimpleNode.doInvalidations(textStringSimpleNode.updateDraw(this.color, this.style), textStringSimpleNode.updateText(this.text), textStringSimpleNode.m518updateLayoutRelatedArgsHuAbxIM(this.style, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextStringSimpleElement) {
            TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
            return C8632dsu.c(this.color, textStringSimpleElement.color) && C8632dsu.c((Object) this.text, (Object) textStringSimpleElement.text) && C8632dsu.c(this.style, textStringSimpleElement.style) && C8632dsu.c(this.fontFamilyResolver, textStringSimpleElement.fontFamilyResolver) && TextOverflow.m2453equalsimpl0(this.overflow, textStringSimpleElement.overflow) && this.softWrap == textStringSimpleElement.softWrap && this.maxLines == textStringSimpleElement.maxLines && this.minLines == textStringSimpleElement.minLines;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.text.hashCode();
        int hashCode2 = this.style.hashCode();
        int hashCode3 = this.fontFamilyResolver.hashCode();
        int m2454hashCodeimpl = TextOverflow.m2454hashCodeimpl(this.overflow);
        int hashCode4 = Boolean.hashCode(this.softWrap);
        int i = this.maxLines;
        int i2 = this.minLines;
        ColorProducer colorProducer = this.color;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + m2454hashCodeimpl) * 31) + hashCode4) * 31) + i) * 31) + i2) * 31) + (colorProducer != null ? colorProducer.hashCode() : 0);
    }
}
