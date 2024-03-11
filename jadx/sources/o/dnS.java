package o;

import com.squareup.moshi.JsonReader;

/* loaded from: classes5.dex */
public final class dnS<T> extends dnD<T> {
    private final dnD<T> d;

    public dnS(dnD<T> dnd) {
        this.d = dnd;
    }

    @Override // o.dnD
    public T d(JsonReader jsonReader) {
        if (jsonReader.l() == JsonReader.Token.NULL) {
            return (T) jsonReader.o();
        }
        return this.d.d(jsonReader);
    }

    @Override // o.dnD
    public void b(dnK dnk, T t) {
        if (t == null) {
            dnk.b();
        } else {
            this.d.b(dnk, (dnK) t);
        }
    }

    public String toString() {
        return this.d + ".nullSafe()";
    }
}
