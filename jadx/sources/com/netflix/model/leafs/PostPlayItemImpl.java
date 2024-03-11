package com.netflix.model.leafs;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.PostPlayAsset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C9966zu;
import o.InterfaceC0943Io;
import o.InterfaceC0952Ix;
import o.InterfaceC1240Ub;
import o.InterfaceC5158btV;

/* loaded from: classes5.dex */
public class PostPlayItemImpl implements InterfaceC0952Ix, InterfaceC5158btV, PostPlayItem {
    private static final String TAG = "PostPlayItem";
    private final List<PostPlayAction> actions;
    private String ancestorSynopsis;
    private String ancestorTitle;
    private boolean autoPlay;
    private int autoPlaySeconds;
    private String availabilityDateMessaging;
    private PostPlayAsset backgroundAsset;
    private List<String> badgeKeys;
    private Map<String, String> delivery;
    private PostPlayAssetImpl displayArtAsset;
    private boolean episodeNumberHidden;
    private int episodes;
    private String experienceType;
    private String impressionData;
    private boolean isNSRE;
    private boolean isPlayable;
    private PostPlayAssetImpl logoAsset;
    private int matchPercentage;
    private String maturityRating;
    private boolean newForPvr;
    private boolean nextEpisodeAutoPlay;
    InterfaceC1240Ub<? extends InterfaceC0943Io> proxy;
    private int runtime;
    private int seamlessStart;
    private String seasonNumLabel;
    private String seasonSequenceAbbr;
    private int seasons;
    private String seasonsLabel;
    private String supplementalMessage;
    private String synopsis;
    private String title;
    private String type;
    private String uiLabel;
    private int userThumbRating;
    private Integer videoId;
    private Integer year;

    private void initializeUILabel() {
        this.uiLabel = "postplay";
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public List<PostPlayAction> getActions() {
        return this.actions;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getAncestorSynopsis() {
        return this.ancestorSynopsis;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getAncestorTitle() {
        return this.ancestorTitle;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public int getAutoPlaySeconds() {
        return this.autoPlaySeconds;
    }

    public String getAvailabilityDateMessaging() {
        return this.availabilityDateMessaging;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public PostPlayAsset getBackgroundAsset() {
        return this.backgroundAsset;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public List<String> getBadgeKeys() {
        return this.badgeKeys;
    }

    public Map<String, String> getDelivery() {
        return this.delivery;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public PostPlayAsset getDisplayArtAsset() {
        return this.displayArtAsset;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public int getEpisodes() {
        return this.episodes;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getExperienceType() {
        return this.experienceType;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getImpressionData() {
        return this.impressionData;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public PostPlayAsset getLogoAsset() {
        return this.logoAsset;
    }

    @Override // o.InterfaceC5158btV, com.netflix.model.leafs.PostPlayItem
    public int getMatchPercentage() {
        return this.matchPercentage;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getMaturityRating() {
        return this.maturityRating;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public int getRuntime() {
        return this.runtime;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getSeasonNumLabel() {
        return this.seasonNumLabel;
    }

    public String getSeasonSequenceAbbr() {
        return this.seasonSequenceAbbr;
    }

    public int getSeasons() {
        return this.seasons;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getSeasonsLabel() {
        return this.seasonsLabel;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getSupplementalMessage() {
        return this.supplementalMessage;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getSynopsis() {
        return this.synopsis;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getTitle() {
        return this.title;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getType() {
        return this.type;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public String getUiLabel() {
        return this.uiLabel;
    }

    @Override // o.InterfaceC5158btV
    public int getUserThumbRating() {
        return this.userThumbRating;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public Integer getVideoId() {
        return this.videoId;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public Integer getYear() {
        return this.year;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public boolean isAutoPlay() {
        return this.autoPlay;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public boolean isEpisodeNumberHidden() {
        return this.episodeNumberHidden;
    }

    public boolean isNSRE() {
        return this.isNSRE;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public boolean isNewForPvr() {
        return this.newForPvr;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public boolean isNextEpisodeAutoPlay() {
        return this.nextEpisodeAutoPlay;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public boolean isPlayable() {
        return this.isPlayable;
    }

    public void setAncestorSynopsis(String str) {
        this.ancestorSynopsis = str;
    }

    public void setAncestorTitle(String str) {
        this.ancestorTitle = str;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public void setAutoPlay(boolean z) {
        this.autoPlay = z;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public void setAutoPlaySeconds(int i) {
        this.autoPlaySeconds = i;
    }

    public void setAvailabilityDateMessaging(String str) {
        this.availabilityDateMessaging = str;
    }

    public void setBackgroundAsset(PostPlayAsset postPlayAsset) {
        this.backgroundAsset = postPlayAsset;
    }

    public void setDelivery(Map<String, String> map) {
        this.delivery = map;
    }

    public void setDisplayArtAsset(PostPlayAssetImpl postPlayAssetImpl) {
        this.displayArtAsset = postPlayAssetImpl;
    }

    public void setEpisodes(int i) {
        this.episodes = i;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public void setExperienceType(String str) {
        this.experienceType = str;
    }

    public void setImpressionData(String str) {
        this.impressionData = str;
    }

    public void setLogoAsset(PostPlayAssetImpl postPlayAssetImpl) {
        this.logoAsset = postPlayAssetImpl;
    }

    public void setMaturityRating(String str) {
        this.maturityRating = str;
    }

    public void setNSRE(boolean z) {
        this.isNSRE = z;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public void setNextEpisodeAutoPlay(boolean z) {
        this.nextEpisodeAutoPlay = z;
    }

    public void setRuntime(int i) {
        this.runtime = i;
    }

    public void setSeasonSequenceAbbr(String str) {
        this.seasonSequenceAbbr = str;
    }

    public void setSeasons(int i) {
        this.seasons = i;
    }

    public void setSeasonsLabel(String str) {
        this.seasonsLabel = str;
    }

    public void setSupplementalMessage(String str) {
        this.supplementalMessage = str;
    }

    public void setSynopsis(String str) {
        this.synopsis = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUserThumbRating(int i) {
    }

    public void setVideoId(Integer num) {
        this.videoId = num;
    }

    public void setYear(Integer num) {
        this.year = num;
    }

    public PostPlayItemImpl() {
        this(null, null);
    }

    public PostPlayItemImpl(JsonElement jsonElement) {
        this(jsonElement, null);
    }

    public PostPlayItemImpl(JsonElement jsonElement, InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        this.delivery = new HashMap();
        this.actions = new ArrayList(5);
        this.isNSRE = false;
        this.badgeKeys = new ArrayList(2);
        this.proxy = interfaceC1240Ub;
        if (jsonElement != null) {
            populate(jsonElement);
        }
        initializeUILabel();
        if (getAutoPlayAction() != null) {
            setAutoPlay(true);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        char c;
        boolean z;
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            JsonElement value = entry.getValue();
            if (!(value instanceof JsonNull)) {
                String key = entry.getKey();
                key.hashCode();
                switch (key.hashCode()) {
                    case -1865391343:
                        if (key.equals("seasonNumLabel")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1681835499:
                        if (key.equals("seasonSequenceAbbr")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1408207997:
                        if (key.equals("assets")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1180295454:
                        if (key.equals("isNSRE")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1161803523:
                        if (key.equals("actions")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -938102371:
                        if (key.equals("rating")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -694386553:
                        if (key.equals("ancestorSynopsis")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -632946216:
                        if (key.equals("episodes")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -457016128:
                        if (key.equals("uiLabel")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -339520796:
                        if (key.equals("seasonsLabel")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case -113850029:
                        if (key.equals("impressionData")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3575610:
                        if (key.equals("type")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3704893:
                        if (key.equals(SignupConstants.Field.DEMO_COLLECT_BIRTH_YEAR)) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case 110371416:
                        if (key.equals(SignupConstants.Field.VIDEO_TITLE)) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case 123262021:
                        if (key.equals("ancestorTitle")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case 417758403:
                        if (key.equals("supplementalMessage")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 452782838:
                        if (key.equals(SignupConstants.Field.VIDEO_ID)) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 823466996:
                        if (key.equals("delivery")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1034293595:
                        if (key.equals("availabilityDateMessaging")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1085869528:
                        if (key.equals("isPlayable")) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1362349198:
                        if (key.equals("maturityRating")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1550962648:
                        if (key.equals("runtime")) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1575288857:
                        if (key.equals("hiddenEpisodeNumbers")) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1828656532:
                        if (key.equals("synopsis")) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1968370160:
                        if (key.equals("seasons")) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2112468023:
                        if (key.equals("badgeKeys")) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        this.seasonNumLabel = value.getAsString();
                        continue;
                    case 1:
                        this.seasonSequenceAbbr = value.getAsString();
                        continue;
                    case 2:
                        for (Map.Entry<String, JsonElement> entry2 : value.getAsJsonObject().entrySet()) {
                            String key2 = entry2.getKey();
                            key2.hashCode();
                            int hashCode = key2.hashCode();
                            if (hashCode == -847101650) {
                                if (key2.equals("BACKGROUND")) {
                                    z = false;
                                }
                                z = true;
                            } else if (hashCode != -426397402) {
                                if (hashCode == 2342315 && key2.equals("LOGO")) {
                                    z = true;
                                }
                                z = true;
                            } else {
                                if (key2.equals("DISPLAY_ART")) {
                                    z = true;
                                }
                                z = true;
                            }
                            if (!z) {
                                this.backgroundAsset = new PostPlayAssetImpl(PostPlayAsset.Type.BACKGROUND, entry2.getValue());
                            } else if (z) {
                                this.displayArtAsset = new PostPlayAssetImpl(PostPlayAsset.Type.DISPLAY_ART, entry2.getValue());
                            } else if (z) {
                                this.logoAsset = new PostPlayAssetImpl(PostPlayAsset.Type.LOGO, entry2.getValue());
                            }
                        }
                        continue;
                    case 3:
                        this.isNSRE = value.getAsBoolean();
                        continue;
                    case 4:
                        populateCTA(value, this.actions);
                        continue;
                    case 5:
                        populateThumbsRating(value);
                        continue;
                    case 6:
                        this.ancestorSynopsis = value.getAsString();
                        continue;
                    case 7:
                        this.episodes = value.getAsInt();
                        continue;
                    case '\b':
                        this.uiLabel = value.getAsString();
                        continue;
                    case '\t':
                        this.seasonsLabel = value.getAsString();
                        continue;
                    case '\n':
                        this.impressionData = value.getAsString();
                        continue;
                    case 11:
                        this.type = value.getAsString();
                        continue;
                    case '\f':
                        this.year = Integer.valueOf(value.getAsInt());
                        continue;
                    case '\r':
                        this.title = value.getAsString();
                        continue;
                    case 14:
                        this.ancestorTitle = value.getAsString();
                        continue;
                    case 15:
                        this.supplementalMessage = value.getAsString();
                        continue;
                    case 16:
                        this.videoId = Integer.valueOf(value.getAsInt());
                        continue;
                    case 17:
                        populateMap(value, this.delivery);
                        continue;
                    case 18:
                        this.availabilityDateMessaging = value.getAsString();
                        continue;
                    case 19:
                        this.isPlayable = value.getAsBoolean();
                        continue;
                    case 20:
                        this.maturityRating = value.getAsString();
                        continue;
                    case 21:
                        this.runtime = value.getAsInt();
                        continue;
                    case 22:
                        this.episodeNumberHidden = value.getAsBoolean();
                        continue;
                    case 23:
                        this.synopsis = value.getAsString();
                        continue;
                    case 24:
                        this.seasons = value.getAsInt();
                        continue;
                    case 25:
                        if (!value.isJsonNull()) {
                            this.badgeKeys.clear();
                            JsonArray asJsonArray = value.getAsJsonArray();
                            for (int i = 0; i < asJsonArray.size(); i++) {
                                this.badgeKeys.add(asJsonArray.get(i).getAsString());
                            }
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
    }

    private void populateThumbsRating(JsonElement jsonElement) {
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        boolean z = false;
        if (!asJsonObject.has("matchPercentage") || asJsonObject.get("matchPercentage").isJsonNull()) {
            this.matchPercentage = 0;
        } else {
            this.matchPercentage = asJsonObject.get("matchPercentage").getAsInt();
        }
        if (!asJsonObject.has("userThumbsRating") || asJsonObject.get("userThumbsRating").isJsonNull()) {
            this.userThumbRating = 0;
        } else {
            this.userThumbRating = C9966zu.c(asJsonObject.get("userThumbsRating").getAsString());
        }
        JsonElement jsonElement2 = asJsonObject.get("newForPVR");
        if (jsonElement2 != null && !jsonElement2.isJsonNull() && jsonElement2.getAsBoolean()) {
            z = true;
        }
        this.newForPvr = z;
    }

    private void populateCTA(JsonElement jsonElement, List<PostPlayAction> list) {
        if (jsonElement.isJsonNull()) {
            return;
        }
        list.clear();
        JsonArray asJsonArray = jsonElement.getAsJsonArray();
        for (int i = 0; i < asJsonArray.size(); i++) {
            PostPlayActionImpl create = PostPlayActionImpl.create(asJsonArray.get(i), this.proxy);
            if (create != null) {
                list.add(create);
            }
        }
    }

    private void populateMap(JsonElement jsonElement, Map<String, String> map) {
        if (jsonElement.isJsonNull()) {
            return;
        }
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            map.put(entry.getKey(), entry.getValue().getAsString());
        }
    }

    private void populateFloatMap(JsonElement jsonElement, Map<String, Float> map) {
        if (jsonElement.isJsonNull()) {
            return;
        }
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            if (!entry.getValue().isJsonNull()) {
                map.put(entry.getKey(), Float.valueOf(entry.getValue().getAsFloat()));
            }
        }
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public PostPlayAction getPlayAction() {
        for (int i = 0; i < this.actions.size(); i++) {
            PostPlayAction postPlayAction = this.actions.get(i);
            if (postPlayAction != null && TextUtils.equals(postPlayAction.getType(), "play")) {
                return postPlayAction;
            }
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public PostPlayAction getPlayTrailerAction() {
        for (int i = 0; i < this.actions.size(); i++) {
            PostPlayAction postPlayAction = this.actions.get(i);
            if (postPlayAction != null && TextUtils.equals(postPlayAction.getType(), "play") && TextUtils.equals(postPlayAction.getName(), "playTrailer")) {
                return postPlayAction;
            }
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public PostPlayAction getPlayActionAtIndex(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.actions.size(); i3++) {
            PostPlayAction postPlayAction = this.actions.get(i3);
            if (postPlayAction != null && TextUtils.equals(postPlayAction.getType(), "play")) {
                if (i2 == i) {
                    return postPlayAction;
                }
                i2++;
            }
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public PostPlayAction getFirstActionWithTrackId() {
        for (int i = 0; i < this.actions.size(); i++) {
            PostPlayAction postPlayAction = this.actions.get(i);
            if (postPlayAction != null && postPlayAction.getTrackId() > 0) {
                return postPlayAction;
            }
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public PostPlayAction getMoreInfoAction() {
        for (int i = 0; i < this.actions.size(); i++) {
            PostPlayAction postPlayAction = this.actions.get(i);
            if (postPlayAction != null && (TextUtils.equals(postPlayAction.getType(), "details") || TextUtils.equals(postPlayAction.getType(), "mdp"))) {
                return postPlayAction;
            }
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public PostPlayAction getAutoPlayAction() {
        for (int i = 0; i < this.actions.size(); i++) {
            PostPlayAction postPlayAction = this.actions.get(i);
            if (postPlayAction != null && TextUtils.equals(postPlayAction.getType(), "play") && postPlayAction.isAutoPlay()) {
                return postPlayAction;
            }
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public PostPlayAction getSeasonRenewalPostPlayAction() {
        for (int i = 0; i < this.actions.size(); i++) {
            PostPlayAction postPlayAction = this.actions.get(i);
            if (postPlayAction != null && TextUtils.equals(postPlayAction.getType(), "play")) {
                return postPlayAction;
            }
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public PostPlayAction getSeasonRenewalPlayTrailerAction() {
        for (int i = 0; i < this.actions.size(); i++) {
            PostPlayAction postPlayAction = this.actions.get(i);
            if (postPlayAction != null && TextUtils.equals(postPlayAction.getType(), "play") && TextUtils.equals(postPlayAction.getName(), "playTrailer")) {
                return postPlayAction;
            }
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayItem
    public boolean hasNewBadge() {
        return this.badgeKeys.contains("NEW");
    }
}
