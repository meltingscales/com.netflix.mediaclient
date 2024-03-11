package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Label extends C$AutoValue_Label {
    public static final Parcelable.Creator<AutoValue_Label> CREATOR = new Parcelable.Creator<AutoValue_Label>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_Label.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Label createFromParcel(Parcel parcel) {
            return new AutoValue_Label(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? Float.valueOf(parcel.readFloat()) : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, Integer.valueOf(parcel.readInt()), (Color) parcel.readParcelable(Label.class.getClassLoader()), (SourceRect) parcel.readParcelable(Label.class.getClassLoader()), (ScreenPosition) parcel.readParcelable(Label.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Label[] newArray(int i) {
            return new AutoValue_Label[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Label(String str, Float f, Integer num, Integer num2, Color color, SourceRect sourceRect, ScreenPosition screenPosition) {
        new C$$AutoValue_Label(str, f, num, num2, color, sourceRect, screenPosition) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Label

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_Label$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Label> {
                private final TypeAdapter<Color> colorAdapter;
                private final TypeAdapter<Float> fontSizeAdapter;
                private final TypeAdapter<Integer> minFontSizeAdapter;
                private final TypeAdapter<Integer> numberOfLinesAdapter;
                private final TypeAdapter<SourceRect> rectAdapter;
                private final TypeAdapter<ScreenPosition> screenPositionAdapter;
                private final TypeAdapter<String> stringAdapter;
                private String defaultString = null;
                private Float defaultFontSize = null;
                private Integer defaultMinFontSize = null;
                private Integer defaultNumberOfLines = null;
                private Color defaultColor = null;
                private SourceRect defaultRect = null;
                private ScreenPosition defaultScreenPosition = null;

                public GsonTypeAdapter setDefaultColor(Color color) {
                    this.defaultColor = color;
                    return this;
                }

                public GsonTypeAdapter setDefaultFontSize(Float f) {
                    this.defaultFontSize = f;
                    return this;
                }

                public GsonTypeAdapter setDefaultMinFontSize(Integer num) {
                    this.defaultMinFontSize = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultNumberOfLines(Integer num) {
                    this.defaultNumberOfLines = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultRect(SourceRect sourceRect) {
                    this.defaultRect = sourceRect;
                    return this;
                }

                public GsonTypeAdapter setDefaultScreenPosition(ScreenPosition screenPosition) {
                    this.defaultScreenPosition = screenPosition;
                    return this;
                }

                public GsonTypeAdapter setDefaultString(String str) {
                    this.defaultString = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.stringAdapter = gson.getAdapter(String.class);
                    this.fontSizeAdapter = gson.getAdapter(Float.class);
                    this.minFontSizeAdapter = gson.getAdapter(Integer.class);
                    this.numberOfLinesAdapter = gson.getAdapter(Integer.class);
                    this.colorAdapter = gson.getAdapter(Color.class);
                    this.rectAdapter = gson.getAdapter(SourceRect.class);
                    this.screenPositionAdapter = gson.getAdapter(ScreenPosition.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Label label) {
                    if (label == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("string");
                    this.stringAdapter.write(jsonWriter, label.string());
                    jsonWriter.name("fontSize");
                    this.fontSizeAdapter.write(jsonWriter, label.fontSize());
                    jsonWriter.name("minFontSize");
                    this.minFontSizeAdapter.write(jsonWriter, label.minFontSize());
                    jsonWriter.name("numberOfLines");
                    this.numberOfLinesAdapter.write(jsonWriter, label.numberOfLines());
                    jsonWriter.name("color");
                    this.colorAdapter.write(jsonWriter, label.color());
                    jsonWriter.name("rect");
                    this.rectAdapter.write(jsonWriter, label.rect());
                    jsonWriter.name("screenPosition");
                    this.screenPositionAdapter.write(jsonWriter, label.screenPosition());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public Label read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultString;
                    Float f = this.defaultFontSize;
                    Integer num = this.defaultMinFontSize;
                    Integer num2 = this.defaultNumberOfLines;
                    Color color = this.defaultColor;
                    String str2 = str;
                    Float f2 = f;
                    Integer num3 = num;
                    Integer num4 = num2;
                    Color color2 = color;
                    SourceRect sourceRect = this.defaultRect;
                    ScreenPosition screenPosition = this.defaultScreenPosition;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1329887265:
                                    if (nextName.equals("numberOfLines")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -891985903:
                                    if (nextName.equals("string")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3496420:
                                    if (nextName.equals("rect")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 94842723:
                                    if (nextName.equals("color")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 365601008:
                                    if (nextName.equals("fontSize")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 628199861:
                                    if (nextName.equals("screenPosition")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1720465762:
                                    if (nextName.equals("minFontSize")) {
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
                                    num4 = this.numberOfLinesAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    str2 = this.stringAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    sourceRect = this.rectAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    color2 = this.colorAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    f2 = this.fontSizeAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    screenPosition = this.screenPositionAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    num3 = this.minFontSizeAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_Label(str2, f2, num3, num4, color2, sourceRect, screenPosition);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (string() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(string());
        }
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
            parcel.writeInt(minFontSize().intValue());
        }
        parcel.writeInt(numberOfLines().intValue());
        parcel.writeParcelable(color(), i);
        parcel.writeParcelable(rect(), i);
        parcel.writeParcelable(screenPosition(), i);
    }
}
