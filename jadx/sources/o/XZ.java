package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2137aaa;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class XZ implements InterfaceC8999hM<a> {
    public static final d c = new d(null);
    private final boolean e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "9a8e434c-9cda-477e-8370-1d865e7db367";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "AvailablePreferredLocalesQuery";
    }

    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == XZ.class;
    }

    public int hashCode() {
        return dsA.a(XZ.class).hashCode();
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<a> e() {
        return C8953gT.c(C2137aaa.c.d, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2762amG.c.c()).d();
    }

    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8999hM.c {
        private final e d;

        public final e c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.d, ((a) obj).d);
        }

        public int hashCode() {
            e eVar = this.d;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public String toString() {
            e eVar = this.d;
            return "Data(availablePreferredLocales=" + eVar + ")";
        }

        public a(e eVar) {
            this.d = eVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final List<b> d;

        public final List<b> b() {
            return this.d;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c(this.d, eVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            List<b> list = this.d;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.a;
            List<b> list = this.d;
            return "AvailablePreferredLocales(__typename=" + str + ", edges=" + list + ")";
        }

        public e(String str, List<b> list) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = list;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private final String b;
        private final c e;

        public final c b() {
            return this.e;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c(this.e, bVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            c cVar = this.e;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            c cVar = this.e;
            return "Edge(__typename=" + str + ", node=" + cVar + ")";
        }

        public b(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = cVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private final String b;
        private final C2545aiB c;

        public final String a() {
            return this.b;
        }

        public final C2545aiB e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.c, cVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.b;
            C2545aiB c2545aiB = this.c;
            return "Node(__typename=" + str + ", profileLocaleSummary=" + c2545aiB + ")";
        }

        public c(String str, C2545aiB c2545aiB) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2545aiB, "");
            this.b = str;
            this.c = c2545aiB;
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
