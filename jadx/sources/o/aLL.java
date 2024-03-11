package o;

/* loaded from: classes3.dex */
public final class aLL<T> extends aLO<T> {
    private final Throwable a;

    public final Throwable b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aLL) && C8632dsu.c(this.a, ((aLL) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        Throwable th = this.a;
        return "Failure(error=" + th + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aLL(Throwable th) {
        super(null);
        C8632dsu.c((Object) th, "");
        this.a = th;
    }
}
