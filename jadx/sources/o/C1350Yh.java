package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2142aaf;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Yh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1350Yh implements InterfaceC8999hM<d> {
    public static final c c = new c(null);
    private final String a;
    private final boolean e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "7bca0b6e-d21a-466b-a159-77381817f342";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1350Yh) && C8632dsu.c((Object) this.a, (Object) ((C1350Yh) obj).a);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "BlockedTitlesByGuidQuery";
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final String i() {
        return this.a;
    }

    public String toString() {
        String str = this.a;
        return "BlockedTitlesByGuidQuery(guid=" + str + ")";
    }

    public C1350Yh(String str) {
        C8632dsu.c((Object) str, "");
        this.a = str;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2141aae.d.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<d> e() {
        return C8953gT.c(C2142aaf.b.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2763amH.c.e()).d();
    }

    /* renamed from: o.Yh$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8999hM.c {
        private final a e;

        public final a a() {
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
            return "Data(profile=" + aVar + ")";
        }

        public d(a aVar) {
            this.e = aVar;
        }
    }

    /* renamed from: o.Yh$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String c;
        private final C2569aiZ e;

        public final C2569aiZ a() {
            return this.e;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c(this.e, aVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.c;
            C2569aiZ c2569aiZ = this.e;
            return "Profile(__typename=" + str + ", userBlockedTitles=" + c2569aiZ + ")";
        }

        public a(String str, C2569aiZ c2569aiZ) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2569aiZ, "");
            this.c = str;
            this.e = c2569aiZ;
        }
    }

    /* renamed from: o.Yh$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
