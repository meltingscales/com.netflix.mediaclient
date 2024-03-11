package o;

import com.netflix.mediaclient.service.webclient.model.leafs.MembershipChoicesResponse;

/* renamed from: o.cYe  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6217cYe {
    private final boolean c;
    private final MembershipChoicesResponse d;
    private final int e;

    public final MembershipChoicesResponse b() {
        return this.d;
    }

    public final int c() {
        return this.e;
    }

    public final boolean e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6217cYe) {
            C6217cYe c6217cYe = (C6217cYe) obj;
            return C8632dsu.c(this.d, c6217cYe.d) && this.e == c6217cYe.e && this.c == c6217cYe.c;
        }
        return false;
    }

    public int hashCode() {
        return (((this.d.hashCode() * 31) + Integer.hashCode(this.e)) * 31) + Boolean.hashCode(this.c);
    }

    public String toString() {
        MembershipChoicesResponse membershipChoicesResponse = this.d;
        int i = this.e;
        boolean z = this.c;
        return "PlanSelectData(productChoiceResponse=" + membershipChoicesResponse + ", headerText=" + i + ", showCancelInFooterAsButton=" + z + ")";
    }

    public C6217cYe(MembershipChoicesResponse membershipChoicesResponse, int i, boolean z) {
        C8632dsu.c((Object) membershipChoicesResponse, "");
        this.d = membershipChoicesResponse;
        this.e = i;
        this.c = z;
    }
}
