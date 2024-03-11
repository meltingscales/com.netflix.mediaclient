package o;

/* renamed from: o.bBl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3535bBl {
    private final C8504doa a;
    private final C8504doa c;
    private final C8504doa e;

    public final C8504doa b() {
        return this.e;
    }

    public final C8504doa c() {
        return this.c;
    }

    public final C8504doa d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3535bBl) {
            C3535bBl c3535bBl = (C3535bBl) obj;
            return C8632dsu.c(this.e, c3535bBl.e) && C8632dsu.c(this.c, c3535bBl.c) && C8632dsu.c(this.a, c3535bBl.a);
        }
        return false;
    }

    public int hashCode() {
        return (((this.e.hashCode() * 31) + this.c.hashCode()) * 31) + this.a.hashCode();
    }

    public String toString() {
        C8504doa c8504doa = this.e;
        C8504doa c8504doa2 = this.c;
        C8504doa c8504doa3 = this.a;
        return "SwipeAnimationConfig(leftSwipeSetting=" + c8504doa + ", rightSwipeSetting=" + c8504doa2 + ", bottomSwipeSetting=" + c8504doa3 + ")";
    }

    public C3535bBl(C8504doa c8504doa, C8504doa c8504doa2, C8504doa c8504doa3) {
        C8632dsu.c((Object) c8504doa, "");
        C8632dsu.c((Object) c8504doa2, "");
        C8632dsu.c((Object) c8504doa3, "");
        this.e = c8504doa;
        this.c = c8504doa2;
        this.a = c8504doa3;
    }
}
