package o;

import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;

/* renamed from: o.fD */
/* loaded from: classes5.dex */
public final class C8884fD {
    public static /* synthetic */ void b(InterfaceC8660dtv interfaceC8660dtv, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        b(interfaceC8660dtv, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(InterfaceC8660dtv<?> interfaceC8660dtv, boolean z) {
        Object e;
        Object e2;
        Object e3;
        Object e4;
        Object e5;
        List i;
        Object obj;
        String str;
        C8632dsu.c((Object) interfaceC8660dtv, "");
        if (!d(drI.e(interfaceC8660dtv))) {
            throw new IllegalArgumentException(("Mavericks state must be a data class! - " + interfaceC8660dtv.b()).toString());
        }
        Class[] clsArr = new Class[7];
        clsArr[0] = ArrayList.class;
        clsArr[1] = HashMap.class;
        try {
            Result.c cVar = Result.e;
            e = Result.e(Class.forName("android.util.SparseArray"));
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            e = Result.e(C8556dpz.a(th));
        }
        if (Result.a(e)) {
            e = null;
        }
        clsArr[2] = e;
        try {
            Result.c cVar3 = Result.e;
            e2 = Result.e(LongSparseArray.class);
        } catch (Throwable th2) {
            Result.c cVar4 = Result.e;
            e2 = Result.e(C8556dpz.a(th2));
        }
        if (Result.a(e2)) {
            e2 = null;
        }
        clsArr[3] = e2;
        try {
            Result.c cVar5 = Result.e;
            e3 = Result.e(SparseArrayCompat.class);
        } catch (Throwable th3) {
            Result.c cVar6 = Result.e;
            e3 = Result.e(C8556dpz.a(th3));
        }
        if (Result.a(e3)) {
            e3 = null;
        }
        clsArr[4] = e3;
        try {
            Result.c cVar7 = Result.e;
            e4 = Result.e(ArrayMap.class);
        } catch (Throwable th4) {
            Result.c cVar8 = Result.e;
            e4 = Result.e(C8556dpz.a(th4));
        }
        if (Result.a(e4)) {
            e4 = null;
        }
        clsArr[5] = e4;
        try {
            Result.c cVar9 = Result.e;
            e5 = Result.e(Class.forName("android.util.ArrayMap"));
        } catch (Throwable th5) {
            Result.c cVar10 = Result.e;
            e5 = Result.e(C8556dpz.a(th5));
        }
        if (Result.a(e5)) {
            e5 = null;
        }
        clsArr[6] = e5;
        i = C8569dql.i(clsArr);
        Field[] declaredFields = drI.e(interfaceC8660dtv).getDeclaredFields();
        C8632dsu.a(declaredFields, "");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        for (Field field2 : arrayList) {
            Iterator it = i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C8632dsu.a(field2, "");
                if (a(field2, drI.b((Class) obj))) {
                    break;
                }
            }
            Class cls = (Class) obj;
            if (!Modifier.isFinal(field2.getModifiers())) {
                str = "State property " + field2.getName() + " must be a val, not a var.";
                continue;
            } else if (cls != null) {
                str = "You cannot use " + cls.getSimpleName() + " for " + field2.getName() + ".\nUse the immutable listOf(...) method instead. You can append it with `val newList = listA + listB`";
                continue;
            } else {
                if (!z) {
                    C8632dsu.a(field2, "");
                    if (a(field2, dsA.a(InterfaceC8555dpy.class), dsA.a(InterfaceC8656dtr.class))) {
                        str = "You cannot use functions inside Mavericks state. Only pure data should be represented: " + field2.getName();
                        continue;
                    }
                }
                str = null;
                continue;
            }
            if (str != null) {
                throw new IllegalArgumentException("Invalid property in state " + interfaceC8660dtv.b() + ": " + str);
            }
        }
    }

    public static final boolean d(Class<?> cls) {
        Method method;
        Method method2;
        Method method3;
        boolean i;
        C8632dsu.c((Object) cls, "");
        Method[] declaredMethods = cls.getDeclaredMethods();
        C8632dsu.a(declaredMethods, "");
        for (Method method4 : declaredMethods) {
            if (C8632dsu.c((Object) method4.getName(), (Object) "copy$default") && method4.isSynthetic()) {
                Method[] declaredMethods2 = cls.getDeclaredMethods();
                C8632dsu.a(declaredMethods2, "");
                int length = declaredMethods2.length;
                int i2 = 0;
                while (true) {
                    method = null;
                    if (i2 >= length) {
                        method2 = null;
                        break;
                    }
                    method2 = declaredMethods2[i2];
                    String name = method2.getName();
                    C8632dsu.a(name, "");
                    i = C8691duz.i(name, "component1", false, 2, null);
                    if (i) {
                        break;
                    }
                    i2++;
                }
                if (method2 == null) {
                    return false;
                }
                Method[] declaredMethods3 = cls.getDeclaredMethods();
                C8632dsu.a(declaredMethods3, "");
                int length2 = declaredMethods3.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        method3 = null;
                        break;
                    }
                    method3 = declaredMethods3[i3];
                    if (C8632dsu.c((Object) method3.getName(), (Object) "equals")) {
                        break;
                    }
                    i3++;
                }
                if (method3 == null) {
                    return false;
                }
                Method[] declaredMethods4 = cls.getDeclaredMethods();
                C8632dsu.a(declaredMethods4, "");
                int length3 = declaredMethods4.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length3) {
                        break;
                    }
                    Method method5 = declaredMethods4[i4];
                    if (C8632dsu.c((Object) method5.getName(), (Object) "hashCode")) {
                        method = method5;
                        break;
                    }
                    i4++;
                }
                return method != null;
            }
        }
        return false;
    }

    private static final boolean a(Field field, InterfaceC8660dtv<?>... interfaceC8660dtvArr) {
        if (interfaceC8660dtvArr.length > 0) {
            InterfaceC8660dtv<?> interfaceC8660dtv = interfaceC8660dtvArr[0];
            Class<?> type = field.getType();
            if (type instanceof ParameterizedType) {
                Class e = drI.e(interfaceC8660dtv);
                Type rawType = ((ParameterizedType) type).getRawType();
                C8632dsu.d(rawType);
                return e.isAssignableFrom((Class) rawType);
            }
            return drI.e(interfaceC8660dtv).isAssignableFrom(type);
        }
        return false;
    }
}
