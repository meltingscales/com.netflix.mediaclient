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
public final class AutoValue_LayoutTimer extends C$AutoValue_LayoutTimer {
    public static final Parcelable.Creator<AutoValue_LayoutTimer> CREATOR = new Parcelable.Creator<AutoValue_LayoutTimer>() { // from class: com.netflix.model.leafs.originals.interactive.template.AutoValue_LayoutTimer.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_LayoutTimer createFromParcel(Parcel parcel) {
            return new AutoValue_LayoutTimer(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readHashMap(LayoutTimer.class.getClassLoader()), parcel.readHashMap(LayoutTimer.class.getClassLoader()), (LayoutTimer.TimerChildren) parcel.readParcelable(LayoutTimer.class.getClassLoader()), (LayoutTimer.SpriteSheetTimer) parcel.readParcelable(LayoutTimer.class.getClassLoader()), parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_LayoutTimer[] newArray(int i) {
            return new AutoValue_LayoutTimer[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_LayoutTimer(final String str, final String str2, final String str3, final Map<String, AnimationTemplateId> map, final Map<String, VisualStateDefinition> map2, final LayoutTimer.TimerChildren timerChildren, final LayoutTimer.SpriteSheetTimer spriteSheetTimer, final Integer num) {
        new C$$AutoValue_LayoutTimer(str, str2, str3, map, map2, timerChildren, spriteSheetTimer, num) { // from class: com.netflix.model.leafs.originals.interactive.template.$AutoValue_LayoutTimer

            /* renamed from: com.netflix.model.leafs.originals.interactive.template.$AutoValue_LayoutTimer$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<LayoutTimer> {
                private final TypeAdapter<LayoutTimer.TimerChildren> childrenAdapter;
                private final TypeAdapter<String> idAdapter;
                private final TypeAdapter<Integer> maxSecondsForCountdownAdapter;
                private final TypeAdapter<LayoutTimer.SpriteSheetTimer> spritesheetAdapter;
                private final TypeAdapter<String> styleIdAdapter;
                private final TypeAdapter<String> typeAdapter;
                private final TypeAdapter<Map<String, AnimationTemplateId>> visualStateTransitionsAdapter;
                private final TypeAdapter<Map<String, VisualStateDefinition>> visualStatesAdapter;
                private String defaultId = null;
                private String defaultType = null;
                private String defaultStyleId = null;
                private Map<String, AnimationTemplateId> defaultVisualStateTransitions = null;
                private Map<String, VisualStateDefinition> defaultVisualStates = null;
                private LayoutTimer.TimerChildren defaultChildren = null;
                private LayoutTimer.SpriteSheetTimer defaultSpritesheet = null;
                private Integer defaultMaxSecondsForCountdown = null;

                public GsonTypeAdapter setDefaultChildren(LayoutTimer.TimerChildren timerChildren) {
                    this.defaultChildren = timerChildren;
                    return this;
                }

                public GsonTypeAdapter setDefaultId(String str) {
                    this.defaultId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultMaxSecondsForCountdown(Integer num) {
                    this.defaultMaxSecondsForCountdown = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultSpritesheet(LayoutTimer.SpriteSheetTimer spriteSheetTimer) {
                    this.defaultSpritesheet = spriteSheetTimer;
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
                    this.childrenAdapter = gson.getAdapter(LayoutTimer.TimerChildren.class);
                    this.spritesheetAdapter = gson.getAdapter(LayoutTimer.SpriteSheetTimer.class);
                    this.maxSecondsForCountdownAdapter = gson.getAdapter(Integer.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, LayoutTimer layoutTimer) {
                    if (layoutTimer == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.idAdapter.write(jsonWriter, layoutTimer.id());
                    jsonWriter.name("type");
                    this.typeAdapter.write(jsonWriter, layoutTimer.type());
                    jsonWriter.name("styleId");
                    this.styleIdAdapter.write(jsonWriter, layoutTimer.styleId());
                    jsonWriter.name("visualStateTransitions");
                    this.visualStateTransitionsAdapter.write(jsonWriter, layoutTimer.visualStateTransitions());
                    jsonWriter.name("visualStates");
                    this.visualStatesAdapter.write(jsonWriter, layoutTimer.visualStates());
                    jsonWriter.name("children");
                    this.childrenAdapter.write(jsonWriter, layoutTimer.children());
                    jsonWriter.name("spritesheet");
                    this.spritesheetAdapter.write(jsonWriter, layoutTimer.spritesheet());
                    jsonWriter.name("maxSecondsForCountdown");
                    this.maxSecondsForCountdownAdapter.write(jsonWriter, layoutTimer.maxSecondsForCountdown());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public LayoutTimer read(JsonReader jsonReader) {
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
                    LayoutTimer.TimerChildren timerChildren = this.defaultChildren;
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    Map<String, AnimationTemplateId> map3 = map;
                    Map<String, VisualStateDefinition> map4 = map2;
                    LayoutTimer.TimerChildren timerChildren2 = timerChildren;
                    LayoutTimer.SpriteSheetTimer spriteSheetTimer = this.defaultSpritesheet;
                    Integer num = this.defaultMaxSecondsForCountdown;
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
                                case 266620346:
                                    if (nextName.equals("spritesheet")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 314626947:
                                    if (nextName.equals("maxSecondsForCountdown")) {
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
                                case 1659526655:
                                    if (nextName.equals("children")) {
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
                                    str4 = this.idAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    str5 = this.typeAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    spriteSheetTimer = this.spritesheetAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    num = this.maxSecondsForCountdownAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    map3 = this.visualStateTransitionsAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    map4 = this.visualStatesAdapter.read(jsonReader);
                                    continue;
                                case 7:
                                    timerChildren2 = this.childrenAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_LayoutTimer(str4, str5, str6, map3, map4, timerChildren2, spriteSheetTimer, num);
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
        parcel.writeParcelable(spritesheet(), i);
        if (maxSecondsForCountdown() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeInt(maxSecondsForCountdown().intValue());
    }
}
