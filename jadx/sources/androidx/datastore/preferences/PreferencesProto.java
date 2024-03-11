package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.MessageLiteOrBuilder;
import androidx.datastore.preferences.protobuf.Parser;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class PreferencesProto {

    /* loaded from: classes2.dex */
    public interface PreferenceMapOrBuilder extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface StringSetOrBuilder extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface ValueOrBuilder extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public static final class PreferenceMap extends GeneratedMessageLite<PreferenceMap, Builder> implements PreferenceMapOrBuilder {
        private static final PreferenceMap DEFAULT_INSTANCE;
        private static volatile Parser<PreferenceMap> PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private MapFieldLite<String, Value> preferences_ = MapFieldLite.emptyMapField();

        /* loaded from: classes2.dex */
        static final class PreferencesDefaultEntryHolder {
            static final MapEntryLite<String, Value> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Value.getDefaultInstance());
        }

        private MapFieldLite<String, Value> internalGetPreferences() {
            return this.preferences_;
        }

        private PreferenceMap() {
        }

        private MapFieldLite<String, Value> internalGetMutablePreferences() {
            if (!this.preferences_.isMutable()) {
                this.preferences_ = this.preferences_.mutableCopy();
            }
            return this.preferences_;
        }

        public Map<String, Value> getPreferencesMap() {
            return Collections.unmodifiableMap(internalGetPreferences());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, Value> getMutablePreferencesMap() {
            return internalGetMutablePreferences();
        }

        public static PreferenceMap parseFrom(InputStream inputStream) {
            return (PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<PreferenceMap, Builder> implements PreferenceMapOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(PreferenceMap.DEFAULT_INSTANCE);
            }

            public Builder putPreferences(String str, Value value) {
                str.getClass();
                value.getClass();
                copyOnWrite();
                ((PreferenceMap) this.instance).getMutablePreferencesMap().put(str, value);
                return this;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new PreferenceMap();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", PreferencesDefaultEntryHolder.defaultEntry});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PreferenceMap> parser = PARSER;
                    if (parser == null) {
                        synchronized (PreferenceMap.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            PreferenceMap preferenceMap = new PreferenceMap();
            DEFAULT_INSTANCE = preferenceMap;
            GeneratedMessageLite.registerDefaultInstance(PreferenceMap.class, preferenceMap);
        }
    }

    /* renamed from: androidx.datastore.preferences.PreferencesProto$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class Value extends GeneratedMessageLite<Value, Builder> implements ValueOrBuilder {
        public static final int BOOLEAN_FIELD_NUMBER = 1;
        private static final Value DEFAULT_INSTANCE;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile Parser<Value> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int bitField0_;
        private int valueCase_ = 0;
        private Object value_;

        public static Value getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private Value() {
        }

        /* loaded from: classes2.dex */
        public enum ValueCase {
            BOOLEAN(1),
            FLOAT(2),
            INTEGER(3),
            LONG(4),
            STRING(5),
            STRING_SET(6),
            DOUBLE(7),
            VALUE_NOT_SET(0);
            
            private final int value;

            public static ValueCase forNumber(int i) {
                switch (i) {
                    case 0:
                        return VALUE_NOT_SET;
                    case 1:
                        return BOOLEAN;
                    case 2:
                        return FLOAT;
                    case 3:
                        return INTEGER;
                    case 4:
                        return LONG;
                    case 5:
                        return STRING;
                    case 6:
                        return STRING_SET;
                    case 7:
                        return DOUBLE;
                    default:
                        return null;
                }
            }

            ValueCase(int i) {
                this.value = i;
            }
        }

        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }

        public boolean getBoolean() {
            if (this.valueCase_ == 1) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBoolean(boolean z) {
            this.valueCase_ = 1;
            this.value_ = Boolean.valueOf(z);
        }

        public float getFloat() {
            if (this.valueCase_ == 2) {
                return ((Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloat(float f) {
            this.valueCase_ = 2;
            this.value_ = Float.valueOf(f);
        }

        public int getInteger() {
            if (this.valueCase_ == 3) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInteger(int i) {
            this.valueCase_ = 3;
            this.value_ = Integer.valueOf(i);
        }

        public long getLong() {
            if (this.valueCase_ == 4) {
                return ((Long) this.value_).longValue();
            }
            return 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLong(long j) {
            this.valueCase_ = 4;
            this.value_ = Long.valueOf(j);
        }

        public String getString() {
            return this.valueCase_ == 5 ? (String) this.value_ : "";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setString(String str) {
            str.getClass();
            this.valueCase_ = 5;
            this.value_ = str;
        }

        public StringSet getStringSet() {
            if (this.valueCase_ == 6) {
                return (StringSet) this.value_;
            }
            return StringSet.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringSet(StringSet.Builder builder) {
            this.value_ = builder.build();
            this.valueCase_ = 6;
        }

        public double getDouble() {
            if (this.valueCase_ == 7) {
                return ((Double) this.value_).doubleValue();
            }
            return 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDouble(double d) {
            this.valueCase_ = 7;
            this.value_ = Double.valueOf(d);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(Value.DEFAULT_INSTANCE);
            }

            public Builder setBoolean(boolean z) {
                copyOnWrite();
                ((Value) this.instance).setBoolean(z);
                return this;
            }

            public Builder setFloat(float f) {
                copyOnWrite();
                ((Value) this.instance).setFloat(f);
                return this;
            }

            public Builder setInteger(int i) {
                copyOnWrite();
                ((Value) this.instance).setInteger(i);
                return this;
            }

            public Builder setLong(long j) {
                copyOnWrite();
                ((Value) this.instance).setLong(j);
                return this;
            }

            public Builder setString(String str) {
                copyOnWrite();
                ((Value) this.instance).setString(str);
                return this;
            }

            public Builder setStringSet(StringSet.Builder builder) {
                copyOnWrite();
                ((Value) this.instance).setStringSet(builder);
                return this;
            }

            public Builder setDouble(double d) {
                copyOnWrite();
                ((Value) this.instance).setDouble(d);
                return this;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Value();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", StringSet.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Value> parser = PARSER;
                    if (parser == null) {
                        synchronized (Value.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            Value value = new Value();
            DEFAULT_INSTANCE = value;
            GeneratedMessageLite.registerDefaultInstance(Value.class, value);
        }
    }

    /* loaded from: classes2.dex */
    public static final class StringSet extends GeneratedMessageLite<StringSet, Builder> implements StringSetOrBuilder {
        private static final StringSet DEFAULT_INSTANCE;
        private static volatile Parser<StringSet> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private Internal.ProtobufList<String> strings_ = GeneratedMessageLite.emptyProtobufList();

        public static StringSet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public List<String> getStringsList() {
            return this.strings_;
        }

        private StringSet() {
        }

        private void ensureStringsIsMutable() {
            if (this.strings_.isModifiable()) {
                return;
            }
            this.strings_ = GeneratedMessageLite.mutableCopy(this.strings_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllStrings(Iterable<String> iterable) {
            ensureStringsIsMutable();
            AbstractMessageLite.addAll(iterable, this.strings_);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<StringSet, Builder> implements StringSetOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(StringSet.DEFAULT_INSTANCE);
            }

            public Builder addAllStrings(Iterable<String> iterable) {
                copyOnWrite();
                ((StringSet) this.instance).addAllStrings(iterable);
                return this;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StringSet();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<StringSet> parser = PARSER;
                    if (parser == null) {
                        synchronized (StringSet.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            StringSet stringSet = new StringSet();
            DEFAULT_INSTANCE = stringSet;
            GeneratedMessageLite.registerDefaultInstance(StringSet.class, stringSet);
        }
    }
}
