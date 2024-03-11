package androidx.compose.ui.text.font;

import o.C8632dsu;

/* loaded from: classes.dex */
public final class LoadedFontFamily extends FontFamily {
    private final Typeface typeface;

    public final Typeface getTypeface() {
        return this.typeface;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoadedFontFamily) && C8632dsu.c(this.typeface, ((LoadedFontFamily) obj).typeface);
    }

    public int hashCode() {
        return this.typeface.hashCode();
    }

    public String toString() {
        return "LoadedFontFamily(typeface=" + this.typeface + ')';
    }
}
