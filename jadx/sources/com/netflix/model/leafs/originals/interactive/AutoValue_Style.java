package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Style extends C$AutoValue_Style {
    public static final Parcelable.Creator<AutoValue_Style> CREATOR = new Parcelable.Creator<AutoValue_Style>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_Style.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Style createFromParcel(Parcel parcel) {
            return new AutoValue_Style((SourceRect) parcel.readParcelable(Style.class.getClassLoader()), parcel.readInt() == 0 ? Float.valueOf(parcel.readFloat()) : null, parcel.readInt() == 0 ? Float.valueOf(parcel.readFloat()) : null, parcel.readInt() == 0 ? Float.valueOf(parcel.readFloat()) : null, parcel.readInt() == 0 ? Float.valueOf(parcel.readFloat()) : null, parcel.readInt() == 0 ? Float.valueOf(parcel.readFloat()) : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (Style.Shadow) parcel.readParcelable(Style.class.getClassLoader()), (ScreenPosition) parcel.readParcelable(Style.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Style[] newArray(int i) {
            return new AutoValue_Style[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Style(SourceRect sourceRect, Float f, Float f2, Float f3, Float f4, Float f5, String str, Integer num, String str2, String str3, Style.Shadow shadow, ScreenPosition screenPosition, String str4) {
        new C$$AutoValue_Style(sourceRect, f, f2, f3, f4, f5, str, num, str2, str3, shadow, screenPosition, str4) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Style

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_Style$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Style> {
                private final TypeAdapter<Float> alignmentAdapter;
                private final TypeAdapter<String> backgroundColorAdapter;
                private final TypeAdapter<String> colorAdapter;
                private final TypeAdapter<Float> fontSizeAdapter;
                private final TypeAdapter<Float> fontWeightAdapter;
                private final TypeAdapter<Float> minFontSizeAdapter;
                private final TypeAdapter<Integer> numberOfLinesAdapter;
                private final TypeAdapter<Float> opacityAdapter;
                private final TypeAdapter<SourceRect> rectAdapter;
                private final TypeAdapter<String> scaleTypeAdapter;
                private final TypeAdapter<ScreenPosition> screenPositionAdapter;
                private final TypeAdapter<Style.Shadow> shadowAdapter;
                private final TypeAdapter<String> textDirectionStringAdapter;
                private SourceRect defaultRect = null;
                private Float defaultFontSize = null;
                private Float defaultMinFontSize = null;
                private Float defaultFontWeight = null;
                private Float defaultAlignment = null;
                private Float defaultOpacity = null;
                private String defaultScaleType = null;
                private Integer defaultNumberOfLines = null;
                private String defaultColor = null;
                private String defaultBackgroundColor = null;
                private Style.Shadow defaultShadow = null;
                private ScreenPosition defaultScreenPosition = null;
                private String defaultTextDirectionString = null;

                public GsonTypeAdapter setDefaultAlignment(Float f) {
                    this.defaultAlignment = f;
                    return this;
                }

                public GsonTypeAdapter setDefaultBackgroundColor(String str) {
                    this.defaultBackgroundColor = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultColor(String str) {
                    this.defaultColor = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultFontSize(Float f) {
                    this.defaultFontSize = f;
                    return this;
                }

                public GsonTypeAdapter setDefaultFontWeight(Float f) {
                    this.defaultFontWeight = f;
                    return this;
                }

                public GsonTypeAdapter setDefaultMinFontSize(Float f) {
                    this.defaultMinFontSize = f;
                    return this;
                }

                public GsonTypeAdapter setDefaultNumberOfLines(Integer num) {
                    this.defaultNumberOfLines = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultOpacity(Float f) {
                    this.defaultOpacity = f;
                    return this;
                }

                public GsonTypeAdapter setDefaultRect(SourceRect sourceRect) {
                    this.defaultRect = sourceRect;
                    return this;
                }

                public GsonTypeAdapter setDefaultScaleType(String str) {
                    this.defaultScaleType = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultScreenPosition(ScreenPosition screenPosition) {
                    this.defaultScreenPosition = screenPosition;
                    return this;
                }

                public GsonTypeAdapter setDefaultShadow(Style.Shadow shadow) {
                    this.defaultShadow = shadow;
                    return this;
                }

                public GsonTypeAdapter setDefaultTextDirectionString(String str) {
                    this.defaultTextDirectionString = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.rectAdapter = gson.getAdapter(SourceRect.class);
                    this.fontSizeAdapter = gson.getAdapter(Float.class);
                    this.minFontSizeAdapter = gson.getAdapter(Float.class);
                    this.fontWeightAdapter = gson.getAdapter(Float.class);
                    this.alignmentAdapter = gson.getAdapter(Float.class);
                    this.opacityAdapter = gson.getAdapter(Float.class);
                    this.scaleTypeAdapter = gson.getAdapter(String.class);
                    this.numberOfLinesAdapter = gson.getAdapter(Integer.class);
                    this.colorAdapter = gson.getAdapter(String.class);
                    this.backgroundColorAdapter = gson.getAdapter(String.class);
                    this.shadowAdapter = gson.getAdapter(Style.Shadow.class);
                    this.screenPositionAdapter = gson.getAdapter(ScreenPosition.class);
                    this.textDirectionStringAdapter = gson.getAdapter(String.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Style style) {
                    if (style == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("rect");
                    this.rectAdapter.write(jsonWriter, style.rect());
                    jsonWriter.name("fontSize");
                    this.fontSizeAdapter.write(jsonWriter, style.fontSize());
                    jsonWriter.name("minFontSize");
                    this.minFontSizeAdapter.write(jsonWriter, style.minFontSize());
                    jsonWriter.name("fontWeight");
                    this.fontWeightAdapter.write(jsonWriter, style.fontWeight());
                    jsonWriter.name("alignment");
                    this.alignmentAdapter.write(jsonWriter, style.alignment());
                    jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.OPACITY);
                    this.opacityAdapter.write(jsonWriter, style.opacity());
                    jsonWriter.name("scaleType");
                    this.scaleTypeAdapter.write(jsonWriter, style.scaleType());
                    jsonWriter.name("numberOfLines");
                    this.numberOfLinesAdapter.write(jsonWriter, style.numberOfLines());
                    jsonWriter.name("color");
                    this.colorAdapter.write(jsonWriter, style.color());
                    jsonWriter.name("backgroundColor");
                    this.backgroundColorAdapter.write(jsonWriter, style.backgroundColor());
                    jsonWriter.name("shadow");
                    this.shadowAdapter.write(jsonWriter, style.shadow());
                    jsonWriter.name("screenPosition");
                    this.screenPositionAdapter.write(jsonWriter, style.screenPosition());
                    jsonWriter.name("textDirection");
                    this.textDirectionStringAdapter.write(jsonWriter, style.textDirectionString());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public Style read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    SourceRect sourceRect = this.defaultRect;
                    Float f = this.defaultFontSize;
                    Float f2 = this.defaultMinFontSize;
                    Float f3 = this.defaultFontWeight;
                    Float f4 = this.defaultAlignment;
                    Float f5 = this.defaultOpacity;
                    String str = this.defaultScaleType;
                    Integer num = this.defaultNumberOfLines;
                    String str2 = this.defaultColor;
                    String str3 = this.defaultBackgroundColor;
                    Style.Shadow shadow = this.defaultShadow;
                    SourceRect sourceRect2 = sourceRect;
                    Float f6 = f;
                    Float f7 = f2;
                    Float f8 = f3;
                    Float f9 = f4;
                    Float f10 = f5;
                    String str4 = str;
                    Integer num2 = num;
                    String str5 = str2;
                    String str6 = str3;
                    Style.Shadow shadow2 = shadow;
                    ScreenPosition screenPosition = this.defaultScreenPosition;
                    String str7 = this.defaultTextDirectionString;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1877911644:
                                    if (nextName.equals("scaleType")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1329887265:
                                    if (nextName.equals("numberOfLines")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1267206133:
                                    if (nextName.equals(InteractiveAnimation.ANIMATION_TYPE.OPACITY)) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -903579360:
                                    if (nextName.equals("shadow")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -734428249:
                                    if (nextName.equals("fontWeight")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -687708974:
                                    if (nextName.equals("textDirection")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3496420:
                                    if (nextName.equals("rect")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 94842723:
                                    if (nextName.equals("color")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 365601008:
                                    if (nextName.equals("fontSize")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 628199861:
                                    if (nextName.equals("screenPosition")) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1287124693:
                                    if (nextName.equals("backgroundColor")) {
                                        c = '\n';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1720465762:
                                    if (nextName.equals("minFontSize")) {
                                        c = 11;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1767875043:
                                    if (nextName.equals("alignment")) {
                                        c = '\f';
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
                                    str4 = this.scaleTypeAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    num2 = this.numberOfLinesAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    f10 = this.opacityAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    shadow2 = this.shadowAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    f8 = this.fontWeightAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    str7 = this.textDirectionStringAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    sourceRect2 = this.rectAdapter.read(jsonReader);
                                    continue;
                                case 7:
                                    str5 = this.colorAdapter.read(jsonReader);
                                    continue;
                                case '\b':
                                    f6 = this.fontSizeAdapter.read(jsonReader);
                                    continue;
                                case '\t':
                                    screenPosition = this.screenPositionAdapter.read(jsonReader);
                                    continue;
                                case '\n':
                                    str6 = this.backgroundColorAdapter.read(jsonReader);
                                    continue;
                                case 11:
                                    f7 = this.minFontSizeAdapter.read(jsonReader);
                                    continue;
                                case '\f':
                                    f9 = this.alignmentAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_Style(sourceRect2, f6, f7, f8, f9, f10, str4, num2, str5, str6, shadow2, screenPosition, str7);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(rect(), i);
        if (fontSize() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeFloat(fontSize().floatValue());
        }
        if (minFontSize() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeFloat(minFontSize().floatValue());
        }
        if (fontWeight() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeFloat(fontWeight().floatValue());
        }
        if (alignment() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeFloat(alignment().floatValue());
        }
        if (opacity() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeFloat(opacity().floatValue());
        }
        if (scaleType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(scaleType());
        }
        if (numberOfLines() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(numberOfLines().intValue());
        }
        if (color() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(color());
        }
        if (backgroundColor() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(backgroundColor());
        }
        parcel.writeParcelable(shadow(), i);
        parcel.writeParcelable(screenPosition(), i);
        if (textDirectionString() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(textDirectionString());
    }
}
