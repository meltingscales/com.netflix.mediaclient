package com.netflix.model.leafs.originals.interactive;

import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.Style;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$$AutoValue_Style  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$$AutoValue_Style extends Style {
    private final Float alignment;
    private final String backgroundColor;
    private final String color;
    private final Float fontSize;
    private final Float fontWeight;
    private final Float minFontSize;
    private final Integer numberOfLines;
    private final Float opacity;
    private final SourceRect rect;
    private final String scaleType;
    private final ScreenPosition screenPosition;
    private final Style.Shadow shadow;
    private final String textDirectionString;

    @Override // com.netflix.model.leafs.originals.interactive.Style
    public Float alignment() {
        return this.alignment;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Style
    public String backgroundColor() {
        return this.backgroundColor;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Style
    public String color() {
        return this.color;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Style
    public Float fontSize() {
        return this.fontSize;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Style
    public Float fontWeight() {
        return this.fontWeight;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Style
    public Float minFontSize() {
        return this.minFontSize;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Style
    public Integer numberOfLines() {
        return this.numberOfLines;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Style
    public Float opacity() {
        return this.opacity;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Style
    public SourceRect rect() {
        return this.rect;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Style
    public String scaleType() {
        return this.scaleType;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Style
    public ScreenPosition screenPosition() {
        return this.screenPosition;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Style
    public Style.Shadow shadow() {
        return this.shadow;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.Style
    @SerializedName("textDirection")
    public String textDirectionString() {
        return this.textDirectionString;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$$AutoValue_Style(SourceRect sourceRect, Float f, Float f2, Float f3, Float f4, Float f5, String str, Integer num, String str2, String str3, Style.Shadow shadow, ScreenPosition screenPosition, String str4) {
        this.rect = sourceRect;
        this.fontSize = f;
        this.minFontSize = f2;
        this.fontWeight = f3;
        this.alignment = f4;
        this.opacity = f5;
        this.scaleType = str;
        this.numberOfLines = num;
        this.color = str2;
        this.backgroundColor = str3;
        this.shadow = shadow;
        this.screenPosition = screenPosition;
        this.textDirectionString = str4;
    }

    public String toString() {
        return "Style{rect=" + this.rect + ", fontSize=" + this.fontSize + ", minFontSize=" + this.minFontSize + ", fontWeight=" + this.fontWeight + ", alignment=" + this.alignment + ", opacity=" + this.opacity + ", scaleType=" + this.scaleType + ", numberOfLines=" + this.numberOfLines + ", color=" + this.color + ", backgroundColor=" + this.backgroundColor + ", shadow=" + this.shadow + ", screenPosition=" + this.screenPosition + ", textDirectionString=" + this.textDirectionString + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Style) {
            Style style = (Style) obj;
            SourceRect sourceRect = this.rect;
            if (sourceRect != null ? sourceRect.equals(style.rect()) : style.rect() == null) {
                Float f = this.fontSize;
                if (f != null ? f.equals(style.fontSize()) : style.fontSize() == null) {
                    Float f2 = this.minFontSize;
                    if (f2 != null ? f2.equals(style.minFontSize()) : style.minFontSize() == null) {
                        Float f3 = this.fontWeight;
                        if (f3 != null ? f3.equals(style.fontWeight()) : style.fontWeight() == null) {
                            Float f4 = this.alignment;
                            if (f4 != null ? f4.equals(style.alignment()) : style.alignment() == null) {
                                Float f5 = this.opacity;
                                if (f5 != null ? f5.equals(style.opacity()) : style.opacity() == null) {
                                    String str = this.scaleType;
                                    if (str != null ? str.equals(style.scaleType()) : style.scaleType() == null) {
                                        Integer num = this.numberOfLines;
                                        if (num != null ? num.equals(style.numberOfLines()) : style.numberOfLines() == null) {
                                            String str2 = this.color;
                                            if (str2 != null ? str2.equals(style.color()) : style.color() == null) {
                                                String str3 = this.backgroundColor;
                                                if (str3 != null ? str3.equals(style.backgroundColor()) : style.backgroundColor() == null) {
                                                    Style.Shadow shadow = this.shadow;
                                                    if (shadow != null ? shadow.equals(style.shadow()) : style.shadow() == null) {
                                                        ScreenPosition screenPosition = this.screenPosition;
                                                        if (screenPosition != null ? screenPosition.equals(style.screenPosition()) : style.screenPosition() == null) {
                                                            String str4 = this.textDirectionString;
                                                            if (str4 == null) {
                                                                if (style.textDirectionString() == null) {
                                                                    return true;
                                                                }
                                                            } else if (str4.equals(style.textDirectionString())) {
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        SourceRect sourceRect = this.rect;
        int hashCode = sourceRect == null ? 0 : sourceRect.hashCode();
        Float f = this.fontSize;
        int hashCode2 = f == null ? 0 : f.hashCode();
        Float f2 = this.minFontSize;
        int hashCode3 = f2 == null ? 0 : f2.hashCode();
        Float f3 = this.fontWeight;
        int hashCode4 = f3 == null ? 0 : f3.hashCode();
        Float f4 = this.alignment;
        int hashCode5 = f4 == null ? 0 : f4.hashCode();
        Float f5 = this.opacity;
        int hashCode6 = f5 == null ? 0 : f5.hashCode();
        String str = this.scaleType;
        int hashCode7 = str == null ? 0 : str.hashCode();
        Integer num = this.numberOfLines;
        int hashCode8 = num == null ? 0 : num.hashCode();
        String str2 = this.color;
        int hashCode9 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.backgroundColor;
        int hashCode10 = str3 == null ? 0 : str3.hashCode();
        Style.Shadow shadow = this.shadow;
        int hashCode11 = shadow == null ? 0 : shadow.hashCode();
        ScreenPosition screenPosition = this.screenPosition;
        int hashCode12 = screenPosition == null ? 0 : screenPosition.hashCode();
        String str4 = this.textDirectionString;
        return ((((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ hashCode10) * 1000003) ^ hashCode11) * 1000003) ^ hashCode12) * 1000003) ^ (str4 != null ? str4.hashCode() : 0);
    }
}
