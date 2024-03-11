package com.netflix.android.imageloader.api;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import io.reactivex.SingleObserver;
import java.util.ArrayList;
import java.util.List;
import o.C8600drp;
import o.C8632dsu;
import o.InterfaceC8598drn;
import o.InterfaceC9642uJ;

/* loaded from: classes2.dex */
public final class ShowImageRequest {
    private FragmentActivity a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private Fragment g;
    private Integer h;
    private boolean i;
    private Integer j;
    private String k;

    /* renamed from: o  reason: collision with root package name */
    private SingleObserver<a> f13120o;
    private Priority n = Priority.e;
    private List<InterfaceC9642uJ> l = new ArrayList();

    public final ShowImageRequest a(SingleObserver<a> singleObserver) {
        this.f13120o = singleObserver;
        return this;
    }

    public final ShowImageRequest a(String str) {
        this.k = str;
        return this;
    }

    public final ShowImageRequest a(boolean z) {
        this.i = z;
        return this;
    }

    public final ShowImageRequest b(boolean z) {
        this.b = z;
        return this;
    }

    public final FragmentActivity c() {
        return this.a;
    }

    public final ShowImageRequest c(Priority priority) {
        C8632dsu.c((Object) priority, "");
        this.n = priority;
        return this;
    }

    public final ShowImageRequest c(boolean z) {
        this.c = z;
        return this;
    }

    public final ShowImageRequest d() {
        this.f = true;
        return this;
    }

    public final ShowImageRequest d(FragmentActivity fragmentActivity) {
        C8632dsu.c((Object) fragmentActivity, "");
        this.a = fragmentActivity;
        return this;
    }

    public final ShowImageRequest d(Integer num) {
        this.h = num;
        return this;
    }

    public final ShowImageRequest d(boolean z) {
        this.d = z;
        return this;
    }

    public final Fragment e() {
        return this.g;
    }

    public final ShowImageRequest e(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        this.g = fragment;
        return this;
    }

    public final ShowImageRequest e(Integer num) {
        this.j = num;
        return this;
    }

    public final ShowImageRequest e(boolean z) {
        this.e = z;
        return this;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Priority {
        private static final /* synthetic */ InterfaceC8598drn b;
        private static final /* synthetic */ Priority[] c;
        public static final Priority e = new Priority("LOW", 0);
        public static final Priority a = new Priority("NORMAL", 1);

        private static final /* synthetic */ Priority[] a() {
            return new Priority[]{e, a};
        }

        public static Priority valueOf(String str) {
            return (Priority) Enum.valueOf(Priority.class, str);
        }

        public static Priority[] values() {
            return (Priority[]) c.clone();
        }

        private Priority(String str, int i) {
        }

        static {
            Priority[] a2 = a();
            c = a2;
            b = C8600drp.e(a2);
        }
    }

    public final ShowImageRequest j(boolean z) {
        this.n = z ? Priority.a : Priority.e;
        return this;
    }

    public final d b() {
        if (this.a == null && this.g == null) {
            throw new IllegalArgumentException("lifecycle owner required");
        }
        return new d(this.a, this.g, this.f13120o, new c(this.k, this.i, this.h, this.d, this.j, this.c, this.e, this.n, this.b, this.f, this.l));
    }

    /* loaded from: classes2.dex */
    public static final class c {
        private final boolean a;
        private final boolean b;
        private final boolean c;
        private final boolean d;
        private final boolean e;
        private final List<InterfaceC9642uJ> f;
        private final Integer g;
        private final Priority h;
        private final Integer i;
        private final boolean j;

        /* renamed from: o  reason: collision with root package name */
        private final String f13121o;

        public final boolean a() {
            return this.b;
        }

        public final boolean b() {
            return this.e;
        }

        public final boolean c() {
            return this.c;
        }

        public final boolean d() {
            return this.a;
        }

        public final boolean e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.f13121o, (Object) cVar.f13121o) && this.d == cVar.d && C8632dsu.c(this.i, cVar.i) && this.a == cVar.a && C8632dsu.c(this.g, cVar.g) && this.b == cVar.b && this.c == cVar.c && this.h == cVar.h && this.e == cVar.e && this.j == cVar.j && C8632dsu.c(this.f, cVar.f);
            }
            return false;
        }

        public final Integer f() {
            return this.g;
        }

        public final List<InterfaceC9642uJ> g() {
            return this.f;
        }

        public final boolean h() {
            return this.j;
        }

        public int hashCode() {
            String str = this.f13121o;
            int hashCode = str == null ? 0 : str.hashCode();
            int hashCode2 = Boolean.hashCode(this.d);
            Integer num = this.i;
            int hashCode3 = num == null ? 0 : num.hashCode();
            int hashCode4 = Boolean.hashCode(this.a);
            Integer num2 = this.g;
            return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.c)) * 31) + this.h.hashCode()) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.j)) * 31) + this.f.hashCode();
        }

        public final Priority i() {
            return this.h;
        }

        public final Integer j() {
            return this.i;
        }

        public final String m() {
            return this.f13121o;
        }

        public String toString() {
            String str = this.f13121o;
            boolean z = this.d;
            Integer num = this.i;
            boolean z2 = this.a;
            Integer num2 = this.g;
            boolean z3 = this.b;
            boolean z4 = this.c;
            Priority priority = this.h;
            boolean z5 = this.e;
            boolean z6 = this.j;
            List<InterfaceC9642uJ> list = this.f;
            return "RequestDetails(url=" + str + ", disablePlaceholderImage=" + z + ", overridePlaceholderImageResId=" + num + ", disableFailureImage=" + z2 + ", overrideFailureImageResId=" + num2 + ", blurImage=" + z3 + ", alphaChannelRequired=" + z4 + ", priority=" + priority + ", disableAnimations=" + z5 + ", glideForceOriginalImageSize=" + z6 + ", transformations=" + list + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, Priority priority, boolean z5, boolean z6, List<? extends InterfaceC9642uJ> list) {
            C8632dsu.c((Object) priority, "");
            C8632dsu.c((Object) list, "");
            this.f13121o = str;
            this.d = z;
            this.i = num;
            this.a = z2;
            this.g = num2;
            this.b = z3;
            this.c = z4;
            this.h = priority;
            this.e = z5;
            this.j = z6;
            this.f = list;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        private final SingleObserver<a> a;
        private final FragmentActivity b;
        private final c d;
        private final Fragment e;

        public final c a() {
            return this.d;
        }

        public final Fragment b() {
            return this.e;
        }

        public final FragmentActivity c() {
            return this.b;
        }

        public final SingleObserver<a> d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.b, dVar.b) && C8632dsu.c(this.e, dVar.e) && C8632dsu.c(this.a, dVar.a) && C8632dsu.c(this.d, dVar.d);
            }
            return false;
        }

        public int hashCode() {
            FragmentActivity fragmentActivity = this.b;
            int hashCode = fragmentActivity == null ? 0 : fragmentActivity.hashCode();
            Fragment fragment = this.e;
            int hashCode2 = fragment == null ? 0 : fragment.hashCode();
            SingleObserver<a> singleObserver = this.a;
            return (((((hashCode * 31) + hashCode2) * 31) + (singleObserver != null ? singleObserver.hashCode() : 0)) * 31) + this.d.hashCode();
        }

        public String toString() {
            FragmentActivity fragmentActivity = this.b;
            Fragment fragment = this.e;
            SingleObserver<a> singleObserver = this.a;
            c cVar = this.d;
            return "Request(activity=" + fragmentActivity + ", fragment=" + fragment + ", resultObserver=" + singleObserver + ", details=" + cVar + ")";
        }

        public d(FragmentActivity fragmentActivity, Fragment fragment, SingleObserver<a> singleObserver, c cVar) {
            C8632dsu.c((Object) cVar, "");
            this.b = fragmentActivity;
            this.e = fragment;
            this.a = singleObserver;
            this.d = cVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        private final boolean a;
        private final ImageDataSource c;

        public final boolean b() {
            return this.a;
        }

        public final ImageDataSource c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.a == aVar.a && this.c == aVar.c;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.a);
            ImageDataSource imageDataSource = this.c;
            return (hashCode * 31) + (imageDataSource == null ? 0 : imageDataSource.hashCode());
        }

        public String toString() {
            boolean z = this.a;
            ImageDataSource imageDataSource = this.c;
            return "Result(wasRequestSkipped=" + z + ", imageDataSource=" + imageDataSource + ")";
        }

        public a(boolean z, ImageDataSource imageDataSource) {
            this.a = z;
            this.c = imageDataSource;
        }
    }
}
