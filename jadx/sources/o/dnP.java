package o;

import com.fasterxml.jackson.core.JsonFactory;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.dnD;
import org.chromium.net.PrivateKeyType;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class dnP {
    public static final dnD.b d = new dnD.b() { // from class: o.dnP.4
        @Override // o.dnD.b
        public dnD<?> a(Type type, Set<? extends Annotation> set, dnN dnn) {
            if (set.isEmpty()) {
                if (type == Boolean.TYPE) {
                    return dnP.a;
                }
                if (type == Byte.TYPE) {
                    return dnP.b;
                }
                if (type == Character.TYPE) {
                    return dnP.c;
                }
                if (type == Double.TYPE) {
                    return dnP.e;
                }
                if (type == Float.TYPE) {
                    return dnP.j;
                }
                if (type == Integer.TYPE) {
                    return dnP.h;
                }
                if (type == Long.TYPE) {
                    return dnP.g;
                }
                if (type == Short.TYPE) {
                    return dnP.f;
                }
                if (type == Boolean.class) {
                    return dnP.a.c();
                }
                if (type == Byte.class) {
                    return dnP.b.c();
                }
                if (type == Character.class) {
                    return dnP.c.c();
                }
                if (type == Double.class) {
                    return dnP.e.c();
                }
                if (type == Float.class) {
                    return dnP.j.c();
                }
                if (type == Integer.class) {
                    return dnP.h.c();
                }
                if (type == Long.class) {
                    return dnP.g.c();
                }
                if (type == Short.class) {
                    return dnP.f.c();
                }
                if (type == String.class) {
                    return dnP.i.c();
                }
                if (type == Object.class) {
                    return new c(dnn).c();
                }
                Class<?> c2 = dnO.c(type);
                dnD<?> d2 = dnT.d(dnn, type, c2);
                if (d2 != null) {
                    return d2;
                }
                if (c2.isEnum()) {
                    return new b(c2).c();
                }
                return null;
            }
            return null;
        }
    };
    static final dnD<Boolean> a = new dnD<Boolean>() { // from class: o.dnP.3
        public String toString() {
            return "JsonAdapter(Boolean)";
        }

        @Override // o.dnD
        /* renamed from: c */
        public Boolean d(JsonReader jsonReader) {
            return Boolean.valueOf(jsonReader.i());
        }

        @Override // o.dnD
        /* renamed from: c */
        public void b(dnK dnk, Boolean bool) {
            dnk.a(bool.booleanValue());
        }
    };
    static final dnD<Byte> b = new dnD<Byte>() { // from class: o.dnP.5
        public String toString() {
            return "JsonAdapter(Byte)";
        }

        @Override // o.dnD
        /* renamed from: a */
        public Byte d(JsonReader jsonReader) {
            return Byte.valueOf((byte) dnP.e(jsonReader, "a byte", -128, PrivateKeyType.INVALID));
        }

        @Override // o.dnD
        /* renamed from: c */
        public void b(dnK dnk, Byte b2) {
            dnk.e(b2.intValue() & PrivateKeyType.INVALID);
        }
    };
    static final dnD<Character> c = new dnD<Character>() { // from class: o.dnP.6
        public String toString() {
            return "JsonAdapter(Character)";
        }

        @Override // o.dnD
        /* renamed from: b */
        public Character d(JsonReader jsonReader) {
            String m = jsonReader.m();
            if (m.length() > 1) {
                throw new JsonDataException(String.format("Expected %s but was %s at path %s", "a char", JsonFactory.DEFAULT_QUOTE_CHAR + m + JsonFactory.DEFAULT_QUOTE_CHAR, jsonReader.d()));
            }
            return Character.valueOf(m.charAt(0));
        }

        @Override // o.dnD
        public void b(dnK dnk, Character ch) {
            dnk.b(ch.toString());
        }
    };
    static final dnD<Double> e = new dnD<Double>() { // from class: o.dnP.7
        public String toString() {
            return "JsonAdapter(Double)";
        }

        @Override // o.dnD
        /* renamed from: a */
        public Double d(JsonReader jsonReader) {
            return Double.valueOf(jsonReader.g());
        }

        @Override // o.dnD
        public void b(dnK dnk, Double d2) {
            dnk.a(d2.doubleValue());
        }
    };
    static final dnD<Float> j = new dnD<Float>() { // from class: o.dnP.9
        public String toString() {
            return "JsonAdapter(Float)";
        }

        @Override // o.dnD
        /* renamed from: b */
        public Float d(JsonReader jsonReader) {
            float g2 = (float) jsonReader.g();
            if (!jsonReader.j() && Float.isInfinite(g2)) {
                throw new JsonDataException("JSON forbids NaN and infinities: " + g2 + " at path " + jsonReader.d());
            }
            return Float.valueOf(g2);
        }

        @Override // o.dnD
        /* renamed from: a */
        public void b(dnK dnk, Float f2) {
            f2.getClass();
            dnk.e(f2);
        }
    };
    static final dnD<Integer> h = new dnD<Integer>() { // from class: o.dnP.10
        public String toString() {
            return "JsonAdapter(Integer)";
        }

        @Override // o.dnD
        /* renamed from: c */
        public Integer d(JsonReader jsonReader) {
            return Integer.valueOf(jsonReader.f());
        }

        @Override // o.dnD
        /* renamed from: c */
        public void b(dnK dnk, Integer num) {
            dnk.e(num.intValue());
        }
    };
    static final dnD<Long> g = new dnD<Long>() { // from class: o.dnP.8
        public String toString() {
            return "JsonAdapter(Long)";
        }

        @Override // o.dnD
        /* renamed from: e */
        public Long d(JsonReader jsonReader) {
            return Long.valueOf(jsonReader.n());
        }

        @Override // o.dnD
        public void b(dnK dnk, Long l) {
            dnk.e(l.longValue());
        }
    };
    static final dnD<Short> f = new dnD<Short>() { // from class: o.dnP.11
        public String toString() {
            return "JsonAdapter(Short)";
        }

        @Override // o.dnD
        /* renamed from: c */
        public Short d(JsonReader jsonReader) {
            return Short.valueOf((short) dnP.e(jsonReader, "a short", -32768, 32767));
        }

        @Override // o.dnD
        /* renamed from: a */
        public void b(dnK dnk, Short sh) {
            dnk.e(sh.intValue());
        }
    };
    static final dnD<String> i = new dnD<String>() { // from class: o.dnP.2
        public String toString() {
            return "JsonAdapter(String)";
        }

        @Override // o.dnD
        /* renamed from: b */
        public String d(JsonReader jsonReader) {
            return jsonReader.m();
        }

        @Override // o.dnD
        /* renamed from: e */
        public void b(dnK dnk, String str) {
            dnk.b(str);
        }
    };

    static int e(JsonReader jsonReader, String str, int i2, int i3) {
        int f2 = jsonReader.f();
        if (f2 < i2 || f2 > i3) {
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(f2), jsonReader.d()));
        }
        return f2;
    }

    /* loaded from: classes5.dex */
    static final class b<T extends Enum<T>> extends dnD<T> {
        private final String[] b;
        private final T[] c;
        private final JsonReader.c d;
        private final Class<T> e;

        b(Class<T> cls) {
            this.e = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.c = enumConstants;
                this.b = new String[enumConstants.length];
                int i = 0;
                while (true) {
                    T[] tArr = this.c;
                    if (i < tArr.length) {
                        String name = tArr[i].name();
                        this.b[i] = dnT.e(name, cls.getField(name));
                        i++;
                    } else {
                        this.d = JsonReader.c.a(this.b);
                        return;
                    }
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError("Missing field in " + cls.getName(), e);
            }
        }

        @Override // o.dnD
        /* renamed from: e */
        public T d(JsonReader jsonReader) {
            int c = jsonReader.c(this.d);
            if (c != -1) {
                return this.c[c];
            }
            String d = jsonReader.d();
            String m = jsonReader.m();
            throw new JsonDataException("Expected one of " + Arrays.asList(this.b) + " but was " + m + " at path " + d);
        }

        @Override // o.dnD
        /* renamed from: a */
        public void b(dnK dnk, T t) {
            dnk.b(this.b[t.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.e.getName() + ")";
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends dnD<Object> {
        private final dnD<Boolean> a;
        private final dnD<Double> b;
        private final dnD<Map> c;
        private final dnN d;
        private final dnD<List> e;
        private final dnD<String> j;

        public String toString() {
            return "JsonAdapter(Object)";
        }

        c(dnN dnn) {
            this.d = dnn;
            this.e = dnn.b(List.class);
            this.c = dnn.b(Map.class);
            this.j = dnn.b(String.class);
            this.b = dnn.b(Double.class);
            this.a = dnn.b(Boolean.class);
        }

        @Override // o.dnD
        public Object d(JsonReader jsonReader) {
            switch (AnonymousClass1.b[jsonReader.l().ordinal()]) {
                case 1:
                    return this.e.d(jsonReader);
                case 2:
                    return this.c.d(jsonReader);
                case 3:
                    return this.j.d(jsonReader);
                case 4:
                    return this.b.d(jsonReader);
                case 5:
                    return this.a.d(jsonReader);
                case 6:
                    return jsonReader.o();
                default:
                    throw new IllegalStateException("Expected a value but was " + jsonReader.l() + " at path " + jsonReader.d());
            }
        }

        @Override // o.dnD
        public void b(dnK dnk, Object obj) {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                dnk.e();
                dnk.a();
                return;
            }
            this.d.e(d(cls), dnT.c).b(dnk, (dnK) obj);
        }

        private Class<?> d(Class<?> cls) {
            return Map.class.isAssignableFrom(cls) ? Map.class : Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }
    }

    /* renamed from: o.dnP$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            b = iArr;
            try {
                iArr[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[JsonReader.Token.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[JsonReader.Token.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[JsonReader.Token.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[JsonReader.Token.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }
}
