package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import java.util.Map;
import o.AbstractC0941Im;
import o.C1044Mm;
import o.C8168dfL;
import o.InterfaceC0952Ix;
import o.InterfaceC5155btS;

/* loaded from: classes5.dex */
public class LoLoMoSummaryImpl extends AbstractC0941Im implements InterfaceC5155btS, InterfaceC0952Ix {
    private static final String TAG = "LoLoMoSummary";
    @SerializedName("fromCache")
    private boolean fromCache;
    @SerializedName("createTime")
    private long mCreateTime;
    @SerializedName("expiryTimeStamp")
    private long mExpiryTimeStamp;
    @SerializedName(SignupConstants.Field.LANG_ID)
    private String mId;
    @SerializedName("length")
    private int mNumLoMos;
    @SerializedName(SignupConstants.Field.VIDEO_TITLE)
    private String mTitle;
    @SerializedName("profileGuid")
    private String profileGuid;

    @Override // o.InterfaceC5155btS
    public long getCreateTime() {
        return this.mCreateTime;
    }

    @Override // o.InterfaceC5155btS
    public long getExpiryTimeStamp() {
        return this.mExpiryTimeStamp;
    }

    @Override // o.InterfaceC5178btp
    public String getId() {
        return this.mId;
    }

    @Override // o.InterfaceC5156btT
    public String getLolomoId() {
        return this.mId;
    }

    @Override // o.InterfaceC5156btT
    public int getNumLoMos() {
        return this.mNumLoMos;
    }

    @Override // o.InterfaceC5178btp
    public String getTitle() {
        return this.mTitle;
    }

    @Override // o.InterfaceC5156btT
    public boolean isFromCache() {
        return this.fromCache;
    }

    public void setFromCache(boolean z) {
        this.fromCache = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        char c;
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        C1044Mm.a(TAG, "Got Lolomo summary response: %s", asJsonObject);
        for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
            String key = entry.getKey();
            key.hashCode();
            switch (key.hashCode()) {
                case -1106363674:
                    if (key.equals("length")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (key.equals(SignupConstants.Field.LANG_ID)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 110371416:
                    if (key.equals(SignupConstants.Field.VIDEO_TITLE)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 177313746:
                    if (key.equals("profileGuid")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 306021635:
                    if (key.equals("expiryTimeStamp")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1369213417:
                    if (key.equals("createTime")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.mNumLoMos = entry.getValue().getAsInt();
            } else if (c == 1) {
                this.mId = entry.getValue().getAsString();
            } else if (c == 2) {
                this.mTitle = C8168dfL.b(entry.getValue().getAsString());
            } else if (c == 3) {
                this.profileGuid = entry.getValue().getAsString();
            } else if (c == 4) {
                this.mExpiryTimeStamp = entry.getValue().getAsLong();
            } else if (c == 5) {
                this.mCreateTime = entry.getValue().getAsLong();
            }
        }
    }

    @Override // o.InterfaceC5178btp
    public LoMoType getType() {
        return LoMoType.STANDARD;
    }

    public String toString() {
        return "LoLoMoSummary{mId='" + this.mId + "', mTitle='" + this.mTitle + "', mNumLoMos=" + this.mNumLoMos + ", mExpiryTimeStamp=" + this.mExpiryTimeStamp + ", fromCache=" + this.fromCache + ", profileGuid='" + this.profileGuid + "'}";
    }
}
