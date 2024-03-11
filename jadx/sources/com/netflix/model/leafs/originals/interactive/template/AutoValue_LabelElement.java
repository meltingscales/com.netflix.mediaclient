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
import com.netflix.model.leafs.originals.interactive.template.LabelElement;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_LabelElement extends C$AutoValue_LabelElement {
    public static final Parcelable.Creator<AutoValue_LabelElement> CREATOR = new Parcelable.Creator<AutoValue_LabelElement>() { // from class: com.netflix.model.leafs.originals.interactive.template.AutoValue_LabelElement.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_LabelElement createFromParcel(Parcel parcel) {
            return new AutoValue_LabelElement(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readHashMap(LabelElement.class.getClassLoader()), parcel.readHashMap(LabelElement.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readHashMap(LabelElement.class.getClassLoader()), parcel.readArrayList(LabelElement.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_LabelElement[] newArray(int i) {
            return new AutoValue_LabelElement[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_LabelElement(String str, String str2, String str3, Map<String, AnimationTemplateId> map, Map<String, VisualStateDefinition> map2, String str4, Map<String, String> map3, List<LabelElement.LabelElementOverride> list) {
        new C$$AutoValue_LabelElement(str, str2, str3, map, map2, str4, map3, list) { // from class: com.netflix.model.leafs.originals.interactive.template.$AutoValue_LabelElement

            /* renamed from: com.netflix.model.leafs.originals.interactive.template.$AutoValue_LabelElement$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<LabelElement> {
                private final TypeAdapter<String> idAdapter;
                private final TypeAdapter<List<LabelElement.LabelElementOverride>> overridesAdapter;
                private final TypeAdapter<Map<String, String>> preconditionTokensAdapter;
                private final TypeAdapter<String> styleIdAdapter;
                private final TypeAdapter<String> textAdapter;
                private final TypeAdapter<String> typeAdapter;
                private final TypeAdapter<Map<String, AnimationTemplateId>> visualStateTransitionsAdapter;
                private final TypeAdapter<Map<String, VisualStateDefinition>> visualStatesAdapter;
                private String defaultId = null;
                private String defaultType = null;
                private String defaultStyleId = null;
                private Map<String, AnimationTemplateId> defaultVisualStateTransitions = null;
                private Map<String, VisualStateDefinition> defaultVisualStates = null;
                private String defaultText = null;
                private Map<String, String> defaultPreconditionTokens = null;
                private List<LabelElement.LabelElementOverride> defaultOverrides = null;

                public GsonTypeAdapter setDefaultId(String str) {
                    this.defaultId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultOverrides(List<LabelElement.LabelElementOverride> list) {
                    this.defaultOverrides = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultPreconditionTokens(Map<String, String> map) {
                    this.defaultPreconditionTokens = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultStyleId(String str) {
                    this.defaultStyleId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultText(String str) {
                    this.defaultText = str;
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
                    this.textAdapter = gson.getAdapter(String.class);
                    this.preconditionTokensAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, String.class));
                    this.overridesAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, LabelElement.LabelElementOverride.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, LabelElement labelElement) {
                    if (labelElement == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.idAdapter.write(jsonWriter, labelElement.id());
                    jsonWriter.name("type");
                    this.typeAdapter.write(jsonWriter, labelElement.type());
                    jsonWriter.name("styleId");
                    this.styleIdAdapter.write(jsonWriter, labelElement.styleId());
                    jsonWriter.name("visualStateTransitions");
                    this.visualStateTransitionsAdapter.write(jsonWriter, labelElement.visualStateTransitions());
                    jsonWriter.name("visualStates");
                    this.visualStatesAdapter.write(jsonWriter, labelElement.visualStates());
                    jsonWriter.name("text");
                    this.textAdapter.write(jsonWriter, labelElement.text());
                    jsonWriter.name("preconditionTokens");
                    this.preconditionTokensAdapter.write(jsonWriter, labelElement.preconditionTokens());
                    jsonWriter.name("overrides");
                    this.overridesAdapter.write(jsonWriter, labelElement.overrides());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public LabelElement read(JsonReader jsonReader) {
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
                    String str4 = this.defaultText;
                    String str5 = str;
                    String str6 = str2;
                    String str7 = str3;
                    Map<String, AnimationTemplateId> map3 = map;
                    Map<String, VisualStateDefinition> map4 = map2;
                    String str8 = str4;
                    Map<String, String> map5 = this.defaultPreconditionTokens;
                    List<LabelElement.LabelElementOverride> list = this.defaultOverrides;
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
                                case -749969881:
                                    if (nextName.equals("overrides")) {
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
                                case 3556653:
                                    if (nextName.equals("text")) {
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
                                case 85307794:
                                    if (nextName.equals("preconditionTokens")) {
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
                                    str7 = this.styleIdAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    list = this.overridesAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    str5 = this.idAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    str8 = this.textAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    str6 = this.typeAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    map5 = this.preconditionTokensAdapter.read(jsonReader);
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
                    return new AutoValue_LabelElement(str5, str6, str7, map3, map4, str8, map5, list);
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
        if (text() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(text());
        }
        parcel.writeMap(preconditionTokens());
        parcel.writeList(overrides());
    }
}
