package o;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.model.leafs.originals.interactive.InteractiveDebugMenuItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.Jw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0977Jw extends IQ {
    public static final a a = new a(null);
    private List<? extends InteractiveDebugMenuItem> b;
    private final InterfaceC1242Ud c;
    private final String e;

    @Override // o.IQ, o.IO
    public boolean e() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0977Jw(String str) {
        super("FetchInteractiveDebugMenuItemsTask");
        C8632dsu.c((Object) str, "");
        this.e = str;
        InterfaceC1242Ud b = IE.b(SignupConstants.Field.VIDEOS, str, "interactiveDebugMenuItems");
        C8632dsu.a(b, "");
        this.c = b;
    }

    /* renamed from: o.Jw$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("FetchInteractiveDebugMenuItemsTask");
        }
    }

    @Override // o.IO
    public void c(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        list.add(this.c);
    }

    private final void d(JsonArray jsonArray) {
        Gson gson = (Gson) C1332Xp.b(Gson.class);
        ArrayList arrayList = new ArrayList();
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            arrayList.add(InteractiveDebugMenuItem.typeAdapter(gson).fromJsonTree(it.next()));
        }
        this.b = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.IU
    public void a(IY iy, InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        C8632dsu.c((Object) iy, "");
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) c1244Uf, "");
        interfaceC1757aNc.f(this.b, InterfaceC1078Nw.aJ);
    }

    @Override // o.IO
    public void b(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) status, "");
        interfaceC1757aNc.f(null, status);
    }

    @Override // o.IQ, o.IU
    public void e(HZ hz) {
        JsonElement d;
        JsonArray asJsonArray;
        C8632dsu.c((Object) hz, "");
        a.getLogTag();
        HZ b = hz.b(SignupConstants.Field.VIDEOS, this.e, "interactiveDebugMenuItems");
        if (b == null || (d = ((HH) b).d()) == null || (asJsonArray = d.getAsJsonArray()) == null) {
            return;
        }
        d(asJsonArray);
    }
}
