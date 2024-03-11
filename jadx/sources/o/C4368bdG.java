package o;

import android.content.Context;
import com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestFlavor;
import org.json.JSONObject;

/* renamed from: o.bdG  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4368bdG extends C4408bdu {
    private final AbstractC4564bgr x;

    public C4368bdG(Context context, String str, String str2, InterfaceC4525bgE interfaceC4525bgE, InterfaceC4389bdb interfaceC4389bdb) {
        super(str, context, str2, ManifestRequestFlavor.OFFLINE, interfaceC4389bdb);
        this.x = interfaceC4525bgE.U();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C4402bdo
    public JSONObject b(JSONObject jSONObject) {
        return C4367bdF.c(jSONObject, this.x);
    }
}
