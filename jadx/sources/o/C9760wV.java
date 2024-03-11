package o;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: o.wV  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9760wV implements InterfaceC9757wS {
    private final String a;
    private final boolean b;
    private final Context c;
    private final String i;
    private final int j;
    public static final a e = new a(null);
    public static final int d = 8;

    public C9760wV(Context context, String str, int i, boolean z) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        this.c = context;
        this.a = str;
        this.j = i;
        this.b = z;
        this.i = e.d(str);
    }

    /* renamed from: o.wV$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SharedPreferences b(Context context) {
            return context.getSharedPreferences("com.netflix.android.tooltips", 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String d(String str) {
            return "consumed." + str;
        }
    }

    @Override // o.InterfaceC9757wS
    public boolean c() {
        return e.b(this.c).getInt(this.i, 0) < this.j;
    }

    @Override // o.InterfaceC9762wX
    public void e(C9843xd c9843xd) {
        C8632dsu.c((Object) c9843xd, "");
        if (this.b) {
            a();
        }
    }

    @Override // o.InterfaceC9762wX
    public void d(C9843xd c9843xd) {
        C8632dsu.c((Object) c9843xd, "");
        if (this.b) {
            return;
        }
        a();
    }

    private final void a() {
        SharedPreferences b = e.b(this.c);
        b.edit().putInt(this.i, b.getInt(this.i, 0) + 1).apply();
    }
}
