package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_InteractiveSceneConfig extends C$AutoValue_InteractiveSceneConfig {
    public static final Parcelable.Creator<AutoValue_InteractiveSceneConfig> CREATOR = new Parcelable.Creator<AutoValue_InteractiveSceneConfig>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_InteractiveSceneConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_InteractiveSceneConfig createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            Boolean bool6;
            Boolean bool7;
            boolean z = parcel.readInt() == 1;
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            ArrayList readArrayList = parcel.readArrayList(InteractiveSceneConfig.class.getClassLoader());
            boolean z2 = parcel.readInt() == 1;
            String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
            Integer valueOf = parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() == 0) {
                bool = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool = null;
            }
            if (parcel.readInt() == 0) {
                bool2 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool2 = null;
            }
            boolean z3 = parcel.readInt() == 1;
            if (parcel.readInt() == 0) {
                bool3 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool3 = null;
            }
            if (parcel.readInt() == 0) {
                bool4 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool4 = null;
            }
            if (parcel.readInt() == 0) {
                bool5 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool5 = null;
            }
            String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                bool6 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool6 = null;
            }
            if (parcel.readInt() == 0) {
                bool7 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool7 = null;
            }
            return new AutoValue_InteractiveSceneConfig(z, readString, readArrayList, z2, readString2, valueOf, bool, bool2, z3, bool3, bool4, bool5, readString3, bool6, bool7, (Prefetch) parcel.readParcelable(InteractiveSceneConfig.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_InteractiveSceneConfig[] newArray(int i) {
            return new AutoValue_InteractiveSceneConfig[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_InteractiveSceneConfig(final boolean z, final String str, final List<InteractiveSceneConfig.ChoiceDisplayRule> list, final boolean z2, final String str2, final Integer num, final Boolean bool, final Boolean bool2, final boolean z3, final Boolean bool3, final Boolean bool4, final Boolean bool5, final String str3, final Boolean bool6, final Boolean bool7, final Prefetch prefetch) {
        new C$$AutoValue_InteractiveSceneConfig(z, str, list, z2, str2, num, bool, bool2, z3, bool3, bool4, bool5, str3, bool6, bool7, prefetch) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_InteractiveSceneConfig

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_InteractiveSceneConfig$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<InteractiveSceneConfig> {
                private final TypeAdapter<Boolean> autoSelectChoiceOnTimeoutAdapter;
                private final TypeAdapter<List<InteractiveSceneConfig.ChoiceDisplayRule>> choiceDisplayRulesAdapter;
                private final TypeAdapter<String> choiceDisplayStrategyAdapter;
                private final TypeAdapter<Integer> defaultChoiceOverrideChoiceIndexAdapter;
                private final TypeAdapter<String> defaultChoiceStrategyAdapter;
                private final TypeAdapter<Boolean> disableToggleDefaultAdapter;
                private final TypeAdapter<Boolean> forceDefaultOnInitialVisitAdapter;
                private final TypeAdapter<Boolean> hideSubtitlesMenuDuringPlaybackAdapter;
                private final TypeAdapter<Boolean> is4By3Adapter;
                private final TypeAdapter<Boolean> isInterstitialPostplayAdapter;
                private final TypeAdapter<Boolean> jumpImmediatelyOnTimeoutAdapter;
                private final TypeAdapter<Boolean> pausePlaybackOnEnterAdapter;
                private final TypeAdapter<Prefetch> prefetchAdapter;
                private final TypeAdapter<Boolean> queueSelectedChoiceAdapter;
                private final TypeAdapter<Boolean> randomizeDefaultAdapter;
                private final TypeAdapter<String> transitionTypeAdapter;
                private boolean defaultPausePlaybackOnEnter = false;
                private String defaultChoiceDisplayStrategy = null;
                private List<InteractiveSceneConfig.ChoiceDisplayRule> defaultChoiceDisplayRules = null;
                private boolean defaultIsInterstitialPostplay = false;
                private String defaultDefaultChoiceStrategy = null;
                private Integer defaultDefaultChoiceOverrideChoiceIndex = null;
                private Boolean defaultAutoSelectChoiceOnTimeout = null;
                private Boolean defaultQueueSelectedChoice = null;
                private boolean defaultIs4By3 = false;
                private Boolean defaultRandomizeDefault = null;
                private Boolean defaultForceDefaultOnInitialVisit = null;
                private Boolean defaultDisableToggleDefault = null;
                private String defaultTransitionType = null;
                private Boolean defaultJumpImmediatelyOnTimeout = null;
                private Boolean defaultHideSubtitlesMenuDuringPlayback = null;
                private Prefetch defaultPrefetch = null;

                public GsonTypeAdapter setDefaultAutoSelectChoiceOnTimeout(Boolean bool) {
                    this.defaultAutoSelectChoiceOnTimeout = bool;
                    return this;
                }

                public GsonTypeAdapter setDefaultChoiceDisplayRules(List<InteractiveSceneConfig.ChoiceDisplayRule> list) {
                    this.defaultChoiceDisplayRules = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultChoiceDisplayStrategy(String str) {
                    this.defaultChoiceDisplayStrategy = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultDefaultChoiceOverrideChoiceIndex(Integer num) {
                    this.defaultDefaultChoiceOverrideChoiceIndex = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultDefaultChoiceStrategy(String str) {
                    this.defaultDefaultChoiceStrategy = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultDisableToggleDefault(Boolean bool) {
                    this.defaultDisableToggleDefault = bool;
                    return this;
                }

                public GsonTypeAdapter setDefaultForceDefaultOnInitialVisit(Boolean bool) {
                    this.defaultForceDefaultOnInitialVisit = bool;
                    return this;
                }

                public GsonTypeAdapter setDefaultHideSubtitlesMenuDuringPlayback(Boolean bool) {
                    this.defaultHideSubtitlesMenuDuringPlayback = bool;
                    return this;
                }

                public GsonTypeAdapter setDefaultIs4By3(boolean z) {
                    this.defaultIs4By3 = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultIsInterstitialPostplay(boolean z) {
                    this.defaultIsInterstitialPostplay = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultJumpImmediatelyOnTimeout(Boolean bool) {
                    this.defaultJumpImmediatelyOnTimeout = bool;
                    return this;
                }

                public GsonTypeAdapter setDefaultPausePlaybackOnEnter(boolean z) {
                    this.defaultPausePlaybackOnEnter = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultPrefetch(Prefetch prefetch) {
                    this.defaultPrefetch = prefetch;
                    return this;
                }

                public GsonTypeAdapter setDefaultQueueSelectedChoice(Boolean bool) {
                    this.defaultQueueSelectedChoice = bool;
                    return this;
                }

                public GsonTypeAdapter setDefaultRandomizeDefault(Boolean bool) {
                    this.defaultRandomizeDefault = bool;
                    return this;
                }

                public GsonTypeAdapter setDefaultTransitionType(String str) {
                    this.defaultTransitionType = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.pausePlaybackOnEnterAdapter = gson.getAdapter(Boolean.class);
                    this.choiceDisplayStrategyAdapter = gson.getAdapter(String.class);
                    this.choiceDisplayRulesAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, InteractiveSceneConfig.ChoiceDisplayRule.class));
                    this.isInterstitialPostplayAdapter = gson.getAdapter(Boolean.class);
                    this.defaultChoiceStrategyAdapter = gson.getAdapter(String.class);
                    this.defaultChoiceOverrideChoiceIndexAdapter = gson.getAdapter(Integer.class);
                    this.autoSelectChoiceOnTimeoutAdapter = gson.getAdapter(Boolean.class);
                    this.queueSelectedChoiceAdapter = gson.getAdapter(Boolean.class);
                    this.is4By3Adapter = gson.getAdapter(Boolean.class);
                    this.randomizeDefaultAdapter = gson.getAdapter(Boolean.class);
                    this.forceDefaultOnInitialVisitAdapter = gson.getAdapter(Boolean.class);
                    this.disableToggleDefaultAdapter = gson.getAdapter(Boolean.class);
                    this.transitionTypeAdapter = gson.getAdapter(String.class);
                    this.jumpImmediatelyOnTimeoutAdapter = gson.getAdapter(Boolean.class);
                    this.hideSubtitlesMenuDuringPlaybackAdapter = gson.getAdapter(Boolean.class);
                    this.prefetchAdapter = gson.getAdapter(Prefetch.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, InteractiveSceneConfig interactiveSceneConfig) {
                    if (interactiveSceneConfig == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("pausePlaybackOnEnter");
                    this.pausePlaybackOnEnterAdapter.write(jsonWriter, Boolean.valueOf(interactiveSceneConfig.pausePlaybackOnEnter()));
                    jsonWriter.name("choiceDisplayStrategy");
                    this.choiceDisplayStrategyAdapter.write(jsonWriter, interactiveSceneConfig.choiceDisplayStrategy());
                    jsonWriter.name("choiceDisplayRules");
                    this.choiceDisplayRulesAdapter.write(jsonWriter, interactiveSceneConfig.choiceDisplayRules());
                    jsonWriter.name("isInterstitialPostplay");
                    this.isInterstitialPostplayAdapter.write(jsonWriter, Boolean.valueOf(interactiveSceneConfig.isInterstitialPostplay()));
                    jsonWriter.name("defaultChoiceStrategy");
                    this.defaultChoiceStrategyAdapter.write(jsonWriter, interactiveSceneConfig.defaultChoiceStrategy());
                    jsonWriter.name("defaultChoiceOverrideChoiceIndex");
                    this.defaultChoiceOverrideChoiceIndexAdapter.write(jsonWriter, interactiveSceneConfig.defaultChoiceOverrideChoiceIndex());
                    jsonWriter.name("autoSelectChoiceOnTimeout");
                    this.autoSelectChoiceOnTimeoutAdapter.write(jsonWriter, interactiveSceneConfig.autoSelectChoiceOnTimeout());
                    jsonWriter.name("queueSelectedChoice");
                    this.queueSelectedChoiceAdapter.write(jsonWriter, interactiveSceneConfig.queueSelectedChoice());
                    jsonWriter.name("is4By3");
                    this.is4By3Adapter.write(jsonWriter, Boolean.valueOf(interactiveSceneConfig.is4By3()));
                    jsonWriter.name("randomizeDefault");
                    this.randomizeDefaultAdapter.write(jsonWriter, interactiveSceneConfig.randomizeDefault());
                    jsonWriter.name("forceDefaultOnInitialVisit");
                    this.forceDefaultOnInitialVisitAdapter.write(jsonWriter, interactiveSceneConfig.forceDefaultOnInitialVisit());
                    jsonWriter.name("disableToggleDefault");
                    this.disableToggleDefaultAdapter.write(jsonWriter, interactiveSceneConfig.disableToggleDefault());
                    jsonWriter.name("transitionType");
                    this.transitionTypeAdapter.write(jsonWriter, interactiveSceneConfig.transitionType());
                    jsonWriter.name("jumpImmediatelyOnTimeout");
                    this.jumpImmediatelyOnTimeoutAdapter.write(jsonWriter, interactiveSceneConfig.jumpImmediatelyOnTimeout());
                    jsonWriter.name("hideSubtitlesMenuDuringPlayback");
                    this.hideSubtitlesMenuDuringPlaybackAdapter.write(jsonWriter, interactiveSceneConfig.hideSubtitlesMenuDuringPlayback());
                    jsonWriter.name("prefetch");
                    this.prefetchAdapter.write(jsonWriter, interactiveSceneConfig.prefetch());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public InteractiveSceneConfig read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    boolean z = this.defaultPausePlaybackOnEnter;
                    String str = this.defaultChoiceDisplayStrategy;
                    List<InteractiveSceneConfig.ChoiceDisplayRule> list = this.defaultChoiceDisplayRules;
                    boolean z2 = this.defaultIsInterstitialPostplay;
                    String str2 = this.defaultDefaultChoiceStrategy;
                    Integer num = this.defaultDefaultChoiceOverrideChoiceIndex;
                    Boolean bool = this.defaultAutoSelectChoiceOnTimeout;
                    Boolean bool2 = this.defaultQueueSelectedChoice;
                    boolean z3 = this.defaultIs4By3;
                    Boolean bool3 = this.defaultRandomizeDefault;
                    Boolean bool4 = this.defaultForceDefaultOnInitialVisit;
                    Boolean bool5 = this.defaultDisableToggleDefault;
                    String str3 = this.defaultTransitionType;
                    Boolean bool6 = this.defaultJumpImmediatelyOnTimeout;
                    Boolean bool7 = this.defaultHideSubtitlesMenuDuringPlayback;
                    Prefetch prefetch = this.defaultPrefetch;
                    String str4 = str;
                    List<InteractiveSceneConfig.ChoiceDisplayRule> list2 = list;
                    boolean z4 = z2;
                    String str5 = str2;
                    Integer num2 = num;
                    Boolean bool8 = bool;
                    Boolean bool9 = bool2;
                    boolean z5 = z3;
                    Boolean bool10 = bool3;
                    Boolean bool11 = bool4;
                    Boolean bool12 = bool5;
                    String str6 = str3;
                    Boolean bool13 = bool6;
                    boolean z6 = z;
                    Boolean bool14 = bool7;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -2003648977:
                                    if (nextName.equals("transitionType")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1737436046:
                                    if (nextName.equals("jumpImmediatelyOnTimeout")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1366792490:
                                    if (nextName.equals("autoSelectChoiceOnTimeout")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1288666633:
                                    if (nextName.equals("prefetch")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1181085166:
                                    if (nextName.equals("is4By3")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -574651788:
                                    if (nextName.equals("choiceDisplayStrategy")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -2966678:
                                    if (nextName.equals("isInterstitialPostplay")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 148470608:
                                    if (nextName.equals("randomizeDefault")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 302313052:
                                    if (nextName.equals("forceDefaultOnInitialVisit")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 341364621:
                                    if (nextName.equals("queueSelectedChoice")) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 442089672:
                                    if (nextName.equals("pausePlaybackOnEnter")) {
                                        c = '\n';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 557613780:
                                    if (nextName.equals("hideSubtitlesMenuDuringPlayback")) {
                                        c = 11;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 629084741:
                                    if (nextName.equals("disableToggleDefault")) {
                                        c = '\f';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1246122197:
                                    if (nextName.equals("defaultChoiceStrategy")) {
                                        c = '\r';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1316794774:
                                    if (nextName.equals("choiceDisplayRules")) {
                                        c = 14;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 2074684835:
                                    if (nextName.equals("defaultChoiceOverrideChoiceIndex")) {
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
                                    str6 = this.transitionTypeAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    bool13 = this.jumpImmediatelyOnTimeoutAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    bool8 = this.autoSelectChoiceOnTimeoutAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    prefetch = this.prefetchAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    z5 = this.is4By3Adapter.read(jsonReader).booleanValue();
                                    continue;
                                case 5:
                                    str4 = this.choiceDisplayStrategyAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    z4 = this.isInterstitialPostplayAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case 7:
                                    bool10 = this.randomizeDefaultAdapter.read(jsonReader);
                                    continue;
                                case '\b':
                                    bool11 = this.forceDefaultOnInitialVisitAdapter.read(jsonReader);
                                    continue;
                                case '\t':
                                    bool9 = this.queueSelectedChoiceAdapter.read(jsonReader);
                                    continue;
                                case '\n':
                                    z6 = this.pausePlaybackOnEnterAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case 11:
                                    bool14 = this.hideSubtitlesMenuDuringPlaybackAdapter.read(jsonReader);
                                    continue;
                                case '\f':
                                    bool12 = this.disableToggleDefaultAdapter.read(jsonReader);
                                    continue;
                                case '\r':
                                    str5 = this.defaultChoiceStrategyAdapter.read(jsonReader);
                                    continue;
                                case 14:
                                    list2 = this.choiceDisplayRulesAdapter.read(jsonReader);
                                    continue;
                                case 15:
                                    num2 = this.defaultChoiceOverrideChoiceIndexAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_InteractiveSceneConfig(z6, str4, list2, z4, str5, num2, bool8, bool9, z5, bool10, bool11, bool12, str6, bool13, bool14, prefetch);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(pausePlaybackOnEnter() ? 1 : 0);
        if (choiceDisplayStrategy() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(choiceDisplayStrategy());
        }
        parcel.writeList(choiceDisplayRules());
        parcel.writeInt(isInterstitialPostplay() ? 1 : 0);
        if (defaultChoiceStrategy() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(defaultChoiceStrategy());
        }
        if (defaultChoiceOverrideChoiceIndex() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(defaultChoiceOverrideChoiceIndex().intValue());
        }
        if (autoSelectChoiceOnTimeout() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(autoSelectChoiceOnTimeout().booleanValue() ? 1 : 0);
        }
        if (queueSelectedChoice() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(queueSelectedChoice().booleanValue() ? 1 : 0);
        }
        parcel.writeInt(is4By3() ? 1 : 0);
        if (randomizeDefault() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(randomizeDefault().booleanValue() ? 1 : 0);
        }
        if (forceDefaultOnInitialVisit() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(forceDefaultOnInitialVisit().booleanValue() ? 1 : 0);
        }
        if (disableToggleDefault() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(disableToggleDefault().booleanValue() ? 1 : 0);
        }
        if (transitionType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(transitionType());
        }
        if (jumpImmediatelyOnTimeout() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(jumpImmediatelyOnTimeout().booleanValue() ? 1 : 0);
        }
        if (hideSubtitlesMenuDuringPlayback() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(hideSubtitlesMenuDuringPlayback().booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(prefetch(), i);
    }
}
