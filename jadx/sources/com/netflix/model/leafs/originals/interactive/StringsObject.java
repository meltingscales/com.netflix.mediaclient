package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonElement;
import com.netflix.model.leafs.originals.interactive.condition.Condition;
import java.util.HashMap;
import java.util.Map;
import o.C8168dfL;

/* loaded from: classes.dex */
public class StringsObject implements Parcelable {
    Map<String, String> preconditionTokens = new HashMap();
    Map<String, String> mappings = new HashMap();
    Map<String, String> values = new HashMap();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public StringsObject merge(StringsObject stringsObject) {
        if (stringsObject == null) {
            return this;
        }
        StringsObject stringsObject2 = new StringsObject();
        Map<String, String> map = stringsObject.preconditionTokens;
        if (map != null) {
            stringsObject2.preconditionTokens.putAll(map);
        }
        Map<String, String> map2 = this.preconditionTokens;
        if (map2 != null) {
            stringsObject2.preconditionTokens.putAll(map2);
        }
        Map<String, String> map3 = stringsObject.mappings;
        if (map3 != null) {
            stringsObject2.mappings.putAll(map3);
        }
        Map<String, String> map4 = this.mappings;
        if (map4 != null) {
            stringsObject2.mappings.putAll(map4);
        }
        Map<String, String> map5 = stringsObject.values;
        if (map5 != null) {
            stringsObject2.values.putAll(map5);
        }
        Map<String, String> map6 = this.values;
        if (map6 != null) {
            stringsObject2.values.putAll(map6);
        }
        return stringsObject2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.preconditionTokens);
        parcel.writeMap(this.mappings);
        parcel.writeMap(this.values);
    }

    public String get(String str, InteractiveMoments interactiveMoments) {
        Map<String, String> map;
        Condition condition;
        String str2;
        String str3 = this.values.get(this.mappings.get(str));
        if (str3 == null && (str3 = this.values.get(str)) == null) {
            return null;
        }
        if (C8168dfL.h(str3) && (map = this.preconditionTokens) != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : this.preconditionTokens.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (key != null && value != null && (condition = interactiveMoments.preconditions().get(key)) != null) {
                        JsonElement value2 = condition.getValue(interactiveMoments);
                        if (value2 == null || !value2.isJsonPrimitive()) {
                            str2 = "";
                        } else if (value2.getAsJsonPrimitive().isNumber()) {
                            str2 = String.valueOf(value2.getAsJsonPrimitive().getAsInt());
                        } else {
                            str2 = value2.getAsJsonPrimitive().getAsString();
                        }
                        str3 = str3.replace(value, str2);
                    }
                }
            }
        }
        return str3;
    }
}
