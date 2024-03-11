package o;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.io.ContentReference;

/* renamed from: o.nS  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9323nS {
    public int b;
    public int d;

    public Object a() {
        return null;
    }

    public abstract AbstractC9323nS b();

    public void b(Object obj) {
    }

    public abstract String c();

    public final int d() {
        return this.d + 1;
    }

    public final int e() {
        int i = this.d;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public final boolean g() {
        return this.b == 2;
    }

    public final boolean h() {
        return this.b == 1;
    }

    public final boolean i() {
        return this.b == 0;
    }

    public boolean j() {
        return this.d >= 0;
    }

    public String k() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? "?" : "Object" : "Array" : "root";
    }

    public AbstractC9323nS() {
    }

    public AbstractC9323nS(AbstractC9323nS abstractC9323nS) {
        this.b = abstractC9323nS.b;
        this.d = abstractC9323nS.d;
    }

    public AbstractC9323nS(int i, int i2) {
        this.b = i;
        this.d = i2;
    }

    public boolean f() {
        return c() != null;
    }

    public JsonLocation d(ContentReference contentReference) {
        return JsonLocation.d;
    }

    @Deprecated
    public JsonLocation d(Object obj) {
        return JsonLocation.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this.b;
        if (i == 0) {
            sb.append("/");
        } else if (i == 1) {
            sb.append('[');
            sb.append(e());
            sb.append(']');
        } else {
            sb.append('{');
            String c = c();
            if (c != null) {
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                C9391oh.d(sb, c);
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else {
                sb.append('?');
            }
            sb.append('}');
        }
        return sb.toString();
    }
}
