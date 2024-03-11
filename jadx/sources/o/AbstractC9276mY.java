package o;

import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import o.C9337ng;

/* renamed from: o.mY  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9276mY {
    static final JsonReader.d<byte[]> b = new JsonReader.d<byte[]>() { // from class: o.mY.2
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: b */
        public byte[] d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            return AbstractC9276mY.c(jsonReader);
        }
    };
    static final C9337ng.a<byte[]> a = new C9337ng.a<byte[]>() { // from class: o.mY.4
        @Override // o.C9337ng.a
        /* renamed from: a */
        public void b(C9337ng c9337ng, byte[] bArr) {
            AbstractC9276mY.c(bArr, c9337ng);
        }
    };

    public static void c(byte[] bArr, C9337ng c9337ng) {
        if (bArr == null) {
            c9337ng.b();
        } else if (bArr.length == 0) {
            c9337ng.c("\"\"");
        } else {
            c9337ng.d(bArr);
        }
    }

    public static byte[] c(JsonReader jsonReader) {
        return jsonReader.f();
    }
}
