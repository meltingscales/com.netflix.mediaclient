package o;

import java.util.Collection;

/* renamed from: o.kx  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C9195kx {
    C9195kx() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> boolean a(Collection<T> collection) {
        if (collection == null) {
            return true;
        }
        for (T t : collection) {
            if (t == null) {
                return true;
            }
        }
        return false;
    }
}
