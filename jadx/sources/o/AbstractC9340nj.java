package o;

import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.nj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9340nj {
    private static final JsonReader.d<Map<String, Object>> a = new JsonReader.d<Map<String, Object>>() { // from class: o.nj.3
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: e */
        public Map<String, Object> d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            return AbstractC9340nj.a(jsonReader);
        }
    };
    static final JsonReader.d<LinkedHashMap> c = new JsonReader.d<LinkedHashMap>() { // from class: o.nj.1
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: c */
        public LinkedHashMap d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            return AbstractC9340nj.a(jsonReader);
        }
    };

    public static Object d(JsonReader jsonReader) {
        byte i = jsonReader.i();
        if (i != 34) {
            if (i != 91) {
                if (i == 102) {
                    if (jsonReader.r()) {
                        return Boolean.FALSE;
                    }
                    throw jsonReader.e("Expecting 'false' for false constant", 0);
                } else if (i == 110) {
                    if (jsonReader.q()) {
                        return null;
                    }
                    throw jsonReader.e("Expecting 'null' for null constant", 0);
                } else if (i != 116) {
                    if (i == 123) {
                        return a(jsonReader);
                    }
                    return AbstractC9336nf.f(jsonReader);
                } else if (jsonReader.p()) {
                    return Boolean.TRUE;
                } else {
                    throw jsonReader.e("Expecting 'true' for true constant", 0);
                }
            }
            return b(jsonReader);
        }
        return jsonReader.o();
    }

    public static ArrayList<Object> b(JsonReader jsonReader) {
        byte d;
        if (jsonReader.i() != 91) {
            throw jsonReader.a("Expecting '[' for list start");
        }
        if (jsonReader.d() == 93) {
            return new ArrayList<>(0);
        }
        ArrayList<Object> arrayList = new ArrayList<>(4);
        arrayList.add(d(jsonReader));
        while (true) {
            d = jsonReader.d();
            if (d != 44) {
                break;
            }
            jsonReader.d();
            arrayList.add(d(jsonReader));
        }
        if (d == 93) {
            return arrayList;
        }
        throw jsonReader.a("Expecting ']' for list end");
    }

    public static LinkedHashMap<String, Object> a(JsonReader jsonReader) {
        byte d;
        if (jsonReader.i() != 123) {
            throw jsonReader.a("Expecting '{' for map start");
        }
        if (jsonReader.d() == 125) {
            return new LinkedHashMap<>(0);
        }
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(jsonReader.k(), d(jsonReader));
        while (true) {
            d = jsonReader.d();
            if (d != 44) {
                break;
            }
            jsonReader.d();
            linkedHashMap.put(jsonReader.k(), d(jsonReader));
        }
        if (d == 125) {
            return linkedHashMap;
        }
        throw jsonReader.a("Expecting '}' for map end");
    }
}
