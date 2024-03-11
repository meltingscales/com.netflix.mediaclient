package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.CommonMetaData;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_CommonMetaData_Layout extends C$AutoValue_CommonMetaData_Layout {
    public static final Parcelable.Creator<AutoValue_CommonMetaData_Layout> CREATOR = new Parcelable.Creator<AutoValue_CommonMetaData_Layout>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_CommonMetaData_Layout.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CommonMetaData_Layout createFromParcel(Parcel parcel) {
            StringsObject stringsObject = (StringsObject) parcel.readParcelable(CommonMetaData.Layout.class.getClassLoader());
            Size size = (Size) parcel.readParcelable(CommonMetaData.Layout.class.getClassLoader());
            double readDouble = parcel.readDouble();
            return new AutoValue_CommonMetaData_Layout(stringsObject, size, Double.valueOf(readDouble), parcel.readArrayList(CommonMetaData.Layout.class.getClassLoader()), (CommonMetaData.Layout.Timer) parcel.readParcelable(CommonMetaData.Layout.class.getClassLoader()), (Button) parcel.readParcelable(CommonMetaData.Layout.class.getClassLoader()), (AssetManifest) parcel.readParcelable(CommonMetaData.Layout.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CommonMetaData_Layout[] newArray(int i) {
            return new AutoValue_CommonMetaData_Layout[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_CommonMetaData_Layout(StringsObject stringsObject, Size size, Double d, List<CommonMetaData.Layout.ChoiceLayout> list, CommonMetaData.Layout.Timer timer, Button button, AssetManifest assetManifest) {
        new C$$AutoValue_CommonMetaData_Layout(stringsObject, size, d, list, timer, button, assetManifest) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_CommonMetaData_Layout

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_CommonMetaData_Layout$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<CommonMetaData.Layout> {
                private final TypeAdapter<Size> canvasSizeAdapter;
                private final TypeAdapter<List<CommonMetaData.Layout.ChoiceLayout>> choicesAdapter;
                private final TypeAdapter<Button> endButtonAdapter;
                private final TypeAdapter<Double> subTitleYAdapter;
                private final TypeAdapter<CommonMetaData.Layout.Timer> timerAdapter;
                private StringsObject defaultInteractiveStrings = null;
                private Size defaultCanvasSize = null;
                private Double defaultSubTitleY = null;
                private List<CommonMetaData.Layout.ChoiceLayout> defaultChoices = null;
                private CommonMetaData.Layout.Timer defaultTimer = null;
                private Button defaultEndButton = null;
                private AssetManifest defaultAssetManifest = null;
                private final TypeAdapter<StringsObject> interactiveStringsAdapter = new InteractiveStringsAdapter();
                private final TypeAdapter<AssetManifest> assetManifestAdapter = new AssetManifestAdapter();

                public GsonTypeAdapter setDefaultAssetManifest(AssetManifest assetManifest) {
                    this.defaultAssetManifest = assetManifest;
                    return this;
                }

                public GsonTypeAdapter setDefaultCanvasSize(Size size) {
                    this.defaultCanvasSize = size;
                    return this;
                }

                public GsonTypeAdapter setDefaultChoices(List<CommonMetaData.Layout.ChoiceLayout> list) {
                    this.defaultChoices = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultEndButton(Button button) {
                    this.defaultEndButton = button;
                    return this;
                }

                public GsonTypeAdapter setDefaultInteractiveStrings(StringsObject stringsObject) {
                    this.defaultInteractiveStrings = stringsObject;
                    return this;
                }

                public GsonTypeAdapter setDefaultSubTitleY(Double d) {
                    this.defaultSubTitleY = d;
                    return this;
                }

                public GsonTypeAdapter setDefaultTimer(CommonMetaData.Layout.Timer timer) {
                    this.defaultTimer = timer;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.canvasSizeAdapter = gson.getAdapter(Size.class);
                    this.subTitleYAdapter = gson.getAdapter(Double.class);
                    this.choicesAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, CommonMetaData.Layout.ChoiceLayout.class));
                    this.timerAdapter = gson.getAdapter(CommonMetaData.Layout.Timer.class);
                    this.endButtonAdapter = gson.getAdapter(Button.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, CommonMetaData.Layout layout) {
                    if (layout == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("strings");
                    this.interactiveStringsAdapter.write(jsonWriter, layout.interactiveStrings());
                    jsonWriter.name("canvasSize");
                    this.canvasSizeAdapter.write(jsonWriter, layout.canvasSize());
                    jsonWriter.name("subTitleY");
                    this.subTitleYAdapter.write(jsonWriter, layout.subTitleY());
                    jsonWriter.name("choices");
                    this.choicesAdapter.write(jsonWriter, layout.choices());
                    jsonWriter.name("timer");
                    this.timerAdapter.write(jsonWriter, layout.timer());
                    jsonWriter.name("endButton");
                    this.endButtonAdapter.write(jsonWriter, layout.endButton());
                    jsonWriter.name("assetManifest");
                    this.assetManifestAdapter.write(jsonWriter, layout.assetManifest());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public CommonMetaData.Layout read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    StringsObject stringsObject = this.defaultInteractiveStrings;
                    Size size = this.defaultCanvasSize;
                    Double d = this.defaultSubTitleY;
                    List<CommonMetaData.Layout.ChoiceLayout> list = this.defaultChoices;
                    CommonMetaData.Layout.Timer timer = this.defaultTimer;
                    StringsObject stringsObject2 = stringsObject;
                    Size size2 = size;
                    Double d2 = d;
                    List<CommonMetaData.Layout.ChoiceLayout> list2 = list;
                    CommonMetaData.Layout.Timer timer2 = timer;
                    Button button = this.defaultEndButton;
                    AssetManifest assetManifest = this.defaultAssetManifest;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1881759102:
                                    if (nextName.equals("strings")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -367058079:
                                    if (nextName.equals("subTitleY")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 110364485:
                                    if (nextName.equals("timer")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 751720178:
                                    if (nextName.equals("choices")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1123503085:
                                    if (nextName.equals("endButton")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1389268287:
                                    if (nextName.equals("assetManifest")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1463246201:
                                    if (nextName.equals("canvasSize")) {
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
                                    stringsObject2 = this.interactiveStringsAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    d2 = this.subTitleYAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    timer2 = this.timerAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    list2 = this.choicesAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    button = this.endButtonAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    assetManifest = this.assetManifestAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    size2 = this.canvasSizeAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_CommonMetaData_Layout(stringsObject2, size2, d2, list2, timer2, button, assetManifest);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(interactiveStrings(), i);
        parcel.writeParcelable(canvasSize(), i);
        parcel.writeDouble(subTitleY().doubleValue());
        parcel.writeList(choices());
        parcel.writeParcelable(timer(), i);
        parcel.writeParcelable(endButton(), i);
        parcel.writeParcelable(assetManifest(), i);
    }
}
