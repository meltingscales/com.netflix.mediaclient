package o;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.SerializationException;

/* loaded from: classes5.dex */
public final class dCB {
    public static final Void c(String str, InterfaceC8660dtv<?> interfaceC8660dtv) {
        String str2;
        C8632dsu.c((Object) interfaceC8660dtv, "");
        String str3 = "in the scope of '" + interfaceC8660dtv.b() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default polymorphic serializers were registered " + str3;
        } else {
            str2 = "Class '" + str + "' is not registered for polymorphic serialization " + str3 + ".\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + interfaceC8660dtv.b() + "' has to be sealed and '@Serializable'.\nAlternatively, register the serializer for '" + str + "' explicitly in a corresponding SerializersModule.";
        }
        throw new SerializationException(str2);
    }

    public static final Void b(InterfaceC8660dtv<?> interfaceC8660dtv, InterfaceC8660dtv<?> interfaceC8660dtv2) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        C8632dsu.c((Object) interfaceC8660dtv2, "");
        String b = interfaceC8660dtv.b();
        if (b == null) {
            b = String.valueOf(interfaceC8660dtv);
        }
        c(b, interfaceC8660dtv2);
        throw new KotlinNothingValueException();
    }
}
