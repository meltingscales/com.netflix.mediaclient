package o;

import com.netflix.mediaclient.android.app.Status;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class bDW {
    public /* synthetic */ bDW(C8627dsp c8627dsp) {
        this();
    }

    /* loaded from: classes4.dex */
    public static final class j extends bDW {
        private final InterfaceC5198buI c;
        private final Status d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC5198buI interfaceC5198buI, Status status) {
            super(null);
            C8632dsu.c((Object) interfaceC5198buI, "");
            C8632dsu.c((Object) status, "");
            this.c = interfaceC5198buI;
            this.d = status;
        }
    }

    private bDW() {
    }

    /* loaded from: classes4.dex */
    public static final class e extends bDW {
        private final List<InterfaceC5195buF> c;
        private final int d;

        public final int a() {
            return this.d;
        }

        public final List<InterfaceC5195buF> d() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(int i, List<? extends InterfaceC5195buF> list) {
            super(null);
            C8632dsu.c((Object) list, "");
            this.d = i;
            this.c = list;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a extends bDW {
        private final List<InterfaceC5195buF> c;
        private final Status e;

        public final List<InterfaceC5195buF> b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends InterfaceC5195buF> list, Status status) {
            super(null);
            C8632dsu.c((Object) status, "");
            this.c = list;
            this.e = status;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends bDW {
        private final int a;
        private final List<InterfaceC5227bul> b;
        private final Status c;
        private final long d;
        private final int e;

        public final Status a() {
            return this.c;
        }

        public final List<InterfaceC5227bul> b() {
            return this.b;
        }

        public final long c() {
            return this.d;
        }

        public final int d() {
            return this.e;
        }

        public final int e() {
            return this.a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<InterfaceC5227bul> list, Status status, long j, int i, int i2) {
            super(null);
            C8632dsu.c((Object) status, "");
            this.b = list;
            this.c = status;
            this.d = j;
            this.a = i;
            this.e = i2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends bDW {
        private final InterfaceC5227bul a;
        private final Status b;

        public final InterfaceC5227bul b() {
            return this.a;
        }

        public final Status d() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC5227bul interfaceC5227bul, Status status) {
            super(null);
            C8632dsu.c((Object) status, "");
            this.a = interfaceC5227bul;
            this.b = status;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends bDW {
        private final Status a;

        public final Status c() {
            return this.a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Status status) {
            super(null);
            C8632dsu.c((Object) status, "");
            this.a = status;
        }
    }
}
