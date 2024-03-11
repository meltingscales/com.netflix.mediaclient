package com.netflix.android.org.json.zip;

import com.netflix.android.org.json.JSONArray;
import com.netflix.android.org.json.JSONException;
import com.netflix.android.org.json.JSONObject;
import com.netflix.android.org.json.Kim;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class Compressor extends JSONzip {
    final BitWriter bitwriter;

    private static int bcd(char c) {
        if (c < '0' || c > '9') {
            if (c != '+') {
                if (c != '-') {
                    return c != '.' ? 13 : 10;
                }
                return 11;
            }
            return 12;
        }
        return c - '0';
    }

    public Compressor(BitWriter bitWriter) {
        this.bitwriter = bitWriter;
    }

    public void flush() {
        pad(8);
    }

    private void one() {
        write(1, 1);
    }

    public void pad(int i) {
        try {
            this.bitwriter.pad(i);
        } catch (Throwable th) {
            throw new JSONException(th);
        }
    }

    private void write(int i, int i2) {
        try {
            this.bitwriter.write(i, i2);
        } catch (Throwable th) {
            throw new JSONException(th);
        }
    }

    private void write(int i, Huff huff) {
        huff.write(i, this.bitwriter);
    }

    private void write(Kim kim, Huff huff) {
        write(kim, 0, kim.length, huff);
    }

    private void write(Kim kim, int i, int i2, Huff huff) {
        while (i < i2) {
            write(kim.get(i), huff);
            i++;
        }
    }

    private void writeAndTick(int i, Keep keep) {
        int bitsize = keep.bitsize();
        keep.tick(i);
        write(i, bitsize);
    }

    private void writeArray(JSONArray jSONArray) {
        int length = jSONArray.length();
        if (length == 0) {
            write(1, 3);
            return;
        }
        boolean z = false;
        Object obj = jSONArray.get(0);
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        if (obj instanceof String) {
            write(6, 3);
            writeString((String) obj);
            z = true;
        } else {
            write(7, 3);
            writeValue(obj);
        }
        for (int i = 1; i < length; i++) {
            Object obj2 = jSONArray.get(i);
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            boolean z2 = obj2 instanceof String;
            if (z2 != z) {
                zero();
            }
            one();
            if (z2) {
                writeString((String) obj2);
            } else {
                writeValue(obj2);
            }
        }
        zero();
        zero();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeJSON(java.lang.Object r3) {
        /*
            r2 = this;
            java.lang.Object r0 = com.netflix.android.org.json.JSONObject.NULL
            boolean r0 = r0.equals(r3)
            r1 = 3
            if (r0 == 0) goto Le
            r3 = 4
            r2.write(r3, r1)
            goto L63
        Le:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1a
            r2.write(r1, r1)
            goto L63
        L1a:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L27
            r3 = 2
            r2.write(r3, r1)
            goto L63
        L27:
            boolean r0 = r3 instanceof java.util.Map
            if (r0 == 0) goto L34
            com.netflix.android.org.json.JSONObject r0 = new com.netflix.android.org.json.JSONObject
            java.util.Map r3 = (java.util.Map) r3
            r0.<init>(r3)
        L32:
            r3 = r0
            goto L50
        L34:
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L40
            com.netflix.android.org.json.JSONArray r0 = new com.netflix.android.org.json.JSONArray
            java.util.Collection r3 = (java.util.Collection) r3
            r0.<init>(r3)
            goto L32
        L40:
            java.lang.Class r0 = r3.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L50
            com.netflix.android.org.json.JSONArray r0 = new com.netflix.android.org.json.JSONArray
            r0.<init>(r3)
            goto L32
        L50:
            boolean r0 = r3 instanceof com.netflix.android.org.json.JSONObject
            if (r0 == 0) goto L5a
            com.netflix.android.org.json.JSONObject r3 = (com.netflix.android.org.json.JSONObject) r3
            r2.writeObject(r3)
            goto L63
        L5a:
            boolean r0 = r3 instanceof com.netflix.android.org.json.JSONArray
            if (r0 == 0) goto L64
            com.netflix.android.org.json.JSONArray r3 = (com.netflix.android.org.json.JSONArray) r3
            r2.writeArray(r3)
        L63:
            return
        L64:
            com.netflix.android.org.json.JSONException r3 = new com.netflix.android.org.json.JSONException
            java.lang.String r0 = "Unrecognized object"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.android.org.json.zip.Compressor.writeJSON(java.lang.Object):void");
    }

    private void writeName(String str) {
        Kim kim = new Kim(str);
        int find = this.namekeep.find(kim);
        if (find != -1) {
            one();
            writeAndTick(find, this.namekeep);
            return;
        }
        zero();
        write(kim, this.namehuff);
        write(JSONzip.end, this.namehuff);
        this.namekeep.register(kim);
    }

    private void writeObject(JSONObject jSONObject) {
        Iterator keys = jSONObject.keys();
        boolean z = true;
        while (keys.hasNext()) {
            Object next = keys.next();
            if (next instanceof String) {
                if (z) {
                    write(5, 3);
                    z = false;
                } else {
                    one();
                }
                String str = (String) next;
                writeName(str);
                Object obj = jSONObject.get(str);
                if (obj instanceof String) {
                    zero();
                    writeString((String) obj);
                } else {
                    one();
                    writeValue(obj);
                }
            }
        }
        if (z) {
            write(0, 3);
        } else {
            zero();
        }
    }

    private void writeString(String str) {
        if (str.length() == 0) {
            zero();
            zero();
            write(JSONzip.end, this.substringhuff);
            zero();
            return;
        }
        Kim kim = new Kim(str);
        int find = this.stringkeep.find(kim);
        if (find != -1) {
            one();
            writeAndTick(find, this.stringkeep);
            return;
        }
        writeSubstring(kim);
        this.stringkeep.register(kim);
    }

    private void writeSubstring(Kim kim) {
        this.substringkeep.reserve();
        zero();
        int i = kim.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        while (true) {
            int i5 = i2;
            int i6 = -1;
            while (i5 <= i - 3 && (i6 = this.substringkeep.match(kim, i5, i)) == -1) {
                i5++;
            }
            if (i6 == -1) {
                break;
            }
            if (i2 != i5) {
                zero();
                write(kim, i2, i5, this.substringhuff);
                write(JSONzip.end, this.substringhuff);
                if (i4 != -1) {
                    this.substringkeep.registerOne(kim, i4, i3);
                    i4 = -1;
                }
            }
            one();
            writeAndTick(i6, this.substringkeep);
            i2 = this.substringkeep.length(i6) + i5;
            if (i4 != -1) {
                this.substringkeep.registerOne(kim, i4, i3);
            }
            i3 = i2 + 1;
            i4 = i5;
        }
        zero();
        if (i2 < i) {
            write(kim, i2, i, this.substringhuff);
            if (i4 != -1) {
                this.substringkeep.registerOne(kim, i4, i3);
            }
        }
        write(JSONzip.end, this.substringhuff);
        zero();
        this.substringkeep.registerMany(kim);
    }

    private void writeValue(Object obj) {
        if (obj instanceof Number) {
            Number number = (Number) obj;
            String numberToString = JSONObject.numberToString(number);
            int find = this.values.find(numberToString);
            if (find != -1) {
                write(2, 2);
                writeAndTick(find, this.values);
                return;
            }
            if ((obj instanceof Integer) || (obj instanceof Long)) {
                long longValue = number.longValue();
                if (longValue >= 0 && longValue < 16384) {
                    write(0, 2);
                    if (longValue < 16) {
                        zero();
                        write((int) longValue, 4);
                        return;
                    }
                    one();
                    if (longValue < 128) {
                        zero();
                        write((int) longValue, 7);
                        return;
                    }
                    one();
                    write((int) longValue, 14);
                    return;
                }
            }
            write(1, 2);
            for (int i = 0; i < numberToString.length(); i++) {
                write(bcd(numberToString.charAt(i)), 4);
            }
            write(JSONzip.endOfNumber, 4);
            this.values.register(numberToString);
            return;
        }
        write(3, 2);
        writeJSON(obj);
    }

    private void zero() {
        write(0, 1);
    }

    public void zip(JSONObject jSONObject) {
        begin();
        writeJSON(jSONObject);
    }

    public void zip(JSONArray jSONArray) {
        begin();
        writeJSON(jSONArray);
    }
}
