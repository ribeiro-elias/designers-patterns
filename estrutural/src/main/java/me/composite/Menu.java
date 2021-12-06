package me.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent{
    public Menu(String name, String url) {
        super();
        this.name = name;
        this.url = url;
    }

    @Override
    public List<String> getUrls() {
        List<String> urls = new ArrayList<>();
        urls.add(this.url);
        menuComponentList.stream().peek(menuComponent -> urls.add(menuComponent.getUrl()))
                .forEach(menuComponent -> urls.addAll(urls));
        return urls;
    }

    @Override
    public MenuComponent add(MenuComponent menuComponent) {
        this.menuComponentList.add(menuComponent);
        return menuComponent;
    }

    @Override
    public MenuComponent remove(MenuComponent menuComponent) {
        this.menuComponentList.remove(menuComponent);
        return menuComponent;
    }
}
