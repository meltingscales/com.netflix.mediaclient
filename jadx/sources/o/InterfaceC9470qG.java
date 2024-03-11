package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;

/* renamed from: o.qG  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC9470qG {
    JavaType e(Type type);

    /* renamed from: o.qG$e */
    /* loaded from: classes5.dex */
    public static class e implements InterfaceC9470qG {
        private final TypeBindings d;
        private final TypeFactory e;

        public e(TypeFactory typeFactory, TypeBindings typeBindings) {
            this.e = typeFactory;
            this.d = typeBindings;
        }

        @Override // o.InterfaceC9470qG
        public JavaType e(Type type) {
            return this.e.e(type, this.d);
        }
    }
}
