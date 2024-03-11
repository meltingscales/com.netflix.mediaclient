package androidx.datastore.preferences.protobuf;

import androidx.appcompat.widget.ActivityChooserModel;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import com.netflix.android.org.json.zip.JSONzip;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.ConnectionSubtype;
import org.chromium.net.PrivateKeyType;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class MessageSchema<T> implements Schema<T> {
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;

    private static boolean isEnforceUtf8(int i) {
        return (i & 536870912) != 0;
    }

    private static boolean isRequired(int i) {
        return (i & 268435456) != 0;
    }

    private static long offset(int i) {
        return i & 1048575;
    }

    private static int type(int i) {
        return (i & 267386880) >>> 20;
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, boolean z, boolean z2, int[] iArr2, int i3, int i4, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i;
        this.maxFieldNumber = i2;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.proto3 = z;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(messageLite);
        this.useCachedSizeField = z2;
        this.intArray = iArr2;
        this.checkInitializedCount = i3;
        this.repeatedFieldOffsetStart = i4;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        if (messageInfo instanceof RawMessageInfo) {
            return newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        return newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    static <T> MessageSchema<T> newSchemaForRawMessageInfo(RawMessageInfo rawMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int i;
        int charAt;
        int i2;
        int charAt2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int objectFieldOffset;
        String str;
        int i22;
        int i23;
        int i24;
        Field reflectField;
        char charAt11;
        Field reflectField2;
        Field reflectField3;
        int i25;
        char charAt12;
        int i26;
        char charAt13;
        int i27;
        char charAt14;
        int i28;
        char charAt15;
        char charAt16;
        int i29 = 0;
        boolean z = rawMessageInfo.getSyntax() == ProtoSyntax.PROTO3;
        String stringInfo = rawMessageInfo.getStringInfo();
        int length = stringInfo.length();
        int charAt17 = stringInfo.charAt(0);
        int i30 = 55296;
        if (charAt17 >= 55296) {
            int i31 = charAt17 & 8191;
            int i32 = 1;
            int i33 = 13;
            while (true) {
                i = i32 + 1;
                charAt16 = stringInfo.charAt(i32);
                if (charAt16 < 55296) {
                    break;
                }
                i31 |= (charAt16 & 8191) << i33;
                i33 += 13;
                i32 = i;
            }
            charAt17 = i31 | (charAt16 << i33);
        } else {
            i = 1;
        }
        int i34 = i + 1;
        int charAt18 = stringInfo.charAt(i);
        if (charAt18 >= 55296) {
            int i35 = charAt18 & 8191;
            int i36 = 13;
            while (true) {
                i28 = i34 + 1;
                charAt15 = stringInfo.charAt(i34);
                if (charAt15 < 55296) {
                    break;
                }
                i35 |= (charAt15 & 8191) << i36;
                i36 += 13;
                i34 = i28;
            }
            charAt18 = i35 | (charAt15 << i36);
            i34 = i28;
        }
        if (charAt18 == 0) {
            i6 = 0;
            charAt = 0;
            i3 = 0;
            charAt2 = 0;
            i2 = i34;
            iArr = EMPTY_INT_ARRAY;
            i5 = 0;
            i4 = 0;
        } else {
            int i37 = i34 + 1;
            int charAt19 = stringInfo.charAt(i34);
            if (charAt19 >= 55296) {
                int i38 = charAt19 & 8191;
                int i39 = 13;
                while (true) {
                    i14 = i37 + 1;
                    charAt10 = stringInfo.charAt(i37);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i38 |= (charAt10 & 8191) << i39;
                    i39 += 13;
                    i37 = i14;
                }
                charAt19 = i38 | (charAt10 << i39);
                i37 = i14;
            }
            int i40 = i37 + 1;
            int charAt20 = stringInfo.charAt(i37);
            if (charAt20 >= 55296) {
                int i41 = charAt20 & 8191;
                int i42 = 13;
                while (true) {
                    i13 = i40 + 1;
                    charAt9 = stringInfo.charAt(i40);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i41 |= (charAt9 & 8191) << i42;
                    i42 += 13;
                    i40 = i13;
                }
                charAt20 = i41 | (charAt9 << i42);
                i40 = i13;
            }
            int i43 = i40 + 1;
            int charAt21 = stringInfo.charAt(i40);
            if (charAt21 >= 55296) {
                int i44 = charAt21 & 8191;
                int i45 = 13;
                while (true) {
                    i12 = i43 + 1;
                    charAt8 = stringInfo.charAt(i43);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i44 |= (charAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i12;
                }
                charAt21 = i44 | (charAt8 << i45);
                i43 = i12;
            }
            int i46 = i43 + 1;
            int charAt22 = stringInfo.charAt(i43);
            if (charAt22 >= 55296) {
                int i47 = charAt22 & 8191;
                int i48 = 13;
                while (true) {
                    i11 = i46 + 1;
                    charAt7 = stringInfo.charAt(i46);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i47 |= (charAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i11;
                }
                charAt22 = i47 | (charAt7 << i48);
                i46 = i11;
            }
            int i49 = i46 + 1;
            charAt = stringInfo.charAt(i46);
            if (charAt >= 55296) {
                int i50 = charAt & 8191;
                int i51 = 13;
                while (true) {
                    i10 = i49 + 1;
                    charAt6 = stringInfo.charAt(i49);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i50 |= (charAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i10;
                }
                charAt = i50 | (charAt6 << i51);
                i49 = i10;
            }
            int i52 = i49 + 1;
            int charAt23 = stringInfo.charAt(i49);
            if (charAt23 >= 55296) {
                int i53 = charAt23 & 8191;
                int i54 = 13;
                while (true) {
                    i9 = i52 + 1;
                    charAt5 = stringInfo.charAt(i52);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i53 |= (charAt5 & 8191) << i54;
                    i54 += 13;
                    i52 = i9;
                }
                charAt23 = i53 | (charAt5 << i54);
                i52 = i9;
            }
            int i55 = i52 + 1;
            int charAt24 = stringInfo.charAt(i52);
            if (charAt24 >= 55296) {
                int i56 = charAt24 & 8191;
                int i57 = 13;
                while (true) {
                    i8 = i55 + 1;
                    charAt4 = stringInfo.charAt(i55);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i56 |= (charAt4 & 8191) << i57;
                    i57 += 13;
                    i55 = i8;
                }
                charAt24 = i56 | (charAt4 << i57);
                i55 = i8;
            }
            i2 = i55 + 1;
            charAt2 = stringInfo.charAt(i55);
            if (charAt2 >= 55296) {
                int i58 = charAt2 & 8191;
                int i59 = i2;
                int i60 = 13;
                while (true) {
                    i7 = i59 + 1;
                    charAt3 = stringInfo.charAt(i59);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i58 |= (charAt3 & 8191) << i60;
                    i60 += 13;
                    i59 = i7;
                }
                charAt2 = i58 | (charAt3 << i60);
                i2 = i7;
            }
            i3 = (charAt19 * 2) + charAt20;
            i4 = charAt22;
            int i61 = charAt23;
            iArr = new int[charAt2 + charAt23 + charAt24];
            i29 = charAt19;
            i5 = charAt21;
            i6 = i61;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = rawMessageInfo.getObjects();
        Class<?> cls = rawMessageInfo.getDefaultInstance().getClass();
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr = new Object[charAt * 2];
        int i62 = charAt2 + i6;
        int i63 = charAt2;
        int i64 = i2;
        int i65 = i62;
        int i66 = 0;
        int i67 = 0;
        while (i64 < length) {
            int i68 = i64 + 1;
            int charAt25 = stringInfo.charAt(i64);
            if (charAt25 >= i30) {
                int i69 = charAt25 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i27 = i70 + 1;
                    charAt14 = stringInfo.charAt(i70);
                    i15 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i69 |= (charAt14 & 8191) << i71;
                    i71 += 13;
                    i70 = i27;
                    length = i15;
                }
                charAt25 = i69 | (charAt14 << i71);
                i16 = i27;
            } else {
                i15 = length;
                i16 = i68;
            }
            int i72 = i16 + 1;
            int charAt26 = stringInfo.charAt(i16);
            if (charAt26 >= 55296) {
                int i73 = charAt26 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i26 = i74 + 1;
                    charAt13 = stringInfo.charAt(i74);
                    i17 = charAt2;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i73 |= (charAt13 & 8191) << i75;
                    i75 += 13;
                    i74 = i26;
                    charAt2 = i17;
                }
                charAt26 = i73 | (charAt13 << i75);
                i18 = i26;
            } else {
                i17 = charAt2;
                i18 = i72;
            }
            int i76 = charAt26 & PrivateKeyType.INVALID;
            boolean z2 = z;
            if ((charAt26 & 1024) != 0) {
                iArr[i67] = i66;
                i67++;
            }
            int i77 = i4;
            if (i76 >= 51) {
                int i78 = i18 + 1;
                int charAt27 = stringInfo.charAt(i18);
                char c = 55296;
                if (charAt27 >= 55296) {
                    int i79 = charAt27 & 8191;
                    int i80 = 13;
                    while (true) {
                        i25 = i78 + 1;
                        charAt12 = stringInfo.charAt(i78);
                        if (charAt12 < c) {
                            break;
                        }
                        i79 |= (charAt12 & 8191) << i80;
                        i80 += 13;
                        i78 = i25;
                        c = 55296;
                    }
                    charAt27 = i79 | (charAt12 << i80);
                    i78 = i25;
                }
                int i81 = i76 - 51;
                int i82 = i78;
                if (i81 == 9 || i81 == 17) {
                    objArr[((i66 / 3) * 2) + 1] = objects[i3];
                    i3++;
                } else if (i81 == 12 && (charAt17 & 1) == 1) {
                    objArr[((i66 / 3) * 2) + 1] = objects[i3];
                    i3++;
                }
                int i83 = charAt27 * 2;
                Object obj = objects[i83];
                if (obj instanceof Field) {
                    reflectField2 = (Field) obj;
                } else {
                    reflectField2 = reflectField(cls, (String) obj);
                    objects[i83] = reflectField2;
                }
                int i84 = i5;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(reflectField2);
                int i85 = i83 + 1;
                Object obj2 = objects[i85];
                if (obj2 instanceof Field) {
                    reflectField3 = (Field) obj2;
                } else {
                    reflectField3 = reflectField(cls, (String) obj2);
                    objects[i85] = reflectField3;
                }
                str = stringInfo;
                i23 = (int) unsafe.objectFieldOffset(reflectField3);
                objectFieldOffset = objectFieldOffset2;
                i22 = i82;
                i24 = 0;
                i20 = charAt26;
                i19 = i84;
            } else {
                int i86 = i5;
                int i87 = i3 + 1;
                Field reflectField4 = reflectField(cls, (String) objects[i3]);
                i19 = i86;
                if (i76 == 9 || i76 == 17) {
                    i20 = charAt26;
                    i21 = 1;
                    objArr[((i66 / 3) * 2) + 1] = reflectField4.getType();
                } else {
                    if (i76 == 27 || i76 == 49) {
                        i20 = charAt26;
                        i21 = 1;
                        i3 += 2;
                        objArr[((i66 / 3) * 2) + 1] = objects[i87];
                    } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                        i20 = charAt26;
                        i21 = 1;
                        if ((charAt17 & 1) == 1) {
                            i3 += 2;
                            objArr[((i66 / 3) * 2) + 1] = objects[i87];
                        }
                    } else {
                        if (i76 == 50) {
                            int i88 = i63 + 1;
                            iArr[i63] = i66;
                            int i89 = (i66 / 3) * 2;
                            int i90 = i3 + 2;
                            objArr[i89] = objects[i87];
                            if ((charAt26 & 2048) != 0) {
                                i87 = i3 + 3;
                                objArr[i89 + 1] = objects[i90];
                                i20 = charAt26;
                                i63 = i88;
                                i21 = 1;
                            } else {
                                i63 = i88;
                                i87 = i90;
                            }
                        }
                        i20 = charAt26;
                        i21 = 1;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField4);
                    if ((charAt17 & 1) == i21 || i76 > 17) {
                        str = stringInfo;
                        i22 = i18;
                        i23 = 0;
                        i24 = 0;
                    } else {
                        int i91 = i18 + 1;
                        int charAt28 = stringInfo.charAt(i18);
                        if (charAt28 >= 55296) {
                            int i92 = charAt28 & 8191;
                            int i93 = 13;
                            while (true) {
                                i22 = i91 + 1;
                                charAt11 = stringInfo.charAt(i91);
                                if (charAt11 < 55296) {
                                    break;
                                }
                                i92 |= (charAt11 & 8191) << i93;
                                i93 += 13;
                                i91 = i22;
                            }
                            charAt28 = i92 | (charAt11 << i93);
                        } else {
                            i22 = i91;
                        }
                        int i94 = (i29 * 2) + (charAt28 / 32);
                        Object obj3 = objects[i94];
                        if (obj3 instanceof Field) {
                            reflectField = (Field) obj3;
                        } else {
                            reflectField = reflectField(cls, (String) obj3);
                            objects[i94] = reflectField;
                        }
                        str = stringInfo;
                        i23 = (int) unsafe.objectFieldOffset(reflectField);
                        i24 = charAt28 % 32;
                    }
                    if (i76 >= 18 && i76 <= 49) {
                        iArr[i65] = objectFieldOffset;
                        i65++;
                    }
                }
                i3 = i87;
                objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField4);
                if ((charAt17 & 1) == i21) {
                }
                str = stringInfo;
                i22 = i18;
                i23 = 0;
                i24 = 0;
                if (i76 >= 18) {
                    iArr[i65] = objectFieldOffset;
                    i65++;
                }
            }
            iArr2[i66] = charAt25;
            int i95 = i20;
            iArr2[i66 + 1] = ((i95 & JSONzip.end) != 0 ? 268435456 : 0) | ((i95 & 512) != 0 ? 536870912 : 0) | (i76 << 20) | objectFieldOffset;
            iArr2[i66 + 2] = i23 | (i24 << 20);
            i66 += 3;
            stringInfo = str;
            z = z2;
            i64 = i22;
            length = i15;
            charAt2 = i17;
            i4 = i77;
            i5 = i19;
            i30 = 55296;
        }
        return new MessageSchema<>(iArr2, objArr, i5, i4, rawMessageInfo.getDefaultInstance(), z, false, iArr, charAt2, i62, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private static Field reflectField(Class<?> cls, String str) {
        Field[] declaredFields;
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        int i;
        boolean z = structuralMessageInfo.getSyntax() == ProtoSyntax.PROTO3;
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i2 = 0;
        int i3 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i2++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i3++;
            }
        }
        int[] iArr2 = i2 > 0 ? new int[i2] : null;
        int[] iArr3 = i3 > 0 ? new int[i3] : null;
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 < fields.length) {
            FieldInfo fieldInfo2 = fields[i4];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i5, z, objArr);
            if (i6 < checkInitialized.length && checkInitialized[i6] == fieldNumber3) {
                checkInitialized[i6] = i5;
                i6++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr2[i7] = i5;
                i7++;
            } else if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                i = i5;
                iArr3[i8] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                i8++;
                i4++;
                i5 = i + 3;
            }
            i = i5;
            i4++;
            i5 = i + 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), z, true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void storeFieldData(androidx.datastore.preferences.protobuf.FieldInfo r6, int[] r7, int r8, boolean r9, java.lang.Object[] r10) {
        /*
            androidx.datastore.preferences.protobuf.OneofInfo r0 = r6.getOneof()
            r1 = 0
            if (r0 == 0) goto L24
            androidx.datastore.preferences.protobuf.FieldType r9 = r6.getType()
            int r9 = r9.id()
            int r9 = r9 + 51
            java.lang.reflect.Field r2 = r0.getValueField()
            long r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.objectFieldOffset(r2)
            int r2 = (int) r2
            java.lang.reflect.Field r0 = r0.getCaseField()
            long r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.objectFieldOffset(r0)
            int r0 = (int) r3
            goto L68
        L24:
            androidx.datastore.preferences.protobuf.FieldType r0 = r6.getType()
            java.lang.reflect.Field r2 = r6.getField()
            long r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.objectFieldOffset(r2)
            int r2 = (int) r2
            int r3 = r0.id()
            if (r9 != 0) goto L55
            boolean r9 = r0.isList()
            if (r9 != 0) goto L55
            boolean r9 = r0.isMap()
            if (r9 != 0) goto L55
            java.lang.reflect.Field r9 = r6.getPresenceField()
            long r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.objectFieldOffset(r9)
            int r9 = (int) r4
            int r0 = r6.getPresenceMask()
            int r0 = java.lang.Integer.numberOfTrailingZeros(r0)
            goto L6b
        L55:
            java.lang.reflect.Field r9 = r6.getCachedSizeField()
            if (r9 != 0) goto L5e
            r9 = r1
            r0 = r9
            goto L6b
        L5e:
            java.lang.reflect.Field r9 = r6.getCachedSizeField()
            long r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.objectFieldOffset(r9)
            int r0 = (int) r4
            r9 = r3
        L68:
            r3 = r9
            r9 = r0
            r0 = r1
        L6b:
            int r4 = r6.getFieldNumber()
            r7[r8] = r4
            boolean r4 = r6.isEnforceUtf8()
            if (r4 == 0) goto L7a
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            goto L7b
        L7a:
            r4 = r1
        L7b:
            boolean r5 = r6.isRequired()
            if (r5 == 0) goto L83
            r1 = 268435456(0x10000000, float:2.5243549E-29)
        L83:
            int r5 = r8 + 1
            int r3 = r3 << 20
            r1 = r1 | r4
            r1 = r1 | r3
            r1 = r1 | r2
            r7[r5] = r1
            int r1 = r8 + 2
            int r0 = r0 << 20
            r9 = r9 | r0
            r7[r1] = r9
            java.lang.Class r7 = r6.getMessageFieldClass()
            java.lang.Object r9 = r6.getMapDefaultEntry()
            if (r9 == 0) goto Lbd
            int r8 = r8 / 3
            int r8 = r8 * 2
            java.lang.Object r9 = r6.getMapDefaultEntry()
            r10[r8] = r9
            if (r7 == 0) goto Lae
            int r8 = r8 + 1
            r10[r8] = r7
            goto Lda
        Lae:
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r7 = r6.getEnumVerifier()
            if (r7 == 0) goto Lda
            int r8 = r8 + 1
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r6 = r6.getEnumVerifier()
            r10[r8] = r6
            goto Lda
        Lbd:
            if (r7 == 0) goto Lc8
            int r8 = r8 / 3
            int r8 = r8 * 2
            int r8 = r8 + 1
            r10[r8] = r7
            goto Lda
        Lc8:
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r7 = r6.getEnumVerifier()
            if (r7 == 0) goto Lda
            int r8 = r8 / 3
            int r8 = r8 * 2
            int r8 = r8 + 1
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r6 = r6.getEnumVerifier()
            r10[r8] = r6
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.storeFieldData(androidx.datastore.preferences.protobuf.FieldInfo, int[], int, boolean, java.lang.Object[]):void");
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public boolean equals(T t, T t2) {
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            if (!equals(t, t2, i)) {
                return false;
            }
        }
        if (this.unknownFieldSchema.getFromMessage(t).equals(this.unknownFieldSchema.getFromMessage(t2))) {
            if (this.hasExtensions) {
                return this.extensionSchema.getExtensions(t).equals(this.extensionSchema.getExtensions(t2));
            }
            return true;
        }
        return false;
    }

    private boolean equals(T t, T t2, int i) {
        int typeAndOffsetAt = typeAndOffsetAt(i);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(t, t2, i) && Double.doubleToLongBits(UnsafeUtil.getDouble(t, offset)) == Double.doubleToLongBits(UnsafeUtil.getDouble(t2, offset));
            case 1:
                return arePresentForEquals(t, t2, i) && Float.floatToIntBits(UnsafeUtil.getFloat(t, offset)) == Float.floatToIntBits(UnsafeUtil.getFloat(t2, offset));
            case 2:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getLong(t, offset) == UnsafeUtil.getLong(t2, offset);
            case 3:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getLong(t, offset) == UnsafeUtil.getLong(t2, offset);
            case 4:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getInt(t, offset) == UnsafeUtil.getInt(t2, offset);
            case 5:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getLong(t, offset) == UnsafeUtil.getLong(t2, offset);
            case 6:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getInt(t, offset) == UnsafeUtil.getInt(t2, offset);
            case 7:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getBoolean(t, offset) == UnsafeUtil.getBoolean(t2, offset);
            case 8:
                return arePresentForEquals(t, t2, i) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset));
            case 9:
                return arePresentForEquals(t, t2, i) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset));
            case 10:
                return arePresentForEquals(t, t2, i) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset));
            case 11:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getInt(t, offset) == UnsafeUtil.getInt(t2, offset);
            case 12:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getInt(t, offset) == UnsafeUtil.getInt(t2, offset);
            case 13:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getInt(t, offset) == UnsafeUtil.getInt(t2, offset);
            case 14:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getLong(t, offset) == UnsafeUtil.getLong(t2, offset);
            case 15:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getInt(t, offset) == UnsafeUtil.getInt(t2, offset);
            case 16:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getLong(t, offset) == UnsafeUtil.getLong(t2, offset);
            case 17:
                return arePresentForEquals(t, t2, i) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
            case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
            case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
            case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
            case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case JSONzip.substringLimit /* 40 */:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset));
            case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return isOneofCaseEqual(t, t2, i) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset));
            default:
                return true;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int hashCode(T t) {
        int i;
        int hashLong;
        int length = this.buffer.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i3);
            int numberAt = numberAt(i3);
            long offset = offset(typeAndOffsetAt);
            switch (type(typeAndOffsetAt)) {
                case 0:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(t, offset)));
                    break;
                case 1:
                    i = i2 * 53;
                    hashLong = Float.floatToIntBits(UnsafeUtil.getFloat(t, offset));
                    break;
                case 2:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t, offset));
                    break;
                case 3:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t, offset));
                    break;
                case 4:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getInt(t, offset);
                    break;
                case 5:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t, offset));
                    break;
                case 6:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getInt(t, offset);
                    break;
                case 7:
                    i = i2 * 53;
                    hashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(t, offset));
                    break;
                case 8:
                    i = i2 * 53;
                    hashLong = ((String) UnsafeUtil.getObject(t, offset)).hashCode();
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(t, offset);
                    if (object != null) {
                        hashLong = object.hashCode();
                        i = i2 * 53;
                        break;
                    }
                    hashLong = 37;
                    i = i2 * 53;
                case 10:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                    break;
                case 11:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getInt(t, offset);
                    break;
                case 12:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getInt(t, offset);
                    break;
                case 13:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getInt(t, offset);
                    break;
                case 14:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t, offset));
                    break;
                case 15:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getInt(t, offset);
                    break;
                case 16:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t, offset));
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(t, offset);
                    if (object2 != null) {
                        hashLong = object2.hashCode();
                        i = i2 * 53;
                        break;
                    }
                    hashLong = 37;
                    i = i2 * 53;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case JSONzip.substringLimit /* 40 */:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                    break;
                case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                    break;
                case 51:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t, offset)));
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Float.floatToIntBits(oneofFloatAt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(t, offset);
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(t, offset);
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashBoolean(oneofBooleanAt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = ((String) UnsafeUtil.getObject(t, offset)).hashCode();
                        break;
                    } else {
                        continue;
                    }
                case 60:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(t, offset);
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(t, offset);
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(t, offset);
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(t, offset);
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i2 = i + hashLong;
        }
        int hashCode = (i2 * 53) + this.unknownFieldSchema.getFromMessage(t).hashCode();
        return this.hasExtensions ? (hashCode * 53) + this.extensionSchema.getExtensions(t).hashCode() : hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.buffer.length; i += 3) {
            mergeSingleField(t, t2, i);
        }
        if (this.proto3) {
            return;
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t, t2);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t, t2);
        }
    }

    private void mergeSingleField(T t, T t2, int i) {
        int typeAndOffsetAt = typeAndOffsetAt(i);
        long offset = offset(typeAndOffsetAt);
        int numberAt = numberAt(i);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putDouble(t, offset, UnsafeUtil.getDouble(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 1:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putFloat(t, offset, UnsafeUtil.getFloat(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 2:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putLong(t, offset, UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 3:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putLong(t, offset, UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 4:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 5:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putLong(t, offset, UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 6:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 7:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putBoolean(t, offset, UnsafeUtil.getBoolean(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 8:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putObject(t, offset, UnsafeUtil.getObject(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 9:
                mergeMessage(t, t2, i);
                return;
            case 10:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putObject(t, offset, UnsafeUtil.getObject(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 11:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 12:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 13:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 14:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putLong(t, offset, UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 15:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 16:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putLong(t, offset, UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 17:
                mergeMessage(t, t2, i);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
            case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
            case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
            case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
            case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case JSONzip.substringLimit /* 40 */:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(t, t2, offset);
                return;
            case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                SchemaUtil.mergeMap(this.mapFieldSchema, t, t2, offset);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t2, numberAt, i)) {
                    UnsafeUtil.putObject(t, offset, UnsafeUtil.getObject(t2, offset));
                    setOneofPresent(t, numberAt, i);
                    return;
                }
                return;
            case 60:
                mergeOneofMessage(t, t2, i);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t2, numberAt, i)) {
                    UnsafeUtil.putObject(t, offset, UnsafeUtil.getObject(t2, offset));
                    setOneofPresent(t, numberAt, i);
                    return;
                }
                return;
            case 68:
                mergeOneofMessage(t, t2, i);
                return;
            default:
                return;
        }
    }

    private void mergeMessage(T t, T t2, int i) {
        long offset = offset(typeAndOffsetAt(i));
        if (isFieldPresent(t2, i)) {
            Object object = UnsafeUtil.getObject(t, offset);
            Object object2 = UnsafeUtil.getObject(t2, offset);
            if (object != null && object2 != null) {
                UnsafeUtil.putObject(t, offset, Internal.mergeMessage(object, object2));
                setFieldPresent(t, i);
            } else if (object2 != null) {
                UnsafeUtil.putObject(t, offset, object2);
                setFieldPresent(t, i);
            }
        }
    }

    private void mergeOneofMessage(T t, T t2, int i) {
        int typeAndOffsetAt = typeAndOffsetAt(i);
        int numberAt = numberAt(i);
        long offset = offset(typeAndOffsetAt);
        if (isOneofPresent(t2, numberAt, i)) {
            Object object = UnsafeUtil.getObject(t, offset);
            Object object2 = UnsafeUtil.getObject(t2, offset);
            if (object != null && object2 != null) {
                UnsafeUtil.putObject(t, offset, Internal.mergeMessage(object, object2));
                setOneofPresent(t, numberAt, i);
            } else if (object2 != null) {
                UnsafeUtil.putObject(t, offset, object2);
                setOneofPresent(t, numberAt, i);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int getSerializedSize(T t) {
        return this.proto3 ? getSerializedSizeProto3(t) : getSerializedSizeProto2(t);
    }

    private int getSerializedSizeProto2(T t) {
        int i;
        int i2;
        int computeDoubleSize;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < this.buffer.length; i6 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i6);
            int numberAt = numberAt(i6);
            int type = type(typeAndOffsetAt);
            if (type <= 17) {
                i = this.buffer[i6 + 2];
                int i7 = 1048575 & i;
                if (i7 != i3) {
                    i5 = unsafe.getInt(t, i7);
                    i3 = i7;
                }
                i2 = 1 << (i >>> 20);
            } else {
                i = (!this.useCachedSizeField || type < FieldType.DOUBLE_LIST_PACKED.id() || type > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i6 + 2] & 1048575;
                i2 = 0;
            }
            long offset = offset(typeAndOffsetAt);
            switch (type) {
                case 0:
                    if ((i5 & i2) != 0) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if ((i5 & i2) != 0) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if ((i5 & i2) != 0) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, unsafe.getLong(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if ((i5 & i2) != 0) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, unsafe.getLong(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if ((i5 & i2) != 0) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, unsafe.getInt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if ((i5 & i2) != 0) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if ((i5 & i2) != 0) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if ((i5 & i2) != 0) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if ((i5 & i2) != 0) {
                        Object object = unsafe.getObject(t, offset);
                        if (object instanceof ByteString) {
                            computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object);
                            break;
                        } else {
                            computeDoubleSize = CodedOutputStream.computeStringSize(numberAt, (String) object);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if ((i5 & i2) != 0) {
                        computeDoubleSize = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(t, offset), getMessageFieldSchema(i6));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if ((i5 & i2) != 0) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if ((i5 & i2) != 0) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, unsafe.getInt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if ((i5 & i2) != 0) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, unsafe.getInt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if ((i5 & i2) != 0) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if ((i5 & i2) != 0) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if ((i5 & i2) != 0) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, unsafe.getInt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if ((i5 & i2) != 0) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, unsafe.getLong(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if ((i5 & i2) != 0) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(t, offset), getMessageFieldSchema(i6));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t, offset), false);
                    break;
                case 19:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t, offset), false);
                    break;
                case 20:
                    computeDoubleSize = SchemaUtil.computeSizeInt64List(numberAt, (List) unsafe.getObject(t, offset), false);
                    break;
                case 21:
                    computeDoubleSize = SchemaUtil.computeSizeUInt64List(numberAt, (List) unsafe.getObject(t, offset), false);
                    break;
                case 22:
                    computeDoubleSize = SchemaUtil.computeSizeInt32List(numberAt, (List) unsafe.getObject(t, offset), false);
                    break;
                case 23:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t, offset), false);
                    break;
                case 24:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t, offset), false);
                    break;
                case 25:
                    computeDoubleSize = SchemaUtil.computeSizeBoolList(numberAt, (List) unsafe.getObject(t, offset), false);
                    break;
                case 26:
                    computeDoubleSize = SchemaUtil.computeSizeStringList(numberAt, (List) unsafe.getObject(t, offset));
                    break;
                case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                    computeDoubleSize = SchemaUtil.computeSizeMessageList(numberAt, (List) unsafe.getObject(t, offset), getMessageFieldSchema(i6));
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                    computeDoubleSize = SchemaUtil.computeSizeByteStringList(numberAt, (List) unsafe.getObject(t, offset));
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                    computeDoubleSize = SchemaUtil.computeSizeUInt32List(numberAt, (List) unsafe.getObject(t, offset), false);
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                    computeDoubleSize = SchemaUtil.computeSizeEnumList(numberAt, (List) unsafe.getObject(t, offset), false);
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t, offset), false);
                    break;
                case 32:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t, offset), false);
                    break;
                case 33:
                    computeDoubleSize = SchemaUtil.computeSizeSInt32List(numberAt, (List) unsafe.getObject(t, offset), false);
                    break;
                case 34:
                    computeDoubleSize = SchemaUtil.computeSizeSInt64List(numberAt, (List) unsafe.getObject(t, offset), false);
                    break;
                case 35:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeSizeFixed64ListNoTag + computeTagSize + computeUInt32SizeNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeSizeFixed64ListNoTag + computeTagSize + computeUInt32SizeNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeSizeFixed64ListNoTag + computeTagSize + computeUInt32SizeNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeSizeFixed64ListNoTag + computeTagSize + computeUInt32SizeNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeSizeFixed64ListNoTag + computeTagSize + computeUInt32SizeNoTag;
                        break;
                    } else {
                        continue;
                    }
                case JSONzip.substringLimit /* 40 */:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeSizeFixed64ListNoTag + computeTagSize + computeUInt32SizeNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeSizeFixed64ListNoTag + computeTagSize + computeUInt32SizeNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeSizeFixed64ListNoTag + computeTagSize + computeUInt32SizeNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeSizeFixed64ListNoTag + computeTagSize + computeUInt32SizeNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeSizeFixed64ListNoTag + computeTagSize + computeUInt32SizeNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeSizeFixed64ListNoTag + computeTagSize + computeUInt32SizeNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeSizeFixed64ListNoTag + computeTagSize + computeUInt32SizeNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeSizeFixed64ListNoTag + computeTagSize + computeUInt32SizeNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeSizeFixed64ListNoTag + computeTagSize + computeUInt32SizeNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    computeDoubleSize = SchemaUtil.computeSizeGroupList(numberAt, (List) unsafe.getObject(t, offset), getMessageFieldSchema(i6));
                    break;
                case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                    computeDoubleSize = this.mapFieldSchema.getSerializedSize(numberAt, unsafe.getObject(t, offset), getMapFieldDefaultEntry(i6));
                    break;
                case 51:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (isOneofPresent(t, numberAt, i6)) {
                        Object object2 = unsafe.getObject(t, offset);
                        if (object2 instanceof ByteString) {
                            computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object2);
                            break;
                        } else {
                            computeDoubleSize = CodedOutputStream.computeStringSize(numberAt, (String) object2);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(t, offset), getMessageFieldSchema(i6));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(t, offset), getMessageFieldSchema(i6));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i4 += computeDoubleSize;
        }
        int unknownFieldsSerializedSize = i4 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t).getSerializedSize() : unknownFieldsSerializedSize;
    }

    private int getSerializedSizeProto3(T t) {
        int computeDoubleSize;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i = 0;
        for (int i2 = 0; i2 < this.buffer.length; i2 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i2);
            int type = type(typeAndOffsetAt);
            int numberAt = numberAt(i2);
            long offset = offset(typeAndOffsetAt);
            int i3 = (type < FieldType.DOUBLE_LIST_PACKED.id() || type > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i2 + 2] & 1048575;
            switch (type) {
                case 0:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, UnsafeUtil.getLong(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, UnsafeUtil.getLong(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, UnsafeUtil.getInt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (isFieldPresent(t, i2)) {
                        Object object = UnsafeUtil.getObject(t, offset);
                        if (object instanceof ByteString) {
                            computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object);
                            break;
                        } else {
                            computeDoubleSize = CodedOutputStream.computeStringSize(numberAt, (String) object);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = SchemaUtil.computeSizeMessage(numberAt, UnsafeUtil.getObject(t, offset), getMessageFieldSchema(i2));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) UnsafeUtil.getObject(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, UnsafeUtil.getInt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, UnsafeUtil.getInt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, UnsafeUtil.getInt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, UnsafeUtil.getLong(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) UnsafeUtil.getObject(t, offset), getMessageFieldSchema(i2));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, listAt(t, offset), false);
                    break;
                case 19:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, listAt(t, offset), false);
                    break;
                case 20:
                    computeDoubleSize = SchemaUtil.computeSizeInt64List(numberAt, listAt(t, offset), false);
                    break;
                case 21:
                    computeDoubleSize = SchemaUtil.computeSizeUInt64List(numberAt, listAt(t, offset), false);
                    break;
                case 22:
                    computeDoubleSize = SchemaUtil.computeSizeInt32List(numberAt, listAt(t, offset), false);
                    break;
                case 23:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, listAt(t, offset), false);
                    break;
                case 24:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, listAt(t, offset), false);
                    break;
                case 25:
                    computeDoubleSize = SchemaUtil.computeSizeBoolList(numberAt, listAt(t, offset), false);
                    break;
                case 26:
                    computeDoubleSize = SchemaUtil.computeSizeStringList(numberAt, listAt(t, offset));
                    break;
                case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                    computeDoubleSize = SchemaUtil.computeSizeMessageList(numberAt, listAt(t, offset), getMessageFieldSchema(i2));
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                    computeDoubleSize = SchemaUtil.computeSizeByteStringList(numberAt, listAt(t, offset));
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                    computeDoubleSize = SchemaUtil.computeSizeUInt32List(numberAt, listAt(t, offset), false);
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                    computeDoubleSize = SchemaUtil.computeSizeEnumList(numberAt, listAt(t, offset), false);
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, listAt(t, offset), false);
                    break;
                case 32:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, listAt(t, offset), false);
                    break;
                case 33:
                    computeDoubleSize = SchemaUtil.computeSizeSInt32List(numberAt, listAt(t, offset), false);
                    break;
                case 34:
                    computeDoubleSize = SchemaUtil.computeSizeSInt64List(numberAt, listAt(t, offset), false);
                    break;
                case 35:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case JSONzip.substringLimit /* 40 */:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    computeDoubleSize = SchemaUtil.computeSizeGroupList(numberAt, listAt(t, offset), getMessageFieldSchema(i2));
                    break;
                case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                    computeDoubleSize = this.mapFieldSchema.getSerializedSize(numberAt, UnsafeUtil.getObject(t, offset), getMapFieldDefaultEntry(i2));
                    break;
                case 51:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (isOneofPresent(t, numberAt, i2)) {
                        Object object2 = UnsafeUtil.getObject(t, offset);
                        if (object2 instanceof ByteString) {
                            computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object2);
                            break;
                        } else {
                            computeDoubleSize = CodedOutputStream.computeStringSize(numberAt, (String) object2);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = SchemaUtil.computeSizeMessage(numberAt, UnsafeUtil.getObject(t, offset), getMessageFieldSchema(i2));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) UnsafeUtil.getObject(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(t, offset));
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) UnsafeUtil.getObject(t, offset), getMessageFieldSchema(i2));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i += computeDoubleSize;
        }
        return i + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t);
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t));
    }

    private static List<?> listAt(Object obj, long j) {
        return (List) UnsafeUtil.getObject(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void writeTo(T t, Writer writer) {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t, writer);
        } else if (this.proto3) {
            writeFieldsInAscendingOrderProto3(t, writer);
        } else {
            writeFieldsInAscendingOrderProto2(t, writer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x049e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInAscendingOrderProto2(T r18, androidx.datastore.preferences.protobuf.Writer r19) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.writeFieldsInAscendingOrderProto2(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0588  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInAscendingOrderProto3(T r13, androidx.datastore.preferences.protobuf.Writer r14) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.writeFieldsInAscendingOrderProto3(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x058e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInDescendingOrder(T r11, androidx.datastore.preferences.protobuf.Writer r12) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.writeFieldsInDescendingOrder(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    private <K, V> void writeMapHelper(Writer writer, int i, Object obj, int i2) {
        if (obj != null) {
            writer.writeMap(i, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t, Writer writer) {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t), writer);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t, reader, extensionRegistryLite);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        r0 = r16.checkInitializedCount;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r0 >= r16.repeatedFieldOffsetStart) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
        r13 = filterMapUnknownEnumValues(r19, r16.intArray[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r13 == null) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
        r17.setBuilderToMessage(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> r17, androidx.datastore.preferences.protobuf.ExtensionSchema<ET> r18, T r19, androidx.datastore.preferences.protobuf.Reader r20, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r21) {
        /*
            Method dump skipped, instructions count: 1718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.mergeFromHelper(androidx.datastore.preferences.protobuf.UnknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema, java.lang.Object, androidx.datastore.preferences.protobuf.Reader, androidx.datastore.preferences.protobuf.ExtensionRegistryLite):void");
    }

    private Schema getMessageFieldSchema(int i) {
        int i2 = (i / 3) * 2;
        Schema schema = (Schema) this.objects[i2];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaFor = Protobuf.getInstance().schemaFor((Class) ((Class) this.objects[i2 + 1]));
        this.objects[i2] = schemaFor;
        return schemaFor;
    }

    private Object getMapFieldDefaultEntry(int i) {
        return this.objects[(i / 3) * 2];
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i) {
        return (Internal.EnumVerifier) this.objects[((i / 3) * 2) + 1];
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void makeImmutable(T t) {
        int i;
        int i2 = this.checkInitializedCount;
        while (true) {
            i = this.repeatedFieldOffsetStart;
            if (i2 >= i) {
                break;
            }
            long offset = offset(typeAndOffsetAt(this.intArray[i2]));
            Object object = UnsafeUtil.getObject(t, offset);
            if (object != null) {
                UnsafeUtil.putObject(t, offset, this.mapFieldSchema.toImmutable(object));
            }
            i2++;
        }
        int length = this.intArray.length;
        while (i < length) {
            this.listFieldSchema.makeImmutableListAt(t, this.intArray[i]);
            i++;
        }
        this.unknownFieldSchema.makeImmutable(t);
        if (this.hasExtensions) {
            this.extensionSchema.makeImmutable(t);
        }
    }

    private final <K, V> void mergeMap(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) {
        long offset = offset(typeAndOffsetAt(i));
        Object object = UnsafeUtil.getObject(obj, offset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, offset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object newMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            UnsafeUtil.putObject(obj, offset, newMapField);
            object = newMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    private final <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        Internal.EnumVerifier enumFieldVerifier;
        int numberAt = numberAt(i);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i)) == null) ? ub : (UB) filterUnknownEnumMap(i, numberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub, unknownFieldSchema);
    }

    private final <K, V, UT, UB> UB filterUnknownEnumMap(int i, int i2, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        MapEntryLite.Metadata<?, ?> forMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = unknownFieldSchema.newBuilder();
                }
                ByteString.CodedBuilder newCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(forMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(newCodedBuilder.getCodedOutput(), forMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub, i2, newCodedBuilder.build());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean isInitialized(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.checkInitializedCount; i4++) {
            int i5 = this.intArray[i4];
            int numberAt = numberAt(i5);
            int typeAndOffsetAt = typeAndOffsetAt(i5);
            if (this.proto3) {
                i = 0;
            } else {
                int i6 = this.buffer[i5 + 2];
                int i7 = 1048575 & i6;
                i = 1 << (i6 >>> 20);
                if (i7 != i2) {
                    i3 = UNSAFE.getInt(t, i7);
                    i2 = i7;
                }
            }
            if (isRequired(typeAndOffsetAt) && !isFieldPresent(t, i5, i3, i)) {
                return false;
            }
            int type = type(typeAndOffsetAt);
            if (type == 9 || type == 17) {
                if (isFieldPresent(t, i5, i3, i) && !isInitialized(t, typeAndOffsetAt, getMessageFieldSchema(i5))) {
                    return false;
                }
            } else {
                if (type != 27) {
                    if (type == 60 || type == 68) {
                        if (isOneofPresent(t, numberAt, i5) && !isInitialized(t, typeAndOffsetAt, getMessageFieldSchema(i5))) {
                            return false;
                        }
                    } else if (type != 49) {
                        if (type == 50 && !isMapInitialized(t, typeAndOffsetAt, i5)) {
                            return false;
                        }
                    }
                }
                if (!isListInitialized(t, typeAndOffsetAt, i5)) {
                    return false;
                }
            }
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(t).isInitialized();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i, int i2) {
        List list = (List) UnsafeUtil.getObject(obj, offset(i));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!messageFieldSchema.isInitialized(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.datastore.preferences.protobuf.Schema] */
    private boolean isMapInitialized(T t, int i, int i2) {
        Map<?, ?> forMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t, offset(i)));
        if (forMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        Schema<T> schema = 0;
        for (Object obj : forMapData.values()) {
            if (schema == null) {
                schema = Protobuf.getInstance().schemaFor((Class) obj.getClass());
            }
            boolean isInitialized = schema.isInitialized(obj);
            schema = schema;
            if (!isInitialized) {
                return false;
            }
        }
        return true;
    }

    private void writeString(int i, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.writeString(i, (String) obj);
        } else {
            writer.writeBytes(i, (ByteString) obj);
        }
    }

    private void readString(Object obj, int i, Reader reader) {
        if (isEnforceUtf8(i)) {
            UnsafeUtil.putObject(obj, offset(i), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i, Reader reader) {
        if (isEnforceUtf8(i)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i)));
        }
    }

    private <E> void readMessageList(Object obj, int i, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i)), schema, extensionRegistryLite);
    }

    private <E> void readGroupList(Object obj, long j, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j), schema, extensionRegistryLite);
    }

    private int numberAt(int i) {
        return this.buffer[i];
    }

    private int typeAndOffsetAt(int i) {
        return this.buffer[i + 1];
    }

    private int presenceMaskAndOffsetAt(int i) {
        return this.buffer[i + 2];
    }

    private static <T> double doubleAt(T t, long j) {
        return UnsafeUtil.getDouble(t, j);
    }

    private static <T> float floatAt(T t, long j) {
        return UnsafeUtil.getFloat(t, j);
    }

    private static <T> int intAt(T t, long j) {
        return UnsafeUtil.getInt(t, j);
    }

    private static <T> long longAt(T t, long j) {
        return UnsafeUtil.getLong(t, j);
    }

    private static <T> boolean booleanAt(T t, long j) {
        return UnsafeUtil.getBoolean(t, j);
    }

    private static <T> double oneofDoubleAt(T t, long j) {
        return ((Double) UnsafeUtil.getObject(t, j)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t, long j) {
        return ((Float) UnsafeUtil.getObject(t, j)).floatValue();
    }

    private static <T> int oneofIntAt(T t, long j) {
        return ((Integer) UnsafeUtil.getObject(t, j)).intValue();
    }

    private static <T> long oneofLongAt(T t, long j) {
        return ((Long) UnsafeUtil.getObject(t, j)).longValue();
    }

    private static <T> boolean oneofBooleanAt(T t, long j) {
        return ((Boolean) UnsafeUtil.getObject(t, j)).booleanValue();
    }

    private boolean arePresentForEquals(T t, T t2, int i) {
        return isFieldPresent(t, i) == isFieldPresent(t2, i);
    }

    private boolean isFieldPresent(T t, int i, int i2, int i3) {
        if (this.proto3) {
            return isFieldPresent(t, i);
        }
        return (i2 & i3) != 0;
    }

    private boolean isFieldPresent(T t, int i) {
        boolean equals;
        if (this.proto3) {
            int typeAndOffsetAt = typeAndOffsetAt(i);
            long offset = offset(typeAndOffsetAt);
            switch (type(typeAndOffsetAt)) {
                case 0:
                    return UnsafeUtil.getDouble(t, offset) != 0.0d;
                case 1:
                    return UnsafeUtil.getFloat(t, offset) != 0.0f;
                case 2:
                    return UnsafeUtil.getLong(t, offset) != 0;
                case 3:
                    return UnsafeUtil.getLong(t, offset) != 0;
                case 4:
                    return UnsafeUtil.getInt(t, offset) != 0;
                case 5:
                    return UnsafeUtil.getLong(t, offset) != 0;
                case 6:
                    return UnsafeUtil.getInt(t, offset) != 0;
                case 7:
                    return UnsafeUtil.getBoolean(t, offset);
                case 8:
                    Object object = UnsafeUtil.getObject(t, offset);
                    if (object instanceof String) {
                        equals = ((String) object).isEmpty();
                        break;
                    } else if (object instanceof ByteString) {
                        equals = ByteString.EMPTY.equals(object);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    return UnsafeUtil.getObject(t, offset) != null;
                case 10:
                    equals = ByteString.EMPTY.equals(UnsafeUtil.getObject(t, offset));
                    break;
                case 11:
                    return UnsafeUtil.getInt(t, offset) != 0;
                case 12:
                    return UnsafeUtil.getInt(t, offset) != 0;
                case 13:
                    return UnsafeUtil.getInt(t, offset) != 0;
                case 14:
                    return UnsafeUtil.getLong(t, offset) != 0;
                case 15:
                    return UnsafeUtil.getInt(t, offset) != 0;
                case 16:
                    return UnsafeUtil.getLong(t, offset) != 0;
                case 17:
                    return UnsafeUtil.getObject(t, offset) != null;
                default:
                    throw new IllegalArgumentException();
            }
            return !equals;
        }
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        return (UnsafeUtil.getInt(t, (long) (1048575 & presenceMaskAndOffsetAt)) & (1 << (presenceMaskAndOffsetAt >>> 20))) != 0;
    }

    private void setFieldPresent(T t, int i) {
        if (this.proto3) {
            return;
        }
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & presenceMaskAndOffsetAt;
        UnsafeUtil.putInt(t, j, (1 << (presenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(t, j));
    }

    private boolean isOneofPresent(T t, int i, int i2) {
        return UnsafeUtil.getInt(t, (long) (presenceMaskAndOffsetAt(i2) & 1048575)) == i;
    }

    private boolean isOneofCaseEqual(T t, T t2, int i) {
        long presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i) & 1048575;
        return UnsafeUtil.getInt(t, presenceMaskAndOffsetAt) == UnsafeUtil.getInt(t2, presenceMaskAndOffsetAt);
    }

    private void setOneofPresent(T t, int i, int i2) {
        UnsafeUtil.putInt(t, presenceMaskAndOffsetAt(i2) & 1048575, i);
    }

    private int positionForFieldNumber(int i) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, 0);
    }

    private int slowPositionForFieldNumber(int i, int i2) {
        int length = (this.buffer.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int numberAt = numberAt(i4);
            if (i == numberAt) {
                return i4;
            }
            if (i < numberAt) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
