package com.netflix.android.org.json.zip;

import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.JSONArray;
import com.netflix.android.org.json.JSONException;
import com.netflix.android.org.json.JSONObject;
import com.netflix.android.org.json.Kim;
import java.io.UnsupportedEncodingException;

/* loaded from: classes5.dex */
public class Decompressor extends JSONzip {
    BitReader bitreader;

    public Decompressor(BitReader bitReader) {
        this.bitreader = bitReader;
    }

    private boolean bit() {
        try {
            return this.bitreader.bit();
        } catch (Throwable th) {
            throw new JSONException(th);
        }
    }

    private Object getAndTick(Keep keep, BitReader bitReader) {
        try {
            int read = bitReader.read(keep.bitsize());
            Object value = keep.value(read);
            if (read >= keep.length) {
                throw new JSONException("Deep error.");
            }
            keep.tick(read);
            return value;
        } catch (Throwable th) {
            throw new JSONException(th);
        }
    }

    public boolean pad(int i) {
        try {
            return this.bitreader.pad(i);
        } catch (Throwable th) {
            throw new JSONException(th);
        }
    }

    private int read(int i) {
        try {
            return this.bitreader.read(i);
        } catch (Throwable th) {
            throw new JSONException(th);
        }
    }

    private JSONArray readArray(boolean z) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(z ? readString() : readValue());
        while (true) {
            if (!bit()) {
                if (!bit()) {
                    return jSONArray;
                }
                jSONArray.put(z ? readValue() : readString());
            } else {
                jSONArray.put(z ? readString() : readValue());
            }
        }
    }

    private Object readJSON() {
        int read = read(3);
        if (read != 0) {
            if (read != 1) {
                if (read != 2) {
                    if (read != 3) {
                        if (read != 5) {
                            if (read != 6) {
                                if (read == 7) {
                                    return readArray(false);
                                }
                                return JSONObject.NULL;
                            }
                            return readArray(true);
                        }
                        return readObject();
                    }
                    return Boolean.FALSE;
                }
                return Boolean.TRUE;
            }
            return new JSONArray();
        }
        return new JSONObject();
    }

    private String readName() {
        byte[] bArr = new byte[AleCryptoBouncyCastle.MAX_RANDOM_BYTES];
        if (bit()) {
            return getAndTick(this.namekeep, this.bitreader).toString();
        }
        int i = 0;
        while (true) {
            int read = this.namehuff.read(this.bitreader);
            if (read == 256) {
                break;
            }
            bArr[i] = (byte) read;
            i++;
        }
        if (i == 0) {
            return "";
        }
        Kim kim = new Kim(bArr, i);
        this.namekeep.register(kim);
        return kim.toString();
    }

    private JSONObject readObject() {
        JSONObject jSONObject = new JSONObject();
        do {
            jSONObject.put(readName(), !bit() ? readString() : readValue());
        } while (bit());
        return jSONObject;
    }

    private String readString() {
        if (bit()) {
            return getAndTick(this.stringkeep, this.bitreader).toString();
        }
        byte[] bArr = new byte[AleCryptoBouncyCastle.MAX_RANDOM_BYTES];
        boolean bit = bit();
        this.substringkeep.reserve();
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        while (true) {
            if (bit) {
                int copy = ((Kim) getAndTick(this.substringkeep, this.bitreader)).copy(bArr, i);
                if (i3 != -1) {
                    this.substringkeep.registerOne(new Kim(bArr, i3, i2 + 1));
                }
                i3 = i;
                i = copy;
                bit = bit();
                i2 = i;
            } else {
                while (true) {
                    int read = this.substringhuff.read(this.bitreader);
                    if (read == 256) {
                        break;
                    }
                    bArr[i] = (byte) read;
                    i++;
                    if (i3 != -1) {
                        this.substringkeep.registerOne(new Kim(bArr, i3, i2 + 1));
                        i3 = -1;
                    }
                }
                if (!bit()) {
                    break;
                }
                bit = true;
            }
        }
        if (i == 0) {
            return "";
        }
        Kim kim = new Kim(bArr, i);
        this.stringkeep.register(kim);
        this.substringkeep.registerMany(kim);
        return kim.toString();
    }

    private Object readValue() {
        int read = read(2);
        if (read == 0) {
            return new Integer(read(bit() ? !bit() ? 7 : 14 : 4));
        } else if (read != 1) {
            if (read != 2) {
                if (read == 3) {
                    return readJSON();
                }
                throw new JSONException("Impossible.");
            }
            return getAndTick(this.values, this.bitreader);
        } else {
            byte[] bArr = new byte[JSONzip.end];
            int i = 0;
            while (true) {
                int read2 = read(4);
                if (read2 != JSONzip.endOfNumber) {
                    bArr[i] = JSONzip.bcd[read2];
                    i++;
                } else {
                    try {
                        Object stringToValue = JSONObject.stringToValue(new String(bArr, 0, i, "US-ASCII"));
                        this.values.register(stringToValue);
                        return stringToValue;
                    } catch (UnsupportedEncodingException e) {
                        throw new JSONException(e);
                    }
                }
            }
        }
    }

    public Object unzip() {
        begin();
        return readJSON();
    }
}
