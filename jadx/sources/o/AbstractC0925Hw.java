package o;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import o.InterfaceC0927Hy;

/* renamed from: o.Hw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC0925Hw implements InterfaceC0927Hy {
    private final boolean e;

    /* renamed from: o.Hw$e */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[JsonToken.values().length];
            try {
                iArr[JsonToken.BEGIN_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JsonToken.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            e = iArr;
        }
    }

    protected abstract HZ a(JsonReader jsonReader);

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean c() {
        return this.e;
    }

    protected abstract HZ e(JsonReader jsonReader);

    public AbstractC0925Hw(boolean z) {
        this.e = z;
    }

    @Override // o.InterfaceC0927Hy
    public HZ e(String str) {
        return InterfaceC0927Hy.b.e(this, str);
    }

    @Override // o.InterfaceC0927Hy
    public HZ a(Reader reader) {
        C8632dsu.c((Object) reader, "");
        return e(new JsonReader(reader), "$root");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final HZ e(JsonReader jsonReader, String str) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) str, "");
        JsonToken peek = jsonReader.peek();
        switch (peek == null ? -1 : e.e[peek.ordinal()]) {
            case 1:
                return a(jsonReader);
            case 2:
                return e(jsonReader);
            case 3:
                if (jsonReader.nextBoolean()) {
                    return HP.d();
                }
                return HP.b();
            case 4:
                String nextString = jsonReader.nextString();
                C8632dsu.a(nextString, "");
                return new HW(nextString);
            case 5:
                return b(jsonReader, str);
            case 6:
                jsonReader.nextNull();
                return HQ.a;
            default:
                throw new IllegalStateException("error while parsing " + str + ", got token: " + peek + " : " + jsonReader);
        }
    }

    protected final HZ b(JsonReader jsonReader, String str) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) str, "");
        try {
            return HC.b(jsonReader.nextDouble());
        } catch (Exception e2) {
            throw new IOException("error while parsing number - key: '" + str + "'", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final HZ d(Map<String, ? extends HZ> map, boolean z) {
        C8632dsu.c((Object) map, "");
        HZ hz = map.get("value");
        JsonElement b = hz != null ? b(hz) : null;
        if (b != null && !b.isJsonNull()) {
            return new HH(b, c(map.get("$expires")), c(map.get("$timestamp")), e(map.get("$size")), null, z, 16, null);
        }
        return new HV(c(map.get("$expires")));
    }

    private final JsonElement b(HZ hz) {
        if (hz instanceof HW) {
            return new JsonPrimitive(((HW) hz).i());
        }
        if (hz instanceof HR) {
            return new JsonPrimitive(Integer.valueOf(((HR) hz).h()));
        }
        if (hz instanceof HS) {
            return new JsonPrimitive(Long.valueOf(((HS) hz).h()));
        }
        if (hz instanceof HU) {
            return new JsonPrimitive(Double.valueOf(((HU) hz).h()));
        }
        if (hz instanceof HN) {
            return ((HN) hz).d() ? HF.b() : HF.a();
        } else if (hz instanceof HQ) {
            JsonNull jsonNull = JsonNull.INSTANCE;
            C8632dsu.a(jsonNull, "");
            return jsonNull;
        } else if (hz instanceof HJ) {
            JsonArray jsonArray = new JsonArray();
            for (HZ hz2 : (Iterable) hz) {
                jsonArray.add(b(hz2));
            }
            return jsonArray;
        } else if (hz instanceof HL) {
            JsonObject jsonObject = new JsonObject();
            for (Map.Entry entry : ((Map) hz).entrySet()) {
                jsonObject.add((String) entry.getKey(), b((HZ) entry.getValue()));
            }
            return jsonObject;
        } else if (hz instanceof HV) {
            JsonNull jsonNull2 = JsonNull.INSTANCE;
            C8632dsu.a(jsonNull2, "");
            return jsonNull2;
        } else if (hz instanceof HH) {
            throw new UnsupportedOperationException(String.valueOf(hz));
        } else {
            if (hz instanceof HX) {
                throw new UnsupportedOperationException(String.valueOf(hz));
            }
            if (hz instanceof HM) {
                throw new UnsupportedOperationException(String.valueOf(hz));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Integer e(HZ hz) {
        if (hz instanceof HT) {
            return Integer.valueOf(((HT) hz).d());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Long c(HZ hz) {
        if (hz instanceof HT) {
            return Long.valueOf(((HT) hz).j());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String d(HZ hz) {
        if (hz instanceof HW) {
            return ((HW) hz).i();
        }
        return null;
    }
}
