import java.util.HashMap;
import java.util.Map;

public class WidgetFactory {
    private Map<String, WidgetInterface> widgets = new HashMap<>();

    public WidgetInterface getWidget(String style){
        WidgetInterface widget = widgets.get(style);
        if (widget == null) {
            widget = new PostWidget(style);
            widgets.put(style, widget);
        }
        return widget;
    }
}