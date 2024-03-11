package o;

import android.content.Context;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import io.reactivex.Observable;

/* loaded from: classes3.dex */
public interface aLN {
    public static final b a = b.c;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes3.dex */
    public interface a {
        aLN M();
    }

    aLP e(Observable<dpR> observable);

    /* loaded from: classes3.dex */
    public static final class b {
        static final /* synthetic */ b c = new b();

        private b() {
        }

        public final aLP a(Observable<dpR> observable) {
            C8632dsu.c((Object) observable, "");
            C1332Xp c1332Xp = C1332Xp.b;
            return ((a) EntryPointAccessors.fromApplication((Context) C1332Xp.b(Context.class), a.class)).M().e(observable);
        }
    }
}
