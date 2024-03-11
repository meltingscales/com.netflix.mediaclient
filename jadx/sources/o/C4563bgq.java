package o;

import com.google.gson.reflect.TypeToken;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.bgq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4563bgq {
    public static List<InterfaceC4525bgE> e(JSONObject jSONObject) {
        return b((Map) C8118deO.a().fromJson(jSONObject.toString(), TypeToken.getParameterized(Map.class, String.class, AbstractC4566bgt.class).getType()));
    }

    public static List<InterfaceC4525bgE> c(Reader reader) {
        return b((Map) C8118deO.a().fromJson(reader, TypeToken.getParameterized(Map.class, String.class, AbstractC4566bgt.class).getType()));
    }

    private static List<InterfaceC4525bgE> b(Map<String, AbstractC4566bgt> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, AbstractC4566bgt> entry : map.entrySet()) {
            if (C8168dfL.d(entry.getKey(), "timestamp")) {
                C1044Mm.e("nf_manifest", "skip bad entry to break manifest fetch loop");
            } else {
                AbstractC4566bgt value = entry.getValue();
                value.b(-1L);
                arrayList.add(value);
            }
        }
        return arrayList;
    }

    public static AbstractC4473bfF a(JSONObject jSONObject) {
        return (AbstractC4473bfF) C8118deO.a().fromJson(jSONObject.toString(), TypeToken.get(AbstractC4473bfF.class).getType());
    }

    public static List<AbstractC4566bgt> d(JSONArray jSONArray) {
        return (List) C8118deO.a().fromJson(jSONArray.toString(), TypeToken.getParameterized(List.class, AbstractC4566bgt.class).getType());
    }
}
