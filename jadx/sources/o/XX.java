package o;

import com.netflix.mediaclient.graphql.models.type.AddProfileErrorCode;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C9018hf;
import o.InterfaceC8990hD;
import o.ZM;

/* loaded from: classes3.dex */
public final class XX implements InterfaceC8990hD<e> {
    public static final b a = new b(null);
    private final C2906aos b;
    private final boolean c;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "8ebd8f3c-f3b2-42ce-835e-613a7614a820";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof XX) && C8632dsu.c(this.b, ((XX) obj).b);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "AddProfileMutation";
    }

    public final C2906aos g() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        C2906aos c2906aos = this.b;
        return "AddProfileMutation(input=" + c2906aos + ")";
    }

    public XX(C2906aos c2906aos) {
        C8632dsu.c((Object) c2906aos, "");
        this.b = c2906aos;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        ZL.e.b(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(ZM.b.c, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2804amw.b.b()).d();
    }

    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8990hD.b {
        private final a d;

        public final a a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.d, ((e) obj).d);
        }

        public int hashCode() {
            a aVar = this.d;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            a aVar = this.d;
            return "Data(addProfile=" + aVar + ")";
        }

        public e(a aVar) {
            this.d = aVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final d b;
        private final List<c> c;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final List<c> b() {
            return this.c;
        }

        public final d c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c(this.b, aVar.b) && C8632dsu.c(this.c, aVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            d dVar = this.b;
            int hashCode2 = dVar == null ? 0 : dVar.hashCode();
            List<c> list = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            d dVar = this.b;
            List<c> list = this.c;
            return "AddProfile(__typename=" + str + ", account=" + dVar + ", errors=" + list + ")";
        }

        public a(String str, d dVar, List<c> list) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.b = dVar;
            this.c = list;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final List<g> c;
        private final Boolean e;

        public final List<g> a() {
            return this.c;
        }

        public final Boolean b() {
            return this.e;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c(this.e, dVar.e) && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            Boolean bool = this.e;
            return (((hashCode * 31) + (bool == null ? 0 : bool.hashCode())) * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.a;
            Boolean bool = this.e;
            List<g> list = this.c;
            return "Account(__typename=" + str + ", canCreateUserProfile=" + bool + ", profiles=" + list + ")";
        }

        public d(String str, Boolean bool, List<g> list) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) list, "");
            this.a = str;
            this.e = bool;
            this.c = list;
        }
    }

    /* loaded from: classes3.dex */
    public static final class g {
        private final C2567aiX b;
        private final String c;

        public final C2567aiX b() {
            return this.b;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.c, (Object) gVar.c) && C8632dsu.c(this.b, gVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.c;
            C2567aiX c2567aiX = this.b;
            return "Profile(__typename=" + str + ", userProfile=" + c2567aiX + ")";
        }

        public g(String str, C2567aiX c2567aiX) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2567aiX, "");
            this.c = str;
            this.b = c2567aiX;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private final String c;
        private final f d;

        public final String d() {
            return this.c;
        }

        public final f e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.c, (Object) cVar.c) && C8632dsu.c(this.d, cVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            f fVar = this.d;
            return (hashCode * 31) + (fVar == null ? 0 : fVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            f fVar = this.d;
            return "Error(__typename=" + str + ", onAddProfileError=" + fVar + ")";
        }

        public c(String str, f fVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.d = fVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class f {
        private final AddProfileErrorCode b;

        public final AddProfileErrorCode d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            AddProfileErrorCode addProfileErrorCode = this.b;
            return "OnAddProfileError(code=" + addProfileErrorCode + ")";
        }

        public f(AddProfileErrorCode addProfileErrorCode) {
            C8632dsu.c((Object) addProfileErrorCode, "");
            this.b = addProfileErrorCode;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
