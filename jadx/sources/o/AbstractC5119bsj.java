package o;

import android.content.Context;
import com.google.gson.JsonArray;
import com.netflix.cl.Logger;
import com.netflix.cl.model.CohortType;
import com.netflix.mediaclient.servicemgr.Logblob;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.bsj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5119bsj implements Logblob {
    protected final long c = C8170dfN.d();
    public JSONObject i = new JSONObject();
    public Logblob.Severity f = Logblob.Severity.info;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.bsj$d */
    /* loaded from: classes4.dex */
    public interface d {
        aIE m();
    }

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public JSONObject c() {
        return this.i;
    }

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public boolean e() {
        return false;
    }

    public Logblob.Severity j() {
        return this.f;
    }

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public long z_() {
        return this.c;
    }

    public void b(Context context, aOV aov, String str, String str2) {
        this.i.put("clver", C8055ddE.b(context));
        if (j() != null) {
            this.i.put("sev", j().name());
        }
        String a = a();
        if (C8168dfL.h(a)) {
            this.i.put("type", a);
        }
        b(str);
        c(str2);
        i();
        a(aov);
        g();
        b();
        this.i.put("cl_log_id", Logger.INSTANCE.getLogSessionId());
    }

    private void b(String str) {
        if (C8168dfL.h(str)) {
            this.i.put("appid", str);
        }
    }

    private void c(String str) {
        if (C8168dfL.h(str)) {
            this.i.put("sessionid", str);
        }
    }

    private void i() {
        this.i.put("uniqueLogId", UUID.randomUUID().toString());
    }

    private void a(aOV aov) {
        try {
            String l = aov.l();
            String str = "0";
            if (C8168dfL.g(l)) {
                l = "0";
            }
            this.i.put("chipset", l);
            String m = aov.m();
            if (!C8168dfL.g(m)) {
                str = m;
            }
            this.i.put("chipsetHardware", str);
        } catch (JSONException unused) {
        }
    }

    private void g() {
        String b = C8120deQ.b();
        if (b != null) {
            this.i.put("productMode", b);
        }
    }

    private void b() {
        aIE m = ((d) EntryPointAccessors.fromApplication(AbstractApplicationC1040Mh.d(), d.class)).m();
        if (m == null || !m.b()) {
            return;
        }
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(CohortType.networkLite.name());
        this.i.put("cohortTypes", jsonArray);
    }

    public String h() {
        return this.i.toString();
    }
}
