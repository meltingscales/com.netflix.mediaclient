package o;

import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import java.util.Arrays;
import o.C9337ng;

/* renamed from: o.nb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9332nb {
    public static final boolean[] c = new boolean[0];
    public static final JsonReader.d<Boolean> b = new JsonReader.d<Boolean>() { // from class: o.nb.3
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: c */
        public Boolean d(JsonReader jsonReader) {
            return Boolean.valueOf(AbstractC9332nb.c(jsonReader));
        }
    };
    public static final JsonReader.d<Boolean> e = new JsonReader.d<Boolean>() { // from class: o.nb.1
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: a */
        public Boolean d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            return Boolean.valueOf(AbstractC9332nb.c(jsonReader));
        }
    };
    public static final C9337ng.a<Boolean> f = new C9337ng.a<Boolean>() { // from class: o.nb.5
        @Override // o.C9337ng.a
        public void b(C9337ng c9337ng, Boolean bool) {
            AbstractC9332nb.a(bool, c9337ng);
        }
    };
    public static final JsonReader.d<boolean[]> a = new JsonReader.d<boolean[]>() { // from class: o.nb.4
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: e */
        public boolean[] d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            if (jsonReader.i() != 91) {
                throw jsonReader.a("Expecting '[' for boolean array start");
            }
            jsonReader.d();
            return AbstractC9332nb.e(jsonReader);
        }
    };
    public static final C9337ng.a<boolean[]> d = new C9337ng.a<boolean[]>() { // from class: o.nb.2
        @Override // o.C9337ng.a
        public void b(C9337ng c9337ng, boolean[] zArr) {
            AbstractC9332nb.c(zArr, c9337ng);
        }
    };

    public static void a(Boolean bool, C9337ng c9337ng) {
        if (bool == null) {
            c9337ng.b();
        } else if (bool.booleanValue()) {
            c9337ng.c("true");
        } else {
            c9337ng.c("false");
        }
    }

    public static void c(boolean[] zArr, C9337ng c9337ng) {
        if (zArr == null) {
            c9337ng.b();
        } else if (zArr.length == 0) {
            c9337ng.c("[]");
        } else {
            c9337ng.b((byte) 91);
            c9337ng.c(zArr[0] ? "true" : "false");
            for (int i = 1; i < zArr.length; i++) {
                c9337ng.c(zArr[i] ? ",true" : ",false");
            }
            c9337ng.b((byte) 93);
        }
    }

    public static boolean c(JsonReader jsonReader) {
        if (jsonReader.p()) {
            return true;
        }
        if (jsonReader.r()) {
            return false;
        }
        throw jsonReader.e("Found invalid boolean value", 0);
    }

    public static boolean[] e(JsonReader jsonReader) {
        if (jsonReader.i() == 93) {
            return c;
        }
        boolean[] zArr = new boolean[4];
        zArr[0] = c(jsonReader);
        int i = 1;
        while (jsonReader.d() == 44) {
            jsonReader.d();
            if (i == zArr.length) {
                zArr = Arrays.copyOf(zArr, zArr.length << 1);
            }
            zArr[i] = c(jsonReader);
            i++;
        }
        jsonReader.e();
        return Arrays.copyOf(zArr, i);
    }
}
