package Code.DesignPatterns.Proxy.VidoeProxy;

public class ProxyVideo implements Video{

    private Video video;
    private final String filename;

    public ProxyVideo(String filename){
        this.filename = filename;
    }

    @Override
    public void play(){
        if(video == null) video = new RealVideo(filename);
        video.play();
    }
}
