package com.netflix.model.leafs;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.netflix.mediaclient.servicemgr.interface_.GameDetails;
import com.netflix.model.leafs.GameInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.AbstractC0941Im;
import o.C1045Mp;
import o.C8572dqo;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
public final class Game {

    /* loaded from: classes5.dex */
    public static final class Summary extends SummaryImpl implements GameInfo.GameSummary {
        public static final Companion Companion = new Companion(null);
        private String certification;
        private String genre;
        private String heroImageUrl;
        private String packageName;
        private Integer sizeInMbs;
        private String titleTreatmentImageUrl;
        private String unifiedEntityId;

        @Override // com.netflix.model.leafs.GameInfo.GameSummary
        public String getCertification() {
            return this.certification;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameSummary
        public String getGenre() {
            return this.genre;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameSummary
        public String getHeroImageUrl() {
            return this.heroImageUrl;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameSummary
        public String getPackageName() {
            return this.packageName;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameSummary
        public Integer getSizeInMbs() {
            return this.sizeInMbs;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameSummary
        public String getTitleTreatmentImageUrl() {
            return this.titleTreatmentImageUrl;
        }

        @Override // com.netflix.model.leafs.SummaryImpl, o.InterfaceC5175btm
        public String getUnifiedEntityId() {
            return this.unifiedEntityId;
        }

        @Override // com.netflix.model.leafs.SummaryImpl, o.InterfaceC5223buh
        public String getVideoMerchComputeId() {
            return null;
        }

        @Override // com.netflix.model.leafs.SummaryImpl, o.InterfaceC5151btO
        public boolean isAvailableToPlay() {
            return this.isAvailableToPlay;
        }

        /* loaded from: classes5.dex */
        public static final class Companion extends C1045Mp {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
                super("Game.Summary");
            }
        }

        @Override // com.netflix.model.leafs.SummaryImpl, o.InterfaceC0952Ix
        public void populate(JsonElement jsonElement) {
            C8632dsu.c((Object) jsonElement, "");
            super.populate(jsonElement);
            for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                C8632dsu.d(entry);
                String key = entry.getKey();
                JsonElement value = entry.getValue();
                if (key != null) {
                    switch (key.hashCode()) {
                        case -644524870:
                            if (key.equals("certification")) {
                                this.certification = value.getAsString();
                                break;
                            } else {
                                continue;
                            }
                        case -416615408:
                            if (key.equals("unifiedEntityId")) {
                                this.unifiedEntityId = value.getAsString();
                                break;
                            } else {
                                continue;
                            }
                        case 98240899:
                            if (key.equals("genre")) {
                                this.genre = value.getAsString();
                                break;
                            } else {
                                continue;
                            }
                        case 105854747:
                            if (key.equals("pName")) {
                                this.packageName = value.getAsString();
                                break;
                            } else {
                                continue;
                            }
                        case 476240536:
                            if (key.equals("sizeInMbs")) {
                                this.sizeInMbs = Integer.valueOf(value.getAsInt());
                                break;
                            } else {
                                continue;
                            }
                        case 1758551860:
                            if (key.equals("titleTreatmentImageUrl")) {
                                this.titleTreatmentImageUrl = value.getAsString();
                                break;
                            } else {
                                continue;
                            }
                        case 1907446598:
                            if (key.equals("heroImgUrl")) {
                                this.heroImageUrl = value.getAsString();
                                break;
                            } else {
                                continue;
                            }
                    }
                }
            }
        }

        @Override // com.netflix.model.leafs.SummaryImpl
        public String toString() {
            String str = this.id;
            String str2 = this.unifiedEntityId;
            String str3 = this.title;
            String str4 = this.genre;
            Integer num = this.sizeInMbs;
            String str5 = this.heroImageUrl;
            String str6 = this.titleTreatmentImageUrl;
            String str7 = this.certification;
            String str8 = this.packageName;
            return "Shark Summary{id=" + str + "unifiedEntityId=" + str2 + "title=" + str3 + "genre=" + str4 + "sizeInMbs=" + num + "heroImgUrl=" + str5 + "titleTreatmentImageUrl=" + str6 + "certification= " + str7 + "pName=" + str8 + "}";
        }
    }

    /* loaded from: classes5.dex */
    public static final class Detail extends AbstractC0941Im implements InterfaceC0952Ix, GameInfo.GameDetail {
        public static final Companion Companion = new Companion(null);
        private String appStoreUrl;
        private String compatibility;
        private String connectivityRequirements;
        private String developer;
        private List<String> languages;
        private Integer maxNumberOfPlayers;
        private Integer minAndroidSdk;
        private Integer minMemoryGb;
        private Integer minNumProcessors;
        private Integer minNumberOfPlayers;
        private List<String> modes;
        private String motionBillboardVideoId;
        private Integer numberOfPlayers;
        private GameDetails.Orientation orientation = GameDetails.Orientation.e;
        private Integer releaseYear;
        private boolean supportsC;
        private boolean supportsControllers;
        private boolean supportsOffline;
        private String synopsis;
        private String version;

        @Override // com.netflix.model.leafs.GameInfo.GameDetail
        public String getAppStoreUrl() {
            return this.appStoreUrl;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameDetail
        public String getCompatibility() {
            return this.compatibility;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameDetail
        public String getConnectivityRequirements() {
            return this.connectivityRequirements;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameDetail
        public String getDeveloper() {
            return this.developer;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameDetail
        public List<String> getLanguages() {
            return this.languages;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameDetail
        public Integer getMaxNumberOfPlayers() {
            return this.maxNumberOfPlayers;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameDetail
        public Integer getMinAndroidSdkVersion() {
            return this.minAndroidSdk;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameDetail
        public Integer getMinMemoryGb() {
            return this.minMemoryGb;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameDetail
        public Integer getMinNumProcessors() {
            return this.minNumProcessors;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameDetail
        public Integer getMinNumberOfPlayers() {
            return this.minNumberOfPlayers;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameDetail
        public List<String> getModes() {
            return this.modes;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameDetail
        public String getMotionBillboardVideoId() {
            return this.motionBillboardVideoId;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameDetail
        public Integer getNumberOfPlayers() {
            return this.numberOfPlayers;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameDetail
        public GameDetails.Orientation getOrientation() {
            return this.orientation;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameDetail
        public Integer getReleaseYear() {
            return this.releaseYear;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameDetail
        public String getSynopsis() {
            return this.synopsis;
        }

        @Override // com.netflix.model.leafs.GameInfo.GameDetail
        public String getVersion() {
            return this.version;
        }

        /* loaded from: classes5.dex */
        public static final class Companion extends C1045Mp {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
                super("Game.Detail");
            }
        }

        @Override // o.InterfaceC0952Ix
        public void populate(JsonElement jsonElement) {
            int d;
            int d2;
            C8632dsu.c((Object) jsonElement, "");
            for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                C8632dsu.d(entry);
                String key = entry.getKey();
                JsonElement value = entry.getValue();
                if (key != null) {
                    switch (key.hashCode()) {
                        case -2001081632:
                            if (key.equals("numOfPs")) {
                                this.numberOfPlayers = Integer.valueOf(value.getAsInt());
                                break;
                            } else {
                                continue;
                            }
                        case -1439500848:
                            if (key.equals("orientation")) {
                                this.orientation = parseOrientation(value.getAsString());
                                break;
                            } else {
                                continue;
                            }
                        case -908490995:
                            if (key.equals("supportedLanguages")) {
                                JsonArray<JsonElement> asJsonArray = value.getAsJsonArray();
                                C8632dsu.a(asJsonArray, "");
                                d = C8572dqo.d(asJsonArray, 10);
                                ArrayList arrayList = new ArrayList(d);
                                for (JsonElement jsonElement2 : asJsonArray) {
                                    arrayList.add(jsonElement2.getAsString());
                                }
                                this.languages = arrayList;
                                break;
                            } else {
                                continue;
                            }
                        case -827144996:
                            if (key.equals("maxNumOfPs")) {
                                this.maxNumberOfPlayers = Integer.valueOf(value.getAsInt());
                                break;
                            } else {
                                continue;
                            }
                        case -613879276:
                            if (key.equals("supportsCs")) {
                                this.supportsControllers = value.getAsBoolean();
                                break;
                            } else {
                                continue;
                            }
                        case -379828990:
                            if (key.equals("supportsOfflineMode")) {
                                this.supportsOffline = value.getAsBoolean();
                                break;
                            } else {
                                continue;
                            }
                        case -19802561:
                            if (key.equals("supportsC")) {
                                this.supportsC = value.getAsBoolean();
                                break;
                            } else {
                                continue;
                            }
                        case 100:
                            if (key.equals("d")) {
                                this.developer = value.getAsString();
                                break;
                            } else {
                                continue;
                            }
                        case 3351599:
                            if (key.equals("minA")) {
                                this.minAndroidSdk = Integer.valueOf(value.getAsInt());
                                break;
                            } else {
                                continue;
                            }
                        case 104069936:
                            if (key.equals("modes")) {
                                JsonArray<JsonElement> asJsonArray2 = value.getAsJsonArray();
                                C8632dsu.a(asJsonArray2, "");
                                d2 = C8572dqo.d(asJsonArray2, 10);
                                ArrayList arrayList2 = new ArrayList(d2);
                                for (JsonElement jsonElement3 : asJsonArray2) {
                                    arrayList2.add(jsonElement3.getAsString());
                                }
                                this.modes = arrayList2;
                                break;
                            } else {
                                continue;
                            }
                        case 114118285:
                            if (key.equals("motionBillboardVideoId")) {
                                this.motionBillboardVideoId = value.getAsString();
                                break;
                            } else {
                                continue;
                            }
                        case 213502180:
                            if (key.equals("releaseYear")) {
                                this.releaseYear = Integer.valueOf(value.getAsInt());
                                break;
                            } else {
                                continue;
                            }
                        case 351608024:
                            if (key.equals("version")) {
                                this.version = value.getAsString();
                                break;
                            } else {
                                continue;
                            }
                        case 417299733:
                            if (key.equals("minNumProcessors")) {
                                this.minNumProcessors = Integer.valueOf(value.getAsInt());
                                break;
                            } else {
                                continue;
                            }
                        case 717824558:
                            if (key.equals("minMemoryGb")) {
                                this.minMemoryGb = Integer.valueOf(value.getAsInt());
                                break;
                            } else {
                                continue;
                            }
                        case 1644854318:
                            if (key.equals("minNumOfPs")) {
                                this.minNumberOfPlayers = Integer.valueOf(value.getAsInt());
                                break;
                            } else {
                                continue;
                            }
                        case 1698067505:
                            if (key.equals("androidPlayStoreUrl")) {
                                this.appStoreUrl = value.getAsString();
                                break;
                            } else {
                                continue;
                            }
                        case 1828656532:
                            if (key.equals("synopsis")) {
                                this.synopsis = value.getAsString();
                                break;
                            } else {
                                continue;
                            }
                        case 2009974128:
                            if (key.equals("compatibility")) {
                                this.compatibility = value.getAsString();
                                break;
                            } else {
                                continue;
                            }
                        case 2092273639:
                            if (key.equals("connectivityRequirements")) {
                                this.connectivityRequirements = value.getAsString();
                                break;
                            } else {
                                continue;
                            }
                    }
                }
            }
        }

        private final GameDetails.Orientation parseOrientation(String str) {
            GameDetails.Orientation orientation;
            if (str == null) {
                return GameDetails.Orientation.e;
            }
            GameDetails.Orientation[] values = GameDetails.Orientation.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    orientation = null;
                    break;
                }
                orientation = values[i];
                if (C8632dsu.c((Object) orientation.a(), (Object) str)) {
                    break;
                }
                i++;
            }
            return orientation == null ? GameDetails.Orientation.e : orientation;
        }

        public String toString() {
            String str = this.synopsis;
            String str2 = this.developer;
            Integer num = this.numberOfPlayers;
            boolean z = this.supportsC;
            boolean z2 = this.supportsOffline;
            boolean z3 = this.supportsControllers;
            String str3 = this.compatibility;
            Integer num2 = this.minAndroidSdk;
            Integer num3 = this.minNumberOfPlayers;
            Integer num4 = this.maxNumberOfPlayers;
            String str4 = this.version;
            Integer num5 = this.releaseYear;
            List<String> list = this.modes;
            List<String> list2 = this.languages;
            GameDetails.Orientation orientation = this.orientation;
            String str5 = this.motionBillboardVideoId;
            return "Shark Detail{synopsis=" + str + "d=" + str2 + "numberOfPs=" + num + "supportsC=" + z + "supportsOffline=" + z2 + "supportsCs=" + z3 + "compatibility=" + str3 + "minA=" + num2 + "minNumberOfPs=" + num3 + "maxNumberOfPs=" + num4 + "version=" + str4 + "releaseYear=" + num5 + "modes=" + list + "supportedLanguages=" + list2 + "orientation=" + orientation + "motionBillboardVideoId" + str5 + "}";
        }

        @Override // com.netflix.model.leafs.GameInfo.GameDetail
        public Boolean getSupportsInGameChat() {
            return Boolean.valueOf(this.supportsC);
        }

        @Override // com.netflix.model.leafs.GameInfo.GameDetail
        public Boolean getSupportsOfflineMode() {
            return Boolean.valueOf(this.supportsOffline);
        }

        @Override // com.netflix.model.leafs.GameInfo.GameDetail
        public Boolean getSupportsControllers() {
            return Boolean.valueOf(this.supportsControllers);
        }
    }
}
