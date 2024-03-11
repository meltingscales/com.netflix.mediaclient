package o;

import java.util.Arrays;

/* renamed from: o.dDq  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7741dDq extends dDS {
    private final boolean d;

    @Override // o.dDS, o.InterfaceC7707dCj
    public boolean a() {
        return this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7741dDq(String str, InterfaceC7736dDl<?> interfaceC7736dDl) {
        super(str, interfaceC7736dDl, 1);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC7736dDl, "");
        this.d = true;
    }

    @Override // o.dDS
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // o.dDS
    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C7741dDq)) {
                return false;
            }
            InterfaceC7707dCj interfaceC7707dCj = (InterfaceC7707dCj) obj;
            if (!C8632dsu.c((Object) d(), (Object) interfaceC7707dCj.d())) {
                return false;
            }
            C7741dDq c7741dDq = (C7741dDq) obj;
            if (!c7741dDq.a() || !Arrays.equals(g(), c7741dDq.g()) || e() != interfaceC7707dCj.e()) {
                return false;
            }
            int e = e();
            for (int i = 0; i < e; i++) {
                if (!C8632dsu.c((Object) c(i).d(), (Object) interfaceC7707dCj.c(i).d()) || !C8632dsu.c(c(i).b(), interfaceC7707dCj.c(i).b())) {
                    return false;
                }
            }
        }
        return true;
    }
}
