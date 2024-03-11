package com.google.gson.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class LazilyParsedNumber extends Number {
    private final String value;

    public String toString() {
        return this.value;
    }

    public LazilyParsedNumber(String str) {
        this.value = str;
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.value);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.value).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.value);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.value);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.value).longValue();
        }
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.value);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.value);
    }

    private Object writeReplace() {
        return new BigDecimal(this.value);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LazilyParsedNumber) {
            String str = this.value;
            String str2 = ((LazilyParsedNumber) obj).value;
            return str == str2 || str.equals(str2);
        }
        return false;
    }
}