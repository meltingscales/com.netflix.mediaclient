package o;

/* renamed from: o.cBh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5597cBh extends cBA {
    public /* synthetic */ AbstractC5597cBh(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC5597cBh() {
        super(null);
    }

    /* renamed from: o.cBh$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC5597cBh {
        private final boolean a;
        private final AbstractC5531cAw e;

        public final AbstractC5531cAw c() {
            return this.e;
        }

        public final boolean d() {
            return this.a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC5531cAw abstractC5531cAw, boolean z) {
            super(null);
            C8632dsu.c((Object) abstractC5531cAw, "");
            this.e = abstractC5531cAw;
            this.a = z;
        }
    }

    /* renamed from: o.cBh$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC5597cBh {
        public static final d b = new d();

        private d() {
            super(null);
        }
    }
}
