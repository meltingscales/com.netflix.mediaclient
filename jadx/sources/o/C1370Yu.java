package o;

import com.netflix.mediaclient.graphql.models.type.ArtworkFormat;
import com.netflix.mediaclient.graphql.models.type.ArtworkType;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.AbstractC8997hK;
import o.C2124aaN;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Yu  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1370Yu implements InterfaceC8999hM<d> {
    public static final c e = new c(null);
    private final ArtworkType a;
    private final int b;
    private final C2952apl c;
    private final AbstractC8997hK<List<ArtworkFormat>> d;
    private final Integer f;
    private final boolean g;
    private final Integer i;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "369cedce-828a-44ed-83ad-0199bafc9447";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1370Yu) {
            C1370Yu c1370Yu = (C1370Yu) obj;
            return this.b == c1370Yu.b && this.a == c1370Yu.a && C8632dsu.c(this.i, c1370Yu.i) && C8632dsu.c(this.f, c1370Yu.f) && C8632dsu.c(this.d, c1370Yu.d) && C8632dsu.c(this.c, c1370Yu.c);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "GameArtAssetQuery";
    }

    public final int g() {
        return this.b;
    }

    public final ArtworkType h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.b);
        int hashCode2 = this.a.hashCode();
        Integer num = this.i;
        int hashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.f;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.c.hashCode();
    }

    public final AbstractC8997hK<List<ArtworkFormat>> i() {
        return this.d;
    }

    public final C2952apl j() {
        return this.c;
    }

    public final Integer l() {
        return this.f;
    }

    public final Integer o() {
        return this.i;
    }

    public String toString() {
        int i = this.b;
        ArtworkType artworkType = this.a;
        Integer num = this.i;
        Integer num2 = this.f;
        AbstractC8997hK<List<ArtworkFormat>> abstractC8997hK = this.d;
        C2952apl c2952apl = this.c;
        return "GameArtAssetQuery(gameId=" + i + ", artworkType=" + artworkType + ", width=" + num + ", height=" + num2 + ", formats=" + abstractC8997hK + ", features=" + c2952apl + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1370Yu(int i, ArtworkType artworkType, Integer num, Integer num2, AbstractC8997hK<? extends List<? extends ArtworkFormat>> abstractC8997hK, C2952apl c2952apl) {
        C8632dsu.c((Object) artworkType, "");
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) c2952apl, "");
        this.b = i;
        this.a = artworkType;
        this.i = num;
        this.f = num2;
        this.d = abstractC8997hK;
        this.c = c2952apl;
    }

    public /* synthetic */ C1370Yu(int i, ArtworkType artworkType, Integer num, Integer num2, AbstractC8997hK abstractC8997hK, C2952apl c2952apl, int i2, C8627dsp c8627dsp) {
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
        C2127aaQ.d.b(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<d> e() {
        return C8953gT.c(C2124aaN.b.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2780amY.c.d()).d();
    }

    /* renamed from: o.Yu$d */
    /* loaded from: classes6.dex */
    public static final class d implements InterfaceC8999hM.c {
        private final List<a> b;

        public final List<a> b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.b, ((d) obj).b);
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
            return "Data(games=" + list + ")";
        }

        public d(List<a> list) {
            this.b = list;
        }
    }

    /* renamed from: o.Yu$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private final String a;
        private final int b;
        private final b e;

        public final b b() {
            return this.e;
        }

        public final String c() {
            return this.a;
        }

        public final int d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && this.b == aVar.b && C8632dsu.c(this.e, aVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            int hashCode2 = Integer.hashCode(this.b);
            b bVar = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            int i = this.b;
            b bVar = this.e;
            return "Game(__typename=" + str + ", gameId=" + i + ", artwork=" + bVar + ")";
        }

        public a(String str, int i, b bVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.b = i;
            this.e = bVar;
        }
    }

    /* renamed from: o.Yu$b */
    /* loaded from: classes6.dex */
    public static final class b {
        private final String c;
        private final Boolean d;
        private final String e;

        public final Boolean a() {
            return this.d;
        }

        public final String d() {
            return this.c;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c(this.d, bVar.d) && C8632dsu.c((Object) this.c, (Object) bVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            Boolean bool = this.d;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            String str = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            Boolean bool = this.d;
            String str2 = this.c;
            return "Artwork(__typename=" + str + ", available=" + bool + ", url=" + str2 + ")";
        }

        public b(String str, Boolean bool, String str2) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = bool;
            this.c = str2;
        }
    }

    /* renamed from: o.Yu$c */
    /* loaded from: classes6.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
