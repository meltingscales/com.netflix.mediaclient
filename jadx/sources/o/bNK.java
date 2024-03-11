package o;

import android.app.Activity;

/* loaded from: classes4.dex */
public interface bNK {
    public static final e c = e.a;

    String a();

    String c();

    String d();

    Activity e();

    /* loaded from: classes4.dex */
    public static final class b implements bNK {
        private final Activity a;
        private final String b;
        private final String d;
        private final String e;

        @Override // o.bNK
        public String a() {
            return this.e;
        }

        @Override // o.bNK
        public String c() {
            return this.d;
        }

        @Override // o.bNK
        public String d() {
            return this.b;
        }

        @Override // o.bNK
        public Activity e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c(this.a, bVar.a) && C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c((Object) this.e, (Object) bVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.d;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = this.b.hashCode();
            String str2 = this.e;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            Activity activity = this.a;
            String str = this.d;
            String str2 = this.b;
            String str3 = this.e;
            return "Install(activity=" + activity + ", packageName=" + str + ", sharedUuid=" + str2 + ", customPlayStoreUrl=" + str3 + ")";
        }

        public b(Activity activity, String str, String str2, String str3) {
            C8632dsu.c((Object) activity, "");
            C8632dsu.c((Object) str2, "");
            this.a = activity;
            this.d = str;
            this.b = str2;
            this.e = str3;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements bNK {
        private final String a;
        private final Activity b;
        private final String d;
        private final String e;
        private final String h;

        @Override // o.bNK
        public String a() {
            return this.a;
        }

        public final String b() {
            return this.d;
        }

        @Override // o.bNK
        public String c() {
            return this.e;
        }

        @Override // o.bNK
        public String d() {
            return this.h;
        }

        @Override // o.bNK
        public Activity e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.b, dVar.b) && C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c((Object) this.h, (Object) dVar.h) && C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c((Object) this.d, (Object) dVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.e;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = this.h.hashCode();
            String str2 = this.a;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.d.hashCode();
        }

        public String toString() {
            Activity activity = this.b;
            String str = this.e;
            String str2 = this.h;
            String str3 = this.a;
            String str4 = this.d;
            return "Open(activity=" + activity + ", packageName=" + str + ", sharedUuid=" + str2 + ", customPlayStoreUrl=" + str3 + ", gameTitle=" + str4 + ")";
        }

        public d(Activity activity, String str, String str2, String str3, String str4) {
            C8632dsu.c((Object) activity, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) str4, "");
            this.b = activity;
            this.e = str;
            this.h = str2;
            this.a = str3;
            this.d = str4;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e {
        static final /* synthetic */ e a = new e();

        private e() {
        }

        public final bNK e(Activity activity, String str, String str2, String str3, boolean z, String str4) {
            C8632dsu.c((Object) activity, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) str3, "");
            if (z) {
                return new d(activity, str, str2, str4, str3);
            }
            return new b(activity, str, str2, str4);
        }
    }
}
