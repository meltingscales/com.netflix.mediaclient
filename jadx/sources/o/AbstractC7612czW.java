package o;

import com.netflix.mediaclient.util.PlayContext;

/* renamed from: o.czW  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7612czW {
    public /* synthetic */ AbstractC7612czW(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC7612czW() {
    }

    /* renamed from: o.czW$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC7612czW {
        public static final b d = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: o.czW$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC7612czW {
        private final PlayContext a;
        private final long b;
        private final boolean c;
        private final boolean d;
        private final String e;
        private final C7631czp f;

        public final boolean a() {
            return this.d;
        }

        public final C7631czp b() {
            return this.f;
        }

        public final PlayContext c() {
            return this.a;
        }

        public final String d() {
            return this.e;
        }

        public final long e() {
            return this.b;
        }

        public final boolean i() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z, String str, PlayContext playContext, long j, C7631czp c7631czp, boolean z2) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) playContext, "");
            C8632dsu.c((Object) c7631czp, "");
            this.c = z;
            this.e = str;
            this.a = playContext;
            this.b = j;
            this.f = c7631czp;
            this.d = z2;
        }
    }

    /* renamed from: o.czW$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC7612czW {
        public static final a b = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: o.czW$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC7612czW {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }
}
