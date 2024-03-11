package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2256acn;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Zk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1386Zk implements InterfaceC8999hM<c> {
    public static final e d = new e(null);
    private final Integer a;
    private final int b;
    private final C2865aoD c;
    private final boolean e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "c95c76ee-90a4-49e9-b2b1-7bb2000e9ed0";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1386Zk) {
            C1386Zk c1386Zk = (C1386Zk) obj;
            return this.b == c1386Zk.b && C8632dsu.c(this.a, c1386Zk.a) && C8632dsu.c(this.c, c1386Zk.c);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "Preplay";
    }

    public final int h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.b);
        Integer num = this.a;
        return (((hashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.c.hashCode();
    }

    public final Integer i() {
        return this.a;
    }

    public final C2865aoD j() {
        return this.c;
    }

    public String toString() {
        int i = this.b;
        Integer num = this.a;
        C2865aoD c2865aoD = this.c;
        return "PreplayQuery(videoId=" + i + ", sectionCount=" + num + ", artworkParamsForMdx=" + c2865aoD + ")";
    }

    public C1386Zk(int i, Integer num, C2865aoD c2865aoD) {
        C8632dsu.c((Object) c2865aoD, "");
        this.b = i;
        this.a = num;
        this.c = c2865aoD;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2253ack.d.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<c> e() {
        return C8953gT.c(C2256acn.d.e, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2822anN.b.c()).d();
    }

    /* renamed from: o.Zk$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8999hM.c {
        private final d d;

        public final d b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.d, ((c) obj).d);
        }

        public int hashCode() {
            d dVar = this.d;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            d dVar = this.d;
            return "Data(pinotPrePlayPage=" + dVar + ")";
        }

        public c(d dVar) {
            this.d = dVar;
        }
    }

    /* renamed from: o.Zk$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final C2584aio c;
        private final String e;

        public final C2584aio b() {
            return this.c;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            C2584aio c2584aio = this.c;
            return (hashCode * 31) + (c2584aio == null ? 0 : c2584aio.hashCode());
        }

        public String toString() {
            String str = this.e;
            C2584aio c2584aio = this.c;
            return "PinotPrePlayPage(__typename=" + str + ", prePlayPageFragment=" + c2584aio + ")";
        }

        public d(String str, C2584aio c2584aio) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.c = c2584aio;
        }
    }

    /* renamed from: o.Zk$e */
    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }
}
