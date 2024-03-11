package o;

import com.netflix.mediaclient.servicemgr.interface_.GameDetails;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: o.daP  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7907daP {
    private final String a;
    private final String b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final VideoType g;
    private final String h;

    public /* synthetic */ AbstractC7907daP(String str, VideoType videoType, String str2, boolean z, boolean z2, String str3, boolean z3, C8627dsp c8627dsp) {
        this(str, videoType, str2, z, z2, str3, z3);
    }

    public final VideoType b() {
        return this.g;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.h;
    }

    public final String e() {
        return this.b;
    }

    public final boolean f() {
        return this.e;
    }

    public final boolean g() {
        return this.c;
    }

    public final boolean h() {
        return this.d;
    }

    private AbstractC7907daP(String str, VideoType videoType, String str2, boolean z, boolean z2, String str3, boolean z3) {
        this.a = str;
        this.g = videoType;
        this.b = str2;
        this.e = z;
        this.c = z2;
        this.h = str3;
        this.d = z3;
    }

    /* renamed from: o.daP$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC7907daP {
        private final InterfaceC8366diy e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.e, ((a) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public final InterfaceC8366diy i() {
            return this.e;
        }

        public String toString() {
            InterfaceC8366diy interfaceC8366diy = this.e;
            return "Video(topNodeVideo=" + interfaceC8366diy + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(o.InterfaceC8366diy r11) {
            /*
                r10 = this;
                java.lang.String r0 = ""
                o.C8632dsu.c(r11, r0)
                java.lang.String r2 = r11.getId()
                o.C8632dsu.a(r2, r0)
                com.netflix.mediaclient.servicemgr.interface_.VideoType r3 = r11.getType()
                o.C8632dsu.a(r3, r0)
                java.lang.String r4 = r11.getTitle()
                o.C8632dsu.a(r4, r0)
                boolean r5 = r11.aq()
                boolean r6 = r11.ap()
                java.lang.String r7 = r11.af()
                boolean r8 = r11.isPlayable()
                r9 = 0
                r1 = r10
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                r10.e = r11
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AbstractC7907daP.a.<init>(o.diy):void");
        }
    }

    /* renamed from: o.daP$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC7907daP {
        private final GameDetails a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.a, ((d) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public final GameDetails i() {
            return this.a;
        }

        public String toString() {
            GameDetails gameDetails = this.a;
            return "Game(topNodeGame=" + gameDetails + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(com.netflix.mediaclient.servicemgr.interface_.GameDetails r11) {
            /*
                r10 = this;
                java.lang.String r0 = ""
                o.C8632dsu.c(r11, r0)
                java.lang.String r2 = r11.getId()
                o.C8632dsu.a(r2, r0)
                com.netflix.mediaclient.servicemgr.interface_.VideoType r3 = r11.getType()
                o.C8632dsu.a(r3, r0)
                java.lang.String r4 = r11.getTitle()
                o.C8632dsu.a(r4, r0)
                boolean r6 = r11.m()
                java.lang.String r7 = r11.G()
                boolean r8 = r11.isPlayable()
                r5 = 0
                r9 = 0
                r1 = r10
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                r10.a = r11
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AbstractC7907daP.d.<init>(com.netflix.mediaclient.servicemgr.interface_.GameDetails):void");
        }
    }

    public final SX a() {
        if (this instanceof d) {
            return C8172dfP.a(((d) this).i());
        }
        if (this instanceof a) {
            return C8172dfP.a(((a) this).i());
        }
        throw new NoWhenBranchMatchedException();
    }
}
