package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class SafeParcelReader {

    /* loaded from: classes2.dex */
    public static class ParseException extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public ParseException(java.lang.String r3, android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static Bundle createBundle(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + readSize);
        return readBundle;
    }

    public static byte[] createByteArray(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createByteArray;
    }

    public static int[] createIntArray(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createIntArray;
    }

    public static long[] createLongArray(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createLongArray;
    }

    public static <T extends Parcelable> T createParcelable(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + readSize);
        return createFromParcel;
    }

    public static String createString(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + readSize);
        return readString;
    }

    public static String[] createStringArray(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createStringArray;
    }

    public static ArrayList<String> createStringList(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + readSize);
        return createStringArrayList;
    }

    public static <T> T[] createTypedArray(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + readSize);
        return tArr;
    }

    public static <T> ArrayList<T> createTypedList(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + readSize);
        return createTypedArrayList;
    }

    public static void ensureAtEnd(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        throw new ParseException("Overread allowed size end=" + i, parcel);
    }

    public static int getFieldId(int i) {
        return (char) i;
    }

    public static boolean readBoolean(Parcel parcel, int i) {
        zzb(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean readBooleanObject(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        if (readSize == 0) {
            return null;
        }
        zza(parcel, i, readSize, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static double readDouble(Parcel parcel, int i) {
        zzb(parcel, i, 8);
        return parcel.readDouble();
    }

    public static Double readDoubleObject(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        if (readSize == 0) {
            return null;
        }
        zza(parcel, i, readSize, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float readFloat(Parcel parcel, int i) {
        zzb(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float readFloatObject(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        if (readSize == 0) {
            return null;
        }
        zza(parcel, i, readSize, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int readHeader(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder readIBinder(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + readSize);
        return readStrongBinder;
    }

    public static int readInt(Parcel parcel, int i) {
        zzb(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer readIntegerObject(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        if (readSize == 0) {
            return null;
        }
        zza(parcel, i, readSize, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long readLong(Parcel parcel, int i) {
        zzb(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long readLongObject(Parcel parcel, int i) {
        int readSize = readSize(parcel, i);
        if (readSize == 0) {
            return null;
        }
        zza(parcel, i, readSize, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int readSize(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void skipUnknownField(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + readSize(parcel, i));
    }

    public static int validateObjectHeader(Parcel parcel) {
        int readHeader = readHeader(parcel);
        int readSize = readSize(parcel, readHeader);
        int fieldId = getFieldId(readHeader);
        int dataPosition = parcel.dataPosition();
        if (fieldId != 20293) {
            throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readHeader))), parcel);
        }
        int i = readSize + dataPosition;
        if (i < dataPosition || i > parcel.dataSize()) {
            throw new ParseException("Size read is invalid start=" + dataPosition + " end=" + i, parcel);
        }
        return i;
    }

    private static void zza(Parcel parcel, int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        String hexString = Integer.toHexString(i2);
        throw new ParseException("Expected size " + i3 + " got " + i2 + " (0x" + hexString + ")", parcel);
    }

    private static void zzb(Parcel parcel, int i, int i2) {
        int readSize = readSize(parcel, i);
        if (readSize == i2) {
            return;
        }
        String hexString = Integer.toHexString(readSize);
        throw new ParseException("Expected size " + i2 + " got " + readSize + " (0x" + hexString + ")", parcel);
    }
}
