package com.netflix.mediaclient.service.webclient.model.leafs;

import com.netflix.cl.model.ABTest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class SyntheticAllocationConfigData extends HashMap<String, String> {
    public SyntheticAllocationConfigData(Map<String, String> map) {
        if (map != null) {
            putAll(map);
        }
    }

    public List<ABTest> getAllTestAllocations() {
        if (isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : entrySet()) {
            try {
                arrayList.add(new ABTest(entry.getKey(), Integer.parseInt(entry.getValue())));
            } catch (NumberFormatException unused) {
            }
        }
        return arrayList;
    }
}
