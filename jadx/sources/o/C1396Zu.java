package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2223acG;
import o.C9018hf;
import o.InterfaceC8990hD;

/* renamed from: o.Zu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1396Zu implements InterfaceC8990hD<e> {
    public static final b e = new b(null);
    private final C3212auh a;
    private final boolean b;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "4e9ae04e-6e3c-4750-97ca-f564ffd6573a";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1396Zu) && C8632dsu.c(this.a, ((C1396Zu) obj).a);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "RemoveProfileTitleProtectionMutation";
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final C3212auh i() {
        return this.a;
    }

    public String toString() {
        C3212auh c3212auh = this.a;
        return "RemoveProfileTitleProtectionMutation(input=" + c3212auh + ")";
    }

    public C1396Zu(C3212auh c3212auh) {
        C8632dsu.c((Object) c3212auh, "");
        this.a = c3212auh;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2222acF.d.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(C2223acG.e.e, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2888aoa.a.e()).d();
    }

    /* renamed from: o.Zu$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8990hD.b {
        private final d c;

        public final d c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.c, ((e) obj).c);
        }

        public int hashCode() {
            d dVar = this.c;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            d dVar = this.c;
            return "Data(removeTitleProtection=" + dVar + ")";
        }

        public e(d dVar) {
            this.c = dVar;
        }
    }

    /* renamed from: o.Zu$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final boolean b;
        private final List<a> c;

        public final boolean a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final List<a> e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && this.b == dVar.b && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            int hashCode2 = Boolean.hashCode(this.b);
            List<a> list = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.a;
            boolean z = this.b;
            List<a> list = this.c;
            return "RemoveTitleProtection(__typename=" + str + ", success=" + z + ", errors=" + list + ")";
        }

        public d(String str, boolean z, List<a> list) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.b = z;
            this.c = list;
        }
    }

    /* renamed from: o.Zu$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String b;
        private final String e;

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.b, (Object) aVar.b) && C8632dsu.c((Object) this.e, (Object) aVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.b;
            String str2 = this.e;
            return "Error(__typename=" + str + ", message=" + str2 + ")";
        }

        public a(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.b = str;
            this.e = str2;
        }
    }

    /* renamed from: o.Zu$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
