package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.Button;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Button extends C$AutoValue_Button {
    public static final Parcelable.Creator<AutoValue_Button> CREATOR = new Parcelable.Creator<AutoValue_Button>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_Button.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Button createFromParcel(Parcel parcel) {
            Action action = (Action) parcel.readParcelable(Button.class.getClassLoader());
            Button.Label label = (Button.Label) parcel.readParcelable(Button.class.getClassLoader());
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            return new AutoValue_Button(action, label, Integer.valueOf(readInt), Integer.valueOf(readInt2), (SourceRect) parcel.readParcelable(Button.class.getClassLoader()), (ScreenPosition) parcel.readParcelable(Button.class.getClassLoader()), (Button.States) parcel.readParcelable(Button.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Button[] newArray(int i) {
            return new AutoValue_Button[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Button(Action action, Button.Label label, Integer num, Integer num2, SourceRect sourceRect, ScreenPosition screenPosition, Button.States states) {
        new C$$AutoValue_Button(action, label, num, num2, sourceRect, screenPosition, states) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Button

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_Button$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Button> {
                private final TypeAdapter<Action> actionAdapter;
                private final TypeAdapter<Integer> baselineYAdapter;
                private final TypeAdapter<Integer> fontSizeAdapter;
                private final TypeAdapter<Button.Label> labelAdapter;
                private final TypeAdapter<SourceRect> rectAdapter;
                private final TypeAdapter<ScreenPosition> screenPositionAdapter;
                private final TypeAdapter<Button.States> statesAdapter;
                private Action defaultAction = null;
                private Button.Label defaultLabel = null;
                private Integer defaultFontSize = null;
                private Integer defaultBaselineY = null;
                private SourceRect defaultRect = null;
                private ScreenPosition defaultScreenPosition = null;
                private Button.States defaultStates = null;

                public GsonTypeAdapter setDefaultAction(Action action) {
                    this.defaultAction = action;
                    return this;
                }

                public GsonTypeAdapter setDefaultBaselineY(Integer num) {
                    this.defaultBaselineY = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultFontSize(Integer num) {
                    this.defaultFontSize = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultLabel(Button.Label label) {
                    this.defaultLabel = label;
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

                public GsonTypeAdapter setDefaultStates(Button.States states) {
                    this.defaultStates = states;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.actionAdapter = gson.getAdapter(Action.class);
                    this.labelAdapter = gson.getAdapter(Button.Label.class);
                    this.fontSizeAdapter = gson.getAdapter(Integer.class);
                    this.baselineYAdapter = gson.getAdapter(Integer.class);
                    this.rectAdapter = gson.getAdapter(SourceRect.class);
                    this.screenPositionAdapter = gson.getAdapter(ScreenPosition.class);
                    this.statesAdapter = gson.getAdapter(Button.States.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Button button) {
                    if (button == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Error.DEBUG_INFO_ACTION);
                    this.actionAdapter.write(jsonWriter, button.action());
                    jsonWriter.name("label");
                    this.labelAdapter.write(jsonWriter, button.label());
                    jsonWriter.name("fontSize");
                    this.fontSizeAdapter.write(jsonWriter, button.fontSize());
                    jsonWriter.name("baselineY");
                    this.baselineYAdapter.write(jsonWriter, button.baselineY());
                    jsonWriter.name("rect");
                    this.rectAdapter.write(jsonWriter, button.rect());
                    jsonWriter.name("screenPosition");
                    this.screenPositionAdapter.write(jsonWriter, button.screenPosition());
                    jsonWriter.name("states");
                    this.statesAdapter.write(jsonWriter, button.states());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public Button read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    Action action = this.defaultAction;
                    Button.Label label = this.defaultLabel;
                    Integer num = this.defaultFontSize;
                    Integer num2 = this.defaultBaselineY;
                    SourceRect sourceRect = this.defaultRect;
                    Action action2 = action;
                    Button.Label label2 = label;
                    Integer num3 = num;
                    Integer num4 = num2;
                    SourceRect sourceRect2 = sourceRect;
                    ScreenPosition screenPosition = this.defaultScreenPosition;
                    Button.States states = this.defaultStates;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1804737868:
                                    if (nextName.equals("baselineY")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1422950858:
                                    if (nextName.equals(SignupConstants.Error.DEBUG_INFO_ACTION)) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -892482046:
                                    if (nextName.equals("states")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3496420:
                                    if (nextName.equals("rect")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 102727412:
                                    if (nextName.equals("label")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 365601008:
                                    if (nextName.equals("fontSize")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 628199861:
                                    if (nextName.equals("screenPosition")) {
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
                                    num4 = this.baselineYAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    action2 = this.actionAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    states = this.statesAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    sourceRect2 = this.rectAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    label2 = this.labelAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    num3 = this.fontSizeAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    screenPosition = this.screenPositionAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_Button(action2, label2, num3, num4, sourceRect2, screenPosition, states);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(action(), i);
        parcel.writeParcelable(label(), i);
        parcel.writeInt(fontSize().intValue());
        parcel.writeInt(baselineY().intValue());
        parcel.writeParcelable(rect(), i);
        parcel.writeParcelable(screenPosition(), i);
        parcel.writeParcelable(states(), i);
    }
}
