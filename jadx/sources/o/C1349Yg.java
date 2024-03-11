package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2150aan;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Yg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1349Yg implements InterfaceC8999hM<a> {
    public static final c a = new c(null);
    private final int b;
    private final boolean c;
    private final C2952apl d;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "34d9ab29-f542-48fd-bcd5-3b3bcff86587";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1349Yg) {
            C1349Yg c1349Yg = (C1349Yg) obj;
            return this.b == c1349Yg.b && C8632dsu.c(this.d, c1349Yg.d);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "CommanderPlaybackData";
    }

    public int hashCode() {
        return (Integer.hashCode(this.b) * 31) + this.d.hashCode();
    }

    public final int i() {
        return this.b;
    }

    public final C2952apl j() {
        return this.d;
    }

    public String toString() {
        int i = this.b;
        C2952apl c2952apl = this.d;
        return "CommanderPlaybackDataQuery(videoId=" + i + ", horizontalArtFeatures=" + c2952apl + ")";
    }

    public C1349Yg(int i, C2952apl c2952apl) {
        C8632dsu.c((Object) c2952apl, "");
        this.b = i;
        this.d = c2952apl;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2149aam.b.a(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<a> e() {
        return C8953gT.c(C2150aan.a.e, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2768amM.e.d()).d();
    }

    /* renamed from: o.Yg$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8999hM.c {
        private final List<d> e;

        public final List<d> c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.e, ((a) obj).e);
        }

        public int hashCode() {
            List<d> list = this.e;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<d> list = this.e;
            return "Data(videos=" + list + ")";
        }

        public a(List<d> list) {
            this.e = list;
        }
    }

    /* renamed from: o.Yg$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final C2279adJ a;
        private final String d;

        public final C2279adJ a() {
            return this.a;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c(this.a, dVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.d;
            C2279adJ c2279adJ = this.a;
            return "Video(__typename=" + str + ", commanderPlaybackData=" + c2279adJ + ")";
        }

        public d(String str, C2279adJ c2279adJ) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2279adJ, "");
            this.d = str;
            this.a = c2279adJ;
        }
    }

    /* renamed from: o.Yg$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
