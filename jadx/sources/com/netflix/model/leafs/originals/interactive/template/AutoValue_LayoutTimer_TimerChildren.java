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
public final class AutoValue_LayoutTimer_TimerChildren extends C$AutoValue_LayoutTimer_TimerChildren {
    public static final Parcelable.Creator<AutoValue_LayoutTimer_TimerChildren> CREATOR = new Parcelable.Creator<AutoValue_LayoutTimer_TimerChildren>() { // from class: com.netflix.model.leafs.originals.interactive.template.AutoValue_LayoutTimer_TimerChildren.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_LayoutTimer_TimerChildren createFromParcel(Parcel parcel) {
            return new AutoValue_LayoutTimer_TimerChildren(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readHashMap(LayoutTimer.TimerChildren.class.getClassLoader()), parcel.readHashMap(LayoutTimer.TimerChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(LayoutTimer.TimerChildren.class.getClassLoader()), (LayoutTimer.TimerChildren.TimerBar) parcel.readParcelable(LayoutTimer.TimerChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(LayoutTimer.TimerChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(LayoutTimer.TimerChildren.class.getClassLoader()), (SimpleElement) parcel.readParcelable(LayoutTimer.TimerChildren.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_LayoutTimer_TimerChildren[] newArray(int i) {
            return new AutoValue_LayoutTimer_TimerChildren[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_LayoutTimer_TimerChildren(final String str, final String str2, final String str3, final Map<String, AnimationTemplateId> map, final Map<String, VisualStateDefinition> map2, final ImageElement imageElement, final LayoutTimer.TimerChildren.TimerBar timerBar, final ImageElement imageElement2, final ImageElement imageElement3, final SimpleElement simpleElement) {
        new C$$AutoValue_LayoutTimer_TimerChildren(str, str2, str3, map, map2, imageElement, timerBar, imageElement2, imageElement3, simpleElement) { // from class: com.netflix.model.leafs.originals.interactive.template.$AutoValue_LayoutTimer_TimerChildren

            /* renamed from: com.netflix.model.leafs.originals.interactive.template.$AutoValue_LayoutTimer_TimerChildren$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<LayoutTimer.TimerChildren> {
                private final TypeAdapter<ImageElement> backgroundAdapter;
                private final TypeAdapter<SimpleElement> countdownLabelAdapter;
                private final TypeAdapter<ImageElement> deviceIconAdapter;
                private final TypeAdapter<LayoutTimer.TimerChildren.TimerBar> fillContainerAdapter;
                private final TypeAdapter<String> idAdapter;
                private final TypeAdapter<ImageElement> overlayAdapter;
                private final TypeAdapter<String> styleIdAdapter;
                private final TypeAdapter<String> typeAdapter;
                private final TypeAdapter<Map<String, AnimationTemplateId>> visualStateTransitionsAdapter;
                private final TypeAdapter<Map<String, VisualStateDefinition>> visualStatesAdapter;
                private String defaultId = null;
                private String defaultType = null;
                private String defaultStyleId = null;
                private Map<String, AnimationTemplateId> defaultVisualStateTransitions = null;
                private Map<String, VisualStateDefinition> defaultVisualStates = null;
                private ImageElement defaultBackground = null;
                private LayoutTimer.TimerChildren.TimerBar defaultFillContainer = null;
                private ImageElement defaultOverlay = null;
                private ImageElement defaultDeviceIcon = null;
                private SimpleElement defaultCountdownLabel = null;

                public GsonTypeAdapter setDefaultBackground(ImageElement imageElement) {
                    this.defaultBackground = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultCountdownLabel(SimpleElement simpleElement) {
                    this.defaultCountdownLabel = simpleElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultDeviceIcon(ImageElement imageElement) {
                    this.defaultDeviceIcon = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultFillContainer(LayoutTimer.TimerChildren.TimerBar timerBar) {
                    this.defaultFillContainer = timerBar;
                    return this;
                }

                public GsonTypeAdapter setDefaultId(String str) {
                    this.defaultId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultOverlay(ImageElement imageElement) {
                    this.defaultOverlay = imageElement;
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
                    this.backgroundAdapter = gson.getAdapter(ImageElement.class);
                    this.fillContainerAdapter = gson.getAdapter(LayoutTimer.TimerChildren.TimerBar.class);
                    this.overlayAdapter = gson.getAdapter(ImageElement.class);
                    this.deviceIconAdapter = gson.getAdapter(ImageElement.class);
                    this.countdownLabelAdapter = gson.getAdapter(SimpleElement.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, LayoutTimer.TimerChildren timerChildren) {
                    if (timerChildren == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.idAdapter.write(jsonWriter, timerChildren.id());
                    jsonWriter.name("type");
                    this.typeAdapter.write(jsonWriter, timerChildren.type());
                    jsonWriter.name("styleId");
                    this.styleIdAdapter.write(jsonWriter, timerChildren.styleId());
                    jsonWriter.name("visualStateTransitions");
                    this.visualStateTransitionsAdapter.write(jsonWriter, timerChildren.visualStateTransitions());
                    jsonWriter.name("visualStates");
                    this.visualStatesAdapter.write(jsonWriter, timerChildren.visualStates());
                    jsonWriter.name("background");
                    this.backgroundAdapter.write(jsonWriter, timerChildren.background());
                    jsonWriter.name("fillContainer");
                    this.fillContainerAdapter.write(jsonWriter, timerChildren.fillContainer());
                    jsonWriter.name("overlay");
                    this.overlayAdapter.write(jsonWriter, timerChildren.overlay());
                    jsonWriter.name("deviceIcon");
                    this.deviceIconAdapter.write(jsonWriter, timerChildren.deviceIcon());
                    jsonWriter.name("countdownLabel");
                    this.countdownLabelAdapter.write(jsonWriter, timerChildren.countdownLabel());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public LayoutTimer.TimerChildren read(JsonReader jsonReader) {
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
                    ImageElement imageElement = this.defaultBackground;
                    LayoutTimer.TimerChildren.TimerBar timerBar = this.defaultFillContainer;
                    ImageElement imageElement2 = this.defaultOverlay;
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    Map<String, AnimationTemplateId> map3 = map;
                    Map<String, VisualStateDefinition> map4 = map2;
                    ImageElement imageElement3 = imageElement;
                    LayoutTimer.TimerChildren.TimerBar timerBar2 = timerBar;
                    ImageElement imageElement4 = imageElement2;
                    ImageElement imageElement5 = this.defaultDeviceIcon;
                    SimpleElement simpleElement = this.defaultCountdownLabel;
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
                                case -1091287984:
                                    if (nextName.equals("overlay")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3355:
                                    if (nextName.equals(SignupConstants.Field.LANG_ID)) {
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
                                case 780841967:
                                    if (nextName.equals("deviceIcon")) {
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
                                case 1069969219:
                                    if (nextName.equals("countdownLabel")) {
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
                                case 1853618750:
                                    if (nextName.equals("fillContainer")) {
                                        c = '\t';
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
                                    imageElement3 = this.backgroundAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    imageElement4 = this.overlayAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    str4 = this.idAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    str5 = this.typeAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    imageElement5 = this.deviceIconAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    map3 = this.visualStateTransitionsAdapter.read(jsonReader);
                                    continue;
                                case 7:
                                    simpleElement = this.countdownLabelAdapter.read(jsonReader);
                                    continue;
                                case '\b':
                                    map4 = this.visualStatesAdapter.read(jsonReader);
                                    continue;
                                case '\t':
                                    timerBar2 = this.fillContainerAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_LayoutTimer_TimerChildren(str4, str5, str6, map3, map4, imageElement3, timerBar2, imageElement4, imageElement5, simpleElement);
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
        parcel.writeParcelable(background(), i);
        parcel.writeParcelable(fillContainer(), i);
        parcel.writeParcelable(overlay(), i);
        parcel.writeParcelable(deviceIcon(), i);
        parcel.writeParcelable(countdownLabel(), i);
    }
}
