package o;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.List;
import o.C2534ahr;

/* renamed from: o.cnP  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6971cnP {
    private final String a;
    private final int b;
    private final List<a> c;
    private final String d;
    private final String e;
    private final int i;

    public static /* synthetic */ C6971cnP e(C6971cnP c6971cnP, int i, String str, List list, int i2, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = c6971cnP.b;
        }
        if ((i3 & 2) != 0) {
            str = c6971cnP.d;
        }
        String str4 = str;
        List<a> list2 = list;
        if ((i3 & 4) != 0) {
            list2 = c6971cnP.c;
        }
        List list3 = list2;
        if ((i3 & 8) != 0) {
            i2 = c6971cnP.i;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            str2 = c6971cnP.e;
        }
        String str5 = str2;
        if ((i3 & 32) != 0) {
            str3 = c6971cnP.a;
        }
        return c6971cnP.c(i, str4, list3, i4, str5, str3);
    }

    public final String b() {
        return this.d;
    }

    public final C6971cnP c(int i, String str, List<a> list, int i2, String str2, String str3) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) str2, "");
        return new C6971cnP(i, str, list, i2, str2, str3);
    }

    public final List<a> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6971cnP) {
            C6971cnP c6971cnP = (C6971cnP) obj;
            return this.b == c6971cnP.b && C8632dsu.c((Object) this.d, (Object) c6971cnP.d) && C8632dsu.c(this.c, c6971cnP.c) && this.i == c6971cnP.i && C8632dsu.c((Object) this.e, (Object) c6971cnP.e) && C8632dsu.c((Object) this.a, (Object) c6971cnP.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.b);
        String str = this.d;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.c.hashCode();
        int hashCode4 = Integer.hashCode(this.i);
        int hashCode5 = this.e.hashCode();
        String str2 = this.a;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = this.b;
        String str = this.d;
        List<a> list = this.c;
        int i2 = this.i;
        String str2 = this.e;
        String str3 = this.a;
        return "MyListGames(totalCount=" + i + ", endCursor=" + str + ", entities=" + list + ", trackId=" + i2 + ", requestId=" + str2 + ", listId=" + str3 + ")";
    }

    public C6971cnP(int i, String str, List<a> list, int i2, String str2, String str3) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) str2, "");
        this.b = i;
        this.d = str;
        this.c = list;
        this.i = i2;
        this.e = str2;
        this.a = str3;
    }

    /* renamed from: o.cnP$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC5223buh {
        private final String a;
        private final String b;
        private final Integer c;
        private final Integer d;
        private final int e;
        private final String f;
        private final String g;
        private final Integer h;
        private final List<C2534ahr.c> i;
        private final String j;
        private final String m;

        public final Integer a() {
            return this.h;
        }

        public final Integer b() {
            return this.d;
        }

        public final int c() {
            return this.e;
        }

        public final String d() {
            return this.a;
        }

        public final Integer e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.g, (Object) aVar.g) && C8632dsu.c((Object) this.f, (Object) aVar.f) && this.e == aVar.e && C8632dsu.c((Object) this.m, (Object) aVar.m) && C8632dsu.c(this.i, aVar.i) && C8632dsu.c((Object) this.j, (Object) aVar.j) && C8632dsu.c(this.c, aVar.c) && C8632dsu.c(this.d, aVar.d) && C8632dsu.c(this.h, aVar.h) && C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c((Object) this.b, (Object) aVar.b);
            }
            return false;
        }

        public final String f() {
            return this.j;
        }

        @Override // o.InterfaceC5223buh
        public String getBoxartId() {
            return this.b;
        }

        @Override // o.InterfaceC5223buh
        public String getBoxshotUrl() {
            return this.a;
        }

        @Override // o.InterfaceC5175btm
        public String getTitle() {
            return this.f;
        }

        @Override // o.InterfaceC5175btm
        public String getUnifiedEntityId() {
            return this.g;
        }

        @Override // o.InterfaceC5223buh
        public String getVideoMerchComputeId() {
            return null;
        }

        public int hashCode() {
            int hashCode = this.g.hashCode();
            String str = this.f;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = Integer.hashCode(this.e);
            String str2 = this.m;
            int hashCode4 = str2 == null ? 0 : str2.hashCode();
            List<C2534ahr.c> list = this.i;
            int hashCode5 = list == null ? 0 : list.hashCode();
            String str3 = this.j;
            int hashCode6 = str3 == null ? 0 : str3.hashCode();
            Integer num = this.c;
            int hashCode7 = num == null ? 0 : num.hashCode();
            Integer num2 = this.d;
            int hashCode8 = num2 == null ? 0 : num2.hashCode();
            Integer num3 = this.h;
            int hashCode9 = num3 == null ? 0 : num3.hashCode();
            String str4 = this.a;
            int hashCode10 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.b;
            return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (str5 != null ? str5.hashCode() : 0);
        }

        @Override // o.InterfaceC5151btO
        public boolean isAvailableForDownload() {
            return false;
        }

        @Override // o.InterfaceC5151btO
        public boolean isAvailableToPlay() {
            return false;
        }

        @Override // o.InterfaceC5151btO
        public boolean isOriginal() {
            return false;
        }

        @Override // o.InterfaceC5151btO
        public boolean isPlayable() {
            return false;
        }

        public final List<C2534ahr.c> j() {
            return this.i;
        }

        public String toString() {
            String str = this.g;
            String str2 = this.f;
            int i = this.e;
            String str3 = this.m;
            List<C2534ahr.c> list = this.i;
            String str4 = this.j;
            Integer num = this.c;
            Integer num2 = this.d;
            Integer num3 = this.h;
            String str5 = this.a;
            String str6 = this.b;
            return "Item(unifiedEntityId=" + str + ", title=" + str2 + ", gameId=" + i + ", urlScheme=" + str3 + ", tags=" + list + ", packageName=" + str4 + ", minAndroidSdk=" + num + ", minMemoryGb=" + num2 + ", minNumProcessors=" + num3 + ", artworkUrl=" + str5 + ", artworkKey=" + str6 + ")";
        }

        public a(String str, String str2, int i, String str3, List<C2534ahr.c> list, String str4, Integer num, Integer num2, Integer num3, String str5, String str6) {
            C8632dsu.c((Object) str, "");
            this.g = str;
            this.f = str2;
            this.e = i;
            this.m = str3;
            this.i = list;
            this.j = str4;
            this.c = num;
            this.d = num2;
            this.h = num3;
            this.a = str5;
            this.b = str6;
        }

        @Override // o.InterfaceC5175btm
        public String getId() {
            return String.valueOf(this.e);
        }

        @Override // o.InterfaceC5175btm
        public VideoType getType() {
            return VideoType.GAMES;
        }
    }

    public final boolean d() {
        return this.b > this.c.size();
    }

    /* renamed from: o.cnP$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC5281bvm {
        public Void b() {
            return null;
        }

        public Void d() {
            return null;
        }

        public Void e() {
            return null;
        }

        @Override // o.InterfaceC5281bvm
        public int getListPos() {
            return 0;
        }

        b() {
        }

        @Override // o.InterfaceC5281bvm
        public /* synthetic */ String getImpressionToken() {
            return (String) b();
        }

        @Override // o.InterfaceC5281bvm
        public /* synthetic */ String getListContext() {
            return (String) e();
        }

        @Override // o.InterfaceC5281bvm
        public /* synthetic */ String getSectionUid() {
            return (String) d();
        }

        @Override // o.InterfaceC5281bvm
        public int getTrackId() {
            return C6971cnP.this.i;
        }

        @Override // o.InterfaceC5281bvm
        public String getRequestId() {
            return C6971cnP.this.e;
        }

        @Override // o.InterfaceC5281bvm
        public String getListId() {
            return C6971cnP.this.a;
        }
    }

    public final InterfaceC5281bvm a() {
        return new b();
    }
}
