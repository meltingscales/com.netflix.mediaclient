package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.ui.profiles.ProfileCreator;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* renamed from: o.cKl  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5844cKl {
    public static final a b = a.e;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.cKl$c */
    /* loaded from: classes4.dex */
    public interface c {
        InterfaceC5844cKl at();
    }

    static InterfaceC5844cKl e(Context context) {
        return b.b(context);
    }

    InterfaceC5929cNp a();

    void a(Activity activity, InterfaceC5283bvo interfaceC5283bvo);

    Intent b();

    boolean b(Activity activity);

    ProfileCreator c();

    cNW d();

    Intent e();

    InterfaceC5846cKn g();

    int j();

    /* renamed from: o.cKl$a */
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a e = new a();

        private a() {
        }

        public final InterfaceC5844cKl b(Context context) {
            C8632dsu.c((Object) context, "");
            return ((c) EntryPointAccessors.fromApplication(context, c.class)).at();
        }
    }
}
