package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2125aaO;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class YA implements InterfaceC8999hM<c> {
    public static final e b = new e(null);
    private final List<Integer> a;
    private final boolean c;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "f38601cd-9aef-4dfc-b672-6cd40a4d9f1a";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof YA) && C8632dsu.c(this.a, ((YA) obj).a);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "GamesInQueue";
    }

    public final List<Integer> g() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        List<Integer> list = this.a;
        return "GamesInQueueQuery(gameIds=" + list + ")";
    }

    public YA(List<Integer> list) {
        C8632dsu.c((Object) list, "");
        this.a = list;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2132aaV.c.e(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<c> e() {
        return C8953gT.c(C2125aaO.a.e, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2781amZ.a.d()).d();
    }

    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8999hM.c {
        private final List<a> d;

        public final List<a> e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.d, ((c) obj).d);
        }

        public int hashCode() {
            List<a> list = this.d;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<a> list = this.d;
            return "Data(games=" + list + ")";
        }

        public c(List<a> list) {
            this.d = list;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final C2339aeQ c;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final C2339aeQ c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c(this.c, aVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.e;
            C2339aeQ c2339aeQ = this.c;
            return "Game(__typename=" + str + ", gameInQueue=" + c2339aeQ + ")";
        }

        public a(String str, C2339aeQ c2339aeQ) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2339aeQ, "");
            this.e = str;
            this.c = c2339aeQ;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }
}
