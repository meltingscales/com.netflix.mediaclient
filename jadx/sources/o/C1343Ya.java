package o;

import com.netflix.mediaclient.graphql.models.type.CountryCode;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C9018hf;
import o.InterfaceC8999hM;
import o.ZY;

/* renamed from: o.Ya  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1343Ya implements InterfaceC8999hM<e> {
    public static final d d = new d(null);
    private final CountryCode b;
    private final boolean c;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "27cdff6e-9597-4e83-83d7-9f758be1c178";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1343Ya) && this.b == ((C1343Ya) obj).b;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "AllMaturityRatings";
    }

    public int hashCode() {
        CountryCode countryCode = this.b;
        if (countryCode == null) {
            return 0;
        }
        return countryCode.hashCode();
    }

    public final CountryCode i() {
        return this.b;
    }

    public String toString() {
        CountryCode countryCode = this.b;
        return "AllMaturityRatingsQuery(countryCode=" + countryCode + ")";
    }

    public C1343Ya(CountryCode countryCode) {
        this.b = countryCode;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2139aac.c.e(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(ZY.c.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2758amC.e.e()).d();
    }

    /* renamed from: o.Ya$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8999hM.c {
        private final List<a> d;

        public final List<a> d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.d, ((e) obj).d);
        }

        public int hashCode() {
            List<a> list = this.d;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<a> list = this.d;
            return "Data(parentalControlMaturityRatings=" + list + ")";
        }

        public e(List<a> list) {
            this.d = list;
        }
    }

    /* renamed from: o.Ya$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String b;
        private final C2536aht e;

        public final String d() {
            return this.b;
        }

        public final C2536aht e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.b, (Object) aVar.b) && C8632dsu.c(this.e, aVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.b;
            C2536aht c2536aht = this.e;
            return "ParentalControlMaturityRating(__typename=" + str + ", maturityRating=" + c2536aht + ")";
        }

        public a(String str, C2536aht c2536aht) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2536aht, "");
            this.b = str;
            this.e = c2536aht;
        }
    }

    /* renamed from: o.Ya$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
