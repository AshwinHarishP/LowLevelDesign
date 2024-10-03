public class PostWidget implements WidgetInterface{
    private String sharedStyle;

    public PostWidget(String sharedStyle) {
        this.sharedStyle = sharedStyle;
    }

    @Override
    public void render(String extrinsicate){
        System.out.println("Rendering widget with shared style: " + sharedStyle);
        System.out.println("Post: " + extrinsicate);
    }


}
