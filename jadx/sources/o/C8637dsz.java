package o;

import java.util.List;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;

/* renamed from: o.dsz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8637dsz {
    public dtD a(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public dtE a(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public dtF a(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    public InterfaceC8664dtz b(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public dtA d(FunctionReference functionReference) {
        return functionReference;
    }

    public InterfaceC8661dtw a(Class cls, String str) {
        return new C8636dsy(cls, str);
    }

    public InterfaceC8660dtv d(Class cls) {
        return new C8630dss(cls);
    }

    public String c(Lambda lambda) {
        return e(lambda);
    }

    public String e(InterfaceC8633dsv interfaceC8633dsv) {
        String obj = interfaceC8633dsv.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public dtH e(InterfaceC8662dtx interfaceC8662dtx, List<dtJ> list, boolean z) {
        return new dsG(interfaceC8662dtx, list, z);
    }
}
