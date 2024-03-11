package androidx.compose.ui.text;

import o.C8632dsu;

/* loaded from: classes.dex */
public final class ParagraphIntrinsicInfo {
    private final int endIndex;
    private final ParagraphIntrinsics intrinsics;
    private final int startIndex;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParagraphIntrinsicInfo) {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) obj;
            return C8632dsu.c(this.intrinsics, paragraphIntrinsicInfo.intrinsics) && this.startIndex == paragraphIntrinsicInfo.startIndex && this.endIndex == paragraphIntrinsicInfo.endIndex;
        }
        return false;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final ParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public int hashCode() {
        return (((this.intrinsics.hashCode() * 31) + Integer.hashCode(this.startIndex)) * 31) + Integer.hashCode(this.endIndex);
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.intrinsics + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ')';
    }

    public ParagraphIntrinsicInfo(ParagraphIntrinsics paragraphIntrinsics, int i, int i2) {
        this.intrinsics = paragraphIntrinsics;
        this.startIndex = i;
        this.endIndex = i2;
    }
}
