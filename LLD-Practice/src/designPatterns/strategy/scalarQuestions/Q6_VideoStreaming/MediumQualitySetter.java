package designPatterns.strategy.scalarQuestions.Q6_VideoStreaming;

public class MediumQualitySetter implements QualityAdjustmentStrategy{

    @Override
    public VideoQuality supportsType(){
        return VideoQuality.MEDIUM;
    }
    @Override
    public Video adjustVideoQuality(Video video){
        video.setCodec(VideoCodec.H265);
        video.setBitrate(1000);
        return video;
    }
}
