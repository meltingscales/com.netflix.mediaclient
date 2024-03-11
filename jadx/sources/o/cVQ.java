package o;

/* loaded from: classes4.dex */
public final class cVQ {
    public static final d c = new d(null);
    private final String a;
    private Integer b;
    private final String d;
    private final String e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cVQ(String str, String str2, Integer num) {
        this(str, str2, num, null, 8, null);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
    }

    public final String a() {
        return this.a;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cVQ) {
            cVQ cvq = (cVQ) obj;
            return C8632dsu.c((Object) this.a, (Object) cvq.a) && C8632dsu.c((Object) this.e, (Object) cvq.e) && C8632dsu.c(this.b, cvq.b) && C8632dsu.c((Object) this.d, (Object) cvq.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.e.hashCode();
        Integer num = this.b;
        int hashCode3 = num == null ? 0 : num.hashCode();
        String str = this.d;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.e;
        Integer num = this.b;
        String str3 = this.d;
        return "Device(uuid=" + str + ", friendlyName=" + str2 + ", loginPolicyCode=" + num + ", sessionUuid=" + str3 + ")";
    }

    public cVQ(String str, String str2, Integer num, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.a = str;
        this.e = str2;
        this.b = num;
        this.d = str3;
    }

    public /* synthetic */ cVQ(String str, String str2, Integer num, String str3, int i, C8627dsp c8627dsp) {
        this(str, str2, (i & 4) != 0 ? 0 : num, (i & 8) != 0 ? null : str3);
    }

    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
