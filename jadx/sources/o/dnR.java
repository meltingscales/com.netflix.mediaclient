package o;

import com.squareup.moshi.JsonReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import o.dnD;

/* loaded from: classes5.dex */
final class dnR<T> extends dnD<T> {
    static final dnD.b a = new dnD.b() { // from class: o.dnR.4
        @Override // o.dnD.b
        public dnD<?> a(Type type, Set<? extends Annotation> set, dnN dnn) {
            return null;
        }
    };

    dnR() {
    }

    @Override // o.dnD
    public T d(JsonReader jsonReader) {
        throw new AssertionError();
    }

    @Override // o.dnD
    public void b(dnK dnk, T t) {
        throw new AssertionError();
    }
}
