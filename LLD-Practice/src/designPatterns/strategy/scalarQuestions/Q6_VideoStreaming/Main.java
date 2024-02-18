package designPatterns.strategy.scalarQuestions.Q6_VideoStreaming;

public class Main {
    public static void main(String[] args) {
        Video video = new Video("http://url", VideoQuality.LOW);
        VideoStreamingManager videoStreamingManager = new VideoStreamingManager(video);
        videoStreamingManager.streamVideo();
    }
}
