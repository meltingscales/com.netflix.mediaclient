package o;

/* renamed from: o.dAk  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7654dAk implements dwU {
    private final dqZ d;

    @Override // o.dwU
    public dqZ getCoroutineContext() {
        return this.d;
    }

    public C7654dAk(dqZ dqz) {
        this.d = dqz;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
