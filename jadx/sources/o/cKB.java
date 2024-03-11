package o;

import com.netflix.mediaclient.ui.profilelock.api.PinVerifySource;
import o.C1393Zr;
import o.C1397Zv;

/* loaded from: classes4.dex */
public abstract class cKB extends C9941zV {
    public /* synthetic */ cKB(C8627dsp c8627dsp) {
        this();
    }

    private cKB() {
    }

    /* loaded from: classes4.dex */
    public static final class a extends cKB {
        private final boolean e;

        public final boolean e() {
            return this.e;
        }

        public a(boolean z) {
            super(null);
            this.e = z;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends cKB {
        private final C1397Zv.b d;

        public final C1397Zv.b d() {
            return this.d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1397Zv.b bVar) {
            super(null);
            C8632dsu.c((Object) bVar, "");
            this.d = bVar;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends cKB {
        private final C1393Zr.c c;

        public final C1393Zr.c a() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1393Zr.c cVar) {
            super(null);
            C8632dsu.c((Object) cVar, "");
            this.c = cVar;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends cKB {
        private final PinVerifySource b;

        public final PinVerifySource a() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PinVerifySource pinVerifySource) {
            super(null);
            C8632dsu.c((Object) pinVerifySource, "");
            this.b = pinVerifySource;
        }
    }
}
