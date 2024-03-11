package o;

import com.google.gson.JsonElement;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import o.C8143den;

/* renamed from: o.Kn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0994Kn extends IQ {
    private final String a;
    private final String c;
    private final String e;

    @Override // o.IQ, o.IO
    public boolean a() {
        return true;
    }

    @Override // o.IQ, o.IO
    public boolean e() {
        return true;
    }

    public C0994Kn(String str, String str2, String str3) {
        super("LogInteractivePlaybackImpression");
        this.e = str;
        this.c = str2;
        this.a = str3;
    }

    @Override // o.IO
    public void c(List<InterfaceC1242Ud> list) {
        list.add(IE.b(SignupConstants.Field.VIDEOS, this.e, "interactivePlaybackImpression"));
    }

    @Override // o.IQ, o.IO
    public List<C8143den.d> b() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new C8143den.d("interactive_type", this.c));
        arrayList.add(new C8143den.d("interactive_id", this.a));
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

    @Override // o.IQ, o.IU
    public void e(HZ hz) {
        HZ b = hz.b(SignupConstants.Field.VIDEOS, this.e, "interactivePlaybackImpression");
        if (b != null && b.g()) {
            JsonElement d = b.k().d();
            if (d.isJsonObject()) {
                JsonElement jsonElement = d.getAsJsonObject().get("success");
                if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isBoolean()) {
                    if (!jsonElement.getAsBoolean()) {
                        throw new FalkorException("Unsuccesful");
                    }
                    return;
                }
            }
        }
        throw new FalkorException("Empty value");
    }

    @Override // o.IU
    public void a(IY iy, InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        interfaceC1757aNc.a(true, (Status) InterfaceC1078Nw.aJ);
    }

    @Override // o.IO
    public void b(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.a(false, status);
    }
}
