package o;

import java.util.HashMap;
import java.util.Map;

/* renamed from: o.cfO  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6546cfO {
    private Map<String, InterfaceC6548cfQ> b;

    public C6546cfO() {
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        hashMap.put("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_AUDIOSUB", new C6552cfU());
        this.b.put("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_CAPABILITY", new C6551cfT());
        this.b.put("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_STATE", new C6556cfY());
        this.b.put("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_DIALOGCANCEL", new C6542cfK());
        this.b.put("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_DIALOGSHOW", new C6544cfM());
        this.b.put("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_ERROR", new C6543cfL());
        this.b.put("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_NETWORK_CONNECTIVITY_CHANGE", new C6550cfS());
        this.b.put("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_MOVIEMETADATA_AVAILABLE", new C6557cfZ());
        this.b.put("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_MOVIEMETADA", new C6611cga());
        this.b.put("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_NOTREADY", new C6547cfP());
        this.b.put("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_READY", new C6554cfW());
        this.b.put("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_TARGETLIST", new C6612cgb());
        this.b.put("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REMOTE_LOGIN_CONSENT_DIALOG_SHOW", new C6553cfV());
        this.b.put("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REMOTE_LOGIN_CONSENT_DIALOG_CANCEL", new C6555cfX());
    }

    public InterfaceC6548cfQ c(String str) {
        return this.b.get(str);
    }
}
