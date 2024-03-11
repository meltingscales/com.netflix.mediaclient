package o;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: o.wZ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9764wZ implements InterfaceC9757wS {
    public static final c b = new c(null);
    public static final int c = 8;
    private final boolean a;
    private final Context d;
    private final String e;

    public C9764wZ(Context context, String str, boolean z) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        this.d = context;
        this.e = str;
        this.a = z;
    }

    public /* synthetic */ C9764wZ(Context context, String str, boolean z, int i, C8627dsp c8627dsp) {
        this(context, str, (i & 4) != 0 ? true : z);
    }

    /* renamed from: o.wZ$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        private final SharedPreferences a(Context context) {
            return context.getSharedPreferences("com.netflix.android.tooltips", 0);
        }

        private final String c(String str) {
            return "consumed." + str;
        }

        public final boolean a(Context context, String str) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) str, "");
            return a(context).getBoolean(c(str), false);
        }

        public final void c(Context context, String str) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) str, "");
            a(context).edit().putBoolean(c(str), true).apply();
        }
    }

    @Override // o.InterfaceC9757wS
    public boolean c() {
        return !b.a(this.d, this.e);
    }

    @Override // o.InterfaceC9762wX
    public void e(C9843xd c9843xd) {
        C8632dsu.c((Object) c9843xd, "");
        if (this.a) {
            a();
        }
    }

    @Override // o.InterfaceC9762wX
    public void d(C9843xd c9843xd) {
        C8632dsu.c((Object) c9843xd, "");
        if (this.a) {
            return;
        }
        a();
    }

    private final void a() {
        b.c(this.d, this.e);
    }
}
