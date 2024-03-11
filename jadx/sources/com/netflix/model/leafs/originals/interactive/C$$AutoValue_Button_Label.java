package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.Button;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_Button_Label  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_Button_Label extends Button.Label {
    private final Color color;
    private final Integer fontSize;
    private final Integer numberOfLines;
    private final String string;
    private final Integer yOffset;

    @Override // com.netflix.model.leafs.originals.interactive.Button.Label
    public Color color() {
        return this.color;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Button.Label
    public Integer fontSize() {
        return this.fontSize;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Button.Label
    public Integer numberOfLines() {
        return this.numberOfLines;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Button.Label
    public String string() {
        return this.string;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Button.Label
    public Integer yOffset() {
        return this.yOffset;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_Button_Label(String str, Integer num, Integer num2, Integer num3, Color color) {
        if (str == null) {
            throw new NullPointerException("Null string");
        }
        this.string = str;
        if (num == null) {
            throw new NullPointerException("Null fontSize");
        }
        this.fontSize = num;
        if (num2 == null) {
            throw new NullPointerException("Null yOffset");
        }
        this.yOffset = num2;
        if (num3 == null) {
            throw new NullPointerException("Null numberOfLines");
        }
        this.numberOfLines = num3;
        if (color == null) {
            throw new NullPointerException("Null color");
        }
        this.color = color;
    }

    public String toString() {
        return "Label{string=" + this.string + ", fontSize=" + this.fontSize + ", yOffset=" + this.yOffset + ", numberOfLines=" + this.numberOfLines + ", color=" + this.color + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Button.Label) {
            Button.Label label = (Button.Label) obj;
            return this.string.equals(label.string()) && this.fontSize.equals(label.fontSize()) && this.yOffset.equals(label.yOffset()) && this.numberOfLines.equals(label.numberOfLines()) && this.color.equals(label.color());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.string.hashCode();
        int hashCode2 = this.fontSize.hashCode();
        int hashCode3 = this.yOffset.hashCode();
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ this.numberOfLines.hashCode()) * 1000003) ^ this.color.hashCode();
    }
}
