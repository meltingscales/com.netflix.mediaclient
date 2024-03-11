package o;

/* renamed from: o.bMc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3827bMc {
    public /* synthetic */ AbstractC3827bMc(C8627dsp c8627dsp) {
        this();
    }

    /* renamed from: o.bMc$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3827bMc {
        public static final j c = new j();

        private j() {
            super(null);
        }
    }

    private AbstractC3827bMc() {
    }

    /* renamed from: o.bMc$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3827bMc {
        public static final a b = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: o.bMc$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3827bMc {
        public static final b e = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: o.bMc$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3827bMc {
        public static final e e = new e();

        private e() {
            super(null);
        }
    }

    /* renamed from: o.bMc$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3827bMc {
        public static final d b = new d();

        private d() {
            super(null);
        }
    }

    /* renamed from: o.bMc$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3827bMc {
        private final boolean c;
        private final boolean e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.e == cVar.e && this.c == cVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.e) * 31) + Boolean.hashCode(this.c);
        }

        public String toString() {
            boolean z = this.e;
            boolean z2 = this.c;
            return "ChromeBecomeNotVisible(inPausedState=" + z + ", inPlaybackSession=" + z2 + ")";
        }

        public c(boolean z, boolean z2) {
            super(null);
            this.e = z;
            this.c = z2;
        }
    }
}
