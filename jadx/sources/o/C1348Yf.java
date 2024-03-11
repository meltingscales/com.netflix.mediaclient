package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2143aag;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Yf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1348Yf implements InterfaceC8999hM<e> {
    public static final b d = new b(null);
    private final int a;
    private final boolean e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "65c3de56-4d8b-4ef3-8120-851375f0b083";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1348Yf) && this.a == ((C1348Yf) obj).a;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "CommanderFeatureEducationVideo";
    }

    public final int h() {
        return this.a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        int i = this.a;
        return "CommanderFeatureEducationVideoQuery(videoId=" + i + ")";
    }

    public C1348Yf(int i) {
        this.a = i;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2146aaj.d.d(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(C2143aag.b.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2760amE.e.b()).d();
    }

    /* renamed from: o.Yf$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8999hM.c {
        private final List<d> a;

        public final List<d> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.a, ((e) obj).a);
        }

        public int hashCode() {
            List<d> list = this.a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<d> list = this.a;
            return "Data(videos=" + list + ")";
        }

        public e(List<d> list) {
            this.a = list;
        }
    }

    /* renamed from: o.Yf$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final c a;
        private final int d;
        private final String e;

        public final c a() {
            return this.a;
        }

        public final int d() {
            return this.d;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && this.d == dVar.d && C8632dsu.c(this.a, dVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            int hashCode2 = Integer.hashCode(this.d);
            c cVar = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            int i = this.d;
            c cVar = this.a;
            return "Video(__typename=" + str + ", videoId=" + i + ", promoVideo=" + cVar + ")";
        }

        public d(String str, int i, c cVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = i;
            this.a = cVar;
        }
    }

    /* renamed from: o.Yf$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String b;
        private final j e;

        public final String a() {
            return this.b;
        }

        public final j d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.e, cVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            j jVar = this.e;
            return (hashCode * 31) + (jVar == null ? 0 : jVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            j jVar = this.e;
            return "PromoVideo(__typename=" + str + ", video=" + jVar + ")";
        }

        public c(String str, j jVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = jVar;
        }
    }

    /* renamed from: o.Yf$j */
    /* loaded from: classes3.dex */
    public static final class j {
        private final int c;
        private final String d;
        private final a e;

        public final a b() {
            return this.e;
        }

        public final String c() {
            return this.d;
        }

        public final int d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c((Object) this.d, (Object) jVar.d) && this.c == jVar.c && C8632dsu.c(this.e, jVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = Integer.hashCode(this.c);
            a aVar = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            int i = this.c;
            a aVar = this.e;
            return "Video1(__typename=" + str + ", videoId=" + i + ", storyArt=" + aVar + ")";
        }

        public j(String str, int i, a aVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = i;
            this.e = aVar;
        }
    }

    /* renamed from: o.Yf$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final Boolean b;
        private final String c;
        private final String d;

        public final Boolean b() {
            return this.b;
        }

        public final String c() {
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
                return C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c(this.b, aVar.b) && C8632dsu.c((Object) this.d, (Object) aVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            Boolean bool = this.b;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            String str = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            Boolean bool = this.b;
            String str2 = this.d;
            return "StoryArt(__typename=" + str + ", available=" + bool + ", url=" + str2 + ")";
        }

        public a(String str, Boolean bool, String str2) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.b = bool;
            this.d = str2;
        }
    }

    /* renamed from: o.Yf$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
