package o;

import com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer;
import com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StackTraceElementDeserializer;
import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.qf  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9495qf {
    private static final HashSet<String> a = new HashSet<>();

    static {
        Class[] clsArr = {UUID.class, AtomicBoolean.class, StackTraceElement.class, ByteBuffer.class, Void.class};
        for (int i = 0; i < 5; i++) {
            a.add(clsArr[i].getName());
        }
        for (Class<?> cls : FromStringDeserializer.j()) {
            a.add(cls.getName());
        }
    }

    public static AbstractC9452pp<?> c(Class<?> cls, String str) {
        if (a.contains(str)) {
            FromStringDeserializer.Std e = FromStringDeserializer.e(cls);
            if (e != null) {
                return e;
            }
            if (cls == UUID.class) {
                return new UUIDDeserializer();
            }
            if (cls == StackTraceElement.class) {
                return new StackTraceElementDeserializer();
            }
            if (cls == AtomicBoolean.class) {
                return new AtomicBooleanDeserializer();
            }
            if (cls == ByteBuffer.class) {
                return new ByteBufferDeserializer();
            }
            if (cls == Void.class) {
                return NullifyingDeserializer.a;
            }
            return null;
        }
        return null;
    }
}
