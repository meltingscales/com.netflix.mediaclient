package androidx.compose.ui.text;

import o.C8632dsu;

/* loaded from: classes.dex */
public final class VerbatimTtsAnnotation extends TtsAnnotation {
    private final String verbatim;

    public final String getVerbatim() {
        return this.verbatim;
    }

    public VerbatimTtsAnnotation(String str) {
        super(null);
        this.verbatim = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerbatimTtsAnnotation) && C8632dsu.c((Object) this.verbatim, (Object) ((VerbatimTtsAnnotation) obj).verbatim);
    }

    public int hashCode() {
        return this.verbatim.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.verbatim + ')';
    }
}
