package com.netflix.model.leafs.originals;

import android.graphics.Color;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import com.netflix.model.leafs.ContextualTextImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.AbstractC0941Im;
import o.C1332Xp;
import o.C1596aHd;
import o.C8123deT;
import o.InterfaceC0952Ix;
import o.InterfaceC1598aHf;
import o.InterfaceC8319diD;

/* loaded from: classes5.dex */
public class BillboardSummaryImpl extends AbstractC0941Im implements InterfaceC8319diD, InterfaceC0952Ix, BillboardSummary {
    private static final String TAG = "BillboardSummary";
    private String actionToken;
    private List<BillboardCTA> actions;
    private BillboardAssetsHolder assets;
    private BillboardAvailabilityDates availabilityDates;
    private String billboardTheme;
    private String billboardType;
    private String id;
    private String impressionToken;
    private boolean isAward;
    private boolean isOriginal;
    private String maturityRating;
    private BillboardPhase phase;
    private String supplementalMessage;
    private String synopsis;
    private List<TagSummary> tags;
    private String title;
    private VideoAssets videoAssets;
    private final List<String> badgeKeys = new ArrayList(3);
    private ContextualText contextualSynopsis = null;
    private Integer highlightColor = null;

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public String getActionToken() {
        return this.actionToken;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public List<BillboardCTA> getActions() {
        return this.actions;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public BillboardAvailabilityDates getAvailabilityDates() {
        return this.availabilityDates;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public List<String> getBadgeKeys() {
        return this.badgeKeys;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public String getBillboardTheme() {
        return this.billboardTheme;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public String getBillboardType() {
        return this.billboardType;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public ContextualText getContextualSynopsis() {
        return this.contextualSynopsis;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public Integer getHighlightColor() {
        return this.highlightColor;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public BillboardAsset getHorizontalLogo() {
        return null;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public String getId() {
        return this.id;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public String getImpressionToken() {
        return this.impressionToken;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public String getMaturityRating() {
        return this.maturityRating;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public BillboardPhase getPhase() {
        return this.phase;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public String getSupplementalMessage() {
        return this.supplementalMessage;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public String getSynopsis() {
        return this.synopsis;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public List<TagSummary> getTags() {
        return this.tags;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public String getTitle() {
        return this.title;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public VideoAssets getVideoAssets() {
        return this.videoAssets;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public boolean isAward() {
        return this.isAward;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public boolean isOriginal() {
        return this.isOriginal;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public BillboardAsset getBackground() {
        BillboardAssetsHolder billboardAssetsHolder = this.assets;
        if (billboardAssetsHolder == null) {
            return null;
        }
        return billboardAssetsHolder.getBackground();
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public BillboardAsset getHorizontalBackground() {
        BillboardAssetsHolder billboardAssetsHolder = this.assets;
        if (billboardAssetsHolder == null) {
            return null;
        }
        return billboardAssetsHolder.getHorizontalBackground();
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public BillboardAsset getLogo() {
        BillboardAssetsHolder billboardAssetsHolder = this.assets;
        if (billboardAssetsHolder == null) {
            return null;
        }
        return billboardAssetsHolder.getLogo();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        char c;
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            JsonElement value = entry.getValue();
            String key = entry.getKey();
            key.hashCode();
            int i = 0;
            switch (key.hashCode()) {
                case -1566075899:
                    if (key.equals("contextualSynopsis")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1408207997:
                    if (key.equals("assets")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1354842768:
                    if (key.equals("colors")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1161803523:
                    if (key.equals("actions")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1037500982:
                    if (key.equals("billboardTheme")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -404086294:
                    if (key.equals("availabilityDates")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -171998439:
                    if (key.equals("billboardType")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (key.equals(SignupConstants.Field.LANG_ID)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3552281:
                    if (key.equals("tags")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 106629499:
                    if (key.equals("phase")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 110371416:
                    if (key.equals(SignupConstants.Field.VIDEO_TITLE)) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 417758403:
                    if (key.equals("supplementalMessage")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 526707678:
                    if (key.equals("videoAssets")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 585773339:
                    if (key.equals("isOriginal")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 780801392:
                    if (key.equals("impressionToken")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 1362349198:
                    if (key.equals("maturityRating")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 1573436771:
                    if (key.equals("actionToken")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 1828656532:
                    if (key.equals("synopsis")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 2054629203:
                    if (key.equals("isAward")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 2112468023:
                    if (key.equals("badgeKeys")) {
                        c = 19;
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
                    if (value.isJsonObject()) {
                        ContextualTextImpl contextualTextImpl = new ContextualTextImpl();
                        contextualTextImpl.populate(value.getAsJsonObject());
                        this.contextualSynopsis = contextualTextImpl;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    this.assets = new BillboardAssetsHolder(value);
                    break;
                case 2:
                    if (value.isJsonObject()) {
                        JsonObject asJsonObject = value.getAsJsonObject();
                        if (asJsonObject.has("highlightColor")) {
                            this.highlightColor = parseColor(asJsonObject.get("highlightColor"));
                            break;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                case 3:
                    if (value.isJsonArray()) {
                        this.actions = new ArrayList();
                        Gson gson = (Gson) C1332Xp.b(Gson.class);
                        JsonArray asJsonArray = value.getAsJsonArray();
                        while (i < asJsonArray.size()) {
                            this.actions.add((BillboardCTA) gson.fromJson((JsonElement) asJsonArray.get(i).getAsJsonObject(), (Class<Object>) BillboardCTA.class));
                            i++;
                        }
                        break;
                    } else {
                        break;
                    }
                case 4:
                    this.billboardTheme = C8123deT.b(value);
                    break;
                case 5:
                    if (value.isJsonNull()) {
                        break;
                    } else {
                        this.availabilityDates = (BillboardAvailabilityDates) ((Gson) C1332Xp.b(Gson.class)).fromJson((JsonElement) value.getAsJsonObject(), (Class<Object>) BillboardAvailabilityDates.class);
                        break;
                    }
                case 6:
                    this.billboardType = C8123deT.b(value);
                    break;
                case 7:
                    this.id = C8123deT.b(value);
                    break;
                case '\b':
                    this.tags = TagsListItemImpl.getListOfTags(value);
                    break;
                case '\t':
                    if (value.isJsonNull()) {
                        break;
                    } else {
                        this.phase = (BillboardPhase) ((Gson) C1332Xp.b(Gson.class)).fromJson((JsonElement) value.getAsJsonObject(), (Class<Object>) BillboardPhase.class);
                        break;
                    }
                case '\n':
                    this.title = C8123deT.b(value);
                    break;
                case 11:
                    this.supplementalMessage = C8123deT.b(value);
                    break;
                case '\f':
                    if (value.isJsonNull()) {
                        break;
                    } else {
                        this.videoAssets = (VideoAssets) ((Gson) C1332Xp.b(Gson.class)).fromJson((JsonElement) value.getAsJsonObject(), (Class<Object>) VideoAssets.class);
                        break;
                    }
                case '\r':
                    this.isOriginal = C8123deT.a(value);
                    break;
                case 14:
                    this.impressionToken = C8123deT.b(value);
                    break;
                case 15:
                    this.maturityRating = C8123deT.b(value);
                    break;
                case 16:
                    this.actionToken = C8123deT.b(value);
                    break;
                case 17:
                    this.synopsis = C8123deT.b(value);
                    break;
                case 18:
                    this.isAward = C8123deT.a(value);
                    break;
                case 19:
                    if (value.isJsonNull()) {
                        break;
                    } else {
                        JsonArray asJsonArray2 = value.getAsJsonArray();
                        while (i < asJsonArray2.size()) {
                            this.badgeKeys.add(asJsonArray2.get(i).getAsString());
                            i++;
                        }
                        break;
                    }
            }
        }
    }

    private static Integer parseColor(JsonElement jsonElement) {
        if (jsonElement.isJsonNull()) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor("#" + jsonElement.getAsString()));
        } catch (IllegalArgumentException e) {
            InterfaceC1598aHf.a(new C1596aHd(String.format("%s: can't recognize color %s", TAG, jsonElement.getAsString())).b(ErrorType.m).d(e).b(false));
            return null;
        }
    }
}
