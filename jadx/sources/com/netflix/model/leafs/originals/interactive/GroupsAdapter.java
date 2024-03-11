package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import o.InterfaceC1598aHf;

/* loaded from: classes.dex */
abstract class GroupsAdapter extends TypeAdapter<Map<String, List<BaseGroupItem>>> {
    abstract String groupType();

    abstract String id();

    GroupsAdapter() {
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Map<String, List<BaseGroupItem>> map) {
        jsonWriter.beginObject();
        for (Map.Entry<String, List<BaseGroupItem>> entry : map.entrySet()) {
            jsonWriter.name(entry.getKey());
            jsonWriter.beginArray();
            for (BaseGroupItem baseGroupItem : entry.getValue()) {
                if (baseGroupItem instanceof StringGroupItem) {
                    jsonWriter.value(((StringGroupItem) baseGroupItem).getId());
                } else if (baseGroupItem instanceof PreconditionGroupItem) {
                    jsonWriter.beginObject();
                    jsonWriter.name(id());
                    PreconditionGroupItem preconditionGroupItem = (PreconditionGroupItem) baseGroupItem;
                    jsonWriter.value(preconditionGroupItem.getId());
                    jsonWriter.name("precondition");
                    jsonWriter.value(preconditionGroupItem.getPrecondition());
                    jsonWriter.endObject();
                } else if (baseGroupItem instanceof SegmentGroupGroupItem) {
                    jsonWriter.beginObject();
                    jsonWriter.name(groupType());
                    jsonWriter.value(((SegmentGroupGroupItem) baseGroupItem).getGroupName());
                    jsonWriter.endObject();
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public Map<String, List<BaseGroupItem>> read(JsonReader jsonReader) {
        Parcelable segmentGroupGroupItem;
        Parcelable preconditionGroupItem;
        HashMap hashMap = new HashMap();
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return hashMap;
        }
        jsonReader.beginObject();
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String nextName = jsonReader.nextName();
            LinkedList linkedList = new LinkedList();
            jsonReader.beginArray();
            while (jsonReader.peek() != JsonToken.END_ARRAY) {
                if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    jsonReader.beginObject();
                    String str = null;
                    String str2 = null;
                    SegmentGroupData segmentGroupData = null;
                    String str3 = null;
                    while (jsonReader.peek() != JsonToken.END_OBJECT) {
                        String nextName2 = jsonReader.nextName();
                        if (groupType().equals(nextName2)) {
                            str = jsonReader.nextString();
                        } else if (id().equals(nextName2)) {
                            str2 = jsonReader.nextString();
                        } else if ("precondition".equals(nextName2)) {
                            str3 = jsonReader.nextString();
                        } else if (NotificationFactory.DATA.equals(nextName2)) {
                            segmentGroupData = SegmentGroupData.fromReader(jsonReader);
                        } else if ("comment".equals(nextName2)) {
                            jsonReader.nextString();
                        } else {
                            InterfaceC1598aHf.a("Interactive unable to parse PreconditionSegmentGroupItem");
                        }
                    }
                    jsonReader.endObject();
                    if (str != null) {
                        segmentGroupGroupItem = new SegmentGroupGroupItem(str);
                    } else if (str2 != null) {
                        if (str3 == null) {
                            preconditionGroupItem = new StringGroupItem(str2);
                        } else {
                            preconditionGroupItem = new PreconditionGroupItem(str2, str3);
                        }
                        segmentGroupGroupItem = preconditionGroupItem;
                    } else if (segmentGroupData != null) {
                        segmentGroupGroupItem = new DataGroupItem(segmentGroupData, str3);
                    } else {
                        InterfaceC1598aHf.a("Interactive unable to parse PreconditionSegmentGroupItem");
                    }
                    linkedList.add(segmentGroupGroupItem);
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    segmentGroupGroupItem = new StringGroupItem(jsonReader.nextString());
                    linkedList.add(segmentGroupGroupItem);
                } else {
                    InterfaceC1598aHf.a("Interactive unsupported segment group item");
                }
            }
            jsonReader.endArray();
            hashMap.put(nextName, linkedList);
        }
        jsonReader.endObject();
        return hashMap;
    }

    /* loaded from: classes.dex */
    public static class SegmentGroupsAdapter extends GroupsAdapter {
        @Override // com.netflix.model.leafs.originals.interactive.GroupsAdapter
        String groupType() {
            return "segmentGroup";
        }

        @Override // com.netflix.model.leafs.originals.interactive.GroupsAdapter
        String id() {
            return "segment";
        }

        @Override // com.netflix.model.leafs.originals.interactive.GroupsAdapter, com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ Map<String, List<BaseGroupItem>> read(JsonReader jsonReader) {
            return super.read(jsonReader);
        }

        @Override // com.netflix.model.leafs.originals.interactive.GroupsAdapter, com.google.gson.TypeAdapter
        /* renamed from: read  reason: avoid collision after fix types in other method */
        public /* bridge */ /* synthetic */ Map<String, List<BaseGroupItem>> read2(JsonReader jsonReader) {
            return super.read(jsonReader);
        }

        @Override // com.netflix.model.leafs.originals.interactive.GroupsAdapter, com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Map<String, List<BaseGroupItem>> map) {
            super.write(jsonWriter, map);
        }

        @Override // com.netflix.model.leafs.originals.interactive.GroupsAdapter
        /* renamed from: write  reason: avoid collision after fix types in other method */
        public /* bridge */ /* synthetic */ void write2(JsonWriter jsonWriter, Map map) {
            super.write(jsonWriter, (Map<String, List<BaseGroupItem>>) map);
        }
    }
}
