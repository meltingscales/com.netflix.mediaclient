package o;

import android.content.Context;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.cl.model.event.discrete.dial.ServerDiscovered;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MdxDiscoveryLogging;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.dhB  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8264dhB extends AbstractC8266dhD {
    private static Map<String, Object> c = new HashMap();
    private static long e = 0;

    public static void e(JSONObject jSONObject) {
        Logger.INSTANCE.logEvent(new DebugEvent(jSONObject));
    }

    public static void e(int i, int i2, Boolean bool) {
        e(i, i2, bool, null);
    }

    public static void e(int i, int i2, Boolean bool, String str) {
        try {
            e(C8123deT.c("type", "mdxtvdiscovery").put("devicecount", i).put("signedoutcount", i2).put("showedmodal", bool).putOpt(UmaAlert.ICON_ERROR, str));
        } catch (JSONException e2) {
            C1044Mm.e("nf_log", "JSON Creation Failed", e2);
        }
    }

    public static void e(Map<String, Integer> map) {
        try {
            e(C8123deT.c("type", "mdxtvdiscoverydevicecount").put("devicecountbytime", new JSONObject((Map) map)));
        } catch (JSONException e2) {
            C1044Mm.e("nf_log", "JSON Creation Failed", e2);
        }
    }

    public static void b(String str, String str2, String str3, String str4) {
        if (Config_FastProperty_MdxDiscoveryLogging.Companion.d()) {
            Logger.INSTANCE.logEvent(new ServerDiscovered(str, c(str2, str3, str4), null));
        }
    }

    public static void c(Context context, String str, String str2, String str3) {
        if (Config_FastProperty_MdxDiscoveryLogging.Companion.d()) {
            Logger.INSTANCE.logEvent(new ServerDiscovered(str, c(null, null, str3), null));
        }
    }

    private static String c(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\"?>");
        sb.append("<root xmlns=\"urn:schemas-upnp-org:device-1-0\">");
        sb.append("<specVersion><major>1</major><minor>1</minor></specVersion>");
        sb.append("<device>");
        if (C8168dfL.h(str)) {
            sb.append("<manufacturer>");
            sb.append(str);
            sb.append("</manufacturer>");
        }
        if (C8168dfL.h(str2)) {
            sb.append("<modelName>");
            sb.append(str2);
            sb.append("</modelName>");
        }
        sb.append("</device></root>");
        return sb.toString();
    }
}
