package o;

import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.collecttaste.api.CollectTaste;

/* loaded from: classes4.dex */
public abstract class bSJ extends C9941zV {
    public /* synthetic */ bSJ(C8627dsp c8627dsp) {
        this();
    }

    private bSJ() {
    }

    /* loaded from: classes4.dex */
    public static final class h extends bSJ {
        private final int c;

        public h() {
            this(0, 1, null);
        }

        public final int c() {
            return this.c;
        }

        public /* synthetic */ h(int i, int i2, C8627dsp c8627dsp) {
            this((i2 & 1) != 0 ? 0 : i);
        }

        public h(int i) {
            super(null);
            this.c = i;
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends bSJ {
        private final LoMo c;
        private final int e;

        public final LoMo d() {
            return this.c;
        }

        public final int e() {
            return this.e;
        }

        public /* synthetic */ j(LoMo loMo, int i, int i2, C8627dsp c8627dsp) {
            this(loMo, (i2 & 2) != 0 ? 0 : i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(LoMo loMo, int i) {
            super(null);
            C8632dsu.c((Object) loMo, "");
            this.c = loMo;
            this.e = i;
        }
    }

    /* loaded from: classes4.dex */
    public static final class n extends bSJ {
        private final LoMo a;
        private final int b;

        public n() {
            this(null, 0, 3, null);
        }

        public final LoMo b() {
            return this.a;
        }

        public final int e() {
            return this.b;
        }

        public /* synthetic */ n(LoMo loMo, int i, int i2, C8627dsp c8627dsp) {
            this((i2 & 1) != 0 ? null : loMo, (i2 & 2) != 0 ? 0 : i);
        }

        public n(LoMo loMo, int i) {
            super(null);
            this.a = loMo;
            this.b = i;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a extends bSJ {
        private final int a;

        public final int d() {
            return this.a;
        }

        public a(int i) {
            super(null);
            this.a = i;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends bSJ {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends bSJ {
        public static final g a = new g();

        private g() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends bSJ {
        public static final f d = new f();

        private f() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends bSJ {
        private final CollectTaste.MessageType b;

        public final CollectTaste.MessageType b() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CollectTaste.MessageType messageType) {
            super(null);
            C8632dsu.c((Object) messageType, "");
            this.b = messageType;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends bSJ {
        private final LoMo d;

        public final LoMo c() {
            return this.d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(LoMo loMo) {
            super(null);
            C8632dsu.c((Object) loMo, "");
            this.d = loMo;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends bSJ {
        private final String a;
        private final String b;
        private final boolean c;

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final boolean c() {
            return this.c;
        }

        public /* synthetic */ b(boolean z, String str, String str2, int i, C8627dsp c8627dsp) {
            this(z, str, (i & 4) != 0 ? null : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, String str, String str2) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.c = z;
            this.a = str;
            this.b = str2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends bSJ {
        private final String a;

        public final String e() {
            return this.a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.a = str;
        }
    }

    /* loaded from: classes4.dex */
    public static final class o extends bSJ {
        private final int b;

        public final int c() {
            return this.b;
        }

        public o(int i) {
            super(null);
            this.b = i;
        }
    }
}
