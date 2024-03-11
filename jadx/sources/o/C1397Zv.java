package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2234acR;
import o.C9018hf;
import o.InterfaceC8990hD;

/* renamed from: o.Zv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1397Zv implements InterfaceC8990hD<c> {
    public static final d a = new d(null);
    private final C3222aur c;
    private final boolean d;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "022235a7-2ae0-446f-99df-0ce66e7a4468";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1397Zv) && C8632dsu.c(this.c, ((C1397Zv) obj).c);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "SetProfileAccessPin";
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public final C3222aur i() {
        return this.c;
    }

    public String toString() {
        C3222aur c3222aur = this.c;
        return "SetProfileAccessPinMutation(input=" + c3222aur + ")";
    }

    public C1397Zv(C3222aur c3222aur) {
        C8632dsu.c((Object) c3222aur, "");
        this.c = c3222aur;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2235acS.e.b(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<c> e() {
        return C8953gT.c(C2234acR.d.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2891aod.e.d()).d();
    }

    /* renamed from: o.Zv$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8990hD.b {
        private final a a;

        public final a b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            a aVar = this.a;
            return "Data(setProfileAccessPin=" + aVar + ")";
        }

        public c(a aVar) {
            this.a = aVar;
        }
    }

    /* renamed from: o.Zv$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final b a;
        private final String b;

        public final b a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.b, (Object) aVar.b) && C8632dsu.c(this.a, aVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            b bVar = this.a;
            return (hashCode * 31) + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            b bVar = this.a;
            return "SetProfileAccessPin(__typename=" + str + ", profile=" + bVar + ")";
        }

        public a(String str, b bVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = bVar;
        }
    }

    /* renamed from: o.Zv$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final C2567aiX a;
        private final String e;

        public final C2567aiX b() {
            return this.a;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c(this.a, bVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.e;
            C2567aiX c2567aiX = this.a;
            return "Profile(__typename=" + str + ", userProfile=" + c2567aiX + ")";
        }

        public b(String str, C2567aiX c2567aiX) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2567aiX, "");
            this.e = str;
            this.a = c2567aiX;
        }
    }

    /* renamed from: o.Zv$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
