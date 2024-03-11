package o;

import android.app.ActivityManager;
import android.os.storage.StorageManager;

/* renamed from: o.mS  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9270mS extends AbstractC9267mP {
    private final ActivityManager a;
    private final StorageManager d;

    public final StorageManager b() {
        return this.d;
    }

    public final ActivityManager c() {
        return this.a;
    }

    public C9270mS(C9268mQ c9268mQ) {
        this.d = C9148kC.c(c9268mQ.a());
        this.a = C9148kC.d(c9268mQ.a());
    }
}
