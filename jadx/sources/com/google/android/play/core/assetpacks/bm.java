package com.google.android.play.core.assetpacks;

/* loaded from: classes5.dex */
final class bm extends AssetPackLocation {
    private final int a;
    private final String b;
    private final String c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bm(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    public final String assetsPath() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackLocation) {
            AssetPackLocation assetPackLocation = (AssetPackLocation) obj;
            if (this.a == assetPackLocation.packStorageMethod()) {
                String str = this.b;
                if (str == null) {
                    if (assetPackLocation.path() != null) {
                        return false;
                    }
                } else if (!str.equals(assetPackLocation.path())) {
                    return false;
                }
                String str2 = this.c;
                if (str2 == null) {
                    if (assetPackLocation.assetsPath() != null) {
                        return false;
                    }
                } else if (!str2.equals(assetPackLocation.assetsPath())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        String str = this.b;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.c;
        return ((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    public final int packStorageMethod() {
        return this.a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    public final String path() {
        return this.b;
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        return "AssetPackLocation{packStorageMethod=" + i + ", path=" + str + ", assetsPath=" + str2 + "}";
    }
}
