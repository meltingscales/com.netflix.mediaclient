package o;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class dnD<T> {

    /* loaded from: classes5.dex */
    public interface b {
        dnD<?> a(Type type, Set<? extends Annotation> set, dnN dnn);
    }

    boolean a() {
        return false;
    }

    public abstract void b(dnK dnk, T t);

    public abstract T d(JsonReader jsonReader);

    public final T b(String str) {
        JsonReader a = JsonReader.a(new C7872dIo().b(str));
        T d = d(a);
        if (a() || a.l() == JsonReader.Token.END_DOCUMENT) {
            return d;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    public final void b(dIq diq, T t) {
        b(dnK.b(diq), (dnK) t);
    }

    public final String d(T t) {
        C7872dIo c7872dIo = new C7872dIo();
        try {
            b((dIq) c7872dIo, (C7872dIo) t);
            return c7872dIo.v();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final dnD<T> c() {
        return this instanceof dnS ? this : new dnS(this);
    }

    public final dnD<T> e() {
        return this instanceof dnW ? this : new dnW(this);
    }
}
