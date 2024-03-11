package com.netflix.android.imageloader.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.C9737vz;
import o.InterfaceC8598drn;
import o.InterfaceC9640uH;

/* loaded from: classes2.dex */
public final class GetImageRequest {
    public static final d c = new d(null);
    private boolean a;
    private FragmentActivity b;
    private View d;
    private boolean e;
    private final Reason f;
    private Fragment g;
    private int h;
    private int i;
    private boolean j;
    private String k;
    private boolean m;

    public /* synthetic */ GetImageRequest(Reason reason, C8627dsp c8627dsp) {
        this(reason);
    }

    public static final GetImageRequest c(Fragment fragment) {
        return c.b(fragment);
    }

    public static final GetImageRequest e() {
        return c.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GetImageRequest e(View view) {
        this.d = view;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GetImageRequest e(Fragment fragment) {
        this.g = fragment;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GetImageRequest e(FragmentActivity fragmentActivity) {
        this.b = fragmentActivity;
        return this;
    }

    public final GetImageRequest a(String str) {
        C8632dsu.c((Object) str, "");
        this.k = str;
        return this;
    }

    public final GetImageRequest a(boolean z) {
        this.m = z;
        return this;
    }

    public final GetImageRequest b(boolean z) {
        this.e = z;
        return this;
    }

    public final GetImageRequest c(int i) {
        this.i = i;
        return this;
    }

    public final GetImageRequest c(boolean z) {
        this.a = z;
        return this;
    }

    public final GetImageRequest d(int i) {
        this.h = i;
        return this;
    }

    public final GetImageRequest d(boolean z) {
        this.j = z;
        return this;
    }

    /* loaded from: classes2.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final GetImageRequest b(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            return new GetImageRequest(Reason.a, null).e(fragment);
        }

        public final GetImageRequest d(FragmentActivity fragmentActivity) {
            C8632dsu.c((Object) fragmentActivity, "");
            return new GetImageRequest(Reason.a, null).e(fragmentActivity);
        }

        public final GetImageRequest e(Fragment fragment, View view) {
            C8632dsu.c((Object) fragment, "");
            C8632dsu.c((Object) view, "");
            return new GetImageRequest(Reason.b, null).e(view).e(fragment).a(true);
        }

        public final GetImageRequest c(View view) {
            C8632dsu.c((Object) view, "");
            GetImageRequest e = new GetImageRequest(Reason.b, null).e(view);
            Context context = view.getContext();
            C8632dsu.a(context, "");
            return e.e((FragmentActivity) C9737vz.e(context, FragmentActivity.class)).a(true);
        }

        public final GetImageRequest a(FragmentActivity fragmentActivity) {
            C8632dsu.c((Object) fragmentActivity, "");
            return new GetImageRequest(Reason.c, null).e(fragmentActivity).a(false);
        }

        public final GetImageRequest b() {
            return new GetImageRequest(Reason.d, null);
        }
    }

    private GetImageRequest(Reason reason) {
        this.f = reason;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Reason {
        public static final Reason a = new Reason("PROCESS", 0);
        public static final Reason b = new Reason("SHOW_IN_VIEW", 1);
        public static final Reason c = new Reason("SHOW_IN_COMPOSE", 2);
        public static final Reason d = new Reason("SHOW_IN_NOTIFICATION", 3);
        private static final /* synthetic */ InterfaceC8598drn e;
        private static final /* synthetic */ Reason[] j;

        private static final /* synthetic */ Reason[] d() {
            return new Reason[]{a, b, c, d};
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) j.clone();
        }

        private Reason(String str, int i) {
        }

        static {
            Reason[] d2 = d();
            j = d2;
            e = C8600drp.e(d2);
        }
    }

    public final e a() {
        boolean g;
        String str = this.k;
        if (str != null) {
            g = C8691duz.g(str);
            if (!g) {
                Reason reason = this.f;
                if (reason != Reason.d && this.b == null && this.g == null) {
                    throw new IllegalArgumentException("lifecycle owner required");
                }
                return new e(reason, str, this.b, this.g, this.h, this.i, this.e, this.a, this.d, this.j, this.m);
            }
        }
        throw new IllegalArgumentException("invalid URL");
    }

    /* loaded from: classes.dex */
    public static final class e {
        private final View a;
        private final boolean b;
        private final FragmentActivity c;
        private final boolean d;
        private final boolean e;
        private final int f;
        private final int g;
        private final boolean h;
        private final Fragment i;
        private final Reason j;
        private final String l;

        public final boolean a() {
            return this.d;
        }

        public final boolean b() {
            return this.e;
        }

        public final FragmentActivity c() {
            return this.c;
        }

        public final boolean d() {
            return this.b;
        }

        public final View e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return this.j == eVar.j && C8632dsu.c((Object) this.l, (Object) eVar.l) && C8632dsu.c(this.c, eVar.c) && C8632dsu.c(this.i, eVar.i) && this.g == eVar.g && this.f == eVar.f && this.d == eVar.d && this.b == eVar.b && C8632dsu.c(this.a, eVar.a) && this.e == eVar.e && this.h == eVar.h;
            }
            return false;
        }

        public final Fragment f() {
            return this.i;
        }

        public final int g() {
            return this.f;
        }

        public final Reason h() {
            return this.j;
        }

        public int hashCode() {
            int hashCode = this.j.hashCode();
            int hashCode2 = this.l.hashCode();
            FragmentActivity fragmentActivity = this.c;
            int hashCode3 = fragmentActivity == null ? 0 : fragmentActivity.hashCode();
            Fragment fragment = this.i;
            int hashCode4 = fragment == null ? 0 : fragment.hashCode();
            int hashCode5 = Integer.hashCode(this.g);
            int hashCode6 = Integer.hashCode(this.f);
            int hashCode7 = Boolean.hashCode(this.d);
            int hashCode8 = Boolean.hashCode(this.b);
            View view = this.a;
            return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (view != null ? view.hashCode() : 0)) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.h);
        }

        public final boolean i() {
            return this.h;
        }

        public final int j() {
            return this.g;
        }

        public final String m() {
            return this.l;
        }

        public String toString() {
            Reason reason = this.j;
            String str = this.l;
            FragmentActivity fragmentActivity = this.c;
            Fragment fragment = this.i;
            int i = this.g;
            int i2 = this.f;
            boolean z = this.d;
            boolean z2 = this.b;
            View view = this.a;
            boolean z3 = this.e;
            boolean z4 = this.h;
            return "Request(reason=" + reason + ", url=" + str + ", activity=" + fragmentActivity + ", fragment=" + fragment + ", maxWidth=" + i + ", maxHeight=" + i2 + ", blurImage=" + z + ", alphaChannelRequired=" + z2 + ", destinationView=" + view + ", disableMemoryCache=" + z3 + ", trackForTtr=" + z4 + ")";
        }

        public e(Reason reason, String str, FragmentActivity fragmentActivity, Fragment fragment, int i, int i2, boolean z, boolean z2, View view, boolean z3, boolean z4) {
            C8632dsu.c((Object) reason, "");
            C8632dsu.c((Object) str, "");
            this.j = reason;
            this.l = str;
            this.c = fragmentActivity;
            this.i = fragment;
            this.g = i;
            this.f = i2;
            this.d = z;
            this.b = z2;
            this.a = view;
            this.e = z3;
            this.h = z4;
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
        private final InterfaceC9640uH a;
        private final ImageDataSource b;
        private final Bitmap d;

        public final Bitmap b() {
            return this.d;
        }

        public final Bitmap c() {
            return this.d;
        }

        public final ImageDataSource d() {
            return this.b;
        }

        public final InterfaceC9640uH e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c(this.d, aVar.d) && this.b == aVar.b && C8632dsu.c(this.a, aVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = this.b.hashCode();
            InterfaceC9640uH interfaceC9640uH = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (interfaceC9640uH == null ? 0 : interfaceC9640uH.hashCode());
        }

        public String toString() {
            Bitmap bitmap = this.d;
            ImageDataSource imageDataSource = this.b;
            InterfaceC9640uH interfaceC9640uH = this.a;
            return "Result(bitmap=" + bitmap + ", imageDataSource=" + imageDataSource + ", imageReference=" + interfaceC9640uH + ")";
        }

        public a(Bitmap bitmap, ImageDataSource imageDataSource, InterfaceC9640uH interfaceC9640uH) {
            C8632dsu.c((Object) bitmap, "");
            C8632dsu.c((Object) imageDataSource, "");
            this.d = bitmap;
            this.b = imageDataSource;
            this.a = interfaceC9640uH;
        }
    }
}
