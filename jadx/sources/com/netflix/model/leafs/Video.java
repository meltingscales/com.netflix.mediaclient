package com.netflix.model.leafs;

import androidx.appcompat.widget.ActivityChooserModel;
import com.fasterxml.jackson.core.JsonFactory;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.interface_.SupplementalMessageType;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.advisory.AdvisoryImpl;
import com.netflix.model.leafs.blades.CreditMarks;
import com.netflix.model.leafs.originals.ContentWarning;
import com.netflix.model.leafs.originals.TagSummary;
import com.netflix.model.leafs.originals.TagsListItemImpl;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.AbstractC0941Im;
import o.C1044Mm;
import o.C1332Xp;
import o.C1596aHd;
import o.C8123deT;
import o.C9966zu;
import o.InterfaceC0952Ix;
import o.InterfaceC1598aHf;
import o.InterfaceC5157btU;
import org.chromium.net.ConnectionSubtype;

/* loaded from: classes5.dex */
public final class Video {
    private Video() {
    }

    /* loaded from: classes5.dex */
    public static final class Advisories extends AbstractC0941Im implements InterfaceC0952Ix {
        private static final String TAG = "Advisories";
        private List<Advisory> advisories = new ArrayList(0);

        public List<Advisory> getAdvisoryList() {
            return this.advisories;
        }

        @Override // o.InterfaceC0952Ix
        public void populate(JsonElement jsonElement) {
            this.advisories = AdvisoryImpl.asList(jsonElement.getAsJsonObject().getAsJsonArray("advisory"));
        }

        public String toString() {
            return "Advisories [advisory=" + this.advisories + "]";
        }
    }

    /* loaded from: classes5.dex */
    public static final class InQueue extends AbstractC0941Im implements InterfaceC0952Ix {
        private static final String TAG = "InQueue";
        public boolean inQueue;

        public InQueue() {
        }

        public InQueue(boolean z) {
            this.inQueue = z;
        }

        @Override // o.InterfaceC0952Ix
        public void populate(JsonElement jsonElement) {
            if (jsonElement == null || !jsonElement.isJsonPrimitive()) {
                InterfaceC1598aHf.a(new C1596aHd("Failed to parse element for InQueue: " + jsonElement).b(ErrorType.m).b(false));
                this.inQueue = false;
                return;
            }
            this.inQueue = jsonElement.getAsBoolean();
        }

        public String toString() {
            return "InQueue [inQueue=" + this.inQueue + "]";
        }
    }

    /* loaded from: classes5.dex */
    public static final class InRemindMeQueue extends AbstractC0941Im implements InterfaceC0952Ix {
        private static final String TAG = "InQueue";
        public boolean inRemindMeQueue;

        public InRemindMeQueue() {
        }

        public InRemindMeQueue(boolean z) {
            this.inRemindMeQueue = z;
        }

        @Override // o.InterfaceC0952Ix
        public void populate(JsonElement jsonElement) {
            if (jsonElement == null || !jsonElement.isJsonPrimitive()) {
                C1044Mm.j(TAG, "Failed to parse element for InRemindMeQueue: " + jsonElement);
                this.inRemindMeQueue = false;
                return;
            }
            this.inRemindMeQueue = jsonElement.getAsBoolean();
        }

        public String toString() {
            return "InRemindMeQueue [inRemindMeQueue=" + this.inRemindMeQueue + "]";
        }
    }

    /* loaded from: classes5.dex */
    public static final class HasWatched extends AbstractC0941Im implements InterfaceC0952Ix {
        private static final String TAG = "hasWatched";
        public boolean hasWatched;

        public HasWatched() {
        }

        public HasWatched(boolean z) {
            this.hasWatched = z;
        }

        @Override // o.InterfaceC0952Ix
        public void populate(JsonElement jsonElement) {
            for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                JsonElement value = entry.getValue();
                String key = entry.getKey();
                key.hashCode();
                if (key.equals(TAG)) {
                    this.hasWatched = value.getAsBoolean();
                }
            }
        }

        public String toString() {
            return "hasWatched [hasWatched=" + this.hasWatched + "]";
        }
    }

    /* loaded from: classes5.dex */
    public static final class RatingInfo extends AbstractC0941Im implements InterfaceC5157btU, InterfaceC0952Ix {
        private static final String TAG = "RatingInfo";
        public boolean isNewForPvr;
        public int matchPercentage;
        public int userThumbRating;

        public int getMatchPercentage() {
            return this.matchPercentage;
        }

        @Override // o.InterfaceC5157btU
        public int getUserThumbRating() {
            return this.userThumbRating;
        }

        public boolean isNewForPvr() {
            return this.isNewForPvr;
        }

        @Override // o.InterfaceC0952Ix
        public void populate(JsonElement jsonElement) {
            char c;
            for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                JsonElement value = entry.getValue();
                String key = entry.getKey();
                key.hashCode();
                int hashCode = key.hashCode();
                if (hashCode == -1588595137) {
                    if (key.equals("matchPercentage")) {
                        c = 0;
                    }
                    c = 65535;
                } else if (hashCode != -145025464) {
                    if (hashCode == 205892953 && key.equals("isNewForPvr")) {
                        c = 2;
                    }
                    c = 65535;
                } else {
                    if (key.equals("userThumbRating")) {
                        c = 1;
                    }
                    c = 65535;
                }
                if (c == 0) {
                    this.matchPercentage = value.getAsInt();
                } else if (c == 1) {
                    this.userThumbRating = C9966zu.e(value.getAsInt());
                } else if (c == 2) {
                    this.isNewForPvr = value.getAsBoolean();
                }
            }
        }

        public String toString() {
            return "Rating [userThumbRating=" + this.userThumbRating + ", matchPercentage=" + this.matchPercentage + ", isNewForPvr=" + this.isNewForPvr + "]";
        }
    }

    /* loaded from: classes5.dex */
    public static final class OfflineAvailable extends AbstractC0941Im implements InterfaceC0952Ix {
        private static final String TAG = "OfflineAvailable";
        public boolean isAvailableOffline;

        public boolean isAvailableOffline() {
            return this.isAvailableOffline;
        }

        @Override // o.InterfaceC0952Ix
        public void populate(JsonElement jsonElement) {
            for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                JsonElement value = entry.getValue();
                String key = entry.getKey();
                key.hashCode();
                if (key.equals("isAvailableOffline")) {
                    this.isAvailableOffline = value.getAsBoolean();
                }
            }
        }

        public String toString() {
            return "offlineAvailable [offlineAvailable=" + this.isAvailableOffline + "]";
        }
    }

    /* loaded from: classes5.dex */
    public static class Detail extends AbstractC0941Im implements InterfaceC0952Ix {
        private static final String TAG = "Detail";
        public String abbrSeqLabel;
        public String actors;
        public String availabilityDateMsg;
        public String boxartUrl;
        public String certification;
        public ContentWarning contentWarning;
        public String creatorHome;
        public CreditMarks creditMarks;
        public String directors;
        public int displayRuntime;
        public int endtime;
        public int episodeCount;
        public int episodeNumber;
        public boolean episodeNumberHidden;
        public String genres;
        public boolean hasAssistiveAudio;
        public boolean hasClosedCaption;
        public boolean hasTrailers;
        public String horzDispUrl;
        public InteractiveSummary interactiveSummary;
        public String interestingSmallUrl;
        public String interestingUrl;
        public boolean is5dot1Available;
        public boolean isAgeProtected;
        public boolean isAutoPlayEnabled;
        public boolean isDolbyVisionAvailable;
        public boolean isDownloadAvailable;
        public boolean isEpisode;
        public boolean isHdAvailable;
        public boolean isHdr10Avaiable;
        public boolean isNSRE;
        public boolean isNextPlayableEpisode;
        public boolean isNonSerializedTv;
        public boolean isOriginal;
        public boolean isPinProtected;
        public boolean isPreviewProtected;
        public boolean isSpatialAudioAvailable;
        public boolean isSupplementalVideo;
        public boolean isUhdAvailable;
        public int logicalStart;
        public String longSeqLabel;
        public int maturityLevel;
        public String mdxVertUrl;
        public String newBadge;
        public String nextEpisodeId;
        public String nextEpisodeTitle;
        public float predictedRating;
        public String quality;
        public String restUrl;
        public int runtime;
        public int seasonCount;
        public String seasonId;
        public String seasonNumLabel;
        public int seasonNumber;
        public String seasonTitle;
        public String showId;
        public String showTitle;
        public String squareUrl;
        public String storyImgUrl;
        public String supplementalMessage;
        public boolean supportsInteractiveExperiences;
        public boolean supportsPrePlay;
        public String synopsis;
        public String title;
        public String titleLogoUrl;
        public String titleUrl;
        public String type;
        public String verticalInterestingUrl;
        public int year;
        public boolean storyImgAvailable = true;
        public long contentChangeDate = -1;
        public int autoPlayMaxCount = -1;
        public List<String> episodeBadges = new ArrayList(3);
        public String id = "-1";
        public SupplementalMessageType supplementalMessageType = SupplementalMessageType.l;

        public ContentWarning getContentWarning() {
            ContentWarning contentWarning = this.contentWarning;
            if (contentWarning != null) {
                return contentWarning;
            }
            return null;
        }

        public String getInterestingUrl() {
            return this.interestingUrl;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // o.InterfaceC0952Ix
        public void populate(JsonElement jsonElement) {
            char c;
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            this.storyImgAvailable = true;
            Gson gson = (Gson) C1332Xp.b(Gson.class);
            for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                JsonElement value = entry.getValue();
                String key = entry.getKey();
                key.hashCode();
                boolean z = false;
                r5 = false;
                r5 = false;
                boolean z2 = false;
                z = false;
                z = false;
                switch (key.hashCode()) {
                    case -2124216975:
                        if (key.equals("isEpisode")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1944322078:
                        if (key.equals("isUhdAvailable")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1931492381:
                        if (key.equals("isPinProtected")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1913803429:
                        if (key.equals("showTitle")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1905664732:
                        if (key.equals("episodeNumber")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1870009353:
                        if (key.equals("titleUrl")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1865391343:
                        if (key.equals("seasonNumLabel")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1779904744:
                        if (key.equals("availabilityDateMsg")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1606289880:
                        if (key.equals("endtime")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1551264767:
                        if (key.equals("storyImgUrl")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1422944994:
                        if (key.equals("actors")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1410856650:
                        if (key.equals("is5dot1Available")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1360577524:
                        if (key.equals("seasonNumber")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1354835072:
                        if (key.equals("interestingSmallUrl")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1302288478:
                        if (key.equals("isHdr10Avaiable")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1266137504:
                        if (key.equals("hasClosedCaption")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1249499312:
                        if (key.equals("genres")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1217996834:
                        if (key.equals("horzDispUrl")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1180295454:
                        if (key.equals("isNSRE")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1122171984:
                        if (key.equals("nextEpisodeTitle")) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1119989578:
                        if (key.equals("displayRuntime")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1086741391:
                        if (key.equals("longSeqLabel")) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1077707340:
                        if (key.equals("isAutoPlayEnabled")) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case -965087962:
                        if (key.equals("abbrSeqLabel")) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case -962584985:
                        if (key.equals("directors")) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case -903145224:
                        if (key.equals("showId")) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case -885502996:
                        if (key.equals("seasonCount")) {
                            c = 26;
                            break;
                        }
                        c = 65535;
                        break;
                    case -870929193:
                        if (key.equals("contentChangeDate")) {
                            c = 27;
                            break;
                        }
                        c = 65535;
                        break;
                    case -869982923:
                        if (key.equals("seasonTitle")) {
                            c = 28;
                            break;
                        }
                        c = 65535;
                        break;
                    case -802117293:
                        if (key.equals("supportsPrePlay")) {
                            c = 29;
                            break;
                        }
                        c = 65535;
                        break;
                    case -767930780:
                        if (key.equals("interactiveSummary")) {
                            c = 30;
                            break;
                        }
                        c = 65535;
                        break;
                    case -644524870:
                        if (key.equals("certification")) {
                            c = 31;
                            break;
                        }
                        c = 65535;
                        break;
                    case -602057255:
                        if (key.equals("logicalStart")) {
                            c = ' ';
                            break;
                        }
                        c = 65535;
                        break;
                    case -515828317:
                        if (key.equals("isHdAvailable")) {
                            c = '!';
                            break;
                        }
                        c = 65535;
                        break;
                    case -444292133:
                        if (key.equals("storyImgAvailable")) {
                            c = JsonFactory.DEFAULT_QUOTE_CHAR;
                            break;
                        }
                        c = 65535;
                        break;
                    case -406164797:
                        if (key.equals("nextEpisodeId")) {
                            c = '#';
                            break;
                        }
                        c = 65535;
                        break;
                    case -389852269:
                        if (key.equals("isDolbyVisionAvailable")) {
                            c = '$';
                            break;
                        }
                        c = 65535;
                        break;
                    case -320459827:
                        if (key.equals("creditMarks")) {
                            c = '%';
                            break;
                        }
                        c = 65535;
                        break;
                    case -263240971:
                        if (key.equals("predictedRating")) {
                            c = '&';
                            break;
                        }
                        c = 65535;
                        break;
                    case -191040725:
                        if (key.equals("creatorHome")) {
                            c = '\'';
                            break;
                        }
                        c = 65535;
                        break;
                    case -144454054:
                        if (key.equals("hasTrailers")) {
                            c = '(';
                            break;
                        }
                        c = 65535;
                        break;
                    case -23645737:
                        if (key.equals("interestingUrl")) {
                            c = ')';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3355:
                        if (key.equals(SignupConstants.Field.LANG_ID)) {
                            c = '*';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3575610:
                        if (key.equals("type")) {
                            c = '+';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3704893:
                        if (key.equals(SignupConstants.Field.DEMO_COLLECT_BIRTH_YEAR)) {
                            c = ',';
                            break;
                        }
                        c = 65535;
                        break;
                    case 38526579:
                        if (key.equals("maturityLevel")) {
                            c = '-';
                            break;
                        }
                        c = 65535;
                        break;
                    case 110371416:
                        if (key.equals(SignupConstants.Field.VIDEO_TITLE)) {
                            c = '.';
                            break;
                        }
                        c = 65535;
                        break;
                    case 113933357:
                        if (key.equals("isSupplementalVideo")) {
                            c = '/';
                            break;
                        }
                        c = 65535;
                        break;
                    case 235142126:
                        if (key.equals("episodeNumberHidden")) {
                            c = '0';
                            break;
                        }
                        c = 65535;
                        break;
                    case 338454173:
                        if (key.equals("supplementalMessageType")) {
                            c = '1';
                            break;
                        }
                        c = 65535;
                        break;
                    case 398159229:
                        if (key.equals("mdxVertUrl")) {
                            c = '2';
                            break;
                        }
                        c = 65535;
                        break;
                    case 417758403:
                        if (key.equals("supplementalMessage")) {
                            c = '3';
                            break;
                        }
                        c = 65535;
                        break;
                    case 470587307:
                        if (key.equals("supportsInteractiveExperiences")) {
                            c = '4';
                            break;
                        }
                        c = 65535;
                        break;
                    case 585773339:
                        if (key.equals("isOriginal")) {
                            c = '5';
                            break;
                        }
                        c = 65535;
                        break;
                    case 651215103:
                        if (key.equals("quality")) {
                            c = '6';
                            break;
                        }
                        c = 65535;
                        break;
                    case 834414096:
                        if (key.equals("isPreviewProtected")) {
                            c = '7';
                            break;
                        }
                        c = 65535;
                        break;
                    case 889931614:
                        if (key.equals("seasonId")) {
                            c = '8';
                            break;
                        }
                        c = 65535;
                        break;
                    case 960343169:
                        if (key.equals("hasAssistiveAudio")) {
                            c = '9';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1072416332:
                        if (key.equals("titleLogoUrl")) {
                            c = ':';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1097494779:
                        if (key.equals("restUrl")) {
                            c = ';';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1135089838:
                        if (key.equals("autoPlayMaxCount")) {
                            c = '<';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1153650071:
                        if (key.equals("boxartUrl")) {
                            c = '=';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1182605037:
                        if (key.equals("verticalInterestingUrl")) {
                            c = '>';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1314358034:
                        if (key.equals("squareUrl")) {
                            c = '?';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1349977571:
                        if (key.equals("newBadge")) {
                            c = '@';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1426350736:
                        if (key.equals("isNextPlayableEpisode")) {
                            c = 'A';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1479723235:
                        if (key.equals("contentWarning")) {
                            c = 'B';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1494791097:
                        if (key.equals("isAgeProtected")) {
                            c = 'C';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1550962648:
                        if (key.equals("runtime")) {
                            c = 'D';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1590765524:
                        if (key.equals("episodeCount")) {
                            c = 'E';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1693143725:
                        if (key.equals("isSpatialAudioAvailable")) {
                            c = 'F';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1828656532:
                        if (key.equals("synopsis")) {
                            c = 'G';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1940116489:
                        if (key.equals("isNonSerializedTv")) {
                            c = 'H';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2027019019:
                        if (key.equals("episodeBadges")) {
                            c = 'I';
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
                        this.isEpisode = value.getAsBoolean();
                        break;
                    case 1:
                        this.isUhdAvailable = value.getAsBoolean();
                        break;
                    case 2:
                        this.isPinProtected = value.getAsBoolean();
                        break;
                    case 3:
                        this.showTitle = value.getAsString();
                        break;
                    case 4:
                        this.episodeNumber = value.getAsInt();
                        break;
                    case 5:
                        this.titleUrl = value.getAsString();
                        break;
                    case 6:
                        this.seasonNumLabel = C8123deT.b(value);
                        break;
                    case 7:
                        this.availabilityDateMsg = C8123deT.b(value);
                        break;
                    case '\b':
                        this.endtime = value.getAsInt();
                        break;
                    case '\t':
                        this.storyImgUrl = value.getAsString();
                        break;
                    case '\n':
                        this.actors = value.getAsString();
                        break;
                    case 11:
                        this.is5dot1Available = value.getAsBoolean();
                        break;
                    case '\f':
                        this.seasonNumber = value.getAsInt();
                        break;
                    case '\r':
                        if (value != null && !value.isJsonNull()) {
                            this.interestingSmallUrl = value.getAsString();
                            break;
                        }
                        break;
                    case 14:
                        this.isHdr10Avaiable = value.getAsBoolean();
                        break;
                    case 15:
                        this.hasClosedCaption = value.getAsBoolean();
                        break;
                    case 16:
                        this.genres = value.getAsString();
                        break;
                    case 17:
                        if (value != null && !value.isJsonNull()) {
                            this.horzDispUrl = C8123deT.b(value);
                            break;
                        }
                        break;
                    case 18:
                        this.isNSRE = value.getAsBoolean();
                        break;
                    case 19:
                        this.nextEpisodeTitle = value.getAsString();
                        break;
                    case 20:
                        this.displayRuntime = value.getAsInt();
                        break;
                    case 21:
                        this.longSeqLabel = C8123deT.b(value);
                        break;
                    case 22:
                        this.isAutoPlayEnabled = value.getAsBoolean();
                        break;
                    case 23:
                        this.abbrSeqLabel = C8123deT.b(value);
                        break;
                    case 24:
                        this.directors = value.getAsString();
                        break;
                    case 25:
                        this.showId = value.getAsString();
                        break;
                    case 26:
                        this.seasonCount = value.getAsInt();
                        break;
                    case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                        if (value != null && !value.isJsonNull()) {
                            this.contentChangeDate = value.getAsLong();
                            break;
                        }
                        break;
                    case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                        this.seasonTitle = value.getAsString();
                        break;
                    case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                        if (value != null && !value.isJsonNull() && value.getAsBoolean()) {
                            z = true;
                        }
                        this.supportsPrePlay = z;
                        break;
                    case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                        if (value != null && !value.isJsonNull()) {
                            this.interactiveSummary = (InteractiveSummary) ((Gson) C1332Xp.b(Gson.class)).fromJson((JsonElement) value.getAsJsonObject(), (Class<Object>) InteractiveSummary.class);
                            break;
                        }
                        break;
                    case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                        this.certification = value.getAsString();
                        break;
                    case ' ':
                        this.logicalStart = value.getAsInt();
                        break;
                    case '!':
                        this.isHdAvailable = value.getAsBoolean();
                        break;
                    case '\"':
                        this.storyImgAvailable = value.getAsBoolean();
                        break;
                    case '#':
                        this.nextEpisodeId = value.getAsString();
                        break;
                    case '$':
                        this.isDolbyVisionAvailable = value.getAsBoolean();
                        break;
                    case '%':
                        this.creditMarks = (CreditMarks) gson.fromJson((JsonElement) value.getAsJsonObject(), (Class<Object>) CreditMarks.class);
                        break;
                    case '&':
                        this.predictedRating = value.getAsFloat();
                        break;
                    case '\'':
                        this.creatorHome = value.getAsString();
                        break;
                    case JSONzip.substringLimit /* 40 */:
                        this.hasTrailers = value.getAsBoolean();
                        break;
                    case ')':
                        if (value != null && !value.isJsonNull()) {
                            this.interestingUrl = value.getAsString();
                            break;
                        }
                        break;
                    case '*':
                        this.id = value.getAsString();
                        break;
                    case '+':
                        this.type = value.getAsString();
                        break;
                    case ',':
                        this.year = value.getAsInt();
                        break;
                    case '-':
                        this.maturityLevel = value.getAsInt();
                        break;
                    case '.':
                        this.title = value.getAsString();
                        break;
                    case '/':
                        this.isSupplementalVideo = value.getAsBoolean();
                        break;
                    case '0':
                        this.episodeNumberHidden = value.getAsBoolean();
                        break;
                    case '1':
                        this.supplementalMessageType = SupplementalMessageType.c.b(value.getAsString());
                        break;
                    case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                        this.mdxVertUrl = value.getAsString();
                        break;
                    case '3':
                        this.supplementalMessage = C8123deT.b(value);
                        break;
                    case '4':
                        if (value != null && !value.isJsonNull() && value.getAsBoolean()) {
                            z2 = true;
                        }
                        this.supportsInteractiveExperiences = z2;
                        break;
                    case '5':
                        this.isOriginal = value.getAsBoolean();
                        break;
                    case '6':
                        this.quality = value.getAsString();
                        break;
                    case '7':
                        this.isPreviewProtected = value.getAsBoolean();
                        break;
                    case '8':
                        this.seasonId = value.getAsString();
                        break;
                    case '9':
                        this.hasAssistiveAudio = value.getAsBoolean();
                        break;
                    case ':':
                        this.titleLogoUrl = value.getAsString();
                        break;
                    case ';':
                        this.restUrl = value.getAsString();
                        break;
                    case '<':
                        this.autoPlayMaxCount = value.getAsInt();
                        break;
                    case '=':
                        this.boxartUrl = value.getAsString();
                        break;
                    case '>':
                        if (value != null && !value.isJsonNull()) {
                            this.verticalInterestingUrl = value.getAsString();
                            break;
                        }
                        break;
                    case '?':
                        this.squareUrl = value.getAsString();
                        break;
                    case '@':
                        if (value != null && !value.isJsonNull()) {
                            this.newBadge = value.getAsString();
                            break;
                        }
                        break;
                    case 'A':
                        this.isNextPlayableEpisode = value.getAsBoolean();
                        break;
                    case 'B':
                        if (value != null && !value.isJsonNull()) {
                            this.contentWarning = (ContentWarning) gson.fromJson((JsonElement) value.getAsJsonObject(), (Class<Object>) ContentWarning.class);
                            break;
                        }
                        break;
                    case 'C':
                        this.isAgeProtected = value.getAsBoolean();
                        break;
                    case 'D':
                        this.runtime = value.getAsInt();
                        break;
                    case 'E':
                        this.episodeCount = value.getAsInt();
                        break;
                    case 'F':
                        this.isSpatialAudioAvailable = value.getAsBoolean();
                        break;
                    case 'G':
                        this.synopsis = value.getAsString();
                        break;
                    case 'H':
                        this.isNonSerializedTv = value.getAsBoolean();
                        break;
                    case 'I':
                        JsonArray asJsonArray = value.getAsJsonArray();
                        for (int i = 0; i < asJsonArray.size(); i++) {
                            this.episodeBadges.add(asJsonArray.get(i).getAsString());
                        }
                        break;
                }
            }
        }

        public String toString() {
            return "Detail{year=" + this.year + ", synopsis='" + this.synopsis + "', quality='" + this.quality + "', directors='" + this.directors + "', actors='" + this.actors + "', genres='" + this.genres + "', certification='" + this.certification + "', horzDispUrl='" + this.horzDispUrl + "', restUrl='" + this.restUrl + "', mdxVertUrl='" + this.mdxVertUrl + "', storyImgUrl='" + this.storyImgUrl + "', titleUrl='" + this.titleUrl + "', squareUrl='" + this.squareUrl + "', titleLogoUrl='" + this.titleLogoUrl + "', seasonNumLabel='" + this.seasonNumLabel + "', episodeCount=" + this.episodeCount + ", seasonCount=" + this.seasonCount + ", predictedRating=" + this.predictedRating + ", maturityLevel=" + this.maturityLevel + ", contentChangeDate=" + this.contentChangeDate + ", supplementalMessage='" + this.supplementalMessage + "', isEpisode=" + this.isEpisode + ", isOriginal=" + this.isOriginal + ", isAvailableForDownload=" + this.isDownloadAvailable + ", hasTrailers=" + this.hasTrailers + ", isSupplementalVideo=" + this.isSupplementalVideo + ", isNSRE=" + this.isNSRE + ", newBadge=" + this.newBadge + ", episodeNumberHidden=" + this.episodeNumberHidden + ", isHdAvailable=" + this.isHdAvailable + ", isNonSerializedTv=" + this.isNonSerializedTv + ", isUhdAvailable=" + this.isUhdAvailable + ", isDolbyVisionAvailable=" + this.isDolbyVisionAvailable + ", isHdr10Avaiable=" + this.isHdr10Avaiable + ", hasAssistiveAudio=" + this.hasAssistiveAudio + ", hasClosedCaption=" + this.hasClosedCaption + ", is5dot1Available=" + this.is5dot1Available + ", isSpatialAudioAvailable=" + this.isSpatialAudioAvailable + ", isAutoPlayEnabled=" + this.isAutoPlayEnabled + ", isNextPlayableEpisode=" + this.isNextPlayableEpisode + ", isAgeProtected=" + this.isAgeProtected + ", isPinProtected=" + this.isPinProtected + ", isPreviewProtected=" + this.isPreviewProtected + ", autoPlayMaxCount=" + this.autoPlayMaxCount + ", episodeBadges=" + this.episodeBadges + ", displayRuntime=" + this.displayRuntime + ", runtime=" + this.runtime + ", endtime=" + this.endtime + ", logicalStart=" + this.logicalStart + ", supportsPrePlay=" + this.supportsPrePlay + ", interactiveSummary=" + this.interactiveSummary + ", creatorHome=" + this.creatorHome + ", supplementalMessageType=" + this.supplementalMessageType.toString() + '}';
        }
    }

    /* loaded from: classes5.dex */
    public static final class SearchTitle extends AbstractC0941Im implements InterfaceC0952Ix {
        private static final String TAG = "SearchTitle";
        public String certification;
        public String entityId;
        public String horzDispUrl;
        public boolean isAvailableToPlay = true;
        public boolean isOriginal;
        public int releaseYear;
        public String title;

        public String toString() {
            return this.title;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // o.InterfaceC0952Ix
        public void populate(JsonElement jsonElement) {
            char c;
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            this.isAvailableToPlay = true;
            for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                JsonElement value = entry.getValue();
                String key = entry.getKey();
                key.hashCode();
                switch (key.hashCode()) {
                    case -2102099874:
                        if (key.equals("entityId")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1217996834:
                        if (key.equals("horzDispUrl")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -644524870:
                        if (key.equals("certification")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 32546672:
                        if (key.equals("canStream")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 110371416:
                        if (key.equals(SignupConstants.Field.VIDEO_TITLE)) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 213502180:
                        if (key.equals("releaseYear")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 585773339:
                        if (key.equals("isOriginal")) {
                            c = 6;
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
                        this.entityId = value.getAsString();
                        break;
                    case 1:
                        this.horzDispUrl = value.getAsString();
                        break;
                    case 2:
                        this.certification = value.getAsString();
                        break;
                    case 3:
                        this.isAvailableToPlay = value.getAsBoolean();
                        break;
                    case 4:
                        this.title = value.getAsString();
                        break;
                    case 5:
                        this.releaseYear = value.getAsInt();
                        break;
                    case 6:
                        this.isOriginal = value.getAsBoolean();
                        break;
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class SupplementalVideos extends AbstractC0941Im implements InterfaceC0952Ix {
        private static final String TAG = "SupplementalVideos";
        public String defaultTrailer;

        @Override // o.InterfaceC0952Ix
        public void populate(JsonElement jsonElement) {
            JsonElement jsonElement2;
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            if (asJsonObject == null || (jsonElement2 = asJsonObject.get(SignupConstants.Field.LANG_ID)) == null) {
                return;
            }
            this.defaultTrailer = jsonElement2.getAsString();
        }

        public String toString() {
            return "SupplementalVideos [defaultTrailer=" + this.defaultTrailer + "]";
        }
    }

    /* loaded from: classes5.dex */
    public static class TrickplayBifUrl extends VideoArtwork {
        public TrickplayBifUrl() {
            super("bifUrl");
        }
    }

    /* loaded from: classes5.dex */
    public static class VideoArtwork extends AbstractC0941Im implements InterfaceC0952Ix {
        private String artworkKey;
        public String url;

        public String getUrl() {
            return this.url;
        }

        public VideoArtwork(String str) {
            this.artworkKey = str;
        }

        public void populate(JsonElement jsonElement) {
            JsonElement jsonElement2;
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            if (asJsonObject == null || (jsonElement2 = asJsonObject.get(this.artworkKey)) == null) {
                return;
            }
            this.url = jsonElement2.getAsString();
        }

        public String toString() {
            return this.artworkKey + " [url= " + this.url + "]";
        }
    }

    /* loaded from: classes5.dex */
    public static class Tags extends AbstractC0941Im implements InterfaceC0952Ix {
        private static final String TAGS_LIST = "values";
        private final String TAG = "Tags";
        private List<TagSummary> values = new ArrayList();

        public List<TagSummary> getTags() {
            return this.values;
        }

        @Override // o.InterfaceC0952Ix
        public void populate(JsonElement jsonElement) {
            try {
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                if (!asJsonObject.has(TAGS_LIST) || asJsonObject.get(TAGS_LIST).isJsonNull()) {
                    return;
                }
                this.values = TagsListItemImpl.getListOfTags(asJsonObject.get(TAGS_LIST).getAsJsonArray());
            } catch (IllegalStateException e) {
                InterfaceC1598aHf.a(new C1596aHd("Tags response is malformed. Error Parsing it.").b(ErrorType.m).d(e));
            }
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes5.dex */
    public static class MoodTags extends AbstractC0941Im implements InterfaceC0952Ix {
        private final String TAG = "MoodTags";
        private List<GenreItem> values = new ArrayList();

        public List<GenreItem> getTags() {
            return this.values;
        }

        @Override // o.InterfaceC0952Ix
        public void populate(JsonElement jsonElement) {
            if (jsonElement.isJsonArray()) {
                try {
                    JsonArray asJsonArray = jsonElement.getAsJsonArray();
                    for (int i = 0; i < asJsonArray.size(); i++) {
                        GenreItemImpl genreItemImpl = new GenreItemImpl();
                        genreItemImpl.populate(asJsonArray.get(i).getAsJsonObject());
                        this.values.add(genreItemImpl);
                    }
                } catch (IllegalStateException e) {
                    InterfaceC1598aHf.a(new C1596aHd("Tags response is malformed. Error Parsing it.").b(ErrorType.m).d(e));
                }
            }
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes5.dex */
    public static class Genres extends AbstractC0941Im implements InterfaceC0952Ix {
        private List<GenreItem> values = new ArrayList();

        public List<GenreItem> getGenres() {
            return this.values;
        }

        @Override // o.InterfaceC0952Ix
        public void populate(JsonElement jsonElement) {
            try {
                JsonArray asJsonArray = jsonElement.getAsJsonArray();
                for (int i = 0; i < asJsonArray.size(); i++) {
                    GenreItemImpl genreItemImpl = new GenreItemImpl();
                    genreItemImpl.populate(asJsonArray.get(i).getAsJsonObject());
                    this.values.add(genreItemImpl);
                }
            } catch (IllegalStateException e) {
                InterfaceC1598aHf.a(new C1596aHd("Genres response is malformed. Error Parsing it.").b(ErrorType.m).d(e));
            }
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes5.dex */
    public static class RemoveFromCw extends AbstractC0941Im implements InterfaceC0952Ix {
        private boolean success;

        public boolean isSuccess() {
            return this.success;
        }

        @Override // o.InterfaceC0952Ix
        public void populate(JsonElement jsonElement) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            if (asJsonObject != null) {
                for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                    JsonElement value = entry.getValue();
                    String key = entry.getKey();
                    key.hashCode();
                    if (key.equals("success")) {
                        this.success = value.getAsBoolean();
                    }
                }
            }
        }

        public String toString() {
            return "RemoveFromCw [success= " + this.success + "]";
        }
    }

    /* loaded from: classes5.dex */
    public static final class IsRestricted extends AbstractC0941Im implements InterfaceC0952Ix {
        private static final String TAG = "IsRestricted";
        public boolean isRestricted;

        @Override // o.InterfaceC0952Ix
        public void populate(JsonElement jsonElement) {
            if (jsonElement == null || !jsonElement.isJsonPrimitive()) {
                InterfaceC1598aHf.a(new C1596aHd("Failed to parse element for IsRestricted: " + jsonElement).b(ErrorType.m).b(false));
                this.isRestricted = false;
                return;
            }
            this.isRestricted = jsonElement.getAsBoolean();
        }

        public String toString() {
            return "IsRestricted [isRestricted=" + this.isRestricted + "]";
        }
    }

    /* loaded from: classes5.dex */
    public static final class People extends AbstractC0941Im implements InterfaceC0952Ix {
        private static final String TAG = "People";
        private List<PersonSummary> actors;
        private List<PersonSummary> creators;
        private List<PersonSummary> directors;
        private List<PersonSummary> writers;

        public List<PersonSummary> getActors() {
            return this.actors;
        }

        public List<PersonSummary> getCreators() {
            return this.creators;
        }

        public List<PersonSummary> getDirectors() {
            return this.directors;
        }

        public List<PersonSummary> getWriters() {
            return this.writers;
        }

        @Override // o.InterfaceC0952Ix
        public void populate(JsonElement jsonElement) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            this.actors = createList(asJsonObject.getAsJsonArray("actors"));
            this.creators = createList(asJsonObject.getAsJsonArray("creators"));
            this.directors = createList(asJsonObject.getAsJsonArray("directors"));
            this.writers = createList(asJsonObject.getAsJsonArray("writers"));
        }

        private ArrayList<PersonSummary> createList(JsonArray jsonArray) {
            if (jsonArray == null || jsonArray.size() <= 0) {
                return null;
            }
            ArrayList<PersonSummary> arrayList = new ArrayList<>();
            for (int i = 0; i < jsonArray.size(); i++) {
                PersonSummaryImpl personSummaryImpl = new PersonSummaryImpl();
                personSummaryImpl.populate(jsonArray.get(i).getAsJsonObject());
                arrayList.add(personSummaryImpl);
            }
            return arrayList;
        }

        public String toString() {
            return "People [actors=" + this.actors + ", creators=" + this.creators + ", directors=" + this.directors + "]";
        }
    }
}
