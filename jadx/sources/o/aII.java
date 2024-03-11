package o;

import android.content.Context;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* loaded from: classes3.dex */
public interface aII {
    public static final b b = b.c;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes3.dex */
    public interface a {
        aII ad();
    }

    aIK e();

    /* loaded from: classes3.dex */
    public static final class b {
        static final /* synthetic */ b c = new b();

        private b() {
        }

        public final aII a(Context context) {
            C8632dsu.c((Object) context, "");
            return ((a) EntryPointAccessors.fromApplication(context, a.class)).ad();
        }
    }
}
