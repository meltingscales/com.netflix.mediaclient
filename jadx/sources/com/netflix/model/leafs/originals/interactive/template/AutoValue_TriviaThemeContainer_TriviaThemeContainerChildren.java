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
import com.netflix.model.leafs.originals.interactive.template.TriviaThemeContainer;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_TriviaThemeContainer_TriviaThemeContainerChildren extends C$AutoValue_TriviaThemeContainer_TriviaThemeContainerChildren {
    public static final Parcelable.Creator<AutoValue_TriviaThemeContainer_TriviaThemeContainerChildren> CREATOR = new Parcelable.Creator<AutoValue_TriviaThemeContainer_TriviaThemeContainerChildren>() { // from class: com.netflix.model.leafs.originals.interactive.template.AutoValue_TriviaThemeContainer_TriviaThemeContainerChildren.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TriviaThemeContainer_TriviaThemeContainerChildren createFromParcel(Parcel parcel) {
            return new AutoValue_TriviaThemeContainer_TriviaThemeContainerChildren(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readHashMap(TriviaThemeContainer.TriviaThemeContainerChildren.class.getClassLoader()), parcel.readHashMap(TriviaThemeContainer.TriviaThemeContainerChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(TriviaThemeContainer.TriviaThemeContainerChildren.class.getClassLoader()), (SimpleElement) parcel.readParcelable(TriviaThemeContainer.TriviaThemeContainerChildren.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TriviaThemeContainer_TriviaThemeContainerChildren[] newArray(int i) {
            return new AutoValue_TriviaThemeContainer_TriviaThemeContainerChildren[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_TriviaThemeContainer_TriviaThemeContainerChildren(final String str, final String str2, final String str3, final Map<String, AnimationTemplateId> map, final Map<String, VisualStateDefinition> map2, final ImageElement imageElement, final SimpleElement simpleElement) {
        new C$$AutoValue_TriviaThemeContainer_TriviaThemeContainerChildren(str, str2, str3, map, map2, imageElement, simpleElement) { // from class: com.netflix.model.leafs.originals.interactive.template.$AutoValue_TriviaThemeContainer_TriviaThemeContainerChildren

            /* renamed from: com.netflix.model.leafs.originals.interactive.template.$AutoValue_TriviaThemeContainer_TriviaThemeContainerChildren$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<TriviaThemeContainer.TriviaThemeContainerChildren> {
                private final TypeAdapter<ImageElement> backgroundImageAdapter;
                private final TypeAdapter<String> idAdapter;
                private final TypeAdapter<SimpleElement> labelAdapter;
                private final TypeAdapter<String> styleIdAdapter;
                private final TypeAdapter<String> typeAdapter;
                private final TypeAdapter<Map<String, AnimationTemplateId>> visualStateTransitionsAdapter;
                private final TypeAdapter<Map<String, VisualStateDefinition>> visualStatesAdapter;
                private String defaultId = null;
                private String defaultType = null;
                private String defaultStyleId = null;
                private Map<String, AnimationTemplateId> defaultVisualStateTransitions = null;
                private Map<String, VisualStateDefinition> defaultVisualStates = null;
                private ImageElement defaultBackgroundImage = null;
                private SimpleElement defaultLabel = null;

                public GsonTypeAdapter setDefaultBackgroundImage(ImageElement imageElement) {
                    this.defaultBackgroundImage = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultId(String str) {
                    this.defaultId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultLabel(SimpleElement simpleElement) {
                    this.defaultLabel = simpleElement;
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
                    this.backgroundImageAdapter = gson.getAdapter(ImageElement.class);
                    this.labelAdapter = gson.getAdapter(SimpleElement.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, TriviaThemeContainer.TriviaThemeContainerChildren triviaThemeContainerChildren) {
                    if (triviaThemeContainerChildren == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.idAdapter.write(jsonWriter, triviaThemeContainerChildren.id());
                    jsonWriter.name("type");
                    this.typeAdapter.write(jsonWriter, triviaThemeContainerChildren.type());
                    jsonWriter.name("styleId");
                    this.styleIdAdapter.write(jsonWriter, triviaThemeContainerChildren.styleId());
                    jsonWriter.name("visualStateTransitions");
                    this.visualStateTransitionsAdapter.write(jsonWriter, triviaThemeContainerChildren.visualStateTransitions());
                    jsonWriter.name("visualStates");
                    this.visualStatesAdapter.write(jsonWriter, triviaThemeContainerChildren.visualStates());
                    jsonWriter.name("backgroundImage");
                    this.backgroundImageAdapter.write(jsonWriter, triviaThemeContainerChildren.backgroundImage());
                    jsonWriter.name("label");
                    this.labelAdapter.write(jsonWriter, triviaThemeContainerChildren.label());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public TriviaThemeContainer.TriviaThemeContainerChildren read(JsonReader jsonReader) {
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
                    ImageElement imageElement = this.defaultBackgroundImage;
                    SimpleElement simpleElement = this.defaultLabel;
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
                                case 3355:
                                    if (nextName.equals(SignupConstants.Field.LANG_ID)) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3575610:
                                    if (nextName.equals("type")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 102727412:
                                    if (nextName.equals("label")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 951359437:
                                    if (nextName.equals("visualStateTransitions")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1292595405:
                                    if (nextName.equals("backgroundImage")) {
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
                                    str4 = this.idAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    str5 = this.typeAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    simpleElement = this.labelAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    map3 = this.visualStateTransitionsAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    imageElement = this.backgroundImageAdapter.read(jsonReader);
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
                    return new AutoValue_TriviaThemeContainer_TriviaThemeContainerChildren(str4, str5, str6, map3, map4, imageElement, simpleElement);
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
        parcel.writeParcelable(backgroundImage(), i);
        parcel.writeParcelable(label(), i);
    }
}
