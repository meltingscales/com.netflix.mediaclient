package o;

import android.content.Context;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.bqQ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C4994bqQ extends AbstractC1900aSk<List<AvatarInfo>> {
    private final String a;
    private final InterfaceC4986bqI d;

    @Override // o.AbstractC1902aSm
    public boolean h() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4994bqQ(Context context, NetflixDataRequest.Transport transport, InterfaceC4986bqI interfaceC4986bqI) {
        super(context, transport, "FetchAvailableAvatarsRequest");
        this.d = interfaceC4986bqI;
        this.a = "[\"availableAvatarsList\"]";
        C1044Mm.d("nf_service_user_fetchavailableavatarsrequest", "Query = %s", "[\"availableAvatarsList\"]");
    }

    @Override // o.AbstractC1902aSm
    public List<String> c() {
        return Arrays.asList(this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: c */
    public List<AvatarInfo> e(String str, String str2) {
        JsonObject e = C0946Ir.e("nf_service_user_fetchavailableavatarsrequest", str);
        if (C8118deO.e(e)) {
            throw new FalkorException("Avatars list empty!!!");
        }
        try {
            JsonArray asJsonArray = e.getAsJsonArray("availableAvatarsList");
            ArrayList arrayList = new ArrayList();
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                JsonObject asJsonObject = it.next().getAsJsonObject();
                arrayList.add(new AvatarInfo(asJsonObject.getAsJsonPrimitive("name").getAsString(), asJsonObject.getAsJsonPrimitive(SignupConstants.Field.URL).getAsString(), asJsonObject.getAsJsonPrimitive("isInDefaultSet").getAsBoolean()));
            }
            return arrayList;
        } catch (Exception e2) {
            throw new FalkorException("response missing avatars json objects", e2);
        }
    }

    @Override // o.AbstractC1902aSm
    public void e(Status status) {
        InterfaceC4986bqI interfaceC4986bqI = this.d;
        if (interfaceC4986bqI != null) {
            interfaceC4986bqI.d((List<AvatarInfo>) null, status);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: d */
    public void b(List<AvatarInfo> list) {
        InterfaceC4986bqI interfaceC4986bqI = this.d;
        if (interfaceC4986bqI != null) {
            interfaceC4986bqI.d(list, InterfaceC1078Nw.aJ);
        }
    }
}
