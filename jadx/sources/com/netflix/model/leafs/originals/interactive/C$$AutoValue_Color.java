package com.netflix.model.leafs.originals.interactive;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_Color  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_Color extends Color {
    private final String colorWithRGB;
    private final Double withAlpha;

    @Override // com.netflix.model.leafs.originals.interactive.Color
    public String colorWithRGB() {
        return this.colorWithRGB;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Color
    public Double withAlpha() {
        return this.withAlpha;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_Color(String str, Double d) {
        this.colorWithRGB = str;
        this.withAlpha = d;
    }

    public String toString() {
        return "Color{colorWithRGB=" + this.colorWithRGB + ", withAlpha=" + this.withAlpha + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Color) {
            Color color = (Color) obj;
            String str = this.colorWithRGB;
            if (str != null ? str.equals(color.colorWithRGB()) : color.colorWithRGB() == null) {
                Double d = this.withAlpha;
                if (d == null) {
                    if (color.withAlpha() == null) {
                        return true;
                    }
                } else if (d.equals(color.withAlpha())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.colorWithRGB;
        int hashCode = str == null ? 0 : str.hashCode();
        Double d = this.withAlpha;
        return ((hashCode ^ 1000003) * 1000003) ^ (d != null ? d.hashCode() : 0);
    }
}
