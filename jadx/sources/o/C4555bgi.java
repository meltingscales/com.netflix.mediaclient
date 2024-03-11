package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bgi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4555bgi extends AbstractC4516bfw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4555bgi(List<String> list, int i, String str, int i2, int i3, int i4, String str2, int i5, int i6) {
        super(list, i, str, i2, i3, i4, str2, i5, i6);
    }

    /* renamed from: o.bgi$b */
    /* loaded from: classes.dex */
    public static final class b extends TypeAdapter<AbstractC4541bgU> {
        private final TypeAdapter<String> h;
        private final TypeAdapter<Integer> k;
        private final TypeAdapter<Integer> l;
        private final TypeAdapter<Integer> m;
        private final TypeAdapter<Integer> n;

        /* renamed from: o  reason: collision with root package name */
        private final TypeAdapter<String> f13594o;
        private final TypeAdapter<Integer> p;
        private final TypeAdapter<List<String>> q;
        private final TypeAdapter<Integer> r;
        private List<String> j = null;
        private int i = 0;
        private String e = null;
        private int g = 0;
        private int a = 0;
        private int f = 0;
        private String b = null;
        private int d = 0;
        private int c = 0;

        public b(Gson gson) {
            this.q = gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
            this.p = gson.getAdapter(Integer.class);
            this.h = gson.getAdapter(String.class);
            this.r = gson.getAdapter(Integer.class);
            this.n = gson.getAdapter(Integer.class);
            this.m = gson.getAdapter(Integer.class);
            this.f13594o = gson.getAdapter(String.class);
            this.k = gson.getAdapter(Integer.class);
            this.l = gson.getAdapter(Integer.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: d */
        public void write(JsonWriter jsonWriter, AbstractC4541bgU abstractC4541bgU) {
            if (abstractC4541bgU == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("urls");
            this.q.write(jsonWriter, abstractC4541bgU.j());
            jsonWriter.name("size");
            this.p.write(jsonWriter, Integer.valueOf(abstractC4541bgU.g()));
            jsonWriter.name("downloadable_id");
            this.h.write(jsonWriter, abstractC4541bgU.e());
            jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
            this.r.write(jsonWriter, Integer.valueOf(abstractC4541bgU.i()));
            jsonWriter.name("interval");
            this.n.write(jsonWriter, Integer.valueOf(abstractC4541bgU.b()));
            jsonWriter.name("pixelsAspectY");
            this.m.write(jsonWriter, Integer.valueOf(abstractC4541bgU.h()));
            jsonWriter.name(SignupConstants.Field.LANG_ID);
            this.f13594o.write(jsonWriter, abstractC4541bgU.a());
            jsonWriter.name("pixelsAspectX");
            this.k.write(jsonWriter, Integer.valueOf(abstractC4541bgU.c()));
            jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
            this.l.write(jsonWriter, Integer.valueOf(abstractC4541bgU.d()));
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: d */
        public AbstractC4541bgU read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            List<String> list = this.j;
            int i = this.i;
            String str = this.e;
            int i2 = this.g;
            int i3 = this.a;
            int i4 = this.f;
            String str2 = this.b;
            List<String> list2 = list;
            int i5 = i;
            String str3 = str;
            int i6 = i2;
            int i7 = i3;
            int i8 = i4;
            String str4 = str2;
            int i9 = this.d;
            int i10 = this.c;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -1221029593:
                            if (nextName.equals(InteractiveAnimation.ANIMATION_TYPE.HEIGHT)) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3355:
                            if (nextName.equals(SignupConstants.Field.LANG_ID)) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3530753:
                            if (nextName.equals("size")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3598564:
                            if (nextName.equals("urls")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 113126854:
                            if (nextName.equals(InteractiveAnimation.ANIMATION_TYPE.WIDTH)) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 493822867:
                            if (nextName.equals("pixelsAspectX")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 493822868:
                            if (nextName.equals("pixelsAspectY")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 570418373:
                            if (nextName.equals("interval")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1827452056:
                            if (nextName.equals("downloadable_id")) {
                                c = '\b';
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
                            i10 = this.l.read(jsonReader).intValue();
                            continue;
                        case 1:
                            str4 = this.f13594o.read(jsonReader);
                            continue;
                        case 2:
                            i5 = this.p.read(jsonReader).intValue();
                            continue;
                        case 3:
                            list2 = this.q.read(jsonReader);
                            continue;
                        case 4:
                            i6 = this.r.read(jsonReader).intValue();
                            continue;
                        case 5:
                            i9 = this.k.read(jsonReader).intValue();
                            continue;
                        case 6:
                            i8 = this.m.read(jsonReader).intValue();
                            continue;
                        case 7:
                            i7 = this.n.read(jsonReader).intValue();
                            continue;
                        case '\b':
                            str3 = this.h.read(jsonReader);
                            continue;
                        default:
                            jsonReader.skipValue();
                            continue;
                    }
                }
            }
            jsonReader.endObject();
            return new C4555bgi(list2, i5, str3, i6, i7, i8, str4, i9, i10);
        }
    }
}
