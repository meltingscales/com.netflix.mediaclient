package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dxj  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8756dxj implements dxA {
    private final boolean b;

    @Override // o.dxA
    public dxQ cp_() {
        return null;
    }

    @Override // o.dxA
    public boolean d() {
        return this.b;
    }

    public C8756dxj(boolean z) {
        this.b = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(d() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
