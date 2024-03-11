package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.util.PlayContext;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* loaded from: classes.dex */
public interface bDL {
    public static final e e = e.b;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes.dex */
    public interface b {
        bDL au();
    }

    static bDL e(Context context) {
        return e.d(context);
    }

    Class<?> b();

    Intent c(Context context, String str, VideoType videoType, PlayContext playContext, long j);

    void e(Activity activity);

    /* loaded from: classes.dex */
    public static final class e {
        static final /* synthetic */ e b = new e();

        private e() {
        }

        public final bDL d(Context context) {
            C8632dsu.c((Object) context, "");
            return ((b) EntryPointAccessors.fromApplication(context, b.class)).au();
        }
    }
}
