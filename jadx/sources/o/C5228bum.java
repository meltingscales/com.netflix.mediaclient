package o;

import java.util.Collection;
import java.util.List;

/* renamed from: o.bum  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5228bum implements InterfaceC5233bur {
    private final InterfaceC5233bur b;
    private final InterfaceC5233bur c;

    @Override // o.InterfaceC5233bur
    public String b() {
        return this.b.b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5228bum) {
            C5228bum c5228bum = (C5228bum) obj;
            return C8632dsu.c(this.b, c5228bum.b) && C8632dsu.c(this.c, c5228bum.c);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        InterfaceC5233bur interfaceC5233bur = this.b;
        InterfaceC5233bur interfaceC5233bur2 = this.c;
        return "EpisodePagePlus(base=" + interfaceC5233bur + ", next=" + interfaceC5233bur2 + ")";
    }

    public C5228bum(InterfaceC5233bur interfaceC5233bur, InterfaceC5233bur interfaceC5233bur2) {
        C8632dsu.c((Object) interfaceC5233bur, "");
        C8632dsu.c((Object) interfaceC5233bur2, "");
        this.b = interfaceC5233bur;
        this.c = interfaceC5233bur2;
    }

    @Override // o.InterfaceC5233bur
    public List<InterfaceC5227bul> e() {
        List<InterfaceC5227bul> g;
        g = C8576dqs.g((Collection) this.b.e(), (Iterable) this.c.e());
        return g;
    }

    @Override // o.InterfaceC5233bur
    public C5239bux d() {
        return this.c.d();
    }
}
