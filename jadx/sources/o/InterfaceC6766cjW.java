package o;

import android.app.Activity;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityComponent;

@EntryPoint
@InstallIn({ActivityComponent.class})
/* renamed from: o.cjW  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6766cjW {
    public static final a a = a.e;

    C6765cjV l();

    /* renamed from: o.cjW$a */
    /* loaded from: classes4.dex */
    public static final class a {
        static final /* synthetic */ a e = new a();

        private a() {
        }

        public final C6765cjV c(Activity activity) {
            C8632dsu.c((Object) activity, "");
            return ((InterfaceC6766cjW) EntryPointAccessors.fromActivity(activity, InterfaceC6766cjW.class)).l();
        }
    }
}
