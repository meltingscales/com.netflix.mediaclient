package androidx.datastore.preferences.core;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import androidx.datastore.preferences.PreferencesMapCompat;
import androidx.datastore.preferences.PreferencesProto;
import androidx.datastore.preferences.core.Preferences;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import o.C8576dqs;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.dpR;

/* loaded from: classes2.dex */
public final class PreferencesSerializer implements Serializer<Preferences> {
    public static final PreferencesSerializer INSTANCE = new PreferencesSerializer();
    private static final String fileExtension = "preferences_pb";

    /* loaded from: classes2.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PreferencesProto.Value.ValueCase.values().length];
            iArr[PreferencesProto.Value.ValueCase.BOOLEAN.ordinal()] = 1;
            iArr[PreferencesProto.Value.ValueCase.FLOAT.ordinal()] = 2;
            iArr[PreferencesProto.Value.ValueCase.DOUBLE.ordinal()] = 3;
            iArr[PreferencesProto.Value.ValueCase.INTEGER.ordinal()] = 4;
            iArr[PreferencesProto.Value.ValueCase.LONG.ordinal()] = 5;
            iArr[PreferencesProto.Value.ValueCase.STRING.ordinal()] = 6;
            iArr[PreferencesProto.Value.ValueCase.STRING_SET.ordinal()] = 7;
            iArr[PreferencesProto.Value.ValueCase.VALUE_NOT_SET.ordinal()] = 8;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final String getFileExtension() {
        return fileExtension;
    }

    private PreferencesSerializer() {
    }

    @Override // androidx.datastore.core.Serializer
    public /* bridge */ /* synthetic */ Object writeTo(Preferences preferences, OutputStream outputStream, InterfaceC8585dra interfaceC8585dra) {
        return writeTo2(preferences, outputStream, (InterfaceC8585dra<? super dpR>) interfaceC8585dra);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    public Preferences getDefaultValue() {
        return PreferencesFactory.createEmpty();
    }

    @Override // androidx.datastore.core.Serializer
    public Object readFrom(InputStream inputStream, InterfaceC8585dra<? super Preferences> interfaceC8585dra) {
        PreferencesProto.PreferenceMap readFrom = PreferencesMapCompat.Companion.readFrom(inputStream);
        MutablePreferences createMutable = PreferencesFactory.createMutable(new Preferences.Pair[0]);
        Map<String, PreferencesProto.Value> preferencesMap = readFrom.getPreferencesMap();
        C8632dsu.a(preferencesMap, "");
        for (Map.Entry<String, PreferencesProto.Value> entry : preferencesMap.entrySet()) {
            String key = entry.getKey();
            PreferencesProto.Value value = entry.getValue();
            PreferencesSerializer preferencesSerializer = INSTANCE;
            C8632dsu.a(key, "");
            C8632dsu.a(value, "");
            preferencesSerializer.addProtoEntryToPreferences(key, value, createMutable);
        }
        return createMutable.toPreferences();
    }

    /* renamed from: writeTo  reason: avoid collision after fix types in other method */
    public Object writeTo2(Preferences preferences, OutputStream outputStream, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Map<Preferences.Key<?>, Object> asMap = preferences.asMap();
        PreferencesProto.PreferenceMap.Builder newBuilder = PreferencesProto.PreferenceMap.newBuilder();
        for (Map.Entry<Preferences.Key<?>, Object> entry : asMap.entrySet()) {
            newBuilder.putPreferences(entry.getKey().getName(), getValueProto(entry.getValue()));
        }
        newBuilder.build().writeTo(outputStream);
        return dpR.c;
    }

    private final PreferencesProto.Value getValueProto(Object obj) {
        if (obj instanceof Boolean) {
            PreferencesProto.Value build = PreferencesProto.Value.newBuilder().setBoolean(((Boolean) obj).booleanValue()).build();
            C8632dsu.a(build, "");
            return build;
        } else if (obj instanceof Float) {
            PreferencesProto.Value build2 = PreferencesProto.Value.newBuilder().setFloat(((Number) obj).floatValue()).build();
            C8632dsu.a(build2, "");
            return build2;
        } else if (obj instanceof Double) {
            PreferencesProto.Value build3 = PreferencesProto.Value.newBuilder().setDouble(((Number) obj).doubleValue()).build();
            C8632dsu.a(build3, "");
            return build3;
        } else if (obj instanceof Integer) {
            PreferencesProto.Value build4 = PreferencesProto.Value.newBuilder().setInteger(((Number) obj).intValue()).build();
            C8632dsu.a(build4, "");
            return build4;
        } else if (obj instanceof Long) {
            PreferencesProto.Value build5 = PreferencesProto.Value.newBuilder().setLong(((Number) obj).longValue()).build();
            C8632dsu.a(build5, "");
            return build5;
        } else if (obj instanceof String) {
            PreferencesProto.Value build6 = PreferencesProto.Value.newBuilder().setString((String) obj).build();
            C8632dsu.a(build6, "");
            return build6;
        } else if (obj instanceof Set) {
            PreferencesProto.Value build7 = PreferencesProto.Value.newBuilder().setStringSet(PreferencesProto.StringSet.newBuilder().addAllStrings((Set) obj)).build();
            C8632dsu.a(build7, "");
            return build7;
        } else {
            throw new IllegalStateException(C8632dsu.d("PreferencesSerializer does not support type: ", (Object) obj.getClass().getName()));
        }
    }

    private final void addProtoEntryToPreferences(String str, PreferencesProto.Value value, MutablePreferences mutablePreferences) {
        Set W;
        PreferencesProto.Value.ValueCase valueCase = value.getValueCase();
        switch (valueCase == null ? -1 : WhenMappings.$EnumSwitchMapping$0[valueCase.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                mutablePreferences.set(PreferencesKeys.booleanKey(str), Boolean.valueOf(value.getBoolean()));
                return;
            case 2:
                mutablePreferences.set(PreferencesKeys.floatKey(str), Float.valueOf(value.getFloat()));
                return;
            case 3:
                mutablePreferences.set(PreferencesKeys.doubleKey(str), Double.valueOf(value.getDouble()));
                return;
            case 4:
                mutablePreferences.set(PreferencesKeys.intKey(str), Integer.valueOf(value.getInteger()));
                return;
            case 5:
                mutablePreferences.set(PreferencesKeys.longKey(str), Long.valueOf(value.getLong()));
                return;
            case 6:
                Preferences.Key<String> stringKey = PreferencesKeys.stringKey(str);
                String string = value.getString();
                C8632dsu.a(string, "");
                mutablePreferences.set(stringKey, string);
                return;
            case 7:
                Preferences.Key<Set<String>> stringSetKey = PreferencesKeys.stringSetKey(str);
                List<String> stringsList = value.getStringSet().getStringsList();
                C8632dsu.a(stringsList, "");
                W = C8576dqs.W(stringsList);
                mutablePreferences.set(stringSetKey, W);
                return;
            case 8:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }
}
