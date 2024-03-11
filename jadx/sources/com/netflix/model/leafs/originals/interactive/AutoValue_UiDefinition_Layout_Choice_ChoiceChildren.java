package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.UiDefinition;
import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.ImageElement;
import com.netflix.model.leafs.originals.interactive.template.SimpleElement;
import com.netflix.model.leafs.originals.interactive.template.ToolTipElement;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UiDefinition_Layout_Choice_ChoiceChildren extends C$AutoValue_UiDefinition_Layout_Choice_ChoiceChildren {
    public static final Parcelable.Creator<AutoValue_UiDefinition_Layout_Choice_ChoiceChildren> CREATOR = new Parcelable.Creator<AutoValue_UiDefinition_Layout_Choice_ChoiceChildren>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_UiDefinition_Layout_Choice_ChoiceChildren.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UiDefinition_Layout_Choice_ChoiceChildren createFromParcel(Parcel parcel) {
            return new AutoValue_UiDefinition_Layout_Choice_ChoiceChildren(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readHashMap(UiDefinition.Layout.Choice.ChoiceChildren.class.getClassLoader()), parcel.readHashMap(UiDefinition.Layout.Choice.ChoiceChildren.class.getClassLoader()), (SimpleElement) parcel.readParcelable(UiDefinition.Layout.Choice.ChoiceChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(UiDefinition.Layout.Choice.ChoiceChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(UiDefinition.Layout.Choice.ChoiceChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(UiDefinition.Layout.Choice.ChoiceChildren.class.getClassLoader()), (SimpleElement) parcel.readParcelable(UiDefinition.Layout.Choice.ChoiceChildren.class.getClassLoader()), (ToolTipElement) parcel.readParcelable(UiDefinition.Layout.Choice.ChoiceChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(UiDefinition.Layout.Choice.ChoiceChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(UiDefinition.Layout.Choice.ChoiceChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(UiDefinition.Layout.Choice.ChoiceChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(UiDefinition.Layout.Choice.ChoiceChildren.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UiDefinition_Layout_Choice_ChoiceChildren[] newArray(int i) {
            return new AutoValue_UiDefinition_Layout_Choice_ChoiceChildren[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_UiDefinition_Layout_Choice_ChoiceChildren(final String str, final String str2, final String str3, final Map<String, AnimationTemplateId> map, final Map<String, VisualStateDefinition> map2, final SimpleElement simpleElement, final ImageElement imageElement, final ImageElement imageElement2, final ImageElement imageElement3, final SimpleElement simpleElement2, final ToolTipElement toolTipElement, final ImageElement imageElement4, final ImageElement imageElement5, final ImageElement imageElement6, final ImageElement imageElement7) {
        new C$$AutoValue_UiDefinition_Layout_Choice_ChoiceChildren(str, str2, str3, map, map2, simpleElement, imageElement, imageElement2, imageElement3, simpleElement2, toolTipElement, imageElement4, imageElement5, imageElement6, imageElement7) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_UiDefinition_Layout_Choice_ChoiceChildren

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_UiDefinition_Layout_Choice_ChoiceChildren$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<UiDefinition.Layout.Choice.ChoiceChildren> {
                private final TypeAdapter<ImageElement> accessoryViewAdapter;
                private final TypeAdapter<ImageElement> backgroundAdapter;
                private final TypeAdapter<ImageElement> foregroundAdapter;
                private final TypeAdapter<ImageElement> foregroundMaskAdapter;
                private final TypeAdapter<ImageElement> iconAdapter;
                private final TypeAdapter<String> idAdapter;
                private final TypeAdapter<SimpleElement> labelAdapter;
                private final TypeAdapter<ImageElement> scrimAdapter;
                private final TypeAdapter<String> styleIdAdapter;
                private final TypeAdapter<ToolTipElement> tooltipContainerAdapter;
                private final TypeAdapter<String> typeAdapter;
                private final TypeAdapter<ImageElement> underlineAdapter;
                private final TypeAdapter<SimpleElement> valueLabelAdapter;
                private final TypeAdapter<Map<String, AnimationTemplateId>> visualStateTransitionsAdapter;
                private final TypeAdapter<Map<String, VisualStateDefinition>> visualStatesAdapter;
                private String defaultId = null;
                private String defaultType = null;
                private String defaultStyleId = null;
                private Map<String, AnimationTemplateId> defaultVisualStateTransitions = null;
                private Map<String, VisualStateDefinition> defaultVisualStates = null;
                private SimpleElement defaultLabel = null;
                private ImageElement defaultIcon = null;
                private ImageElement defaultBackground = null;
                private ImageElement defaultUnderline = null;
                private SimpleElement defaultValueLabel = null;
                private ToolTipElement defaultTooltipContainer = null;
                private ImageElement defaultForeground = null;
                private ImageElement defaultForegroundMask = null;
                private ImageElement defaultScrim = null;
                private ImageElement defaultAccessoryView = null;

                public GsonTypeAdapter setDefaultAccessoryView(ImageElement imageElement) {
                    this.defaultAccessoryView = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultBackground(ImageElement imageElement) {
                    this.defaultBackground = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultForeground(ImageElement imageElement) {
                    this.defaultForeground = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultForegroundMask(ImageElement imageElement) {
                    this.defaultForegroundMask = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultIcon(ImageElement imageElement) {
                    this.defaultIcon = imageElement;
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

                public GsonTypeAdapter setDefaultScrim(ImageElement imageElement) {
                    this.defaultScrim = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultStyleId(String str) {
                    this.defaultStyleId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultTooltipContainer(ToolTipElement toolTipElement) {
                    this.defaultTooltipContainer = toolTipElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultType(String str) {
                    this.defaultType = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultUnderline(ImageElement imageElement) {
                    this.defaultUnderline = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultValueLabel(SimpleElement simpleElement) {
                    this.defaultValueLabel = simpleElement;
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
                    this.labelAdapter = gson.getAdapter(SimpleElement.class);
                    this.iconAdapter = gson.getAdapter(ImageElement.class);
                    this.backgroundAdapter = gson.getAdapter(ImageElement.class);
                    this.underlineAdapter = gson.getAdapter(ImageElement.class);
                    this.valueLabelAdapter = gson.getAdapter(SimpleElement.class);
                    this.tooltipContainerAdapter = gson.getAdapter(ToolTipElement.class);
                    this.foregroundAdapter = gson.getAdapter(ImageElement.class);
                    this.foregroundMaskAdapter = gson.getAdapter(ImageElement.class);
                    this.scrimAdapter = gson.getAdapter(ImageElement.class);
                    this.accessoryViewAdapter = gson.getAdapter(ImageElement.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, UiDefinition.Layout.Choice.ChoiceChildren choiceChildren) {
                    if (choiceChildren == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.idAdapter.write(jsonWriter, choiceChildren.id());
                    jsonWriter.name("type");
                    this.typeAdapter.write(jsonWriter, choiceChildren.type());
                    jsonWriter.name("styleId");
                    this.styleIdAdapter.write(jsonWriter, choiceChildren.styleId());
                    jsonWriter.name("visualStateTransitions");
                    this.visualStateTransitionsAdapter.write(jsonWriter, choiceChildren.visualStateTransitions());
                    jsonWriter.name("visualStates");
                    this.visualStatesAdapter.write(jsonWriter, choiceChildren.visualStates());
                    jsonWriter.name("label");
                    this.labelAdapter.write(jsonWriter, choiceChildren.label());
                    jsonWriter.name("icon");
                    this.iconAdapter.write(jsonWriter, choiceChildren.icon());
                    jsonWriter.name("background");
                    this.backgroundAdapter.write(jsonWriter, choiceChildren.background());
                    jsonWriter.name("underline");
                    this.underlineAdapter.write(jsonWriter, choiceChildren.underline());
                    jsonWriter.name("valueLabel");
                    this.valueLabelAdapter.write(jsonWriter, choiceChildren.valueLabel());
                    jsonWriter.name("tooltipContainer");
                    this.tooltipContainerAdapter.write(jsonWriter, choiceChildren.tooltipContainer());
                    jsonWriter.name("foreground");
                    this.foregroundAdapter.write(jsonWriter, choiceChildren.foreground());
                    jsonWriter.name("foregroundMask");
                    this.foregroundMaskAdapter.write(jsonWriter, choiceChildren.foregroundMask());
                    jsonWriter.name("scrim");
                    this.scrimAdapter.write(jsonWriter, choiceChildren.scrim());
                    jsonWriter.name("accessoryView");
                    this.accessoryViewAdapter.write(jsonWriter, choiceChildren.accessoryView());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public UiDefinition.Layout.Choice.ChoiceChildren read(JsonReader jsonReader) {
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
                    SimpleElement simpleElement = this.defaultLabel;
                    ImageElement imageElement = this.defaultIcon;
                    ImageElement imageElement2 = this.defaultBackground;
                    ImageElement imageElement3 = this.defaultUnderline;
                    SimpleElement simpleElement2 = this.defaultValueLabel;
                    ToolTipElement toolTipElement = this.defaultTooltipContainer;
                    ImageElement imageElement4 = this.defaultForeground;
                    ImageElement imageElement5 = this.defaultForegroundMask;
                    ImageElement imageElement6 = this.defaultScrim;
                    ImageElement imageElement7 = this.defaultAccessoryView;
                    String str4 = str2;
                    String str5 = str3;
                    Map<String, AnimationTemplateId> map3 = map;
                    Map<String, VisualStateDefinition> map4 = map2;
                    SimpleElement simpleElement3 = simpleElement;
                    ImageElement imageElement8 = imageElement;
                    ImageElement imageElement9 = imageElement2;
                    ImageElement imageElement10 = imageElement3;
                    SimpleElement simpleElement4 = simpleElement2;
                    ToolTipElement toolTipElement2 = toolTipElement;
                    ImageElement imageElement11 = imageElement4;
                    ImageElement imageElement12 = imageElement5;
                    ImageElement imageElement13 = imageElement6;
                    String str6 = str;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -2012352578:
                                    if (nextName.equals("tooltipContainer")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1875214676:
                                    if (nextName.equals("styleId")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1332194002:
                                    if (nextName.equals("background")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1026963764:
                                    if (nextName.equals("underline")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -574584113:
                                    if (nextName.equals("foregroundMask")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3355:
                                    if (nextName.equals(SignupConstants.Field.LANG_ID)) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3226745:
                                    if (nextName.equals("icon")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3575610:
                                    if (nextName.equals("type")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 102727412:
                                    if (nextName.equals("label")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 109267142:
                                    if (nextName.equals("scrim")) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 951359437:
                                    if (nextName.equals("visualStateTransitions")) {
                                        c = '\n';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1289102551:
                                    if (nextName.equals("accessoryView")) {
                                        c = 11;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1603916130:
                                    if (nextName.equals("visualStates")) {
                                        c = '\f';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1984457027:
                                    if (nextName.equals("foreground")) {
                                        c = '\r';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 2025208835:
                                    if (nextName.equals("valueLabel")) {
                                        c = 14;
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
                                    toolTipElement2 = this.tooltipContainerAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    str5 = this.styleIdAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    imageElement9 = this.backgroundAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    imageElement10 = this.underlineAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    imageElement12 = this.foregroundMaskAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    str6 = this.idAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    imageElement8 = this.iconAdapter.read(jsonReader);
                                    continue;
                                case 7:
                                    str4 = this.typeAdapter.read(jsonReader);
                                    continue;
                                case '\b':
                                    simpleElement3 = this.labelAdapter.read(jsonReader);
                                    continue;
                                case '\t':
                                    imageElement13 = this.scrimAdapter.read(jsonReader);
                                    continue;
                                case '\n':
                                    map3 = this.visualStateTransitionsAdapter.read(jsonReader);
                                    continue;
                                case 11:
                                    imageElement7 = this.accessoryViewAdapter.read(jsonReader);
                                    continue;
                                case '\f':
                                    map4 = this.visualStatesAdapter.read(jsonReader);
                                    continue;
                                case '\r':
                                    imageElement11 = this.foregroundAdapter.read(jsonReader);
                                    continue;
                                case 14:
                                    simpleElement4 = this.valueLabelAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_UiDefinition_Layout_Choice_ChoiceChildren(str6, str4, str5, map3, map4, simpleElement3, imageElement8, imageElement9, imageElement10, simpleElement4, toolTipElement2, imageElement11, imageElement12, imageElement13, imageElement7);
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
        parcel.writeParcelable(label(), i);
        parcel.writeParcelable(icon(), i);
        parcel.writeParcelable(background(), i);
        parcel.writeParcelable(underline(), i);
        parcel.writeParcelable(valueLabel(), i);
        parcel.writeParcelable(tooltipContainer(), i);
        parcel.writeParcelable(foreground(), i);
        parcel.writeParcelable(foregroundMask(), i);
        parcel.writeParcelable(scrim(), i);
        parcel.writeParcelable(accessoryView(), i);
    }
}
