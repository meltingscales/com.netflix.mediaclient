package com.google.android.play.integrity.internal;

/* loaded from: classes2.dex */
final class e extends f {
    private final int a;
    private final long b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(int i, long j) {
        this.a = i;
        this.b = j;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.a == fVar.a() && this.b == fVar.b();
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.a + ", eventTimestamp=" + this.b + "}";
    }
}
