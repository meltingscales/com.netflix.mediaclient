package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.hY  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9011hY {

    /* renamed from: o.hY$e */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            try {
                iArr[JsonReader.Token.f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JsonReader.Token.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JsonReader.Token.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JsonReader.Token.k.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[JsonReader.Token.l.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[JsonReader.Token.c.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[JsonReader.Token.d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr;
        }
    }

    public static final JsonReader e(InterfaceC7871dIn interfaceC7871dIn) {
        C8632dsu.c((Object) interfaceC7871dIn, "");
        return new C9068ic(interfaceC7871dIn);
    }

    public static final JsonReader b(Map<String, ? extends Object> map) {
        C8632dsu.c((Object) map, "");
        return new C9076ik(map, null, 2, null);
    }

    public static final Object b(JsonReader jsonReader) {
        C8632dsu.c((Object) jsonReader, "");
        JsonReader.Token l = jsonReader.l();
        switch (e.b[l.ordinal()]) {
            case 1:
                return jsonReader.o();
            case 2:
                return Boolean.valueOf(jsonReader.j());
            case 3:
            case 4:
                return c(jsonReader);
            case 5:
                return jsonReader.k();
            case 6:
                jsonReader.c();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (jsonReader.g()) {
                    linkedHashMap.put(jsonReader.n(), b(jsonReader));
                }
                jsonReader.b();
                return linkedHashMap;
            case 7:
                jsonReader.e();
                ArrayList arrayList = new ArrayList();
                while (jsonReader.g()) {
                    arrayList.add(b(jsonReader));
                }
                jsonReader.a();
                return arrayList;
            default:
                throw new IllegalStateException(("unknown token " + l).toString());
        }
    }

    private static final Object c(JsonReader jsonReader) {
        try {
            try {
                try {
                    return Integer.valueOf(jsonReader.f());
                } catch (Exception unused) {
                    return Double.valueOf(jsonReader.i());
                }
            } catch (Exception unused2) {
                return Long.valueOf(jsonReader.h());
            }
        } catch (Exception unused3) {
            return jsonReader.m();
        }
    }
}
