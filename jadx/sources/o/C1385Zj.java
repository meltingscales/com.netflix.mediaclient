package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2257aco;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Zj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1385Zj implements InterfaceC8999hM<e> {
    public static final c a = new c(null);
    private final boolean c;
    private final String d;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "d512884d-2856-42cd-a6c4-462a0f6e2ab2";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1385Zj) && C8632dsu.c((Object) this.d, (Object) ((C1385Zj) obj).d);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "ProfileByGuidQuery";
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public final String j() {
        return this.d;
    }

    public String toString() {
        String str = this.d;
        return "ProfileByGuidQuery(guid=" + str + ")";
    }

    public C1385Zj(String str) {
        C8632dsu.c((Object) str, "");
        this.d = str;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2258acp.d.b(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(C2257aco.b.a, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2825anQ.a.e()).d();
    }

    /* renamed from: o.Zj$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8999hM.c {
        private final a e;

        public final a e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.e, ((e) obj).e);
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

        public e(a aVar) {
            this.e = aVar;
        }
    }

    /* renamed from: o.Zj$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final C2567aiX b;
        private final String c;

        public final String b() {
            return this.c;
        }

        public final C2567aiX d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c(this.b, aVar.b);
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

        public a(String str, C2567aiX c2567aiX) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2567aiX, "");
            this.c = str;
            this.b = c2567aiX;
        }
    }

    /* renamed from: o.Zj$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
