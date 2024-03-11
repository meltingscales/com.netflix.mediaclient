package com.netflix.model.leafs.social;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.social.multititle.NotificationLandingPage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UserNotificationSummary extends C$AutoValue_UserNotificationSummary {
    public static final Parcelable.Creator<AutoValue_UserNotificationSummary> CREATOR = new Parcelable.Creator<AutoValue_UserNotificationSummary>() { // from class: com.netflix.model.leafs.social.AutoValue_UserNotificationSummary.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UserNotificationSummary createFromParcel(Parcel parcel) {
            return new AutoValue_UserNotificationSummary(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? (VideoType) Enum.valueOf(VideoType.class, parcel.readString()) : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 1, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (NotificationLandingPage) parcel.readParcelable(UserNotificationSummary.class.getClassLoader()), parcel.readInt() == 1, parcel.readLong(), parcel.readInt() == 1, (UserNotificationLandingTrackingInfo) parcel.readParcelable(UserNotificationSummary.class.getClassLoader()), (FriendProfile) parcel.readParcelable(UserNotificationSummary.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UserNotificationSummary[] newArray(int i) {
            return new AutoValue_UserNotificationSummary[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_UserNotificationSummary(final String str, final String str2, final String str3, final String str4, final VideoType videoType, final String str5, final boolean z, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final String str13, final String str14, final NotificationLandingPage notificationLandingPage, final boolean z2, final long j, final boolean z3, final UserNotificationLandingTrackingInfo userNotificationLandingTrackingInfo, final FriendProfile friendProfile, final String str15) {
        new C$$AutoValue_UserNotificationSummary(str, str2, str3, str4, videoType, str5, z, str6, str7, str8, str9, str10, str11, str12, str13, str14, notificationLandingPage, z2, j, z3, userNotificationLandingTrackingInfo, friendProfile, str15) { // from class: com.netflix.model.leafs.social.$AutoValue_UserNotificationSummary

            /* renamed from: com.netflix.model.leafs.social.$AutoValue_UserNotificationSummary$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<UserNotificationSummary> {
                private final TypeAdapter<String> bodyAdapter;
                private final TypeAdapter<String> eventGuidAdapter;
                private final TypeAdapter<FriendProfile> friendProfileAdapter;
                private final TypeAdapter<String> headerAdapter;
                private final TypeAdapter<String> imageAltTextAdapter;
                private final TypeAdapter<String> imageTargetAdapter;
                private final TypeAdapter<String> imageUrlAdapter;
                private final TypeAdapter<Boolean> inQueueAdapter;
                private final TypeAdapter<NotificationLandingPage> landingPageAdapter;
                private final TypeAdapter<String> messageGuidAdapter;
                private final TypeAdapter<String> messageNameAdapter;
                private final TypeAdapter<String> messageStringAdapter;
                private final TypeAdapter<Boolean> readAdapter;
                private final TypeAdapter<Boolean> showTimestampAdapter;
                private final TypeAdapter<String> textTargetAdapter;
                private final TypeAdapter<Long> timestampAdapter;
                private final TypeAdapter<UserNotificationLandingTrackingInfo> trackingInfoAdapter;
                private final TypeAdapter<String> ttsAdapter;
                private final TypeAdapter<String> tvCardUrlAdapter;
                private final TypeAdapter<String> urlTargetAdapter;
                private final TypeAdapter<String> videoIdAdapter;
                private final TypeAdapter<String> videoTitleAdapter;
                private String defaultMessageName = null;
                private String defaultMessageGuid = null;
                private String defaultEventGuid = null;
                private String defaultVideoId = null;
                private VideoType defaultVideoType = null;
                private String defaultVideoTitle = null;
                private boolean defaultInQueue = false;
                private String defaultImageUrl = null;
                private String defaultImageAltText = null;
                private String defaultImageTarget = null;
                private String defaultTvCardUrl = null;
                private String defaultHeader = null;
                private String defaultBody = null;
                private String defaultTts = null;
                private String defaultTextTarget = null;
                private String defaultUrlTarget = null;
                private NotificationLandingPage defaultLandingPage = null;
                private boolean defaultRead = false;
                private long defaultTimestamp = 0;
                private boolean defaultShowTimestamp = false;
                private UserNotificationLandingTrackingInfo defaultTrackingInfo = null;
                private FriendProfile defaultFriendProfile = null;
                private String defaultMessageString = null;
                private final TypeAdapter<VideoType> videoTypeAdapter = new VideoTypeAdapter();

                public GsonTypeAdapter setDefaultBody(String str) {
                    this.defaultBody = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultEventGuid(String str) {
                    this.defaultEventGuid = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultFriendProfile(FriendProfile friendProfile) {
                    this.defaultFriendProfile = friendProfile;
                    return this;
                }

                public GsonTypeAdapter setDefaultHeader(String str) {
                    this.defaultHeader = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultImageAltText(String str) {
                    this.defaultImageAltText = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultImageTarget(String str) {
                    this.defaultImageTarget = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultImageUrl(String str) {
                    this.defaultImageUrl = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultInQueue(boolean z) {
                    this.defaultInQueue = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultLandingPage(NotificationLandingPage notificationLandingPage) {
                    this.defaultLandingPage = notificationLandingPage;
                    return this;
                }

                public GsonTypeAdapter setDefaultMessageGuid(String str) {
                    this.defaultMessageGuid = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultMessageName(String str) {
                    this.defaultMessageName = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultMessageString(String str) {
                    this.defaultMessageString = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultRead(boolean z) {
                    this.defaultRead = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultShowTimestamp(boolean z) {
                    this.defaultShowTimestamp = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultTextTarget(String str) {
                    this.defaultTextTarget = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultTimestamp(long j) {
                    this.defaultTimestamp = j;
                    return this;
                }

                public GsonTypeAdapter setDefaultTrackingInfo(UserNotificationLandingTrackingInfo userNotificationLandingTrackingInfo) {
                    this.defaultTrackingInfo = userNotificationLandingTrackingInfo;
                    return this;
                }

                public GsonTypeAdapter setDefaultTts(String str) {
                    this.defaultTts = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultTvCardUrl(String str) {
                    this.defaultTvCardUrl = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultUrlTarget(String str) {
                    this.defaultUrlTarget = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultVideoId(String str) {
                    this.defaultVideoId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultVideoTitle(String str) {
                    this.defaultVideoTitle = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultVideoType(VideoType videoType) {
                    this.defaultVideoType = videoType;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.messageNameAdapter = gson.getAdapter(String.class);
                    this.messageGuidAdapter = gson.getAdapter(String.class);
                    this.eventGuidAdapter = gson.getAdapter(String.class);
                    this.videoIdAdapter = gson.getAdapter(String.class);
                    this.videoTitleAdapter = gson.getAdapter(String.class);
                    this.inQueueAdapter = gson.getAdapter(Boolean.class);
                    this.imageUrlAdapter = gson.getAdapter(String.class);
                    this.imageAltTextAdapter = gson.getAdapter(String.class);
                    this.imageTargetAdapter = gson.getAdapter(String.class);
                    this.tvCardUrlAdapter = gson.getAdapter(String.class);
                    this.headerAdapter = gson.getAdapter(String.class);
                    this.bodyAdapter = gson.getAdapter(String.class);
                    this.ttsAdapter = gson.getAdapter(String.class);
                    this.textTargetAdapter = gson.getAdapter(String.class);
                    this.urlTargetAdapter = gson.getAdapter(String.class);
                    this.landingPageAdapter = gson.getAdapter(NotificationLandingPage.class);
                    this.readAdapter = gson.getAdapter(Boolean.class);
                    this.timestampAdapter = gson.getAdapter(Long.class);
                    this.showTimestampAdapter = gson.getAdapter(Boolean.class);
                    this.trackingInfoAdapter = gson.getAdapter(UserNotificationLandingTrackingInfo.class);
                    this.friendProfileAdapter = gson.getAdapter(FriendProfile.class);
                    this.messageStringAdapter = gson.getAdapter(String.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, UserNotificationSummary userNotificationSummary) {
                    if (userNotificationSummary == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("messageName");
                    this.messageNameAdapter.write(jsonWriter, userNotificationSummary.messageName());
                    jsonWriter.name(Payload.PARAM_MESSAGE_GUID);
                    this.messageGuidAdapter.write(jsonWriter, userNotificationSummary.messageGuid());
                    jsonWriter.name("eventGuid");
                    this.eventGuidAdapter.write(jsonWriter, userNotificationSummary.eventGuid());
                    jsonWriter.name(SignupConstants.Field.VIDEO_ID);
                    this.videoIdAdapter.write(jsonWriter, userNotificationSummary.videoId());
                    jsonWriter.name("videoType");
                    this.videoTypeAdapter.write(jsonWriter, userNotificationSummary.videoType());
                    jsonWriter.name("videoTitle");
                    this.videoTitleAdapter.write(jsonWriter, userNotificationSummary.videoTitle());
                    jsonWriter.name("inQueue");
                    this.inQueueAdapter.write(jsonWriter, Boolean.valueOf(userNotificationSummary.inQueue()));
                    jsonWriter.name("imageUrl");
                    this.imageUrlAdapter.write(jsonWriter, userNotificationSummary.imageUrl());
                    jsonWriter.name("imageAltText");
                    this.imageAltTextAdapter.write(jsonWriter, userNotificationSummary.imageAltText());
                    jsonWriter.name("imageTarget");
                    this.imageTargetAdapter.write(jsonWriter, userNotificationSummary.imageTarget());
                    jsonWriter.name("tvCardUrl");
                    this.tvCardUrlAdapter.write(jsonWriter, userNotificationSummary.tvCardUrl());
                    jsonWriter.name("header");
                    this.headerAdapter.write(jsonWriter, userNotificationSummary.header());
                    jsonWriter.name("body");
                    this.bodyAdapter.write(jsonWriter, userNotificationSummary.body());
                    jsonWriter.name("tts");
                    this.ttsAdapter.write(jsonWriter, userNotificationSummary.tts());
                    jsonWriter.name("textTarget");
                    this.textTargetAdapter.write(jsonWriter, userNotificationSummary.textTarget());
                    jsonWriter.name("urlTarget");
                    this.urlTargetAdapter.write(jsonWriter, userNotificationSummary.urlTarget());
                    jsonWriter.name("landingPage");
                    this.landingPageAdapter.write(jsonWriter, userNotificationSummary.landingPage());
                    jsonWriter.name("isRead");
                    this.readAdapter.write(jsonWriter, Boolean.valueOf(userNotificationSummary.read()));
                    jsonWriter.name("timestamp");
                    this.timestampAdapter.write(jsonWriter, Long.valueOf(userNotificationSummary.timestamp()));
                    jsonWriter.name("showTimestamp");
                    this.showTimestampAdapter.write(jsonWriter, Boolean.valueOf(userNotificationSummary.showTimestamp()));
                    jsonWriter.name("trackingInfo");
                    this.trackingInfoAdapter.write(jsonWriter, userNotificationSummary.trackingInfo());
                    jsonWriter.name("fromUser");
                    this.friendProfileAdapter.write(jsonWriter, userNotificationSummary.friendProfile());
                    jsonWriter.name("msgString");
                    this.messageStringAdapter.write(jsonWriter, userNotificationSummary.messageString());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public UserNotificationSummary read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultMessageName;
                    String str2 = this.defaultMessageGuid;
                    String str3 = this.defaultEventGuid;
                    String str4 = this.defaultVideoId;
                    VideoType videoType = this.defaultVideoType;
                    String str5 = this.defaultVideoTitle;
                    boolean z = this.defaultInQueue;
                    String str6 = this.defaultImageUrl;
                    String str7 = this.defaultImageAltText;
                    String str8 = this.defaultImageTarget;
                    String str9 = this.defaultTvCardUrl;
                    String str10 = this.defaultHeader;
                    String str11 = this.defaultBody;
                    String str12 = this.defaultTts;
                    String str13 = this.defaultTextTarget;
                    String str14 = this.defaultUrlTarget;
                    NotificationLandingPage notificationLandingPage = this.defaultLandingPage;
                    boolean z2 = this.defaultRead;
                    long j = this.defaultTimestamp;
                    boolean z3 = this.defaultShowTimestamp;
                    UserNotificationLandingTrackingInfo userNotificationLandingTrackingInfo = this.defaultTrackingInfo;
                    FriendProfile friendProfile = this.defaultFriendProfile;
                    String str15 = this.defaultMessageString;
                    UserNotificationLandingTrackingInfo userNotificationLandingTrackingInfo2 = userNotificationLandingTrackingInfo;
                    String str16 = str3;
                    String str17 = str4;
                    VideoType videoType2 = videoType;
                    String str18 = str5;
                    boolean z4 = z;
                    String str19 = str6;
                    String str20 = str7;
                    String str21 = str8;
                    String str22 = str9;
                    String str23 = str10;
                    String str24 = str11;
                    String str25 = str12;
                    String str26 = str;
                    String str27 = str13;
                    String str28 = str14;
                    NotificationLandingPage notificationLandingPage2 = notificationLandingPage;
                    String str29 = str2;
                    boolean z5 = z2;
                    long j2 = j;
                    boolean z6 = z3;
                    FriendProfile friendProfile2 = friendProfile;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -2108533044:
                                    if (nextName.equals("imageTarget")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1884240891:
                                    if (nextName.equals("trackingInfo")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1794520227:
                                    if (nextName.equals("tvCardUrl")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1628327267:
                                    if (nextName.equals("videoTitle")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1473868046:
                                    if (nextName.equals("msgString")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1244622187:
                                    if (nextName.equals("fromUser")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1221270899:
                                    if (nextName.equals("header")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1180158496:
                                    if (nextName.equals("isRead")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -873484496:
                                    if (nextName.equals(Payload.PARAM_MESSAGE_GUID)) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -873295054:
                                    if (nextName.equals("messageName")) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -859610604:
                                    if (nextName.equals("imageUrl")) {
                                        c = '\n';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -586188135:
                                    if (nextName.equals("showTimestamp")) {
                                        c = 11;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -342813728:
                                    if (nextName.equals("urlTarget")) {
                                        c = '\f';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -306513765:
                                    if (nextName.equals("imageAltText")) {
                                        c = '\r';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 115187:
                                    if (nextName.equals("tts")) {
                                        c = 14;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3029410:
                                    if (nextName.equals("body")) {
                                        c = 15;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 31039555:
                                    if (nextName.equals("eventGuid")) {
                                        c = 16;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 55126294:
                                    if (nextName.equals("timestamp")) {
                                        c = 17;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 452782838:
                                    if (nextName.equals(SignupConstants.Field.VIDEO_ID)) {
                                        c = 18;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 497102150:
                                    if (nextName.equals("landingPage")) {
                                        c = 19;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1332961877:
                                    if (nextName.equals("videoType")) {
                                        c = 20;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1862946078:
                                    if (nextName.equals("textTarget")) {
                                        c = 21;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1926204140:
                                    if (nextName.equals("inQueue")) {
                                        c = 22;
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
                                    str21 = this.imageTargetAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    userNotificationLandingTrackingInfo2 = this.trackingInfoAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    str22 = this.tvCardUrlAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    str18 = this.videoTitleAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    str15 = this.messageStringAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    friendProfile2 = this.friendProfileAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    str23 = this.headerAdapter.read(jsonReader);
                                    continue;
                                case 7:
                                    z5 = this.readAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case '\b':
                                    str29 = this.messageGuidAdapter.read(jsonReader);
                                    continue;
                                case '\t':
                                    str26 = this.messageNameAdapter.read(jsonReader);
                                    continue;
                                case '\n':
                                    str19 = this.imageUrlAdapter.read(jsonReader);
                                    continue;
                                case 11:
                                    z6 = this.showTimestampAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case '\f':
                                    str28 = this.urlTargetAdapter.read(jsonReader);
                                    continue;
                                case '\r':
                                    str20 = this.imageAltTextAdapter.read(jsonReader);
                                    continue;
                                case 14:
                                    str25 = this.ttsAdapter.read(jsonReader);
                                    continue;
                                case 15:
                                    str24 = this.bodyAdapter.read(jsonReader);
                                    continue;
                                case 16:
                                    str16 = this.eventGuidAdapter.read(jsonReader);
                                    continue;
                                case 17:
                                    j2 = this.timestampAdapter.read(jsonReader).longValue();
                                    continue;
                                case 18:
                                    str17 = this.videoIdAdapter.read(jsonReader);
                                    continue;
                                case 19:
                                    notificationLandingPage2 = this.landingPageAdapter.read(jsonReader);
                                    continue;
                                case 20:
                                    videoType2 = this.videoTypeAdapter.read(jsonReader);
                                    continue;
                                case 21:
                                    str27 = this.textTargetAdapter.read(jsonReader);
                                    continue;
                                case 22:
                                    z4 = this.inQueueAdapter.read(jsonReader).booleanValue();
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_UserNotificationSummary(str26, str29, str16, str17, videoType2, str18, z4, str19, str20, str21, str22, str23, str24, str25, str27, str28, notificationLandingPage2, z5, j2, z6, userNotificationLandingTrackingInfo2, friendProfile2, str15);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (messageName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(messageName());
        }
        if (messageGuid() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(messageGuid());
        }
        if (eventGuid() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(eventGuid());
        }
        if (videoId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(videoId());
        }
        if (videoType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(videoType().name());
        }
        if (videoTitle() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(videoTitle());
        }
        parcel.writeInt(inQueue() ? 1 : 0);
        if (imageUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(imageUrl());
        }
        if (imageAltText() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(imageAltText());
        }
        if (imageTarget() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(imageTarget());
        }
        if (tvCardUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(tvCardUrl());
        }
        if (header() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(header());
        }
        if (body() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(body());
        }
        if (tts() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(tts());
        }
        if (textTarget() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(textTarget());
        }
        if (urlTarget() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(urlTarget());
        }
        parcel.writeParcelable(landingPage(), i);
        parcel.writeInt(read() ? 1 : 0);
        parcel.writeLong(timestamp());
        parcel.writeInt(showTimestamp() ? 1 : 0);
        parcel.writeParcelable(trackingInfo(), i);
        parcel.writeParcelable(friendProfile(), i);
        if (messageString() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(messageString());
    }
}
