package o;

import android.content.Context;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import io.reactivex.Completable;
import java.util.List;

/* loaded from: classes.dex */
public interface aCN {
    public static final b e = b.e;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes.dex */
    public interface c {
        aCN P();
    }

    static aCN a(Context context) {
        return e.e(context);
    }

    Completable b(InterfaceC5283bvo interfaceC5283bvo, String str);

    InterfaceC1919aTc c(InterfaceC1926aTj interfaceC1926aTj);

    Completable d(List<C1567aGb> list, MF mf);

    Completable d(C1567aGb c1567aGb);

    Completable e();

    /* loaded from: classes.dex */
    public static final class b {
        static final /* synthetic */ b e = new b();

        private b() {
        }

        public final aCN e(Context context) {
            C8632dsu.c((Object) context, "");
            return ((c) EntryPointAccessors.fromApplication(context, c.class)).P();
        }
    }
}
