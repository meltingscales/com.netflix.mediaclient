package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C9018hf;
import o.InterfaceC8990hD;
import o.ZV;

/* loaded from: classes3.dex */
public final class XT implements InterfaceC8990hD<c> {
    public static final d c = new d(null);
    private final boolean a;
    private final C3381axs d;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "a74b2720-0a7f-4f43-bec1-dbae0930680f";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof XT) && C8632dsu.c(this.d, ((XT) obj).d);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "AddVideoToMyList";
    }

    public final C3381axs h() {
        return this.d;
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        C3381axs c3381axs = this.d;
        return "AddVideoToMyListMutation(input=" + c3381axs + ")";
    }

    public XT(C3381axs c3381axs) {
        C8632dsu.c((Object) c3381axs, "");
        this.d = c3381axs;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        ZU.a.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<c> e() {
        return C8953gT.c(ZV.d.c, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2807amz.d.b()).d();
    }

    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8990hD.b {
        private final a c;

        public final a e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.c, ((c) obj).c);
        }

        public int hashCode() {
            a aVar = this.c;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            a aVar = this.c;
            return "Data(addToPlaylist=" + aVar + ")";
        }

        public c(a aVar) {
            this.c = aVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final int a;
        private final Boolean c;
        private final String d;
        private final Boolean e;

        public final Boolean b() {
            return this.e;
        }

        public final String c() {
            return this.d;
        }

        public final Boolean d() {
            return this.c;
        }

        public final int e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && this.a == aVar.a && C8632dsu.c(this.c, aVar.c) && C8632dsu.c(this.e, aVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = Integer.hashCode(this.a);
            Boolean bool = this.c;
            int hashCode3 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.e;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            int i = this.a;
            Boolean bool = this.c;
            Boolean bool2 = this.e;
            return "AddToPlaylist(__typename=" + str + ", videoId=" + i + ", isInPlaylist=" + bool + ", isInRemindMeList=" + bool2 + ")";
        }

        public a(String str, int i, Boolean bool, Boolean bool2) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.a = i;
            this.c = bool;
            this.e = bool2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
