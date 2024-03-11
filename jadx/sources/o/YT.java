package o;

import com.netflix.mediaclient.graphql.models.type.CountryCode;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2165abB;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class YT implements InterfaceC8999hM<b> {
    public static final d e = new d(null);
    private final String b;
    private final boolean c;
    private final String d;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "ea883809-687c-4320-bbfb-43b072fbde27";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YT) {
            YT yt = (YT) obj;
            return C8632dsu.c((Object) this.d, (Object) yt.d) && C8632dsu.c((Object) this.b, (Object) yt.b);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "OctoberSkyCountriesProperties";
    }

    public int hashCode() {
        return (this.d.hashCode() * 31) + this.b.hashCode();
    }

    public final String i() {
        return this.b;
    }

    public final String j() {
        return this.d;
    }

    public String toString() {
        String str = this.d;
        String str2 = this.b;
        return "OctoberSkyCountriesPropertiesQuery(namespace=" + str + ", property=" + str2 + ")";
    }

    public YT(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.d = str;
        this.b = str2;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2168abE.a.e(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<b> e() {
        return C8953gT.c(C2165abB.c.c, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2853ans.e.e()).d();
    }

    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8999hM.c {
        private final List<a> b;

        public final List<a> c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.b, ((b) obj).b);
        }

        public int hashCode() {
            List<a> list = this.b;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<a> list = this.b;
            return "Data(getOctoberSkyCountriesProperties=" + list + ")";
        }

        public b(List<a> list) {
            this.b = list;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final j a;
        private final g c;
        private final String d;

        public final j b() {
            return this.a;
        }

        public final g c() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c(this.c, aVar.c) && C8632dsu.c(this.a, aVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            g gVar = this.c;
            int hashCode2 = gVar == null ? 0 : gVar.hashCode();
            j jVar = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (jVar != null ? jVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            g gVar = this.c;
            j jVar = this.a;
            return "GetOctoberSkyCountriesProperty(__typename=" + str + ", onOctoberSkyPropertyURL=" + gVar + ", onOctoberSkyPropertyBoolean=" + jVar + ")";
        }

        public a(String str, g gVar, j jVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = gVar;
            this.a = jVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class g {
        private final Object c;
        private final e d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final Object d() {
            return this.c;
        }

        public final e e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.e, (Object) gVar.e) && C8632dsu.c(this.d, gVar.d) && C8632dsu.c(this.c, gVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            int hashCode2 = this.d.hashCode();
            Object obj = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            String str = this.e;
            e eVar = this.d;
            Object obj = this.c;
            return "OnOctoberSkyPropertyURL(id=" + str + ", country=" + eVar + ", urlValue=" + obj + ")";
        }

        public g(String str, e eVar, Object obj) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) eVar, "");
            this.e = str;
            this.d = eVar;
            this.c = obj;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final CountryCode c;
        private final String e;

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.e;
        }

        public final CountryCode d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && this.c == eVar.c && C8632dsu.c((Object) this.a, (Object) eVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            int hashCode2 = this.c.hashCode();
            String str = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.e;
            CountryCode countryCode = this.c;
            String str2 = this.a;
            return "Country(__typename=" + str + ", id=" + countryCode + ", englishName=" + str2 + ")";
        }

        public e(String str, CountryCode countryCode, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) countryCode, "");
            this.e = str;
            this.c = countryCode;
            this.a = str2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class j {
        private final Boolean a;
        private final c c;
        private final String d;

        public final c a() {
            return this.c;
        }

        public final Boolean b() {
            return this.a;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c((Object) this.d, (Object) jVar.d) && C8632dsu.c(this.c, jVar.c) && C8632dsu.c(this.a, jVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = this.c.hashCode();
            Boolean bool = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            String str = this.d;
            c cVar = this.c;
            Boolean bool = this.a;
            return "OnOctoberSkyPropertyBoolean(id=" + str + ", country=" + cVar + ", booleanValue=" + bool + ")";
        }

        public j(String str, c cVar, Boolean bool) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) cVar, "");
            this.d = str;
            this.c = cVar;
            this.a = bool;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private final CountryCode b;
        private final String c;
        private final String e;

        public final String a() {
            return this.c;
        }

        public final CountryCode b() {
            return this.b;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.e, (Object) cVar.e) && this.b == cVar.b && C8632dsu.c((Object) this.c, (Object) cVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            int hashCode2 = this.b.hashCode();
            String str = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.e;
            CountryCode countryCode = this.b;
            String str2 = this.c;
            return "Country1(__typename=" + str + ", id=" + countryCode + ", englishName=" + str2 + ")";
        }

        public c(String str, CountryCode countryCode, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) countryCode, "");
            this.e = str;
            this.b = countryCode;
            this.c = str2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
