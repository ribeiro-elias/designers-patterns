package me.composite;

import java.util.ArrayList;
import java.util.List;

public class MenuItem extends MenuComponent{
    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public List<String> getUrls() {
        List<String> urls = new ArrayList<>();
        menuComponentList.forEach(e -> urls.add(e.getUrl()));
        return urls;
    }

}
