package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonParser;
import o.InterfaceC9321nQ;

/* loaded from: classes2.dex */
public enum JsonReadFeature implements InterfaceC9321nQ {
    ALLOW_JAVA_COMMENTS(false, JsonParser.Feature.ALLOW_COMMENTS),
    ALLOW_YAML_COMMENTS(false, JsonParser.Feature.ALLOW_YAML_COMMENTS),
    ALLOW_SINGLE_QUOTES(false, JsonParser.Feature.ALLOW_SINGLE_QUOTES),
    ALLOW_UNQUOTED_FIELD_NAMES(false, JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES),
    ALLOW_UNESCAPED_CONTROL_CHARS(false, JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS),
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false, JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER),
    ALLOW_LEADING_ZEROS_FOR_NUMBERS(false, JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS),
    ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS(false, JsonParser.Feature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS),
    ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false, JsonParser.Feature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS),
    ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS(false, JsonParser.Feature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS),
    ALLOW_NON_NUMERIC_NUMBERS(false, JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS),
    ALLOW_MISSING_VALUES(false, JsonParser.Feature.ALLOW_MISSING_VALUES),
    ALLOW_TRAILING_COMMA(false, JsonParser.Feature.ALLOW_TRAILING_COMMA);
    
    private final boolean k;
    private final int q = 1 << ordinal();
    private final JsonParser.Feature t;

    @Override // o.InterfaceC9383oZ
    public int a() {
        return this.q;
    }

    @Override // o.InterfaceC9383oZ
    public boolean b() {
        return this.k;
    }

    public JsonParser.Feature e() {
        return this.t;
    }

    JsonReadFeature(boolean z, JsonParser.Feature feature) {
        this.k = z;
        this.t = feature;
    }
}
