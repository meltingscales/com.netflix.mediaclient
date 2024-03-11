package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.CommonMetaData;
import com.netflix.model.leafs.originals.interactive.animations.ChoicePointAnimations;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_CommonMetaData_Layout_ChoiceLayout extends C$AutoValue_CommonMetaData_Layout_ChoiceLayout {
    public static final Parcelable.Creator<AutoValue_CommonMetaData_Layout_ChoiceLayout> CREATOR = new Parcelable.Creator<AutoValue_CommonMetaData_Layout_ChoiceLayout>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_CommonMetaData_Layout_ChoiceLayout.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CommonMetaData_Layout_ChoiceLayout createFromParcel(Parcel parcel) {
            return new AutoValue_CommonMetaData_Layout_ChoiceLayout(parcel.readInt() == 0 ? parcel.readString() : null, (SpriteImage) parcel.readParcelable(CommonMetaData.Layout.ChoiceLayout.class.getClassLoader()), (SpriteImage) parcel.readParcelable(CommonMetaData.Layout.ChoiceLayout.class.getClassLoader()), (Label) parcel.readParcelable(CommonMetaData.Layout.ChoiceLayout.class.getClassLoader()), (ChoicePointAnimations) parcel.readParcelable(CommonMetaData.Layout.ChoiceLayout.class.getClassLoader()), (SourceRect) parcel.readParcelable(CommonMetaData.Layout.ChoiceLayout.class.getClassLoader()), (CommonMetaData.Layout.ChoiceLayout.Background) parcel.readParcelable(CommonMetaData.Layout.ChoiceLayout.class.getClassLoader()), parcel.readInt() == 1, (CommonMetaData.Layout.ChoiceLayout.InnerChoice) parcel.readParcelable(CommonMetaData.Layout.ChoiceLayout.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CommonMetaData_Layout_ChoiceLayout[] newArray(int i) {
            return new AutoValue_CommonMetaData_Layout_ChoiceLayout[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_CommonMetaData_Layout_ChoiceLayout(String str, SpriteImage spriteImage, SpriteImage spriteImage2, Label label, ChoicePointAnimations choicePointAnimations, SourceRect sourceRect, CommonMetaData.Layout.ChoiceLayout.Background background, boolean z, CommonMetaData.Layout.ChoiceLayout.InnerChoice innerChoice, String str2) {
        new C$$AutoValue_CommonMetaData_Layout_ChoiceLayout(str, spriteImage, spriteImage2, label, choicePointAnimations, sourceRect, background, z, innerChoice, str2) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_CommonMetaData_Layout_ChoiceLayout

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_CommonMetaData_Layout_ChoiceLayout$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<CommonMetaData.Layout.ChoiceLayout> {
                private final TypeAdapter<ChoicePointAnimations> animationAdapter;
                private final TypeAdapter<CommonMetaData.Layout.ChoiceLayout.Background> backgroundAdapter;
                private final TypeAdapter<CommonMetaData.Layout.ChoiceLayout.InnerChoice> choiceAdapter;
                private final TypeAdapter<SpriteImage> foregroundAdapter;
                private final TypeAdapter<SourceRect> iconAdapter;
                private final TypeAdapter<Label> labelAdapter;
                private final TypeAdapter<String> nameAdapter;
                private final TypeAdapter<SpriteImage> selectedAdapter;
                private final TypeAdapter<String> textAdapter;
                private final TypeAdapter<Boolean> visibleAdapter;
                private String defaultName = null;
                private SpriteImage defaultForeground = null;
                private SpriteImage defaultSelected = null;
                private Label defaultLabel = null;
                private ChoicePointAnimations defaultAnimation = null;
                private SourceRect defaultIcon = null;
                private CommonMetaData.Layout.ChoiceLayout.Background defaultBackground = null;
                private boolean defaultVisible = false;
                private CommonMetaData.Layout.ChoiceLayout.InnerChoice defaultChoice = null;
                private String defaultText = null;

                public GsonTypeAdapter setDefaultAnimation(ChoicePointAnimations choicePointAnimations) {
                    this.defaultAnimation = choicePointAnimations;
                    return this;
                }

                public GsonTypeAdapter setDefaultBackground(CommonMetaData.Layout.ChoiceLayout.Background background) {
                    this.defaultBackground = background;
                    return this;
                }

                public GsonTypeAdapter setDefaultChoice(CommonMetaData.Layout.ChoiceLayout.InnerChoice innerChoice) {
                    this.defaultChoice = innerChoice;
                    return this;
                }

                public GsonTypeAdapter setDefaultForeground(SpriteImage spriteImage) {
                    this.defaultForeground = spriteImage;
                    return this;
                }

                public GsonTypeAdapter setDefaultIcon(SourceRect sourceRect) {
                    this.defaultIcon = sourceRect;
                    return this;
                }

                public GsonTypeAdapter setDefaultLabel(Label label) {
                    this.defaultLabel = label;
                    return this;
                }

                public GsonTypeAdapter setDefaultName(String str) {
                    this.defaultName = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultSelected(SpriteImage spriteImage) {
                    this.defaultSelected = spriteImage;
                    return this;
                }

                public GsonTypeAdapter setDefaultText(String str) {
                    this.defaultText = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultVisible(boolean z) {
                    this.defaultVisible = z;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.nameAdapter = gson.getAdapter(String.class);
                    this.foregroundAdapter = gson.getAdapter(SpriteImage.class);
                    this.selectedAdapter = gson.getAdapter(SpriteImage.class);
                    this.labelAdapter = gson.getAdapter(Label.class);
                    this.animationAdapter = gson.getAdapter(ChoicePointAnimations.class);
                    this.iconAdapter = gson.getAdapter(SourceRect.class);
                    this.backgroundAdapter = gson.getAdapter(CommonMetaData.Layout.ChoiceLayout.Background.class);
                    this.visibleAdapter = gson.getAdapter(Boolean.class);
                    this.choiceAdapter = gson.getAdapter(CommonMetaData.Layout.ChoiceLayout.InnerChoice.class);
                    this.textAdapter = gson.getAdapter(String.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, CommonMetaData.Layout.ChoiceLayout choiceLayout) {
                    if (choiceLayout == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name");
                    this.nameAdapter.write(jsonWriter, choiceLayout.name());
                    jsonWriter.name("foreground");
                    this.foregroundAdapter.write(jsonWriter, choiceLayout.foreground());
                    jsonWriter.name(VisualStateDefinition.ELEMENT_STATE.SELECTED);
                    this.selectedAdapter.write(jsonWriter, choiceLayout.selected());
                    jsonWriter.name("label");
                    this.labelAdapter.write(jsonWriter, choiceLayout.label());
                    jsonWriter.name("animation");
                    this.animationAdapter.write(jsonWriter, choiceLayout.animation());
                    jsonWriter.name("icon");
                    this.iconAdapter.write(jsonWriter, choiceLayout.icon());
                    jsonWriter.name("background");
                    this.backgroundAdapter.write(jsonWriter, choiceLayout.background());
                    jsonWriter.name("visible");
                    this.visibleAdapter.write(jsonWriter, Boolean.valueOf(choiceLayout.visible()));
                    jsonWriter.name("choice");
                    this.choiceAdapter.write(jsonWriter, choiceLayout.choice());
                    jsonWriter.name("text");
                    this.textAdapter.write(jsonWriter, choiceLayout.text());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public CommonMetaData.Layout.ChoiceLayout read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultName;
                    SpriteImage spriteImage = this.defaultForeground;
                    SpriteImage spriteImage2 = this.defaultSelected;
                    Label label = this.defaultLabel;
                    ChoicePointAnimations choicePointAnimations = this.defaultAnimation;
                    SourceRect sourceRect = this.defaultIcon;
                    CommonMetaData.Layout.ChoiceLayout.Background background = this.defaultBackground;
                    boolean z = this.defaultVisible;
                    String str2 = str;
                    SpriteImage spriteImage3 = spriteImage;
                    SpriteImage spriteImage4 = spriteImage2;
                    Label label2 = label;
                    ChoicePointAnimations choicePointAnimations2 = choicePointAnimations;
                    SourceRect sourceRect2 = sourceRect;
                    CommonMetaData.Layout.ChoiceLayout.Background background2 = background;
                    boolean z2 = z;
                    CommonMetaData.Layout.ChoiceLayout.InnerChoice innerChoice = this.defaultChoice;
                    String str3 = this.defaultText;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1361224287:
                                    if (nextName.equals("choice")) {
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
                                case 3226745:
                                    if (nextName.equals("icon")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3373707:
                                    if (nextName.equals("name")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3556653:
                                    if (nextName.equals("text")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 102727412:
                                    if (nextName.equals("label")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 466743410:
                                    if (nextName.equals("visible")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1118509956:
                                    if (nextName.equals("animation")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1191572123:
                                    if (nextName.equals(VisualStateDefinition.ELEMENT_STATE.SELECTED)) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1984457027:
                                    if (nextName.equals("foreground")) {
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
                                    innerChoice = this.choiceAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    background2 = this.backgroundAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    sourceRect2 = this.iconAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    str2 = this.nameAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    str3 = this.textAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    label2 = this.labelAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    z2 = this.visibleAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case 7:
                                    choicePointAnimations2 = this.animationAdapter.read(jsonReader);
                                    continue;
                                case '\b':
                                    spriteImage4 = this.selectedAdapter.read(jsonReader);
                                    continue;
                                case '\t':
                                    spriteImage3 = this.foregroundAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_CommonMetaData_Layout_ChoiceLayout(str2, spriteImage3, spriteImage4, label2, choicePointAnimations2, sourceRect2, background2, z2, innerChoice, str3);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (name() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(name());
        }
        parcel.writeParcelable(foreground(), i);
        parcel.writeParcelable(selected(), i);
        parcel.writeParcelable(label(), i);
        parcel.writeParcelable(animation(), i);
        parcel.writeParcelable(icon(), i);
        parcel.writeParcelable(background(), i);
        parcel.writeInt(visible() ? 1 : 0);
        parcel.writeParcelable(choice(), i);
        if (text() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(text());
    }
}
