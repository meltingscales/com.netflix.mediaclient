package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.Button;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Button_Label extends C$AutoValue_Button_Label {
    public static final Parcelable.Creator<AutoValue_Button_Label> CREATOR = new Parcelable.Creator<AutoValue_Button_Label>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_Button_Label.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Button_Label createFromParcel(Parcel parcel) {
            return new AutoValue_Button_Label(parcel.readString(), Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()), (Color) parcel.readParcelable(Button.Label.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Button_Label[] newArray(int i) {
            return new AutoValue_Button_Label[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Button_Label(String str, Integer num, Integer num2, Integer num3, Color color) {
        new C$$AutoValue_Button_Label(str, num, num2, num3, color) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Button_Label

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_Button_Label$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Button.Label> {
                private final TypeAdapter<Color> colorAdapter;
                private final TypeAdapter<Integer> fontSizeAdapter;
                private final TypeAdapter<Integer> numberOfLinesAdapter;
                private final TypeAdapter<String> stringAdapter;
                private final TypeAdapter<Integer> yOffsetAdapter;
                private String defaultString = null;
                private Integer defaultFontSize = null;
                private Integer defaultYOffset = null;
                private Integer defaultNumberOfLines = null;
                private Color defaultColor = null;

                public GsonTypeAdapter setDefaultColor(Color color) {
                    this.defaultColor = color;
                    return this;
                }

                public GsonTypeAdapter setDefaultFontSize(Integer num) {
                    this.defaultFontSize = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultNumberOfLines(Integer num) {
                    this.defaultNumberOfLines = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultString(String str) {
                    this.defaultString = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultYOffset(Integer num) {
                    this.defaultYOffset = num;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.stringAdapter = gson.getAdapter(String.class);
                    this.fontSizeAdapter = gson.getAdapter(Integer.class);
                    this.yOffsetAdapter = gson.getAdapter(Integer.class);
                    this.numberOfLinesAdapter = gson.getAdapter(Integer.class);
                    this.colorAdapter = gson.getAdapter(Color.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Button.Label label) {
                    if (label == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("string");
                    this.stringAdapter.write(jsonWriter, label.string());
                    jsonWriter.name("fontSize");
                    this.fontSizeAdapter.write(jsonWriter, label.fontSize());
                    jsonWriter.name("yOffset");
                    this.yOffsetAdapter.write(jsonWriter, label.yOffset());
                    jsonWriter.name("numberOfLines");
                    this.numberOfLinesAdapter.write(jsonWriter, label.numberOfLines());
                    jsonWriter.name("color");
                    this.colorAdapter.write(jsonWriter, label.color());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public Button.Label read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultString;
                    Integer num = this.defaultFontSize;
                    String str2 = str;
                    Integer num2 = num;
                    Integer num3 = this.defaultYOffset;
                    Integer num4 = this.defaultNumberOfLines;
                    Color color = this.defaultColor;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1922149780:
                                    if (nextName.equals("yOffset")) {
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
                                case -891985903:
                                    if (nextName.equals("string")) {
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
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                num3 = this.yOffsetAdapter.read(jsonReader);
                            } else if (c == 1) {
                                num4 = this.numberOfLinesAdapter.read(jsonReader);
                            } else if (c == 2) {
                                str2 = this.stringAdapter.read(jsonReader);
                            } else if (c == 3) {
                                color = this.colorAdapter.read(jsonReader);
                            } else if (c == 4) {
                                num2 = this.fontSizeAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_Button_Label(str2, num2, num3, num4, color);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(string());
        parcel.writeInt(fontSize().intValue());
        parcel.writeInt(yOffset().intValue());
        parcel.writeInt(numberOfLines().intValue());
        parcel.writeParcelable(color(), i);
    }
}
