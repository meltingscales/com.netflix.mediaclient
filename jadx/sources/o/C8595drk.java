package o;

/* renamed from: o.drk  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8595drk implements InterfaceC8585dra<Object> {
    public static final C8595drk e = new C8595drk();

    public String toString() {
        return "This continuation is already complete";
    }

    private C8595drk() {
    }

    @Override // o.InterfaceC8585dra
    public dqZ getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // o.InterfaceC8585dra
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }
}
