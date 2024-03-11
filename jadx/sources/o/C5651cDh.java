package o;

import com.netflix.model.leafs.originals.interactive.Moment;

/* renamed from: o.cDh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5651cDh {

    /* renamed from: o.cDh$b */
    /* loaded from: classes4.dex */
    public static final class b extends C5651cDh {
        public static final b e = new b();

        private b() {
        }
    }

    /* renamed from: o.cDh$d */
    /* loaded from: classes4.dex */
    public static final class d extends C5651cDh {
        public static final d a = new d();

        private d() {
        }
    }

    /* renamed from: o.cDh$a */
    /* loaded from: classes4.dex */
    public static final class a extends C5651cDh {
        public static final a a = new a();

        private a() {
        }
    }

    /* renamed from: o.cDh$i */
    /* loaded from: classes4.dex */
    public static final class i extends C5651cDh {
        public static final i b = new i();

        private i() {
        }
    }

    /* renamed from: o.cDh$e */
    /* loaded from: classes4.dex */
    public static final class e extends C5651cDh {
        public static final e b = new e();

        private e() {
        }
    }

    /* renamed from: o.cDh$k */
    /* loaded from: classes4.dex */
    public static final class k extends C5651cDh {
        private final long d;

        public final long b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.d == ((k) obj).d;
        }

        public int hashCode() {
            return Long.hashCode(this.d);
        }

        public String toString() {
            long j = this.d;
            return "InteractiveTimerStart(timerCountdown=" + j + ")";
        }

        public k(long j) {
            this.d = j;
        }
    }

    /* renamed from: o.cDh$g */
    /* loaded from: classes4.dex */
    public static final class g extends C5651cDh {
        public static final g a = new g();

        private g() {
        }
    }

    /* renamed from: o.cDh$m */
    /* loaded from: classes4.dex */
    public static final class m extends C5651cDh {
        private final boolean c;

        public final boolean d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.c == ((m) obj).c;
        }

        public int hashCode() {
            return Boolean.hashCode(this.c);
        }

        public String toString() {
            boolean z = this.c;
            return "InteractiveTriviaResult(triviaPass=" + z + ")";
        }

        public m(boolean z) {
            this.c = z;
        }
    }

    /* renamed from: o.cDh$j */
    /* loaded from: classes4.dex */
    public static final class j extends C5651cDh {
        public static final j b = new j();

        private j() {
        }
    }

    /* renamed from: o.cDh$f */
    /* loaded from: classes4.dex */
    public static final class f extends C5651cDh {
        private final Moment b;

        public final Moment e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && C8632dsu.c(this.b, ((f) obj).b);
        }

        public int hashCode() {
            Moment moment = this.b;
            if (moment == null) {
                return 0;
            }
            return moment.hashCode();
        }

        public String toString() {
            Moment moment = this.b;
            return "InteractiveQuestionUpdate(question=" + moment + ")";
        }

        public f(Moment moment) {
            this.b = moment;
        }
    }

    /* renamed from: o.cDh$h */
    /* loaded from: classes4.dex */
    public static final class h extends C5651cDh {
        private final int d;
        private final String e;

        public final int d() {
            return this.d;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return this.d == hVar.d && C8632dsu.c((Object) this.e, (Object) hVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.d) * 31) + this.e.hashCode();
        }

        public String toString() {
            int i = this.d;
            String str = this.e;
            return "InteractiveMomentVisualStateChanged(index=" + i + ", state=" + str + ")";
        }

        public h(int i, String str) {
            C8632dsu.c((Object) str, "");
            this.d = i;
            this.e = str;
        }
    }

    /* renamed from: o.cDh$c */
    /* loaded from: classes4.dex */
    public static final class c extends C5651cDh {
        private final int e;

        public final int d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.e == ((c) obj).e;
        }

        public int hashCode() {
            return Integer.hashCode(this.e);
        }

        public String toString() {
            int i = this.e;
            return "InteractiveMomentTimerUpdate(timeLeftSeconds=" + i + ")";
        }

        public c(int i) {
            this.e = i;
        }
    }
}
