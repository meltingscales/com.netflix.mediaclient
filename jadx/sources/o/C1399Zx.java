package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2228acL;
import o.C9018hf;
import o.InterfaceC8990hD;

/* renamed from: o.Zx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1399Zx implements InterfaceC8990hD<e> {
    public static final c d = new c(null);
    private final C3381axs a;
    private final boolean b;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "9db4655a-26e4-4568-85e2-9684408afac5";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1399Zx) && C8632dsu.c(this.a, ((C1399Zx) obj).a);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "RemoveVideoFromMyList";
    }

    public final C3381axs h() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        C3381axs c3381axs = this.a;
        return "RemoveVideoFromMyListMutation(input=" + c3381axs + ")";
    }

    public C1399Zx(C3381axs c3381axs) {
        C8632dsu.c((Object) c3381axs, "");
        this.a = c3381axs;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2230acN.e.d(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(C2228acL.d.e, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2832anX.d.c()).d();
    }

    /* renamed from: o.Zx$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8990hD.b {
        private final b a;

        public final b d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.a, ((e) obj).a);
        }

        public int hashCode() {
            b bVar = this.a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            b bVar = this.a;
            return "Data(removeFromPlaylist=" + bVar + ")";
        }

        public e(b bVar) {
            this.a = bVar;
        }
    }

    /* renamed from: o.Zx$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final int a;
        private final Boolean b;
        private final Boolean d;
        private final String e;

        public final int a() {
            return this.a;
        }

        public final Boolean b() {
            return this.d;
        }

        public final Boolean c() {
            return this.b;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && this.a == bVar.a && C8632dsu.c(this.d, bVar.d) && C8632dsu.c(this.b, bVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            int hashCode2 = Integer.hashCode(this.a);
            Boolean bool = this.d;
            int hashCode3 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.b;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            int i = this.a;
            Boolean bool = this.d;
            Boolean bool2 = this.b;
            return "RemoveFromPlaylist(__typename=" + str + ", videoId=" + i + ", isInPlaylist=" + bool + ", isInRemindMeList=" + bool2 + ")";
        }

        public b(String str, int i, Boolean bool, Boolean bool2) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = i;
            this.d = bool;
            this.b = bool2;
        }
    }

    /* renamed from: o.Zx$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
