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
import com.netflix.model.leafs.originals.interactive.template.LayoutTimer;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_LayoutTimer_TimerChildren_TimerBar extends C$AutoValue_LayoutTimer_TimerChildren_TimerBar {
    public static final Parcelable.Creator<AutoValue_LayoutTimer_TimerChildren_TimerBar> CREATOR = new Parcelable.Creator<AutoValue_LayoutTimer_TimerChildren_TimerBar>() { // from class: com.netflix.model.leafs.originals.interactive.template.AutoValue_LayoutTimer_TimerChildren_TimerBar.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_LayoutTimer_TimerChildren_TimerBar createFromParcel(Parcel parcel) {
            return new AutoValue_LayoutTimer_TimerChildren_TimerBar(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readHashMap(LayoutTimer.TimerChildren.TimerBar.class.getClassLoader()), parcel.readHashMap(LayoutTimer.TimerChildren.TimerBar.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, (LayoutTimer.TimerChildren.TimerBar.TimerBarChildren) parcel.readParcelable(LayoutTimer.TimerChildren.TimerBar.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_LayoutTimer_TimerChildren_TimerBar[] newArray(int i) {
            return new AutoValue_LayoutTimer_TimerChildren_TimerBar[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_LayoutTimer_TimerChildren_TimerBar(final String str, final String str2, final String str3, final Map<String, AnimationTemplateId> map, final Map<String, VisualStateDefinition> map2, final String str4, final LayoutTimer.TimerChildren.TimerBar.TimerBarChildren timerBarChildren) {
        new C$$AutoValue_LayoutTimer_TimerChildren_TimerBar(str, str2, str3, map, map2, str4, timerBarChildren) { // from class: com.netflix.model.leafs.originals.interactive.template.$AutoValue_LayoutTimer_TimerChildren_TimerBar

            /* renamed from: com.netflix.model.leafs.originals.interactive.template.$AutoValue_LayoutTimer_TimerChildren_TimerBar$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<LayoutTimer.TimerChildren.TimerBar> {
                private final TypeAdapter<String> assetIdAdapter;
                private final TypeAdapter<LayoutTimer.TimerChildren.TimerBar.TimerBarChildren> childrenAdapter;
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
                private String defaultAssetId = null;
                private LayoutTimer.TimerChildren.TimerBar.TimerBarChildren defaultChildren = null;

                public GsonTypeAdapter setDefaultAssetId(String str) {
                    this.defaultAssetId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultChildren(LayoutTimer.TimerChildren.TimerBar.TimerBarChildren timerBarChildren) {
                    this.defaultChildren = timerBarChildren;
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
                    this.assetIdAdapter = gson.getAdapter(String.class);
                    this.childrenAdapter = gson.getAdapter(LayoutTimer.TimerChildren.TimerBar.TimerBarChildren.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, LayoutTimer.TimerChildren.TimerBar timerBar) {
                    if (timerBar == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.idAdapter.write(jsonWriter, timerBar.id());
                    jsonWriter.name("type");
                    this.typeAdapter.write(jsonWriter, timerBar.type());
                    jsonWriter.name("styleId");
                    this.styleIdAdapter.write(jsonWriter, timerBar.styleId());
                    jsonWriter.name("visualStateTransitions");
                    this.visualStateTransitionsAdapter.write(jsonWriter, timerBar.visualStateTransitions());
                    jsonWriter.name("visualStates");
                    this.visualStatesAdapter.write(jsonWriter, timerBar.visualStates());
                    jsonWriter.name("assetId");
                    this.assetIdAdapter.write(jsonWriter, timerBar.assetId());
                    jsonWriter.name("children");
                    this.childrenAdapter.write(jsonWriter, timerBar.children());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public LayoutTimer.TimerChildren.TimerBar read(JsonReader jsonReader) {
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
                    String str7 = this.defaultAssetId;
                    LayoutTimer.TimerChildren.TimerBar.TimerBarChildren timerBarChildren = this.defaultChildren;
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
                                case -704776149:
                                    if (nextName.equals("assetId")) {
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
                                case 951359437:
                                    if (nextName.equals("visualStateTransitions")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1603916130:
                                    if (nextName.equals("visualStates")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1659526655:
                                    if (nextName.equals("children")) {
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
                                    str7 = this.assetIdAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    str4 = this.idAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    str5 = this.typeAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    map3 = this.visualStateTransitionsAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    map4 = this.visualStatesAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    timerBarChildren = this.childrenAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_LayoutTimer_TimerChildren_TimerBar(str4, str5, str6, map3, map4, str7, timerBarChildren);
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
        if (assetId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(assetId());
        }
        parcel.writeParcelable(children(), i);
    }
}
