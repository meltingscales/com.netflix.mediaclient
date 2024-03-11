package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.UiDefinition;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import com.netflix.model.leafs.originals.interactive.animations.TransitionDefinitions;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UiDefinition_Layout extends C$AutoValue_UiDefinition_Layout {
    public static final Parcelable.Creator<AutoValue_UiDefinition_Layout> CREATOR = new Parcelable.Creator<AutoValue_UiDefinition_Layout>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_UiDefinition_Layout.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UiDefinition_Layout createFromParcel(Parcel parcel) {
            return new AutoValue_UiDefinition_Layout((StringsObject) parcel.readParcelable(UiDefinition.Layout.class.getClassLoader()), (UiDefinition.Layout.Config) parcel.readParcelable(UiDefinition.Layout.class.getClassLoader()), (UiDefinition.Layout.Elements) parcel.readParcelable(UiDefinition.Layout.class.getClassLoader()), parcel.readHashMap(UiDefinition.Layout.class.getClassLoader()), parcel.readHashMap(UiDefinition.Layout.class.getClassLoader()), parcel.readHashMap(UiDefinition.Layout.class.getClassLoader()), (AssetManifest) parcel.readParcelable(UiDefinition.Layout.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UiDefinition_Layout[] newArray(int i) {
            return new AutoValue_UiDefinition_Layout[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_UiDefinition_Layout(StringsObject stringsObject, UiDefinition.Layout.Config config, UiDefinition.Layout.Elements elements, Map<String, TransitionDefinitions> map, Map<String, Map<String, List<InteractiveAnimation>>> map2, Map<String, UiDefinition.AudioListAsset> map3, AssetManifest assetManifest) {
        new C$$AutoValue_UiDefinition_Layout(stringsObject, config, elements, map, map2, map3, assetManifest) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_UiDefinition_Layout

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_UiDefinition_Layout$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<UiDefinition.Layout> {
                private final TypeAdapter<Map<String, UiDefinition.AudioListAsset>> audioAdapter;
                private final TypeAdapter<UiDefinition.Layout.Config> configAdapter;
                private final TypeAdapter<Map<String, Map<String, List<InteractiveAnimation>>>> elementAnimationsAdapter;
                private final TypeAdapter<UiDefinition.Layout.Elements> elementsAdapter;
                private final TypeAdapter<Map<String, TransitionDefinitions>> visualStateTransitionDefinitionsAdapter;
                private StringsObject defaultInteractiveStrings = null;
                private UiDefinition.Layout.Config defaultConfig = null;
                private UiDefinition.Layout.Elements defaultElements = null;
                private Map<String, TransitionDefinitions> defaultVisualStateTransitionDefinitions = null;
                private Map<String, Map<String, List<InteractiveAnimation>>> defaultElementAnimations = null;
                private Map<String, UiDefinition.AudioListAsset> defaultAudio = null;
                private AssetManifest defaultAssetManifest = null;
                private final TypeAdapter<StringsObject> interactiveStringsAdapter = new InteractiveStringsAdapter();
                private final TypeAdapter<AssetManifest> assetManifestAdapter = new AssetManifestAdapter();

                public GsonTypeAdapter setDefaultAssetManifest(AssetManifest assetManifest) {
                    this.defaultAssetManifest = assetManifest;
                    return this;
                }

                public GsonTypeAdapter setDefaultAudio(Map<String, UiDefinition.AudioListAsset> map) {
                    this.defaultAudio = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultConfig(UiDefinition.Layout.Config config) {
                    this.defaultConfig = config;
                    return this;
                }

                public GsonTypeAdapter setDefaultElementAnimations(Map<String, Map<String, List<InteractiveAnimation>>> map) {
                    this.defaultElementAnimations = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultElements(UiDefinition.Layout.Elements elements) {
                    this.defaultElements = elements;
                    return this;
                }

                public GsonTypeAdapter setDefaultInteractiveStrings(StringsObject stringsObject) {
                    this.defaultInteractiveStrings = stringsObject;
                    return this;
                }

                public GsonTypeAdapter setDefaultVisualStateTransitionDefinitions(Map<String, TransitionDefinitions> map) {
                    this.defaultVisualStateTransitionDefinitions = map;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.configAdapter = gson.getAdapter(UiDefinition.Layout.Config.class);
                    this.elementsAdapter = gson.getAdapter(UiDefinition.Layout.Elements.class);
                    this.visualStateTransitionDefinitionsAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, TransitionDefinitions.class));
                    this.elementAnimationsAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, TypeToken.getParameterized(Map.class, String.class, TypeToken.getParameterized(List.class, InteractiveAnimation.class).getType()).getType()));
                    this.audioAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, UiDefinition.AudioListAsset.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, UiDefinition.Layout layout) {
                    if (layout == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("strings");
                    this.interactiveStringsAdapter.write(jsonWriter, layout.interactiveStrings());
                    jsonWriter.name("config");
                    this.configAdapter.write(jsonWriter, layout.config());
                    jsonWriter.name("elements");
                    this.elementsAdapter.write(jsonWriter, layout.elements());
                    jsonWriter.name("visualStateTransitionDefinitions");
                    this.visualStateTransitionDefinitionsAdapter.write(jsonWriter, layout.visualStateTransitionDefinitions());
                    jsonWriter.name("elementAnimations");
                    this.elementAnimationsAdapter.write(jsonWriter, layout.elementAnimations());
                    jsonWriter.name("audio");
                    this.audioAdapter.write(jsonWriter, layout.audio());
                    jsonWriter.name("assetManifest");
                    this.assetManifestAdapter.write(jsonWriter, layout.assetManifest());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public UiDefinition.Layout read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    StringsObject stringsObject = this.defaultInteractiveStrings;
                    UiDefinition.Layout.Config config = this.defaultConfig;
                    UiDefinition.Layout.Elements elements = this.defaultElements;
                    Map<String, TransitionDefinitions> map = this.defaultVisualStateTransitionDefinitions;
                    Map<String, Map<String, List<InteractiveAnimation>>> map2 = this.defaultElementAnimations;
                    StringsObject stringsObject2 = stringsObject;
                    UiDefinition.Layout.Config config2 = config;
                    UiDefinition.Layout.Elements elements2 = elements;
                    Map<String, TransitionDefinitions> map3 = map;
                    Map<String, Map<String, List<InteractiveAnimation>>> map4 = map2;
                    Map<String, UiDefinition.AudioListAsset> map5 = this.defaultAudio;
                    AssetManifest assetManifest = this.defaultAssetManifest;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1881759102:
                                    if (nextName.equals("strings")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1354792126:
                                    if (nextName.equals("config")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -8339209:
                                    if (nextName.equals("elements")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 79676811:
                                    if (nextName.equals("elementAnimations")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 93166550:
                                    if (nextName.equals("audio")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 915524666:
                                    if (nextName.equals("visualStateTransitionDefinitions")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1389268287:
                                    if (nextName.equals("assetManifest")) {
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
                                    stringsObject2 = this.interactiveStringsAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    config2 = this.configAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    elements2 = this.elementsAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    map4 = this.elementAnimationsAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    map5 = this.audioAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    map3 = this.visualStateTransitionDefinitionsAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    assetManifest = this.assetManifestAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_UiDefinition_Layout(stringsObject2, config2, elements2, map3, map4, map5, assetManifest);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(interactiveStrings(), i);
        parcel.writeParcelable(config(), i);
        parcel.writeParcelable(elements(), i);
        parcel.writeMap(visualStateTransitionDefinitions());
        parcel.writeMap(elementAnimations());
        parcel.writeMap(audio());
        parcel.writeParcelable(assetManifest(), i);
    }
}
