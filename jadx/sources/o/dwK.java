package o;

/* loaded from: classes5.dex */
public final class dwK {
    public final drM<Throwable, dpR> a;
    public final Object e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dwK) {
            dwK dwk = (dwK) obj;
            return C8632dsu.c(this.e, dwk.e) && C8632dsu.c(this.a, dwk.a);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.e;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.a.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.e + ", onCancellation=" + this.a + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dwK(Object obj, drM<? super Throwable, dpR> drm) {
        this.e = obj;
        this.a = drm;
    }
}
