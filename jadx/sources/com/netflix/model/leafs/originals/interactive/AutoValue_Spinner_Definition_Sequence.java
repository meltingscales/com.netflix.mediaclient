package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.Spinner;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Spinner_Definition_Sequence extends C$AutoValue_Spinner_Definition_Sequence {
    public static final Parcelable.Creator<AutoValue_Spinner_Definition_Sequence> CREATOR = new Parcelable.Creator<AutoValue_Spinner_Definition_Sequence>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_Spinner_Definition_Sequence.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Spinner_Definition_Sequence createFromParcel(Parcel parcel) {
            return new AutoValue_Spinner_Definition_Sequence(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Spinner_Definition_Sequence[] newArray(int i) {
            return new AutoValue_Spinner_Definition_Sequence[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Spinner_Definition_Sequence(final int i, final int i2, final int i3, final int i4) {
        new C$$AutoValue_Spinner_Definition_Sequence(i, i2, i3, i4) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Spinner_Definition_Sequence

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_Spinner_Definition_Sequence$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Spinner.Definition.Sequence> {
                private int defaultH = 0;
                private int defaultW = 0;
                private int defaultX = 0;
                private int defaultY = 0;
                private final TypeAdapter<Integer> hAdapter;
                private final TypeAdapter<Integer> wAdapter;
                private final TypeAdapter<Integer> xAdapter;
                private final TypeAdapter<Integer> yAdapter;

                public GsonTypeAdapter setDefaultH(int i) {
                    this.defaultH = i;
                    return this;
                }

                public GsonTypeAdapter setDefaultW(int i) {
                    this.defaultW = i;
                    return this;
                }

                public GsonTypeAdapter setDefaultX(int i) {
                    this.defaultX = i;
                    return this;
                }

                public GsonTypeAdapter setDefaultY(int i) {
                    this.defaultY = i;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.hAdapter = gson.getAdapter(Integer.class);
                    this.wAdapter = gson.getAdapter(Integer.class);
                    this.xAdapter = gson.getAdapter(Integer.class);
                    this.yAdapter = gson.getAdapter(Integer.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Spinner.Definition.Sequence sequence) {
                    if (sequence == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("h");
                    this.hAdapter.write(jsonWriter, Integer.valueOf(sequence.h()));
                    jsonWriter.name("w");
                    this.wAdapter.write(jsonWriter, Integer.valueOf(sequence.w()));
                    jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.X);
                    this.xAdapter.write(jsonWriter, Integer.valueOf(sequence.x()));
                    jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.Y);
                    this.yAdapter.write(jsonWriter, Integer.valueOf(sequence.y()));
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Removed duplicated region for block: B:46:0x00a0 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:53:0x006e A[SYNTHETIC] */
                @Override // com.google.gson.TypeAdapter
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.netflix.model.leafs.originals.interactive.Spinner.Definition.Sequence read(com.google.gson.stream.JsonReader r11) {
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
                        int r0 = r10.defaultH
                        int r1 = r10.defaultW
                        int r2 = r10.defaultX
                        int r3 = r10.defaultY
                    L18:
                        boolean r4 = r11.hasNext()
                        if (r4 == 0) goto Lae
                        java.lang.String r4 = r11.nextName()
                        com.google.gson.stream.JsonToken r5 = r11.peek()
                        com.google.gson.stream.JsonToken r6 = com.google.gson.stream.JsonToken.NULL
                        if (r5 != r6) goto L2e
                        r11.nextNull()
                        goto L18
                    L2e:
                        r4.hashCode()
                        int r5 = r4.hashCode()
                        r6 = 104(0x68, float:1.46E-43)
                        r7 = 3
                        r8 = 2
                        r9 = 1
                        if (r5 == r6) goto L61
                        switch(r5) {
                            case 119: goto L56;
                            case 120: goto L4b;
                            case 121: goto L40;
                            default: goto L3f;
                        }
                    L3f:
                        goto L69
                    L40:
                        java.lang.String r5 = "y"
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L49
                        goto L69
                    L49:
                        r4 = r7
                        goto L6c
                    L4b:
                        java.lang.String r5 = "x"
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L54
                        goto L69
                    L54:
                        r4 = r8
                        goto L6c
                    L56:
                        java.lang.String r5 = "w"
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L5f
                        goto L69
                    L5f:
                        r4 = r9
                        goto L6c
                    L61:
                        java.lang.String r5 = "h"
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L6b
                    L69:
                        r4 = -1
                        goto L6c
                    L6b:
                        r4 = 0
                    L6c:
                        if (r4 == 0) goto La0
                        if (r4 == r9) goto L92
                        if (r4 == r8) goto L85
                        if (r4 == r7) goto L78
                        r11.skipValue()
                        goto L18
                    L78:
                        com.google.gson.TypeAdapter<java.lang.Integer> r3 = r10.yAdapter
                        java.lang.Object r3 = r3.read(r11)
                        java.lang.Integer r3 = (java.lang.Integer) r3
                        int r3 = r3.intValue()
                        goto L18
                    L85:
                        com.google.gson.TypeAdapter<java.lang.Integer> r2 = r10.xAdapter
                        java.lang.Object r2 = r2.read(r11)
                        java.lang.Integer r2 = (java.lang.Integer) r2
                        int r2 = r2.intValue()
                        goto L18
                    L92:
                        com.google.gson.TypeAdapter<java.lang.Integer> r1 = r10.wAdapter
                        java.lang.Object r1 = r1.read(r11)
                        java.lang.Integer r1 = (java.lang.Integer) r1
                        int r1 = r1.intValue()
                        goto L18
                    La0:
                        com.google.gson.TypeAdapter<java.lang.Integer> r0 = r10.hAdapter
                        java.lang.Object r0 = r0.read(r11)
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        int r0 = r0.intValue()
                        goto L18
                    Lae:
                        r11.endObject()
                        com.netflix.model.leafs.originals.interactive.AutoValue_Spinner_Definition_Sequence r11 = new com.netflix.model.leafs.originals.interactive.AutoValue_Spinner_Definition_Sequence
                        r11.<init>(r0, r1, r2, r3)
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.model.leafs.originals.interactive.C$AutoValue_Spinner_Definition_Sequence.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.model.leafs.originals.interactive.Spinner$Definition$Sequence");
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(h());
        parcel.writeInt(w());
        parcel.writeInt(x());
        parcel.writeInt(y());
    }
}
