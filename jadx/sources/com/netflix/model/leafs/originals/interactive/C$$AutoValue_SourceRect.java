package com.netflix.model.leafs.originals.interactive;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_SourceRect  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_SourceRect extends SourceRect {
    private final Integer height;
    private final Integer width;
    private final Integer x;
    private final Integer y;

    @Override // com.netflix.model.leafs.originals.interactive.SourceRect
    public Integer height() {
        return this.height;
    }

    @Override // com.netflix.model.leafs.originals.interactive.SourceRect
    public Integer width() {
        return this.width;
    }

    @Override // com.netflix.model.leafs.originals.interactive.SourceRect
    public Integer x() {
        return this.x;
    }

    @Override // com.netflix.model.leafs.originals.interactive.SourceRect
    public Integer y() {
        return this.y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_SourceRect(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num == null) {
            throw new NullPointerException("Null x");
        }
        this.x = num;
        if (num2 == null) {
            throw new NullPointerException("Null y");
        }
        this.y = num2;
        if (num3 == null) {
            throw new NullPointerException("Null width");
        }
        this.width = num3;
        if (num4 == null) {
            throw new NullPointerException("Null height");
        }
        this.height = num4;
    }

    public String toString() {
        return "SourceRect{x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SourceRect) {
            SourceRect sourceRect = (SourceRect) obj;
            return this.x.equals(sourceRect.x()) && this.y.equals(sourceRect.y()) && this.width.equals(sourceRect.width()) && this.height.equals(sourceRect.height());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.x.hashCode();
        int hashCode2 = this.y.hashCode();
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ this.width.hashCode()) * 1000003) ^ this.height.hashCode();
    }
}
