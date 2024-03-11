package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;

/* renamed from: o.aWw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2019aWw {
    @SerializedName("category")
    private final String a;
    @SerializedName("deviceAddr")
    private final String b;
    @SerializedName("msgId")
    private final int c;
    @SerializedName("deviceType")
    private final String d;
    @SerializedName("deviceData")
    private final b e;
    @SerializedName("ts")
    private final String f;
    @SerializedName("type")
    private final String j;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2019aWw) {
            C2019aWw c2019aWw = (C2019aWw) obj;
            return this.c == c2019aWw.c && C8632dsu.c((Object) this.b, (Object) c2019aWw.b) && C8632dsu.c((Object) this.f, (Object) c2019aWw.f) && C8632dsu.c(this.e, c2019aWw.e);
        }
        return false;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.c) * 31) + this.b.hashCode()) * 31) + this.f.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        int i = this.c;
        String str = this.b;
        String str2 = this.f;
        b bVar = this.e;
        return "DdrLocalInfo(msgId=" + i + ", deviceAddr=" + str + ", ts=" + str2 + ", deviceData=" + bVar + ")";
    }

    public C2019aWw(int i, String str, String str2, b bVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) bVar, "");
        this.c = i;
        this.b = str;
        this.f = str2;
        this.e = bVar;
        this.a = "zuulDDRMsg";
        this.j = UmaAlert.ICON_INFO;
        this.d = "Android";
    }

    /* renamed from: o.aWw$b */
    /* loaded from: classes3.dex */
    public static final class b {
        @SerializedName("ddrVersion")
        private final int a;
        @SerializedName("appVersion")
        private final String b;
        @SerializedName("disableLocalDiscovery")
        private final String c;
        @SerializedName("platformVersion")
        private final String d;
        @SerializedName("subnetMask")
        private final String e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c((Object) this.e, (Object) bVar.e) && this.a == bVar.a && C8632dsu.c((Object) this.c, (Object) bVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = this.b.hashCode();
            int hashCode3 = this.e.hashCode();
            int hashCode4 = Integer.hashCode(this.a);
            String str = this.c;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.d;
            String str2 = this.b;
            String str3 = this.e;
            int i = this.a;
            String str4 = this.c;
            return "DeviceData(platformVersion=" + str + ", appVersion=" + str2 + ", subnetMask=" + str3 + ", ddrVersion=" + i + ", disableLocalDiscovery=" + str4 + ")";
        }

        public b(String str, String str2, String str3, int i, String str4) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) str3, "");
            this.d = str;
            this.b = str2;
            this.e = str3;
            this.a = i;
            this.c = str4;
        }
    }

    public final String d() {
        String json = C8118deO.a().toJson(this);
        C8632dsu.a(json, "");
        return json;
    }
}
