package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2160aax;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Yk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1353Yk implements InterfaceC8999hM<a> {
    public static final b a = new b(null);
    private final List<Integer> c;
    private final C2865aoD d;
    private final boolean e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "ef27797b-e1e8-4a04-aca3-23663f2afd2e";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1353Yk) {
            C1353Yk c1353Yk = (C1353Yk) obj;
            return C8632dsu.c(this.c, c1353Yk.c) && C8632dsu.c(this.d, c1353Yk.d);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "DpLiteVideoDetails";
    }

    public final C2865aoD h() {
        return this.d;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + this.d.hashCode();
    }

    public final List<Integer> j() {
        return this.c;
    }

    public String toString() {
        List<Integer> list = this.c;
        C2865aoD c2865aoD = this.d;
        return "DpLiteVideoDetailsQuery(videoIds=" + list + ", imageParamsForBoxart=" + c2865aoD + ")";
    }

    public C1353Yk(List<Integer> list, C2865aoD c2865aoD) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) c2865aoD, "");
        this.c = list;
        this.d = c2865aoD;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2156aat.d.d(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<a> e() {
        return C8953gT.c(C2160aax.d.c, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2774amS.a.e()).d();
    }

    /* renamed from: o.Yk$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8999hM.c {
        private final List<e> d;

        public final List<e> c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.d, ((a) obj).d);
        }

        public int hashCode() {
            List<e> list = this.d;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<e> list = this.d;
            return "Data(videos=" + list + ")";
        }

        public a(List<e> list) {
            this.d = list;
        }
    }

    /* renamed from: o.Yk$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String c;
        private final C2357aei e;

        public final C2357aei b() {
            return this.e;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.c;
            C2357aei c2357aei = this.e;
            return "Video(__typename=" + str + ", dpLiteVideoDetails=" + c2357aei + ")";
        }

        public e(String str, C2357aei c2357aei) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2357aei, "");
            this.c = str;
            this.e = c2357aei;
        }
    }

    /* renamed from: o.Yk$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
