package o;

import com.netflix.mediaclient.graphql.models.type.RemoveProfileErrorCode;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2221acE;
import o.C9018hf;
import o.InterfaceC8990hD;

/* renamed from: o.Zt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1395Zt implements InterfaceC8990hD<c> {
    public static final e d = new e(null);
    private final boolean a;
    private final C3207auc b;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "d758bc85-0fa3-4f53-9d01-383804884641";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1395Zt) && C8632dsu.c(this.b, ((C1395Zt) obj).b);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "RemoveProfileMutation";
    }

    public final C3207auc g() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        C3207auc c3207auc = this.b;
        return "RemoveProfileMutation(input=" + c3207auc + ")";
    }

    public C1395Zt(C3207auc c3207auc) {
        C8632dsu.c((Object) c3207auc, "");
        this.b = c3207auc;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2225acI.e.e(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<c> e() {
        return C8953gT.c(C2221acE.b.a, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2833anY.d.b()).d();
    }

    /* renamed from: o.Zt$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8990hD.b {
        private final g c;

        public final g c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.c, ((c) obj).c);
        }

        public int hashCode() {
            g gVar = this.c;
            if (gVar == null) {
                return 0;
            }
            return gVar.hashCode();
        }

        public String toString() {
            g gVar = this.c;
            return "Data(removeProfile=" + gVar + ")";
        }

        public c(g gVar) {
            this.c = gVar;
        }
    }

    /* renamed from: o.Zt$g */
    /* loaded from: classes3.dex */
    public static final class g {
        private final String a;
        private final a c;
        private final List<d> d;

        public final String b() {
            return this.a;
        }

        public final a d() {
            return this.c;
        }

        public final List<d> e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.a, (Object) gVar.a) && C8632dsu.c(this.c, gVar.c) && C8632dsu.c(this.d, gVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            a aVar = this.c;
            int hashCode2 = aVar == null ? 0 : aVar.hashCode();
            List<d> list = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            a aVar = this.c;
            List<d> list = this.d;
            return "RemoveProfile(__typename=" + str + ", account=" + aVar + ", errors=" + list + ")";
        }

        public g(String str, a aVar, List<d> list) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = aVar;
            this.d = list;
        }
    }

    /* renamed from: o.Zt$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String d;
        private final Boolean e;

        public final String a() {
            return this.d;
        }

        public final Boolean e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c(this.e, aVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            Boolean bool = this.e;
            return (hashCode * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            String str = this.d;
            Boolean bool = this.e;
            return "Account(__typename=" + str + ", canCreateUserProfile=" + bool + ")";
        }

        public a(String str, Boolean bool) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = bool;
        }
    }

    /* renamed from: o.Zt$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final b c;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final b d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            b bVar = this.c;
            return (hashCode * 31) + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            b bVar = this.c;
            return "Error(__typename=" + str + ", onRemoveProfileError=" + bVar + ")";
        }

        public d(String str, b bVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.c = bVar;
        }
    }

    /* renamed from: o.Zt$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final RemoveProfileErrorCode b;

        public final RemoveProfileErrorCode a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            RemoveProfileErrorCode removeProfileErrorCode = this.b;
            return "OnRemoveProfileError(code=" + removeProfileErrorCode + ")";
        }

        public b(RemoveProfileErrorCode removeProfileErrorCode) {
            C8632dsu.c((Object) removeProfileErrorCode, "");
            this.b = removeProfileErrorCode;
        }
    }

    /* renamed from: o.Zt$e */
    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }
}
