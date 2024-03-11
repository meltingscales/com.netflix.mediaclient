package com.netflix.mediaclient.service.player.bladerunnerclient.volley;

import android.content.Context;
import android.util.Base64;
import com.netflix.cl.model.Error;
import com.netflix.mediaclient.android.app.BaseStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import java.nio.charset.StandardCharsets;
import o.C1332Xp;
import o.C8168dfL;
import o.InterfaceC4413bdz;
import o.InterfaceC5297bwB;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class BasePlayErrorStatus extends BaseStatus implements InterfaceC4413bdz {
    private static byte e$ss2$1911 = 24;
    private static int k = 0;

    /* renamed from: o  reason: collision with root package name */
    private static int f13211o = 1;
    protected String b;
    protected Context c;
    protected String f;
    protected String h;
    protected String i;
    protected String l;
    protected PlayRequestType m;
    protected JSONObject g = new JSONObject();
    protected JSONObject j = new JSONObject();
    protected int a = -1;

    @Override // com.netflix.mediaclient.android.app.BaseStatus
    public Error a() {
        return null;
    }

    public void c(JSONObject jSONObject) {
        this.j = jSONObject;
    }

    @Override // o.InterfaceC4413bdz
    public int m() {
        return this.a;
    }

    public String n() {
        return this.b;
    }

    public abstract String o();

    @Override // o.InterfaceC4413bdz
    public String p() {
        return this.i;
    }

    @Override // o.InterfaceC4413bdz
    public String q() {
        return this.f;
    }

    @Override // o.InterfaceC4413bdz
    public JSONObject s() {
        return this.j;
    }

    @Override // o.InterfaceC4413bdz
    public String t() {
        return this.h;
    }

    @Override // o.InterfaceC4413bdz
    public String x() {
        return this.l;
    }

    public BasePlayErrorStatus(Context context, PlayRequestType playRequestType) {
        this.c = context;
        this.m = playRequestType;
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public boolean k() {
        return C8168dfL.h(this.l);
    }

    @Override // com.netflix.mediaclient.android.app.BaseStatus, com.netflix.mediaclient.android.app.Status
    public Status.ErrorGroup d() {
        return Status.ErrorGroup.PlayApiError;
    }

    @Override // o.InterfaceC4413bdz
    public String r() {
        return this.g.toString();
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public String l() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        String str = this.l;
        if (C8168dfL.g(str)) {
            int i2 = k + 89;
            f13211o = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                str = this.c.getString(((InterfaceC5297bwB) C1332Xp.b(InterfaceC5297bwB.class)).a(PlayRequestType.c(this.m)));
                if (str.startsWith("'!#+")) {
                    int i3 = f13211o + 109;
                    k = i3 % 128;
                    if (i3 % 2 == 0) {
                        Object[] objArr = new Object[1];
                        A(str.substring(4), objArr);
                        str = ((String) objArr[0]).intern();
                    } else {
                        String substring = str.substring(4);
                        Object[] objArr2 = new Object[1];
                        A(substring, objArr2);
                        ((String) objArr2[0]).intern();
                        obj.hashCode();
                        throw null;
                    }
                }
            } else {
                this.c.getString(((InterfaceC5297bwB) C1332Xp.b(InterfaceC5297bwB.class)).a(PlayRequestType.c(this.m))).startsWith("'!#+");
                obj.hashCode();
                throw null;
            }
        }
        sb.append(str);
        if (v()) {
            sb.append(" (");
            sb.append(o());
            sb.append(")");
        }
        return sb.toString();
    }

    protected boolean v() {
        return C8168dfL.h(this.f);
    }

    /* loaded from: classes3.dex */
    public enum PlayRequestType {
        StreamingLicense("SL"),
        OfflineLicense("L"),
        OfflineLicenseRefresh("LR"),
        OfflineLicenseDelete("LD"),
        OfflineManifest("M"),
        OfflineManifestRefresh("MR"),
        OfflineDownloadComplete("DC"),
        Link("I"),
        SyncLicense("SN"),
        StreamingManifest("SM"),
        other("O");
        

        /* renamed from: o  reason: collision with root package name */
        private String f13212o;

        public static boolean c(PlayRequestType playRequestType) {
            return OfflineLicense == playRequestType || OfflineLicenseRefresh == playRequestType || OfflineLicenseDelete == playRequestType || OfflineManifest == playRequestType || OfflineManifestRefresh == playRequestType || OfflineDownloadComplete == playRequestType;
        }

        public String d() {
            return this.f13212o;
        }

        PlayRequestType(String str) {
            this.f13212o = str;
        }
    }

    public static boolean d(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.has(UmaAlert.ICON_ERROR) || jSONObject.has("innerErrors") || jSONObject.has("deviceCommand");
    }

    public static boolean e(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.has("links");
    }

    private void A(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$1911);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
