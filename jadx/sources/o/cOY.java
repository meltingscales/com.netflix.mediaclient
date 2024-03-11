package o;

import android.content.Context;
import android.content.Intent;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* loaded from: classes4.dex */
public interface cOY {
    public static final b b = b.c;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes4.dex */
    public interface e {
        cOY az();
    }

    Intent b(Context context, String str);

    /* loaded from: classes4.dex */
    public static final class b {
        static final /* synthetic */ b c = new b();

        private b() {
        }

        public final cOY a() {
            C1332Xp c1332Xp = C1332Xp.b;
            return ((e) EntryPointAccessors.fromApplication((Context) C1332Xp.b(Context.class), e.class)).az();
        }
    }
}
