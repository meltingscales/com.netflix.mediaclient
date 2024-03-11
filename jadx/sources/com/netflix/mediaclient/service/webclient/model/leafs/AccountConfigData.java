package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.StreamProfileType;
import o.C1044Mm;
import o.C8118deO;
import o.C8168dfL;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class AccountConfigData {
    private static final String TAG = "nf_config";
    @SerializedName("disableSuspendPlay")
    private boolean disableSuspendPlay;
    @SerializedName("enableCast")
    private boolean enableCast;
    @SerializedName("myListForKidsDisabled")
    private boolean myListForKidsDisabled;
    @SerializedName("offlineCodecPrefData")
    private OfflineCodecPrefData offlineCodecPrefData;
    @SerializedName("preAppPartnerExperience")
    private String preAppPartnerExperience;
    @SerializedName("preAppWidgetExperience")
    private String preAppWidgetExperience;
    @SerializedName("searchResultsSimilarityAlgorithm")
    private SearchResultsSimilarityAlgorithm searchResultsSimilarityAlgorithm;
    @SerializedName("streamProfileData")
    private StreamProfileData streamProfileData;
    @SerializedName("streamingCodecPrefData")
    private StreamingCodecPrefData streamingCodecPrefData;
    @SerializedName("userPin")
    private String userPin;
    @SerializedName("voipEnabledOnAccount")
    private boolean voipEnabledOnAccount;
    @SerializedName("castWhitelistTargets")
    private final String castWhitelist = null;
    @SerializedName("mdxBlacklistTargets")
    private final String mdxBlacklistTargets = null;
    private transient JSONArray mCastWhitelistJSONArray = null;
    private transient JSONArray mMdxBlacklistTargetsJSONArray = null;

    public String getCastBlacklist() {
        return this.castWhitelist;
    }

    public boolean getCastEnabled() {
        return this.enableCast;
    }

    public String getMdxBlacklist() {
        return this.mdxBlacklistTargets;
    }

    public OfflineCodecPrefData getOfflineCodecPrefData() {
        return this.offlineCodecPrefData;
    }

    public String getPreAppPartnerExperience() {
        return this.preAppPartnerExperience;
    }

    public String getPreAppWidgetExperience() {
        return this.preAppWidgetExperience;
    }

    public SearchResultsSimilarityAlgorithm getSearchResultsSimilarityAlgorithm() {
        return this.searchResultsSimilarityAlgorithm;
    }

    public StreamingCodecPrefData getStreamingCodecPrefData() {
        return this.streamingCodecPrefData;
    }

    public String getUserPin() {
        return this.userPin;
    }

    public boolean isMyListForKidsDisabled() {
        return this.myListForKidsDisabled;
    }

    public boolean isVoipEnabledOnAccount() {
        return this.voipEnabledOnAccount;
    }

    public boolean toDisableSuspendPlay() {
        return this.disableSuspendPlay;
    }

    public JSONArray getMdxBlacklistAsJsonArray() {
        JSONArray jSONArray;
        if (this.mMdxBlacklistTargetsJSONArray == null) {
            if (C8168dfL.h(this.mdxBlacklistTargets)) {
                try {
                    jSONArray = new JSONArray(this.mdxBlacklistTargets);
                } catch (JSONException unused) {
                    C1044Mm.e(TAG, String.format("mdxBlacklistTargets bad json: %s", this.mdxBlacklistTargets));
                }
                this.mMdxBlacklistTargetsJSONArray = jSONArray;
            }
            jSONArray = null;
            this.mMdxBlacklistTargetsJSONArray = jSONArray;
        }
        return this.mMdxBlacklistTargetsJSONArray;
    }

    public JSONArray getCastWhitelistAsJsonArray() {
        JSONArray jSONArray;
        if (this.mCastWhitelistJSONArray == null) {
            if (C8168dfL.h(this.castWhitelist)) {
                try {
                    jSONArray = new JSONArray(this.castWhitelist);
                } catch (JSONException unused) {
                    C1044Mm.e(TAG, String.format("castWhitelist bad json: %s", this.castWhitelist));
                }
                this.mCastWhitelistJSONArray = jSONArray;
            }
            jSONArray = null;
            this.mCastWhitelistJSONArray = jSONArray;
        }
        return this.mCastWhitelistJSONArray;
    }

    public String toJsonString() {
        return C8118deO.a().toJson(this);
    }

    public static AccountConfigData fromJsonString(String str) {
        if (C8168dfL.g(str)) {
            return null;
        }
        AccountConfigData accountConfigData = (AccountConfigData) C8118deO.a().fromJson(str, (Class<Object>) AccountConfigData.class);
        accountConfigData.mCastWhitelistJSONArray = null;
        accountConfigData.mMdxBlacklistTargetsJSONArray = null;
        return accountConfigData;
    }

    public BwCap getBwCap(StreamProfileType streamProfileType) {
        StreamProfileData streamProfileData = this.streamProfileData;
        return streamProfileData != null ? BwCapKt.getBwCapForProfile(streamProfileType, streamProfileData) : StreamProfileData.Companion.getBW_CAP_DEFAULT();
    }
}
