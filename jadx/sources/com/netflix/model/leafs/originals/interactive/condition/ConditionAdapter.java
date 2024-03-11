package com.netflix.model.leafs.originals.interactive.condition;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.ConditionSegmentsList;
import java.util.ArrayList;
import java.util.HashSet;
import o.C1044Mm;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;

/* loaded from: classes.dex */
public class ConditionAdapter extends TypeAdapter<Condition> {
    public static final String TAG = "InteractiveAdapter";

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Condition condition) {
        jsonWriter.beginArray();
        condition.write(jsonWriter);
        jsonWriter.endArray();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public Condition read(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return readNextCondition(jsonReader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.model.leafs.originals.interactive.condition.ConditionAdapter$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private Condition readNextCondition(JsonReader jsonReader) {
        int i = AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[jsonReader.peek().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return new ConditionPrimitive(jsonReader.nextString());
                    }
                    InterfaceC1598aHf.a("Unable to parse conditions for title");
                    throw new IllegalStateException();
                }
                return new ConditionPrimitive(Double.valueOf(jsonReader.nextDouble()));
            }
            return new ConditionPrimitive(Boolean.valueOf(jsonReader.nextBoolean()));
        }
        return extractCondition(jsonReader);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Condition extractCondition(JsonReader jsonReader) {
        char c;
        Condition conditionPersistentState;
        Condition conditionSegmentsList;
        jsonReader.beginArray();
        if (jsonReader.peek() != JsonToken.STRING) {
            C1044Mm.d(TAG, "extractCondition: object is not null ");
        }
        String nextString = jsonReader.nextString();
        nextString.hashCode();
        switch (nextString.hashCode()) {
            case -1762603974:
                if (nextString.equals("persistentState")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1062014014:
                if (nextString.equals("lastSeenSegment")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -852582738:
                if (nextString.equals("globalState")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -788095243:
                if (nextString.equals("hasSeenSegments")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -697335909:
                if (nextString.equals("sessionState")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -650968616:
                if (nextString.equals("precondition")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3309:
                if (nextString.equals("gt")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3464:
                if (nextString.equals("lt")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 3555:
                if (nextString.equals("or")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 96727:
                if (nextString.equals("and")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 99473:
                if (nextString.equals("div")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 100672:
                if (nextString.equals("eql")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 102680:
                if (nextString.equals("gte")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 107876:
                if (nextString.equals("max")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 108114:
                if (nextString.equals("min")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 108290:
                if (nextString.equals("mod")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 109267:
                if (nextString.equals("not")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 114251:
                if (nextString.equals("sum")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 3363120:
                if (nextString.equals("mult")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                conditionPersistentState = new ConditionPersistentState(jsonReader.nextString());
                break;
            case 1:
                conditionPersistentState = new ConditionLastSeenSegment(jsonReader.nextString());
                break;
            case 2:
                conditionPersistentState = new ConditionGlobalState(jsonReader.nextString());
                break;
            case 3:
                HashSet hashSet = new HashSet();
                while (jsonReader.peek() != JsonToken.END_ARRAY) {
                    hashSet.add(jsonReader.nextString());
                }
                conditionSegmentsList = new ConditionSegmentsList(hashSet);
                conditionPersistentState = conditionSegmentsList;
                break;
            case 4:
                conditionPersistentState = new ConditionSessionState(jsonReader.nextString());
                break;
            case 5:
                conditionSegmentsList = new ConditionPreconditionIdState(jsonReader.nextString());
                conditionPersistentState = conditionSegmentsList;
                break;
            case 6:
                ArrayList arrayList = new ArrayList();
                while (jsonReader.peek() != JsonToken.END_ARRAY) {
                    arrayList.add(readNextCondition(jsonReader));
                }
                conditionSegmentsList = new ConditionGreaterThan(arrayList);
                conditionPersistentState = conditionSegmentsList;
                break;
            case 7:
                ArrayList arrayList2 = new ArrayList();
                while (jsonReader.peek() != JsonToken.END_ARRAY) {
                    arrayList2.add(readNextCondition(jsonReader));
                }
                conditionSegmentsList = new ConditionLessThan(arrayList2);
                conditionPersistentState = conditionSegmentsList;
                break;
            case '\b':
                ArrayList arrayList3 = new ArrayList();
                while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                    arrayList3.add(readNextCondition(jsonReader));
                }
                conditionSegmentsList = new ConditionOr(arrayList3);
                conditionPersistentState = conditionSegmentsList;
                break;
            case '\t':
                ArrayList arrayList4 = new ArrayList();
                while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                    arrayList4.add(readNextCondition(jsonReader));
                }
                conditionSegmentsList = new ConditionAnd(arrayList4);
                conditionPersistentState = conditionSegmentsList;
                break;
            case '\n':
                ArrayList arrayList5 = new ArrayList();
                while (jsonReader.peek() != JsonToken.END_ARRAY) {
                    arrayList5.add(readNextCondition(jsonReader));
                }
                conditionSegmentsList = new ConditionDiv(arrayList5);
                conditionPersistentState = conditionSegmentsList;
                break;
            case 11:
                ArrayList arrayList6 = new ArrayList();
                while (jsonReader.peek() != JsonToken.END_ARRAY) {
                    arrayList6.add(readNextCondition(jsonReader));
                }
                conditionSegmentsList = new ConditionEquals((Condition[]) arrayList6.toArray(new Condition[0]));
                conditionPersistentState = conditionSegmentsList;
                break;
            case '\f':
                ArrayList arrayList7 = new ArrayList();
                while (jsonReader.peek() != JsonToken.END_ARRAY) {
                    arrayList7.add(readNextCondition(jsonReader));
                }
                conditionSegmentsList = new ConditionGreaterThanOrEqual(arrayList7);
                conditionPersistentState = conditionSegmentsList;
                break;
            case '\r':
                ArrayList arrayList8 = new ArrayList();
                while (jsonReader.peek() != JsonToken.END_ARRAY) {
                    arrayList8.add(readNextCondition(jsonReader));
                }
                conditionSegmentsList = new ConditionMax(arrayList8);
                conditionPersistentState = conditionSegmentsList;
                break;
            case 14:
                ArrayList arrayList9 = new ArrayList();
                while (jsonReader.peek() != JsonToken.END_ARRAY) {
                    arrayList9.add(readNextCondition(jsonReader));
                }
                conditionSegmentsList = new ConditionMin(arrayList9);
                conditionPersistentState = conditionSegmentsList;
                break;
            case 15:
                ArrayList arrayList10 = new ArrayList();
                while (jsonReader.peek() != JsonToken.END_ARRAY) {
                    arrayList10.add(readNextCondition(jsonReader));
                }
                conditionSegmentsList = new ConditionMod(arrayList10);
                conditionPersistentState = conditionSegmentsList;
                break;
            case 16:
                Condition readNextCondition = readNextCondition(jsonReader);
                if (readNextCondition == null) {
                    conditionPersistentState = new ConditionNot((Condition) null);
                    break;
                } else {
                    conditionSegmentsList = new ConditionNot(readNextCondition);
                    conditionPersistentState = conditionSegmentsList;
                    break;
                }
            case 17:
                ArrayList arrayList11 = new ArrayList();
                while (jsonReader.peek() != JsonToken.END_ARRAY) {
                    arrayList11.add(readNextCondition(jsonReader));
                }
                conditionSegmentsList = new ConditionSum(arrayList11);
                conditionPersistentState = conditionSegmentsList;
                break;
            case 18:
                ArrayList arrayList12 = new ArrayList();
                while (jsonReader.peek() != JsonToken.END_ARRAY) {
                    arrayList12.add(readNextCondition(jsonReader));
                }
                conditionSegmentsList = new ConditionMultiplication(arrayList12);
                conditionPersistentState = conditionSegmentsList;
                break;
            default:
                InterfaceC1593aHa.b("invalid condition type for " + nextString);
                InterfaceC1598aHf.a("Unsupported condition type " + nextString);
                conditionPersistentState = new ConditionPrimitive(Boolean.TRUE);
                break;
        }
        jsonReader.endArray();
        return conditionPersistentState;
    }
}
