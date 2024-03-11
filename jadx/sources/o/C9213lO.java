package o;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* renamed from: o.lO  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9213lO {
    private static Method a;
    private static Method b;
    private static Method c;
    private static Method d;
    public static final C9213lO e = new C9213lO();
    private static Method f;
    private static Method g;
    private static Method h;
    private static Method i;
    private static InterfaceC9217lS j;

    private C9213lO() {
    }

    private final Method e(String str, Class<?>... clsArr) {
        InterfaceC9217lS interfaceC9217lS = j;
        if (interfaceC9217lS == null) {
            return null;
        }
        return interfaceC9217lS.getClass().getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
    }

    public final void b(InterfaceC9217lS interfaceC9217lS) {
        if (interfaceC9217lS != null) {
            j = interfaceC9217lS;
            f = e("setInternalMetricsEnabled", Boolean.TYPE);
            i = e("setStaticData", Map.class);
            b = e("getSignalUnwindStackFunction", new Class[0]);
            c = e("getCurrentCallbackSetCounts", new Class[0]);
            d = e("getCurrentNativeApiCallUsage", new Class[0]);
            a = e("initCallbackCounts", Map.class);
            g = e("notifyAddCallback", String.class);
            h = e("notifyRemoveCallback", String.class);
        }
    }

    public final void a(boolean z) {
        Method method = f;
        if (method != null) {
            method.invoke(j, Boolean.valueOf(z));
        }
    }

    public final Map<String, Integer> b() {
        Method method = c;
        if (method != null) {
            Object invoke = method.invoke(j, new Object[0]);
            if (invoke != null) {
                return (Map) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
        }
        return null;
    }

    public final Map<String, Boolean> a() {
        Method method = d;
        if (method != null) {
            Object invoke = method.invoke(j, new Object[0]);
            if (invoke != null) {
                return (Map) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean>");
        }
        return null;
    }

    public final void a(Map<String, Integer> map) {
        Method method = a;
        if (method != null) {
            method.invoke(j, map);
        }
    }

    public final void c(String str) {
        Method method = g;
        if (method != null) {
            method.invoke(j, str);
        }
    }

    public final void e(Map<String, ? extends Object> map) {
        Method method = i;
        if (method != null) {
            method.invoke(j, map);
        }
    }
}
