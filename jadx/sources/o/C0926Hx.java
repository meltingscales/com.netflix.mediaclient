package o;

import com.google.gson.stream.JsonReader;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: o.Hx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0926Hx extends AbstractC0925Hw {
    public C0926Hx(boolean z) {
        super(z);
    }

    @Override // o.AbstractC0925Hw
    protected HZ a(JsonReader jsonReader) {
        HL d;
        C8632dsu.c((Object) jsonReader, "");
        jsonReader.beginObject();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            C8632dsu.d((Object) nextName);
            linkedHashMap.put(nextName, e(jsonReader, nextName));
        }
        jsonReader.endObject();
        String d2 = d((HZ) linkedHashMap.get("$type"));
        if (d2 != null) {
            int hashCode = d2.hashCode();
            if (hashCode != 112787) {
                if (hashCode != 3004753) {
                    if (hashCode == 96784904 && d2.equals(UmaAlert.ICON_ERROR)) {
                        HZ hz = (HZ) linkedHashMap.get("value");
                        if (hz != null) {
                            return new HM(hz.toString(), 0L, c(linkedHashMap.get("$timestamp")), e(linkedHashMap.get("$size")));
                        }
                        throw new IOException("error without defined value: " + jsonReader);
                    }
                } else if (d2.equals("atom")) {
                    return d(linkedHashMap, false);
                }
            } else if (d2.equals("ref")) {
                HZ hz2 = (HZ) linkedHashMap.get("value");
                if (hz2 instanceof HJ) {
                    return new HX(c((HJ) hz2), c((HZ) linkedHashMap.get("$expires")), c((HZ) linkedHashMap.get("$timestamp")), e((HZ) linkedHashMap.get("$size")));
                }
                throw new IOException("No path found for reference: " + jsonReader);
            }
            throw new IOException("type not supported: " + d2 + ", " + jsonReader);
        }
        if (c()) {
            d = HP.e(linkedHashMap);
        } else {
            d = HP.d(linkedHashMap);
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC0925Hw
    /* renamed from: c */
    public HJ e(JsonReader jsonReader) {
        C8632dsu.c((Object) jsonReader, "");
        jsonReader.beginArray();
        ArrayList arrayList = new ArrayList();
        while (jsonReader.hasNext()) {
            arrayList.add(e(jsonReader, "array"));
        }
        jsonReader.endArray();
        return c() ? HP.e(arrayList) : HP.d(arrayList);
    }

    private final AbstractC0935Ig<GW> c(HJ hj) {
        int d;
        Object obj;
        d = C8572dqo.d(hj, 10);
        ArrayList arrayList = new ArrayList(d);
        for (HZ hz : hj) {
            if (hz instanceof HW) {
                obj = new GS(((HW) hz).i());
            } else if (hz instanceof HR) {
                obj = new GT(((HR) hz).h());
            } else if (hz instanceof HS) {
                obj = new GT((int) ((HS) hz).h());
            } else if (hz instanceof HN) {
                obj = new GN(((HN) hz).d());
            } else if (!(hz instanceof HQ)) {
                if (hz instanceof HU) {
                    throw new IOException("error while parsing reference path, only ints and longs are allowed, got double: " + hz);
                }
                throw new IOException(" error while parsing reference path, only primitives are allowed, got: " + hz);
            } else {
                obj = GQ.c;
            }
            arrayList.add(obj);
        }
        return C0934If.b(arrayList);
    }
}
