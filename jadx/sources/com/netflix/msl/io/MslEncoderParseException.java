package com.netflix.msl.io;

/* loaded from: classes5.dex */
public class MslEncoderParseException extends MslEncoderException {
    private static final long serialVersionUID = -7512822592309998804L;
    private Type a;

    /* loaded from: classes5.dex */
    public enum Type {
        INVALID_TYPE,
        RECURSION,
        UNEXPECTED_TOKEN,
        INDEFINITE_LENGTH_ITEM,
        ITEM_TOO_LONG,
        INTERNAL,
        JACKSON_OOM_BUG,
        NO_SELF_DESCRIBE_TAG,
        MISSING_START_OBJECT,
        MISSING_START_ARRAY,
        MISSING_NAME,
        UNSUPPORTED_INT,
        UNSUPPORTED_FLOAT,
        UNRECOGNIZED_TOKEN,
        TOO_MANY_FIELDS,
        TOO_MANY_OBJECTS,
        TOO_MANY_ARRAYS,
        TOO_MANY_PRIMITIVES,
        NESTING_TOO_DEEP,
        OBJECT_FIELDNAME_TOO_LONG
    }

    public MslEncoderParseException(Type type, String str) {
        super(str);
        this.a = type;
    }

    public MslEncoderParseException(Type type, String str, Throwable th) {
        super(str, th);
        this.a = type;
    }
}
