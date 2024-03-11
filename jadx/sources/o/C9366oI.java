package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import java.util.HashSet;

/* renamed from: o.oI  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9366oI {
    protected final Object a;
    protected HashSet<String> b;
    protected String d;
    protected String e;

    public void a() {
        this.d = null;
        this.e = null;
        this.b = null;
    }

    public Object e() {
        return this.a;
    }

    private C9366oI(Object obj) {
        this.a = obj;
    }

    public static C9366oI b(JsonParser jsonParser) {
        return new C9366oI(jsonParser);
    }

    public static C9366oI e(JsonGenerator jsonGenerator) {
        return new C9366oI(jsonGenerator);
    }

    public C9366oI b() {
        return new C9366oI(this.a);
    }

    public JsonLocation d() {
        Object obj = this.a;
        if (obj instanceof JsonParser) {
            return ((JsonParser) obj).k();
        }
        return null;
    }

    public boolean a(String str) {
        String str2 = this.d;
        if (str2 == null) {
            this.d = str;
            return false;
        } else if (str.equals(str2)) {
            return true;
        } else {
            String str3 = this.e;
            if (str3 == null) {
                this.e = str;
                return false;
            } else if (str.equals(str3)) {
                return true;
            } else {
                if (this.b == null) {
                    HashSet<String> hashSet = new HashSet<>(16);
                    this.b = hashSet;
                    hashSet.add(this.d);
                    this.b.add(this.e);
                }
                return !this.b.add(str);
            }
        }
    }
}
