package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_InteractiveDebugMenuItem extends C$AutoValue_InteractiveDebugMenuItem {
    public static final Parcelable.Creator<AutoValue_InteractiveDebugMenuItem> CREATOR = new Parcelable.Creator<AutoValue_InteractiveDebugMenuItem>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_InteractiveDebugMenuItem.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_InteractiveDebugMenuItem createFromParcel(Parcel parcel) {
            return new AutoValue_InteractiveDebugMenuItem(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_InteractiveDebugMenuItem[] newArray(int i) {
            return new AutoValue_InteractiveDebugMenuItem[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_InteractiveDebugMenuItem(final String str, final String str2, final String str3, final Double d) {
        new C$$AutoValue_InteractiveDebugMenuItem(str, str2, str3, d) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_InteractiveDebugMenuItem

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_InteractiveDebugMenuItem$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<InteractiveDebugMenuItem> {
                private String defaultId = null;
                private String defaultLabel = null;
                private String defaultSegmentId = null;
                private Double defaultStartTime = null;
                private final TypeAdapter<String> idAdapter;
                private final TypeAdapter<String> labelAdapter;
                private final TypeAdapter<String> segmentIdAdapter;
                private final TypeAdapter<Double> startTimeAdapter;

                public GsonTypeAdapter setDefaultId(String str) {
                    this.defaultId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultLabel(String str) {
                    this.defaultLabel = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultSegmentId(String str) {
                    this.defaultSegmentId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultStartTime(Double d) {
                    this.defaultStartTime = d;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.idAdapter = gson.getAdapter(String.class);
                    this.labelAdapter = gson.getAdapter(String.class);
                    this.segmentIdAdapter = gson.getAdapter(String.class);
                    this.startTimeAdapter = gson.getAdapter(Double.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, InteractiveDebugMenuItem interactiveDebugMenuItem) {
                    if (interactiveDebugMenuItem == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.idAdapter.write(jsonWriter, interactiveDebugMenuItem.id());
                    jsonWriter.name("label");
                    this.labelAdapter.write(jsonWriter, interactiveDebugMenuItem.label());
                    jsonWriter.name("segmentId");
                    this.segmentIdAdapter.write(jsonWriter, interactiveDebugMenuItem.segmentId());
                    jsonWriter.name("startTime");
                    this.startTimeAdapter.write(jsonWriter, interactiveDebugMenuItem.startTime());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Removed duplicated region for block: B:51:0x00a0 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:58:0x007a A[SYNTHETIC] */
                @Override // com.google.gson.TypeAdapter
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.netflix.model.leafs.originals.interactive.InteractiveDebugMenuItem read(com.google.gson.stream.JsonReader r11) {
                    /*
                        r10 = this;
                        com.google.gson.stream.JsonToken r0 = r11.peek()
                        com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                        if (r0 != r1) goto Ld
                        r11.nextNull()
                        r11 = 0
                        return r11
                    Ld:
                        r11.beginObject()
                        java.lang.String r0 = r10.defaultId
                        java.lang.String r1 = r10.defaultLabel
                        java.lang.String r2 = r10.defaultSegmentId
                        java.lang.Double r3 = r10.defaultStartTime
                    L18:
                        boolean r4 = r11.hasNext()
                        if (r4 == 0) goto Laa
                        java.lang.String r4 = r11.nextName()
                        com.google.gson.stream.JsonToken r5 = r11.peek()
                        com.google.gson.stream.JsonToken r6 = com.google.gson.stream.JsonToken.NULL
                        if (r5 != r6) goto L2e
                        r11.nextNull()
                        goto L18
                    L2e:
                        r4.hashCode()
                        int r5 = r4.hashCode()
                        r6 = -2129294769(0xffffffff81158a4f, float:-2.746621E-38)
                        r7 = 3
                        r8 = 2
                        r9 = 1
                        if (r5 == r6) goto L6d
                        r6 = -1627805778(0xffffffff9ef9a7ae, float:-2.6433251E-20)
                        if (r5 == r6) goto L62
                        r6 = 3355(0xd1b, float:4.701E-42)
                        if (r5 == r6) goto L57
                        r6 = 102727412(0x61f7ef4, float:2.9997847E-35)
                        if (r5 == r6) goto L4c
                        goto L75
                    L4c:
                        java.lang.String r5 = "label"
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L55
                        goto L75
                    L55:
                        r4 = r7
                        goto L78
                    L57:
                        java.lang.String r5 = "id"
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L60
                        goto L75
                    L60:
                        r4 = r8
                        goto L78
                    L62:
                        java.lang.String r5 = "segmentId"
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L6b
                        goto L75
                    L6b:
                        r4 = r9
                        goto L78
                    L6d:
                        java.lang.String r5 = "startTime"
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L77
                    L75:
                        r4 = -1
                        goto L78
                    L77:
                        r4 = 0
                    L78:
                        if (r4 == 0) goto La0
                        if (r4 == r9) goto L96
                        if (r4 == r8) goto L8d
                        if (r4 == r7) goto L84
                        r11.skipValue()
                        goto L18
                    L84:
                        com.google.gson.TypeAdapter<java.lang.String> r1 = r10.labelAdapter
                        java.lang.Object r1 = r1.read(r11)
                        java.lang.String r1 = (java.lang.String) r1
                        goto L18
                    L8d:
                        com.google.gson.TypeAdapter<java.lang.String> r0 = r10.idAdapter
                        java.lang.Object r0 = r0.read(r11)
                        java.lang.String r0 = (java.lang.String) r0
                        goto L18
                    L96:
                        com.google.gson.TypeAdapter<java.lang.String> r2 = r10.segmentIdAdapter
                        java.lang.Object r2 = r2.read(r11)
                        java.lang.String r2 = (java.lang.String) r2
                        goto L18
                    La0:
                        com.google.gson.TypeAdapter<java.lang.Double> r3 = r10.startTimeAdapter
                        java.lang.Object r3 = r3.read(r11)
                        java.lang.Double r3 = (java.lang.Double) r3
                        goto L18
                    Laa:
                        r11.endObject()
                        com.netflix.model.leafs.originals.interactive.AutoValue_InteractiveDebugMenuItem r11 = new com.netflix.model.leafs.originals.interactive.AutoValue_InteractiveDebugMenuItem
                        r11.<init>(r0, r1, r2, r3)
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.model.leafs.originals.interactive.C$AutoValue_InteractiveDebugMenuItem.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.model.leafs.originals.interactive.InteractiveDebugMenuItem");
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (id() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(id());
        }
        if (label() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(label());
        }
        if (segmentId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(segmentId());
        }
        if (startTime() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeDouble(startTime().doubleValue());
    }
}
