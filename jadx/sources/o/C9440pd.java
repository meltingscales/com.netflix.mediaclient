package o;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.pd  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9440pd extends C9444ph {
    protected boolean b;
    protected final boolean d;
    protected int f;
    protected final JsonParser[] h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C9440pd(boolean z, JsonParser[] jsonParserArr) {
        super(jsonParserArr[0]);
        boolean z2 = false;
        this.d = z;
        if (z && this.m.N()) {
            z2 = true;
        }
        this.b = z2;
        this.h = jsonParserArr;
        this.f = 1;
    }

    public static C9440pd d(boolean z, JsonParser jsonParser, JsonParser jsonParser2) {
        boolean z2 = jsonParser instanceof C9440pd;
        if (z2 || (jsonParser2 instanceof C9440pd)) {
            ArrayList arrayList = new ArrayList();
            if (z2) {
                ((C9440pd) jsonParser).d(arrayList);
            } else {
                arrayList.add(jsonParser);
            }
            if (jsonParser2 instanceof C9440pd) {
                ((C9440pd) jsonParser2).d(arrayList);
            } else {
                arrayList.add(jsonParser2);
            }
            return new C9440pd(z, (JsonParser[]) arrayList.toArray(new JsonParser[arrayList.size()]));
        }
        return new C9440pd(z, new JsonParser[]{jsonParser, jsonParser2});
    }

    protected void d(List<JsonParser> list) {
        int length = this.h.length;
        for (int i = this.f - 1; i < length; i++) {
            JsonParser jsonParser = this.h[i];
            if (jsonParser instanceof C9440pd) {
                ((C9440pd) jsonParser).d(list);
            } else {
                list.add(jsonParser);
            }
        }
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        do {
            this.m.close();
        } while (W());
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public JsonToken Q() {
        JsonParser jsonParser = this.m;
        if (jsonParser == null) {
            return null;
        }
        if (this.b) {
            this.b = false;
            return jsonParser.f();
        }
        JsonToken Q = jsonParser.Q();
        return Q == null ? V() : Q;
    }

    @Override // o.C9444ph, com.fasterxml.jackson.core.JsonParser
    public JsonParser T() {
        if (this.m.f() != JsonToken.START_OBJECT && this.m.f() != JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            JsonToken Q = Q();
            if (Q == null) {
                return this;
            }
            if (Q.j()) {
                i++;
            } else if (Q.g() && i - 1 == 0) {
                return this;
            }
        }
    }

    protected boolean W() {
        int i = this.f;
        JsonParser[] jsonParserArr = this.h;
        if (i < jsonParserArr.length) {
            this.f = i + 1;
            this.m = jsonParserArr[i];
            return true;
        }
        return false;
    }

    protected JsonToken V() {
        JsonToken Q;
        do {
            int i = this.f;
            JsonParser[] jsonParserArr = this.h;
            if (i >= jsonParserArr.length) {
                return null;
            }
            this.f = i + 1;
            JsonParser jsonParser = jsonParserArr[i];
            this.m = jsonParser;
            if (this.d && jsonParser.N()) {
                return this.m.o();
            }
            Q = this.m.Q();
        } while (Q == null);
        return Q;
    }
}
