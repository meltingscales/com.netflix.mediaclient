package o;

import com.squareup.moshi.JsonReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o.dnD;

/* loaded from: classes5.dex */
abstract class dnA<C extends Collection<T>, T> extends dnD<C> {
    public static final dnD.b e = new dnD.b() { // from class: o.dnA.5
        @Override // o.dnD.b
        public dnD<?> a(Type type, Set<? extends Annotation> set, dnN dnn) {
            Class<?> c = dnO.c(type);
            if (set.isEmpty()) {
                if (c == List.class || c == Collection.class) {
                    return dnA.c(type, dnn).c();
                }
                if (c == Set.class) {
                    return dnA.e(type, dnn).c();
                }
                return null;
            }
            return null;
        }
    };
    private final dnD<T> a;

    abstract C d();

    private dnA(dnD<T> dnd) {
        this.a = dnd;
    }

    static <T> dnD<Collection<T>> c(Type type, dnN dnn) {
        return new dnA<Collection<T>, T>(dnn.b(dnO.c(type, Collection.class))) { // from class: o.dnA.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.dnA, o.dnD
            public /* synthetic */ void b(dnK dnk, Object obj) {
                super.b(dnk, (Collection) obj);
            }

            @Override // o.dnA, o.dnD
            public /* synthetic */ Object d(JsonReader jsonReader) {
                return super.d(jsonReader);
            }

            @Override // o.dnA
            Collection<T> d() {
                return new ArrayList();
            }
        };
    }

    static <T> dnD<Set<T>> e(Type type, dnN dnn) {
        return new dnA<Set<T>, T>(dnn.b(dnO.c(type, Collection.class))) { // from class: o.dnA.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.dnA, o.dnD
            public /* synthetic */ void b(dnK dnk, Object obj) {
                super.b(dnk, (Collection) obj);
            }

            @Override // o.dnA, o.dnD
            public /* synthetic */ Object d(JsonReader jsonReader) {
                return super.d(jsonReader);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // o.dnA
            /* renamed from: b */
            public Set<T> d() {
                return new LinkedHashSet();
            }
        };
    }

    @Override // o.dnD
    /* renamed from: e */
    public C d(JsonReader jsonReader) {
        C d = d();
        jsonReader.a();
        while (jsonReader.h()) {
            d.add(this.a.d(jsonReader));
        }
        jsonReader.c();
        return d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.dnD
    /* renamed from: a */
    public void b(dnK dnk, C c) {
        dnk.d();
        for (Object obj : c) {
            this.a.b(dnk, (dnK) obj);
        }
        dnk.c();
    }

    public String toString() {
        return this.a + ".collection()";
    }
}
