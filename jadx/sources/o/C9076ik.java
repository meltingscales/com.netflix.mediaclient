package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.apollographql.apollo3.exception.JsonDataException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: o.ik  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9076ik implements JsonReader {
    public static final c c = new c(null);
    private Map<String, Object>[] a;
    private int[] b;
    private Iterator<?>[] d;
    private Object[] e;
    private int f;
    private Object g;
    private JsonReader.Token h;
    private final List<Object> i;
    private final Object j;

    /* renamed from: o.ik$b */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            try {
                iArr[JsonReader.Token.h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JsonReader.Token.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JsonReader.Token.l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JsonReader.Token.k.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[JsonReader.Token.i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            e = iArr;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public JsonReader.Token l() {
        return this.h;
    }

    public C9076ik(Object obj, List<? extends Object> list) {
        C8632dsu.c((Object) list, "");
        this.j = obj;
        this.i = list;
        this.e = new Object[64];
        this.a = new Map[64];
        this.d = new Iterator[64];
        this.b = new int[64];
        this.h = e(obj);
        this.g = obj;
    }

    public /* synthetic */ C9076ik(Object obj, List list, int i, C8627dsp c8627dsp) {
        this(obj, (i & 2) != 0 ? C8569dql.i() : list);
    }

    private final JsonReader.Token e(Object obj) {
        if (obj == null) {
            return JsonReader.Token.f;
        }
        if (obj instanceof List) {
            return JsonReader.Token.d;
        }
        if (obj instanceof Map) {
            return JsonReader.Token.c;
        }
        if (obj instanceof Integer) {
            return JsonReader.Token.k;
        }
        if (obj instanceof Long) {
            return JsonReader.Token.i;
        }
        if (!(obj instanceof Double) && !(obj instanceof C9071if)) {
            return obj instanceof String ? JsonReader.Token.l : obj instanceof Boolean ? JsonReader.Token.a : JsonReader.Token.b;
        }
        return JsonReader.Token.k;
    }

    private final void w() {
        JsonReader.Token token;
        int i = this.f;
        if (i == 0) {
            this.h = JsonReader.Token.j;
            return;
        }
        Iterator<?> it = this.d[i - 1];
        C8632dsu.d(it);
        Object[] objArr = this.e;
        int i2 = this.f - 1;
        Object obj = objArr[i2];
        if (obj instanceof Integer) {
            C8632dsu.d(obj);
            objArr[i2] = Integer.valueOf(((Integer) obj).intValue() + 1);
        }
        if (it.hasNext()) {
            Object next = it.next();
            this.g = next;
            this.h = next instanceof Map.Entry ? JsonReader.Token.g : e(next);
            return;
        }
        if (this.e[this.f - 1] instanceof Integer) {
            token = JsonReader.Token.e;
        } else {
            token = JsonReader.Token.h;
        }
        this.h = token;
    }

    private final void v() {
        int i = this.f;
        Object[] objArr = this.e;
        if (i == objArr.length) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
            C8632dsu.a(copyOf, "");
            this.e = copyOf;
            Map<String, Object>[] mapArr = this.a;
            Object[] copyOf2 = Arrays.copyOf(mapArr, mapArr.length * 2);
            C8632dsu.a(copyOf2, "");
            this.a = (Map[]) copyOf2;
            int[] iArr = this.b;
            int[] copyOf3 = Arrays.copyOf(iArr, iArr.length * 2);
            C8632dsu.a(copyOf3, "");
            this.b = copyOf3;
            Iterator<?>[] itArr = this.d;
            Object[] copyOf4 = Arrays.copyOf(itArr, itArr.length * 2);
            C8632dsu.a(copyOf4, "");
            this.d = (Iterator[]) copyOf4;
        }
        this.f++;
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    /* renamed from: p */
    public C9076ik e() {
        if (l() != JsonReader.Token.d) {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + l() + " at path " + x());
        }
        Object obj = this.g;
        C8632dsu.d(obj);
        v();
        this.e[this.f - 1] = -1;
        this.d[this.f - 1] = ((List) obj).iterator();
        w();
        return this;
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    /* renamed from: t */
    public C9076ik a() {
        if (l() != JsonReader.Token.e) {
            throw new JsonDataException("Expected END_ARRAY but was " + l() + " at path " + x());
        }
        int i = this.f - 1;
        this.f = i;
        this.d[i] = null;
        this.e[i] = null;
        w();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.apollographql.apollo3.api.json.JsonReader
    /* renamed from: r */
    public C9076ik c() {
        if (l() != JsonReader.Token.c) {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + l() + " at path " + x());
        }
        v();
        Map<String, Object>[] mapArr = this.a;
        int i = this.f;
        Object obj = this.g;
        C8632dsu.d(obj);
        mapArr[i - 1] = obj;
        q();
        return this;
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    /* renamed from: u */
    public C9076ik b() {
        int i = this.f - 1;
        this.f = i;
        this.d[i] = null;
        this.e[i] = null;
        this.a[i] = null;
        w();
        return this;
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public boolean g() {
        int i = b.e[l().ordinal()];
        return (i == 1 || i == 2) ? false : true;
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public String n() {
        if (l() != JsonReader.Token.g) {
            throw new JsonDataException("Expected NAME but was " + l() + " at path " + x());
        }
        Object obj = this.g;
        C8632dsu.d(obj);
        Map.Entry entry = (Map.Entry) obj;
        this.e[this.f - 1] = entry.getKey();
        this.g = entry.getValue();
        this.h = e(entry.getValue());
        return (String) entry.getKey();
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public String k() {
        int i = b.e[l().ordinal()];
        if (i != 3 && i != 4 && i != 5) {
            throw new JsonDataException("Expected a String but was " + l() + " at path " + x());
        }
        Object obj = this.g;
        C8632dsu.d(obj);
        String obj2 = obj.toString();
        w();
        return obj2;
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public boolean j() {
        if (l() != JsonReader.Token.a) {
            throw new JsonDataException("Expected BOOLEAN but was " + l() + " at path " + x());
        }
        Object obj = this.g;
        C8632dsu.d(obj);
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        w();
        return bool.booleanValue();
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public Void o() {
        if (l() != JsonReader.Token.f) {
            throw new JsonDataException("Expected NULL but was " + l() + " at path " + x());
        }
        w();
        return null;
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public double i() {
        double parseDouble;
        int i = b.e[l().ordinal()];
        if (i != 3 && i != 4 && i != 5) {
            throw new JsonDataException("Expected a Double but was " + l() + " at path " + x());
        }
        Object obj = this.g;
        if (obj instanceof Integer) {
            parseDouble = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            parseDouble = C9074ii.d(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            parseDouble = ((Number) obj).doubleValue();
        } else if (obj instanceof String) {
            parseDouble = Double.parseDouble((String) obj);
        } else if (!(obj instanceof C9071if)) {
            throw new IllegalStateException(("Expected a Double but got " + obj + " instead").toString());
        } else {
            parseDouble = Double.parseDouble(((C9071if) obj).c());
        }
        w();
        return parseDouble;
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public int f() {
        int parseInt;
        int i = b.e[l().ordinal()];
        if (i != 3 && i != 4 && i != 5) {
            throw new JsonDataException("Expected an Int but was " + l() + " at path " + x());
        }
        Object obj = this.g;
        if (obj instanceof Integer) {
            parseInt = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            parseInt = C9074ii.e(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            parseInt = C9074ii.a(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            parseInt = Integer.parseInt((String) obj);
        } else if (!(obj instanceof C9071if)) {
            throw new IllegalStateException(("Expected an Int but got " + obj + " instead").toString());
        } else {
            parseInt = Integer.parseInt(((C9071if) obj).c());
        }
        w();
        return parseInt;
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public long h() {
        long parseLong;
        int i = b.e[l().ordinal()];
        if (i != 3 && i != 4 && i != 5) {
            throw new JsonDataException("Expected a Long but was " + l() + " at path " + x());
        }
        Object obj = this.g;
        if (obj instanceof Integer) {
            parseLong = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            parseLong = ((Number) obj).longValue();
        } else if (obj instanceof Double) {
            parseLong = C9074ii.b(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            parseLong = Long.parseLong((String) obj);
        } else if (!(obj instanceof C9071if)) {
            throw new IllegalStateException(("Expected Int but got " + obj + " instead").toString());
        } else {
            parseLong = Long.parseLong(((C9071if) obj).c());
        }
        w();
        return parseLong;
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public C9071if m() {
        C9071if c9071if;
        int i = b.e[l().ordinal()];
        if (i != 3 && i != 4 && i != 5) {
            throw new JsonDataException("Expected a Number but was " + l() + " at path " + x());
        }
        Object obj = this.g;
        if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double)) {
            c9071if = new C9071if(obj.toString());
        } else if (obj instanceof String) {
            c9071if = new C9071if((String) obj);
        } else if (!(obj instanceof C9071if)) {
            throw new IllegalStateException(("Expected JsonNumber but got " + obj + " instead").toString());
        } else {
            c9071if = (C9071if) obj;
        }
        w();
        return c9071if;
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public void s() {
        w();
    }

    private final int e(String str, List<String> list) {
        int i = this.b[this.f - 1];
        if (i < list.size() && C8632dsu.c((Object) list.get(i), (Object) str)) {
            int[] iArr = this.b;
            int i2 = this.f - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        int indexOf = list.indexOf(str);
        if (indexOf != -1) {
            this.b[this.f - 1] = indexOf + 1;
        }
        return indexOf;
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public int a(List<String> list) {
        C8632dsu.c((Object) list, "");
        while (g()) {
            int e = e(n(), list);
            if (e != -1) {
                return e;
            }
            s();
        }
        return -1;
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public void q() {
        Map<String, Object>[] mapArr = this.a;
        int i = this.f - 1;
        Map<String, Object> map = mapArr[i];
        this.e[i] = null;
        Iterator<?>[] itArr = this.d;
        C8632dsu.d(map);
        itArr[i] = map.entrySet().iterator();
        this.b[this.f - 1] = 0;
        w();
    }

    @Override // com.apollographql.apollo3.api.json.JsonReader
    public List<Object> d() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.i);
        int i = this.f;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.e[i2];
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final String x() {
        String d;
        d = C8576dqs.d(d(), ".", null, null, 0, null, null, 62, null);
        return d;
    }

    /* renamed from: o.ik$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final C9076ik e(JsonReader jsonReader) {
            C8632dsu.c((Object) jsonReader, "");
            if (jsonReader instanceof C9076ik) {
                return (C9076ik) jsonReader;
            }
            JsonReader.Token l = jsonReader.l();
            if (l != JsonReader.Token.c) {
                throw new IllegalStateException(("Failed to buffer json reader, expected `BEGIN_OBJECT` but found `" + l + "` json token").toString());
            }
            List<Object> d = jsonReader.d();
            Object b = C9011hY.b(jsonReader);
            C8632dsu.d(b);
            return new C9076ik((Map) b, d);
        }
    }
}
