import com.sapher.youtubedl.YoutubeDL;
import com.sapher.youtubedl.YoutubeDLException;
import com.sapher.youtubedl.mapper.VideoInfo;

public class YoutubeDownloader {

    public static void main(String[] args) {
        String videoUrl = "https://www.youtube.com/watch?v=YOUR_VIDEO_ID";
        
        try {
            // Fetch video information
            VideoInfo videoInfo = YoutubeDL.getVideoInfo(videoUrl);
            
            // Print video details
            System.out.println("Title: " + videoInfo.getTitle());
            System.out.println("Author: " + videoInfo.getUploader());
            System.out.println("Duration: " + videoInfo.getDuration());

            // Download video
            String videoFile = YoutubeDL.download(videoUrl);
            System.out.println("Downloaded to: " + videoFile);
        } catch (YoutubeDLException e) {
            e.printStackTrace();
        }
    }
}
