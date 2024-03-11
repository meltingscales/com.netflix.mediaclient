package o;

import android.app.Activity;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityComponent;

/* renamed from: o.crc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7194crc {
    public static final b c = b.a;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* renamed from: o.crc$a */
    /* loaded from: classes4.dex */
    public interface a {
        InterfaceC7194crc n();
    }

    boolean c();

    /* renamed from: o.crc$b */
    /* loaded from: classes4.dex */
    public static final class b {
        static final /* synthetic */ b a = new b();

        private b() {
        }

        public final InterfaceC7194crc b(Activity activity) {
            C8632dsu.c((Object) activity, "");
            return ((a) EntryPointAccessors.fromActivity(activity, a.class)).n();
        }
    }
}
