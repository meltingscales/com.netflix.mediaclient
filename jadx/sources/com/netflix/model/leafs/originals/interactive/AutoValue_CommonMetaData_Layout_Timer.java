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

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_CommonMetaData_Layout_Timer extends C$AutoValue_CommonMetaData_Layout_Timer {
    public static final Parcelable.Creator<AutoValue_CommonMetaData_Layout_Timer> CREATOR = new Parcelable.Creator<AutoValue_CommonMetaData_Layout_Timer>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_CommonMetaData_Layout_Timer.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CommonMetaData_Layout_Timer createFromParcel(Parcel parcel) {
            return new AutoValue_CommonMetaData_Layout_Timer((Color) parcel.readParcelable(CommonMetaData.Layout.Timer.class.getClassLoader()), parcel.readInt(), (ScreenPosition) parcel.readParcelable(CommonMetaData.Layout.Timer.class.getClassLoader()), (SpriteImage) parcel.readParcelable(CommonMetaData.Layout.Timer.class.getClassLoader()), (SpriteImage) parcel.readParcelable(CommonMetaData.Layout.Timer.class.getClassLoader()), (SpriteImage) parcel.readParcelable(CommonMetaData.Layout.Timer.class.getClassLoader()), (SpriteImage) parcel.readParcelable(CommonMetaData.Layout.Timer.class.getClassLoader()), (ChoicePointAnimations) parcel.readParcelable(CommonMetaData.Layout.Timer.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CommonMetaData_Layout_Timer[] newArray(int i) {
            return new AutoValue_CommonMetaData_Layout_Timer[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_CommonMetaData_Layout_Timer(Color color, int i, ScreenPosition screenPosition, SpriteImage spriteImage, SpriteImage spriteImage2, SpriteImage spriteImage3, SpriteImage spriteImage4, ChoicePointAnimations choicePointAnimations) {
        new C$$AutoValue_CommonMetaData_Layout_Timer(color, i, screenPosition, spriteImage, spriteImage2, spriteImage3, spriteImage4, choicePointAnimations) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_CommonMetaData_Layout_Timer

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_CommonMetaData_Layout_Timer$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<CommonMetaData.Layout.Timer> {
                private final TypeAdapter<ChoicePointAnimations> animationAdapter;
                private final TypeAdapter<SpriteImage> backgroundAdapter;
                private final TypeAdapter<SpriteImage> barAdapter;
                private final TypeAdapter<Color> colorAdapter;
                private final TypeAdapter<SpriteImage> foregroundAdapter;
                private final TypeAdapter<SpriteImage> pugAdapter;
                private final TypeAdapter<ScreenPosition> timerPositionAdapter;
                private final TypeAdapter<Integer> typeAdapter;
                private Color defaultColor = null;
                private int defaultType = 0;
                private ScreenPosition defaultTimerPosition = null;
                private SpriteImage defaultBackground = null;
                private SpriteImage defaultBar = null;
                private SpriteImage defaultForeground = null;
                private SpriteImage defaultPug = null;
                private ChoicePointAnimations defaultAnimation = null;

                public GsonTypeAdapter setDefaultAnimation(ChoicePointAnimations choicePointAnimations) {
                    this.defaultAnimation = choicePointAnimations;
                    return this;
                }

                public GsonTypeAdapter setDefaultBackground(SpriteImage spriteImage) {
                    this.defaultBackground = spriteImage;
                    return this;
                }

                public GsonTypeAdapter setDefaultBar(SpriteImage spriteImage) {
                    this.defaultBar = spriteImage;
                    return this;
                }

                public GsonTypeAdapter setDefaultColor(Color color) {
                    this.defaultColor = color;
                    return this;
                }

                public GsonTypeAdapter setDefaultForeground(SpriteImage spriteImage) {
                    this.defaultForeground = spriteImage;
                    return this;
                }

                public GsonTypeAdapter setDefaultPug(SpriteImage spriteImage) {
                    this.defaultPug = spriteImage;
                    return this;
                }

                public GsonTypeAdapter setDefaultTimerPosition(ScreenPosition screenPosition) {
                    this.defaultTimerPosition = screenPosition;
                    return this;
                }

                public GsonTypeAdapter setDefaultType(int i) {
                    this.defaultType = i;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.colorAdapter = gson.getAdapter(Color.class);
                    this.typeAdapter = gson.getAdapter(Integer.class);
                    this.timerPositionAdapter = gson.getAdapter(ScreenPosition.class);
                    this.backgroundAdapter = gson.getAdapter(SpriteImage.class);
                    this.barAdapter = gson.getAdapter(SpriteImage.class);
                    this.foregroundAdapter = gson.getAdapter(SpriteImage.class);
                    this.pugAdapter = gson.getAdapter(SpriteImage.class);
                    this.animationAdapter = gson.getAdapter(ChoicePointAnimations.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, CommonMetaData.Layout.Timer timer) {
                    if (timer == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("color");
                    this.colorAdapter.write(jsonWriter, timer.color());
                    jsonWriter.name("type");
                    this.typeAdapter.write(jsonWriter, Integer.valueOf(timer.type()));
                    jsonWriter.name("timerPosition");
                    this.timerPositionAdapter.write(jsonWriter, timer.timerPosition());
                    jsonWriter.name("background");
                    this.backgroundAdapter.write(jsonWriter, timer.background());
                    jsonWriter.name("bar");
                    this.barAdapter.write(jsonWriter, timer.bar());
                    jsonWriter.name("foreground");
                    this.foregroundAdapter.write(jsonWriter, timer.foreground());
                    jsonWriter.name("pug");
                    this.pugAdapter.write(jsonWriter, timer.pug());
                    jsonWriter.name("animation");
                    this.animationAdapter.write(jsonWriter, timer.animation());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public CommonMetaData.Layout.Timer read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    Color color = this.defaultColor;
                    int i = this.defaultType;
                    ScreenPosition screenPosition = this.defaultTimerPosition;
                    SpriteImage spriteImage = this.defaultBackground;
                    SpriteImage spriteImage2 = this.defaultBar;
                    SpriteImage spriteImage3 = this.defaultForeground;
                    Color color2 = color;
                    int i2 = i;
                    ScreenPosition screenPosition2 = screenPosition;
                    SpriteImage spriteImage4 = spriteImage;
                    SpriteImage spriteImage5 = spriteImage2;
                    SpriteImage spriteImage6 = spriteImage3;
                    SpriteImage spriteImage7 = this.defaultPug;
                    ChoicePointAnimations choicePointAnimations = this.defaultAnimation;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1332194002:
                                    if (nextName.equals("background")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 97299:
                                    if (nextName.equals("bar")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 111362:
                                    if (nextName.equals("pug")) {
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
                                case 94842723:
                                    if (nextName.equals("color")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 947646350:
                                    if (nextName.equals("timerPosition")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1118509956:
                                    if (nextName.equals("animation")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1984457027:
                                    if (nextName.equals("foreground")) {
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
                                    spriteImage4 = this.backgroundAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    spriteImage5 = this.barAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    spriteImage7 = this.pugAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    i2 = this.typeAdapter.read(jsonReader).intValue();
                                    continue;
                                case 4:
                                    color2 = this.colorAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    screenPosition2 = this.timerPositionAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    choicePointAnimations = this.animationAdapter.read(jsonReader);
                                    continue;
                                case 7:
                                    spriteImage6 = this.foregroundAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_CommonMetaData_Layout_Timer(color2, i2, screenPosition2, spriteImage4, spriteImage5, spriteImage6, spriteImage7, choicePointAnimations);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(color(), i);
        parcel.writeInt(type());
        parcel.writeParcelable(timerPosition(), i);
        parcel.writeParcelable(background(), i);
        parcel.writeParcelable(bar(), i);
        parcel.writeParcelable(foreground(), i);
        parcel.writeParcelable(pug(), i);
        parcel.writeParcelable(animation(), i);
    }
}
