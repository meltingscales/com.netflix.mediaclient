package o;

import com.squareup.moshi.JsonReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import o.dnD;

/* renamed from: o.dnx  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C8500dnx extends dnD<Object> {
    public static final dnD.b c = new dnD.b() { // from class: o.dnx.4
        @Override // o.dnD.b
        public dnD<?> a(Type type, Set<? extends Annotation> set, dnN dnn) {
            Type e = dnO.e(type);
            if (e != null && set.isEmpty()) {
                return new C8500dnx(dnO.c(e), dnn.b(e)).c();
            }
            return null;
        }
    };
    private final Class<?> a;
    private final dnD<Object> d;

    C8500dnx(Class<?> cls, dnD<Object> dnd) {
        this.a = cls;
        this.d = dnd;
    }

    @Override // o.dnD
    public Object d(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.a();
        while (jsonReader.h()) {
            arrayList.add(this.d.d(jsonReader));
        }
        jsonReader.c();
        Object newInstance = Array.newInstance(this.a, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    @Override // o.dnD
    public void b(dnK dnk, Object obj) {
        dnk.d();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.d.b(dnk, (dnK) Array.get(obj, i));
        }
        dnk.c();
    }

    public String toString() {
        return this.d + ".array()";
    }
}
