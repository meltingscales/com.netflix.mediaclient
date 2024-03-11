package o;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: o.eC  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8830eC {
    private static final JsonReader.e d = JsonReader.e.d("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");
    private static final JsonReader.e b = JsonReader.e.d("d", "a");
    private static final JsonReader.e e = JsonReader.e.d("ty", "nm");

    public static Layer c(C3658bG c3658bG) {
        Rect c = c3658bG.c();
        return new Layer(Collections.emptyList(), c3658bG, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, Collections.emptyList(), new C8746dx(), 0, 0, 0, 0.0f, 0.0f, c.width(), c.height(), null, null, Collections.emptyList(), Layer.MatteType.NONE, null, false, null, null);
    }

    public static Layer e(JsonReader jsonReader, C3658bG c3658bG) {
        ArrayList arrayList;
        ArrayList arrayList2;
        float f;
        Layer.MatteType matteType = Layer.MatteType.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        jsonReader.e();
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        String str = "UNSET";
        Layer.MatteType matteType2 = matteType;
        float f2 = 1.0f;
        Layer.LayerType layerType = null;
        String str2 = null;
        C8746dx c8746dx = null;
        C8719dw c8719dw = null;
        C8800dz c8800dz = null;
        C8557dq c8557dq = null;
        C7724dD c7724dD = null;
        C8864ek c8864ek = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        long j2 = -1;
        String str3 = null;
        float f7 = 0.0f;
        while (jsonReader.f()) {
            switch (jsonReader.c(d)) {
                case 0:
                    str = jsonReader.o();
                    break;
                case 1:
                    j = jsonReader.j();
                    break;
                case 2:
                    str2 = jsonReader.o();
                    break;
                case 3:
                    int j3 = jsonReader.j();
                    layerType = Layer.LayerType.UNKNOWN;
                    if (j3 >= layerType.ordinal()) {
                        break;
                    } else {
                        layerType = Layer.LayerType.values()[j3];
                        break;
                    }
                case 4:
                    j2 = jsonReader.j();
                    break;
                case 5:
                    i = (int) (jsonReader.j() * C8914fh.d());
                    break;
                case 6:
                    i2 = (int) (jsonReader.j() * C8914fh.d());
                    break;
                case 7:
                    i3 = Color.parseColor(jsonReader.o());
                    break;
                case 8:
                    c8746dx = C8862ei.e(jsonReader, c3658bG);
                    break;
                case 9:
                    int j4 = jsonReader.j();
                    if (j4 >= Layer.MatteType.values().length) {
                        c3658bG.c("Unsupported matte type: " + j4);
                        break;
                    } else {
                        matteType2 = Layer.MatteType.values()[j4];
                        int i4 = AnonymousClass2.e[matteType2.ordinal()];
                        if (i4 == 1) {
                            c3658bG.c("Unsupported matte type: Luma");
                        } else if (i4 == 2) {
                            c3658bG.c("Unsupported matte type: Luma Inverted");
                        }
                        c3658bG.d(1);
                        break;
                    }
                case 10:
                    jsonReader.c();
                    while (jsonReader.f()) {
                        arrayList3.add(C8879ez.c(jsonReader, c3658bG));
                    }
                    c3658bG.d(arrayList3.size());
                    jsonReader.a();
                    break;
                case 11:
                    jsonReader.c();
                    while (jsonReader.f()) {
                        InterfaceC7697dC a = C8865el.a(jsonReader, c3658bG);
                        if (a != null) {
                            arrayList4.add(a);
                        }
                    }
                    jsonReader.a();
                    break;
                case 12:
                    jsonReader.e();
                    while (jsonReader.f()) {
                        int c = jsonReader.c(b);
                        if (c == 0) {
                            c8719dw = C8863ej.d(jsonReader, c3658bG);
                        } else if (c == 1) {
                            jsonReader.c();
                            if (jsonReader.f()) {
                                c8800dz = C8861eh.b(jsonReader, c3658bG);
                            }
                            while (jsonReader.f()) {
                                jsonReader.k();
                            }
                            jsonReader.a();
                        } else {
                            jsonReader.m();
                            jsonReader.k();
                        }
                    }
                    jsonReader.d();
                    break;
                case 13:
                    jsonReader.c();
                    ArrayList arrayList5 = new ArrayList();
                    while (jsonReader.f()) {
                        jsonReader.e();
                        while (jsonReader.f()) {
                            int c2 = jsonReader.c(e);
                            if (c2 == 0) {
                                int j5 = jsonReader.j();
                                if (j5 == 29) {
                                    c7724dD = C8859ef.e(jsonReader, c3658bG);
                                } else if (j5 == 25) {
                                    c8864ek = new C8868eo().c(jsonReader, c3658bG);
                                }
                            } else if (c2 == 1) {
                                arrayList5.add(jsonReader.o());
                            } else {
                                jsonReader.m();
                                jsonReader.k();
                            }
                        }
                        jsonReader.d();
                    }
                    jsonReader.a();
                    c3658bG.c("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case 14:
                    f2 = (float) jsonReader.g();
                    break;
                case 15:
                    f3 = (float) jsonReader.g();
                    break;
                case 16:
                    f4 = (float) (jsonReader.g() * C8914fh.d());
                    break;
                case 17:
                    f5 = (float) (jsonReader.g() * C8914fh.d());
                    break;
                case 18:
                    f7 = (float) jsonReader.g();
                    break;
                case 19:
                    f6 = (float) jsonReader.g();
                    break;
                case 20:
                    c8557dq = C8863ej.d(jsonReader, c3658bG, false);
                    break;
                case 21:
                    str3 = jsonReader.o();
                    break;
                case 22:
                    z = jsonReader.h();
                    break;
                default:
                    jsonReader.m();
                    jsonReader.k();
                    break;
            }
        }
        jsonReader.d();
        ArrayList arrayList6 = new ArrayList();
        if (f7 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new C8910fd(c3658bG, valueOf, valueOf, null, 0.0f, Float.valueOf(f7)));
            f = 0.0f;
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            f = 0.0f;
        }
        if (f6 <= f) {
            f6 = c3658bG.d();
        }
        arrayList2.add(new C8910fd(c3658bG, valueOf2, valueOf2, null, f7, Float.valueOf(f6)));
        arrayList2.add(new C8910fd(c3658bG, valueOf, valueOf, null, f6, Float.valueOf(Float.MAX_VALUE)));
        if (str.endsWith(".ai") || "ai".equals(str3)) {
            c3658bG.c("Convert your Illustrator layers to shape layers.");
        }
        return new Layer(arrayList4, c3658bG, str, j, layerType, j2, str2, arrayList, c8746dx, i, i2, i3, f2, f3, f4, f5, c8719dw, c8800dz, arrayList2, matteType2, c8557dq, z, c7724dD, c8864ek);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.eC$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            e = iArr;
            try {
                iArr[Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
