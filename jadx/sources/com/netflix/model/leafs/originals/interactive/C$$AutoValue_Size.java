package com.netflix.model.leafs.originals.interactive;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_Size  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_Size extends Size {
    private final Integer height;
    private final Integer width;

    @Override // com.netflix.model.leafs.originals.interactive.Size
    public Integer height() {
        return this.height;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Size
    public Integer width() {
        return this.width;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_Size(Integer num, Integer num2) {
        if (num == null) {
            throw new NullPointerException("Null width");
        }
        this.width = num;
        if (num2 == null) {
            throw new NullPointerException("Null height");
        }
        this.height = num2;
    }

    public String toString() {
        return "Size{width=" + this.width + ", height=" + this.height + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            return this.width.equals(size.width()) && this.height.equals(size.height());
        }
        return false;
    }

    public int hashCode() {
        return ((this.width.hashCode() ^ 1000003) * 1000003) ^ this.height.hashCode();
    }
}
