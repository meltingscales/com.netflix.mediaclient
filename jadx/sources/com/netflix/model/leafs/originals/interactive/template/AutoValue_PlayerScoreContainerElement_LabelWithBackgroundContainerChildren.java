package com.netflix.model.leafs.originals.interactive.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.PlayerScoreContainerElement;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_PlayerScoreContainerElement_LabelWithBackgroundContainerChildren extends C$AutoValue_PlayerScoreContainerElement_LabelWithBackgroundContainerChildren {
    public static final Parcelable.Creator<AutoValue_PlayerScoreContainerElement_LabelWithBackgroundContainerChildren> CREATOR = new Parcelable.Creator<AutoValue_PlayerScoreContainerElement_LabelWithBackgroundContainerChildren>() { // from class: com.netflix.model.leafs.originals.interactive.template.AutoValue_PlayerScoreContainerElement_LabelWithBackgroundContainerChildren.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerScoreContainerElement_LabelWithBackgroundContainerChildren createFromParcel(Parcel parcel) {
            return new AutoValue_PlayerScoreContainerElement_LabelWithBackgroundContainerChildren(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readHashMap(PlayerScoreContainerElement.LabelWithBackgroundContainerChildren.class.getClassLoader()), parcel.readHashMap(PlayerScoreContainerElement.LabelWithBackgroundContainerChildren.class.getClassLoader()), (BackgroundImageElement) parcel.readParcelable(PlayerScoreContainerElement.LabelWithBackgroundContainerChildren.class.getClassLoader()), (LabelElement) parcel.readParcelable(PlayerScoreContainerElement.LabelWithBackgroundContainerChildren.class.getClassLoader()), (LabelElement) parcel.readParcelable(PlayerScoreContainerElement.LabelWithBackgroundContainerChildren.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerScoreContainerElement_LabelWithBackgroundContainerChildren[] newArray(int i) {
            return new AutoValue_PlayerScoreContainerElement_LabelWithBackgroundContainerChildren[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_PlayerScoreContainerElement_LabelWithBackgroundContainerChildren(final String str, final String str2, final String str3, final Map<String, AnimationTemplateId> map, final Map<String, VisualStateDefinition> map2, final BackgroundImageElement backgroundImageElement, final LabelElement labelElement, final LabelElement labelElement2) {
        new C$$AutoValue_PlayerScoreContainerElement_LabelWithBackgroundContainerChildren(str, str2, str3, map, map2, backgroundImageElement, labelElement, labelElement2) { // from class: com.netflix.model.leafs.originals.interactive.template.$AutoValue_PlayerScoreContainerElement_LabelWithBackgroundContainerChildren

            /* renamed from: com.netflix.model.leafs.originals.interactive.template.$AutoValue_PlayerScoreContainerElement_LabelWithBackgroundContainerChildren$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<PlayerScoreContainerElement.LabelWithBackgroundContainerChildren> {
                private final TypeAdapter<BackgroundImageElement> backgroundDataAdapter;
                private final TypeAdapter<String> idAdapter;
                private final TypeAdapter<LabelElement> playerIdLabelAdapter;
                private final TypeAdapter<LabelElement> playerScoreLabelAdapter;
                private final TypeAdapter<String> styleIdAdapter;
                private final TypeAdapter<String> typeAdapter;
                private final TypeAdapter<Map<String, AnimationTemplateId>> visualStateTransitionsAdapter;
                private final TypeAdapter<Map<String, VisualStateDefinition>> visualStatesAdapter;
                private String defaultId = null;
                private String defaultType = null;
                private String defaultStyleId = null;
                private Map<String, AnimationTemplateId> defaultVisualStateTransitions = null;
                private Map<String, VisualStateDefinition> defaultVisualStates = null;
                private BackgroundImageElement defaultBackgroundData = null;
                private LabelElement defaultPlayerIdLabel = null;
                private LabelElement defaultPlayerScoreLabel = null;

                public GsonTypeAdapter setDefaultBackgroundData(BackgroundImageElement backgroundImageElement) {
                    this.defaultBackgroundData = backgroundImageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultId(String str) {
                    this.defaultId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultPlayerIdLabel(LabelElement labelElement) {
                    this.defaultPlayerIdLabel = labelElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultPlayerScoreLabel(LabelElement labelElement) {
                    this.defaultPlayerScoreLabel = labelElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultStyleId(String str) {
                    this.defaultStyleId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultType(String str) {
                    this.defaultType = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultVisualStateTransitions(Map<String, AnimationTemplateId> map) {
                    this.defaultVisualStateTransitions = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultVisualStates(Map<String, VisualStateDefinition> map) {
                    this.defaultVisualStates = map;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.idAdapter = gson.getAdapter(String.class);
                    this.typeAdapter = gson.getAdapter(String.class);
                    this.styleIdAdapter = gson.getAdapter(String.class);
                    this.visualStateTransitionsAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, AnimationTemplateId.class));
                    this.visualStatesAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, VisualStateDefinition.class));
                    this.backgroundDataAdapter = gson.getAdapter(BackgroundImageElement.class);
                    this.playerIdLabelAdapter = gson.getAdapter(LabelElement.class);
                    this.playerScoreLabelAdapter = gson.getAdapter(LabelElement.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, PlayerScoreContainerElement.LabelWithBackgroundContainerChildren labelWithBackgroundContainerChildren) {
                    if (labelWithBackgroundContainerChildren == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.idAdapter.write(jsonWriter, labelWithBackgroundContainerChildren.id());
                    jsonWriter.name("type");
                    this.typeAdapter.write(jsonWriter, labelWithBackgroundContainerChildren.type());
                    jsonWriter.name("styleId");
                    this.styleIdAdapter.write(jsonWriter, labelWithBackgroundContainerChildren.styleId());
                    jsonWriter.name("visualStateTransitions");
                    this.visualStateTransitionsAdapter.write(jsonWriter, labelWithBackgroundContainerChildren.visualStateTransitions());
                    jsonWriter.name("visualStates");
                    this.visualStatesAdapter.write(jsonWriter, labelWithBackgroundContainerChildren.visualStates());
                    jsonWriter.name("background");
                    this.backgroundDataAdapter.write(jsonWriter, labelWithBackgroundContainerChildren.backgroundData());
                    jsonWriter.name("playerIdLabel");
                    this.playerIdLabelAdapter.write(jsonWriter, labelWithBackgroundContainerChildren.playerIdLabel());
                    jsonWriter.name("playerScoreLabel");
                    this.playerScoreLabelAdapter.write(jsonWriter, labelWithBackgroundContainerChildren.playerScoreLabel());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public PlayerScoreContainerElement.LabelWithBackgroundContainerChildren read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultId;
                    String str2 = this.defaultType;
                    String str3 = this.defaultStyleId;
                    Map<String, AnimationTemplateId> map = this.defaultVisualStateTransitions;
                    Map<String, VisualStateDefinition> map2 = this.defaultVisualStates;
                    BackgroundImageElement backgroundImageElement = this.defaultBackgroundData;
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    Map<String, AnimationTemplateId> map3 = map;
                    Map<String, VisualStateDefinition> map4 = map2;
                    BackgroundImageElement backgroundImageElement2 = backgroundImageElement;
                    LabelElement labelElement = this.defaultPlayerIdLabel;
                    LabelElement labelElement2 = this.defaultPlayerScoreLabel;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1875214676:
                                    if (nextName.equals("styleId")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1332194002:
                                    if (nextName.equals("background")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -7296904:
                                    if (nextName.equals("playerIdLabel")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3355:
                                    if (nextName.equals(SignupConstants.Field.LANG_ID)) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3575610:
                                    if (nextName.equals("type")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 342666563:
                                    if (nextName.equals("playerScoreLabel")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 951359437:
                                    if (nextName.equals("visualStateTransitions")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1603916130:
                                    if (nextName.equals("visualStates")) {
                                        c = 7;
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
                                    str6 = this.styleIdAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    backgroundImageElement2 = this.backgroundDataAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    labelElement = this.playerIdLabelAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    str4 = this.idAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    str5 = this.typeAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    labelElement2 = this.playerScoreLabelAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    map3 = this.visualStateTransitionsAdapter.read(jsonReader);
                                    continue;
                                case 7:
                                    map4 = this.visualStatesAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_PlayerScoreContainerElement_LabelWithBackgroundContainerChildren(str4, str5, str6, map3, map4, backgroundImageElement2, labelElement, labelElement2);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (id() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(id());
        }
        if (type() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(type());
        }
        if (styleId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(styleId());
        }
        parcel.writeMap(visualStateTransitions());
        parcel.writeMap(visualStates());
        parcel.writeParcelable(backgroundData(), i);
        parcel.writeParcelable(playerIdLabel(), i);
        parcel.writeParcelable(playerScoreLabel(), i);
    }
}
