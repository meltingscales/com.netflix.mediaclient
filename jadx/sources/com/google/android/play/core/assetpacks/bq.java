package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* loaded from: classes5.dex */
final class bq extends eu {
    private final String a;
    private final long b;
    private final int c;
    private final boolean d;
    private final boolean e;
    private final byte[] f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bq(String str, long j, int i, boolean z, boolean z2, byte[] bArr) {
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.eu
    public final int a() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.eu
    public final long b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.eu
    public final String c() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.eu
    public final boolean d() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.eu
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eu) {
            eu euVar = (eu) obj;
            String str = this.a;
            if (str == null) {
                if (euVar.c() != null) {
                    return false;
                }
            } else if (!str.equals(euVar.c())) {
                return false;
            }
            if (this.b == euVar.b() && this.c == euVar.a() && this.d == euVar.e() && this.e == euVar.d()) {
                return Arrays.equals(this.f, euVar instanceof bq ? ((bq) euVar).f : euVar.f());
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.eu
    public final byte[] f() {
        return this.f;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (int) (j ^ (j >>> 32));
        int i2 = this.c;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        int i = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        String arrays = Arrays.toString(this.f);
        return "ZipEntry{name=" + str + ", size=" + j + ", compressionMethod=" + i + ", isPartial=" + z + ", isEndOfArchive=" + z2 + ", headerBytes=" + arrays + "}";
    }
}
