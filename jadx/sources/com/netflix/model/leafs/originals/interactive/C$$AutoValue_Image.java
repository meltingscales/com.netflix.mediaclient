package com.netflix.model.leafs.originals.interactive;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_Image  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_Image extends Image {
    private final boolean animated;
    private final Integer height;
    private final String id;
    private final Float scale;
    private final SourceRect sourceRect;
    private final String url;
    private final Integer width;

    @Override // com.netflix.model.leafs.originals.interactive.Image
    public boolean animated() {
        return this.animated;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Image
    public Integer height() {
        return this.height;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Image
    public String id() {
        return this.id;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Image
    public Float scale() {
        return this.scale;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Image
    public SourceRect sourceRect() {
        return this.sourceRect;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Image
    public String url() {
        return this.url;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Image
    public Integer width() {
        return this.width;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_Image(String str, String str2, Integer num, Integer num2, Float f, SourceRect sourceRect, boolean z) {
        this.id = str;
        this.url = str2;
        if (num == null) {
            throw new NullPointerException("Null width");
        }
        this.width = num;
        if (num2 == null) {
            throw new NullPointerException("Null height");
        }
        this.height = num2;
        if (f == null) {
            throw new NullPointerException("Null scale");
        }
        this.scale = f;
        this.sourceRect = sourceRect;
        this.animated = z;
    }

    public String toString() {
        return "Image{id=" + this.id + ", url=" + this.url + ", width=" + this.width + ", height=" + this.height + ", scale=" + this.scale + ", sourceRect=" + this.sourceRect + ", animated=" + this.animated + "}";
    }

    public boolean equals(Object obj) {
        SourceRect sourceRect;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Image) {
            Image image = (Image) obj;
            String str = this.id;
            if (str != null ? str.equals(image.id()) : image.id() == null) {
                String str2 = this.url;
                if (str2 != null ? str2.equals(image.url()) : image.url() == null) {
                    if (this.width.equals(image.width()) && this.height.equals(image.height()) && this.scale.equals(image.scale()) && ((sourceRect = this.sourceRect) != null ? sourceRect.equals(image.sourceRect()) : image.sourceRect() == null) && this.animated == image.animated()) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.url;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int hashCode3 = this.width.hashCode();
        int hashCode4 = this.height.hashCode();
        int hashCode5 = this.scale.hashCode();
        SourceRect sourceRect = this.sourceRect;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ (sourceRect != null ? sourceRect.hashCode() : 0)) * 1000003) ^ (this.animated ? 1231 : 1237);
    }
}
