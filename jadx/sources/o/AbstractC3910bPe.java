package o;

import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;

/* renamed from: o.bPe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3910bPe extends C9941zV {

    /* renamed from: o.bPe$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3910bPe {
        private final InterfaceC5185btw a;

        public final InterfaceC5185btw a() {
            return this.a;
        }
    }

    /* renamed from: o.bPe$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3910bPe {
        private final String a;
        private final String b;
        private final VideoType c;
        private final TrackingInfoHolder d;
        private final String e;

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.e;
        }

        public final TrackingInfoHolder d() {
            return this.d;
        }

        public final VideoType e() {
            return this.c;
        }
    }

    public /* synthetic */ AbstractC3910bPe(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC3910bPe() {
    }

    /* renamed from: o.bPe$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3910bPe {
        private final String a;
        private final String c;

        public final String a() {
            return this.c;
        }

        public final String d() {
            return this.a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = str2;
        }
    }

    /* renamed from: o.bPe$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3910bPe {
        private final String c;

        public final String d() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.c = str;
        }
    }

    /* renamed from: o.bPe$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3910bPe {
        private final InterfaceC5185btw e;

        public final InterfaceC5185btw a() {
            return this.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC5185btw interfaceC5185btw) {
            super(null);
            C8632dsu.c((Object) interfaceC5185btw, "");
            this.e = interfaceC5185btw;
        }
    }

    /* renamed from: o.bPe$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3910bPe {
        public static final g b = new g();

        private g() {
            super(null);
        }
    }

    /* renamed from: o.bPe$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3910bPe {
        private final boolean e;

        public final boolean e() {
            return this.e;
        }

        public e(boolean z) {
            super(null);
            this.e = z;
        }
    }

    /* renamed from: o.bPe$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3910bPe {
        private final String a;
        private final String b;
        private final TrackingInfoHolder c;
        private final String d;

        public final TrackingInfoHolder c() {
            return this.c;
        }

        public final String d() {
            return this.a;
        }

        public final String e() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, TrackingInfoHolder trackingInfoHolder, String str3) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            C8632dsu.c((Object) str3, "");
            this.a = str;
            this.b = str2;
            this.c = trackingInfoHolder;
            this.d = str3;
        }
    }

    /* renamed from: o.bPe$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3910bPe {
        private final String c;
        private final int d;

        public final int d() {
            return this.d;
        }

        public final String e() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, int i) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.d = i;
        }
    }

    /* renamed from: o.bPe$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3910bPe {
        public static final j b = new j();

        private j() {
            super(null);
        }
    }
}
