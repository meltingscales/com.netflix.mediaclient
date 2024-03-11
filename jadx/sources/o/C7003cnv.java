package o;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;

/* renamed from: o.cnv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7003cnv {
    public static final a a = new a(null);
    public static final int d = 8;
    private final C1567aGb b;
    private final Context c;

    @Inject
    public C7003cnv(@ApplicationContext Context context, C1567aGb c1567aGb) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c1567aGb, "");
        this.c = context;
        this.b = c1567aGb;
    }

    /* renamed from: o.cnv$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("MyListPreference");
        }
    }

    private final String e(String str, String str2) {
        return str + "_" + str2;
    }

    public final boolean d() {
        return d(this.c).getLong(e("my_list_game_popover_shown", this.b.a()), 0L) > 0;
    }

    private final SharedPreferences d(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.netflix.android.mylist", 0);
        C8632dsu.a(sharedPreferences, "");
        return sharedPreferences;
    }

    public final void a() {
        d(this.c).edit().putLong(e("my_list_game_popover_shown", this.b.a()), System.currentTimeMillis()).apply();
    }
}
