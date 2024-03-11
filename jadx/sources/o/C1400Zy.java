package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2226acJ;
import o.C9018hf;
import o.InterfaceC8990hD;

/* renamed from: o.Zy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1400Zy implements InterfaceC8990hD<c> {
    public static final e d = new e(null);
    private final C3381axs a;
    private final boolean e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "29ae9be2-1d6f-40aa-bfce-1ad6646c04ef";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1400Zy) && C8632dsu.c(this.a, ((C1400Zy) obj).a);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "RemoveVideoFromRemindMe";
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final C3381axs j() {
        return this.a;
    }

    public String toString() {
        C3381axs c3381axs = this.a;
        return "RemoveVideoFromRemindMeMutation(input=" + c3381axs + ")";
    }

    public C1400Zy(C3381axs c3381axs) {
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
        C2227acK.d.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<c> e() {
        return C8953gT.c(C2226acJ.d.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2834anZ.c.d()).d();
    }

    /* renamed from: o.Zy$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8990hD.b {
        private final d a;

        public final d a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            d dVar = this.a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            d dVar = this.a;
            return "Data(removeFromRemindMe=" + dVar + ")";
        }

        public c(d dVar) {
            this.a = dVar;
        }
    }

    /* renamed from: o.Zy$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final Boolean a;
        private final Boolean c;
        private final String d;
        private final int e;

        public final Boolean a() {
            return this.c;
        }

        public final Boolean c() {
            return this.a;
        }

        public final int d() {
            return this.e;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.d, (Object) dVar.d) && this.e == dVar.e && C8632dsu.c(this.a, dVar.a) && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = Integer.hashCode(this.e);
            Boolean bool = this.a;
            int hashCode3 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.c;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            int i = this.e;
            Boolean bool = this.a;
            Boolean bool2 = this.c;
            return "RemoveFromRemindMe(__typename=" + str + ", videoId=" + i + ", isInPlaylist=" + bool + ", isInRemindMeList=" + bool2 + ")";
        }

        public d(String str, int i, Boolean bool, Boolean bool2) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = i;
            this.a = bool;
            this.c = bool2;
        }
    }

    /* renamed from: o.Zy$e */
    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }
}
