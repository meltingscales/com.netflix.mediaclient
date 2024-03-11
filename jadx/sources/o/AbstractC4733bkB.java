package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: o.bkB  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4733bkB {
    public abstract String a();

    public abstract int b();

    public abstract Double c();

    public abstract int d();

    public static TypeAdapter<AbstractC4733bkB> a(Gson gson) {
        try {
            Object[] objArr = {gson};
            Object obj = C1043Ml.p.get(293832570);
            if (obj == null) {
                obj = ((Class) C1043Ml.c((char) 19499, 7, 81)).getDeclaredConstructor(Gson.class);
                C1043Ml.p.put(293832570, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(objArr);
            try {
                Object[] objArr2 = {"leaningHighest"};
                Object obj2 = C1043Ml.p.get(1767875567);
                if (obj2 == null) {
                    obj2 = ((Class) C1043Ml.c((char) 19499, 7, 81)).getMethod("e", String.class);
                    C1043Ml.p.put(1767875567, obj2);
                }
                Object invoke = ((Method) obj2).invoke(newInstance, objArr2);
                try {
                    Object[] objArr3 = {Double.valueOf(1.2d)};
                    Object obj3 = C1043Ml.p.get(486930859);
                    if (obj3 == null) {
                        obj3 = ((Class) C1043Ml.c((char) 19499, 7, 81)).getMethod("a", Double.class);
                        C1043Ml.p.put(486930859, obj3);
                    }
                    Object invoke2 = ((Method) obj3).invoke(invoke, objArr3);
                    try {
                        Object[] objArr4 = {6};
                        Object obj4 = C1043Ml.p.get(-1812786183);
                        if (obj4 == null) {
                            obj4 = ((Class) C1043Ml.c((char) 19499, 7, 81)).getMethod("d", Integer.TYPE);
                            C1043Ml.p.put(-1812786183, obj4);
                        }
                        Object invoke3 = ((Method) obj4).invoke(invoke2, objArr4);
                        try {
                            Object[] objArr5 = {30000};
                            Object obj5 = C1043Ml.p.get(-1812815974);
                            if (obj5 == null) {
                                obj5 = ((Class) C1043Ml.c((char) 19499, 7, 81)).getMethod("c", Integer.TYPE);
                                C1043Ml.p.put(-1812815974, obj5);
                            }
                            return (TypeAdapter) ((Method) obj5).invoke(invoke3, objArr5);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th4;
            }
        } catch (Throwable th5) {
            Throwable cause5 = th5.getCause();
            if (cause5 != null) {
                throw cause5;
            }
            throw th5;
        }
    }
}
