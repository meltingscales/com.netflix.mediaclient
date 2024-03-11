package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.ClientActionFromLase;
import java.util.List;
import java.util.Map;

/* renamed from: o.bbG  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4262bbG {

    /* renamed from: o.bbG$b */
    /* loaded from: classes3.dex */
    public interface b {
        void d(Map<String, ClientActionFromLase> map, Status status);
    }

    void a(List<AbstractC4561bgo> list, b bVar);

    void a(InterfaceC4297bbp interfaceC4297bbp, byte[] bArr, AbstractC4561bgo abstractC4561bgo, InterfaceC4264bbI interfaceC4264bbI);

    void a(InterfaceC4297bbp interfaceC4297bbp, byte[] bArr, boolean z, AbstractC4561bgo abstractC4561bgo, InterfaceC4264bbI interfaceC4264bbI);

    void c();

    void c(boolean z, InterfaceC4297bbp interfaceC4297bbp, byte[] bArr, byte[] bArr2, AbstractC4561bgo abstractC4561bgo, AbstractC4561bgo abstractC4561bgo2, InterfaceC4264bbI interfaceC4264bbI);
}
