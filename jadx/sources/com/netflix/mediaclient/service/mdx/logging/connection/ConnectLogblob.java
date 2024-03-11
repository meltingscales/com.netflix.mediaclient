package com.netflix.mediaclient.service.mdx.logging.connection;

import com.netflix.mediaclient.service.mdx.logging.MdxTargetType;
import o.aWS;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class ConnectLogblob extends aWS {
    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        return "connect";
    }

    /* loaded from: classes3.dex */
    public enum LaunchOrigin {
        Unknown("unknown"),
        Launch("launch"),
        Playback("playback");
        
        private String e;

        public String c() {
            return this.e;
        }

        LaunchOrigin(String str) {
            this.e = str;
        }
    }

    public ConnectLogblob(String str, long j, LaunchOrigin launchOrigin, MdxTargetType mdxTargetType, String str2, String str3, boolean z, String str4, String str5, String str6, boolean z2) {
        super(str, j, str4, str5, str6);
        try {
            this.i.put("mdxver", "2014.1");
            this.i.put("uilaunchorigin", launchOrigin.c());
            this.i.put("targettype", mdxTargetType.d());
            this.i.put("deviceid", str2 != null ? str2 : "");
            this.i.put("devicename", "");
            this.i.put("usermismatch", String.valueOf(z));
            this.i.put("mdxlogin", String.valueOf(z2));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public ConnectLogblob c(boolean z) {
        try {
            this.i.put("is_wol_capable", z);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ConnectLogblob d(boolean z) {
        try {
            this.i.put("is_wol_connect", z);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }
}
