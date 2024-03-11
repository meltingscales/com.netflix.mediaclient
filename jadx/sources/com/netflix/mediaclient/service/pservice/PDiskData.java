package com.netflix.mediaclient.service.pservice;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.pservice.PDiskData;
import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.AbstractApplicationC1040Mh;
import o.C1044Mm;
import o.C1071Np;
import o.C1079Nx;
import o.C1332Xp;
import o.C4934bpJ;
import o.C4935bpK;
import o.C8168dfL;
import o.InterfaceC4942bpR;
import o.InterfaceC5222bug;
import o.InterfaceC5223buh;
import o.InterfaceC8366diy;

/* loaded from: classes4.dex */
public class PDiskData {
    public static final int CURRENT_VERSION = 3;
    public static final Boolean ENABLE_VERBOSE_LOGGING = Boolean.FALSE;
    static final List<ListType> MEMBER_LIST_TYPES = Arrays.asList(ListType.BILLBOARD, ListType.CW, ListType.IQ, ListType.STANDARD_FIRST, ListType.STANDARD_SECOND);
    static final List<ListType> NON_MEMBER_LIST_TYPES = Arrays.asList(ListType.NON_MEMBER);
    public static final String PARTNER_EXP_DEFAULT = "default";
    public static final int PREAPP_WIDGET_MAX_NON_MEMBER_VIDEOS = 12;
    public static final int PREAPP_WIDGET_MAX_VIDEOS_FROM_LIST = 9;
    public static final String REPOSITORY_DIR = "preAppData";
    public static final String REPOSITORY_FILE_NAME = "preAppDiskDataFile";
    private static final String TAG = "nf_preapp_diskdata";
    public static final String WIDGET_EXP_DEFAULT = "default";
    final int NFLX_3RD_PARTY_DEEPLINK_TRACKID = 13747225;
    @SerializedName("urlMap")
    public Map<String, String> urlMap = new HashMap();
    @SerializedName("listInfo")
    public Map<String, String> lomoMap = new HashMap();
    @SerializedName("listTacking")
    public Map<String, String> lomoTrackMap = new HashMap();
    @SerializedName("billboardList")
    public List<C4935bpK> billboardList = new ArrayList();
    @SerializedName("cwList")
    public List<C4935bpK> cwList = new ArrayList();
    @SerializedName("iqList")
    public List<C4935bpK> iqList = new ArrayList();
    @SerializedName("standardFirstList")
    public List<C4935bpK> standardFirstList = new ArrayList();
    @SerializedName("standardSecondList")
    public List<C4935bpK> standardSecondList = new ArrayList();
    @SerializedName("nonMemberList")
    public List<C4935bpK> nonMemberList = new ArrayList();
    @SerializedName("preAppPartnerExperience")
    public String preAppPartnerExperience = "default";
    @SerializedName("preAppWidgetExperience")
    public String preAppWidgetExperience = "default";
    @SerializedName("dataTime")
    public long dataTime = System.currentTimeMillis();
    @SerializedName("version")
    public int version = 0;

    public String toJsonString() {
        String json;
        synchronized (this) {
            json = ((Gson) C1332Xp.b(Gson.class)).toJson(this);
        }
        return json;
    }

    public static PDiskData fromJsonString(String str) {
        if (C8168dfL.g(str)) {
            C1044Mm.j(TAG, "fromJsonString diskData is empty, retuning empty object");
            return new PDiskData();
        }
        return (PDiskData) ((Gson) C1332Xp.b(Gson.class)).fromJson(str, (Class<Object>) PDiskData.class);
    }

    private String getTrackingString(LoMo loMo, String str) {
        StringBuilder sb = new StringBuilder();
        if (C8168dfL.h(str)) {
            sb.append("listType=");
            sb.append(str);
            sb.append("&");
        }
        int trackId = (loMo == null || loMo.getTrackId() <= 0) ? 13747225 : loMo.getTrackId();
        sb.append("trkid=");
        sb.append(trackId);
        return sb.toString();
    }

    public void copyListInfoIntoDiskData(List<LoMo> list) {
        synchronized (this) {
            Map<String, String> map = this.lomoMap;
            Map<String, String> map2 = this.lomoTrackMap;
            map.clear();
            for (LoMo loMo : list) {
                if (LoMoType.BILLBOARD.equals(loMo.getType())) {
                    ListType listType = ListType.BILLBOARD;
                    map.put(listType.d(), loMo.getTitle());
                    map2.put(listType.d(), getTrackingString(loMo, listType.d()));
                } else if (LoMoType.CONTINUE_WATCHING.equals(loMo.getType())) {
                    ListType listType2 = ListType.CW;
                    map.put(listType2.d(), loMo.getTitle());
                    map2.put(listType2.d(), getTrackingString(loMo, listType2.d()));
                } else if (LoMoType.INSTANT_QUEUE.equals(loMo.getType())) {
                    ListType listType3 = ListType.IQ;
                    map.put(listType3.d(), loMo.getTitle());
                    map2.put(listType3.d(), getTrackingString(loMo, listType3.d()));
                } else {
                    if (LoMoType.c(loMo.getType())) {
                        ListType listType4 = ListType.STANDARD_FIRST;
                        if (map.get(listType4.d()) == null) {
                            map.put(listType4.d(), loMo.getTitle());
                            map2.put(listType4.d(), getTrackingString(loMo, listType4.d()));
                        }
                    }
                    if (LoMoType.c(loMo.getType())) {
                        ListType listType5 = ListType.STANDARD_SECOND;
                        if (map.get(listType5.d()) == null) {
                            map.put(listType5.d(), loMo.getTitle());
                            map2.put(listType5.d(), getTrackingString(loMo, listType5.d()));
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.service.pservice.PDiskData$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[ListType.values().length];
            d = iArr;
            try {
                iArr[ListType.BILLBOARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[ListType.CW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[ListType.IQ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[ListType.STANDARD_FIRST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[ListType.STANDARD_SECOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[ListType.NON_MEMBER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public List<C4935bpK> getVideoListByType(ListType listType) {
        switch (AnonymousClass1.d[listType.ordinal()]) {
            case 1:
                return this.billboardList;
            case 2:
                return this.cwList;
            case 3:
                return this.iqList;
            case 4:
                return this.standardFirstList;
            case 5:
                return this.standardSecondList;
            case 6:
                return this.nonMemberList;
            default:
                return null;
        }
    }

    private static C4935bpK buildFromFullVideoDetailsInternal(InterfaceC8366diy interfaceC8366diy) {
        C4935bpK c4935bpK = new C4935bpK();
        c4935bpK.a = interfaceC8366diy.getId();
        c4935bpK.t = interfaceC8366diy.getType();
        c4935bpK.s = interfaceC8366diy.getTitle();
        c4935bpK.c = interfaceC8366diy.bM_();
        c4935bpK.p = interfaceC8366diy.Z();
        c4935bpK.d = interfaceC8366diy.getBoxshotUrl();
        c4935bpK.q = interfaceC8366diy.e(ContextualText.TextContext.e).text();
        return c4935bpK;
    }

    private static C4935bpK buildFromFullVideoDetails(InterfaceC8366diy interfaceC8366diy, ListType listType) {
        return buildFromFullVideoDetailsInternal(interfaceC8366diy).b(listType.d());
    }

    public void copyListIntoDiskData(List<InterfaceC5222bug<InterfaceC5223buh>> list, ListType listType) {
        List<C4935bpK> videoListByType = getVideoListByType(listType);
        if (videoListByType == null || list == null) {
            return;
        }
        for (InterfaceC5222bug<InterfaceC5223buh> interfaceC5222bug : list) {
            C4935bpK buildFromFullVideoDetails = buildFromFullVideoDetails((InterfaceC8366diy) interfaceC5222bug.getVideo(), listType);
            if (buildFromFullVideoDetails != null) {
                videoListByType.add(buildFromFullVideoDetails);
            }
        }
    }

    public void addToUrlMap(String str, String str2) {
        synchronized (this) {
            this.urlMap.put(str, str2);
        }
    }

    public void addNonMemberTrackingInfo() {
        synchronized (this) {
            Map<String, String> map = this.lomoMap;
            ListType listType = ListType.NON_MEMBER;
            map.put(listType.d(), listType.d());
            this.lomoTrackMap.put(listType.d(), getPartnerTrackingString(listType.d()));
        }
    }

    public void addLoLoMaps(PDiskData pDiskData) {
        synchronized (this) {
            this.lomoMap.putAll(pDiskData.lomoMap);
            this.lomoTrackMap.putAll(pDiskData.lomoTrackMap);
        }
    }

    /* loaded from: classes4.dex */
    public enum ImageType {
        HORIZONTAL_ART("horizontalArt"),
        TRICKPLAY("trickplay"),
        TITLE_CARD("titleCard"),
        UNKNOWN("");
        
        private String i;

        ImageType(String str) {
            this.i = str;
        }
    }

    /* loaded from: classes4.dex */
    public enum ListType {
        BILLBOARD("Spotlight"),
        CW("ContinueWatching"),
        IQ("MyList"),
        STANDARD_FIRST("arFirst"),
        STANDARD_SECOND("arSecond"),
        NON_MEMBER("nonMember"),
        LOMO_INFO("lomoInfo"),
        UNKNOWN("");
        
        private String g;

        public String d() {
            return this.g;
        }

        ListType(String str) {
            this.g = str;
        }

        public static ListType a(String str) {
            ListType[] values;
            for (ListType listType : values()) {
                if (listType.g.equalsIgnoreCase(str)) {
                    return listType;
                }
            }
            return UNKNOWN;
        }
    }

    public static boolean isDataAvailable(PDiskData pDiskData, boolean z) {
        if (pDiskData == null) {
            return false;
        }
        for (ListType listType : z ? MEMBER_LIST_TYPES : NON_MEMBER_LIST_TYPES) {
            if (isListNotEmpty(pDiskData.getVideoListByType(listType))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isListEmpty(List<C4935bpK> list) {
        return list == null || list.size() <= 0;
    }

    private static boolean isListNotEmpty(List<C4935bpK> list) {
        return !isListEmpty(list);
    }

    public void print() {
        synchronized (this) {
        }
    }

    public static String printList(List<C4935bpK> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder(list.size());
        for (C4935bpK c4935bpK : list) {
            if (c4935bpK == null || c4935bpK.d()) {
                sb.append(", NULL");
            } else {
                sb.append(", " + c4935bpK.a);
            }
        }
        return sb.toString();
    }

    public void clearMemberLists() {
        synchronized (this) {
            for (ListType listType : MEMBER_LIST_TYPES) {
                this.lomoMap.remove(listType.g);
                this.lomoTrackMap.remove(listType.g);
                getVideoListByType(listType).clear();
            }
        }
    }

    public void deepCopyUrlMap(Map<String, String> map) {
        synchronized (this) {
            this.urlMap.clear();
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    this.urlMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public void deepCopyList(List<C4935bpK> list, List<C4935bpK> list2) {
        synchronized (this) {
            if (list == null) {
                return;
            }
            list.clear();
            if (list2 != null && !list2.isEmpty()) {
                for (C4935bpK c4935bpK : list2) {
                    if (c4935bpK != null && c4935bpK.a != null) {
                        list.add(c4935bpK.b());
                    }
                }
            }
        }
    }

    public void sanitize() {
        synchronized (this) {
            C1044Mm.e(TAG, "sanitize previous version " + this.version + "new version 3");
            this.version = 3;
            this.billboardList = sanitizeList(this.billboardList);
            this.cwList = sanitizeList(this.cwList);
            this.iqList = sanitizeList(this.iqList);
            this.standardFirstList = sanitizeList(this.standardFirstList);
            this.standardSecondList = sanitizeList(this.standardSecondList);
            this.nonMemberList = sanitizeList(this.nonMemberList);
        }
    }

    private List<C4935bpK> sanitizeList(List<C4935bpK> list) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (C4935bpK c4935bpK : list) {
            if (c4935bpK != null && !c4935bpK.d()) {
                arrayList.add(c4935bpK);
            }
        }
        return arrayList;
    }

    public void addToBillboardList(C4935bpK c4935bpK) {
        synchronized (this) {
            this.billboardList.add(c4935bpK);
        }
    }

    public void addToCWList(C4935bpK c4935bpK) {
        synchronized (this) {
            this.cwList.add(c4935bpK);
        }
    }

    public void clearOldImages() {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            for (String str : this.urlMap.keySet()) {
                if (!isUrlPresentInAnyList(str, this)) {
                    arrayList.add(str);
                }
            }
            C1044Mm.e(TAG, "clearImagesNotPresentInNewList, " + arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                clearOldImage(this.urlMap.get(str2));
                this.urlMap.remove(str2);
            }
        }
    }

    private boolean isUrlPresentInAnyList(String str, PDiskData pDiskData) {
        return isUrlPresentInList(str, pDiskData.billboardList) || isUrlPresentInList(str, pDiskData.cwList) || isUrlPresentInList(str, pDiskData.iqList) || isUrlPresentInList(str, pDiskData.standardFirstList) || isUrlPresentInList(str, pDiskData.standardSecondList) || isUrlPresentInList(str, pDiskData.nonMemberList);
    }

    private boolean isUrlPresentInList(String str, List<C4935bpK> list) {
        if (list == null || str == null || list.size() == 0) {
            return false;
        }
        for (C4935bpK c4935bpK : list) {
            if (c4935bpK != null && c4935bpK.d(str)) {
                return true;
            }
        }
        return false;
    }

    private void clearOldImage(final String str) {
        if (C8168dfL.g(str)) {
            return;
        }
        int lastIndexOf = str.lastIndexOf("/");
        final String substring = (lastIndexOf <= 0 || lastIndexOf >= str.length() + (-1)) ? str : str.substring(lastIndexOf + 1);
        new C1071Np().d(new C1079Nx.b() { // from class: o.bpL
            @Override // o.C1079Nx.b
            public final void run() {
                PDiskData.lambda$clearOldImage$0(substring, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$clearOldImage$0(String str, String str2) {
        InterfaceC4942bpR interfaceC4942bpR = (InterfaceC4942bpR) AbstractApplicationC1040Mh.getInstance().i().o();
        if (interfaceC4942bpR != null) {
            if (!interfaceC4942bpR.a(str)) {
                C1044Mm.j(TAG, String.format("localFilename: %s, filename: %s delete failed", str2, str));
            } else {
                C1044Mm.e(TAG, String.format("deleted local file: %s", str2));
            }
        }
    }

    private int getMaxVideosForUrlFetch(ListType listType, List<C4935bpK> list, boolean z) {
        if (!z) {
            return list.size();
        }
        if (ListType.STANDARD_FIRST.equals(listType) || ListType.STANDARD_SECOND.equals(listType)) {
            return Math.min(9, list.size());
        }
        if (ListType.NON_MEMBER.equals(listType)) {
            return Math.min(12, list.size());
        }
        return list.size();
    }

    public List<C4934bpJ> fetchUrlsOfList(Map<String, String> map, ListType listType, boolean z) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            List<C4935bpK> videoListByType = getVideoListByType(listType);
            if (videoListByType == null) {
                return arrayList;
            }
            int maxVideosForUrlFetch = getMaxVideosForUrlFetch(listType, videoListByType, z);
            int i = 0;
            for (C4935bpK c4935bpK : videoListByType) {
                if (c4935bpK != null && !c4935bpK.d()) {
                    if (i >= maxVideosForUrlFetch) {
                        break;
                    }
                    i++;
                    if (ListType.CW.equals(listType)) {
                        ImageType imageType = ImageType.TRICKPLAY;
                        String c = C4935bpK.c(c4935bpK, imageType);
                        if (C8168dfL.h(c) && !map.containsKey(c)) {
                            arrayList.add(new C4934bpJ(c4935bpK.a, c));
                        } else {
                            C1044Mm.e(TAG, String.format("%s(%s), url:%s exists in urlMap - skip", c4935bpK.a, imageType, c));
                        }
                    }
                    ImageType imageType2 = ImageType.HORIZONTAL_ART;
                    String c2 = C4935bpK.c(c4935bpK, imageType2);
                    if (C8168dfL.h(c2) && !map.containsKey(c2)) {
                        arrayList.add(new C4934bpJ(c4935bpK.a, c2));
                    } else {
                        C1044Mm.e(TAG, String.format("%s(%s), url:%s exists in urlMap - skip", c4935bpK.a, imageType2, c2));
                    }
                    ImageType imageType3 = ImageType.TITLE_CARD;
                    String c3 = C4935bpK.c(c4935bpK, imageType3);
                    if (!map.containsKey(c3) && C8168dfL.h(c3)) {
                        arrayList.add(new C4934bpJ(c4935bpK.a, c3));
                    } else {
                        C1044Mm.e(TAG, String.format("%s(%s), url:%s exists in urlMap - skip", c4935bpK.a, imageType3, c3));
                    }
                }
            }
            return arrayList;
        }
    }

    public int getUrlFetchCount(boolean z) {
        int listUrlFetchCount;
        int listUrlFetchCount2;
        int listUrlFetchCount3;
        int listUrlFetchCount4;
        int listUrlFetchCount5;
        int listUrlFetchCount6;
        synchronized (this) {
            listUrlFetchCount = getListUrlFetchCount(ListType.BILLBOARD, this.billboardList, this.urlMap, z);
            listUrlFetchCount2 = getListUrlFetchCount(ListType.CW, this.cwList, this.urlMap, z);
            listUrlFetchCount3 = getListUrlFetchCount(ListType.IQ, this.iqList, this.urlMap, z);
            listUrlFetchCount4 = getListUrlFetchCount(ListType.STANDARD_FIRST, this.standardFirstList, this.urlMap, z);
            listUrlFetchCount5 = getListUrlFetchCount(ListType.STANDARD_SECOND, this.standardSecondList, this.urlMap, z);
            listUrlFetchCount6 = getListUrlFetchCount(ListType.NON_MEMBER, this.nonMemberList, this.urlMap, z);
        }
        return listUrlFetchCount + listUrlFetchCount2 + listUrlFetchCount3 + listUrlFetchCount4 + listUrlFetchCount5 + listUrlFetchCount6;
    }

    private int getListUrlFetchCount(ListType listType, List<C4935bpK> list, Map<String, String> map, boolean z) {
        String c;
        int i = 0;
        if (list == null) {
            return 0;
        }
        int maxVideosForUrlFetch = getMaxVideosForUrlFetch(listType, list, z);
        int i2 = 0;
        for (C4935bpK c4935bpK : list) {
            if (c4935bpK != null && !c4935bpK.d()) {
                String c2 = C4935bpK.c(c4935bpK, ImageType.HORIZONTAL_ART);
                if (c2 != null && !map.containsKey(c2)) {
                    i++;
                }
                String c3 = C4935bpK.c(c4935bpK, ImageType.TITLE_CARD);
                if (c3 != null && !map.containsKey(c3)) {
                    i++;
                }
                if (ListType.CW.equals(listType) && (c = C4935bpK.c(c4935bpK, ImageType.TRICKPLAY)) != null && !map.containsKey(c)) {
                    i++;
                }
                i2++;
                if (i2 >= maxVideosForUrlFetch) {
                    break;
                }
            }
        }
        return i;
    }

    private String getPartnerTrackingString(String str) {
        StringBuilder sb = new StringBuilder();
        if (C8168dfL.h(str)) {
            sb.append("listType=");
            sb.append(str);
            sb.append("&");
        }
        sb.append("trkid=");
        sb.append(13747225);
        return sb.toString();
    }
}
