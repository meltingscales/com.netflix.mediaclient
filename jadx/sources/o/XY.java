package o;

import com.netflix.mediaclient.graphql.models.type.ArtworkFormat;
import com.netflix.mediaclient.graphql.models.type.ArtworkType;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.AbstractC8997hK;
import o.C9018hf;
import o.InterfaceC8999hM;
import o.ZZ;

/* loaded from: classes3.dex */
public final class XY implements InterfaceC8999hM<e> {
    public static final d c = new d(null);
    private final AbstractC8997hK<List<ArtworkFormat>> a;
    private final Integer b;
    private final C2952apl d;
    private final ArtworkType e;
    private final int f;
    private final boolean i;
    private final Integer j;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "95c35bdb-0162-48c8-a16a-a3bd57e9baa1";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof XY) {
            XY xy = (XY) obj;
            return this.f == xy.f && this.e == xy.e && C8632dsu.c(this.j, xy.j) && C8632dsu.c(this.b, xy.b) && C8632dsu.c(this.a, xy.a) && C8632dsu.c(this.d, xy.d);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "ArtAssetQuery";
    }

    public final AbstractC8997hK<List<ArtworkFormat>> g() {
        return this.a;
    }

    public final ArtworkType h() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f);
        int hashCode2 = this.e.hashCode();
        Integer num = this.j;
        int hashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.b;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + this.a.hashCode()) * 31) + this.d.hashCode();
    }

    public final C2952apl i() {
        return this.d;
    }

    public final Integer j() {
        return this.b;
    }

    public final Integer l() {
        return this.j;
    }

    public final int o() {
        return this.f;
    }

    public String toString() {
        int i = this.f;
        ArtworkType artworkType = this.e;
        Integer num = this.j;
        Integer num2 = this.b;
        AbstractC8997hK<List<ArtworkFormat>> abstractC8997hK = this.a;
        C2952apl c2952apl = this.d;
        return "ArtAssetQuery(videoId=" + i + ", artworkType=" + artworkType + ", width=" + num + ", height=" + num2 + ", formats=" + abstractC8997hK + ", features=" + c2952apl + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public XY(int i, ArtworkType artworkType, Integer num, Integer num2, AbstractC8997hK<? extends List<? extends ArtworkFormat>> abstractC8997hK, C2952apl c2952apl) {
        C8632dsu.c((Object) artworkType, "");
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) c2952apl, "");
        this.f = i;
        this.e = artworkType;
        this.j = num;
        this.b = num2;
        this.a = abstractC8997hK;
        this.d = c2952apl;
    }

    public /* synthetic */ XY(int i, ArtworkType artworkType, Integer num, Integer num2, AbstractC8997hK abstractC8997hK, C2952apl c2952apl, int i2, C8627dsp c8627dsp) {
        this(i, artworkType, num, num2, (i2 & 16) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, c2952apl);
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2138aab.d.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(ZZ.a.e, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2757amB.d.a()).d();
    }

    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8999hM.c {
        private final List<a> c;

        public final List<a> a() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.c, ((e) obj).c);
        }

        public int hashCode() {
            List<a> list = this.c;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<a> list = this.c;
            return "Data(videos=" + list + ")";
        }

        public e(List<a> list) {
            this.c = list;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final c a;
        private final String b;
        private final int d;

        public final int b() {
            return this.d;
        }

        public final String c() {
            return this.b;
        }

        public final c e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.b, (Object) aVar.b) && this.d == aVar.d && C8632dsu.c(this.a, aVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = Integer.hashCode(this.d);
            c cVar = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            int i = this.d;
            c cVar = this.a;
            return "Video(__typename=" + str + ", videoId=" + i + ", artwork=" + cVar + ")";
        }

        public a(String str, int i, c cVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = i;
            this.a = cVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private final Boolean a;
        private final String b;
        private final String e;

        public final String b() {
            return this.b;
        }

        public final Boolean c() {
            return this.a;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.a, cVar.a) && C8632dsu.c((Object) this.e, (Object) cVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            Boolean bool = this.a;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            String str = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            Boolean bool = this.a;
            String str2 = this.e;
            return "Artwork(__typename=" + str + ", available=" + bool + ", url=" + str2 + ")";
        }

        public c(String str, Boolean bool, String str2) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = bool;
            this.e = str2;
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
