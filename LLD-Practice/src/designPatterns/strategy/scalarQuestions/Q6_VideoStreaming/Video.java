package designPatterns.strategy.scalarQuestions.Q6_VideoStreaming;

public class Video {
    private String videoUrl;
    private VideoQuality videoQuality;
    private VideoCodec codec;
    private Integer bitrate;

    public Video(String videoUrl, VideoQuality videoQuality) {
        this.videoUrl = videoUrl;
        this.videoQuality = videoQuality;
    }

    public void setVideoUrl(String videoUrl){
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl(){
        return videoUrl;
    }

    public void setVideoQuality(VideoQuality videoQuality){
        this.videoQuality = videoQuality;
    }

    public VideoQuality getVideoQuality(){
        return videoQuality;
    }

    public VideoCodec getCodec() {
        return codec;
    }

    public void setCodec(VideoCodec codec) {
        this.codec = codec;
    }

    public Integer getBitrate() {
        return bitrate;
    }

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }
}