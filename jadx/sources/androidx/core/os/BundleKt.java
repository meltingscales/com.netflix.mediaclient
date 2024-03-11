package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import com.fasterxml.jackson.core.JsonFactory;
import java.io.Serializable;
import kotlin.Pair;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class BundleKt {
    public static final Bundle bundleOf(Pair<String, ? extends Object>... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair<String, ? extends Object> pair : pairArr) {
            String b = pair.b();
            Object c = pair.c();
            if (c == null) {
                bundle.putString(b, null);
            } else if (c instanceof Boolean) {
                bundle.putBoolean(b, ((Boolean) c).booleanValue());
            } else if (c instanceof Byte) {
                bundle.putByte(b, ((Number) c).byteValue());
            } else if (c instanceof Character) {
                bundle.putChar(b, ((Character) c).charValue());
            } else if (c instanceof Double) {
                bundle.putDouble(b, ((Number) c).doubleValue());
            } else if (c instanceof Float) {
                bundle.putFloat(b, ((Number) c).floatValue());
            } else if (c instanceof Integer) {
                bundle.putInt(b, ((Number) c).intValue());
            } else if (c instanceof Long) {
                bundle.putLong(b, ((Number) c).longValue());
            } else if (c instanceof Short) {
                bundle.putShort(b, ((Number) c).shortValue());
            } else if (c instanceof Bundle) {
                bundle.putBundle(b, (Bundle) c);
            } else if (c instanceof CharSequence) {
                bundle.putCharSequence(b, (CharSequence) c);
            } else if (c instanceof Parcelable) {
                bundle.putParcelable(b, (Parcelable) c);
            } else if (c instanceof boolean[]) {
                bundle.putBooleanArray(b, (boolean[]) c);
            } else if (c instanceof byte[]) {
                bundle.putByteArray(b, (byte[]) c);
            } else if (c instanceof char[]) {
                bundle.putCharArray(b, (char[]) c);
            } else if (c instanceof double[]) {
                bundle.putDoubleArray(b, (double[]) c);
            } else if (c instanceof float[]) {
                bundle.putFloatArray(b, (float[]) c);
            } else if (c instanceof int[]) {
                bundle.putIntArray(b, (int[]) c);
            } else if (c instanceof long[]) {
                bundle.putLongArray(b, (long[]) c);
            } else if (c instanceof short[]) {
                bundle.putShortArray(b, (short[]) c);
            } else if (c instanceof Object[]) {
                Class<?> componentType = c.getClass().getComponentType();
                C8632dsu.d(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    C8632dsu.d(c);
                    bundle.putParcelableArray(b, (Parcelable[]) c);
                } else if (String.class.isAssignableFrom(componentType)) {
                    C8632dsu.d(c);
                    bundle.putStringArray(b, (String[]) c);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    C8632dsu.d(c);
                    bundle.putCharSequenceArray(b, (CharSequence[]) c);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(b, (Serializable) c);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + b + JsonFactory.DEFAULT_QUOTE_CHAR);
                }
            } else if (c instanceof Serializable) {
                bundle.putSerializable(b, (Serializable) c);
            } else if (c instanceof IBinder) {
                BundleApi18ImplKt.putBinder(bundle, b, (IBinder) c);
            } else if (c instanceof Size) {
                BundleApi21ImplKt.putSize(bundle, b, (Size) c);
            } else if (!(c instanceof SizeF)) {
                throw new IllegalArgumentException("Illegal value type " + c.getClass().getCanonicalName() + " for key \"" + b + JsonFactory.DEFAULT_QUOTE_CHAR);
            } else {
                BundleApi21ImplKt.putSizeF(bundle, b, (SizeF) c);
            }
        }
        return bundle;
    }
}
