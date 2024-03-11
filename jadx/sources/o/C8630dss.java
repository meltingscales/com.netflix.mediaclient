package o;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.jvm.KotlinReflectionNotSupportedError;

/* renamed from: o.dss  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8630dss implements InterfaceC8660dtv<Object>, InterfaceC8622dsk {
    private static final Map<Class<? extends InterfaceC8555dpy<?>>, Integer> a;
    private static final HashMap<String, String> b;
    private static final HashMap<String, String> c;
    public static final c d = new c(null);
    private static final HashMap<String, String> e;
    private static final Map<String, String> f;
    private final Class<?> j;

    @Override // o.InterfaceC8622dsk
    public Class<?> d() {
        return this.j;
    }

    public C8630dss(Class<?> cls) {
        C8632dsu.c((Object) cls, "");
        this.j = cls;
    }

    @Override // o.InterfaceC8660dtv
    public String b() {
        return d.d(d());
    }

    @Override // o.InterfaceC8659dtu
    public List<Annotation> getAnnotations() {
        e();
        throw new KotlinNothingValueException();
    }

    @Override // o.InterfaceC8660dtv
    public boolean d(Object obj) {
        return d.a(obj, d());
    }

    private final Void e() {
        throw new KotlinReflectionNotSupportedError();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8630dss) && C8632dsu.c(drI.d(this), drI.d((InterfaceC8660dtv) obj));
    }

    public int hashCode() {
        return drI.d(this).hashCode();
    }

    public String toString() {
        return d().toString() + " (Kotlin reflection is not available)";
    }

    /* renamed from: o.dss$c */
    /* loaded from: classes5.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
            if (r2 == null) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String d(java.lang.Class<?> r7) {
            /*
                r6 = this;
                java.lang.String r0 = ""
                o.C8632dsu.c(r7, r0)
                boolean r0 = r7.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto Lb4
            Le:
                boolean r0 = r7.isLocalClass()
                if (r0 == 0) goto L6a
                java.lang.String r0 = r7.getSimpleName()
                java.lang.reflect.Method r2 = r7.getEnclosingMethod()
                r3 = 2
                r4 = 36
                if (r2 == 0) goto L41
                o.C8632dsu.d(r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = r2.getName()
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                java.lang.String r2 = o.C8684dus.c(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L3e
                goto L41
            L3e:
                r1 = r2
                goto Lb4
            L41:
                java.lang.reflect.Constructor r7 = r7.getEnclosingConstructor()
                if (r7 == 0) goto L62
                o.C8632dsu.d(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = r7.getName()
                r2.append(r7)
                r2.append(r4)
                java.lang.String r7 = r2.toString()
                java.lang.String r1 = o.C8684dus.c(r0, r7, r1, r3, r1)
                goto Lb4
            L62:
                o.C8632dsu.d(r0)
                java.lang.String r1 = o.C8684dus.c(r0, r4, r1, r3, r1)
                goto Lb4
            L6a:
                boolean r0 = r7.isArray()
                if (r0 == 0) goto L9f
                java.lang.Class r7 = r7.getComponentType()
                boolean r0 = r7.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L9c
                java.util.Map r0 = o.C8630dss.c()
                java.lang.String r7 = r7.getName()
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L9c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                r0.append(r2)
                java.lang.String r7 = r0.toString()
                r1 = r7
            L9c:
                if (r1 != 0) goto Lb4
                goto L3e
            L9f:
                java.util.Map r0 = o.C8630dss.c()
                java.lang.String r1 = r7.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lb4
                java.lang.String r1 = r7.getSimpleName()
            Lb4:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C8630dss.c.d(java.lang.Class):java.lang.String");
        }

        public final boolean a(Object obj, Class<?> cls) {
            C8632dsu.c((Object) cls, "");
            Map map = C8630dss.a;
            C8632dsu.d(map);
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                return dsH.c(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = drI.d(drI.b(cls));
            }
            return cls.isInstance(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List j;
        int d2;
        Map<Class<? extends InterfaceC8555dpy<?>>, Integer> d3;
        int e2;
        String f2;
        String f3;
        j = C8569dql.j(drO.class, drM.class, drX.class, InterfaceC8612dsa.class, InterfaceC8613dsb.class, InterfaceC8615dsd.class, InterfaceC8619dsh.class, InterfaceC8620dsi.class, InterfaceC8618dsg.class, InterfaceC8617dsf.class, drK.class, drL.class, drT.class, drP.class, drQ.class, drR.class, drS.class, drW.class, drV.class, drY.class, drU.class, InterfaceC8614dsc.class, drZ.class);
        d2 = C8572dqo.d(j, 10);
        ArrayList arrayList = new ArrayList(d2);
        int i = 0;
        for (Object obj : j) {
            if (i < 0) {
                C8569dql.h();
            }
            arrayList.add(dpD.a((Class) obj, Integer.valueOf(i)));
            i++;
        }
        d3 = dqE.d(arrayList);
        a = d3;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        b = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        c = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C8632dsu.a(values, "");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C8632dsu.d((Object) str);
            f3 = duD.f(str, '.', (String) null, 2, (Object) null);
            sb.append(f3);
            sb.append("CompanionObject");
            Pair a2 = dpD.a(sb.toString(), str + ".Companion");
            hashMap3.put(a2.d(), a2.a());
        }
        for (Map.Entry<Class<? extends InterfaceC8555dpy<?>>, Integer> entry : a.entrySet()) {
            int intValue = entry.getValue().intValue();
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + intValue);
        }
        e = hashMap3;
        e2 = dqD.e(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            f2 = duD.f((String) entry2.getValue(), '.', (String) null, 2, (Object) null);
            linkedHashMap.put(key, f2);
        }
        f = linkedHashMap;
    }
}
