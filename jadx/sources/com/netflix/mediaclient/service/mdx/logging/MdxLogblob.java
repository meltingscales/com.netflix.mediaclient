package com.netflix.mediaclient.service.mdx.logging;

import com.netflix.mediaclient.service.logging.logblob.LogBlobType;
import com.netflix.mediaclient.servicemgr.Logblob;
import o.C1044Mm;
import o.aUI;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class MdxLogblob extends aUI {

    /* loaded from: classes3.dex */
    public enum LogBlobEvent {
        START_MDX("startMdx"),
        STOP_MDX("stopMdx"),
        FAIL_TO_SEND_MESSAGE("failToSendMsg"),
        APPLICATION_STOPPED("appStopped"),
        FAIL_TO_LAUNCH("failToLaunch"),
        FAIL_TO_CONNECT("failToConnect"),
        NETFLIX_MDX_DEVICE_FOUND("netflixDeviceFound"),
        NETFLIX_MDX_DEVICE_LOST("netflixDeviceLost"),
        CAST_DEVICE_FOUND("castDeviceFound"),
        CAST_DEVICE_LOST("castDeviceLost"),
        PAIRING_FAILED("pairingFailed"),
        ERROR_DISPLAYED("errorDisplayed"),
        FAIL_TO_START_SERVER("failToStartServer"),
        SESSION_MDX_TARGET_ERROR("sessionMdxError");
        
        private final String r;

        public String b() {
            return this.r;
        }

        LogBlobEvent(String str) {
            this.r = str;
        }
    }

    public MdxLogblob(LogBlobEvent logBlobEvent) {
        try {
            this.i.put("event", logBlobEvent.b());
        } catch (JSONException e) {
            C1044Mm.e("nf_mdxLogblob", "MdxLogblob", e);
        }
    }

    public MdxLogblob(LogBlobEvent logBlobEvent, String str, Logblob.Severity severity) {
        try {
            this.f = severity;
            this.i.put("event", logBlobEvent.b());
            this.i.put("errormsg", str);
        } catch (JSONException e) {
            C1044Mm.e("nf_mdxLogblob", "MdxLogblob", e);
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        return LogBlobType.MDX_LOGBLOB_TYPE.a();
    }
}
