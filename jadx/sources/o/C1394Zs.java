package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2219acC;
import o.C9018hf;
import o.InterfaceC8990hD;

/* renamed from: o.Zs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1394Zs implements InterfaceC8990hD<b> {
    public static final a c = new a(null);
    private final String a;
    private final boolean d;
    private final String e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "af1054e6-ba0b-4cff-9252-a7a9ade1d9cd";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1394Zs) {
            C1394Zs c1394Zs = (C1394Zs) obj;
            return C8632dsu.c((Object) this.a, (Object) c1394Zs.a) && C8632dsu.c((Object) this.e, (Object) c1394Zs.e);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "RemoveFromRemindMe";
    }

    public final String h() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        String str = this.e;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String j() {
        return this.a;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.e;
        return "RemoveFromRemindMeMutation(videoId=" + str + ", trackId=" + str2 + ")";
    }

    public C1394Zs(String str, String str2) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.e = str2;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2217acA.c.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<b> e() {
        return C8953gT.c(C2219acC.d.e, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2827anS.b.b()).d();
    }

    /* renamed from: o.Zs$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8990hD.b {
        private final d e;

        public final d d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.e, ((b) obj).e);
        }

        public int hashCode() {
            d dVar = this.e;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            d dVar = this.e;
            return "Data(removeFromRemindMe=" + dVar + ")";
        }

        public b(d dVar) {
            this.e = dVar;
        }
    }

    /* renamed from: o.Zs$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final int c;
        private final Boolean d;
        private final String e;

        public final Boolean a() {
            return this.d;
        }

        public final int d() {
            return this.c;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && this.c == dVar.c && C8632dsu.c(this.d, dVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            int hashCode2 = Integer.hashCode(this.c);
            Boolean bool = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            String str = this.e;
            int i = this.c;
            Boolean bool = this.d;
            return "RemoveFromRemindMe(__typename=" + str + ", videoId=" + i + ", isInRemindMeList=" + bool + ")";
        }

        public d(String str, int i, Boolean bool) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.c = i;
            this.d = bool;
        }
    }

    /* renamed from: o.Zs$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }
}
