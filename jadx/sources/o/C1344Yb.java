package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C9018hf;
import o.InterfaceC8990hD;
import o.ZW;

/* renamed from: o.Yb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1344Yb implements InterfaceC8990hD<c> {
    public static final e c = new e(null);
    private final C3381axs b;
    private final boolean e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "c362332e-688c-4f4b-b9bb-612237af7b50";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1344Yb) && C8632dsu.c(this.b, ((C1344Yb) obj).b);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "AddVideoToRemindMe";
    }

    public final C3381axs g() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        C3381axs c3381axs = this.b;
        return "AddVideoToRemindMeMutation(input=" + c3381axs + ")";
    }

    public C1344Yb(C3381axs c3381axs) {
        C8632dsu.c((Object) c3381axs, "");
        this.b = c3381axs;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        ZX.e.d(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<c> e() {
        return C8953gT.c(ZW.b.e, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2756amA.c.a()).d();
    }

    /* renamed from: o.Yb$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8990hD.b {
        private final b e;

        public final b a() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.e, ((c) obj).e);
        }

        public int hashCode() {
            b bVar = this.e;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            b bVar = this.e;
            return "Data(addToRemindMe=" + bVar + ")";
        }

        public c(b bVar) {
            this.e = bVar;
        }
    }

    /* renamed from: o.Yb$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final Boolean b;
        private final String c;
        private final Boolean d;
        private final int e;

        public final String a() {
            return this.c;
        }

        public final Boolean b() {
            return this.b;
        }

        public final Boolean d() {
            return this.d;
        }

        public final int e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && this.e == bVar.e && C8632dsu.c(this.d, bVar.d) && C8632dsu.c(this.b, bVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = Integer.hashCode(this.e);
            Boolean bool = this.d;
            int hashCode3 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.b;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            int i = this.e;
            Boolean bool = this.d;
            Boolean bool2 = this.b;
            return "AddToRemindMe(__typename=" + str + ", videoId=" + i + ", isInPlaylist=" + bool + ", isInRemindMeList=" + bool2 + ")";
        }

        public b(String str, int i, Boolean bool, Boolean bool2) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.e = i;
            this.d = bool;
            this.b = bool2;
        }
    }

    /* renamed from: o.Yb$e */
    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }
}
