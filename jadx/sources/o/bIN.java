package o;

/* loaded from: classes4.dex */
public final class bIN implements InterfaceC5176btn {
    private final boolean a;
    private final String c;
    private final boolean d;
    private final boolean e;

    @Override // o.InterfaceC5176btn
    public String aH_() {
        return this.c;
    }

    @Override // o.InterfaceC5176btn
    public boolean aY_() {
        return this.a;
    }

    @Override // o.InterfaceC5176btn
    public boolean d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bIN) {
            bIN bin = (bIN) obj;
            return C8632dsu.c((Object) this.c, (Object) bin.c) && this.a == bin.a && this.e == bin.e && this.d == bin.d;
        }
        return false;
    }

    public int hashCode() {
        String str = this.c;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.a)) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.d);
    }

    @Override // o.InterfaceC5176btn
    public boolean isPlayable() {
        return this.d;
    }

    public String toString() {
        String str = this.c;
        boolean z = this.a;
        boolean z2 = this.e;
        boolean z3 = this.d;
        return "EpoxyPlayable(id=" + str + ", isEpisode=" + z + ", availableOffline=" + z2 + ", isPlayable=" + z3 + ")";
    }

    public bIN(String str, boolean z, boolean z2, boolean z3) {
        this.c = str;
        this.a = z;
        this.e = z2;
        this.d = z3;
    }
}
