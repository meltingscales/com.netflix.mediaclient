package o;

import com.netflix.mediaclient.service.logging.logblob.LogBlobType;
import com.netflix.mediaclient.servicemgr.Logblob;
import com.netflix.model.leafs.originals.interactive.Audio;

/* loaded from: classes3.dex */
public final class aUU extends aUI {
    public aUU(String str, long j) {
        C8632dsu.c((Object) str, "");
        this.i.put("uiLabel", str);
        this.i.put(Audio.TYPE.timeout, j);
    }

    @Override // o.AbstractC5119bsj
    public Logblob.Severity j() {
        return Logblob.Severity.error;
    }

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        String a = LogBlobType.SurfaceViewTimeOut.a();
        C8632dsu.a(a, "");
        return a;
    }
}
