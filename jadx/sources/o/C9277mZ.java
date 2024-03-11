package o;

import com.bugsnag.android.repackaged.dslplatform.json.ConfigurationException;
import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import com.bugsnag.android.repackaged.dslplatform.json.SerializationException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import o.C9337ng;
import org.w3c.dom.Element;

/* renamed from: o.mZ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9277mZ<TContext> implements InterfaceC9344nn, InterfaceC9342nl {
    private final int A;
    private final ConcurrentMap<Type, JsonReader.d> B;
    private final int C;
    private final ConcurrentMap<Class<?>, JsonReader.a<InterfaceC9333nc>> D;
    private final ConcurrentMap<Type, C9337ng.a> E;
    private final JsonReader.UnknownNumberParsing F;
    private final int G;
    private final int H;
    private final ConcurrentMap<Class<?>, Class<?>> I;
    protected final List<e<Object>> a;
    protected final InterfaceC9338nh b;
    public final boolean c;
    public final TContext d;
    protected final b<TContext> e;
    protected final List<e<JsonReader.d>> f;
    protected final ThreadLocal<JsonReader> g;
    protected final InterfaceC9338nh h;
    public final boolean i;
    protected final ThreadLocal<C9337ng> j;
    protected final List<e<C9337ng.a>> k;
    private final C9337ng.a p;
    private final C9337ng.a<InterfaceC9333nc> q;
    private final ConcurrentMap<Type, Object> r;
    private final C9337ng.a s;
    private final Map<Type, Object> u;
    private final JsonReader.DoublePrecision v;
    private final C9275mX w;
    private final JsonReader.ErrorInfo x;
    private final Map<Class<? extends Annotation>, Boolean> y;
    private final int z;
    private static final Charset m = Charset.forName("UTF-8");
    private static final Object t = new Object();
    private static final Iterator n = new Iterator() { // from class: o.mZ.1
        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    };

    /* renamed from: o  reason: collision with root package name */
    private static final C9337ng.a f13880o = new C9337ng.a() { // from class: o.mZ.10
        @Override // o.C9337ng.a
        public void b(C9337ng c9337ng, Object obj) {
            AbstractC9339ni.d(new String((char[]) obj), c9337ng);
        }
    };
    private static final byte[] l = {110, 117, 108, 108};

    /* renamed from: o.mZ$b */
    /* loaded from: classes2.dex */
    public interface b<TContext> {
        Object a(TContext tcontext, Type type, InputStream inputStream);

        void e(Object obj, OutputStream outputStream);
    }

    /* renamed from: o.mZ$e */
    /* loaded from: classes2.dex */
    public interface e<T> {
        T e(Type type, C9277mZ c9277mZ);
    }

    /* renamed from: o.mZ$a */
    /* loaded from: classes2.dex */
    public static class a<TContext> {
        private TContext a;
        private boolean b;
        private b<TContext> f;
        private int j;
        private boolean l;
        private boolean m;
        private InterfaceC9338nh q;
        private InterfaceC9338nh k = new c();
        private JsonReader.ErrorInfo h = JsonReader.ErrorInfo.WITH_STACK_TRACE;
        private JsonReader.DoublePrecision i = JsonReader.DoublePrecision.DEFAULT;
        private JsonReader.UnknownNumberParsing r = JsonReader.UnknownNumberParsing.LONG_AND_BIGDECIMAL;

        /* renamed from: o  reason: collision with root package name */
        private int f13881o = 512;
        private int n = 134217728;
        private final List<InterfaceC9331na> e = new ArrayList();
        private final List<e<C9337ng.a>> p = new ArrayList();
        private final List<e<JsonReader.d>> t = new ArrayList();
        private final List<e<Object>> d = new ArrayList();
        private final Set<ClassLoader> c = new HashSet();
        private final Map<Class<? extends Annotation>, Boolean> g = new HashMap();

        @Deprecated
        public a<TContext> c(b<TContext> bVar) {
            this.f = bVar;
            return this;
        }

        public a<TContext> c() {
            return d(Thread.currentThread().getContextClassLoader());
        }

        public a<TContext> d(ClassLoader classLoader) {
            if (classLoader == null) {
                throw new IllegalArgumentException("loader can't be null");
            }
            this.c.add(classLoader);
            Iterator it = ServiceLoader.load(InterfaceC9331na.class, classLoader).iterator();
            while (it.hasNext()) {
                InterfaceC9331na interfaceC9331na = (InterfaceC9331na) it.next();
                Class<?> cls = interfaceC9331na.getClass();
                Iterator<InterfaceC9331na> it2 = this.e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (it2.next().getClass() == cls) {
                            break;
                        }
                    } else {
                        this.j++;
                        this.e.add(interfaceC9331na);
                        break;
                    }
                }
            }
            return this;
        }
    }

    public C9277mZ() {
        this(new a().c());
    }

    public C9277mZ(a<TContext> aVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.k = copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.f = copyOnWriteArrayList2;
        CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
        this.a = copyOnWriteArrayList3;
        this.u = new ConcurrentHashMap();
        this.D = new ConcurrentHashMap();
        this.B = new ConcurrentHashMap();
        this.r = new ConcurrentHashMap();
        this.E = new ConcurrentHashMap();
        this.I = new ConcurrentHashMap();
        this.q = new C9337ng.a<InterfaceC9333nc>() { // from class: o.mZ.3
            @Override // o.C9337ng.a
            /* renamed from: e */
            public void b(C9337ng c9337ng, InterfaceC9333nc interfaceC9333nc) {
                if (interfaceC9333nc == null) {
                    c9337ng.b();
                } else {
                    interfaceC9333nc.d(c9337ng, C9277mZ.this.i);
                }
            }
        };
        this.p = new C9337ng.a() { // from class: o.mZ.6
            @Override // o.C9337ng.a
            public void b(C9337ng c9337ng, Object obj) {
                C9277mZ.this.e(c9337ng, (InterfaceC9333nc[]) obj);
            }
        };
        this.s = new C9337ng.a() { // from class: o.mZ.8
            @Override // o.C9337ng.a
            public void b(C9337ng c9337ng, Object obj) {
                c9337ng.b();
            }
        };
        if (aVar == null) {
            throw new IllegalArgumentException("settings can't be null");
        }
        this.j = new ThreadLocal<C9337ng>() { // from class: o.mZ.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* renamed from: d */
            public C9337ng initialValue() {
                return new C9337ng(4096, this);
            }
        };
        this.g = new ThreadLocal<JsonReader>() { // from class: o.mZ.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* renamed from: a */
            public JsonReader initialValue() {
                C9277mZ c9277mZ = this;
                return new JsonReader(new byte[4096], 4096, c9277mZ.d, new char[64], c9277mZ.b, c9277mZ.h, c9277mZ, c9277mZ.x, this.v, this.F, this.z, this.A);
            }
        };
        this.d = (TContext) ((a) aVar).a;
        this.e = ((a) aVar).f;
        this.i = ((a) aVar).m;
        this.c = ((a) aVar).b;
        this.b = ((a) aVar).k;
        this.h = ((a) aVar).q;
        this.F = ((a) aVar).r;
        this.x = ((a) aVar).h;
        this.v = ((a) aVar).i;
        this.z = ((a) aVar).f13881o;
        this.A = ((a) aVar).n;
        copyOnWriteArrayList.addAll(((a) aVar).p);
        this.G = ((a) aVar).p.size();
        copyOnWriteArrayList2.addAll(((a) aVar).t);
        this.H = ((a) aVar).t.size();
        copyOnWriteArrayList3.addAll(((a) aVar).d);
        this.C = ((a) aVar).d.size();
        this.w = new C9275mX(((a) aVar).c);
        this.y = new HashMap(((a) aVar).g);
        d(byte[].class, AbstractC9276mY.b);
        b(byte[].class, AbstractC9276mY.a);
        Class<T> cls = Boolean.TYPE;
        d(cls, AbstractC9332nb.b);
        C9337ng.a aVar2 = AbstractC9332nb.f;
        b(cls, aVar2);
        a((Class<Class<T>>) cls, (Class<T>) Boolean.FALSE);
        d(boolean[].class, AbstractC9332nb.a);
        b(boolean[].class, AbstractC9332nb.d);
        d(Boolean.class, AbstractC9332nb.e);
        b(Boolean.class, aVar2);
        if (((a) aVar).l) {
            i(this);
        }
        JsonReader.d dVar = AbstractC9340nj.c;
        d(LinkedHashMap.class, dVar);
        d(HashMap.class, dVar);
        d(Map.class, dVar);
        b(Map.class, new C9337ng.a<Map>() { // from class: o.mZ.5
            @Override // o.C9337ng.a
            public void b(C9337ng c9337ng, Map map) {
                if (map == null) {
                    c9337ng.b();
                    return;
                }
                try {
                    C9277mZ.this.d(map, c9337ng);
                } catch (IOException e2) {
                    throw new SerializationException(e2);
                }
            }
        });
        d(URI.class, AbstractC9335ne.a);
        b(URI.class, AbstractC9335ne.b);
        d(InetAddress.class, AbstractC9335ne.d);
        b(InetAddress.class, AbstractC9335ne.e);
        Class<T> cls2 = Double.TYPE;
        d(cls2, AbstractC9336nf.e);
        C9337ng.a aVar3 = AbstractC9336nf.c;
        b(cls2, aVar3);
        a((Class<Class<T>>) cls2, (Class<T>) Double.valueOf(0.0d));
        d(double[].class, AbstractC9336nf.b);
        b(double[].class, AbstractC9336nf.d);
        d(Double.class, AbstractC9336nf.D);
        b(Double.class, aVar3);
        Class<T> cls3 = Float.TYPE;
        d(cls3, AbstractC9336nf.n);
        C9337ng.a aVar4 = AbstractC9336nf.k;
        b(cls3, aVar4);
        a((Class<Class<T>>) cls3, (Class<T>) Float.valueOf(0.0f));
        d(float[].class, AbstractC9336nf.j);
        b(float[].class, AbstractC9336nf.f);
        d(Float.class, AbstractC9336nf.C);
        b(Float.class, aVar4);
        Class<T> cls4 = Integer.TYPE;
        d(cls4, AbstractC9336nf.p);
        C9337ng.a aVar5 = AbstractC9336nf.s;
        b(cls4, aVar5);
        a((Class<Class<T>>) cls4, (Class<T>) 0);
        d(int[].class, AbstractC9336nf.l);
        b(int[].class, AbstractC9336nf.q);
        d(Integer.class, AbstractC9336nf.A);
        b(Integer.class, aVar5);
        Class<T> cls5 = Short.TYPE;
        d(cls5, AbstractC9336nf.N);
        C9337ng.a aVar6 = AbstractC9336nf.L;
        b(cls5, aVar6);
        a((Class<Class<T>>) cls5, (Class<T>) (short) 0);
        d(short[].class, AbstractC9336nf.F);
        b(short[].class, AbstractC9336nf.H);
        d(Short.class, AbstractC9336nf.E);
        b(Short.class, aVar6);
        Class<T> cls6 = Long.TYPE;
        d(cls6, AbstractC9336nf.x);
        C9337ng.a aVar7 = AbstractC9336nf.u;
        b(cls6, aVar7);
        a((Class<Class<T>>) cls6, (Class<T>) 0L);
        d(long[].class, AbstractC9336nf.v);
        b(long[].class, AbstractC9336nf.y);
        d(Long.class, AbstractC9336nf.B);
        b(Long.class, aVar7);
        d(BigDecimal.class, AbstractC9336nf.i);
        b(BigDecimal.class, AbstractC9336nf.g);
        d(String.class, AbstractC9339ni.d);
        b(String.class, AbstractC9339ni.c);
        d(UUID.class, AbstractC9341nk.c);
        b(UUID.class, AbstractC9341nk.e);
        d(Number.class, AbstractC9336nf.G);
        b(CharSequence.class, AbstractC9339ni.b);
        d(StringBuilder.class, AbstractC9339ni.e);
        d(StringBuffer.class, AbstractC9339ni.a);
        for (InterfaceC9331na interfaceC9331na : ((a) aVar).e) {
            interfaceC9331na.c(this);
        }
        if (((a) aVar).c.isEmpty() || ((a) aVar).j != 0) {
            return;
        }
        c(this, ((a) aVar).c, "dsl_json_Annotation_Processor_External_Serialization");
        c(this, ((a) aVar).c, "dsl_json.json.ExternalSerialization");
        c(this, ((a) aVar).c, "dsl_json_ExternalSerialization");
    }

    /* renamed from: o.mZ$c */
    /* loaded from: classes2.dex */
    public static class c implements InterfaceC9338nh {
        private final String[] c;
        private final int e;

        public c() {
            this(10);
        }

        public c(int i) {
            int i2 = 2;
            for (int i3 = 1; i3 < i; i3++) {
                i2 *= 2;
            }
            this.e = i2 - 1;
            this.c = new String[i2];
        }

        @Override // o.InterfaceC9338nh
        public String d(char[] cArr, int i) {
            long j = -2128831035;
            for (int i2 = 0; i2 < i; i2++) {
                j = (j ^ ((byte) cArr[i2])) * 16777619;
            }
            int i3 = ((int) j) & this.e;
            String str = this.c[i3];
            if (str == null) {
                return a(i3, cArr, i);
            }
            if (str.length() != i) {
                return a(i3, cArr, i);
            }
            for (int i4 = 0; i4 < str.length(); i4++) {
                if (str.charAt(i4) != cArr[i4]) {
                    return a(i3, cArr, i);
                }
            }
            return str;
        }

        private String a(int i, char[] cArr, int i2) {
            String str = new String(cArr, 0, i2);
            this.c[i] = str;
            return str;
        }
    }

    private static void c(C9277mZ c9277mZ, Set<ClassLoader> set, String str) {
        for (ClassLoader classLoader : set) {
            try {
                ((InterfaceC9331na) classLoader.loadClass(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).c(c9277mZ);
            } catch (Exception | NoClassDefFoundError unused) {
            }
        }
    }

    static void i(C9277mZ c9277mZ) {
        c9277mZ.d(Element.class, AbstractC9347nq.b);
        c9277mZ.b(Element.class, AbstractC9347nq.d);
    }

    public <T> void a(Class<T> cls, T t2) {
        this.u.put(cls, t2);
    }

    public <T, S extends T> void d(Class<T> cls, JsonReader.d<S> dVar) {
        if (dVar == null) {
            this.B.remove(cls);
        } else {
            this.B.put(cls, dVar);
        }
    }

    public <T> void b(Class<T> cls, C9337ng.a<T> aVar) {
        if (aVar == null) {
            this.I.remove(cls);
            this.E.remove(cls);
            return;
        }
        this.I.put(cls, cls);
        this.E.put(cls, aVar);
    }

    public C9337ng.a<?> c(Type type) {
        C9337ng.a<?> aVar;
        C9337ng.a<?> aVar2 = this.E.get(type);
        if (aVar2 != null) {
            return aVar2;
        }
        Type b2 = b(type);
        if (b2 != type && (aVar = this.E.get(b2)) != null) {
            this.E.putIfAbsent(type, aVar);
            return aVar;
        }
        boolean z = b2 instanceof Class;
        if (z && InterfaceC9333nc.class.isAssignableFrom((Class) b2)) {
            this.E.putIfAbsent(type, this.q);
            return this.q;
        }
        C9337ng.a<?> aVar3 = (C9337ng.a) e(type, b2, this.k, this.E);
        if (aVar3 != null) {
            return aVar3;
        }
        if (z) {
            Class<?> cls = this.I.get(b2);
            if (cls != null) {
                return this.E.get(cls);
            }
            Class<?> cls2 = (Class) b2;
            ArrayList arrayList = new ArrayList();
            d(cls2, arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Class<?> cls3 = (Class) it.next();
                C9337ng.a<?> aVar4 = this.E.get(cls3);
                if (aVar4 == null) {
                    aVar4 = (C9337ng.a) e(type, cls3, this.k, this.E);
                    continue;
                }
                if (aVar4 != null) {
                    this.I.putIfAbsent(cls2, cls3);
                    return aVar4;
                }
            }
            return null;
        }
        return null;
    }

    private static Type b(Type type) {
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            return (wildcardType.getUpperBounds().length == 1 && wildcardType.getLowerBounds().length == 0) ? wildcardType.getUpperBounds()[0] : type;
        }
        return type;
    }

    private <T> void a(Type type, ConcurrentMap<Type, T> concurrentMap) {
        Type[] actualTypeArguments;
        Type b2;
        if (type instanceof Class) {
            this.w.d((Class) type, this);
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            this.w.d((Class) parameterizedType.getRawType(), this);
            for (Type type2 : parameterizedType.getActualTypeArguments()) {
                if (!concurrentMap.containsKey(type2) && (b2 = b(type2)) != type2 && !concurrentMap.containsKey(b2)) {
                    a(b2, concurrentMap);
                }
            }
        }
    }

    private <T> T e(Type type, Type type2, List<e<T>> list, ConcurrentMap<Type, T> concurrentMap) {
        if (type2 instanceof Class) {
            this.w.d((Class) type2, this);
            T t2 = concurrentMap.get(type2);
            if (t2 != null) {
                return t2;
            }
        } else if (type2 instanceof ParameterizedType) {
            a(type2, concurrentMap);
        }
        for (e<T> eVar : list) {
            T e2 = eVar.e(type2, this);
            if (e2 != null) {
                concurrentMap.putIfAbsent(type, e2);
                return e2;
            }
        }
        return null;
    }

    public JsonReader.d<?> e(Type type) {
        JsonReader.a<InterfaceC9333nc> c2;
        JsonReader.d<?> dVar;
        JsonReader.d<?> dVar2 = this.B.get(type);
        if (dVar2 != null) {
            return dVar2;
        }
        Type b2 = b(type);
        if (b2 != type && (dVar = this.B.get(b2)) != null) {
            this.B.putIfAbsent(type, dVar);
            return dVar;
        }
        if (b2 instanceof Class) {
            Class<?> cls = (Class) b2;
            if (InterfaceC9333nc.class.isAssignableFrom(cls) && (c2 = c(cls)) != null) {
                JsonReader.d c3 = c(c2);
                this.B.putIfAbsent(type, c3);
                return c3;
            }
        }
        return (JsonReader.d) e(type, b2, this.f, this.B);
    }

    public <T> C9337ng.a<T> e(Class<T> cls) {
        return (C9337ng.a<T>) c(cls);
    }

    public <T> JsonReader.d<T> d(Class<T> cls) {
        return (JsonReader.d<T>) e((Type) cls);
    }

    private static void d(Class<?> cls, ArrayList<Class<?>> arrayList) {
        if (arrayList.contains(cls)) {
            return;
        }
        arrayList.add(cls);
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && superclass != Object.class) {
            d(superclass, arrayList);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            d(cls2, arrayList);
        }
    }

    private JsonReader.a<InterfaceC9333nc> c(Class<?> cls, Object obj) {
        Object invoke;
        try {
            invoke = cls.getField("JSON_READER").get(obj);
        } catch (Exception unused) {
            try {
                try {
                    invoke = cls.getMethod("JSON_READER", new Class[0]).invoke(obj, new Object[0]);
                } catch (Exception unused2) {
                    invoke = cls.getMethod("getJSON_READER", new Class[0]).invoke(obj, new Object[0]);
                }
            } catch (Exception unused3) {
            }
        }
        if (invoke instanceof JsonReader.a) {
            return (JsonReader.a) invoke;
        }
        return null;
    }

    protected final JsonReader.a<InterfaceC9333nc> c(Class<?> cls) {
        try {
            JsonReader.a<InterfaceC9333nc> aVar = this.D.get(cls);
            if (aVar == null) {
                aVar = c(cls, (Object) null);
                if (aVar == null) {
                    try {
                        Object obj = cls.getField("Companion").get(null);
                        aVar = c(obj.getClass(), obj);
                    } catch (Exception unused) {
                        return null;
                    }
                }
                if (aVar != null) {
                    this.D.putIfAbsent(cls, aVar);
                }
            }
            return aVar;
        } catch (Exception unused2) {
            return null;
        }
    }

    public void d(Map<String, Object> map, C9337ng c9337ng) {
        c9337ng.b((byte) 123);
        int size = map.size();
        if (size > 0) {
            Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
            Map.Entry<String, Object> next = it.next();
            c9337ng.a(next.getKey());
            c9337ng.b((byte) 58);
            e(c9337ng, next.getValue());
            for (int i = 1; i < size; i++) {
                c9337ng.b((byte) 44);
                Map.Entry<String, Object> next2 = it.next();
                c9337ng.a(next2.getKey());
                c9337ng.b((byte) 58);
                e(c9337ng, next2.getValue());
            }
        }
        c9337ng.b((byte) 125);
    }

    private static Object c(Class<?> cls, List<?> list) {
        int i = 0;
        if (cls.isPrimitive()) {
            if (Boolean.TYPE.equals(cls)) {
                boolean[] zArr = new boolean[list.size()];
                while (i < list.size()) {
                    zArr[i] = ((Boolean) list.get(i)).booleanValue();
                    i++;
                }
                return zArr;
            } else if (Integer.TYPE.equals(cls)) {
                int[] iArr = new int[list.size()];
                while (i < list.size()) {
                    iArr[i] = ((Integer) list.get(i)).intValue();
                    i++;
                }
                return iArr;
            } else if (Long.TYPE.equals(cls)) {
                long[] jArr = new long[list.size()];
                while (i < list.size()) {
                    jArr[i] = ((Long) list.get(i)).longValue();
                    i++;
                }
                return jArr;
            } else if (Short.TYPE.equals(cls)) {
                short[] sArr = new short[list.size()];
                while (i < list.size()) {
                    sArr[i] = ((Short) list.get(i)).shortValue();
                    i++;
                }
                return sArr;
            } else if (Byte.TYPE.equals(cls)) {
                byte[] bArr = new byte[list.size()];
                while (i < list.size()) {
                    bArr[i] = ((Byte) list.get(i)).byteValue();
                    i++;
                }
                return bArr;
            } else if (Float.TYPE.equals(cls)) {
                float[] fArr = new float[list.size()];
                while (i < list.size()) {
                    fArr[i] = ((Float) list.get(i)).floatValue();
                    i++;
                }
                return fArr;
            } else if (Double.TYPE.equals(cls)) {
                double[] dArr = new double[list.size()];
                while (i < list.size()) {
                    dArr[i] = ((Double) list.get(i)).doubleValue();
                    i++;
                }
                return dArr;
            } else if (Character.TYPE.equals(cls)) {
                char[] cArr = new char[list.size()];
                while (i < list.size()) {
                    cArr[i] = ((Character) list.get(i)).charValue();
                    i++;
                }
                return cArr;
            }
        }
        return list.toArray((Object[]) Array.newInstance(cls, 0));
    }

    protected IOException b(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        d(cls, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Class cls2 = (Class) it.next();
            if (this.B.containsKey(cls2)) {
                if (cls2.equals(cls)) {
                    return new IOException("Reader for provided type: " + cls + " is disabled and fallback serialization is not registered (converter is registered as null).\nTry initializing system with custom fallback or don't register null for " + cls);
                }
                return new IOException("Unable to find reader for provided type: " + cls + " and fallback serialization is not registered.\nFound reader for: " + cls2 + " so try deserializing into that instead?\nAlternatively, try initializing system with custom fallback or register specified type using registerReader into " + getClass());
            }
        }
        return new IOException("Unable to find reader for provided type: " + cls + " and fallback serialization is not registered.\nTry initializing DslJson with custom fallback in case of unsupported objects or register specified type using registerReader into " + getClass());
    }

    public <TResult> TResult e(Class<TResult> cls, InputStream inputStream) {
        if (cls != null) {
            if (inputStream == null) {
                throw new IllegalArgumentException("stream can't be null");
            }
            JsonReader<TContext> c2 = this.g.get().c(inputStream);
            try {
                return (TResult) e(cls, c2, inputStream);
            } finally {
                c2.m();
            }
        }
        throw new IllegalArgumentException("manifest can't be null");
    }

    protected <TResult> TResult e(Class<TResult> cls, JsonReader jsonReader, InputStream inputStream) {
        JsonReader.a<InterfaceC9333nc> c2;
        jsonReader.d();
        JsonReader.d<T> d2 = d(cls);
        if (d2 != 0) {
            return (TResult) d2.d(jsonReader);
        }
        if (cls.isArray()) {
            if (jsonReader.q()) {
                return null;
            }
            if (jsonReader.i() != 91) {
                throw jsonReader.a("Expecting '[' for array start");
            }
            Class componentType = cls.getComponentType();
            if (jsonReader.d() == 93) {
                return (TResult) Array.newInstance(componentType, 0);
            }
            if (InterfaceC9333nc.class.isAssignableFrom(componentType) && (c2 = c((Class<?>) componentType)) != null) {
                return (TResult) c((Class<?>) componentType, (List<?>) jsonReader.b(c2));
            }
            Object d3 = d(componentType);
            if (d3 != null) {
                return (TResult) c((Class<?>) componentType, (List<?>) jsonReader.e(d3));
            }
        }
        b<TContext> bVar = this.e;
        if (bVar != null) {
            return (TResult) bVar.a(this.d, cls, new d(jsonReader.c, inputStream));
        }
        throw b((Class<?>) cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.mZ$d */
    /* loaded from: classes2.dex */
    public static class d extends InputStream {
        private boolean b = true;
        private final InputStream c;
        private final byte[] d;
        private int e;

        d(byte[] bArr, InputStream inputStream) {
            this.d = bArr;
            this.c = inputStream;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.b) {
                int i = this.e;
                byte[] bArr = this.d;
                if (i < bArr.length) {
                    this.e = i + 1;
                    return bArr[i];
                }
                this.b = false;
            }
            return this.c.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) {
            if (this.b) {
                return super.read(bArr);
            }
            return this.c.read(bArr);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (this.b) {
                return super.read(bArr, i, i2);
            }
            return this.c.read(bArr, i, i2);
        }
    }

    private <T extends InterfaceC9333nc> JsonReader.d<T> c(final JsonReader.a<T> aVar) {
        return (JsonReader.d<T>) new JsonReader.d<T>() { // from class: o.mZ.7
            /* JADX WARN: Incorrect return type in method signature: (Lcom/bugsnag/android/repackaged/dslplatform/json/JsonReader;)TT; */
            @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
            /* renamed from: a */
            public InterfaceC9333nc d(JsonReader jsonReader) {
                if (jsonReader.q()) {
                    return null;
                }
                if (jsonReader.i() != 123) {
                    throw jsonReader.a("Expecting '{' for object start");
                }
                jsonReader.d();
                return aVar.b(jsonReader);
            }
        };
    }

    @Deprecated
    public <T extends InterfaceC9333nc> void e(C9337ng c9337ng, T[] tArr) {
        if (tArr == null) {
            c9337ng.b();
            return;
        }
        c9337ng.b((byte) 91);
        if (tArr.length != 0) {
            T t2 = tArr[0];
            if (t2 != null) {
                t2.d(c9337ng, this.i);
            } else {
                c9337ng.b();
            }
            for (int i = 1; i < tArr.length; i++) {
                c9337ng.b((byte) 44);
                T t3 = tArr[i];
                if (t3 != null) {
                    t3.d(c9337ng, this.i);
                } else {
                    c9337ng.b();
                }
            }
        }
        c9337ng.b((byte) 93);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a6, code lost:
        if (r10 != false) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(o.C9337ng r12, java.lang.reflect.Type r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9277mZ.e(o.ng, java.lang.reflect.Type, java.lang.Object):boolean");
    }

    public final void b(Object obj, OutputStream outputStream) {
        if (outputStream == null) {
            throw new IllegalArgumentException("stream can't be null");
        }
        if (obj == null) {
            outputStream.write(l);
            return;
        }
        C9337ng c9337ng = this.j.get();
        c9337ng.c(outputStream);
        Class<?> cls = obj.getClass();
        if (e(c9337ng, cls, obj)) {
            c9337ng.d();
            c9337ng.c((OutputStream) null);
            return;
        }
        b<TContext> bVar = this.e;
        if (bVar == null) {
            throw new ConfigurationException("Unable to serialize provided object. Failed to find serializer for: " + cls);
        }
        bVar.e(obj, outputStream);
    }

    public final void e(C9337ng c9337ng, Object obj) {
        if (c9337ng == null) {
            throw new IllegalArgumentException("writer can't be null");
        }
        if (obj == null) {
            c9337ng.b();
            return;
        }
        Class<?> cls = obj.getClass();
        if (e(c9337ng, cls, obj)) {
            return;
        }
        if (this.e == null) {
            throw new ConfigurationException("Unable to serialize provided object. Failed to find serializer for: " + cls);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.e.e(obj, byteArrayOutputStream);
        c9337ng.e(byteArrayOutputStream.toByteArray());
    }
}
