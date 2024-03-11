package o;

import java.lang.reflect.Field;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* renamed from: o.dri  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8593dri {
    public static final StackTraceElement b(BaseContinuationImpl baseContinuationImpl) {
        String str;
        C8632dsu.c((Object) baseContinuationImpl, "");
        InterfaceC8591drg a = a(baseContinuationImpl);
        if (a == null) {
            return null;
        }
        c(1, a.c());
        int c = c(baseContinuationImpl);
        int i = c < 0 ? -1 : a.b()[c];
        String b = C8597drm.d.b(baseContinuationImpl);
        if (b == null) {
            str = a.d();
        } else {
            str = b + '/' + a.d();
        }
        return new StackTraceElement(str, a.e(), a.a(), i);
    }

    private static final InterfaceC8591drg a(BaseContinuationImpl baseContinuationImpl) {
        return (InterfaceC8591drg) baseContinuationImpl.getClass().getAnnotation(InterfaceC8591drg.class);
    }

    private static final int c(BaseContinuationImpl baseContinuationImpl) {
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (-1) + (num != null ? num.intValue() : 0);
        } catch (Exception unused) {
            return -1;
        }
    }

    private static final void c(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
    }
}
