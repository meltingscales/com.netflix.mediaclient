package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2201abl;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class YJ implements InterfaceC8999hM<e> {
    public static final d c = new d(null);
    private final int a;
    private final boolean d;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "a6641ffe-69d2-42a2-9500-c8c5049259a7";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof YJ) && this.a == ((YJ) obj).a;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "LiveWaitingRoomMessage";
    }

    public final int h() {
        return this.a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        int i = this.a;
        return "LiveWaitingRoomMessageQuery(videoId=" + i + ")";
    }

    public YJ(int i) {
        this.a = i;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2199abj.b.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(C2201abl.c.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2844anj.a.b()).d();
    }

    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8999hM.c {
        private final List<c> b;

        public final List<c> b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.b, ((e) obj).b);
        }

        public int hashCode() {
            List<c> list = this.b;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<c> list = this.b;
            return "Data(videos=" + list + ")";
        }

        public e(List<c> list) {
            this.b = list;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private final int b;
        private final a d;
        private final String e;

        public final a a() {
            return this.d;
        }

        public final String c() {
            return this.e;
        }

        public final int e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.e, (Object) cVar.e) && this.b == cVar.b && C8632dsu.c(this.d, cVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            int hashCode2 = Integer.hashCode(this.b);
            a aVar = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            int i = this.b;
            a aVar = this.d;
            return "Video(__typename=" + str + ", videoId=" + i + ", onLiveEventViewable=" + aVar + ")";
        }

        public c(String str, int i, a aVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = i;
            this.d = aVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final b d;

        public final b a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.d, ((a) obj).d);
        }

        public int hashCode() {
            b bVar = this.d;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            b bVar = this.d;
            return "OnLiveEventViewable(liveEvent=" + bVar + ")";
        }

        public a(b bVar) {
            this.d = bVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private final String c;
        private final String e;

        public final String b() {
            return this.c;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c((Object) this.e, (Object) bVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.e;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.c;
            String str2 = this.e;
            return "LiveEvent(__typename=" + str + ", waitingRoomMessage=" + str2 + ")";
        }

        public b(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.e = str2;
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
