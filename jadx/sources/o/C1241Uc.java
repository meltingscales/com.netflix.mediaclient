package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.netflix.model.leafs.SeasonRenewal;
import com.netflix.model.leafs.SeasonRenewalAsset;
import com.netflix.model.leafs.TimeCodesData;
import com.netflix.model.leafs.blades.CreditMarks;
import com.netflix.model.leafs.blades.SkipContentData;
import com.netflix.model.leafs.originals.BillboardAvailabilityDates;
import com.netflix.model.leafs.originals.BillboardCTA;
import com.netflix.model.leafs.originals.BillboardPhase;
import com.netflix.model.leafs.originals.BillboardVideo;
import com.netflix.model.leafs.originals.ContentWarning;
import com.netflix.model.leafs.originals.VideoAssets;
import com.netflix.model.leafs.originals.interactive.Action;
import com.netflix.model.leafs.originals.interactive.Audio;
import com.netflix.model.leafs.originals.interactive.Button;
import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.ChoiceMapOverride;
import com.netflix.model.leafs.originals.interactive.Color;
import com.netflix.model.leafs.originals.interactive.CommonMetaData;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.ImageAssetId;
import com.netflix.model.leafs.originals.interactive.ImpressionData;
import com.netflix.model.leafs.originals.interactive.InteractiveDebugMenuItem;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig;
import com.netflix.model.leafs.originals.interactive.InteractiveStrings;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import com.netflix.model.leafs.originals.interactive.Label;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Notification;
import com.netflix.model.leafs.originals.interactive.PlayerControls;
import com.netflix.model.leafs.originals.interactive.Prefetch;
import com.netflix.model.leafs.originals.interactive.ScreenPosition;
import com.netflix.model.leafs.originals.interactive.SegmentStateItem;
import com.netflix.model.leafs.originals.interactive.Size;
import com.netflix.model.leafs.originals.interactive.SourceRect;
import com.netflix.model.leafs.originals.interactive.Spinner;
import com.netflix.model.leafs.originals.interactive.SpriteImage;
import com.netflix.model.leafs.originals.interactive.StateData;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.TriviaContainerElement;
import com.netflix.model.leafs.originals.interactive.UiDefinition;
import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.animations.ChoicePointAnimations;
import com.netflix.model.leafs.originals.interactive.animations.Ease;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import com.netflix.model.leafs.originals.interactive.animations.TransitionDefinitions;
import com.netflix.model.leafs.originals.interactive.condition.Animations;
import com.netflix.model.leafs.originals.interactive.condition.Condition;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement;
import com.netflix.model.leafs.originals.interactive.template.Category;
import com.netflix.model.leafs.originals.interactive.template.ElementV2;
import com.netflix.model.leafs.originals.interactive.template.HeaderLayoutElement;
import com.netflix.model.leafs.originals.interactive.template.ImageElement;
import com.netflix.model.leafs.originals.interactive.template.LabelElement;
import com.netflix.model.leafs.originals.interactive.template.LayoutTimer;
import com.netflix.model.leafs.originals.interactive.template.PlayerScoreContainerElement;
import com.netflix.model.leafs.originals.interactive.template.ScoreContainer;
import com.netflix.model.leafs.originals.interactive.template.SimpleElement;
import com.netflix.model.leafs.originals.interactive.template.ToolTipElement;
import com.netflix.model.leafs.originals.interactive.template.TriviaStreakIndicatorElement;
import com.netflix.model.leafs.originals.interactive.template.TriviaThemeContainer;
import com.netflix.model.leafs.originals.interactive.template.TriviaVerseScoreContainer;
import com.netflix.model.leafs.originals.interactive.template.UnlockContainer;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import com.netflix.model.leafs.social.FriendProfile;
import com.netflix.model.leafs.social.UserNotificationActionTrackingInfo;
import com.netflix.model.leafs.social.UserNotificationCtaButtonTrackingInfo;
import com.netflix.model.leafs.social.UserNotificationCtaTrackingInfo;
import com.netflix.model.leafs.social.UserNotificationLandingTrackingInfo;
import com.netflix.model.leafs.social.multititle.NotificationCtaButton;
import com.netflix.model.leafs.social.multititle.NotificationGridModule;
import com.netflix.model.leafs.social.multititle.NotificationGridTitleAction;
import com.netflix.model.leafs.social.multititle.NotificationHeroModule;
import com.netflix.model.leafs.social.multititle.NotificationHeroTitleAction;
import com.netflix.model.leafs.social.multititle.NotificationLandingPage;
import com.netflix.model.leafs.social.multititle.NotificationModuleFilters;
import com.netflix.model.leafs.social.multititle.NotificationModuleList;
import com.netflix.model.leafs.social.multititle.NotificationRatingAction;
import com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule;
import com.netflix.model.leafs.social.multititle.NotificationTemplate;

/* renamed from: o.Uc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1241Uc extends AbstractC1243Ue {
    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (Action.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Action.typeAdapter(gson);
        }
        if (AnimationTemplateId.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AnimationTemplateId.typeAdapter(gson);
        }
        if (Animations.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Animations.typeAdapter(gson);
        }
        if (Animations.Config.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Animations.Config.typeAdapter(gson);
        }
        if (Audio.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Audio.typeAdapter(gson);
        }
        if (BackgroundImageElement.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) BackgroundImageElement.typeAdapter(gson);
        }
        if (BackgroundImageElement.BackgroundImageElementOverride.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) BackgroundImageElement.BackgroundImageElementOverride.typeAdapter(gson);
        }
        if (BillboardAvailabilityDates.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) BillboardAvailabilityDates.typeAdapter(gson);
        }
        if (BillboardCTA.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) BillboardCTA.typeAdapter(gson);
        }
        if (BillboardPhase.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) BillboardPhase.typeAdapter(gson);
        }
        if (BillboardVideo.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) BillboardVideo.typeAdapter(gson);
        }
        if (Button.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Button.typeAdapter(gson);
        }
        if (Button.Label.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Button.Label.typeAdapter(gson);
        }
        if (Button.States.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Button.States.typeAdapter(gson);
        }
        if (Category.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Category.typeAdapter(gson);
        }
        if (Category.CategoryChildren.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Category.CategoryChildren.typeAdapter(gson);
        }
        if (Choice.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Choice.typeAdapter(gson);
        }
        if (Choice.ChoiceAction.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Choice.ChoiceAction.typeAdapter(gson);
        }
        if (Choice.ChoiceOverride.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Choice.ChoiceOverride.typeAdapter(gson);
        }
        if (ChoiceMapOverride.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ChoiceMapOverride.typeAdapter(gson);
        }
        if (ChoicePointAnimations.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ChoicePointAnimations.typeAdapter(gson);
        }
        if (Color.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Color.typeAdapter(gson);
        }
        if (CommonMetaData.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) CommonMetaData.typeAdapter(gson);
        }
        if (CommonMetaData.Layout.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) CommonMetaData.Layout.typeAdapter(gson);
        }
        if (CommonMetaData.Layout.ChoiceLayout.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) CommonMetaData.Layout.ChoiceLayout.typeAdapter(gson);
        }
        if (CommonMetaData.Layout.ChoiceLayout.Background.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) CommonMetaData.Layout.ChoiceLayout.Background.typeAdapter(gson);
        }
        if (CommonMetaData.Layout.ChoiceLayout.InnerChoice.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) CommonMetaData.Layout.ChoiceLayout.InnerChoice.typeAdapter(gson);
        }
        if (CommonMetaData.Layout.InteractiveNotification.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) CommonMetaData.Layout.InteractiveNotification.typeAdapter(gson);
        }
        if (CommonMetaData.Layout.Timer.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) CommonMetaData.Layout.Timer.typeAdapter(gson);
        }
        if (CommonMetaData.Settings.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) CommonMetaData.Settings.typeAdapter(gson);
        }
        if (Condition.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Condition.typeAdapter(gson);
        }
        if (ContentWarning.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ContentWarning.typeAdapter(gson);
        }
        if (CreditMarks.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) CreditMarks.typeAdapter(gson);
        }
        if (Ease.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Ease.typeAdapter(gson);
        }
        if (ElementV2.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ElementV2.typeAdapter(gson);
        }
        if (ElementV2.ElementV2Override.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ElementV2.ElementV2Override.typeAdapter(gson);
        }
        if (FriendProfile.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) FriendProfile.typeAdapter(gson);
        }
        if (HeaderLayoutElement.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) HeaderLayoutElement.typeAdapter(gson);
        }
        if (HeaderLayoutElement.HeaderChildren.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) HeaderLayoutElement.HeaderChildren.typeAdapter(gson);
        }
        if (Image.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Image.typeAdapter(gson);
        }
        if (ImageAssetId.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ImageAssetId.typeAdapter(gson);
        }
        if (ImageElement.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ImageElement.typeAdapter(gson);
        }
        if (ImageElement.ImageElementOverride.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ImageElement.ImageElementOverride.typeAdapter(gson);
        }
        if (ImpressionData.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ImpressionData.typeAdapter(gson);
        }
        if (InteractiveAnimation.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) InteractiveAnimation.typeAdapter(gson);
        }
        if (InteractiveDebugMenuItem.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) InteractiveDebugMenuItem.typeAdapter(gson);
        }
        if (InteractiveMoments.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) InteractiveMoments.typeAdapter(gson);
        }
        if (InteractiveSceneConfig.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) InteractiveSceneConfig.typeAdapter(gson);
        }
        if (InteractiveSceneConfig.ChoiceDisplayRule.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) InteractiveSceneConfig.ChoiceDisplayRule.typeAdapter(gson);
        }
        if (InteractiveStrings.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) InteractiveStrings.typeAdapter(gson);
        }
        if (InteractiveSummary.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) InteractiveSummary.typeAdapter(gson);
        }
        if (InteractiveSummary.Features.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) InteractiveSummary.Features.typeAdapter(gson);
        }
        if (Label.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Label.typeAdapter(gson);
        }
        if (LabelElement.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) LabelElement.typeAdapter(gson);
        }
        if (LabelElement.LabelElementOverride.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) LabelElement.LabelElementOverride.typeAdapter(gson);
        }
        if (LayoutTimer.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) LayoutTimer.typeAdapter(gson);
        }
        if (LayoutTimer.SpriteSheetTimer.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) LayoutTimer.SpriteSheetTimer.typeAdapter(gson);
        }
        if (LayoutTimer.TimerChildren.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) LayoutTimer.TimerChildren.typeAdapter(gson);
        }
        if (LayoutTimer.TimerChildren.TimerBar.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) LayoutTimer.TimerChildren.TimerBar.typeAdapter(gson);
        }
        if (LayoutTimer.TimerChildren.TimerBar.TimerBarChildren.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) LayoutTimer.TimerChildren.TimerBar.TimerBarChildren.typeAdapter(gson);
        }
        if (Moment.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Moment.typeAdapter(gson);
        }
        if (Moment.MomentOverride.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Moment.MomentOverride.typeAdapter(gson);
        }
        if (Moment.TimeoutSegment.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Moment.TimeoutSegment.typeAdapter(gson);
        }
        if (Notification.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Notification.typeAdapter(gson);
        }
        if (Notification.NotificationChildren.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Notification.NotificationChildren.typeAdapter(gson);
        }
        if (Notification.NotificationOverride.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Notification.NotificationOverride.typeAdapter(gson);
        }
        if (NotificationCtaButton.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) NotificationCtaButton.typeAdapter(gson);
        }
        if (NotificationGridModule.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) NotificationGridModule.typeAdapter(gson);
        }
        if (NotificationGridTitleAction.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) NotificationGridTitleAction.typeAdapter(gson);
        }
        if (NotificationHeroModule.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) NotificationHeroModule.typeAdapter(gson);
        }
        if (NotificationHeroTitleAction.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) NotificationHeroTitleAction.typeAdapter(gson);
        }
        if (NotificationLandingPage.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) NotificationLandingPage.typeAdapter(gson);
        }
        if (NotificationModuleFilters.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) NotificationModuleFilters.typeAdapter(gson);
        }
        if (NotificationModuleList.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) NotificationModuleList.typeAdapter(gson);
        }
        if (NotificationRatingAction.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) NotificationRatingAction.typeAdapter(gson);
        }
        if (NotificationRatingInfoModule.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) NotificationRatingInfoModule.typeAdapter(gson);
        }
        if (NotificationTemplate.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) NotificationTemplate.typeAdapter(gson);
        }
        if (PlayerControls.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) PlayerControls.typeAdapter(gson);
        }
        if (PlayerControls.ChoicePointsMetadata.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) PlayerControls.ChoicePointsMetadata.typeAdapter(gson);
        }
        if (PlayerControls.ChoicePointsMetadata.Cell.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) PlayerControls.ChoicePointsMetadata.Cell.typeAdapter(gson);
        }
        if (PlayerControls.ChoicePointsMetadata.Cell.Focus.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) PlayerControls.ChoicePointsMetadata.Cell.Focus.typeAdapter(gson);
        }
        if (PlayerControls.ChoicePointsMetadata.Cell.MainView.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) PlayerControls.ChoicePointsMetadata.Cell.MainView.typeAdapter(gson);
        }
        if (PlayerControls.ChoicePointsMetadata.Choice.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) PlayerControls.ChoicePointsMetadata.Choice.typeAdapter(gson);
        }
        if (PlayerControls.ChoicePointsMetadata.ChoicePoint.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) PlayerControls.ChoicePointsMetadata.ChoicePoint.typeAdapter(gson);
        }
        if (PlayerControls.ChoicePointsMetadata.Container.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) PlayerControls.ChoicePointsMetadata.Container.typeAdapter(gson);
        }
        if (PlayerControls.ChoicePointsMetadata.Container.ContainerData.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) PlayerControls.ChoicePointsMetadata.Container.ContainerData.typeAdapter(gson);
        }
        if (PlayerControls.ChoicePointsMetadata.TimeStamp.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) PlayerControls.ChoicePointsMetadata.TimeStamp.typeAdapter(gson);
        }
        if (PlayerControls.Config.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) PlayerControls.Config.typeAdapter(gson);
        }
        if (PlayerControls.Config.ImagesConfig.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) PlayerControls.Config.ImagesConfig.typeAdapter(gson);
        }
        if (PlayerControls.StoryLines.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) PlayerControls.StoryLines.typeAdapter(gson);
        }
        if (PlayerControls.StoryLines.StoryLine.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) PlayerControls.StoryLines.StoryLine.typeAdapter(gson);
        }
        if (PlayerScoreContainerElement.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) PlayerScoreContainerElement.typeAdapter(gson);
        }
        if (PlayerScoreContainerElement.LabelWithBackgroundContainerChildren.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) PlayerScoreContainerElement.LabelWithBackgroundContainerChildren.typeAdapter(gson);
        }
        if (Prefetch.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Prefetch.typeAdapter(gson);
        }
        if (ScoreContainer.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ScoreContainer.typeAdapter(gson);
        }
        if (ScoreContainer.ScoreContainerChildren.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ScoreContainer.ScoreContainerChildren.typeAdapter(gson);
        }
        if (ScreenPosition.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ScreenPosition.typeAdapter(gson);
        }
        if (SeasonRenewal.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) SeasonRenewal.typeAdapter(gson);
        }
        if (SeasonRenewalAsset.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) SeasonRenewalAsset.typeAdapter(gson);
        }
        if (SegmentStateItem.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) SegmentStateItem.typeAdapter(gson);
        }
        if (SimpleElement.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) SimpleElement.typeAdapter(gson);
        }
        if (Size.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Size.typeAdapter(gson);
        }
        if (SkipContentData.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) SkipContentData.typeAdapter(gson);
        }
        if (SourceRect.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) SourceRect.typeAdapter(gson);
        }
        if (Spinner.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Spinner.typeAdapter(gson);
        }
        if (Spinner.Definition.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Spinner.Definition.typeAdapter(gson);
        }
        if (Spinner.Definition.Sequence.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Spinner.Definition.Sequence.typeAdapter(gson);
        }
        if (SpriteImage.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) SpriteImage.typeAdapter(gson);
        }
        if (StateData.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) StateData.typeAdapter(gson);
        }
        if (StateHistory.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) StateHistory.typeAdapter(gson);
        }
        if (Style.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Style.typeAdapter(gson);
        }
        if (Style.Shadow.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Style.Shadow.typeAdapter(gson);
        }
        if (TimeCodesData.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) TimeCodesData.typeAdapter(gson);
        }
        if (ToolTipElement.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ToolTipElement.typeAdapter(gson);
        }
        if (ToolTipElement.ToolTipChildren.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ToolTipElement.ToolTipChildren.typeAdapter(gson);
        }
        if (TransitionDefinitions.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) TransitionDefinitions.typeAdapter(gson);
        }
        if (TransitionDefinitions.TransitionIds.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) TransitionDefinitions.TransitionIds.typeAdapter(gson);
        }
        if (TriviaContainerElement.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) TriviaContainerElement.typeAdapter(gson);
        }
        if (TriviaStreakIndicatorElement.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) TriviaStreakIndicatorElement.typeAdapter(gson);
        }
        if (TriviaStreakIndicatorElement.StreakContainerElementChildren.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) TriviaStreakIndicatorElement.StreakContainerElementChildren.typeAdapter(gson);
        }
        if (TriviaThemeContainer.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) TriviaThemeContainer.typeAdapter(gson);
        }
        if (TriviaThemeContainer.TriviaThemeContainerChildren.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) TriviaThemeContainer.TriviaThemeContainerChildren.typeAdapter(gson);
        }
        if (TriviaVerseScoreContainer.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) TriviaVerseScoreContainer.typeAdapter(gson);
        }
        if (TriviaVerseScoreContainer.ScoreContainerChildren.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) TriviaVerseScoreContainer.ScoreContainerChildren.typeAdapter(gson);
        }
        if (UiDefinition.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UiDefinition.typeAdapter(gson);
        }
        if (UiDefinition.AudioListAsset.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UiDefinition.AudioListAsset.typeAdapter(gson);
        }
        if (UiDefinition.Config.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UiDefinition.Config.typeAdapter(gson);
        }
        if (UiDefinition.Config.Logging.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UiDefinition.Config.Logging.typeAdapter(gson);
        }
        if (UiDefinition.Config.Logging.Moment.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UiDefinition.Config.Logging.Moment.typeAdapter(gson);
        }
        if (UiDefinition.Layout.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UiDefinition.Layout.typeAdapter(gson);
        }
        if (UiDefinition.Layout.Choice.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UiDefinition.Layout.Choice.typeAdapter(gson);
        }
        if (UiDefinition.Layout.Choice.ChoiceChildren.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UiDefinition.Layout.Choice.ChoiceChildren.typeAdapter(gson);
        }
        if (UiDefinition.Layout.Config.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UiDefinition.Layout.Config.typeAdapter(gson);
        }
        if (UiDefinition.Layout.Config.SubtitleRect.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UiDefinition.Layout.Config.SubtitleRect.typeAdapter(gson);
        }
        if (UiDefinition.Layout.Elements.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UiDefinition.Layout.Elements.typeAdapter(gson);
        }
        if (UnlockContainer.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UnlockContainer.typeAdapter(gson);
        }
        if (UnlockContainer.UnlockContainerChildren.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UnlockContainer.UnlockContainerChildren.typeAdapter(gson);
        }
        if (UserNotificationActionTrackingInfo.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UserNotificationActionTrackingInfo.typeAdapter(gson);
        }
        if (UserNotificationCtaButtonTrackingInfo.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UserNotificationCtaButtonTrackingInfo.typeAdapter(gson);
        }
        if (UserNotificationCtaTrackingInfo.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UserNotificationCtaTrackingInfo.typeAdapter(gson);
        }
        if (UserNotificationLandingTrackingInfo.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UserNotificationLandingTrackingInfo.typeAdapter(gson);
        }
        if (VideoAssets.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) VideoAssets.typeAdapter(gson);
        }
        if (VisualStateDefinition.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) VisualStateDefinition.typeAdapter(gson);
        }
        return null;
    }
}
