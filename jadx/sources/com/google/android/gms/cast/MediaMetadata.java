package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.PostPlayItem;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MediaMetadata extends AbstractSafeParcelable {
    private static final zzcb zzc;
    final Bundle zza;
    private final List zzd;
    private int zze;
    private final Writer zzf;
    private static final String[] zzb = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<MediaMetadata> CREATOR = new zzcc();

    /* loaded from: classes2.dex */
    public class Writer {
        public Writer() {
        }
    }

    static {
        zzcb zzcbVar = new zzcb();
        zzcbVar.zzb("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.TITLE", SignupConstants.Field.VIDEO_TITLE, 1);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.ARTIST", "artist", 1);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.EPISODE_NUMBER", PostPlayItem.POST_PLAY_ITEM_EPISODE, 2);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.STUDIO", "studio", 1);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.WIDTH", InteractiveAnimation.ANIMATION_TYPE.WIDTH, 2);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.HEIGHT", InteractiveAnimation.ANIMATION_TYPE.HEIGHT, 2);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration", 5);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia", 5);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime", 5);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer", 5);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId", 2);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle", 1);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber", 2);
        zzcbVar.zzb("com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle", 1);
        zzc = zzcbVar;
    }

    public MediaMetadata() {
        this(0);
    }

    public static void throwIfWrongType(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        int zza = zzc.zza(str);
        if (zza == i || zza == 0) {
            return;
        }
        String str2 = zzb[i];
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
        sb.append("Value for ");
        sb.append(str);
        sb.append(" must be a ");
        sb.append(str2);
        throw new IllegalArgumentException(sb.toString());
    }

    private final boolean zzd(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !zzd((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        this.zza.clear();
        this.zzd.clear();
    }

    public boolean containsKey(String str) {
        return this.zza.containsKey(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaMetadata) {
            MediaMetadata mediaMetadata = (MediaMetadata) obj;
            return zzd(this.zza, mediaMetadata.zza) && this.zzd.equals(mediaMetadata.zzd);
        }
        return false;
    }

    public List<WebImage> getImages() {
        return this.zzd;
    }

    public int getMediaType() {
        return this.zze;
    }

    public String getString(String str) {
        throwIfWrongType(str, 1);
        return this.zza.getString(str);
    }

    public long getTimeMillis(String str) {
        throwIfWrongType(str, 5);
        return this.zza.getLong(str);
    }

    public boolean hasImages() {
        List list = this.zzd;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public int hashCode() {
        Bundle bundle = this.zza;
        int i = 17;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object obj = this.zza.get(str);
                i = (i * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (i * 31) + this.zzd.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, getImages(), false);
        SafeParcelWriter.writeBundle(parcel, 3, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 4, getMediaType());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final JSONObject zza() {
        zzcb zzcbVar;
        String zzc2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.zze);
        } catch (JSONException unused) {
        }
        JSONArray zzc3 = com.google.android.gms.cast.internal.media.zza.zzc(this.zzd);
        if (zzc3.length() != 0) {
            try {
                jSONObject.put("images", zzc3);
            } catch (JSONException unused2) {
            }
        }
        ArrayList<String> arrayList = new ArrayList();
        int i = this.zze;
        if (i == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        try {
            for (String str : arrayList) {
                if (str != null && this.zza.containsKey(str) && (zzc2 = (zzcbVar = zzc).zzc(str)) != null) {
                    int zza = zzcbVar.zza(str);
                    if (zza != 1) {
                        if (zza == 2) {
                            jSONObject.put(zzc2, this.zza.getInt(str));
                        } else if (zza == 3) {
                            jSONObject.put(zzc2, this.zza.getDouble(str));
                        } else if (zza != 4) {
                            if (zza == 5) {
                                jSONObject.put(zzc2, CastUtils.millisecToSec(this.zza.getLong(str)));
                            }
                        }
                    }
                    jSONObject.put(zzc2, this.zza.getString(str));
                }
            }
            for (String str2 : this.zza.keySet()) {
                if (!str2.startsWith("com.google.")) {
                    Object obj = this.zza.get(str2);
                    if (obj instanceof String) {
                        jSONObject.put(str2, obj);
                    } else if (obj instanceof Integer) {
                        jSONObject.put(str2, obj);
                    } else if (obj instanceof Double) {
                        jSONObject.put(str2, obj);
                    }
                }
            }
        } catch (JSONException unused3) {
        }
        return jSONObject;
    }

    public final void zzc(JSONObject jSONObject) {
        clear();
        this.zze = 0;
        try {
            this.zze = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            com.google.android.gms.cast.internal.media.zza.zzd(this.zzd, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i = this.zze;
        if (i == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                if (str != null && !"metadataType".equals(str)) {
                    zzcb zzcbVar = zzc;
                    String zzd = zzcbVar.zzd(str);
                    if (zzd != null) {
                        if (hashSet.contains(zzd)) {
                            try {
                                Object obj = jSONObject.get(str);
                                if (obj != null) {
                                    int zza = zzcbVar.zza(zzd);
                                    if (zza != 1) {
                                        if (zza != 2) {
                                            if (zza == 3) {
                                                double optDouble = jSONObject.optDouble(str);
                                                if (!Double.isNaN(optDouble)) {
                                                    this.zza.putDouble(zzd, optDouble);
                                                }
                                            } else if (zza != 4) {
                                                if (zza == 5) {
                                                    this.zza.putLong(zzd, CastUtils.secToMillisec(jSONObject.optLong(str)));
                                                }
                                            } else if (obj instanceof String) {
                                                String str2 = (String) obj;
                                                if (com.google.android.gms.cast.internal.media.zza.zzb(str2) != null) {
                                                    this.zza.putString(zzd, str2);
                                                }
                                            }
                                        } else if (obj instanceof Integer) {
                                            this.zza.putInt(zzd, ((Integer) obj).intValue());
                                        }
                                    } else if (obj instanceof String) {
                                        this.zza.putString(zzd, (String) obj);
                                    }
                                }
                            } catch (JSONException unused2) {
                            }
                        }
                    } else {
                        Object obj2 = jSONObject.get(str);
                        if (obj2 instanceof String) {
                            this.zza.putString(str, (String) obj2);
                        } else if (obj2 instanceof Integer) {
                            this.zza.putInt(str, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof Double) {
                            this.zza.putDouble(str, ((Double) obj2).doubleValue());
                        }
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    public MediaMetadata(int i) {
        this(new ArrayList(), new Bundle(), i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaMetadata(List list, Bundle bundle, int i) {
        this.zzf = new Writer();
        this.zzd = list;
        this.zza = bundle;
        this.zze = i;
    }
}
