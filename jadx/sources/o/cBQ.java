package o;

import com.netflix.mediaclient.ui.player.v2.SkipCreditsType;
import com.netflix.mediaclient.ui.player.v2.interactive.MomentState;
import com.netflix.model.leafs.originals.interactive.ImpressionData;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.TransitionType;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class cBQ extends cBO {
    public /* synthetic */ cBQ(C8627dsp c8627dsp) {
        this();
    }

    private cBQ() {
        super(null);
    }

    /* loaded from: classes4.dex */
    public static final class f extends cBQ {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends cBQ {
        private final SkipCreditsType d;

        public final SkipCreditsType b() {
            return this.d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(SkipCreditsType skipCreditsType) {
            super(null);
            C8632dsu.c((Object) skipCreditsType, "");
            this.d = skipCreditsType;
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends cBQ {
        public static final i c = new i();

        private i() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends cBQ {
        public static final c b = new c(null);
        private final int a;
        private final String c;

        public final String c() {
            return this.c;
        }

        public final int e() {
            return this.a;
        }

        /* loaded from: classes4.dex */
        public static final class c {
            public /* synthetic */ c(C8627dsp c8627dsp) {
                this();
            }

            private c() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, int i) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.a = i;
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends cBQ {
        public static final g e = new g();

        private g() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class a extends cBQ {
        public static final a d = new a();

        private a() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class q extends cBQ {
        private final int a;
        private final int b;
        private final int c;
        private final int e;

        public q() {
            this(0, 0, 0, 0, 15, null);
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.c;
        }

        public final int c() {
            return this.a;
        }

        public final int d() {
            return this.e;
        }

        public /* synthetic */ q(int i, int i2, int i3, int i4, int i5, C8627dsp c8627dsp) {
            this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
        }

        public q(int i, int i2, int i3, int i4) {
            super(null);
            this.a = i;
            this.e = i2;
            this.c = i3;
            this.b = i4;
        }
    }

    /* loaded from: classes4.dex */
    public static final class t extends cBQ {
        private final aJY c;

        public final aJY c() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(aJY ajy) {
            super(null);
            C8632dsu.c((Object) ajy, "");
            this.c = ajy;
        }
    }

    /* loaded from: classes4.dex */
    public static final class p extends cBQ {
        private final MomentState c;
        private final Moment d;

        public final MomentState c() {
            return this.c;
        }

        public final Moment d() {
            return this.d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(MomentState momentState, Moment moment) {
            super(null);
            C8632dsu.c((Object) momentState, "");
            C8632dsu.c((Object) moment, "");
            this.c = momentState;
            this.d = moment;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends cBQ {
        private final String a;
        private final ImpressionData b;
        private final String c;
        private final String d;
        private final Moment e;
        private final TransitionType g;
        private final boolean h;

        public final String a() {
            return this.a;
        }

        public final Moment b() {
            return this.e;
        }

        public final ImpressionData c() {
            return this.b;
        }

        public final String d() {
            return this.c;
        }

        public final String e() {
            return this.d;
        }

        public final TransitionType f() {
            return this.g;
        }

        public final boolean h() {
            return this.h;
        }

        public b(Moment moment, String str, String str2, boolean z, ImpressionData impressionData, String str3, TransitionType transitionType) {
            super(null);
            this.e = moment;
            this.c = str;
            this.d = str2;
            this.h = z;
            this.b = impressionData;
            this.a = str3;
            this.g = transitionType;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends cBQ {
        private final String a;
        private final Moment b;
        private final ImpressionData c;
        private final boolean d;
        private final String e;
        private final boolean f;
        private final long h;

        public final String a() {
            return this.e;
        }

        public final String b() {
            return this.a;
        }

        public final ImpressionData c() {
            return this.c;
        }

        public final Moment d() {
            return this.b;
        }

        public final boolean e() {
            return this.d;
        }

        public final boolean f() {
            return this.f;
        }

        public final long i() {
            return this.h;
        }

        public e(Moment moment, String str, String str2, boolean z, ImpressionData impressionData, long j, boolean z2) {
            super(null);
            this.b = moment;
            this.e = str;
            this.a = str2;
            this.d = z;
            this.c = impressionData;
            this.h = j;
            this.f = z2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends cBQ {
        private final long a;
        private final String b;
        private final String c;
        private final Moment d;
        private final String e;
        private final boolean f;
        private final String g;
        private final String h;
        private final Integer j;

        public final String a() {
            return this.b;
        }

        public final Moment b() {
            return this.d;
        }

        public final long c() {
            return this.a;
        }

        public final String d() {
            return this.c;
        }

        public final String e() {
            return this.e;
        }

        public final String g() {
            return this.g;
        }

        public final Integer h() {
            return this.j;
        }

        public final boolean j() {
            return this.f;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Moment moment, String str, String str2, Integer num, String str3, boolean z, long j, String str4, String str5) {
            super(null);
            C8632dsu.c((Object) str2, "");
            this.d = moment;
            this.c = str;
            this.g = str2;
            this.j = num;
            this.e = str3;
            this.f = z;
            this.a = j;
            this.b = str4;
            this.h = str5;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends cBQ {
        private final String a;
        private final List<String> b;
        private final long c;
        private final StateHistory d;
        private final String e;

        public final String a() {
            return this.a;
        }

        public final List<String> b() {
            return this.b;
        }

        public final StateHistory c() {
            return this.d;
        }

        public final String d() {
            return this.e;
        }

        public final long e() {
            return this.c;
        }

        public /* synthetic */ d(String str, long j, String str2, List list, StateHistory stateHistory, int i, C8627dsp c8627dsp) {
            this(str, j, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : stateHistory);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, long j, String str2, List<String> list, StateHistory stateHistory) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = j;
            this.e = str2;
            this.b = list;
            this.d = stateHistory;
        }
    }

    /* loaded from: classes4.dex */
    public static final class r extends cBQ {
        private final ImpressionData d;

        public final ImpressionData a() {
            return this.d;
        }

        public r(ImpressionData impressionData) {
            super(null);
            this.d = impressionData;
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends cBQ {
        public static final l d = new l();

        private l() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class o extends cBQ {
        public static final o b = new o();

        private o() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends cBQ {
        public static final m e = new m();

        private m() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class s extends cBQ {
        private final int c;
        private final boolean d;

        public final boolean c() {
            return this.d;
        }

        public final int d() {
            return this.c;
        }

        public s(boolean z, int i) {
            super(null);
            this.d = z;
            this.c = i;
        }
    }

    /* loaded from: classes4.dex */
    public static final class n extends cBQ {
        public static final n c = new n();

        private n() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends cBQ {
        public static final k e = new k();

        private k() {
            super(null);
        }
    }
}
