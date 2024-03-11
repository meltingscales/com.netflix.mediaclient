package o;

import com.netflix.mediaclient.service.logging.logblob.LogBlobType;
import org.json.JSONException;

/* renamed from: o.aTk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1927aTk extends aUI {
    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        return LogBlobType.MAINTENANCE_JOB.a();
    }

    private C1927aTk(String str) {
        this.i.put("errormsg", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(InterfaceC5090bsG interfaceC5090bsG) {
        if (interfaceC5090bsG == null) {
            return;
        }
        try {
            interfaceC5090bsG.a(new C1927aTk("startJob"));
        } catch (JSONException e) {
            C1044Mm.c("maintenanceJobLogblob", "JSONException:", e);
        } catch (Exception e2) {
            C1044Mm.c("maintenanceJobLogblob", "Exception:", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(InterfaceC5090bsG interfaceC5090bsG) {
        if (interfaceC5090bsG == null) {
            return;
        }
        try {
            interfaceC5090bsG.a(new C1927aTk("stopJob"));
        } catch (JSONException e) {
            C1044Mm.c("maintenanceJobLogblob", "JSONException:", e);
        } catch (Exception e2) {
            C1044Mm.c("maintenanceJobLogblob", "Exception:", e2);
        }
    }
}
