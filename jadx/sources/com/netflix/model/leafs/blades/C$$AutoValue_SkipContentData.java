package com.netflix.model.leafs.blades;

import com.google.gson.annotations.SerializedName;

/* renamed from: com.netflix.model.leafs.blades.$$AutoValue_SkipContentData  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_SkipContentData extends SkipContentData {
    private final int end;
    private final String label;
    private final int start;

    @Override // com.netflix.model.leafs.blades.SkipContentData
    @SerializedName("end")
    public int end() {
        return this.end;
    }

    @Override // com.netflix.model.leafs.blades.SkipContentData
    @SerializedName("label")
    public String label() {
        return this.label;
    }

    @Override // com.netflix.model.leafs.blades.SkipContentData
    @SerializedName("start")
    public int start() {
        return this.start;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_SkipContentData(int i, int i2, String str) {
        this.start = i;
        this.end = i2;
        if (str == null) {
            throw new NullPointerException("Null label");
        }
        this.label = str;
    }

    public String toString() {
        return "SkipContentData{start=" + this.start + ", end=" + this.end + ", label=" + this.label + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SkipContentData) {
            SkipContentData skipContentData = (SkipContentData) obj;
            return this.start == skipContentData.start() && this.end == skipContentData.end() && this.label.equals(skipContentData.label());
        }
        return false;
    }

    public int hashCode() {
        int i = this.start;
        return ((((i ^ 1000003) * 1000003) ^ this.end) * 1000003) ^ this.label.hashCode();
    }
}
