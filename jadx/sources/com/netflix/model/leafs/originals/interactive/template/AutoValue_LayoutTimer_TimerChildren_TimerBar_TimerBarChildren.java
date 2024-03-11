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
public final class AutoValue_LayoutTimer_TimerChildren_TimerBar_TimerBarChildren extends C$AutoValue_LayoutTimer_TimerChildren_TimerBar_TimerBarChildren {
    public static final Parcelable.Creator<AutoValue_LayoutTimer_TimerChildren_TimerBar_TimerBarChildren> CREATOR = new Parcelable.Creator<AutoValue_LayoutTimer_TimerChildren_TimerBar_TimerBarChildren>() { // from class: com.netflix.model.leafs.originals.interactive.template.AutoValue_LayoutTimer_TimerChildren_TimerBar_TimerBarChildren.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_LayoutTimer_TimerChildren_TimerBar_TimerBarChildren createFromParcel(Parcel parcel) {
            return new AutoValue_LayoutTimer_TimerChildren_TimerBar_TimerBarChildren(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readHashMap(LayoutTimer.TimerChildren.TimerBar.TimerBarChildren.class.getClassLoader()), parcel.readHashMap(LayoutTimer.TimerChildren.TimerBar.TimerBarChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(LayoutTimer.TimerChildren.TimerBar.TimerBarChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(LayoutTimer.TimerChildren.TimerBar.TimerBarChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(LayoutTimer.TimerChildren.TimerBar.TimerBarChildren.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_LayoutTimer_TimerChildren_TimerBar_TimerBarChildren[] newArray(int i) {
            return new AutoValue_LayoutTimer_TimerChildren_TimerBar_TimerBarChildren[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_LayoutTimer_TimerChildren_TimerBar_TimerBarChildren(final String str, final String str2, final String str3, final Map<String, AnimationTemplateId> map, final Map<String, VisualStateDefinition> map2, final ImageElement imageElement, final ImageElement imageElement2, final ImageElement imageElement3) {
        new C$$AutoValue_LayoutTimer_TimerChildren_TimerBar_TimerBarChildren(str, str2, str3, map, map2, imageElement, imageElement2, imageElement3) { // from class: com.netflix.model.leafs.originals.interactive.template.$AutoValue_LayoutTimer_TimerChildren_TimerBar_TimerBarChildren

            /* renamed from: com.netflix.model.leafs.originals.interactive.template.$AutoValue_LayoutTimer_TimerChildren_TimerBar_TimerBarChildren$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<LayoutTimer.TimerChildren.TimerBar.TimerBarChildren> {
                private final TypeAdapter<ImageElement> fillAdapter;
                private final TypeAdapter<String> idAdapter;
                private final TypeAdapter<ImageElement> leftCapAdapter;
                private final TypeAdapter<ImageElement> rightCapAdapter;
                private final TypeAdapter<String> styleIdAdapter;
                private final TypeAdapter<String> typeAdapter;
                private final TypeAdapter<Map<String, AnimationTemplateId>> visualStateTransitionsAdapter;
                private final TypeAdapter<Map<String, VisualStateDefinition>> visualStatesAdapter;
                private String defaultId = null;
                private String defaultType = null;
                private String defaultStyleId = null;
                private Map<String, AnimationTemplateId> defaultVisualStateTransitions = null;
                private Map<String, VisualStateDefinition> defaultVisualStates = null;
                private ImageElement defaultFill = null;
                private ImageElement defaultLeftCap = null;
                private ImageElement defaultRightCap = null;

                public GsonTypeAdapter setDefaultFill(ImageElement imageElement) {
                    this.defaultFill = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultId(String str) {
                    this.defaultId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultLeftCap(ImageElement imageElement) {
                    this.defaultLeftCap = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultRightCap(ImageElement imageElement) {
                    this.defaultRightCap = imageElement;
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
                    this.fillAdapter = gson.getAdapter(ImageElement.class);
                    this.leftCapAdapter = gson.getAdapter(ImageElement.class);
                    this.rightCapAdapter = gson.getAdapter(ImageElement.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, LayoutTimer.TimerChildren.TimerBar.TimerBarChildren timerBarChildren) {
                    if (timerBarChildren == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.idAdapter.write(jsonWriter, timerBarChildren.id());
                    jsonWriter.name("type");
                    this.typeAdapter.write(jsonWriter, timerBarChildren.type());
                    jsonWriter.name("styleId");
                    this.styleIdAdapter.write(jsonWriter, timerBarChildren.styleId());
                    jsonWriter.name("visualStateTransitions");
                    this.visualStateTransitionsAdapter.write(jsonWriter, timerBarChildren.visualStateTransitions());
                    jsonWriter.name("visualStates");
                    this.visualStatesAdapter.write(jsonWriter, timerBarChildren.visualStates());
                    jsonWriter.name("fill");
                    this.fillAdapter.write(jsonWriter, timerBarChildren.fill());
                    jsonWriter.name("leftCap");
                    this.leftCapAdapter.write(jsonWriter, timerBarChildren.leftCap());
                    jsonWriter.name("rightCap");
                    this.rightCapAdapter.write(jsonWriter, timerBarChildren.rightCap());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public LayoutTimer.TimerChildren.TimerBar.TimerBarChildren read(JsonReader jsonReader) {
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
                    ImageElement imageElement = this.defaultFill;
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    Map<String, AnimationTemplateId> map3 = map;
                    Map<String, VisualStateDefinition> map4 = map2;
                    ImageElement imageElement2 = imageElement;
                    ImageElement imageElement3 = this.defaultLeftCap;
                    ImageElement imageElement4 = this.defaultRightCap;
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
                                case -1436106730:
                                    if (nextName.equals("rightCap")) {
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
                                case 3143043:
                                    if (nextName.equals("fill")) {
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
                                case 55416395:
                                    if (nextName.equals("leftCap")) {
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
                                    imageElement4 = this.rightCapAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    str4 = this.idAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    imageElement2 = this.fillAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    str5 = this.typeAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    imageElement3 = this.leftCapAdapter.read(jsonReader);
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
                    return new AutoValue_LayoutTimer_TimerChildren_TimerBar_TimerBarChildren(str4, str5, str6, map3, map4, imageElement2, imageElement3, imageElement4);
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
        parcel.writeParcelable(fill(), i);
        parcel.writeParcelable(leftCap(), i);
        parcel.writeParcelable(rightCap(), i);
    }
}
