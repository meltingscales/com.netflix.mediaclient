package o;

import o.dpR;

/* renamed from: o.Lk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1017Lk {
    public static final int a = 0;

    public /* synthetic */ AbstractC1017Lk(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC1017Lk() {
    }

    /* renamed from: o.Lk$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC1017Lk {
        public static final int c = 0;
        private final drO<dpR> e;

        public b() {
            this(null, 1, null);
        }

        public final drO<dpR> a() {
            return this.e;
        }

        public /* synthetic */ b(drO dro, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? new drO<dpR>() { // from class: com.netflix.hawkins.consumer.component.toast.HawkinsToastAction$Dismiss$1
                public final void a() {
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    a();
                    return dpR.c;
                }
            } : dro);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(drO<dpR> dro) {
            super(null);
            C8632dsu.c((Object) dro, "");
            this.e = dro;
        }
    }

    /* renamed from: o.Lk$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC1017Lk {
        public static final int b = 0;
        private final drO<dpR> d;

        public d() {
            this(null, 1, null);
        }

        public /* synthetic */ d(drO dro, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? new drO<dpR>() { // from class: com.netflix.hawkins.consumer.component.toast.HawkinsToastAction$None$1
                public final void b() {
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    b();
                    return dpR.c;
                }
            } : dro);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(drO<dpR> dro) {
            super(null);
            C8632dsu.c((Object) dro, "");
            this.d = dro;
        }
    }

    /* renamed from: o.Lk$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC1017Lk {
        public static final int d = 0;
        private final drO<dpR> c;
        private final String e;

        public final String d() {
            return this.e;
        }

        public final drO<dpR> e() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, drO<dpR> dro) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) dro, "");
            this.e = str;
            this.c = dro;
        }
    }
}
