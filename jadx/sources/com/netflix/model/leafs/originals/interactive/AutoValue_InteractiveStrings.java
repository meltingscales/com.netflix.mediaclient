package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_InteractiveStrings extends C$AutoValue_InteractiveStrings {
    public static final Parcelable.Creator<AutoValue_InteractiveStrings> CREATOR = new Parcelable.Creator<AutoValue_InteractiveStrings>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_InteractiveStrings.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_InteractiveStrings createFromParcel(Parcel parcel) {
            return new AutoValue_InteractiveStrings(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readHashMap(InteractiveStrings.class.getClassLoader()), parcel.readHashMap(InteractiveStrings.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_InteractiveStrings[] newArray(int i) {
            return new AutoValue_InteractiveStrings[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_InteractiveStrings(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final String str13, final String str14, final String str15, final String str16, final String str17, final String str18, final String str19, final Map<String, String> map, final Map<String, String> map2) {
        new C$$AutoValue_InteractiveStrings(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, map, map2) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_InteractiveStrings

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_InteractiveStrings$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<InteractiveStrings> {
                private final TypeAdapter<String> categoryAccessibilityDescriptionAdapter;
                private final TypeAdapter<String> categoryAdapter;
                private final TypeAdapter<String> currentScoreAdapter;
                private final TypeAdapter<String> earnedAdapter;
                private final TypeAdapter<String> headerAdapter;
                private final TypeAdapter<Map<String, String>> mappingsAdapter;
                private final TypeAdapter<String> maxScoreAdapter;
                private final TypeAdapter<String> nextPlayerHeaderAdapter;
                private final TypeAdapter<String> nextPlayerSubHeaderAdapter;
                private final TypeAdapter<String> p1ScoreAdapter;
                private final TypeAdapter<String> pointsToUnlockAdapter;
                private final TypeAdapter<Map<String, String>> preconditionTokensAdapter;
                private final TypeAdapter<String> questionAdapter;
                private final TypeAdapter<String> scoreAccessibilityDescriptionAdapter;
                private final TypeAdapter<String> scoreAdapter;
                private final TypeAdapter<String> shareAdapter;
                private final TypeAdapter<String> subHeaderAdapter;
                private final TypeAdapter<String> targetScoreAdapter;
                private final TypeAdapter<String> themeAdapter;
                private final TypeAdapter<String> unlockAccessibilityDescriptionAdapter;
                private final TypeAdapter<String> unlockAdapter;
                private String defaultPointsToUnlock = null;
                private String defaultUnlock = null;
                private String defaultEarned = null;
                private String defaultScore = null;
                private String defaultMaxScore = null;
                private String defaultQuestion = null;
                private String defaultCategory = null;
                private String defaultScoreAccessibilityDescription = null;
                private String defaultUnlockAccessibilityDescription = null;
                private String defaultCategoryAccessibilityDescription = null;
                private String defaultTheme = null;
                private String defaultShare = null;
                private String defaultHeader = null;
                private String defaultTargetScore = null;
                private String defaultNextPlayerSubHeader = null;
                private String defaultNextPlayerHeader = null;
                private String defaultSubHeader = null;
                private String defaultCurrentScore = null;
                private String defaultP1Score = null;
                private Map<String, String> defaultPreconditionTokens = null;
                private Map<String, String> defaultMappings = null;

                public GsonTypeAdapter setDefaultCategory(String str) {
                    this.defaultCategory = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultCategoryAccessibilityDescription(String str) {
                    this.defaultCategoryAccessibilityDescription = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultCurrentScore(String str) {
                    this.defaultCurrentScore = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultEarned(String str) {
                    this.defaultEarned = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultHeader(String str) {
                    this.defaultHeader = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultMappings(Map<String, String> map) {
                    this.defaultMappings = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultMaxScore(String str) {
                    this.defaultMaxScore = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultNextPlayerHeader(String str) {
                    this.defaultNextPlayerHeader = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultNextPlayerSubHeader(String str) {
                    this.defaultNextPlayerSubHeader = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultP1Score(String str) {
                    this.defaultP1Score = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultPointsToUnlock(String str) {
                    this.defaultPointsToUnlock = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultPreconditionTokens(Map<String, String> map) {
                    this.defaultPreconditionTokens = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultQuestion(String str) {
                    this.defaultQuestion = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultScore(String str) {
                    this.defaultScore = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultScoreAccessibilityDescription(String str) {
                    this.defaultScoreAccessibilityDescription = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultShare(String str) {
                    this.defaultShare = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultSubHeader(String str) {
                    this.defaultSubHeader = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultTargetScore(String str) {
                    this.defaultTargetScore = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultTheme(String str) {
                    this.defaultTheme = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultUnlock(String str) {
                    this.defaultUnlock = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultUnlockAccessibilityDescription(String str) {
                    this.defaultUnlockAccessibilityDescription = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.pointsToUnlockAdapter = gson.getAdapter(String.class);
                    this.unlockAdapter = gson.getAdapter(String.class);
                    this.earnedAdapter = gson.getAdapter(String.class);
                    this.scoreAdapter = gson.getAdapter(String.class);
                    this.maxScoreAdapter = gson.getAdapter(String.class);
                    this.questionAdapter = gson.getAdapter(String.class);
                    this.categoryAdapter = gson.getAdapter(String.class);
                    this.scoreAccessibilityDescriptionAdapter = gson.getAdapter(String.class);
                    this.unlockAccessibilityDescriptionAdapter = gson.getAdapter(String.class);
                    this.categoryAccessibilityDescriptionAdapter = gson.getAdapter(String.class);
                    this.themeAdapter = gson.getAdapter(String.class);
                    this.shareAdapter = gson.getAdapter(String.class);
                    this.headerAdapter = gson.getAdapter(String.class);
                    this.targetScoreAdapter = gson.getAdapter(String.class);
                    this.nextPlayerSubHeaderAdapter = gson.getAdapter(String.class);
                    this.nextPlayerHeaderAdapter = gson.getAdapter(String.class);
                    this.subHeaderAdapter = gson.getAdapter(String.class);
                    this.currentScoreAdapter = gson.getAdapter(String.class);
                    this.p1ScoreAdapter = gson.getAdapter(String.class);
                    this.preconditionTokensAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, String.class));
                    this.mappingsAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, String.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, InteractiveStrings interactiveStrings) {
                    if (interactiveStrings == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("pointsToUnlock");
                    this.pointsToUnlockAdapter.write(jsonWriter, interactiveStrings.pointsToUnlock());
                    jsonWriter.name("unlock");
                    this.unlockAdapter.write(jsonWriter, interactiveStrings.unlock());
                    jsonWriter.name("earned");
                    this.earnedAdapter.write(jsonWriter, interactiveStrings.earned());
                    jsonWriter.name("score");
                    this.scoreAdapter.write(jsonWriter, interactiveStrings.score());
                    jsonWriter.name("maxScore");
                    this.maxScoreAdapter.write(jsonWriter, interactiveStrings.maxScore());
                    jsonWriter.name("question");
                    this.questionAdapter.write(jsonWriter, interactiveStrings.question());
                    jsonWriter.name("category");
                    this.categoryAdapter.write(jsonWriter, interactiveStrings.category());
                    jsonWriter.name("scoreAccessibilityDescription");
                    this.scoreAccessibilityDescriptionAdapter.write(jsonWriter, interactiveStrings.scoreAccessibilityDescription());
                    jsonWriter.name("unlockAccessibilityDescription");
                    this.unlockAccessibilityDescriptionAdapter.write(jsonWriter, interactiveStrings.unlockAccessibilityDescription());
                    jsonWriter.name("categoryAccessibilityDescription");
                    this.categoryAccessibilityDescriptionAdapter.write(jsonWriter, interactiveStrings.categoryAccessibilityDescription());
                    jsonWriter.name("theme");
                    this.themeAdapter.write(jsonWriter, interactiveStrings.theme());
                    jsonWriter.name("share");
                    this.shareAdapter.write(jsonWriter, interactiveStrings.share());
                    jsonWriter.name("header");
                    this.headerAdapter.write(jsonWriter, interactiveStrings.header());
                    jsonWriter.name("targetScore");
                    this.targetScoreAdapter.write(jsonWriter, interactiveStrings.targetScore());
                    jsonWriter.name("nextPlayerSubHeader");
                    this.nextPlayerSubHeaderAdapter.write(jsonWriter, interactiveStrings.nextPlayerSubHeader());
                    jsonWriter.name("nextPlayerHeader");
                    this.nextPlayerHeaderAdapter.write(jsonWriter, interactiveStrings.nextPlayerHeader());
                    jsonWriter.name("subHeader");
                    this.subHeaderAdapter.write(jsonWriter, interactiveStrings.subHeader());
                    jsonWriter.name("currentScore");
                    this.currentScoreAdapter.write(jsonWriter, interactiveStrings.currentScore());
                    jsonWriter.name("p1Score");
                    this.p1ScoreAdapter.write(jsonWriter, interactiveStrings.p1Score());
                    jsonWriter.name("preconditionTokens");
                    this.preconditionTokensAdapter.write(jsonWriter, interactiveStrings.preconditionTokens());
                    jsonWriter.name("mappings");
                    this.mappingsAdapter.write(jsonWriter, interactiveStrings.mappings());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public InteractiveStrings read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultPointsToUnlock;
                    String str2 = this.defaultUnlock;
                    String str3 = this.defaultEarned;
                    String str4 = this.defaultScore;
                    String str5 = this.defaultMaxScore;
                    String str6 = this.defaultQuestion;
                    String str7 = this.defaultCategory;
                    String str8 = this.defaultScoreAccessibilityDescription;
                    String str9 = this.defaultUnlockAccessibilityDescription;
                    String str10 = this.defaultCategoryAccessibilityDescription;
                    String str11 = this.defaultTheme;
                    String str12 = this.defaultShare;
                    String str13 = this.defaultHeader;
                    String str14 = this.defaultTargetScore;
                    String str15 = this.defaultNextPlayerSubHeader;
                    String str16 = this.defaultNextPlayerHeader;
                    String str17 = this.defaultSubHeader;
                    String str18 = this.defaultCurrentScore;
                    String str19 = this.defaultP1Score;
                    Map<String, String> map = this.defaultPreconditionTokens;
                    Map<String, String> map2 = this.defaultMappings;
                    String str20 = str2;
                    String str21 = str3;
                    String str22 = str4;
                    String str23 = str5;
                    String str24 = str6;
                    String str25 = str7;
                    String str26 = str8;
                    String str27 = str9;
                    String str28 = str10;
                    String str29 = str11;
                    String str30 = str12;
                    String str31 = str13;
                    String str32 = str14;
                    String str33 = str;
                    String str34 = str15;
                    String str35 = str16;
                    String str36 = str17;
                    String str37 = str18;
                    String str38 = str19;
                    Map<String, String> map3 = map;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -2096156799:
                                    if (nextName.equals("targetScore")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1618316052:
                                    if (nextName.equals("categoryAccessibilityDescription")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1310336393:
                                    if (nextName.equals("earned")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1221270899:
                                    if (nextName.equals("header")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1165870106:
                                    if (nextName.equals("question")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -840442044:
                                    if (nextName.equals("unlock")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -714875667:
                                    if (nextName.equals("subHeader")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -622942926:
                                    if (nextName.equals("unlockAccessibilityDescription")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -440108416:
                                    if (nextName.equals("scoreAccessibilityDescription")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 50511102:
                                    if (nextName.equals("category")) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 85307794:
                                    if (nextName.equals("preconditionTokens")) {
                                        c = '\n';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 109264530:
                                    if (nextName.equals("score")) {
                                        c = 11;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 109400031:
                                    if (nextName.equals("share")) {
                                        c = '\f';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 110327241:
                                    if (nextName.equals("theme")) {
                                        c = '\r';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 194445669:
                                    if (nextName.equals("mappings")) {
                                        c = 14;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 396519310:
                                    if (nextName.equals("maxScore")) {
                                        c = 15;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 654350233:
                                    if (nextName.equals("nextPlayerSubHeader")) {
                                        c = 16;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 985007969:
                                    if (nextName.equals("nextPlayerHeader")) {
                                        c = 17;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1191313314:
                                    if (nextName.equals("pointsToUnlock")) {
                                        c = 18;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1457329305:
                                    if (nextName.equals("currentScore")) {
                                        c = 19;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 2098704721:
                                    if (nextName.equals("p1Score")) {
                                        c = 20;
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
                                    str32 = this.targetScoreAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    str28 = this.categoryAccessibilityDescriptionAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    str21 = this.earnedAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    str31 = this.headerAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    str24 = this.questionAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    str20 = this.unlockAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    str36 = this.subHeaderAdapter.read(jsonReader);
                                    continue;
                                case 7:
                                    str27 = this.unlockAccessibilityDescriptionAdapter.read(jsonReader);
                                    continue;
                                case '\b':
                                    str26 = this.scoreAccessibilityDescriptionAdapter.read(jsonReader);
                                    continue;
                                case '\t':
                                    str25 = this.categoryAdapter.read(jsonReader);
                                    continue;
                                case '\n':
                                    map3 = this.preconditionTokensAdapter.read(jsonReader);
                                    continue;
                                case 11:
                                    str22 = this.scoreAdapter.read(jsonReader);
                                    continue;
                                case '\f':
                                    str30 = this.shareAdapter.read(jsonReader);
                                    continue;
                                case '\r':
                                    str29 = this.themeAdapter.read(jsonReader);
                                    continue;
                                case 14:
                                    map2 = this.mappingsAdapter.read(jsonReader);
                                    continue;
                                case 15:
                                    str23 = this.maxScoreAdapter.read(jsonReader);
                                    continue;
                                case 16:
                                    str34 = this.nextPlayerSubHeaderAdapter.read(jsonReader);
                                    continue;
                                case 17:
                                    str35 = this.nextPlayerHeaderAdapter.read(jsonReader);
                                    continue;
                                case 18:
                                    str33 = this.pointsToUnlockAdapter.read(jsonReader);
                                    continue;
                                case 19:
                                    str37 = this.currentScoreAdapter.read(jsonReader);
                                    continue;
                                case 20:
                                    str38 = this.p1ScoreAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_InteractiveStrings(str33, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str34, str35, str36, str37, str38, map3, map2);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (pointsToUnlock() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(pointsToUnlock());
        }
        if (unlock() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(unlock());
        }
        if (earned() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(earned());
        }
        if (score() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(score());
        }
        if (maxScore() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(maxScore());
        }
        if (question() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(question());
        }
        if (category() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(category());
        }
        if (scoreAccessibilityDescription() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(scoreAccessibilityDescription());
        }
        if (unlockAccessibilityDescription() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(unlockAccessibilityDescription());
        }
        if (categoryAccessibilityDescription() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(categoryAccessibilityDescription());
        }
        if (theme() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(theme());
        }
        if (share() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(share());
        }
        if (header() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(header());
        }
        if (targetScore() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(targetScore());
        }
        if (nextPlayerSubHeader() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(nextPlayerSubHeader());
        }
        if (nextPlayerHeader() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(nextPlayerHeader());
        }
        if (subHeader() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(subHeader());
        }
        if (currentScore() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(currentScore());
        }
        if (p1Score() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(p1Score());
        }
        parcel.writeMap(preconditionTokens());
        parcel.writeMap(mappings());
    }
}
