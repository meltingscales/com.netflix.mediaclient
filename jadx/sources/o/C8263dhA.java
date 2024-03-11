package o;

import android.text.TextUtils;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.util.PlayContext;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.dhA  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8263dhA implements TrackingInfo {
    private Integer a;
    private String b;
    private String c;
    private Integer d;
    private Integer e;
    private String f;
    private String g;
    private String h;
    private Integer j;

    private void c(String str) {
        this.h = str;
    }

    public void a(Integer num) {
        this.j = num;
    }

    public void a(String str) {
        this.c = str;
    }

    public void b(Integer num) {
        this.a = num;
    }

    public void c(Integer num) {
        this.e = num;
    }

    public void d(Integer num) {
        this.d = num;
    }

    public void d(String str) {
        this.b = str;
    }

    public void e(String str) {
        this.g = str;
    }

    public C8263dhA() {
    }

    public C8263dhA(PlayContext playContext, String str) {
        this(playContext, Integer.valueOf(playContext == null ? 0 : playContext.i()), str, playContext == null ? null : playContext.f());
    }

    public C8263dhA(InterfaceC5281bvm interfaceC5281bvm, Integer num, String str, String str2) {
        if (interfaceC5281bvm != null) {
            b(Integer.valueOf(interfaceC5281bvm.getListPos()));
            d(interfaceC5281bvm.getRequestId());
            a(interfaceC5281bvm.getListId());
            d(Integer.valueOf(interfaceC5281bvm.getTrackId()));
        }
        c(num);
        a(C8198dfp.d(str, null));
        c(str2);
    }

    public String toString() {
        return "DataContext [requestId=" + this.b + ", listId=" + this.c + ", trackId=" + this.d + ", videoId=" + this.j + ", unifiedEntityId=" + this.h + ", xid=" + this.f + ", row=" + this.a + ", rank=" + this.e + ", trackingInfo=" + this.g + "]";
    }

    @Override // com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        String str = this.b;
        if (str != null) {
            jSONObject.put(Payload.PARAM_RENO_REQUEST_ID, str);
        }
        String str2 = this.c;
        if (str2 != null) {
            jSONObject.put("listId", str2);
        }
        Integer num = this.d;
        if (num != null) {
            jSONObject.put("trackId", num);
        }
        Integer num2 = this.j;
        if (num2 != null) {
            jSONObject.put(SignupConstants.Field.VIDEO_ID, num2);
        }
        String str3 = this.h;
        if (str3 != null) {
            jSONObject.put("unifiedEntityId", str3);
        }
        String str4 = this.f;
        if (str4 != null) {
            jSONObject.put("xid", str4);
        }
        Integer num3 = this.a;
        if (num3 != null) {
            jSONObject.put("row", num3);
        }
        Integer num4 = this.e;
        if (num4 != null) {
            jSONObject.put("rank", num4);
        }
        if (!TextUtils.isEmpty(this.g)) {
            try {
                jSONObject.put("trackingInfo", new JSONObject(this.g));
            } catch (JSONException e) {
                C1044Mm.e("DataContext", "Failed to put an errror", e);
                jSONObject.put("trackingInfo", this.g);
            }
        }
        return jSONObject;
    }
}
