package o;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* renamed from: o.bEh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3612bEh {
    public static final e b = e.b;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.bEh$b */
    /* loaded from: classes4.dex */
    public interface b {
        InterfaceC3612bEh J();
    }

    static DialogFragment d(Context context, String str, String str2, long j, bEH beh) {
        return b.a(context, str, str2, j, beh);
    }

    DialogFragment d(String str, String str2, long j, bEH beh);

    /* renamed from: o.bEh$e */
    /* loaded from: classes4.dex */
    public static final class e {
        static final /* synthetic */ e b = new e();

        private e() {
        }

        public final DialogFragment a(Context context, String str, String str2, long j, bEH beh) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            return ((b) EntryPointAccessors.fromApplication(context, b.class)).J().d(str, str2, j, beh);
        }
    }
}
