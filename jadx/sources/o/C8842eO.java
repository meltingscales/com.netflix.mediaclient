package o;

import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.eO  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8842eO {
    private static final JsonReader.e a = JsonReader.e.d("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");
    private static final JsonReader.e d = JsonReader.e.d("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ShapeStroke d(JsonReader jsonReader, C3658bG c3658bG) {
        char c;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        String str = null;
        C8557dq c8557dq = null;
        C8530dp c8530dp = null;
        C8557dq c8557dq2 = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        boolean z = false;
        C8665du c8665du = null;
        while (true) {
            int i = 100;
            if (jsonReader.f()) {
                switch (jsonReader.c(a)) {
                    case 0:
                        str = jsonReader.o();
                        break;
                    case 1:
                        c8530dp = C8863ej.c(jsonReader, c3658bG);
                        break;
                    case 2:
                        c8557dq2 = C8863ej.b(jsonReader, c3658bG);
                        break;
                    case 3:
                        c8665du = C8863ej.a(jsonReader, c3658bG);
                        break;
                    case 4:
                        lineCapType = ShapeStroke.LineCapType.values()[jsonReader.j() - 1];
                        break;
                    case 5:
                        lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.j() - 1];
                        break;
                    case 6:
                        f = (float) jsonReader.g();
                        break;
                    case 7:
                        z = jsonReader.h();
                        break;
                    case 8:
                        jsonReader.c();
                        while (jsonReader.f()) {
                            jsonReader.e();
                            C8557dq c8557dq3 = null;
                            String str2 = null;
                            while (jsonReader.f()) {
                                int c2 = jsonReader.c(d);
                                if (c2 == 0) {
                                    str2 = jsonReader.o();
                                } else if (c2 == 1) {
                                    c8557dq3 = C8863ej.b(jsonReader, c3658bG);
                                } else {
                                    jsonReader.m();
                                    jsonReader.k();
                                }
                            }
                            jsonReader.d();
                            str2.hashCode();
                            int hashCode = str2.hashCode();
                            if (hashCode == i) {
                                if (str2.equals("d")) {
                                    c = 0;
                                }
                                c = 65535;
                            } else if (hashCode != 103) {
                                if (hashCode == 111 && str2.equals("o")) {
                                    c = 2;
                                }
                                c = 65535;
                            } else {
                                if (str2.equals("g")) {
                                    c = 1;
                                }
                                c = 65535;
                            }
                            if (c == 0 || c == 1) {
                                c3658bG.d(true);
                                arrayList.add(c8557dq3);
                            } else if (c == 2) {
                                c8557dq = c8557dq3;
                            }
                            i = 100;
                        }
                        jsonReader.a();
                        if (arrayList.size() != 1) {
                            break;
                        } else {
                            arrayList.add((C8557dq) arrayList.get(0));
                            break;
                        }
                    default:
                        jsonReader.k();
                        break;
                }
            } else {
                if (c8665du == null) {
                    c8665du = new C8665du(Collections.singletonList(new C8910fd(100)));
                }
                return new ShapeStroke(str, c8557dq, arrayList, c8530dp, c8665du, c8557dq2, lineCapType, lineJoinType, f, z);
            }
        }
    }
}
