package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import java.util.List;

/* renamed from: o.Jv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0976Jv extends IQ {
    public static final a d = new a(null);
    private StateHistory a;
    private final String b;

    @Override // o.IQ, o.IO
    public boolean e() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0976Jv(String str) {
        super("FetchInteractiveRestartState");
        C8632dsu.c((Object) str, "");
        this.b = str;
    }

    /* renamed from: o.Jv$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("FetchInteractiveRestartStateTask");
        }
    }

    @Override // o.IO
    public void c(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        InterfaceC1242Ud b = IE.b(SignupConstants.Field.VIDEOS, this.b, "resetInteractiveTitle");
        C8632dsu.a(b, "");
        list.add(b);
    }

    @Override // o.IQ, o.IU
    public void e(HZ hz) {
        HZ b;
        JsonElement d2;
        JsonObject asJsonObject;
        C8632dsu.c((Object) hz, "");
        String str = this.b;
        if (str != null && (b = hz.b(SignupConstants.Field.VIDEOS, str, "resetInteractiveTitle")) != null && (d2 = ((HH) b).d()) != null && (asJsonObject = d2.getAsJsonObject()) != null) {
            try {
                this.a = StateHistory.typeAdapter((Gson) C1332Xp.b(Gson.class)).fromJsonTree(asJsonObject);
                return;
            } catch (IllegalStateException e) {
                C1044Mm.d("FetchInteractiveRestartStateTask", e.getStackTrace().toString());
            }
        }
        throw new FalkorException("Empty value");
    }

    @Override // o.IU
    public void a(IY iy, InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        C8632dsu.c((Object) iy, "");
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) c1244Uf, "");
        interfaceC1757aNc.b(this.a, InterfaceC1078Nw.aJ);
    }

    @Override // o.IO
    public void b(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) status, "");
        interfaceC1757aNc.b((StateHistory) null, status);
    }
}
