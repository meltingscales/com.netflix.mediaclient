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
import com.netflix.model.leafs.originals.interactive.ImageAssetId;
import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.ElementV2;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_ElementV2 extends C$AutoValue_ElementV2 {
    public static final Parcelable.Creator<AutoValue_ElementV2> CREATOR = new Parcelable.Creator<AutoValue_ElementV2>() { // from class: com.netflix.model.leafs.originals.interactive.template.AutoValue_ElementV2.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ElementV2 createFromParcel(Parcel parcel) {
            return new AutoValue_ElementV2(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readHashMap(ElementV2.class.getClassLoader()), parcel.readHashMap(ElementV2.class.getClassLoader()), (ImageAssetId) parcel.readParcelable(ElementV2.class.getClassLoader()), (ImageAssetId) parcel.readParcelable(ElementV2.class.getClassLoader()), parcel.readArrayList(ElementV2.class.getClassLoader()), parcel.readArrayList(ElementV2.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readHashMap(ElementV2.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ElementV2[] newArray(int i) {
            return new AutoValue_ElementV2[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_ElementV2(final String str, final String str2, final String str3, final Map<String, AnimationTemplateId> map, final Map<String, VisualStateDefinition> map2, final ImageAssetId imageAssetId, final ImageAssetId imageAssetId2, final List<ElementV2> list, final List<ElementV2.ElementV2Override> list2, final String str4, final Map<String, String> map3) {
        new C$$AutoValue_ElementV2(str, str2, str3, map, map2, imageAssetId, imageAssetId2, list, list2, str4, map3) { // from class: com.netflix.model.leafs.originals.interactive.template.$AutoValue_ElementV2

            /* renamed from: com.netflix.model.leafs.originals.interactive.template.$AutoValue_ElementV2$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<ElementV2> {
                private final TypeAdapter<ImageAssetId> backgroundImageAdapter;
                private final TypeAdapter<List<ElementV2>> childrenListAdapter;
                private final TypeAdapter<String> idAdapter;
                private final TypeAdapter<ImageAssetId> imageAdapter;
                private final TypeAdapter<List<ElementV2.ElementV2Override>> overridesAdapter;
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
                private ImageAssetId defaultBackgroundImage = null;
                private ImageAssetId defaultImage = null;
                private List<ElementV2> defaultChildrenList = null;
                private List<ElementV2.ElementV2Override> defaultOverrides = null;
                private String defaultText = null;
                private Map<String, String> defaultPreconditionTokens = null;

                public GsonTypeAdapter setDefaultBackgroundImage(ImageAssetId imageAssetId) {
                    this.defaultBackgroundImage = imageAssetId;
                    return this;
                }

                public GsonTypeAdapter setDefaultChildrenList(List<ElementV2> list) {
                    this.defaultChildrenList = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultId(String str) {
                    this.defaultId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultImage(ImageAssetId imageAssetId) {
                    this.defaultImage = imageAssetId;
                    return this;
                }

                public GsonTypeAdapter setDefaultOverrides(List<ElementV2.ElementV2Override> list) {
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
                    this.backgroundImageAdapter = gson.getAdapter(ImageAssetId.class);
                    this.imageAdapter = gson.getAdapter(ImageAssetId.class);
                    this.childrenListAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, ElementV2.class));
                    this.overridesAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, ElementV2.ElementV2Override.class));
                    this.textAdapter = gson.getAdapter(String.class);
                    this.preconditionTokensAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, String.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, ElementV2 elementV2) {
                    if (elementV2 == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.idAdapter.write(jsonWriter, elementV2.id());
                    jsonWriter.name("type");
                    this.typeAdapter.write(jsonWriter, elementV2.type());
                    jsonWriter.name("styleId");
                    this.styleIdAdapter.write(jsonWriter, elementV2.styleId());
                    jsonWriter.name("visualStateTransitions");
                    this.visualStateTransitionsAdapter.write(jsonWriter, elementV2.visualStateTransitions());
                    jsonWriter.name("visualStates");
                    this.visualStatesAdapter.write(jsonWriter, elementV2.visualStates());
                    jsonWriter.name("backgroundImage");
                    this.backgroundImageAdapter.write(jsonWriter, elementV2.backgroundImage());
                    jsonWriter.name("image");
                    this.imageAdapter.write(jsonWriter, elementV2.image());
                    jsonWriter.name("childrenList");
                    this.childrenListAdapter.write(jsonWriter, elementV2.childrenList());
                    jsonWriter.name("overrides");
                    this.overridesAdapter.write(jsonWriter, elementV2.overrides());
                    jsonWriter.name("text");
                    this.textAdapter.write(jsonWriter, elementV2.text());
                    jsonWriter.name("preconditionTokens");
                    this.preconditionTokensAdapter.write(jsonWriter, elementV2.preconditionTokens());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public ElementV2 read(JsonReader jsonReader) {
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
                    ImageAssetId imageAssetId = this.defaultBackgroundImage;
                    ImageAssetId imageAssetId2 = this.defaultImage;
                    List<ElementV2> list = this.defaultChildrenList;
                    List<ElementV2.ElementV2Override> list2 = this.defaultOverrides;
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    Map<String, AnimationTemplateId> map3 = map;
                    Map<String, VisualStateDefinition> map4 = map2;
                    ImageAssetId imageAssetId3 = imageAssetId;
                    ImageAssetId imageAssetId4 = imageAssetId2;
                    List<ElementV2> list3 = list;
                    List<ElementV2.ElementV2Override> list4 = list2;
                    String str7 = this.defaultText;
                    Map<String, String> map5 = this.defaultPreconditionTokens;
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
                                case 100313435:
                                    if (nextName.equals("image")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 178350909:
                                    if (nextName.equals("childrenList")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 951359437:
                                    if (nextName.equals("visualStateTransitions")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1292595405:
                                    if (nextName.equals("backgroundImage")) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1603916130:
                                    if (nextName.equals("visualStates")) {
                                        c = '\n';
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
                                    list4 = this.overridesAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    str4 = this.idAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    str7 = this.textAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    str5 = this.typeAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    map5 = this.preconditionTokensAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    imageAssetId4 = this.imageAdapter.read(jsonReader);
                                    continue;
                                case 7:
                                    list3 = this.childrenListAdapter.read(jsonReader);
                                    continue;
                                case '\b':
                                    map3 = this.visualStateTransitionsAdapter.read(jsonReader);
                                    continue;
                                case '\t':
                                    imageAssetId3 = this.backgroundImageAdapter.read(jsonReader);
                                    continue;
                                case '\n':
                                    map4 = this.visualStatesAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_ElementV2(str4, str5, str6, map3, map4, imageAssetId3, imageAssetId4, list3, list4, str7, map5);
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
        parcel.writeParcelable(image(), i);
        parcel.writeList(childrenList());
        parcel.writeList(overrides());
        if (text() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(text());
        }
        parcel.writeMap(preconditionTokens());
    }
}
