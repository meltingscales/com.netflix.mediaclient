package o;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class aWS extends aWN {
    /* JADX INFO: Access modifiers changed from: protected */
    public aWS(String str, long j) {
        super(str);
        try {
            this.i.put("delay", j);
            Context d = AbstractApplicationC1040Mh.d();
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            String errorString = googleApiAvailability.getErrorString(googleApiAvailability.isGooglePlayServicesAvailable(d));
            int h = C8150deu.h(d);
            int j2 = C8150deu.j(d);
            this.i.put("gpsavail", errorString);
            this.i.put("playsdkver", h);
            this.i.put("gmsver", j2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public aWS(String str, long j, String str2, String str3, String str4) {
        this(str, j);
        try {
            this.i.put("manufacturer", str2 == null ? "" : str2);
            JSONObject jSONObject = this.i;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("modname", str3);
            JSONObject jSONObject2 = this.i;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject2.put("modnumber", str4);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
