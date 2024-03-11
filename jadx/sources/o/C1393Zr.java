package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2268acz;
import o.C9018hf;
import o.InterfaceC8990hD;

/* renamed from: o.Zr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1393Zr implements InterfaceC8990hD<b> {
    public static final a d = new a(null);
    private final C3208aud a;
    private final boolean b;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "e4fa3e28-8a0b-44fe-ae45-154cb6e7f47a";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1393Zr) && C8632dsu.c(this.a, ((C1393Zr) obj).a);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "RemoveProfileAccessPin";
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final C3208aud j() {
        return this.a;
    }

    public String toString() {
        C3208aud c3208aud = this.a;
        return "RemoveProfileAccessPinMutation(input=" + c3208aud + ")";
    }

    public C1393Zr(C3208aud c3208aud) {
        C8632dsu.c((Object) c3208aud, "");
        this.a = c3208aud;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2224acH.a.b(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<b> e() {
        return C8953gT.c(C2268acz.d.a, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2828anT.d.a()).d();
    }

    /* renamed from: o.Zr$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8990hD.b {
        private final d d;

        public final d d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.d, ((b) obj).d);
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
            return "Data(removeProfileAccessPin=" + dVar + ")";
        }

        public b(d dVar) {
            this.d = dVar;
        }
    }

    /* renamed from: o.Zr$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final c c;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final c d() {
            return this.c;
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
            c cVar = this.c;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            c cVar = this.c;
            return "RemoveProfileAccessPin(__typename=" + str + ", profile=" + cVar + ")";
        }

        public d(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.c = cVar;
        }
    }

    /* renamed from: o.Zr$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final C2567aiX b;
        private final String d;

        public final String c() {
            return this.d;
        }

        public final C2567aiX e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c(this.b, cVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.d;
            C2567aiX c2567aiX = this.b;
            return "Profile(__typename=" + str + ", userProfile=" + c2567aiX + ")";
        }

        public c(String str, C2567aiX c2567aiX) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2567aiX, "");
            this.d = str;
            this.b = c2567aiX;
        }
    }

    /* renamed from: o.Zr$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }
}
