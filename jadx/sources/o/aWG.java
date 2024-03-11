package o;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes3.dex */
public final class aWG {
    @SerializedName("esn")
    private final String a;
    @SerializedName("payload")
    private e b;
    @SerializedName("notificationGuid")
    private String c;
    @SerializedName("customerGUID")
    private final String e;

    public aWG() {
        this(null, null, null, null, 15, null);
    }

    public final e a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aWG) {
            aWG awg = (aWG) obj;
            return C8632dsu.c((Object) this.a, (Object) awg.a) && C8632dsu.c((Object) this.e, (Object) awg.e) && C8632dsu.c((Object) this.c, (Object) awg.c) && C8632dsu.c(this.b, awg.b);
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.e;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.c;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        e eVar = this.b;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.e;
        String str3 = this.c;
        e eVar = this.b;
        return "DdrZuulInfoMessage(esn=" + str + ", customerGUID=" + str2 + ", notificationGuid=" + str3 + ", payload=" + eVar + ")";
    }

    public aWG(String str, String str2, String str3, e eVar) {
        this.a = str;
        this.e = str2;
        this.c = str3;
        this.b = eVar;
    }

    public /* synthetic */ aWG(String str, String str2, String str3, e eVar, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : eVar);
    }

    /* loaded from: classes3.dex */
    public static final class e {
        @SerializedName("token")
        private final String a;
        @SerializedName("msgId")
        private final Integer b;
        @SerializedName("category")
        private final String c;
        @SerializedName("senderApp")
        private final String d;
        @SerializedName("ts")
        private final String e;
        @SerializedName("type")
        private final String i;

        public e() {
            this(null, null, null, null, null, null, 63, null);
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c((Object) this.i, (Object) eVar.i) && C8632dsu.c(this.b, eVar.b) && C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c((Object) this.e, (Object) eVar.e) && C8632dsu.c((Object) this.d, (Object) eVar.d);
            }
            return false;
        }

        public int hashCode() {
            String str = this.c;
            int hashCode = str == null ? 0 : str.hashCode();
            String str2 = this.i;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            Integer num = this.b;
            int hashCode3 = num == null ? 0 : num.hashCode();
            String str3 = this.a;
            int hashCode4 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.e;
            int hashCode5 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.d;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.i;
            Integer num = this.b;
            String str3 = this.a;
            String str4 = this.e;
            String str5 = this.d;
            return "Payload(category=" + str + ", type=" + str2 + ", msgId=" + num + ", token=" + str3 + ", ts=" + str4 + ", senderApp=" + str5 + ")";
        }

        public e(String str, String str2, Integer num, String str3, String str4, String str5) {
            this.c = str;
            this.i = str2;
            this.b = num;
            this.a = str3;
            this.e = str4;
            this.d = str5;
        }

        public /* synthetic */ e(String str, String str2, Integer num, String str3, String str4, String str5, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "zuulinfo" : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
        }
    }
}
