package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C9018hf;
import o.InterfaceC8990hD;
import o.ZS;

/* loaded from: classes3.dex */
public final class XU implements InterfaceC8990hD<d> {
    public static final c c = new c(null);
    private final String a;
    private final String d;
    private final boolean e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "696df992-e650-4b40-b0a6-072c15fefb85";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof XU) {
            XU xu = (XU) obj;
            return C8632dsu.c((Object) this.a, (Object) xu.a) && C8632dsu.c((Object) this.d, (Object) xu.d);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "AddToRemindMe";
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        String str = this.d;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String i() {
        return this.a;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.d;
        return "AddToRemindMeMutation(videoId=" + str + ", trackId=" + str2 + ")";
    }

    public XU(String str, String str2) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.d = str2;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        ZT.c.a(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<d> e() {
        return C8953gT.c(ZS.e.a, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2759amD.c.d()).d();
    }

    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8990hD.b {
        private final e c;

        public final e d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.c, ((d) obj).c);
        }

        public int hashCode() {
            e eVar = this.c;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public String toString() {
            e eVar = this.c;
            return "Data(addToRemindMe=" + eVar + ")";
        }

        public d(e eVar) {
            this.c = eVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final Boolean b;
        private final int e;

        public final int b() {
            return this.e;
        }

        public final String d() {
            return this.a;
        }

        public final Boolean e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.a, (Object) eVar.a) && this.e == eVar.e && C8632dsu.c(this.b, eVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            int hashCode2 = Integer.hashCode(this.e);
            Boolean bool = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            String str = this.a;
            int i = this.e;
            Boolean bool = this.b;
            return "AddToRemindMe(__typename=" + str + ", videoId=" + i + ", isInRemindMeList=" + bool + ")";
        }

        public e(String str, int i, Boolean bool) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.e = i;
            this.b = bool;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
