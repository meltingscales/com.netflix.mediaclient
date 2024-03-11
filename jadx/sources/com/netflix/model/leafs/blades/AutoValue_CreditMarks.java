package com.netflix.model.leafs.blades;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_CreditMarks extends C$AutoValue_CreditMarks {
    public static final Parcelable.Creator<AutoValue_CreditMarks> CREATOR = new Parcelable.Creator<AutoValue_CreditMarks>() { // from class: com.netflix.model.leafs.blades.AutoValue_CreditMarks.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CreditMarks createFromParcel(Parcel parcel) {
            return new AutoValue_CreditMarks(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CreditMarks[] newArray(int i) {
            return new AutoValue_CreditMarks[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_CreditMarks(final int i, final int i2, final int i3, final int i4) {
        new C$$AutoValue_CreditMarks(i, i2, i3, i4) { // from class: com.netflix.model.leafs.blades.$AutoValue_CreditMarks

            /* renamed from: com.netflix.model.leafs.blades.$AutoValue_CreditMarks$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<CreditMarks> {
                private final TypeAdapter<Integer> endCreditAdapter;
                private final TypeAdapter<Integer> endRecapAdapter;
                private final TypeAdapter<Integer> startCreditAdapter;
                private final TypeAdapter<Integer> startRecapAdapter;
                private int defaultStartCredit = 0;
                private int defaultEndCredit = 0;
                private int defaultStartRecap = 0;
                private int defaultEndRecap = 0;

                public GsonTypeAdapter setDefaultEndCredit(int i) {
                    this.defaultEndCredit = i;
                    return this;
                }

                public GsonTypeAdapter setDefaultEndRecap(int i) {
                    this.defaultEndRecap = i;
                    return this;
                }

                public GsonTypeAdapter setDefaultStartCredit(int i) {
                    this.defaultStartCredit = i;
                    return this;
                }

                public GsonTypeAdapter setDefaultStartRecap(int i) {
                    this.defaultStartRecap = i;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.startCreditAdapter = gson.getAdapter(Integer.class);
                    this.endCreditAdapter = gson.getAdapter(Integer.class);
                    this.startRecapAdapter = gson.getAdapter(Integer.class);
                    this.endRecapAdapter = gson.getAdapter(Integer.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, CreditMarks creditMarks) {
                    if (creditMarks == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("startcredit");
                    this.startCreditAdapter.write(jsonWriter, Integer.valueOf(creditMarks.startCredit()));
                    jsonWriter.name("endcredit");
                    this.endCreditAdapter.write(jsonWriter, Integer.valueOf(creditMarks.endCredit()));
                    jsonWriter.name("startrecap");
                    this.startRecapAdapter.write(jsonWriter, Integer.valueOf(creditMarks.startRecap()));
                    jsonWriter.name("endrecap");
                    this.endRecapAdapter.write(jsonWriter, Integer.valueOf(creditMarks.endRecap()));
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public CreditMarks read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    int i = this.defaultStartCredit;
                    int i2 = this.defaultEndCredit;
                    int i3 = this.defaultStartRecap;
                    int i4 = this.defaultEndRecap;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1556051555:
                                    if (nextName.equals("startrecap")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1410327077:
                                    if (nextName.equals("startcredit")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1742645444:
                                    if (nextName.equals("endrecap")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 2065032084:
                                    if (nextName.equals("endcredit")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                i3 = this.startRecapAdapter.read(jsonReader).intValue();
                            } else if (c == 1) {
                                i = this.startCreditAdapter.read(jsonReader).intValue();
                            } else if (c == 2) {
                                i4 = this.endRecapAdapter.read(jsonReader).intValue();
                            } else if (c == 3) {
                                i2 = this.endCreditAdapter.read(jsonReader).intValue();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_CreditMarks(i, i2, i3, i4);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(startCredit());
        parcel.writeInt(endCredit());
        parcel.writeInt(startRecap());
        parcel.writeInt(endRecap());
    }
}
