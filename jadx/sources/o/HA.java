package o;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class HA {
    public static final HA e = new HA();

    private HA() {
    }

    private final JsonElement e(HZ hz) {
        return a(hz);
    }

    public final JsonElement a(HZ hz) {
        C8632dsu.c((Object) hz, "");
        if (hz instanceof HL) {
            return a((HL) hz);
        }
        if (hz instanceof HO) {
            return c((HO) hz);
        }
        if (hz instanceof HJ) {
            return a((HJ) hz);
        }
        throw new NoWhenBranchMatchedException();
    }

    public JsonObject a(HL hl) {
        C8632dsu.c((Object) hl, "");
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry<String, HZ> entry : hl.entrySet()) {
            jsonObject.add(entry.getKey(), e.e(entry.getValue()));
        }
        return jsonObject;
    }

    public JsonArray a(HJ hj) {
        C8632dsu.c((Object) hj, "");
        JsonArray jsonArray = new JsonArray();
        Iterator<HZ> it = hj.iterator();
        while (it.hasNext()) {
            jsonArray.add(e.e(it.next()));
        }
        return jsonArray;
    }

    public JsonElement c(HO ho) {
        C8632dsu.c((Object) ho, "");
        if (ho instanceof HW) {
            return new JsonPrimitive(((HW) ho).i());
        }
        if (ho instanceof HR) {
            return new JsonPrimitive(Integer.valueOf(((HR) ho).h()));
        }
        if (ho instanceof HS) {
            return new JsonPrimitive(Long.valueOf(((HS) ho).h()));
        }
        if (ho instanceof HU) {
            return new JsonPrimitive(Double.valueOf(((HU) ho).h()));
        }
        if (ho instanceof HN) {
            return new JsonPrimitive(Boolean.valueOf(((HN) ho).d()));
        }
        if (ho instanceof HQ) {
            JsonNull jsonNull = JsonNull.INSTANCE;
            C8632dsu.a(jsonNull, "");
            return jsonNull;
        } else if (ho instanceof HH) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("_sentinel", Boolean.TRUE);
            jsonObject.add("value", ((HH) ho).d());
            Long a = ho.a();
            if (a != null) {
                jsonObject.add("$expires", new JsonPrimitive(Long.valueOf(a.longValue())));
            }
            Integer c = ho.c();
            if (c != null) {
                jsonObject.add("$size", new JsonPrimitive(Integer.valueOf(c.intValue())));
            }
            Long e2 = ho.e();
            if (e2 != null) {
                jsonObject.add("$timestamp", new JsonPrimitive(Long.valueOf(e2.longValue())));
                return jsonObject;
            }
            return jsonObject;
        } else if (ho instanceof HX) {
            JsonArray jsonArray = new JsonArray();
            for (GW gw : ((HX) ho).i()) {
                jsonArray.add(gw.b());
            }
            return jsonArray;
        } else if (ho instanceof HV) {
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("_sentinel", Boolean.TRUE);
            Long a2 = ho.a();
            if (a2 != null) {
                jsonObject2.add("$expires", new JsonPrimitive(Long.valueOf(a2.longValue())));
                return jsonObject2;
            }
            return jsonObject2;
        } else if (ho instanceof HM) {
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.add("value", new JsonPrimitive(((HM) ho).d()));
            Long a3 = ho.a();
            jsonObject3.add("$expires", new JsonPrimitive(Long.valueOf(a3 != null ? a3.longValue() : System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(1L))));
            return jsonObject3;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
