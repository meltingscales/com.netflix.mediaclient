package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* renamed from: o.rS  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC9535rS<IN, OUT> {

    /* renamed from: o.rS$e */
    /* loaded from: classes5.dex */
    public static abstract class e implements InterfaceC9535rS<Object, Object> {
    }

    JavaType a(TypeFactory typeFactory);

    JavaType d(TypeFactory typeFactory);

    OUT d(IN in);
}
