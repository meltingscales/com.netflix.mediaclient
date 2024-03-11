package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2140aad;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Yc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1345Yc implements InterfaceC8999hM<d> {
    public static final b e = new b(null);
    private final boolean a;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "b1cc04c8-9040-4508-9676-9889e2bbfed3";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.a;
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "AvailablePreferredSecondaryLocalesQuery";
    }

    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == C1345Yc.class;
    }

    public int hashCode() {
        return dsA.a(C1345Yc.class).hashCode();
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<d> e() {
        return C8953gT.c(C2140aad.c.e, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2764amI.e.b()).d();
    }

    /* renamed from: o.Yc$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8999hM.c {
        private final a e;

        public final a c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.e, ((d) obj).e);
        }

        public int hashCode() {
            a aVar = this.e;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            a aVar = this.e;
            return "Data(availablePreferredSecondaryLocales=" + aVar + ")";
        }

        public d(a aVar) {
            this.e = aVar;
        }
    }

    /* renamed from: o.Yc$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String d;
        private final List<c> e;

        public final String b() {
            return this.d;
        }

        public final List<c> c() {
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
            List<c> list = this.e;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.d;
            List<c> list = this.e;
            return "AvailablePreferredSecondaryLocales(__typename=" + str + ", edges=" + list + ")";
        }

        public a(String str, List<c> list) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = list;
        }
    }

    /* renamed from: o.Yc$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final e b;
        private final String c;

        public final String d() {
            return this.c;
        }

        public final e e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.c, (Object) cVar.c) && C8632dsu.c(this.b, cVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            e eVar = this.b;
            return (hashCode * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            e eVar = this.b;
            return "Edge(__typename=" + str + ", node=" + eVar + ")";
        }

        public c(String str, e eVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.b = eVar;
        }
    }

    /* renamed from: o.Yc$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final C2545aiB a;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final C2545aiB d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c(this.a, eVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.d;
            C2545aiB c2545aiB = this.a;
            return "Node(__typename=" + str + ", profileLocaleSummary=" + c2545aiB + ")";
        }

        public e(String str, C2545aiB c2545aiB) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2545aiB, "");
            this.d = str;
            this.a = c2545aiB;
        }
    }

    /* renamed from: o.Yc$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
