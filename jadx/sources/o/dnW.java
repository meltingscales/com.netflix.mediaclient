package o;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;

/* loaded from: classes5.dex */
public final class dnW<T> extends dnD<T> {
    private final dnD<T> c;

    public dnW(dnD<T> dnd) {
        this.c = dnd;
    }

    @Override // o.dnD
    public T d(JsonReader jsonReader) {
        if (jsonReader.l() == JsonReader.Token.NULL) {
            throw new JsonDataException("Unexpected null at " + jsonReader.d());
        }
        return this.c.d(jsonReader);
    }

    @Override // o.dnD
    public void b(dnK dnk, T t) {
        if (t == null) {
            throw new JsonDataException("Unexpected null at " + dnk.f());
        }
        this.c.b(dnk, (dnK) t);
    }

    public String toString() {
        return this.c + ".nonNull()";
    }
}
