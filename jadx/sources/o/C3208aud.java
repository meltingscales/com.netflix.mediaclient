package o;

/* renamed from: o.aud  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3208aud {
    private final String e;

    public final String a() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3208aud) && C8632dsu.c((Object) this.e, (Object) ((C3208aud) obj).e);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        String str = this.e;
        return "RemoveProfileAccessPinInput(profileGuid=" + str + ")";
    }

    public C3208aud(String str) {
        C8632dsu.c((Object) str, "");
        this.e = str;
    }
}
