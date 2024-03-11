package o;

import java.lang.reflect.Constructor;

/* renamed from: o.fE  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8885fE {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <VM extends AbstractC8899fS<S>, S extends InterfaceC8888fH> C8963gd<VM, S> b(Class<? extends VM> cls, Class<? extends S> cls2, AbstractC8979gt abstractC8979gt, C8975gp<VM, S> c8975gp, InterfaceC8890fJ<VM, S> interfaceC8890fJ) {
        Object y;
        String str;
        Class<?>[] parameterTypes;
        Class<? extends S> b;
        Class<? extends VM> d;
        S d2 = interfaceC8890fJ.d(cls, cls2, abstractC8979gt, c8975gp);
        if (c8975gp != null && (d = c8975gp.d()) != null) {
            cls = d;
        }
        if (c8975gp != null && (b = c8975gp.b()) != null) {
            cls2 = b;
        }
        Class a = C8964ge.a(cls);
        AbstractC8899fS abstractC8899fS = null;
        if (a != null) {
            try {
                abstractC8899fS = (AbstractC8899fS) a.getMethod("create", AbstractC8979gt.class, InterfaceC8888fH.class).invoke(C8964ge.e(a), abstractC8979gt, d2);
            } catch (NoSuchMethodException unused) {
                abstractC8899fS = (AbstractC8899fS) cls.getMethod("create", AbstractC8979gt.class, InterfaceC8888fH.class).invoke(null, abstractC8979gt, d2);
            }
        }
        if (abstractC8899fS == null) {
            abstractC8899fS = e(cls, d2);
        }
        if (abstractC8899fS == null) {
            Constructor<?>[] constructors = cls.getConstructors();
            C8632dsu.a(constructors, "");
            y = C8563dqf.y(constructors);
            Constructor constructor = (Constructor) y;
            if (constructor != null && (parameterTypes = constructor.getParameterTypes()) != null && parameterTypes.length > 1) {
                str = cls.getName() + " takes dependencies other than initialState. It must have companion object implementing " + InterfaceC8906fZ.class.getName() + " with a create method returning a non-null ViewModel.";
            } else {
                str = cls.getClass().getName() + " must have primary constructor with a single non-optional parameter that takes initial state of " + cls2.getName() + '.';
            }
            throw new IllegalArgumentException(str.toString());
        }
        return new C8963gd<>(abstractC8899fS);
    }

    private static final <VM extends AbstractC8899fS<S>, S extends InterfaceC8888fH> VM e(Class<VM> cls, S s) {
        if (cls.getConstructors().length == 1) {
            Constructor<?> constructor = cls.getConstructors()[0];
            if (constructor.getParameterTypes().length == 1 && constructor.getParameterTypes()[0].isAssignableFrom(s.getClass())) {
                if (!constructor.isAccessible()) {
                    try {
                        constructor.setAccessible(true);
                    } catch (SecurityException e) {
                        throw new IllegalStateException("ViewModel class is not public and Mavericks could not make the primary constructor accessible.", e);
                    }
                }
                Object newInstance = constructor.newInstance(s);
                if (newInstance instanceof AbstractC8899fS) {
                    return (VM) newInstance;
                }
            }
        }
        return null;
    }
}
