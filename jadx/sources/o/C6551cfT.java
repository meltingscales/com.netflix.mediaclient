package o;

import android.content.Intent;

/* renamed from: o.cfT  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6551cfT extends AbstractC6549cfR {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C6551cfT() {
        super("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_CAPABILITY");
    }

    @Override // o.InterfaceC6548cfQ
    public void a(InterfaceC6538cfG interfaceC6538cfG, Intent intent) {
        C1044Mm.e("mdxui", "Update capability");
        try {
            interfaceC6538cfG.b(new C2005aWi(intent.getStringExtra("stringBlob")));
        } catch (Exception e) {
            C1044Mm.e("mdxui", "Failed to extract capability data ", e);
        }
    }
}
