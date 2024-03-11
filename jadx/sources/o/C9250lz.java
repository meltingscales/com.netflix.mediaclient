package o;

/* renamed from: o.lz  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C9250lz {
    private final StringBuilder e = new StringBuilder();

    public final void c(String str, Object obj) {
        StringBuilder sb = this.e;
        sb.append(str + '=' + obj);
        this.e.append("\n");
    }

    public String toString() {
        return this.e.toString();
    }
}
