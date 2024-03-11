package o;

import android.util.AndroidException;
import android.util.AndroidRuntimeException;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.UninitializedPropertyAccessException;

/* renamed from: o.Nx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1079Nx {
    public static final C1079Nx d = new C1079Nx();

    /* renamed from: o.Nx$b */
    /* loaded from: classes.dex */
    public interface b {
        void run();
    }

    private C1079Nx() {
    }

    public static final boolean e(Throwable th) {
        if (InterfaceC1597aHe.b.d() && th != null) {
            if ((th instanceof UninitializedPropertyAccessException) || (th instanceof ArithmeticException) || (th instanceof ClassCastException) || (th instanceof ConcurrentModificationException) || (th instanceof IllegalArgumentException) || (th instanceof IllegalStateException) || (th instanceof IndexOutOfBoundsException) || (th instanceof NoSuchElementException) || (th instanceof NullPointerException) || (th instanceof NumberFormatException) || (th instanceof AndroidRuntimeException)) {
                return true;
            }
            return th instanceof AndroidException;
        }
        return false;
    }

    public static final boolean a(Throwable th) {
        return th instanceof ClassCastException;
    }
}
