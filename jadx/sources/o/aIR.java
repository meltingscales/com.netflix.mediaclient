package o;

import android.content.Context;
import com.netflix.mediaclient.ngpstore.api.NgpStoreApi;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* loaded from: classes3.dex */
public interface aIR {
    public static final b c = b.e;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes3.dex */
    public interface d {
        aIR am();
    }

    static aIR d(Context context) {
        return c.c(context);
    }

    NgpStoreApi a();

    /* loaded from: classes3.dex */
    public static final class b {
        static final /* synthetic */ b e = new b();

        private b() {
        }

        public final aIR c(Context context) {
            C8632dsu.c((Object) context, "");
            return ((d) EntryPointAccessors.fromApplication(context, d.class)).am();
        }
    }
}
