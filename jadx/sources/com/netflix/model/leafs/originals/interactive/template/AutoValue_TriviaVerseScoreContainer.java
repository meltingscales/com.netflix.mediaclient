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
public final class AutoValue_TriviaVerseScoreContainer extends C$AutoValue_TriviaVerseScoreContainer {
    public static final Parcelable.Creator<AutoValue_TriviaVerseScoreContainer> CREATOR = new Parcelable.Creator<AutoValue_TriviaVerseScoreContainer>() { // from class: com.netflix.model.leafs.originals.interactive.template.AutoValue_TriviaVerseScoreContainer.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TriviaVerseScoreContainer createFromParcel(Parcel parcel) {
            return new AutoValue_TriviaVerseScoreContainer(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readHashMap(TriviaVerseScoreContainer.class.getClassLoader()), parcel.readHashMap(TriviaVerseScoreContainer.class.getClassLoader()), (TriviaVerseScoreContainer.ScoreContainerChildren) parcel.readParcelable(TriviaVerseScoreContainer.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TriviaVerseScoreContainer[] newArray(int i) {
            return new AutoValue_TriviaVerseScoreContainer[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_TriviaVerseScoreContainer(final String str, final String str2, final String str3, final Map<String, AnimationTemplateId> map, final Map<String, VisualStateDefinition> map2, final TriviaVerseScoreContainer.ScoreContainerChildren scoreContainerChildren) {
        new C$$AutoValue_TriviaVerseScoreContainer(str, str2, str3, map, map2, scoreContainerChildren) { // from class: com.netflix.model.leafs.originals.interactive.template.$AutoValue_TriviaVerseScoreContainer

            /* renamed from: com.netflix.model.leafs.originals.interactive.template.$AutoValue_TriviaVerseScoreContainer$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<TriviaVerseScoreContainer> {
                private final TypeAdapter<TriviaVerseScoreContainer.ScoreContainerChildren> childrenAdapter;
                private final TypeAdapter<String> idAdapter;
                private final TypeAdapter<String> styleIdAdapter;
                private final TypeAdapter<String> typeAdapter;
                private final TypeAdapter<Map<String, AnimationTemplateId>> visualStateTransitionsAdapter;
                private final TypeAdapter<Map<String, VisualStateDefinition>> visualStatesAdapter;
                private String defaultId = null;
                private String defaultType = null;
                private String defaultStyleId = null;
                private Map<String, AnimationTemplateId> defaultVisualStateTransitions = null;
                private Map<String, VisualStateDefinition> defaultVisualStates = null;
                private TriviaVerseScoreContainer.ScoreContainerChildren defaultChildren = null;

                public GsonTypeAdapter setDefaultChildren(TriviaVerseScoreContainer.ScoreContainerChildren scoreContainerChildren) {
                    this.defaultChildren = scoreContainerChildren;
                    return this;
                }

                public GsonTypeAdapter setDefaultId(String str) {
                    this.defaultId = str;
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
                    this.childrenAdapter = gson.getAdapter(TriviaVerseScoreContainer.ScoreContainerChildren.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, TriviaVerseScoreContainer triviaVerseScoreContainer) {
                    if (triviaVerseScoreContainer == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.idAdapter.write(jsonWriter, triviaVerseScoreContainer.id());
                    jsonWriter.name("type");
                    this.typeAdapter.write(jsonWriter, triviaVerseScoreContainer.type());
                    jsonWriter.name("styleId");
                    this.styleIdAdapter.write(jsonWriter, triviaVerseScoreContainer.styleId());
                    jsonWriter.name("visualStateTransitions");
                    this.visualStateTransitionsAdapter.write(jsonWriter, triviaVerseScoreContainer.visualStateTransitions());
                    jsonWriter.name("visualStates");
                    this.visualStatesAdapter.write(jsonWriter, triviaVerseScoreContainer.visualStates());
                    jsonWriter.name("children");
                    this.childrenAdapter.write(jsonWriter, triviaVerseScoreContainer.children());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public TriviaVerseScoreContainer read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultId;
                    String str2 = this.defaultType;
                    String str3 = this.defaultStyleId;
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    Map<String, AnimationTemplateId> map = this.defaultVisualStateTransitions;
                    Map<String, VisualStateDefinition> map2 = this.defaultVisualStates;
                    TriviaVerseScoreContainer.ScoreContainerChildren scoreContainerChildren = this.defaultChildren;
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
                                case 951359437:
                                    if (nextName.equals("visualStateTransitions")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1603916130:
                                    if (nextName.equals("visualStates")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1659526655:
                                    if (nextName.equals("children")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                str6 = this.styleIdAdapter.read(jsonReader);
                            } else if (c == 1) {
                                str4 = this.idAdapter.read(jsonReader);
                            } else if (c == 2) {
                                str5 = this.typeAdapter.read(jsonReader);
                            } else if (c == 3) {
                                map = this.visualStateTransitionsAdapter.read(jsonReader);
                            } else if (c == 4) {
                                map2 = this.visualStatesAdapter.read(jsonReader);
                            } else if (c == 5) {
                                scoreContainerChildren = this.childrenAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_TriviaVerseScoreContainer(str4, str5, str6, map, map2, scoreContainerChildren);
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
        parcel.writeParcelable(children(), i);
    }
}
