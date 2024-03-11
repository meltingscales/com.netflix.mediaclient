package o;

import android.content.Context;
import dagger.hilt.android.EntryPointAccessors;

/* loaded from: classes3.dex */
public interface TO {
    public static final c c = c.a;

    static TO b(Context context) {
        return c.a(context);
    }

    String e();

    /* loaded from: classes3.dex */
    public static final class c {
        static final /* synthetic */ c a = new c();

        private c() {
        }

        public final TO a(Context context) {
            C8632dsu.c((Object) context, "");
            return ((TM) EntryPointAccessors.fromApplication(context, TM.class)).n();
        }
    }
}
