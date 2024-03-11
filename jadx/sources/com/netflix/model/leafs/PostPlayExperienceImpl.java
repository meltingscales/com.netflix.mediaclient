package com.netflix.model.leafs;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.model.leafs.PostPlayAsset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.AbstractC0941Im;
import o.C1332Xp;
import o.InterfaceC0943Io;
import o.InterfaceC0952Ix;
import o.InterfaceC1240Ub;
import o.InterfaceC8319diD;

/* loaded from: classes5.dex */
public class PostPlayExperienceImpl extends AbstractC0941Im implements InterfaceC0952Ix, InterfaceC8319diD, PostPlayExperience {
    private static final String TAG = "PostPlayExperience";
    private Integer actionsInitialIndex;
    private boolean autoplay;
    private int autoplaySeconds;
    private PostPlayAsset backgroundAsset;
    private final List<PostPlayAction> experienceTitle;
    private final List<PostPlayItem> items;
    private Integer itemsInitialIndex;
    private PostPlayAsset logoAsset;
    private String promotedSupplementalMessage;
    private String promotedTitle;
    private Integer promotedVideoId;
    InterfaceC1240Ub<? extends InterfaceC0943Io> proxy;
    private String requestId;
    private int seamlessCountdownSeconds;
    private int seamlessEnd;
    private SeasonRenewal seasonRenewal;
    private String theme;
    private String type;
    private String uuid;

    @Override // com.netflix.model.leafs.PostPlayExperience
    public Integer getActionsInitialIndex() {
        return this.actionsInitialIndex;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public boolean getAutoplay() {
        return this.autoplay;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public int getAutoplaySeconds() {
        return this.autoplaySeconds;
    }

    public PostPlayAsset getBackgroundAsset() {
        return this.backgroundAsset;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public List<PostPlayAction> getExperienceTitle() {
        return this.experienceTitle;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public List<PostPlayItem> getItems() {
        return this.items;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public Integer getItemsInitialIndex() {
        return this.itemsInitialIndex;
    }

    public PostPlayAsset getLogoAsset() {
        return this.logoAsset;
    }

    public String getPromotedSupplementalMessage() {
        return this.promotedSupplementalMessage;
    }

    public String getPromotedTitle() {
        return this.promotedTitle;
    }

    public Integer getPromotedVideoId() {
        return this.promotedVideoId;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public String getRequestId() {
        return this.requestId;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public int getSeamlessCountdownSeconds() {
        return this.seamlessCountdownSeconds;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public int getSeamlessEnd() {
        return this.seamlessEnd;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public SeasonRenewal getSeasonRenewal() {
        return this.seasonRenewal;
    }

    public String getTheme() {
        return this.theme;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public String getType() {
        return this.type;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public String getUuid() {
        return this.uuid;
    }

    public void setActionsInitialIndex(Integer num) {
        this.actionsInitialIndex = num;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public void setAutoplay(boolean z) {
        this.autoplay = z;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public void setAutoplaySeconds(int i) {
        this.autoplaySeconds = i;
    }

    public void setBackgroundAsset(PostPlayAsset postPlayAsset) {
        this.backgroundAsset = postPlayAsset;
    }

    public void setItemsInitialIndex(Integer num) {
        this.itemsInitialIndex = num;
    }

    public void setLogoAsset(PostPlayAsset postPlayAsset) {
        this.logoAsset = postPlayAsset;
    }

    public void setPromotedSupplementalMessage(String str) {
        this.promotedSupplementalMessage = str;
    }

    public void setPromotedTitle(String str) {
        this.promotedTitle = str;
    }

    public void setPromotedVideoId(Integer num) {
        this.promotedVideoId = num;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSeamlessCountdownSeconds(int i) {
        this.seamlessCountdownSeconds = i;
    }

    public void setSeamlessEnd(int i) {
        this.seamlessEnd = i;
    }

    public void setTheme(String str) {
        this.theme = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public PostPlayExperienceImpl() {
        this(null);
    }

    public PostPlayExperienceImpl(InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        this.experienceTitle = new ArrayList(1);
        this.items = new ArrayList(5);
        this.proxy = interfaceC1240Ub;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        char c;
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            JsonElement value = entry.getValue();
            if (!(value instanceof JsonNull)) {
                String key = entry.getKey();
                key.hashCode();
                switch (key.hashCode()) {
                    case -1408207997:
                        if (key.equals("assets")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -430219499:
                        if (key.equals("seasonRenewal")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -3512370:
                        if (key.equals("itemsInitialIndex")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2616251:
                        if (key.equals("UUID")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3575610:
                        if (key.equals("type")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 49423260:
                        if (key.equals("autoplaySeconds")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 100526016:
                        if (key.equals("items")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 110327241:
                        if (key.equals("theme")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 473683339:
                        if (key.equals("actionsInitialIndex")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 693933066:
                        if (key.equals(Payload.PARAM_RENO_REQUEST_ID)) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1121767444:
                        if (key.equals("promotedTitle")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1439562083:
                        if (key.equals("autoplay")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1668395075:
                        if (key.equals("currentEpisodeSeamlessData")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1741756850:
                        if (key.equals("promotedVideoId")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2065592703:
                        if (key.equals("promotedSupplementalMessage")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2111580942:
                        if (key.equals("experienceTitle")) {
                            c = 15;
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
                        if (!value.isJsonNull()) {
                            for (Map.Entry<String, JsonElement> entry2 : value.getAsJsonObject().entrySet()) {
                                String key2 = entry2.getKey();
                                key2.hashCode();
                                if (key2.equals("background")) {
                                    this.backgroundAsset = new PostPlayAssetImpl(PostPlayAsset.Type.BACKGROUND, entry2.getValue());
                                } else if (key2.equals("logo")) {
                                    this.logoAsset = new PostPlayAssetImpl(PostPlayAsset.Type.LOGO, entry2.getValue());
                                }
                            }
                            break;
                        } else {
                            continue;
                        }
                    case 1:
                        this.seasonRenewal = (SeasonRenewal) ((Gson) C1332Xp.b(Gson.class)).fromJson((JsonElement) value.getAsJsonObject(), (Class<Object>) SeasonRenewal.class);
                        continue;
                    case 2:
                        this.itemsInitialIndex = Integer.valueOf(value.getAsInt());
                        continue;
                    case 3:
                        this.uuid = value.getAsString();
                        continue;
                    case 4:
                        this.type = value.getAsString();
                        continue;
                    case 5:
                        this.autoplaySeconds = value.getAsInt();
                        continue;
                    case 6:
                        if (!value.isJsonNull()) {
                            this.items.clear();
                            JsonArray asJsonArray = value.getAsJsonArray();
                            for (int i = 0; i < asJsonArray.size(); i++) {
                                this.items.add(new PostPlayItemImpl(asJsonArray.get(i), this.proxy));
                            }
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        this.theme = value.getAsString();
                        continue;
                    case '\b':
                        this.actionsInitialIndex = Integer.valueOf(value.getAsInt());
                        continue;
                    case '\t':
                        this.requestId = value.getAsString();
                        continue;
                    case '\n':
                        this.promotedTitle = value.getAsString();
                        continue;
                    case 11:
                        this.autoplay = value.getAsBoolean();
                        continue;
                    case '\f':
                        if (value.getAsJsonObject().has("seamlessEnd")) {
                            this.seamlessEnd = value.getAsJsonObject().get("seamlessEnd").getAsInt();
                        }
                        if (value.getAsJsonObject().has("seamlessCountdownSeconds")) {
                            this.seamlessCountdownSeconds = value.getAsJsonObject().get("seamlessCountdownSeconds").getAsInt();
                            break;
                        } else {
                            continue;
                        }
                    case '\r':
                        this.promotedVideoId = Integer.valueOf(value.getAsInt());
                        continue;
                    case 14:
                        this.promotedSupplementalMessage = value.getAsString();
                        continue;
                    case 15:
                        populateCTA(value, this.experienceTitle);
                        continue;
                }
            }
        }
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

    public PostPlayAction getAutoPlayAction() {
        for (PostPlayItem postPlayItem : this.items) {
            PostPlayAction autoPlayAction = postPlayItem.getAutoPlayAction();
            if (autoPlayAction != null) {
                return autoPlayAction;
            }
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public PostPlayItem getAutoPlayItem() {
        for (PostPlayItem postPlayItem : this.items) {
            if (postPlayItem.getAutoPlayAction() != null) {
                return postPlayItem;
            }
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public PostPlayItem getSeasonRenewalPostPlayItem() {
        for (PostPlayItem postPlayItem : this.items) {
            if (postPlayItem.getSeasonRenewalPostPlayAction() != null) {
                return postPlayItem;
            }
        }
        return null;
    }

    @Override // com.netflix.model.leafs.PostPlayExperience
    public int getAutoPlayActionSeconds() {
        for (PostPlayItem postPlayItem : this.items) {
            PostPlayAction autoPlayAction = postPlayItem.getAutoPlayAction();
            if (autoPlayAction != null) {
                return autoPlayAction.getAutoplaySeconds();
            }
        }
        return 0;
    }
}
