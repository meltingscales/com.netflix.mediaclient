package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2144aah;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Yd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1346Yd implements InterfaceC8999hM<b> {
    public static final c b = new c(null);
    private final boolean a;
    private final List<Integer> d;
    private final int e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "3d43b9fb-2108-45a0-ad15-a32995dfb7f5";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1346Yd) {
            C1346Yd c1346Yd = (C1346Yd) obj;
            return C8632dsu.c(this.d, c1346Yd.d) && this.e == c1346Yd.e;
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "CollectTasteVideoData";
    }

    public final int g() {
        return this.e;
    }

    public int hashCode() {
        return (this.d.hashCode() * 31) + Integer.hashCode(this.e);
    }

    public final List<Integer> j() {
        return this.d;
    }

    public String toString() {
        List<Integer> list = this.d;
        int i = this.e;
        return "CollectTasteVideoDataQuery(videoIds=" + list + ", imageWidth=" + i + ")";
    }

    public C1346Yd(List<Integer> list, int i) {
        C8632dsu.c((Object) list, "");
        this.d = list;
        this.e = i;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2145aai.b.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<b> e() {
        return C8953gT.c(C2144aah.e.c, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2761amF.a.c()).d();
    }

    /* renamed from: o.Yd$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8999hM.c {
        private final List<e> b;

        public final List<e> e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.b, ((b) obj).b);
        }

        public int hashCode() {
            List<e> list = this.b;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<e> list = this.b;
            return "Data(videos=" + list + ")";
        }

        public b(List<e> list) {
            this.b = list;
        }
    }

    /* renamed from: o.Yd$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final C2272adC a;
        private final String e;

        public final C2272adC b() {
            return this.a;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && C8632dsu.c(this.a, eVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.e;
            C2272adC c2272adC = this.a;
            return "Video(__typename=" + str + ", collectTasteVideoData=" + c2272adC + ")";
        }

        public e(String str, C2272adC c2272adC) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2272adC, "");
            this.e = str;
            this.a = c2272adC;
        }
    }

    /* renamed from: o.Yd$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
