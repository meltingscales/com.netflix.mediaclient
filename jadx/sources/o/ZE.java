package o;

import com.netflix.mediaclient.graphql.models.type.ThumbRating;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2236acT;
import o.C9018hf;
import o.InterfaceC8990hD;

/* loaded from: classes3.dex */
public final class ZE implements InterfaceC8990hD<d> {
    public static final c c = new c(null);
    private final ThumbRating a;
    private final String b;
    private final boolean d;
    private final String e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "28ebb024-ebe0-43e7-a520-2794d8f8c839";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZE) {
            ZE ze = (ZE) obj;
            return C8632dsu.c((Object) this.b, (Object) ze.b) && this.a == ze.a && C8632dsu.c((Object) this.e, (Object) ze.e);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "SetThumbRating";
    }

    public final String h() {
        return this.e;
    }

    public int hashCode() {
        return (((this.b.hashCode() * 31) + this.a.hashCode()) * 31) + this.e.hashCode();
    }

    public final String i() {
        return this.b;
    }

    public final ThumbRating j() {
        return this.a;
    }

    public String toString() {
        String str = this.b;
        ThumbRating thumbRating = this.a;
        String str2 = this.e;
        return "SetThumbRatingMutation(videoId=" + str + ", rating=" + thumbRating + ", trackId=" + str2 + ")";
    }

    public ZE(String str, ThumbRating thumbRating, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) thumbRating, "");
        C8632dsu.c((Object) str2, "");
        this.b = str;
        this.a = thumbRating;
        this.e = str2;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2237acU.a.b(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<d> e() {
        return C8953gT.c(C2236acT.c.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2890aoc.e.b()).d();
    }

    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8990hD.b {
        private final b c;

        public final b d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.c, ((d) obj).c);
        }

        public int hashCode() {
            b bVar = this.c;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            b bVar = this.c;
            return "Data(setThumbRating=" + bVar + ")";
        }

        public d(b bVar) {
            this.c = bVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private final ThumbRating a;
        private final int b;
        private final String c;

        public final ThumbRating a() {
            return this.a;
        }

        public final String b() {
            return this.c;
        }

        public final int c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && this.b == bVar.b && this.a == bVar.a;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = Integer.hashCode(this.b);
            ThumbRating thumbRating = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (thumbRating == null ? 0 : thumbRating.hashCode());
        }

        public String toString() {
            String str = this.c;
            int i = this.b;
            ThumbRating thumbRating = this.a;
            return "SetThumbRating(__typename=" + str + ", videoId=" + i + ", thumbRatingV2=" + thumbRating + ")";
        }

        public b(String str, int i, ThumbRating thumbRating) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.b = i;
            this.a = thumbRating;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
