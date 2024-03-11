package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import o.C8627dsp;
import o.C8691duz;

/* loaded from: classes.dex */
public final class PasswordVisualTransformation implements VisualTransformation {
    private final char mask;

    public PasswordVisualTransformation() {
        this((char) 0, 1, null);
    }

    public PasswordVisualTransformation(char c) {
        this.mask = c;
    }

    public /* synthetic */ PasswordVisualTransformation(char c, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? (char) 8226 : c);
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString annotatedString) {
        String c;
        c = C8691duz.c(String.valueOf(this.mask), annotatedString.getText().length());
        return new TransformedText(new AnnotatedString(c, null, null, 6, null), OffsetMapping.Companion.getIdentity());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PasswordVisualTransformation) && this.mask == ((PasswordVisualTransformation) obj).mask;
    }

    public int hashCode() {
        return Character.hashCode(this.mask);
    }
}
