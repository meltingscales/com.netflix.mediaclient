package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class TransformedText {
    private final OffsetMapping offsetMapping;
    private final AnnotatedString text;

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final AnnotatedString getText() {
        return this.text;
    }

    public TransformedText(AnnotatedString annotatedString, OffsetMapping offsetMapping) {
        this.text = annotatedString;
        this.offsetMapping = offsetMapping;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransformedText) {
            TransformedText transformedText = (TransformedText) obj;
            return C8632dsu.c(this.text, transformedText.text) && C8632dsu.c(this.offsetMapping, transformedText.offsetMapping);
        }
        return false;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.offsetMapping.hashCode();
    }

    public String toString() {
        return "TransformedText(text=" + ((Object) this.text) + ", offsetMapping=" + this.offsetMapping + ')';
    }
}
