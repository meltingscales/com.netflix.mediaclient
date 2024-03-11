package o;

/* renamed from: o.cOi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5949cOi {
    private final InterfaceC5283bvo c;

    public final InterfaceC5283bvo b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5949cOi) && C8632dsu.c(this.c, ((C5949cOi) obj).c);
    }

    public int hashCode() {
        InterfaceC5283bvo interfaceC5283bvo = this.c;
        if (interfaceC5283bvo == null) {
            return 0;
        }
        return interfaceC5283bvo.hashCode();
    }

    public String toString() {
        InterfaceC5283bvo interfaceC5283bvo = this.c;
        return "StableUserProfile(userProfile=" + interfaceC5283bvo + ")";
    }

    public C5949cOi(InterfaceC5283bvo interfaceC5283bvo) {
        this.c = interfaceC5283bvo;
    }
}
