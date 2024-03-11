package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.netflix.android.imageloader.api.ImageDataSource;

/* renamed from: o.uN  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9646uN {
    public static final a d = new a(null);
    private boolean a;
    private int b;
    private Fragment c;
    private FragmentActivity e;
    private String g;
    private int h;

    public /* synthetic */ C9646uN(C8627dsp c8627dsp) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C9646uN c(FragmentActivity fragmentActivity) {
        this.e = fragmentActivity;
        return this;
    }

    public static final C9646uN d(FragmentActivity fragmentActivity) {
        return d.d(fragmentActivity);
    }

    public final C9646uN a(int i) {
        this.h = i;
        return this;
    }

    public final C9646uN b(int i) {
        this.b = i;
        return this;
    }

    public final C9646uN c(boolean z) {
        this.a = z;
        return this;
    }

    public final C9646uN e(String str) {
        C8632dsu.c((Object) str, "");
        this.g = str;
        return this;
    }

    /* renamed from: o.uN$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final C9646uN d(FragmentActivity fragmentActivity) {
            C8632dsu.c((Object) fragmentActivity, "");
            return new C9646uN(null).c(fragmentActivity);
        }

        public final C9646uN a() {
            return new C9646uN(null).c(true);
        }
    }

    private C9646uN() {
    }

    public final b b() {
        boolean g;
        String str = this.g;
        if (str != null) {
            g = C8691duz.g(str);
            if (!g) {
                return new b(str, this.e, this.c, this.h, this.b, this.a);
            }
        }
        throw new IllegalArgumentException("invalid URL");
    }

    /* renamed from: o.uN$b */
    /* loaded from: classes.dex */
    public static final class b {
        private final int a;
        private final boolean b;
        private final FragmentActivity c;
        private final int d;
        private final Fragment e;
        private final String h;

        public final int a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public final Fragment c() {
            return this.e;
        }

        public final FragmentActivity d() {
            return this.c;
        }

        public final int e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.h, (Object) bVar.h) && C8632dsu.c(this.c, bVar.c) && C8632dsu.c(this.e, bVar.e) && this.d == bVar.d && this.a == bVar.a && this.b == bVar.b;
            }
            return false;
        }

        public final String h() {
            return this.h;
        }

        public int hashCode() {
            int hashCode = this.h.hashCode();
            FragmentActivity fragmentActivity = this.c;
            int hashCode2 = fragmentActivity == null ? 0 : fragmentActivity.hashCode();
            Fragment fragment = this.e;
            return (((((((((hashCode * 31) + hashCode2) * 31) + (fragment != null ? fragment.hashCode() : 0)) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.a)) * 31) + Boolean.hashCode(this.b);
        }

        public final boolean j() {
            return (this.c == null && this.e == null) ? false : true;
        }

        public String toString() {
            String str = this.h;
            FragmentActivity fragmentActivity = this.c;
            Fragment fragment = this.e;
            int i = this.d;
            int i2 = this.a;
            boolean z = this.b;
            return "Request(url=" + str + ", activity=" + fragmentActivity + ", fragment=" + fragment + ", maxWidth=" + i + ", maxHeight=" + i2 + ", disableMemoryCache=" + z + ")";
        }

        public b(String str, FragmentActivity fragmentActivity, Fragment fragment, int i, int i2, boolean z) {
            C8632dsu.c((Object) str, "");
            this.h = str;
            this.c = fragmentActivity;
            this.e = fragment;
            this.d = i;
            this.a = i2;
            this.b = z;
        }
    }

    /* renamed from: o.uN$e */
    /* loaded from: classes.dex */
    public static final class e {
        private final ImageDataSource c;

        public final ImageDataSource a() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.c == ((e) obj).c;
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            ImageDataSource imageDataSource = this.c;
            return "Result(imageDataSource=" + imageDataSource + ")";
        }

        public e(ImageDataSource imageDataSource) {
            C8632dsu.c((Object) imageDataSource, "");
            this.c = imageDataSource;
        }
    }
}
