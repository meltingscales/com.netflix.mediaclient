package androidx.compose.ui.tooling;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.tooling.PreviewLogger;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import o.C8563dqf;
import o.C8572dqo;
import o.C8632dsu;
import o.C8654dtp;
import o.C8657dts;
import o.C8691duz;
import o.dqB;
import o.drI;
import o.dsD;

/* loaded from: classes5.dex */
public final class ComposableInvoker {
    public static final ComposableInvoker INSTANCE = new ComposableInvoker();

    private ComposableInvoker() {
    }

    private final boolean areParameterTypesCompatible(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length == clsArr2.length) {
            ArrayList<Boolean> arrayList = new ArrayList(clsArr.length);
            int length = clsArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                boolean z = true;
                if (i >= length) {
                    break;
                }
                Class<?> cls = clsArr[i];
                Class<?> cls2 = clsArr2[i2];
                if (!C8632dsu.c(drI.b(cls), drI.b(cls2)) && !cls.isAssignableFrom(cls2)) {
                    z = false;
                }
                arrayList.add(Boolean.valueOf(z));
                i++;
                i2++;
            }
            if (!arrayList.isEmpty()) {
                for (Boolean bool : arrayList) {
                    if (!bool.booleanValue()) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    private final Object getDefaultValue(Class<?> cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(0.0d);
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return 0;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return (byte) 0;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return (char) 0;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return 0L;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.FALSE;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return Float.valueOf(0.0f);
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return (short) 0;
                }
                break;
        }
        return null;
    }

    private final Object invokeComposableMethod(Method method, Object obj, Composer composer, Object... objArr) {
        Object obj2;
        int w;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (C8632dsu.c(parameterTypes[length], Composer.class)) {
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
        }
        length = -1;
        int i2 = length + 1;
        int changedParamCount = changedParamCount(length, obj == null ? 0 : 1) + i2;
        int length2 = method.getParameterTypes().length;
        if ((length2 != changedParamCount ? defaultParamCount(length) : 0) + changedParamCount != length2) {
            throw new IllegalStateException("params don't add up to total params".toString());
        }
        Object[] objArr2 = new Object[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            if (i3 >= 0 && i3 < length) {
                if (i3 >= 0) {
                    w = C8563dqf.w(objArr);
                    if (i3 <= w) {
                        obj2 = objArr[i3];
                    }
                }
                obj2 = INSTANCE.getDefaultValue(method.getParameterTypes()[i3]);
            } else if (i3 == length) {
                obj2 = composer;
            } else if (i2 <= i3 && i3 < changedParamCount) {
                obj2 = 0;
            } else if (changedParamCount > i3 || i3 >= length2) {
                throw new IllegalStateException("Unexpected index".toString());
            } else {
                obj2 = 2097151;
            }
            objArr2[i3] = obj2;
        }
        return method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    private final int changedParamCount(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        return (int) Math.ceil((i + i2) / 10.0d);
    }

    private final int defaultParamCount(int i) {
        return (int) Math.ceil(i / 31.0d);
    }

    public final void invokeComposable(String str, String str2, Composer composer, Object... objArr) {
        try {
            Class<?> cls = Class.forName(str);
            Method findComposableMethod = findComposableMethod(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (findComposableMethod == null) {
                throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
            }
            findComposableMethod.setAccessible(true);
            if (Modifier.isStatic(findComposableMethod.getModifiers())) {
                invokeComposableMethod(findComposableMethod, null, composer, Arrays.copyOf(objArr, objArr.length));
            } else {
                invokeComposableMethod(findComposableMethod, cls.getConstructor(new Class[0]).newInstance(new Object[0]), composer, Arrays.copyOf(objArr, objArr.length));
            }
        } catch (Exception e) {
            PreviewLogger.Companion companion = PreviewLogger.Companion;
            PreviewLogger.Companion.logWarning$ui_tooling_release$default(companion, "Failed to invoke Composable Method '" + str + '.' + str2 + '\'', null, 2, null);
            throw e;
        }
    }

    private final Method findCompatibleComposeMethod(Method[] methodArr, String str, Class<?>... clsArr) {
        Method method;
        boolean i;
        int length = methodArr.length;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 >= length) {
                break;
            }
            Method method2 = methodArr[i2];
            if (!C8632dsu.c((Object) str, (Object) method2.getName())) {
                i = C8691duz.i(method2.getName(), str + '-', false, 2, null);
                if (!i) {
                    continue;
                    i2++;
                }
            }
            if (INSTANCE.areParameterTypesCompatible(method2.getParameterTypes(), (Class[]) Arrays.copyOf(clsArr, clsArr.length))) {
                method = method2;
                break;
            }
            i2++;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str + " not found");
    }

    private final Method findComposableMethod(Class<?> cls, String str, Object... objArr) {
        Method[] declaredMethods;
        boolean i;
        C8654dtp g;
        int d;
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i2++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int changedParamCount = changedParamCount(clsArr.length, 0);
                Class cls3 = Integer.TYPE;
                g = C8657dts.g(0, changedParamCount);
                d = C8572dqo.d(g, 10);
                ArrayList arrayList2 = new ArrayList(d);
                Iterator<Integer> it = g.iterator();
                while (it.hasNext()) {
                    ((dqB) it).nextInt();
                    arrayList2.add(cls3);
                }
                Method[] declaredMethods2 = cls.getDeclaredMethods();
                dsD dsd = new dsD(3);
                dsd.d(clsArr);
                dsd.e(Composer.class);
                dsd.d((Class[]) arrayList2.toArray(new Class[0]));
                return findCompatibleComposeMethod(declaredMethods2, str, (Class[]) dsd.b(new Class[dsd.c()]));
            } catch (ReflectiveOperationException unused) {
                for (Method method : cls.getDeclaredMethods()) {
                    if (!C8632dsu.c((Object) method.getName(), (Object) str)) {
                        i = C8691duz.i(method.getName(), str + '-', false, 2, null);
                        if (!i) {
                        }
                    }
                    return method;
                }
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            return null;
        }
    }
}
