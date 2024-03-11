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
import com.netflix.model.leafs.originals.interactive.template.TriviaVerseScoreContainer;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_TriviaVerseScoreContainer_ScoreContainerChildren extends C$AutoValue_TriviaVerseScoreContainer_ScoreContainerChildren {
    public static final Parcelable.Creator<AutoValue_TriviaVerseScoreContainer_ScoreContainerChildren> CREATOR = new Parcelable.Creator<AutoValue_TriviaVerseScoreContainer_ScoreContainerChildren>() { // from class: com.netflix.model.leafs.originals.interactive.template.AutoValue_TriviaVerseScoreContainer_ScoreContainerChildren.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TriviaVerseScoreContainer_ScoreContainerChildren createFromParcel(Parcel parcel) {
            return new AutoValue_TriviaVerseScoreContainer_ScoreContainerChildren(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readHashMap(TriviaVerseScoreContainer.ScoreContainerChildren.class.getClassLoader()), parcel.readHashMap(TriviaVerseScoreContainer.ScoreContainerChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(TriviaVerseScoreContainer.ScoreContainerChildren.class.getClassLoader()), (SimpleElement) parcel.readParcelable(TriviaVerseScoreContainer.ScoreContainerChildren.class.getClassLoader()), (SimpleElement) parcel.readParcelable(TriviaVerseScoreContainer.ScoreContainerChildren.class.getClassLoader()), (SimpleElement) parcel.readParcelable(TriviaVerseScoreContainer.ScoreContainerChildren.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TriviaVerseScoreContainer_ScoreContainerChildren[] newArray(int i) {
            return new AutoValue_TriviaVerseScoreContainer_ScoreContainerChildren[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_TriviaVerseScoreContainer_ScoreContainerChildren(final String str, final String str2, final String str3, final Map<String, AnimationTemplateId> map, final Map<String, VisualStateDefinition> map2, final ImageElement imageElement, final SimpleElement simpleElement, final SimpleElement simpleElement2, final SimpleElement simpleElement3) {
        new C$$AutoValue_TriviaVerseScoreContainer_ScoreContainerChildren(str, str2, str3, map, map2, imageElement, simpleElement, simpleElement2, simpleElement3) { // from class: com.netflix.model.leafs.originals.interactive.template.$AutoValue_TriviaVerseScoreContainer_ScoreContainerChildren

            /* renamed from: com.netflix.model.leafs.originals.interactive.template.$AutoValue_TriviaVerseScoreContainer_ScoreContainerChildren$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<TriviaVerseScoreContainer.ScoreContainerChildren> {
                private final TypeAdapter<ImageElement> backgroundImageAdapter;
                private final TypeAdapter<String> idAdapter;
                private final TypeAdapter<SimpleElement> labelContainerAdapter;
                private final TypeAdapter<SimpleElement> maxScoreAdapter;
                private final TypeAdapter<SimpleElement> scoreAdapter;
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
                private SimpleElement defaultLabelContainer = null;
                private SimpleElement defaultScore = null;
                private SimpleElement defaultMaxScore = null;

                public GsonTypeAdapter setDefaultBackgroundImage(ImageElement imageElement) {
                    this.defaultBackgroundImage = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultId(String str) {
                    this.defaultId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultLabelContainer(SimpleElement simpleElement) {
                    this.defaultLabelContainer = simpleElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultMaxScore(SimpleElement simpleElement) {
                    this.defaultMaxScore = simpleElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultScore(SimpleElement simpleElement) {
                    this.defaultScore = simpleElement;
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
                    this.labelContainerAdapter = gson.getAdapter(SimpleElement.class);
                    this.scoreAdapter = gson.getAdapter(SimpleElement.class);
                    this.maxScoreAdapter = gson.getAdapter(SimpleElement.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, TriviaVerseScoreContainer.ScoreContainerChildren scoreContainerChildren) {
                    if (scoreContainerChildren == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.idAdapter.write(jsonWriter, scoreContainerChildren.id());
                    jsonWriter.name("type");
                    this.typeAdapter.write(jsonWriter, scoreContainerChildren.type());
                    jsonWriter.name("styleId");
                    this.styleIdAdapter.write(jsonWriter, scoreContainerChildren.styleId());
                    jsonWriter.name("visualStateTransitions");
                    this.visualStateTransitionsAdapter.write(jsonWriter, scoreContainerChildren.visualStateTransitions());
                    jsonWriter.name("visualStates");
                    this.visualStatesAdapter.write(jsonWriter, scoreContainerChildren.visualStates());
                    jsonWriter.name("backgroundImage");
                    this.backgroundImageAdapter.write(jsonWriter, scoreContainerChildren.backgroundImage());
                    jsonWriter.name("labelContainer");
                    this.labelContainerAdapter.write(jsonWriter, scoreContainerChildren.labelContainer());
                    jsonWriter.name("score");
                    this.scoreAdapter.write(jsonWriter, scoreContainerChildren.score());
                    jsonWriter.name("maxScore");
                    this.maxScoreAdapter.write(jsonWriter, scoreContainerChildren.maxScore());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public TriviaVerseScoreContainer.ScoreContainerChildren read(JsonReader jsonReader) {
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
                    ImageElement imageElement = this.defaultBackgroundImage;
                    SimpleElement simpleElement = this.defaultLabelContainer;
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    Map<String, AnimationTemplateId> map3 = map;
                    Map<String, VisualStateDefinition> map4 = map2;
                    ImageElement imageElement2 = imageElement;
                    SimpleElement simpleElement2 = simpleElement;
                    SimpleElement simpleElement3 = this.defaultScore;
                    SimpleElement simpleElement4 = this.defaultMaxScore;
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
                                case -949911571:
                                    if (nextName.equals("labelContainer")) {
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
                                case 109264530:
                                    if (nextName.equals("score")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 396519310:
                                    if (nextName.equals("maxScore")) {
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
                                case 1292595405:
                                    if (nextName.equals("backgroundImage")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1603916130:
                                    if (nextName.equals("visualStates")) {
                                        c = '\b';
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
                                    simpleElement2 = this.labelContainerAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    str4 = this.idAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    str5 = this.typeAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    simpleElement3 = this.scoreAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    simpleElement4 = this.maxScoreAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    map3 = this.visualStateTransitionsAdapter.read(jsonReader);
                                    continue;
                                case 7:
                                    imageElement2 = this.backgroundImageAdapter.read(jsonReader);
                                    continue;
                                case '\b':
                                    map4 = this.visualStatesAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_TriviaVerseScoreContainer_ScoreContainerChildren(str4, str5, str6, map3, map4, imageElement2, simpleElement2, simpleElement3, simpleElement4);
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
        parcel.writeParcelable(labelContainer(), i);
        parcel.writeParcelable(score(), i);
        parcel.writeParcelable(maxScore(), i);
    }
}
