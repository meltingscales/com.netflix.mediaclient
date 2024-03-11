package com.google.android.play.core.assetpacks;

/* loaded from: classes5.dex */
final class bp extends em {
    private final int a;
    private final String b;
    private final long c;
    private final long d;
    private final int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bp(int i, String str, long j, long j2, int i2) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.em
    public final int a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.em
    public final int b() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.em
    public final long c() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.em
    public final long d() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.em
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof em) {
            em emVar = (em) obj;
            if (this.a == emVar.a()) {
                String str = this.b;
                if (str == null) {
                    if (emVar.e() != null) {
                        return false;
                    }
                } else if (!str.equals(emVar.e())) {
                    return false;
                }
                return this.c == emVar.c() && this.d == emVar.d() && this.e == emVar.b();
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        String str = this.b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.c;
        long j2 = this.d;
        return ((((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.e;
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        long j = this.c;
        long j2 = this.d;
        int i2 = this.e;
        return "SliceCheckpoint{fileExtractionStatus=" + i + ", filePath=" + str + ", fileOffset=" + j + ", remainingBytes=" + j2 + ", previousChunk=" + i2 + "}";
    }
}
