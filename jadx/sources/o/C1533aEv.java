package o;

import com.netflix.model.leafs.PersonSummary;

/* renamed from: o.aEv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1533aEv implements PersonSummary {
    private final String b;
    private int c;
    private String e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1533aEv) {
            C1533aEv c1533aEv = (C1533aEv) obj;
            return this.c == c1533aEv.c && C8632dsu.c((Object) this.e, (Object) c1533aEv.e) && C8632dsu.c((Object) this.b, (Object) c1533aEv.b);
        }
        return false;
    }

    @Override // com.netflix.model.leafs.PersonSummary
    public int getPersonId() {
        return this.c;
    }

    @Override // com.netflix.model.leafs.PersonSummary
    public String getPersonName() {
        return this.e;
    }

    @Override // com.netflix.model.leafs.PersonSummary
    public String getUnifiedEntityId() {
        return this.b;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.c) * 31) + this.e.hashCode()) * 31) + this.b.hashCode();
    }

    @Override // com.netflix.model.leafs.PersonSummary
    public void setPersonId(int i) {
        this.c = i;
    }

    @Override // com.netflix.model.leafs.PersonSummary
    public void setPersonName(String str) {
        C8632dsu.c((Object) str, "");
        this.e = str;
    }

    public String toString() {
        int i = this.c;
        String str = this.e;
        String str2 = this.b;
        return "GraphQLPersonSummary(personId=" + i + ", personName=" + str + ", unifiedEntityId=" + str2 + ")";
    }

    public C1533aEv(int i, String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.c = i;
        this.e = str;
        this.b = str2;
    }
}
