package o;

import android.content.Intent;

/* renamed from: o.cga  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6611cga extends AbstractC6549cfR {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C6611cga() {
        super("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_MOVIEMETADA");
    }

    @Override // o.InterfaceC6548cfQ
    public void a(InterfaceC6538cfG interfaceC6538cfG, Intent intent) {
        C1044Mm.e("mdxui", "Video metadata update");
        interfaceC6538cfG.d(intent.getIntExtra("duration", 0));
    }
}
