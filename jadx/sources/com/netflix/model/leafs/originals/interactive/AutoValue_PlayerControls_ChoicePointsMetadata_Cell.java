package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.Audio;
import com.netflix.model.leafs.originals.interactive.PlayerControls;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_PlayerControls_ChoicePointsMetadata_Cell extends C$AutoValue_PlayerControls_ChoicePointsMetadata_Cell {
    public static final Parcelable.Creator<AutoValue_PlayerControls_ChoicePointsMetadata_Cell> CREATOR = new Parcelable.Creator<AutoValue_PlayerControls_ChoicePointsMetadata_Cell>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_PlayerControls_ChoicePointsMetadata_Cell.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_ChoicePointsMetadata_Cell createFromParcel(Parcel parcel) {
            return new AutoValue_PlayerControls_ChoicePointsMetadata_Cell((SourceRect) parcel.readParcelable(PlayerControls.ChoicePointsMetadata.Cell.class.getClassLoader()), parcel.readArrayList(PlayerControls.ChoicePointsMetadata.Cell.class.getClassLoader()), parcel.readArrayList(PlayerControls.ChoicePointsMetadata.Cell.class.getClassLoader()), (PlayerControls.ChoicePointsMetadata.Cell.MainView) parcel.readParcelable(PlayerControls.ChoicePointsMetadata.Cell.class.getClassLoader()), (PlayerControls.ChoicePointsMetadata.Cell.Focus) parcel.readParcelable(PlayerControls.ChoicePointsMetadata.Cell.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_ChoicePointsMetadata_Cell[] newArray(int i) {
            return new AutoValue_PlayerControls_ChoicePointsMetadata_Cell[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_PlayerControls_ChoicePointsMetadata_Cell(SourceRect sourceRect, List<SourceRect> list, List<SourceRect> list2, PlayerControls.ChoicePointsMetadata.Cell.MainView mainView, PlayerControls.ChoicePointsMetadata.Cell.Focus focus) {
        new C$$AutoValue_PlayerControls_ChoicePointsMetadata_Cell(sourceRect, list, list2, mainView, focus) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_ChoicePointsMetadata_Cell

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_ChoicePointsMetadata_Cell$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<PlayerControls.ChoicePointsMetadata.Cell> {
                private final TypeAdapter<List<SourceRect>> buttonsAdapter;
                private final TypeAdapter<List<SourceRect>> choicePositionAdapter;
                private final TypeAdapter<PlayerControls.ChoicePointsMetadata.Cell.Focus> focusAdapter;
                private final TypeAdapter<PlayerControls.ChoicePointsMetadata.Cell.MainView> mainViewAdapter;
                private final TypeAdapter<SourceRect> rectAdapter;
                private SourceRect defaultRect = null;
                private List<SourceRect> defaultButtons = null;
                private List<SourceRect> defaultChoicePosition = null;
                private PlayerControls.ChoicePointsMetadata.Cell.MainView defaultMainView = null;
                private PlayerControls.ChoicePointsMetadata.Cell.Focus defaultFocus = null;

                public GsonTypeAdapter setDefaultButtons(List<SourceRect> list) {
                    this.defaultButtons = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultChoicePosition(List<SourceRect> list) {
                    this.defaultChoicePosition = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultFocus(PlayerControls.ChoicePointsMetadata.Cell.Focus focus) {
                    this.defaultFocus = focus;
                    return this;
                }

                public GsonTypeAdapter setDefaultMainView(PlayerControls.ChoicePointsMetadata.Cell.MainView mainView) {
                    this.defaultMainView = mainView;
                    return this;
                }

                public GsonTypeAdapter setDefaultRect(SourceRect sourceRect) {
                    this.defaultRect = sourceRect;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.rectAdapter = gson.getAdapter(SourceRect.class);
                    this.buttonsAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, SourceRect.class));
                    this.choicePositionAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, SourceRect.class));
                    this.mainViewAdapter = gson.getAdapter(PlayerControls.ChoicePointsMetadata.Cell.MainView.class);
                    this.focusAdapter = gson.getAdapter(PlayerControls.ChoicePointsMetadata.Cell.Focus.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, PlayerControls.ChoicePointsMetadata.Cell cell) {
                    if (cell == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("rect");
                    this.rectAdapter.write(jsonWriter, cell.rect());
                    jsonWriter.name("buttons");
                    this.buttonsAdapter.write(jsonWriter, cell.buttons());
                    jsonWriter.name("choicePosition");
                    this.choicePositionAdapter.write(jsonWriter, cell.choicePosition());
                    jsonWriter.name("mainView");
                    this.mainViewAdapter.write(jsonWriter, cell.mainView());
                    jsonWriter.name(Audio.TYPE.choiceFocus);
                    this.focusAdapter.write(jsonWriter, cell.focus());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public PlayerControls.ChoicePointsMetadata.Cell read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    SourceRect sourceRect = this.defaultRect;
                    List<SourceRect> list = this.defaultButtons;
                    SourceRect sourceRect2 = sourceRect;
                    List<SourceRect> list2 = list;
                    List<SourceRect> list3 = this.defaultChoicePosition;
                    PlayerControls.ChoicePointsMetadata.Cell.MainView mainView = this.defaultMainView;
                    PlayerControls.ChoicePointsMetadata.Cell.Focus focus = this.defaultFocus;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -844682774:
                                    if (nextName.equals("choicePosition")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -8376322:
                                    if (nextName.equals("mainView")) {
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
                                case 97604824:
                                    if (nextName.equals(Audio.TYPE.choiceFocus)) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 241352577:
                                    if (nextName.equals("buttons")) {
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
                                list3 = this.choicePositionAdapter.read(jsonReader);
                            } else if (c == 1) {
                                mainView = this.mainViewAdapter.read(jsonReader);
                            } else if (c == 2) {
                                sourceRect2 = this.rectAdapter.read(jsonReader);
                            } else if (c == 3) {
                                focus = this.focusAdapter.read(jsonReader);
                            } else if (c == 4) {
                                list2 = this.buttonsAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_PlayerControls_ChoicePointsMetadata_Cell(sourceRect2, list2, list3, mainView, focus);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(rect(), i);
        parcel.writeList(buttons());
        parcel.writeList(choicePosition());
        parcel.writeParcelable(mainView(), i);
        parcel.writeParcelable(focus(), i);
    }
}
