package o;

import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.ex  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8877ex {
    private static final JsonReader.e d = JsonReader.e.d("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");
    private static final JsonReader.e a = JsonReader.e.d("p", "k");
    private static final JsonReader.e c = JsonReader.e.d("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C7832dH a(JsonReader jsonReader, C3658bG c3658bG) {
        C8476dn c8476dn;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        String str = null;
        GradientType gradientType = null;
        C8476dn c8476dn2 = null;
        C8611ds c8611ds = null;
        C8611ds c8611ds2 = null;
        C8557dq c8557dq = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        C8557dq c8557dq2 = null;
        boolean z = false;
        C8665du c8665du = null;
        while (jsonReader.f()) {
            switch (jsonReader.c(d)) {
                case 0:
                    str = jsonReader.o();
                    break;
                case 1:
                    jsonReader.e();
                    int i = -1;
                    while (jsonReader.f()) {
                        int c2 = jsonReader.c(a);
                        if (c2 != 0) {
                            c8476dn = c8476dn2;
                            if (c2 == 1) {
                                c8476dn2 = C8863ej.a(jsonReader, c3658bG, i);
                            } else {
                                jsonReader.m();
                                jsonReader.k();
                            }
                        } else {
                            c8476dn = c8476dn2;
                            i = jsonReader.j();
                        }
                        c8476dn2 = c8476dn;
                    }
                    jsonReader.d();
                    break;
                case 2:
                    c8665du = C8863ej.a(jsonReader, c3658bG);
                    break;
                case 3:
                    gradientType = jsonReader.j() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    c8611ds = C8863ej.e(jsonReader, c3658bG);
                    break;
                case 5:
                    c8611ds2 = C8863ej.e(jsonReader, c3658bG);
                    break;
                case 6:
                    c8557dq = C8863ej.b(jsonReader, c3658bG);
                    break;
                case 7:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.j() - 1];
                    break;
                case 8:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.j() - 1];
                    break;
                case 9:
                    f = (float) jsonReader.g();
                    break;
                case 10:
                    z = jsonReader.h();
                    break;
                case 11:
                    jsonReader.c();
                    while (jsonReader.f()) {
                        jsonReader.e();
                        C8557dq c8557dq3 = null;
                        String str2 = null;
                        while (jsonReader.f()) {
                            int c3 = jsonReader.c(c);
                            if (c3 != 0) {
                                C8557dq c8557dq4 = c8557dq2;
                                if (c3 == 1) {
                                    c8557dq3 = C8863ej.b(jsonReader, c3658bG);
                                } else {
                                    jsonReader.m();
                                    jsonReader.k();
                                }
                                c8557dq2 = c8557dq4;
                            } else {
                                str2 = jsonReader.o();
                            }
                        }
                        C8557dq c8557dq5 = c8557dq2;
                        jsonReader.d();
                        String str3 = str2;
                        if (str3.equals("o")) {
                            c8557dq2 = c8557dq3;
                        } else {
                            if (str3.equals("d") || str3.equals("g")) {
                                c3658bG.d(true);
                                arrayList.add(c8557dq3);
                            }
                            c8557dq2 = c8557dq5;
                        }
                    }
                    C8557dq c8557dq6 = c8557dq2;
                    jsonReader.a();
                    if (arrayList.size() == 1) {
                        arrayList.add((C8557dq) arrayList.get(0));
                    }
                    c8557dq2 = c8557dq6;
                    break;
                default:
                    jsonReader.m();
                    jsonReader.k();
                    break;
            }
        }
        return new C7832dH(str, gradientType, c8476dn2, c8665du == null ? new C8665du(Collections.singletonList(new C8910fd(100))) : c8665du, c8611ds, c8611ds2, c8557dq, lineCapType, lineJoinType, f, arrayList, c8557dq2, z);
    }
}
