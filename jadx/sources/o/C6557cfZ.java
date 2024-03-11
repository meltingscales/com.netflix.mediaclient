package o;

import android.content.Intent;

/* renamed from: o.cfZ  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C6557cfZ extends AbstractC6549cfR {
    public C6557cfZ() {
        super("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_MOVIEMETADATA_AVAILABLE");
    }

    @Override // o.InterfaceC6548cfQ
    public void a(InterfaceC6538cfG interfaceC6538cfG, Intent intent) {
        C1044Mm.e("mdxui", "Video metadata update");
        interfaceC6538cfG.b();
    }
}
