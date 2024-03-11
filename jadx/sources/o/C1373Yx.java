package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2130aaT;
import o.C9018hf;
import o.InterfaceC8990hD;

/* renamed from: o.Yx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1373Yx implements InterfaceC8990hD<e> {
    public static final b d = new b(null);
    private final String a;
    private final boolean b;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "e6666e07-9a3b-4a5c-b934-c65a91aec0a0";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1373Yx) && C8632dsu.c((Object) this.a, (Object) ((C1373Yx) obj).a);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "HideFromWatchHistory";
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final String j() {
        return this.a;
    }

    public String toString() {
        String str = this.a;
        return "HideFromWatchHistoryMutation(videoId=" + str + ")";
    }

    public C1373Yx(String str) {
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
        C2131aaU.a.e(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(C2130aaT.e.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2836anb.e.a()).d();
    }

    /* renamed from: o.Yx$e */
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
            return "Data(hideTitleViewing=" + dVar + ")";
        }

        public e(d dVar) {
            this.c = dVar;
        }
    }

    /* renamed from: o.Yx$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final boolean b;
        private final String e;

        public final String d() {
            return this.e;
        }

        public final boolean e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && this.b == dVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            String str = this.e;
            boolean z = this.b;
            return "HideTitleViewing(__typename=" + str + ", result=" + z + ")";
        }

        public d(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = z;
        }
    }

    /* renamed from: o.Yx$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
