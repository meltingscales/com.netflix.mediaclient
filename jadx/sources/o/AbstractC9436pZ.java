package o;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: o.pZ  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9436pZ {
    private static final Class<?> a;
    private static final Class<?> b;
    private static final Class<?> c;
    private static final Class<?> d = Arrays.asList(null, null).getClass();
    private static final Class<?> e;
    private static final Class<?> g;
    private static final Class<?> i;
    private static final Class<?> j;

    static {
        Boolean bool = Boolean.TRUE;
        Set singleton = Collections.singleton(bool);
        c = singleton.getClass();
        j = Collections.unmodifiableSet(singleton).getClass();
        List singletonList = Collections.singletonList(bool);
        e = singletonList.getClass();
        b = Collections.unmodifiableList(singletonList).getClass();
        g = Collections.unmodifiableList(new LinkedList()).getClass();
        Map singletonMap = Collections.singletonMap("a", "b");
        a = singletonMap.getClass();
        i = Collections.unmodifiableMap(singletonMap).getClass();
    }

    public static AbstractC9452pp<?> d(DeserializationContext deserializationContext, JavaType javaType) {
        b a2;
        if (javaType.d(d)) {
            a2 = a(7, javaType, List.class);
        } else if (javaType.d(e)) {
            a2 = a(2, javaType, List.class);
        } else if (javaType.d(c)) {
            a2 = a(1, javaType, Set.class);
        } else if (javaType.d(b) || javaType.d(g)) {
            a2 = a(5, javaType, List.class);
        } else if (!javaType.d(j)) {
            return null;
        } else {
            a2 = a(4, javaType, Set.class);
        }
        return new StdDelegatingDeserializer(a2);
    }

    public static AbstractC9452pp<?> a(DeserializationContext deserializationContext, JavaType javaType) {
        b a2;
        if (javaType.d(a)) {
            a2 = a(3, javaType, Map.class);
        } else if (!javaType.d(i)) {
            return null;
        } else {
            a2 = a(6, javaType, Map.class);
        }
        return new StdDelegatingDeserializer(a2);
    }

    static b a(int i2, JavaType javaType, Class<?> cls) {
        return new b(i2, javaType.c(cls));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.pZ$b */
    /* loaded from: classes5.dex */
    public static class b implements InterfaceC9535rS<Object, Object> {
        private final JavaType b;
        private final int c;

        @Override // o.InterfaceC9535rS
        public JavaType a(TypeFactory typeFactory) {
            return this.b;
        }

        @Override // o.InterfaceC9535rS
        public JavaType d(TypeFactory typeFactory) {
            return this.b;
        }

        private b(int i, JavaType javaType) {
            this.b = javaType;
            this.c = i;
        }

        @Override // o.InterfaceC9535rS
        public Object d(Object obj) {
            if (obj == null) {
                return null;
            }
            switch (this.c) {
                case 1:
                    Set set = (Set) obj;
                    c(set.size());
                    return Collections.singleton(set.iterator().next());
                case 2:
                    List list = (List) obj;
                    c(list.size());
                    return Collections.singletonList(list.get(0));
                case 3:
                    Map map = (Map) obj;
                    c(map.size());
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    return Collections.singletonMap(entry.getKey(), entry.getValue());
                case 4:
                    return Collections.unmodifiableSet((Set) obj);
                case 5:
                    return Collections.unmodifiableList((List) obj);
                case 6:
                    return Collections.unmodifiableMap((Map) obj);
                default:
                    return obj;
            }
        }

        private void c(int i) {
            if (i == 1) {
                return;
            }
            throw new IllegalArgumentException("Can not deserialize Singleton container from " + i + " entries");
        }
    }
}
