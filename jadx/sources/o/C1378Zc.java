package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2243aca;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Zc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1378Zc implements InterfaceC8999hM<c> {
    public static final d a = new d(null);
    private final String b;
    private final int c;
    private final C2865aoD d;
    private final C2865aoD e;
    private final int h;
    private final boolean j;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "af9b19a8-1746-4683-9a84-64b949969b74";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1378Zc) {
            C1378Zc c1378Zc = (C1378Zc) obj;
            return this.h == c1378Zc.h && C8632dsu.c(this.d, c1378Zc.d) && C8632dsu.c((Object) this.b, (Object) c1378Zc.b) && this.c == c1378Zc.c && C8632dsu.c(this.e, c1378Zc.e);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "PlayerEpisodeList";
    }

    public final C2865aoD g() {
        return this.e;
    }

    public final int h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.h);
        int hashCode2 = this.d.hashCode();
        String str = this.b;
        return (((((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.c)) * 31) + this.e.hashCode();
    }

    public final C2865aoD i() {
        return this.d;
    }

    public final String j() {
        return this.b;
    }

    public final int n() {
        return this.h;
    }

    public String toString() {
        int i = this.h;
        C2865aoD c2865aoD = this.d;
        String str = this.b;
        int i2 = this.c;
        C2865aoD c2865aoD2 = this.e;
        return "PlayerEpisodeListQuery(videoId=" + i + ", artworkParamsForMdx=" + c2865aoD + ", episodeFromCursor=" + str + ", episodeCount=" + i2 + ", artworkParamsForInterestingSmall=" + c2865aoD2 + ")";
    }

    public C1378Zc(int i, C2865aoD c2865aoD, String str, int i2, C2865aoD c2865aoD2) {
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        this.h = i;
        this.d = c2865aoD;
        this.b = str;
        this.c = i2;
        this.e = c2865aoD2;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2244acb.c.b(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<c> e() {
        return C8953gT.c(C2243aca.c.c, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2815anG.b.c()).d();
    }

    /* renamed from: o.Zc$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8999hM.c {
        private final List<b> e;

        public final List<b> a() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.e, ((c) obj).e);
        }

        public int hashCode() {
            List<b> list = this.e;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<b> list = this.e;
            return "Data(videos=" + list + ")";
        }

        public c(List<b> list) {
            this.e = list;
        }
    }

    /* renamed from: o.Zc$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String b;
        private final C2544aiA c;

        public final String a() {
            return this.b;
        }

        public final C2544aiA b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            C2544aiA c2544aiA = this.c;
            return (hashCode * 31) + (c2544aiA == null ? 0 : c2544aiA.hashCode());
        }

        public String toString() {
            String str = this.b;
            C2544aiA c2544aiA = this.c;
            return "Video(__typename=" + str + ", seasonDetails=" + c2544aiA + ")";
        }

        public b(String str, C2544aiA c2544aiA) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.c = c2544aiA;
        }
    }

    /* renamed from: o.Zc$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
