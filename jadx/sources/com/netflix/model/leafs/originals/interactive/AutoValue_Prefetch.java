package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Prefetch extends C$AutoValue_Prefetch {
    public static final Parcelable.Creator<AutoValue_Prefetch> CREATOR = new Parcelable.Creator<AutoValue_Prefetch>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_Prefetch.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Prefetch createFromParcel(Parcel parcel) {
            return new AutoValue_Prefetch(parcel.readString(), parcel.readInt() == 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readArrayList(Prefetch.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Prefetch[] newArray(int i) {
            return new AutoValue_Prefetch[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Prefetch(String str, Long l, List<Long> list) {
        new C$$AutoValue_Prefetch(str, l, list) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Prefetch

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_Prefetch$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Prefetch> {
                private String defaultIntent = null;
                private Long defaultTtlSec = null;
                private List<Long> defaultWindowMs = null;
                private final TypeAdapter<String> intentAdapter;
                private final TypeAdapter<Long> ttlSecAdapter;
                private final TypeAdapter<List<Long>> windowMsAdapter;

                public GsonTypeAdapter setDefaultIntent(String str) {
                    this.defaultIntent = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultTtlSec(Long l) {
                    this.defaultTtlSec = l;
                    return this;
                }

                public GsonTypeAdapter setDefaultWindowMs(List<Long> list) {
                    this.defaultWindowMs = list;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.intentAdapter = gson.getAdapter(String.class);
                    this.ttlSecAdapter = gson.getAdapter(Long.class);
                    this.windowMsAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, Long.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Prefetch prefetch) {
                    if (prefetch == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("intent");
                    this.intentAdapter.write(jsonWriter, prefetch.intent());
                    jsonWriter.name("ttlSec");
                    this.ttlSecAdapter.write(jsonWriter, prefetch.ttlSec());
                    jsonWriter.name("windowMs");
                    this.windowMsAdapter.write(jsonWriter, prefetch.windowMs());
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
                public com.netflix.model.leafs.originals.interactive.Prefetch read(com.google.gson.stream.JsonReader r9) {
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
                        java.lang.String r0 = r8.defaultIntent
                        java.lang.Long r1 = r8.defaultTtlSec
                        java.util.List<java.lang.Long> r2 = r8.defaultWindowMs
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
                        r5 = -1183762788(0xffffffffb971369c, float:-2.3003895E-4)
                        r6 = 2
                        r7 = 1
                        if (r4 == r5) goto L5b
                        r5 = -1115379274(0xffffffffbd84a9b6, float:-0.06477682)
                        if (r4 == r5) goto L50
                        r5 = -863556923(0xffffffffcc872ac5, float:-7.0866472E7)
                        if (r4 == r5) goto L45
                        goto L63
                    L45:
                        java.lang.String r4 = "ttlSec"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L4e
                        goto L63
                    L4e:
                        r3 = r6
                        goto L66
                    L50:
                        java.lang.String r4 = "windowMs"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L59
                        goto L63
                    L59:
                        r3 = r7
                        goto L66
                    L5b:
                        java.lang.String r4 = "intent"
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
                        com.google.gson.TypeAdapter<java.lang.Long> r1 = r8.ttlSecAdapter
                        java.lang.Object r1 = r1.read(r9)
                        java.lang.Long r1 = (java.lang.Long) r1
                        goto L16
                    L79:
                        com.google.gson.TypeAdapter<java.util.List<java.lang.Long>> r2 = r8.windowMsAdapter
                        java.lang.Object r2 = r2.read(r9)
                        java.util.List r2 = (java.util.List) r2
                        goto L16
                    L82:
                        com.google.gson.TypeAdapter<java.lang.String> r0 = r8.intentAdapter
                        java.lang.Object r0 = r0.read(r9)
                        java.lang.String r0 = (java.lang.String) r0
                        goto L16
                    L8b:
                        r9.endObject()
                        com.netflix.model.leafs.originals.interactive.AutoValue_Prefetch r9 = new com.netflix.model.leafs.originals.interactive.AutoValue_Prefetch
                        r9.<init>(r0, r1, r2)
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.model.leafs.originals.interactive.C$AutoValue_Prefetch.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.model.leafs.originals.interactive.Prefetch");
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(intent());
        if (ttlSec() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeLong(ttlSec().longValue());
        }
        parcel.writeList(windowMs());
    }
}
