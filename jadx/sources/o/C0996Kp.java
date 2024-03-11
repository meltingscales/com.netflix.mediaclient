package o;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.model.leafs.originals.interactive.condition.Snapshots;
import com.netflix.model.leafs.originals.interactive.condition.State;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import o.C8143den;

/* renamed from: o.Kp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0996Kp extends IQ {
    private final String a;
    private final String c;
    private final String e;

    @Override // o.IQ, o.IO
    public boolean e() {
        return true;
    }

    @Override // o.IQ, o.IO
    public int j() {
        return 1;
    }

    @Override // o.IQ, o.IO
    public boolean k() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0996Kp(String str, StateHistory stateHistory, Snapshots snapshots, State state) {
        super("LogInteractiveStateSnapshots");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) stateHistory, "");
        C8632dsu.c((Object) snapshots, "");
        this.a = str;
        JsonObject json = stateHistory.toJson();
        C8632dsu.a(json, "");
        if (state != null) {
            HashMap<String, JsonElement> hashMap = state.values;
            C8632dsu.a(hashMap, "");
            if (!hashMap.isEmpty()) {
                json.add("passthrough", state.toJson());
            }
        }
        String jsonElement = json.toString();
        C8632dsu.a(jsonElement, "");
        this.e = jsonElement;
        String jsonElement2 = snapshots.toJson().toString();
        C8632dsu.a(jsonElement2, "");
        this.c = jsonElement2;
    }

    @Override // o.IO
    public void c(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        InterfaceC1242Ud b = IE.b(SignupConstants.Field.VIDEOS, this.a, "logInteractiveStateSnapshots");
        C8632dsu.a(b, "");
        list.add(b);
    }

    @Override // o.IQ, o.IO
    public List<C8143den.d> b() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new C8143den.d("param", this.e));
        arrayList.add(new C8143den.d("param", this.c));
        return arrayList;
    }

    @Override // o.IQ, o.IO
    public List<C8143den.d> c() {
        ArrayList arrayList = new ArrayList(2);
        TimeZone timeZone = TimeZone.getDefault();
        arrayList.add(new C8143den.d("X-Netflix.request.client.timeZoneId", timeZone.getID()));
        arrayList.add(new C8143den.d("X-Netflix.request.client.gmtOffsetMs", String.valueOf(timeZone.getRawOffset())));
        return arrayList;
    }

    @Override // o.IU
    public void a(IY iy, InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        C8632dsu.c((Object) iy, "");
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) c1244Uf, "");
        interfaceC1757aNc.a(true, (Status) InterfaceC1078Nw.aJ);
    }

    @Override // o.IO
    public void b(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) status, "");
        interfaceC1757aNc.a(false, status);
    }
}
