package o;

import android.content.Intent;
import org.json.JSONException;

/* renamed from: o.cfM  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6544cfM extends AbstractC6549cfR {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C6544cfM() {
        super("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_DIALOGSHOW");
    }

    @Override // o.InterfaceC6548cfQ
    public void a(InterfaceC6538cfG interfaceC6538cfG, Intent intent) {
        C1044Mm.e("mdxui", "Show dialog");
        String stringExtra = intent.getStringExtra("stringBlob");
        try {
            interfaceC6538cfG.b(new C6537cfF(stringExtra));
        } catch (JSONException e) {
            C1044Mm.e("mdxui", "Unable to display dialog, failed to process " + stringExtra, e);
        }
    }
}
