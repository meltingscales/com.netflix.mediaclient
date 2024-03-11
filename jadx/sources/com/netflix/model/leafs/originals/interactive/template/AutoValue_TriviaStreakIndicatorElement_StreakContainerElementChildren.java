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
import com.netflix.model.leafs.originals.interactive.template.TriviaStreakIndicatorElement;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_TriviaStreakIndicatorElement_StreakContainerElementChildren extends C$AutoValue_TriviaStreakIndicatorElement_StreakContainerElementChildren {
    public static final Parcelable.Creator<AutoValue_TriviaStreakIndicatorElement_StreakContainerElementChildren> CREATOR = new Parcelable.Creator<AutoValue_TriviaStreakIndicatorElement_StreakContainerElementChildren>() { // from class: com.netflix.model.leafs.originals.interactive.template.AutoValue_TriviaStreakIndicatorElement_StreakContainerElementChildren.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TriviaStreakIndicatorElement_StreakContainerElementChildren createFromParcel(Parcel parcel) {
            return new AutoValue_TriviaStreakIndicatorElement_StreakContainerElementChildren(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readHashMap(TriviaStreakIndicatorElement.StreakContainerElementChildren.class.getClassLoader()), parcel.readHashMap(TriviaStreakIndicatorElement.StreakContainerElementChildren.class.getClassLoader()), (BackgroundImageElement) parcel.readParcelable(TriviaStreakIndicatorElement.StreakContainerElementChildren.class.getClassLoader()), (LabelElement) parcel.readParcelable(TriviaStreakIndicatorElement.StreakContainerElementChildren.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TriviaStreakIndicatorElement_StreakContainerElementChildren[] newArray(int i) {
            return new AutoValue_TriviaStreakIndicatorElement_StreakContainerElementChildren[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_TriviaStreakIndicatorElement_StreakContainerElementChildren(final String str, final String str2, final String str3, final Map<String, AnimationTemplateId> map, final Map<String, VisualStateDefinition> map2, final BackgroundImageElement backgroundImageElement, final LabelElement labelElement) {
        new C$$AutoValue_TriviaStreakIndicatorElement_StreakContainerElementChildren(str, str2, str3, map, map2, backgroundImageElement, labelElement) { // from class: com.netflix.model.leafs.originals.interactive.template.$AutoValue_TriviaStreakIndicatorElement_StreakContainerElementChildren

            /* renamed from: com.netflix.model.leafs.originals.interactive.template.$AutoValue_TriviaStreakIndicatorElement_StreakContainerElementChildren$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<TriviaStreakIndicatorElement.StreakContainerElementChildren> {
                private final TypeAdapter<BackgroundImageElement> backgroundDataAdapter;
                private final TypeAdapter<String> idAdapter;
                private final TypeAdapter<LabelElement> labelElementAdapter;
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
                private LabelElement defaultLabelElement = null;

                public GsonTypeAdapter setDefaultBackgroundData(BackgroundImageElement backgroundImageElement) {
                    this.defaultBackgroundData = backgroundImageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultId(String str) {
                    this.defaultId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultLabelElement(LabelElement labelElement) {
                    this.defaultLabelElement = labelElement;
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
                    this.labelElementAdapter = gson.getAdapter(LabelElement.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, TriviaStreakIndicatorElement.StreakContainerElementChildren streakContainerElementChildren) {
                    if (streakContainerElementChildren == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.idAdapter.write(jsonWriter, streakContainerElementChildren.id());
                    jsonWriter.name("type");
                    this.typeAdapter.write(jsonWriter, streakContainerElementChildren.type());
                    jsonWriter.name("styleId");
                    this.styleIdAdapter.write(jsonWriter, streakContainerElementChildren.styleId());
                    jsonWriter.name("visualStateTransitions");
                    this.visualStateTransitionsAdapter.write(jsonWriter, streakContainerElementChildren.visualStateTransitions());
                    jsonWriter.name("visualStates");
                    this.visualStatesAdapter.write(jsonWriter, streakContainerElementChildren.visualStates());
                    jsonWriter.name("background");
                    this.backgroundDataAdapter.write(jsonWriter, streakContainerElementChildren.backgroundData());
                    jsonWriter.name("label");
                    this.labelElementAdapter.write(jsonWriter, streakContainerElementChildren.labelElement());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public TriviaStreakIndicatorElement.StreakContainerElementChildren read(JsonReader jsonReader) {
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
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    Map<String, AnimationTemplateId> map3 = map;
                    Map<String, VisualStateDefinition> map4 = map2;
                    BackgroundImageElement backgroundImageElement = this.defaultBackgroundData;
                    LabelElement labelElement = this.defaultLabelElement;
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
                                case 3355:
                                    if (nextName.equals(SignupConstants.Field.LANG_ID)) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3575610:
                                    if (nextName.equals("type")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 102727412:
                                    if (nextName.equals("label")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 951359437:
                                    if (nextName.equals("visualStateTransitions")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1603916130:
                                    if (nextName.equals("visualStates")) {
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
                                    str6 = this.styleIdAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    backgroundImageElement = this.backgroundDataAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    str4 = this.idAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    str5 = this.typeAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    labelElement = this.labelElementAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    map3 = this.visualStateTransitionsAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    map4 = this.visualStatesAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_TriviaStreakIndicatorElement_StreakContainerElementChildren(str4, str5, str6, map3, map4, backgroundImageElement, labelElement);
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
        parcel.writeParcelable(labelElement(), i);
    }
}
