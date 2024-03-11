package o;

import java.util.Collections;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;

/* loaded from: classes.dex */
public class dsA {
    private static final InterfaceC8660dtv[] c;
    private static final C8637dsz e;

    static {
        C8637dsz c8637dsz;
        try {
            c8637dsz = (C8637dsz) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            c8637dsz = null;
        }
        if (c8637dsz == null) {
            c8637dsz = new C8637dsz();
        }
        e = c8637dsz;
        c = new InterfaceC8660dtv[0];
    }

    public static InterfaceC8661dtw b(Class cls) {
        return e.a(cls, "");
    }

    public static InterfaceC8661dtw e(Class cls, String str) {
        return e.a(cls, str);
    }

    public static InterfaceC8660dtv a(Class cls) {
        return e.d(cls);
    }

    public static String c(Lambda lambda) {
        return e.c(lambda);
    }

    public static String d(InterfaceC8633dsv interfaceC8633dsv) {
        return e.e(interfaceC8633dsv);
    }

    public static dtA a(FunctionReference functionReference) {
        return e.d(functionReference);
    }

    public static dtD a(PropertyReference0 propertyReference0) {
        return e.a(propertyReference0);
    }

    public static dtE c(PropertyReference1 propertyReference1) {
        return e.a(propertyReference1);
    }

    public static InterfaceC8664dtz b(MutablePropertyReference1 mutablePropertyReference1) {
        return e.b(mutablePropertyReference1);
    }

    public static dtF b(MutablePropertyReference2 mutablePropertyReference2) {
        return e.a(mutablePropertyReference2);
    }

    public static dtH c(Class cls) {
        return e.e(a(cls), Collections.emptyList(), false);
    }

    public static dtH a(Class cls, dtJ dtj) {
        return e.e(a(cls), Collections.singletonList(dtj), false);
    }
}
