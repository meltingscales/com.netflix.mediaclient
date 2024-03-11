package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.PlayerControls;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_PlayerControls_ChoicePointsMetadata_TimeStamp extends C$AutoValue_PlayerControls_ChoicePointsMetadata_TimeStamp {
    public static final Parcelable.Creator<AutoValue_PlayerControls_ChoicePointsMetadata_TimeStamp> CREATOR = new Parcelable.Creator<AutoValue_PlayerControls_ChoicePointsMetadata_TimeStamp>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_PlayerControls_ChoicePointsMetadata_TimeStamp.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_ChoicePointsMetadata_TimeStamp createFromParcel(Parcel parcel) {
            return new AutoValue_PlayerControls_ChoicePointsMetadata_TimeStamp(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_ChoicePointsMetadata_TimeStamp[] newArray(int i) {
            return new AutoValue_PlayerControls_ChoicePointsMetadata_TimeStamp[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_PlayerControls_ChoicePointsMetadata_TimeStamp(final String str, final Integer num, final String str2) {
        new C$$AutoValue_PlayerControls_ChoicePointsMetadata_TimeStamp(str, num, str2) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_ChoicePointsMetadata_TimeStamp

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_ChoicePointsMetadata_TimeStamp$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<PlayerControls.ChoicePointsMetadata.TimeStamp> {
                private final TypeAdapter<String> descriptionAdapter;
                private final TypeAdapter<String> segmentIdAdapter;
                private final TypeAdapter<Integer> startTimeMsAdapter;
                private String defaultDescription = null;
                private Integer defaultStartTimeMs = null;
                private String defaultSegmentId = null;

                public GsonTypeAdapter setDefaultDescription(String str) {
                    this.defaultDescription = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultSegmentId(String str) {
                    this.defaultSegmentId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultStartTimeMs(Integer num) {
                    this.defaultStartTimeMs = num;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.descriptionAdapter = gson.getAdapter(String.class);
                    this.startTimeMsAdapter = gson.getAdapter(Integer.class);
                    this.segmentIdAdapter = gson.getAdapter(String.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, PlayerControls.ChoicePointsMetadata.TimeStamp timeStamp) {
                    if (timeStamp == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("description");
                    this.descriptionAdapter.write(jsonWriter, timeStamp.description());
                    jsonWriter.name("startTimeMs");
                    this.startTimeMsAdapter.write(jsonWriter, timeStamp.startTimeMs());
                    jsonWriter.name("segmentId");
                    this.segmentIdAdapter.write(jsonWriter, timeStamp.segmentId());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0082 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0068 A[SYNTHETIC] */
                @Override // com.google.gson.TypeAdapter
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.netflix.model.leafs.originals.interactive.PlayerControls.ChoicePointsMetadata.TimeStamp read(com.google.gson.stream.JsonReader r9) {
                    /*
                        r8 = this;
                        com.google.gson.stream.JsonToken r0 = r9.peek()
                        com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                        if (r0 != r1) goto Ld
                        r9.nextNull()
                        r9 = 0
                        return r9
                    Ld:
                        r9.beginObject()
                        java.lang.String r0 = r8.defaultDescription
                        java.lang.Integer r1 = r8.defaultStartTimeMs
                        java.lang.String r2 = r8.defaultSegmentId
                    L16:
                        boolean r3 = r9.hasNext()
                        if (r3 == 0) goto L8b
                        java.lang.String r3 = r9.nextName()
                        com.google.gson.stream.JsonToken r4 = r9.peek()
                        com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.NULL
                        if (r4 != r5) goto L2c
                        r9.nextNull()
                        goto L16
                    L2c:
                        r3.hashCode()
                        int r4 = r3.hashCode()
                        r5 = -1847837611(0xffffffff91dc3c55, float:-3.4747062E-28)
                        r6 = 2
                        r7 = 1
                        if (r4 == r5) goto L5b
                        r5 = -1724546052(0xffffffff993583fc, float:-9.384135E-24)
                        if (r4 == r5) goto L50
                        r5 = -1627805778(0xffffffff9ef9a7ae, float:-2.6433251E-20)
                        if (r4 == r5) goto L45
                        goto L63
                    L45:
                        java.lang.String r4 = "segmentId"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L4e
                        goto L63
                    L4e:
                        r3 = r6
                        goto L66
                    L50:
                        java.lang.String r4 = "description"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L59
                        goto L63
                    L59:
                        r3 = r7
                        goto L66
                    L5b:
                        java.lang.String r4 = "startTimeMs"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L65
                    L63:
                        r3 = -1
                        goto L66
                    L65:
                        r3 = 0
                    L66:
                        if (r3 == 0) goto L82
                        if (r3 == r7) goto L79
                        if (r3 == r6) goto L70
                        r9.skipValue()
                        goto L16
                    L70:
                        com.google.gson.TypeAdapter<java.lang.String> r2 = r8.segmentIdAdapter
                        java.lang.Object r2 = r2.read(r9)
                        java.lang.String r2 = (java.lang.String) r2
                        goto L16
                    L79:
                        com.google.gson.TypeAdapter<java.lang.String> r0 = r8.descriptionAdapter
                        java.lang.Object r0 = r0.read(r9)
                        java.lang.String r0 = (java.lang.String) r0
                        goto L16
                    L82:
                        com.google.gson.TypeAdapter<java.lang.Integer> r1 = r8.startTimeMsAdapter
                        java.lang.Object r1 = r1.read(r9)
                        java.lang.Integer r1 = (java.lang.Integer) r1
                        goto L16
                    L8b:
                        r9.endObject()
                        com.netflix.model.leafs.originals.interactive.AutoValue_PlayerControls_ChoicePointsMetadata_TimeStamp r9 = new com.netflix.model.leafs.originals.interactive.AutoValue_PlayerControls_ChoicePointsMetadata_TimeStamp
                        r9.<init>(r0, r1, r2)
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.model.leafs.originals.interactive.C$AutoValue_PlayerControls_ChoicePointsMetadata_TimeStamp.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.model.leafs.originals.interactive.PlayerControls$ChoicePointsMetadata$TimeStamp");
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (description() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(description());
        }
        if (startTimeMs() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(startTimeMs().intValue());
        }
        if (segmentId() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(segmentId());
    }
}
