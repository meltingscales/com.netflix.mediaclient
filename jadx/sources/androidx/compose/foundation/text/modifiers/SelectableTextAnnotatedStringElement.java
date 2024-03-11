package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class SelectableTextAnnotatedStringElement extends ModifierNodeElement<SelectableTextAnnotatedStringNode> {
    private final ColorProducer color;
    private final FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;
    private final drM<List<Rect>, dpR> onPlaceholderLayout;
    private final drM<TextLayoutResult, dpR> onTextLayout;
    private final int overflow;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final SelectionController selectionController;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    public /* synthetic */ SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, drM drm, int i, boolean z, int i2, int i3, List list, drM drm2, SelectionController selectionController, ColorProducer colorProducer, C8627dsp c8627dsp) {
        this(annotatedString, textStyle, resolver, drm, i, z, i2, i3, list, drm2, selectionController, colorProducer);
    }

    public String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.text) + ", style=" + this.style + ", fontFamilyResolver=" + this.fontFamilyResolver + ", onTextLayout=" + this.onTextLayout + ", overflow=" + ((Object) TextOverflow.m2455toStringimpl(this.overflow)) + ", softWrap=" + this.softWrap + ", maxLines=" + this.maxLines + ", minLines=" + this.minLines + ", placeholders=" + this.placeholders + ", onPlaceholderLayout=" + this.onPlaceholderLayout + ", selectionController=" + this.selectionController + ", color=" + this.color + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, drM<? super TextLayoutResult, dpR> drm, int i, boolean z, int i2, int i3, List<AnnotatedString.Range<Placeholder>> list, drM<? super List<Rect>, dpR> drm2, SelectionController selectionController, ColorProducer colorProducer) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.onTextLayout = drm;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.placeholders = list;
        this.onPlaceholderLayout = drm2;
        this.selectionController = selectionController;
        this.color = colorProducer;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SelectableTextAnnotatedStringNode create() {
        return new SelectableTextAnnotatedStringNode(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SelectableTextAnnotatedStringNode selectableTextAnnotatedStringNode) {
        selectableTextAnnotatedStringNode.m511updateL09Iy8E(this.text, this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.color);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SelectableTextAnnotatedStringElement) {
            SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
            return C8632dsu.c(this.color, selectableTextAnnotatedStringElement.color) && C8632dsu.c(this.text, selectableTextAnnotatedStringElement.text) && C8632dsu.c(this.style, selectableTextAnnotatedStringElement.style) && C8632dsu.c(this.placeholders, selectableTextAnnotatedStringElement.placeholders) && C8632dsu.c(this.fontFamilyResolver, selectableTextAnnotatedStringElement.fontFamilyResolver) && C8632dsu.c(this.onTextLayout, selectableTextAnnotatedStringElement.onTextLayout) && TextOverflow.m2453equalsimpl0(this.overflow, selectableTextAnnotatedStringElement.overflow) && this.softWrap == selectableTextAnnotatedStringElement.softWrap && this.maxLines == selectableTextAnnotatedStringElement.maxLines && this.minLines == selectableTextAnnotatedStringElement.minLines && C8632dsu.c(this.onPlaceholderLayout, selectableTextAnnotatedStringElement.onPlaceholderLayout) && C8632dsu.c(this.selectionController, selectableTextAnnotatedStringElement.selectionController);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.text.hashCode();
        int hashCode2 = this.style.hashCode();
        int hashCode3 = this.fontFamilyResolver.hashCode();
        drM<TextLayoutResult, dpR> drm = this.onTextLayout;
        int hashCode4 = drm != null ? drm.hashCode() : 0;
        int m2454hashCodeimpl = TextOverflow.m2454hashCodeimpl(this.overflow);
        int hashCode5 = Boolean.hashCode(this.softWrap);
        int i = this.maxLines;
        int i2 = this.minLines;
        List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
        int hashCode6 = list != null ? list.hashCode() : 0;
        drM<List<Rect>, dpR> drm2 = this.onPlaceholderLayout;
        int hashCode7 = drm2 != null ? drm2.hashCode() : 0;
        SelectionController selectionController = this.selectionController;
        int hashCode8 = selectionController != null ? selectionController.hashCode() : 0;
        ColorProducer colorProducer = this.color;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + m2454hashCodeimpl) * 31) + hashCode5) * 31) + i) * 31) + i2) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (colorProducer != null ? colorProducer.hashCode() : 0);
    }
}
