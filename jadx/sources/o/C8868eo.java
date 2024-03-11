package o;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: o.eo  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8868eo {
    private C8557dq a;
    private C8530dp c;
    private C8557dq e;
    private C8557dq f;
    private C8557dq j;
    private static final JsonReader.e d = JsonReader.e.d("ef");
    private static final JsonReader.e b = JsonReader.e.d("nm", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8864ek c(JsonReader jsonReader, C3658bG c3658bG) {
        C8557dq c8557dq;
        C8557dq c8557dq2;
        C8557dq c8557dq3;
        C8557dq c8557dq4;
        while (jsonReader.f()) {
            if (jsonReader.c(d) == 0) {
                jsonReader.c();
                while (jsonReader.f()) {
                    a(jsonReader, c3658bG);
                }
                jsonReader.a();
            } else {
                jsonReader.m();
                jsonReader.k();
            }
        }
        C8530dp c8530dp = this.c;
        if (c8530dp == null || (c8557dq = this.j) == null || (c8557dq2 = this.e) == null || (c8557dq3 = this.a) == null || (c8557dq4 = this.f) == null) {
            return null;
        }
        return new C8864ek(c8530dp, c8557dq, c8557dq2, c8557dq3, c8557dq4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void a(JsonReader jsonReader, C3658bG c3658bG) {
        char c;
        jsonReader.e();
        String str = "";
        while (jsonReader.f()) {
            int c2 = jsonReader.c(b);
            if (c2 == 0) {
                str = jsonReader.o();
            } else if (c2 == 1) {
                str.hashCode();
                switch (str.hashCode()) {
                    case 353103893:
                        if (str.equals("Distance")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 397447147:
                        if (str.equals("Opacity")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1041377119:
                        if (str.equals("Direction")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1379387491:
                        if (str.equals("Shadow Color")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1383710113:
                        if (str.equals("Softness")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    this.a = C8863ej.b(jsonReader, c3658bG);
                } else if (c == 1) {
                    this.j = C8863ej.d(jsonReader, c3658bG, false);
                } else if (c == 2) {
                    this.e = C8863ej.d(jsonReader, c3658bG, false);
                } else if (c == 3) {
                    this.c = C8863ej.c(jsonReader, c3658bG);
                } else if (c == 4) {
                    this.f = C8863ej.b(jsonReader, c3658bG);
                } else {
                    jsonReader.k();
                }
            } else {
                jsonReader.m();
                jsonReader.k();
            }
        }
        jsonReader.d();
    }
}
