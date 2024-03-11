package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.UiDefinition;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UiDefinition_Layout_Config extends C$AutoValue_UiDefinition_Layout_Config {
    public static final Parcelable.Creator<AutoValue_UiDefinition_Layout_Config> CREATOR = new Parcelable.Creator<AutoValue_UiDefinition_Layout_Config>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_UiDefinition_Layout_Config.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UiDefinition_Layout_Config createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            Size size = (Size) parcel.readParcelable(UiDefinition.Layout.Config.class.getClassLoader());
            UiDefinition.Layout.Config.SubtitleRect subtitleRect = (UiDefinition.Layout.Config.SubtitleRect) parcel.readParcelable(UiDefinition.Layout.Config.class.getClassLoader());
            UiDefinition.Layout.Config.SubtitleRect subtitleRect2 = (UiDefinition.Layout.Config.SubtitleRect) parcel.readParcelable(UiDefinition.Layout.Config.class.getClassLoader());
            Boolean bool3 = null;
            if (parcel.readInt() == 0) {
                bool = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool = null;
            }
            Integer valueOf = parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null;
            Integer valueOf2 = parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null;
            Integer valueOf3 = parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null;
            Integer valueOf4 = parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null;
            boolean z = parcel.readInt() == 1;
            if (parcel.readInt() == 0) {
                bool2 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool2 = null;
            }
            if (parcel.readInt() == 0) {
                bool3 = Boolean.valueOf(parcel.readInt() == 1);
            }
            return new AutoValue_UiDefinition_Layout_Config(size, subtitleRect, subtitleRect2, bool, valueOf, valueOf2, valueOf3, valueOf4, z, bool2, bool3, parcel.readInt() == 1, parcel.readInt() == 1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UiDefinition_Layout_Config[] newArray(int i) {
            return new AutoValue_UiDefinition_Layout_Config[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_UiDefinition_Layout_Config(final Size size, final UiDefinition.Layout.Config.SubtitleRect subtitleRect, final UiDefinition.Layout.Config.SubtitleRect subtitleRect2, final Boolean bool, final Integer num, final Integer num2, final Integer num3, final Integer num4, final boolean z, final Boolean bool2, final Boolean bool3, final boolean z2, final boolean z3) {
        new C$$AutoValue_UiDefinition_Layout_Config(size, subtitleRect, subtitleRect2, bool, num, num2, num3, num4, z, bool2, bool3, z2, z3) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_UiDefinition_Layout_Config

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_UiDefinition_Layout_Config$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<UiDefinition.Layout.Config> {
                private final TypeAdapter<Boolean> autoSelectChoiceOnTimeoutAdapter;
                private final TypeAdapter<Size> canvasSizeAdapter;
                private final TypeAdapter<Integer> choiceMaxWidthAdapter;
                private final TypeAdapter<Integer> choiceMinWidthAdapter;
                private final TypeAdapter<Integer> choiceSpacingAdapter;
                private final TypeAdapter<Boolean> choicesSupportFallbackLabelAdapter;
                private final TypeAdapter<Boolean> disableToggleDefaultAdapter;
                private final TypeAdapter<Boolean> enablePrefetchingDuringPlaybackAdapter;
                private final TypeAdapter<Boolean> pauseAnimationsAdapter;
                private final TypeAdapter<Boolean> queueSelectedChoiceAdapter;
                private final TypeAdapter<Integer> resultsMaxWidthAdapter;
                private final TypeAdapter<UiDefinition.Layout.Config.SubtitleRect> subRectAdapter;
                private final TypeAdapter<UiDefinition.Layout.Config.SubtitleRect> subtitleRectAdapter;
                private Size defaultCanvasSize = null;
                private UiDefinition.Layout.Config.SubtitleRect defaultSubRect = null;
                private UiDefinition.Layout.Config.SubtitleRect defaultSubtitleRect = null;
                private Boolean defaultQueueSelectedChoice = null;
                private Integer defaultChoiceMaxWidth = null;
                private Integer defaultChoiceMinWidth = null;
                private Integer defaultResultsMaxWidth = null;
                private Integer defaultChoiceSpacing = null;
                private boolean defaultEnablePrefetchingDuringPlayback = false;
                private Boolean defaultDisableToggleDefault = null;
                private Boolean defaultAutoSelectChoiceOnTimeout = null;
                private boolean defaultChoicesSupportFallbackLabel = false;
                private boolean defaultPauseAnimations = false;

                public GsonTypeAdapter setDefaultAutoSelectChoiceOnTimeout(Boolean bool) {
                    this.defaultAutoSelectChoiceOnTimeout = bool;
                    return this;
                }

                public GsonTypeAdapter setDefaultCanvasSize(Size size) {
                    this.defaultCanvasSize = size;
                    return this;
                }

                public GsonTypeAdapter setDefaultChoiceMaxWidth(Integer num) {
                    this.defaultChoiceMaxWidth = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultChoiceMinWidth(Integer num) {
                    this.defaultChoiceMinWidth = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultChoiceSpacing(Integer num) {
                    this.defaultChoiceSpacing = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultChoicesSupportFallbackLabel(boolean z) {
                    this.defaultChoicesSupportFallbackLabel = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultDisableToggleDefault(Boolean bool) {
                    this.defaultDisableToggleDefault = bool;
                    return this;
                }

                public GsonTypeAdapter setDefaultEnablePrefetchingDuringPlayback(boolean z) {
                    this.defaultEnablePrefetchingDuringPlayback = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultPauseAnimations(boolean z) {
                    this.defaultPauseAnimations = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultQueueSelectedChoice(Boolean bool) {
                    this.defaultQueueSelectedChoice = bool;
                    return this;
                }

                public GsonTypeAdapter setDefaultResultsMaxWidth(Integer num) {
                    this.defaultResultsMaxWidth = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultSubRect(UiDefinition.Layout.Config.SubtitleRect subtitleRect) {
                    this.defaultSubRect = subtitleRect;
                    return this;
                }

                public GsonTypeAdapter setDefaultSubtitleRect(UiDefinition.Layout.Config.SubtitleRect subtitleRect) {
                    this.defaultSubtitleRect = subtitleRect;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.canvasSizeAdapter = gson.getAdapter(Size.class);
                    this.subRectAdapter = gson.getAdapter(UiDefinition.Layout.Config.SubtitleRect.class);
                    this.subtitleRectAdapter = gson.getAdapter(UiDefinition.Layout.Config.SubtitleRect.class);
                    this.queueSelectedChoiceAdapter = gson.getAdapter(Boolean.class);
                    this.choiceMaxWidthAdapter = gson.getAdapter(Integer.class);
                    this.choiceMinWidthAdapter = gson.getAdapter(Integer.class);
                    this.resultsMaxWidthAdapter = gson.getAdapter(Integer.class);
                    this.choiceSpacingAdapter = gson.getAdapter(Integer.class);
                    this.enablePrefetchingDuringPlaybackAdapter = gson.getAdapter(Boolean.class);
                    this.disableToggleDefaultAdapter = gson.getAdapter(Boolean.class);
                    this.autoSelectChoiceOnTimeoutAdapter = gson.getAdapter(Boolean.class);
                    this.choicesSupportFallbackLabelAdapter = gson.getAdapter(Boolean.class);
                    this.pauseAnimationsAdapter = gson.getAdapter(Boolean.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, UiDefinition.Layout.Config config) {
                    if (config == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("canvasSize");
                    this.canvasSizeAdapter.write(jsonWriter, config.canvasSize());
                    jsonWriter.name("subtitlesRect");
                    this.subRectAdapter.write(jsonWriter, config.subRect());
                    jsonWriter.name("subtitleRect");
                    this.subtitleRectAdapter.write(jsonWriter, config.subtitleRect());
                    jsonWriter.name("queueSelectedChoice");
                    this.queueSelectedChoiceAdapter.write(jsonWriter, config.queueSelectedChoice());
                    jsonWriter.name("choiceMaxWidth");
                    this.choiceMaxWidthAdapter.write(jsonWriter, config.choiceMaxWidth());
                    jsonWriter.name("choiceMinWidth");
                    this.choiceMinWidthAdapter.write(jsonWriter, config.choiceMinWidth());
                    jsonWriter.name("resultsMaxWidth");
                    this.resultsMaxWidthAdapter.write(jsonWriter, config.resultsMaxWidth());
                    jsonWriter.name("choiceSpacing");
                    this.choiceSpacingAdapter.write(jsonWriter, config.choiceSpacing());
                    jsonWriter.name("enablePrefetchingDuringPlayback");
                    this.enablePrefetchingDuringPlaybackAdapter.write(jsonWriter, Boolean.valueOf(config.enablePrefetchingDuringPlayback()));
                    jsonWriter.name("disableToggleDefault");
                    this.disableToggleDefaultAdapter.write(jsonWriter, config.disableToggleDefault());
                    jsonWriter.name("autoSelectChoiceOnTimeout");
                    this.autoSelectChoiceOnTimeoutAdapter.write(jsonWriter, config.autoSelectChoiceOnTimeout());
                    jsonWriter.name("choicesSupportFallbackLabel");
                    this.choicesSupportFallbackLabelAdapter.write(jsonWriter, Boolean.valueOf(config.choicesSupportFallbackLabel()));
                    jsonWriter.name("pauseAnimations");
                    this.pauseAnimationsAdapter.write(jsonWriter, Boolean.valueOf(config.pauseAnimations()));
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public UiDefinition.Layout.Config read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    Size size = this.defaultCanvasSize;
                    UiDefinition.Layout.Config.SubtitleRect subtitleRect = this.defaultSubRect;
                    UiDefinition.Layout.Config.SubtitleRect subtitleRect2 = this.defaultSubtitleRect;
                    Boolean bool = this.defaultQueueSelectedChoice;
                    Integer num = this.defaultChoiceMaxWidth;
                    Integer num2 = this.defaultChoiceMinWidth;
                    Integer num3 = this.defaultResultsMaxWidth;
                    Integer num4 = this.defaultChoiceSpacing;
                    boolean z = this.defaultEnablePrefetchingDuringPlayback;
                    Boolean bool2 = this.defaultDisableToggleDefault;
                    Boolean bool3 = this.defaultAutoSelectChoiceOnTimeout;
                    Size size2 = size;
                    UiDefinition.Layout.Config.SubtitleRect subtitleRect3 = subtitleRect;
                    UiDefinition.Layout.Config.SubtitleRect subtitleRect4 = subtitleRect2;
                    Boolean bool4 = bool;
                    Integer num5 = num;
                    Integer num6 = num2;
                    Integer num7 = num3;
                    Integer num8 = num4;
                    boolean z2 = z;
                    Boolean bool5 = bool2;
                    Boolean bool6 = bool3;
                    boolean z3 = this.defaultChoicesSupportFallbackLabel;
                    boolean z4 = this.defaultPauseAnimations;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -2044572132:
                                    if (nextName.equals("subtitleRect")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1552163835:
                                    if (nextName.equals("pauseAnimations")) {
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
                                case -1192106109:
                                    if (nextName.equals("choiceMaxWidth")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1090105692:
                                    if (nextName.equals("enablePrefetchingDuringPlayback")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -504783947:
                                    if (nextName.equals("choicesSupportFallbackLabel")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 24813784:
                                    if (nextName.equals("resultsMaxWidth")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 341364621:
                                    if (nextName.equals("queueSelectedChoice")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 629084741:
                                    if (nextName.equals("disableToggleDefault")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1072685023:
                                    if (nextName.equals("subtitlesRect")) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1326664533:
                                    if (nextName.equals("choiceMinWidth")) {
                                        c = '\n';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1463246201:
                                    if (nextName.equals("canvasSize")) {
                                        c = 11;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1538701154:
                                    if (nextName.equals("choiceSpacing")) {
                                        c = '\f';
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
                                    subtitleRect4 = this.subtitleRectAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    z4 = this.pauseAnimationsAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case 2:
                                    bool6 = this.autoSelectChoiceOnTimeoutAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    num5 = this.choiceMaxWidthAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    z2 = this.enablePrefetchingDuringPlaybackAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case 5:
                                    z3 = this.choicesSupportFallbackLabelAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case 6:
                                    num7 = this.resultsMaxWidthAdapter.read(jsonReader);
                                    continue;
                                case 7:
                                    bool4 = this.queueSelectedChoiceAdapter.read(jsonReader);
                                    continue;
                                case '\b':
                                    bool5 = this.disableToggleDefaultAdapter.read(jsonReader);
                                    continue;
                                case '\t':
                                    subtitleRect3 = this.subRectAdapter.read(jsonReader);
                                    continue;
                                case '\n':
                                    num6 = this.choiceMinWidthAdapter.read(jsonReader);
                                    continue;
                                case 11:
                                    size2 = this.canvasSizeAdapter.read(jsonReader);
                                    continue;
                                case '\f':
                                    num8 = this.choiceSpacingAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_UiDefinition_Layout_Config(size2, subtitleRect3, subtitleRect4, bool4, num5, num6, num7, num8, z2, bool5, bool6, z3, z4);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(canvasSize(), i);
        parcel.writeParcelable(subRect(), i);
        parcel.writeParcelable(subtitleRect(), i);
        if (queueSelectedChoice() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(queueSelectedChoice().booleanValue() ? 1 : 0);
        }
        if (choiceMaxWidth() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(choiceMaxWidth().intValue());
        }
        if (choiceMinWidth() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(choiceMinWidth().intValue());
        }
        if (resultsMaxWidth() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(resultsMaxWidth().intValue());
        }
        if (choiceSpacing() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(choiceSpacing().intValue());
        }
        parcel.writeInt(enablePrefetchingDuringPlayback() ? 1 : 0);
        if (disableToggleDefault() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(disableToggleDefault().booleanValue() ? 1 : 0);
        }
        if (autoSelectChoiceOnTimeout() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(autoSelectChoiceOnTimeout().booleanValue() ? 1 : 0);
        }
        parcel.writeInt(choicesSupportFallbackLabel() ? 1 : 0);
        parcel.writeInt(pauseAnimations() ? 1 : 0);
    }
}
