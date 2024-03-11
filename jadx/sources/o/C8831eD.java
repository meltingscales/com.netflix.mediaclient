package o;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.eD  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8831eD {
    private static final JsonReader.e a = JsonReader.e.d("w", "h", "ip", "op", SignupConstants.Field.REGION_FR, "v", "layers", "assets", "fonts", "chars", "markers");
    static JsonReader.e d = JsonReader.e.d(SignupConstants.Field.LANG_ID, "layers", "w", "h", "p", "u");
    private static final JsonReader.e e = JsonReader.e.d("list");
    private static final JsonReader.e c = JsonReader.e.d("cm", "tm", "dr");

    public static C3658bG c(JsonReader jsonReader) {
        HashMap hashMap;
        ArrayList arrayList;
        JsonReader jsonReader2 = jsonReader;
        float d2 = C8914fh.d();
        LongSparseArray<Layer> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        SparseArrayCompat<C8422dl> sparseArrayCompat = new SparseArrayCompat<>();
        C3658bG c3658bG = new C3658bG();
        jsonReader.e();
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (jsonReader.f()) {
            switch (jsonReader2.c(a)) {
                case 0:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    i = jsonReader.j();
                    continue;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    jsonReader2 = jsonReader;
                case 1:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    i2 = jsonReader.j();
                    continue;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    jsonReader2 = jsonReader;
                case 2:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f = (float) jsonReader.g();
                    continue;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    jsonReader2 = jsonReader;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) jsonReader.g()) - 0.01f;
                    continue;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    jsonReader2 = jsonReader;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) jsonReader.g();
                    continue;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    jsonReader2 = jsonReader;
                case 5:
                    String[] split = jsonReader.o().split("\\.");
                    if (!C8914fh.d(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        c3658bG.c("Lottie only supports bodymovin >= 4.4.0");
                        break;
                    }
                    break;
                case 6:
                    a(jsonReader2, c3658bG, arrayList2, longSparseArray);
                    break;
                case 7:
                    c(jsonReader2, c3658bG, hashMap2, hashMap3);
                    break;
                case 8:
                    e(jsonReader2, hashMap4);
                    break;
                case 9:
                    c(jsonReader2, c3658bG, sparseArrayCompat);
                    break;
                case 10:
                    d(jsonReader2, arrayList3);
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    jsonReader.m();
                    jsonReader.k();
                    continue;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    jsonReader2 = jsonReader;
            }
            hashMap = hashMap4;
            arrayList = arrayList3;
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            jsonReader2 = jsonReader;
        }
        c3658bG.e(new Rect(0, 0, (int) (i * d2), (int) (i2 * d2)), f, f2, f3, arrayList2, longSparseArray, hashMap2, hashMap3, sparseArrayCompat, hashMap4, arrayList3);
        return c3658bG;
    }

    private static void a(JsonReader jsonReader, C3658bG c3658bG, List<Layer> list, LongSparseArray<Layer> longSparseArray) {
        jsonReader.c();
        int i = 0;
        while (jsonReader.f()) {
            Layer e2 = C8830eC.e(jsonReader, c3658bG);
            if (e2.j() == Layer.LayerType.IMAGE) {
                i++;
            }
            list.add(e2);
            longSparseArray.put(e2.d(), e2);
            if (i > 4) {
                C8909fc.b("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.a();
    }

    private static void c(JsonReader jsonReader, C3658bG c3658bG, Map<String, List<Layer>> map, Map<String, C6478ce> map2) {
        jsonReader.c();
        while (jsonReader.f()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.e();
            int i = 0;
            int i2 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (jsonReader.f()) {
                int c2 = jsonReader.c(d);
                if (c2 == 0) {
                    str = jsonReader.o();
                } else if (c2 == 1) {
                    jsonReader.c();
                    while (jsonReader.f()) {
                        Layer e2 = C8830eC.e(jsonReader, c3658bG);
                        longSparseArray.put(e2.d(), e2);
                        arrayList.add(e2);
                    }
                    jsonReader.a();
                } else if (c2 == 2) {
                    i = jsonReader.j();
                } else if (c2 == 3) {
                    i2 = jsonReader.j();
                } else if (c2 == 4) {
                    str2 = jsonReader.o();
                } else if (c2 == 5) {
                    str3 = jsonReader.o();
                } else {
                    jsonReader.m();
                    jsonReader.k();
                }
            }
            jsonReader.d();
            if (str2 != null) {
                C6478ce c6478ce = new C6478ce(i, i2, str, str2, str3);
                map2.put(c6478ce.d(), c6478ce);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.a();
    }

    private static void e(JsonReader jsonReader, Map<String, C8315di> map) {
        jsonReader.e();
        while (jsonReader.f()) {
            if (jsonReader.c(e) == 0) {
                jsonReader.c();
                while (jsonReader.f()) {
                    C8315di c2 = C8873et.c(jsonReader);
                    map.put(c2.c(), c2);
                }
                jsonReader.a();
            } else {
                jsonReader.m();
                jsonReader.k();
            }
        }
        jsonReader.d();
    }

    private static void c(JsonReader jsonReader, C3658bG c3658bG, SparseArrayCompat<C8422dl> sparseArrayCompat) {
        jsonReader.c();
        while (jsonReader.f()) {
            C8422dl c2 = C8871er.c(jsonReader, c3658bG);
            sparseArrayCompat.put(c2.hashCode(), c2);
        }
        jsonReader.a();
    }

    private static void d(JsonReader jsonReader, List<C8503do> list) {
        jsonReader.c();
        while (jsonReader.f()) {
            jsonReader.e();
            float f = 0.0f;
            String str = null;
            float f2 = 0.0f;
            while (jsonReader.f()) {
                int c2 = jsonReader.c(c);
                if (c2 == 0) {
                    str = jsonReader.o();
                } else if (c2 == 1) {
                    f = (float) jsonReader.g();
                } else if (c2 == 2) {
                    f2 = (float) jsonReader.g();
                } else {
                    jsonReader.m();
                    jsonReader.k();
                }
            }
            jsonReader.d();
            list.add(new C8503do(str, f, f2));
        }
        jsonReader.a();
    }
}
