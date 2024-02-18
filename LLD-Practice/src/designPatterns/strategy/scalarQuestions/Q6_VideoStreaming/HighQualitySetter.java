package designPatterns.strategy.scalarQuestions.Q6_VideoStreaming;

public class HighQualitySetter implements QualityAdjustmentStrategy{
    @Override
    public VideoQuality supportsType() {
        return VideoQuality.HIGH;
    }
    @Override
    public Video adjustVideoQuality(Video video) {
        video.setCodec(VideoCodec.VP9);
        video.setBitrate(2000);
        return video;
    }
}
