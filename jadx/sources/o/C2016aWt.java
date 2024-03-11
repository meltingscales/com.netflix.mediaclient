package o;

import android.os.Handler;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.netflix.android.org.json.HTTP;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.mdx.logging.MdxTargetType;
import com.netflix.mediaclient.service.mdx.logging.connection.MdxConnectionLogblobLogger;
import com.netflix.model.leafs.originals.interactive.animations.Ease;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.aWt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2016aWt implements SessionManagerListener<CastSession>, Cast.MessageReceivedCallback {
    private final CastContext a;
    private final InterfaceC2014aWr b;
    private final Handler c;
    private final aWP d;
    private final String e;
    private CastDevice g;

    public C2016aWt(CastContext castContext, Handler handler, String str, aWP awp, InterfaceC2014aWr interfaceC2014aWr) {
        this.a = castContext;
        this.c = handler;
        this.e = str;
        this.b = interfaceC2014aWr;
        this.d = awp;
    }

    public void e() {
        this.a.getSessionManager().addSessionManagerListener(this, CastSession.class);
        CastSession currentCastSession = this.a.getSessionManager().getCurrentCastSession();
        if (currentCastSession == null || !currentCastSession.isConnected()) {
            return;
        }
        C1044Mm.a("CafSessionManager", "enable - connected session already exists - registering message received callback");
        CastDevice castDevice = currentCastSession.getCastDevice();
        if (castDevice != null) {
            MdxConnectionLogblobLogger.c(C8183dfa.b(castDevice));
        } else {
            C1044Mm.j("CafSessionManager", "enable - unable to log reconnect, since no CastDevice found");
        }
        onSessionResumed(currentCastSession, true);
    }

    public void a() {
        this.a.getSessionManager().removeSessionManagerListener(this, CastSession.class);
        CastSession currentCastSession = this.a.getSessionManager().getCurrentCastSession();
        if (currentCastSession == null || !currentCastSession.isConnected()) {
            return;
        }
        C1044Mm.a("CafSessionManager", "disable - session is currently connected - removing message received callback");
        try {
            currentCastSession.removeMessageReceivedCallbacks("urn:x-cast:mdx-netflix-com:service:target:2");
        } catch (Exception e) {
            C1044Mm.e("CafSessionManager", "disable - error removing message received callbacks - error: %s", e.getMessage());
        }
    }

    public void c(String str) {
        C1044Mm.a("CafSessionManager", "sendMessage - message: %s", str);
        b(a(str));
    }

    public void e(String str, String str2) {
        b(a(str, str2));
    }

    private String a(String str) {
        String d = d(str);
        if (C8168dfL.g(d)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Ease.ANIMATION_EASE_TYPE.PATH, d).put("body", str);
            return jSONObject.toString();
        } catch (JSONException unused) {
            C1044Mm.d("CafSessionManager", "createMessage failed");
            return null;
        }
    }

    private String d(String str) {
        int i;
        int indexOf;
        int indexOf2 = str.indexOf("action=");
        if (indexOf2 < 0 || (indexOf = str.indexOf(HTTP.CRLF, indexOf2)) <= (i = indexOf2 + 7)) {
            return null;
        }
        return str.substring(i, indexOf);
    }

    private void b(final String str) {
        C1044Mm.a("CafSessionManager", "sendCastMessage - message: %s", str);
        this.c.post(new Runnable() { // from class: o.aWt.4
            @Override // java.lang.Runnable
            public void run() {
                CastSession currentCastSession = C2016aWt.this.a.getSessionManager().getCurrentCastSession();
                if (currentCastSession != null && currentCastSession.isConnected()) {
                    currentCastSession.sendMessage("urn:x-cast:mdx-netflix-com:service:target:2", str).setResultCallback(new ResultCallback<Status>() { // from class: o.aWt.4.4
                        @Override // com.google.android.gms.common.api.ResultCallback
                        /* renamed from: b */
                        public void onResult(Status status) {
                            if (status.isSuccess()) {
                                C1044Mm.e("CafSessionManager", "SendMessage(), success");
                                C2016aWt.this.d();
                                return;
                            }
                            int statusCode = status.getStatus().getStatusCode();
                            if (statusCode == 15) {
                                C1044Mm.e("CafSessionManager", "SendMessage(), has timed out");
                            }
                            C2016aWt.this.b(statusCode);
                        }
                    });
                } else {
                    C1044Mm.j("CafSessionManager", "sendCastMessage - session doesn't exist or isn't connected - ignoring message");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        a((Integer) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        a(Integer.valueOf(i));
    }

    private void a(Integer num) {
        this.b.c(num);
    }

    private String a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "castHandShake").put("uuid", str).put("controlleruuid", this.e).put("friendlyName", str2).put("payload", "intent=sync");
            return jSONObject.toString();
        } catch (JSONException unused) {
            C1044Mm.d("CafSessionManager", "createCastHandShakeMessage failed, e");
            return null;
        }
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    /* renamed from: c */
    public void onSessionStarting(CastSession castSession) {
        C1044Mm.a("CafSessionManager", "onSessionStarting - session: %s", castSession.toString());
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    /* renamed from: b */
    public void onSessionStarted(CastSession castSession, String str) {
        C1044Mm.a("CafSessionManager", "onSessionStarted - session: %s, sessionId: %s", castSession.toString(), str);
        try {
            castSession.setMessageReceivedCallbacks("urn:x-cast:mdx-netflix-com:service:target:2", this);
            this.b.a();
            aWM.e();
        } catch (Exception e) {
            C1044Mm.e("CafSessionManager", "onSessionStarted - error registering for message callbacks - error: %s", e.getMessage());
            InterfaceC2014aWr interfaceC2014aWr = this.b;
            interfaceC2014aWr.c("Failed to register for message callbacks. Error: " + e.getMessage(), 0);
        }
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    /* renamed from: e */
    public void onSessionStartFailed(CastSession castSession, int i) {
        String statusCodeString = CastStatusCodes.getStatusCodeString(i);
        C1044Mm.a("CafSessionManager", "onSessionStartFailed - session: %s, error: %s", castSession.toString(), statusCodeString);
        this.b.c(statusCodeString, i);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    /* renamed from: e */
    public void onSessionEnding(CastSession castSession) {
        C1044Mm.a("CafSessionManager", "onSessionEnding - session: %s", castSession.toString());
        CastDevice castDevice = castSession.getCastDevice();
        this.g = castDevice;
        if (castDevice != null) {
            MdxConnectionLogblobLogger.e(C8183dfa.b(castDevice));
        } else {
            C1044Mm.d("CafSessionManager", "onSessionEnding - current device is null, so we can't start disconnect logging");
        }
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    /* renamed from: b */
    public void onSessionEnded(CastSession castSession, int i) {
        C1044Mm.a("CafSessionManager", "onSessionEnded - session: %s, error: %s", castSession.toString(), CastStatusCodes.getStatusCodeString(i));
        try {
            castSession.removeMessageReceivedCallbacks("urn:x-cast:mdx-netflix-com:service:target:2");
        } catch (Exception e) {
            C1044Mm.e("CafSessionManager", "onSessionEnded - failed to remove message received callbacks - error: %s", e.getMessage());
        }
        this.b.d();
        if (this.g != null) {
            this.d.e().d(MdxTargetType.Cast, C8183dfa.b(this.g), this.g.getDeviceId(), this.g.getFriendlyName(), "Google", this.g.getModelName(), null);
            this.g = null;
            aWM.d();
        }
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    /* renamed from: a */
    public void onSessionResuming(CastSession castSession, String str) {
        C1044Mm.a("CafSessionManager", "onSessionResuming - session: %s, sessionId: %s", castSession.toString(), str);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    /* renamed from: b */
    public void onSessionResumed(CastSession castSession, boolean z) {
        C1044Mm.a("CafSessionManager", "onSessionResumed - session: %s, wasSuspended: %b", castSession.toString(), Boolean.valueOf(z));
        try {
            castSession.setMessageReceivedCallbacks("urn:x-cast:mdx-netflix-com:service:target:2", this);
            this.b.c();
        } catch (Exception e) {
            C1044Mm.e("CafSessionManager", "onSessionResumed - error registering for message callbacks - error: %s", e.getMessage());
            InterfaceC2014aWr interfaceC2014aWr = this.b;
            interfaceC2014aWr.b("Failed to register for message callbacks.  Error: " + e.getMessage(), 0);
        }
        aWM.e();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    /* renamed from: c */
    public void onSessionResumeFailed(CastSession castSession, int i) {
        String statusCodeString = CastStatusCodes.getStatusCodeString(i);
        C1044Mm.a("CafSessionManager", "onSessionResumeFailed - session: %s, error: %s", castSession.toString(), statusCodeString);
        this.b.b(statusCodeString, i);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    /* renamed from: d */
    public void onSessionSuspended(CastSession castSession, int i) {
        C1044Mm.a("CafSessionManager", "onSessionSuspended - session: %s, reason: %s", castSession.toString(), Integer.valueOf(i));
        aWM.a();
    }

    @Override // com.google.android.gms.cast.Cast.MessageReceivedCallback
    public void onMessageReceived(CastDevice castDevice, String str, String str2) {
        C1044Mm.a("CafSessionManager", "onMessageReceived - message: %s", str2);
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String optString = jSONObject.optString("body");
            String optString2 = jSONObject.optString(SignupConstants.Field.URL);
            if (optString2.contains("/")) {
                optString2 = optString2.substring(optString2.lastIndexOf("/"));
            }
            this.b.c(jSONObject.optString("type"), optString2, optString);
        } catch (JSONException e) {
            C1044Mm.e("CafSessionManager", "onMessageReceived - error parsing message: %s", e.getMessage());
        }
    }
}
