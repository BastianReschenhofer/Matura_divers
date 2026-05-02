package Code.DesignPatterns.Proxy.VidoeProxy;

public class RealVideo implements Video{
    private final String filename;

    public RealVideo(String filename){
        this.filename = filename;
        loadVideo();
    }

    public void loadVideo(){
        System.out.println("Loadung Vidoe " + filename);
    }

    @Override
    public void play(){
        System.out.println("Play Vidoe " + filename);
    }
}
