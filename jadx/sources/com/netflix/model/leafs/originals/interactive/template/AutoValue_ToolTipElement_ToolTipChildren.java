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
import com.netflix.model.leafs.originals.interactive.template.ToolTipElement;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_ToolTipElement_ToolTipChildren extends C$AutoValue_ToolTipElement_ToolTipChildren {
    public static final Parcelable.Creator<AutoValue_ToolTipElement_ToolTipChildren> CREATOR = new Parcelable.Creator<AutoValue_ToolTipElement_ToolTipChildren>() { // from class: com.netflix.model.leafs.originals.interactive.template.AutoValue_ToolTipElement_ToolTipChildren.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ToolTipElement_ToolTipChildren createFromParcel(Parcel parcel) {
            return new AutoValue_ToolTipElement_ToolTipChildren(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readHashMap(ToolTipElement.ToolTipChildren.class.getClassLoader()), parcel.readHashMap(ToolTipElement.ToolTipChildren.class.getClassLoader()), (SimpleElement) parcel.readParcelable(ToolTipElement.ToolTipChildren.class.getClassLoader()), (SimpleElement) parcel.readParcelable(ToolTipElement.ToolTipChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(ToolTipElement.ToolTipChildren.class.getClassLoader()), (ImageElement) parcel.readParcelable(ToolTipElement.ToolTipChildren.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ToolTipElement_ToolTipChildren[] newArray(int i) {
            return new AutoValue_ToolTipElement_ToolTipChildren[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_ToolTipElement_ToolTipChildren(final String str, final String str2, final String str3, final Map<String, AnimationTemplateId> map, final Map<String, VisualStateDefinition> map2, final SimpleElement simpleElement, final SimpleElement simpleElement2, final ImageElement imageElement, final ImageElement imageElement2) {
        new C$$AutoValue_ToolTipElement_ToolTipChildren(str, str2, str3, map, map2, simpleElement, simpleElement2, imageElement, imageElement2) { // from class: com.netflix.model.leafs.originals.interactive.template.$AutoValue_ToolTipElement_ToolTipChildren

            /* renamed from: com.netflix.model.leafs.originals.interactive.template.$AutoValue_ToolTipElement_ToolTipChildren$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<ToolTipElement.ToolTipChildren> {
                private final TypeAdapter<String> idAdapter;
                private final TypeAdapter<ImageElement> previewImageAdapter;
                private final TypeAdapter<String> styleIdAdapter;
                private final TypeAdapter<SimpleElement> subtitleLabelAdapter;
                private final TypeAdapter<SimpleElement> titleLabelAdapter;
                private final TypeAdapter<ImageElement> tooltipAdapter;
                private final TypeAdapter<String> typeAdapter;
                private final TypeAdapter<Map<String, AnimationTemplateId>> visualStateTransitionsAdapter;
                private final TypeAdapter<Map<String, VisualStateDefinition>> visualStatesAdapter;
                private String defaultId = null;
                private String defaultType = null;
                private String defaultStyleId = null;
                private Map<String, AnimationTemplateId> defaultVisualStateTransitions = null;
                private Map<String, VisualStateDefinition> defaultVisualStates = null;
                private SimpleElement defaultTitleLabel = null;
                private SimpleElement defaultSubtitleLabel = null;
                private ImageElement defaultPreviewImage = null;
                private ImageElement defaultTooltip = null;

                public GsonTypeAdapter setDefaultId(String str) {
                    this.defaultId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultPreviewImage(ImageElement imageElement) {
                    this.defaultPreviewImage = imageElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultStyleId(String str) {
                    this.defaultStyleId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultSubtitleLabel(SimpleElement simpleElement) {
                    this.defaultSubtitleLabel = simpleElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultTitleLabel(SimpleElement simpleElement) {
                    this.defaultTitleLabel = simpleElement;
                    return this;
                }

                public GsonTypeAdapter setDefaultTooltip(ImageElement imageElement) {
                    this.defaultTooltip = imageElement;
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
                    this.titleLabelAdapter = gson.getAdapter(SimpleElement.class);
                    this.subtitleLabelAdapter = gson.getAdapter(SimpleElement.class);
                    this.previewImageAdapter = gson.getAdapter(ImageElement.class);
                    this.tooltipAdapter = gson.getAdapter(ImageElement.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, ToolTipElement.ToolTipChildren toolTipChildren) {
                    if (toolTipChildren == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.idAdapter.write(jsonWriter, toolTipChildren.id());
                    jsonWriter.name("type");
                    this.typeAdapter.write(jsonWriter, toolTipChildren.type());
                    jsonWriter.name("styleId");
                    this.styleIdAdapter.write(jsonWriter, toolTipChildren.styleId());
                    jsonWriter.name("visualStateTransitions");
                    this.visualStateTransitionsAdapter.write(jsonWriter, toolTipChildren.visualStateTransitions());
                    jsonWriter.name("visualStates");
                    this.visualStatesAdapter.write(jsonWriter, toolTipChildren.visualStates());
                    jsonWriter.name("titleLabel");
                    this.titleLabelAdapter.write(jsonWriter, toolTipChildren.titleLabel());
                    jsonWriter.name("subtitleLabel");
                    this.subtitleLabelAdapter.write(jsonWriter, toolTipChildren.subtitleLabel());
                    jsonWriter.name("previewImage");
                    this.previewImageAdapter.write(jsonWriter, toolTipChildren.previewImage());
                    jsonWriter.name("tooltip");
                    this.tooltipAdapter.write(jsonWriter, toolTipChildren.tooltip());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public ToolTipElement.ToolTipChildren read(JsonReader jsonReader) {
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
                    SimpleElement simpleElement = this.defaultTitleLabel;
                    SimpleElement simpleElement2 = this.defaultSubtitleLabel;
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    Map<String, AnimationTemplateId> map3 = map;
                    Map<String, VisualStateDefinition> map4 = map2;
                    SimpleElement simpleElement3 = simpleElement;
                    SimpleElement simpleElement4 = simpleElement2;
                    ImageElement imageElement = this.defaultPreviewImage;
                    ImageElement imageElement2 = this.defaultTooltip;
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
                                case -1791483012:
                                    if (nextName.equals("titleLabel")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1383206285:
                                    if (nextName.equals("previewImage")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1140076541:
                                    if (nextName.equals("tooltip")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3355:
                                    if (nextName.equals(SignupConstants.Field.LANG_ID)) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3575610:
                                    if (nextName.equals("type")) {
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
                                case 1037111740:
                                    if (nextName.equals("subtitleLabel")) {
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
                                    simpleElement3 = this.titleLabelAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    imageElement = this.previewImageAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    imageElement2 = this.tooltipAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    str4 = this.idAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    str5 = this.typeAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    map3 = this.visualStateTransitionsAdapter.read(jsonReader);
                                    continue;
                                case 7:
                                    simpleElement4 = this.subtitleLabelAdapter.read(jsonReader);
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
                    return new AutoValue_ToolTipElement_ToolTipChildren(str4, str5, str6, map3, map4, simpleElement3, simpleElement4, imageElement, imageElement2);
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
        parcel.writeParcelable(titleLabel(), i);
        parcel.writeParcelable(subtitleLabel(), i);
        parcel.writeParcelable(previewImage(), i);
        parcel.writeParcelable(tooltip(), i);
    }
}
