package o;

import com.netflix.model.leafs.originals.interactive.Choice;

/* renamed from: o.cDg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5650cDg {

    /* renamed from: o.cDg$c */
    /* loaded from: classes4.dex */
    public static final class c extends C5650cDg {
        public static final c c = new c();

        private c() {
        }
    }

    /* renamed from: o.cDg$d */
    /* loaded from: classes4.dex */
    public static final class d extends C5650cDg {
        public static final d d = new d();

        private d() {
        }
    }

    /* renamed from: o.cDg$b */
    /* loaded from: classes4.dex */
    public static final class b extends C5650cDg {
        private final int b;

        public final int a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public int hashCode() {
            return Integer.hashCode(this.b);
        }

        public String toString() {
            int i = this.b;
            return "InteractiveTimerCountdown(timeLeftSeconds=" + i + ")";
        }

        public b(int i) {
            this.b = i;
        }
    }

    /* renamed from: o.cDg$a */
    /* loaded from: classes4.dex */
    public static final class a extends C5650cDg {
        private final String a;
        private final int e;

        public final String d() {
            return this.a;
        }

        public final int e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.e == aVar.e && C8632dsu.c((Object) this.a, (Object) aVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.e) * 31) + this.a.hashCode();
        }

        public String toString() {
            int i = this.e;
            String str = this.a;
            return "InteractiveElementStateChanged(choiceIndex=" + i + ", state=" + str + ")";
        }

        public a(int i, String str) {
            C8632dsu.c((Object) str, "");
            this.e = i;
            this.a = str;
        }
    }

    /* renamed from: o.cDg$e */
    /* loaded from: classes4.dex */
    public static final class e extends C5650cDg {
        private final int a;
        private final Choice b;

        public final int b() {
            return this.a;
        }

        public final Choice c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return this.a == eVar.a && C8632dsu.c(this.b, eVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.a) * 31) + this.b.hashCode();
        }

        public String toString() {
            int i = this.a;
            Choice choice = this.b;
            return "InteractiveElementSelection(choiceIndex=" + i + ", choiceDetail=" + choice + ")";
        }

        public e(int i, Choice choice) {
            C8632dsu.c((Object) choice, "");
            this.a = i;
            this.b = choice;
        }
    }

    /* renamed from: o.cDg$h */
    /* loaded from: classes4.dex */
    public static final class h extends C5650cDg {
        private final String a;

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && C8632dsu.c((Object) this.a, (Object) ((h) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "Share(message=" + str + ")";
        }

        public h(String str) {
            C8632dsu.c((Object) str, "");
            this.a = str;
        }
    }

    /* renamed from: o.cDg$i */
    /* loaded from: classes4.dex */
    public static final class i extends C5650cDg {
        private final String b;

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && C8632dsu.c((Object) this.b, (Object) ((i) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            String str = this.b;
            return "PlayAudio(audio=" + str + ")";
        }

        public i(String str) {
            C8632dsu.c((Object) str, "");
            this.b = str;
        }
    }
}
