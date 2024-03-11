package com.netflix.model.leafs.originals.interactive;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_Label  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_Label extends Label {
    private final Color color;
    private final Float fontSize;
    private final Integer minFontSize;
    private final Integer numberOfLines;
    private final SourceRect rect;
    private final ScreenPosition screenPosition;
    private final String string;

    @Override // com.netflix.model.leafs.originals.interactive.Label
    public Color color() {
        return this.color;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Label
    public Float fontSize() {
        return this.fontSize;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Label
    public Integer minFontSize() {
        return this.minFontSize;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Label
    public Integer numberOfLines() {
        return this.numberOfLines;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Label
    public SourceRect rect() {
        return this.rect;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Label
    public ScreenPosition screenPosition() {
        return this.screenPosition;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Label
    public String string() {
        return this.string;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_Label(String str, Float f, Integer num, Integer num2, Color color, SourceRect sourceRect, ScreenPosition screenPosition) {
        this.string = str;
        this.fontSize = f;
        this.minFontSize = num;
        if (num2 == null) {
            throw new NullPointerException("Null numberOfLines");
        }
        this.numberOfLines = num2;
        this.color = color;
        this.rect = sourceRect;
        this.screenPosition = screenPosition;
    }

    public String toString() {
        return "Label{string=" + this.string + ", fontSize=" + this.fontSize + ", minFontSize=" + this.minFontSize + ", numberOfLines=" + this.numberOfLines + ", color=" + this.color + ", rect=" + this.rect + ", screenPosition=" + this.screenPosition + "}";
    }

    public boolean equals(Object obj) {
        Color color;
        SourceRect sourceRect;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Label) {
            Label label = (Label) obj;
            String str = this.string;
            if (str != null ? str.equals(label.string()) : label.string() == null) {
                Float f = this.fontSize;
                if (f != null ? f.equals(label.fontSize()) : label.fontSize() == null) {
                    Integer num = this.minFontSize;
                    if (num != null ? num.equals(label.minFontSize()) : label.minFontSize() == null) {
                        if (this.numberOfLines.equals(label.numberOfLines()) && ((color = this.color) != null ? color.equals(label.color()) : label.color() == null) && ((sourceRect = this.rect) != null ? sourceRect.equals(label.rect()) : label.rect() == null)) {
                            ScreenPosition screenPosition = this.screenPosition;
                            if (screenPosition == null) {
                                if (label.screenPosition() == null) {
                                    return true;
                                }
                            } else if (screenPosition.equals(label.screenPosition())) {
                                return true;
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
        String str = this.string;
        int hashCode = str == null ? 0 : str.hashCode();
        Float f = this.fontSize;
        int hashCode2 = f == null ? 0 : f.hashCode();
        Integer num = this.minFontSize;
        int hashCode3 = num == null ? 0 : num.hashCode();
        int hashCode4 = this.numberOfLines.hashCode();
        Color color = this.color;
        int hashCode5 = color == null ? 0 : color.hashCode();
        SourceRect sourceRect = this.rect;
        int hashCode6 = sourceRect == null ? 0 : sourceRect.hashCode();
        ScreenPosition screenPosition = this.screenPosition;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ (screenPosition != null ? screenPosition.hashCode() : 0);
    }
}
