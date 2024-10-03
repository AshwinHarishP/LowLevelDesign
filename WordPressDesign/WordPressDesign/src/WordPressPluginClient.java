public class WordPressPluginClient {
    public void displayWidgets(){
        WidgetFactory factory = new WidgetFactory();

        String[][]post = {{"Post 1", "Color: Red"},
                {"Post 2", "Color: Blue"},
                {"Post 3", "Color: Yellow"}};

        for(String[] posts: post){
            WidgetInterface widget = factory.getWidget(posts[0]);
            widget.render(posts[0]);
        }
    }
}
