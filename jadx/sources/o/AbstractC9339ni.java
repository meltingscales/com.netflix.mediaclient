package o;

import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import o.C9337ng;

/* renamed from: o.ni  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9339ni {
    public static final JsonReader.d<String> d = new JsonReader.d<String>() { // from class: o.ni.5
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: c */
        public String d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            return jsonReader.o();
        }
    };
    public static final C9337ng.a<String> c = new C9337ng.a<String>() { // from class: o.ni.2
        @Override // o.C9337ng.a
        /* renamed from: e */
        public void b(C9337ng c9337ng, String str) {
            AbstractC9339ni.e(str, c9337ng);
        }
    };
    public static final C9337ng.a<CharSequence> b = new C9337ng.a<CharSequence>() { // from class: o.ni.1
        @Override // o.C9337ng.a
        /* renamed from: a */
        public void b(C9337ng c9337ng, CharSequence charSequence) {
            if (charSequence == null) {
                c9337ng.b();
            } else {
                c9337ng.d(charSequence);
            }
        }
    };
    public static final JsonReader.d<StringBuilder> e = new JsonReader.d<StringBuilder>() { // from class: o.ni.4
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: c */
        public StringBuilder d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            return jsonReader.a(new StringBuilder());
        }
    };
    public static final JsonReader.d<StringBuffer> a = new JsonReader.d<StringBuffer>() { // from class: o.ni.3
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: e */
        public StringBuffer d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            return jsonReader.c(new StringBuffer());
        }
    };

    public static void a(String str, C9337ng c9337ng) {
        c9337ng.a(str);
    }

    public static void e(String str, C9337ng c9337ng) {
        if (str == null) {
            c9337ng.b();
        } else {
            c9337ng.a(str);
        }
    }

    public static void d(String str, C9337ng c9337ng) {
        c9337ng.a(str);
    }
}
