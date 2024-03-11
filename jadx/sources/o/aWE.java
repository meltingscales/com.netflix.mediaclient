package o;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes3.dex */
public final class aWE {
    @SerializedName("senderApp")
    private final String a;
    @SerializedName("esn")
    private final String b;
    @SerializedName("customerGUID")
    private final String c;
    @SerializedName("payload")
    private c d;
    @SerializedName("notificationGuid")
    private String e;

    public aWE() {
        this(null, null, null, null, null, 31, null);
    }

    public final c c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aWE) {
            aWE awe = (aWE) obj;
            return C8632dsu.c((Object) this.b, (Object) awe.b) && C8632dsu.c((Object) this.c, (Object) awe.c) && C8632dsu.c((Object) this.a, (Object) awe.a) && C8632dsu.c((Object) this.e, (Object) awe.e) && C8632dsu.c(this.d, awe.d);
        }
        return false;
    }

    public int hashCode() {
        String str = this.b;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.c;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.a;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.e;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        c cVar = this.d;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.b;
        String str2 = this.c;
        String str3 = this.a;
        String str4 = this.e;
        c cVar = this.d;
        return "DdrZuulChallengeRequest(esn=" + str + ", customerGUID=" + str2 + ", senderApp=" + str3 + ", notificationGuid=" + str4 + ", payload=" + cVar + ")";
    }

    public aWE(String str, String str2, String str3, String str4, c cVar) {
        this.b = str;
        this.c = str2;
        this.a = str3;
        this.e = str4;
        this.d = cVar;
    }

    public /* synthetic */ aWE(String str, String str2, String str3, String str4, c cVar, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : cVar);
    }

    /* loaded from: classes3.dex */
    public static final class c {
        @SerializedName("type")
        private final String a;
        @SerializedName("category")
        private final String b;
        @SerializedName("msgId")
        private final Integer c;
        @SerializedName("targetAddr")
        private final String d;
        @SerializedName("ts")
        private final String e;

        public c() {
            this(null, null, null, null, null, 31, null);
        }

        public final String b() {
            return this.d;
        }

        public final Integer e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c(this.c, cVar.c) && C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c((Object) this.e, (Object) cVar.e);
            }
            return false;
        }

        public int hashCode() {
            String str = this.b;
            int hashCode = str == null ? 0 : str.hashCode();
            String str2 = this.a;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            Integer num = this.c;
            int hashCode3 = num == null ? 0 : num.hashCode();
            String str3 = this.d;
            int hashCode4 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.e;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.a;
            Integer num = this.c;
            String str3 = this.d;
            String str4 = this.e;
            return "Payload(category=" + str + ", type=" + str2 + ", msgId=" + num + ", targetAddr=" + str3 + ", ts=" + str4 + ")";
        }

        public c(String str, String str2, Integer num, String str3, String str4) {
            this.b = str;
            this.a = str2;
            this.c = num;
            this.d = str3;
            this.e = str4;
        }

        public /* synthetic */ c(String str, String str2, Integer num, String str3, String str4, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }
    }
}
