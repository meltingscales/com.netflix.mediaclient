package o;

import com.netflix.cl.util.CLUtils;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.logging.logblob.LogBlobType;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.Logblob;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aUG extends aUI {
    public static final c d = new c(null);

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public boolean e() {
        return true;
    }

    public aUG(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        this.i.put("msg", jSONObject);
    }

    @Override // o.AbstractC5119bsj
    public Logblob.Severity j() {
        return Logblob.Severity.error;
    }

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        String a = LogBlobType.CrashReport.a();
        C8632dsu.a(a, "");
        return a;
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("CrashReportLogblob");
        }

        public final JSONObject a(Throwable th) {
            int i;
            String str;
            C8632dsu.c((Object) th, "");
            IClientLogging f = AbstractApplicationC1040Mh.getInstance().i().f();
            if (f == null) {
                return null;
            }
            if (AbstractApplicationC1040Mh.getInstance().n()) {
                i = 0;
                str = "background";
            } else {
                i = 1;
                str = "foreground";
            }
            String name = th.getClass().getName();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appid", f.a());
            jSONObject.put("reason", str);
            jSONObject.put("userVisible", i);
            jSONObject.put(SignupConstants.Error.DEBUG_FIELD_STACK_TRACE, CLUtils.getStackTraceString(th));
            jSONObject.put("class_name", name);
            return jSONObject;
        }
    }
}
