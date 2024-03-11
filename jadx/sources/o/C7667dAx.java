package o;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* renamed from: o.dAx  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7667dAx {
    private static final boolean a = false;

    public static final dxN d(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return e(th, mainDispatcherFactory.hintOnError());
        }
    }

    public static final boolean c(dxN dxn) {
        return dxn.c() instanceof C7668dAy;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ C7668dAy a(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return e(th, str);
    }

    private static final C7668dAy e(Throwable th, String str) {
        if (a) {
            return new C7668dAy(th, str);
        }
        if (th != null) {
            throw th;
        }
        b();
        throw new KotlinNothingValueException();
    }

    public static final Void b() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
