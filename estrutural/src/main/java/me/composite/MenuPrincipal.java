package me.composite;

import java.util.ArrayList;
import java.util.List;

public class MenuPrincipal extends MenuComponent{

    public MenuPrincipal(String name, String url) {
        super();
        this.name = name;
        this.url = url;
    }

    @Override
    public List<String> getUrls() {
        List<String> urls = new ArrayList<>();
        urls.add(this.url);
        for(MenuComponent menuComponent: menuComponentList){
            urls.add(this.url + menuComponent.getUrl());
            for(MenuComponent menuComponent1 : menuComponent.getMenuComponentList()){
                urls.add(this.url + menuComponent.getUrl() + menuComponent1.getUrl());
            }
        }
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

    @Override
    public String getUrl() {
        return this.getUrl();
    }
}
